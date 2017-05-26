package com.bjike.goddess.recruit.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.recruit.bo.RecruitProBO;
import com.bjike.goddess.recruit.dto.RecruitProDTO;
import com.bjike.goddess.recruit.to.RecruitProTO;

import java.util.List;

/**
 * 招聘方案
 *
 * @Author: [ sunfengtao ]
 * @Date: [ 2017-04-08 05:10 ]
 * @Description: [  ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface RecruitProAPI {

    /**
     * 根据id查询招聘方案
     *
     * @param id 招聘方案唯一标识
     * @return class RecruitProBO
     * @throws SerException
     */
    RecruitProBO findById(String id) throws SerException;

    /**
     * 计算总条数
     *
     * @param dto 招聘方案dto
     * @throws SerException
     */
    Long count(RecruitProDTO dto) throws SerException;

    /**
     * 分页查询招聘方案
     *
     * @param dto
     * @return
     * @throws SerException
     */
    List<RecruitProBO> list(RecruitProDTO dto) throws SerException;

    /**
     * 保存招聘方案
     *
     * @param recruitProTO
     * @return
     * @throws SerException
     */
    RecruitProBO save(RecruitProTO recruitProTO) throws SerException;

    /**
     * 根据id删除招聘方案
     *
     * @param id
     * @throws SerException
     */
    void remove(String id) throws SerException;

    /**
     * 更新招聘方案
     *
     * @param recruitProTO
     * @throws SerException
     */
    void update(RecruitProTO recruitProTO) throws SerException;

    /**
     * 运营商务部审核
     *
     * @param id         招聘方案唯一标识
     * @param yyOpinion 运营商务部意见
     * @param pass       是否通过
     * @throws SerException
     */
    void yyEdit(String id, String yyOpinion, Boolean pass) throws SerException;

    /**
     * 总经办审核
     *
     * @param id         招聘方案唯一标识
     * @param zjbOpnion 总经办意见
     * @param pass       是否通过
     * @throws SerException
     */
    void managerEdit(String id, String zjbOpnion, Boolean pass) throws SerException;
}
