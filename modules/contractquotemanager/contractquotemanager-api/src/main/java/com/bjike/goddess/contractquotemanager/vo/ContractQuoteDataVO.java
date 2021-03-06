package com.bjike.goddess.contractquotemanager.vo;

import com.bjike.goddess.common.api.type.Status;

/**
 * 合同单价资料信息表现层对象
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-20T17:01:53.315 ]
 * @Description: [ 合同单价资料信息表现层对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class ContractQuoteDataVO {

    /**
     * id
     */
    private String id;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 项目
     */
    private String project;

    /**
     * 地区
     */
    private String area;

    /**
     * 适用年度开始时间
     */
    private String suitableDateStart;

    /**
     * 适用年度结束时间
     */
    private String suitableDateEnd;

    /**
     * 状态 0正常,1过期
     */
    private Status status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSuitableDateStart() {
        return suitableDateStart;
    }

    public void setSuitableDateStart(String suitableDateStart) {
        this.suitableDateStart = suitableDateStart;
    }

    public String getSuitableDateEnd() {
        return suitableDateEnd;
    }

    public void setSuitableDateEnd(String suitableDateEnd) {
        this.suitableDateEnd = suitableDateEnd;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}