package com.bjike.goddess.interiorrecommend.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.interiorrecommend.bo.AwardInfoBO;
import com.bjike.goddess.interiorrecommend.to.AwardInfoTO;

/**
 * 推荐奖励信息业务接口
 *
 * @Author: [ Jason ]
 * @Date: [ 2017-04-10 04:07 ]
 * @Description: [ 推荐奖励信息业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface AwardInfoAPI {

    /**
     * 编辑奖励信息
     *
     * @param to 奖励信息
     * @return 奖励信息
     */
    AwardInfoBO editModel(AwardInfoTO to) throws SerException;
}