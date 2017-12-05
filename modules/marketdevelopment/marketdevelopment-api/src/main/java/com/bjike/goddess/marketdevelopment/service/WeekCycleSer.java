package com.bjike.goddess.marketdevelopment.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.marketdevelopment.bo.WeekMonthMoneyBO;
import com.bjike.goddess.marketdevelopment.dto.WeekCycleDTO;
import com.bjike.goddess.marketdevelopment.entity.WeekCycle;

import java.util.List;

/**
* 周计划的周期业务接口
* @Author:			[ zhuangkaiqin ]
* @Date:			[  2017-12-02 05:37 ]
* @Description:	[ 周计划的周期业务接口 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public interface WeekCycleSer extends Ser<WeekCycle, WeekCycleDTO> {

    /**
     * 列表
     *
     * @param dto
     * @return
     * @throws SerException
     */
    default List<WeekMonthMoneyBO> maps(WeekCycleDTO dto) throws SerException {
        return null;
    }
}