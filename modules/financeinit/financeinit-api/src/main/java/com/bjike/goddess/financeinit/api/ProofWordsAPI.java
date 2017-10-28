package com.bjike.goddess.financeinit.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.financeinit.bo.ProofWordsBO;
import com.bjike.goddess.financeinit.dto.ProofWordsDTO;
import com.bjike.goddess.financeinit.to.GuidePermissionTO;
import com.bjike.goddess.financeinit.to.ProofWordsTO;

import java.util.List;

/**
 * 凭证字业务接口
 *
 * @Author: [ lijuntao ]
 * @Date: [ 2017-10-10 03:09 ]
 * @Description: [ 凭证字业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface ProofWordsAPI {
    /**
     * 下拉导航权限
     */
    default Boolean sonPermission() throws SerException {
        return null;
    }
    /**
     * 导航权限
     */
    default Boolean guidePermission(GuidePermissionTO guidePermissionTO) throws SerException {
        return null;
    }
    /**
     * 凭证字列表总条数
     */
    default Long countProof(ProofWordsDTO proofWordsDTO) throws SerException {
        return null;
    }

    /**
     * 根据id获取凭证字列表
     *
     * @return class ProofWordsBO
     */
    default ProofWordsBO getOneById(String id) throws SerException {
        return null;
    }


    /**
     * 凭证字列表
     *
     * @return class ProofWordsBO
     */
    default List<ProofWordsBO> listProof(ProofWordsDTO proofWordsDTO) throws SerException {
        return null;
    }

    /**
     * 添加
     *
     * @param proofWordsTO 凭证字
     * @return class ProofWordsBO
     */
    default ProofWordsBO addProof(ProofWordsTO proofWordsTO) throws SerException {
        return null;
    }
}