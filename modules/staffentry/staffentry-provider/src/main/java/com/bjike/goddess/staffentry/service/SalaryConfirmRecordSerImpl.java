package com.bjike.goddess.staffentry.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.common.utils.date.DateUtil;
import com.bjike.goddess.staffentry.bo.SalaryConfirmRecordBO;
import com.bjike.goddess.staffentry.dto.SalaryConfirmRecordDTO;
import com.bjike.goddess.staffentry.entity.SalaryConfirmRecord;
import com.bjike.goddess.staffentry.to.SalaryConfirmRecordTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 薪资确认业务实现
 * @Author: [tanghaixiang]
 * @Date: [2017-03-10 17:26]
 * @Description: [薪资确认业务实现]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
@CacheConfig(cacheNames = "staffentrySerCache")
@Service
public class SalaryConfirmRecordSerImpl extends ServiceImpl<SalaryConfirmRecord, SalaryConfirmRecordDTO> implements SalaryConfirmRecordSer {

    @Autowired
    private CusPermissionSer cusPermissionSer;

    /**
     * 检测模块
     * @param idFlag
     * @throws SerException
     */
    private void checkMoudleIdentity(String idFlag) throws SerException{
        Boolean flag = cusPermissionSer.moudleCusPermission( idFlag );
        if( !flag){
            throw new SerException("你不是相应模块的人员，不能进行操作");
        }
    }




    @Override
    public Long countSalaryConfirmRecord(SalaryConfirmRecordDTO salaryConfirmRecordDTO) throws SerException {
        Long count = super.count( salaryConfirmRecordDTO);
        return count;
    }

    @Override
    public SalaryConfirmRecordBO getOne(String id) throws SerException {
        if(StringUtils.isBlank(id)){
            throw new SerException("id不能为空");
        }
        SalaryConfirmRecord  salaryConfirmRecord = super.findById(id);
        String dates =  salaryConfirmRecord.getEntryTime().toString();
        SalaryConfirmRecordBO bo = BeanTransform.copyProperties( salaryConfirmRecord , SalaryConfirmRecordBO.class,"entryTime");
        bo.setEntryTime(  dates);
        return bo;
    }

    @Override
    public List<SalaryConfirmRecord> listSalaryConfirmRecord(SalaryConfirmRecordDTO salaryConfirmRecordDTO) throws SerException {
        checkMoudleIdentity("4");

        List<SalaryConfirmRecord> salaryConfirmRecords = super.findByPage( salaryConfirmRecordDTO );
        return salaryConfirmRecords;
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public SalaryConfirmRecordBO insertSalaryConfirmRecord(SalaryConfirmRecordTO salaryConfirmRecordTO) throws SerException {
        checkMoudleIdentity("5");

        SalaryConfirmRecord salaryConfirmRecord = BeanTransform.copyProperties( salaryConfirmRecordTO , SalaryConfirmRecord.class ,true);
        salaryConfirmRecord.setCreateTime( LocalDateTime.now() );
        try {
            super.save( salaryConfirmRecord );
        } catch (SerException e) {
            throw  new SerException( e.getMessage() );
        }
        return BeanTransform.copyProperties( salaryConfirmRecord ,SalaryConfirmRecordBO.class );
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public SalaryConfirmRecordBO editSalaryConfirmRecord(SalaryConfirmRecordTO salaryConfirmRecordTO) throws SerException {
        checkMoudleIdentity("5");

        if(StringUtils.isBlank(salaryConfirmRecordTO.getId())){
            throw new SerException("id不能为空");
        }
        SalaryConfirmRecord temp = super.findById(salaryConfirmRecordTO.getId());
        SalaryConfirmRecord salaryConfirmRecord = BeanTransform.copyProperties( salaryConfirmRecordTO , SalaryConfirmRecord.class ,true);
        BeanTransform.copyProperties( salaryConfirmRecord ,temp,"id","createTime","entryTime");
        temp.setEntryTime(salaryConfirmRecord.getEntryTime());
        temp.setModifyTime( LocalDateTime.now() );
        super.update( temp );

        return BeanTransform.copyProperties( temp ,SalaryConfirmRecordBO.class );
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public void removeSalaryConfirmRecord(String id) throws SerException {
        checkMoudleIdentity("5");

        if(StringUtils.isBlank(id)){
            throw new SerException("id不能为空");
        }
        try {
            super.remove( id );
        } catch (SerException e) {
            throw  new SerException(e.getMessage() );
        }

    }
}
