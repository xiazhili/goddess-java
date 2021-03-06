package com.bjike.goddess.moneyside.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.moneyside.bo.CustomerInfoCollectBO;
import com.bjike.goddess.moneyside.dto.CustomerInfoCollectDTO;

import java.util.List;

/**
 * 客户信息汇总业务接口
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-06-07 10:11 ]
 * @Description: [ 客户信息汇总业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface CustomerInfoCollectAPI {
    /**
     * 客户信息汇总
     *
     * @param dto
     * @return class CustomerInfoCollectBO
     * @throws SerException
     */
    default List<CustomerInfoCollectBO> collect(CustomerInfoCollectDTO dto) throws SerException {
        return null;
    }
}