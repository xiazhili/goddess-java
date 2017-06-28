package com.bjike.goddess.workjoin.to;

import com.bjike.goddess.common.api.to.BaseTO;

import javax.validation.constraints.NotNull;

/**
 * 工作交接信息管理
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-03-20T20:13:56.348 ]
 * @Description: [ 工作交接信息管理 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class WorkJoinDeleteFileTO extends BaseTO {

    public interface TestDEL{}

    /**
     * 删除路径
     */
    @NotNull(groups = {WorkJoinDeleteFileTO.TestDEL.class},message = "删除路径不能为空")
    private String[] paths;

    public String[] getPaths() {
        return paths;
    }

    public void setPaths(String[] paths) {
        this.paths = paths;
    }
}