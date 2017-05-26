package com.bjike.goddess.recruit.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.recruit.bo.TemplateManageBO;
import com.bjike.goddess.recruit.dto.TemplateManageDTO;
import com.bjike.goddess.recruit.entity.TemplateManage;
import com.bjike.goddess.recruit.to.TemplateManageTO;

import java.util.List;

/**
 * 模板管理
 *
 * @Author: [ sunfengtao ]
 * @Date: [ 2017-04-08 05:10 ]
 * @Description: [  ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface TemplateManageSer extends Ser<TemplateManage, TemplateManageDTO> {

    /**
     * 分页查询模板管理
     *
     * @param templateManageDTO
     * @return
     * @throws SerException
     */
    List<TemplateManageBO> list(TemplateManageDTO templateManageDTO) throws SerException;

    /**
     * 保存模板管理
     *
     * @param templateManageTO
     * @return
     * @throws SerException
     */
    TemplateManageBO save(TemplateManageTO templateManageTO) throws SerException;

    /**
     * 根据id删除模板管理
     *
     * @param id
     * @throws SerException
     */
    void remove(String id) throws SerException;

    /**
     * 更新模板管理
     *
     * @param templateManageTO
     * @throws SerException
     */
    void update(TemplateManageTO templateManageTO) throws SerException;

}
