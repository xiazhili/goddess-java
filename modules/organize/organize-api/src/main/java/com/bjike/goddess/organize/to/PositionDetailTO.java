package com.bjike.goddess.organize.to;

import com.bjike.goddess.common.api.entity.ADD;
import com.bjike.goddess.common.api.entity.EDIT;
import com.bjike.goddess.common.api.to.BaseTO;

import javax.validation.constraints.NotNull;

/**
 * 岗位详细展示对象
 *
 * @Author: [dengjunren]
 * @Date: [17-3-8 上午10:08]
 * @Description: []
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public class PositionDetailTO extends BaseTO {

    /**
     * 编号
     */
    @NotNull(message = "编号不能为空", groups = {ADD.class, EDIT.class})
    private String serialNumber;

    /**
     * 部门id
     */
    @NotNull(message = "部门id不能为空", groups = {ADD.class, EDIT.class})
    private String department_id;

    /**
     * 层级ID
     */
    @NotNull(message = "层级ID不能为空", groups = {ADD.class, EDIT.class})
    private String arrangement_id;

    /**
     * 资源池
     */
    @NotNull(message = "资源池不能为空", groups = {ADD.class, EDIT.class})
    private String pool;

    /**
     * 模块id
     */
    @NotNull(message = "模块id不能为空", groups = {ADD.class, EDIT.class})
    private String module_id;

    /**
     * 岗位ID
     */
    @NotNull(message = "岗位ID不能为空", groups = {ADD.class, EDIT.class})
    private String position_id;

    /**
     * 人员编制数
     */
    @NotNull(message = "人员编制数不能为空", groups = {ADD.class, EDIT.class})
    private Integer staff;

    /**
     * 当前人数
     */
    private String current;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 显示编号
     */
    private String showNumber;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }

    public String getArrangement_id() {
        return arrangement_id;
    }

    public void setArrangement_id(String arrangement_id) {
        this.arrangement_id = arrangement_id;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    public String getModule_id() {
        return module_id;
    }

    public void setModule_id(String module_id) {
        this.module_id = module_id;
    }

    public String getPosition_id() {
        return position_id;
    }

    public void setPosition_id(String position_id) {
        this.position_id = position_id;
    }

    public Integer getStaff() {
        return staff;
    }

    public void setStaff(Integer staff) {
        this.staff = staff;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getShowNumber() {
        return showNumber;
    }

    public void setShowNumber(String showNumber) {
        this.showNumber = showNumber;
    }
}
