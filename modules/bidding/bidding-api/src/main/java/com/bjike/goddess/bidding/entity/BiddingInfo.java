package com.bjike.goddess.bidding.entity;

import com.bjike.goddess.bidding.enums.BiddingType;
import com.bjike.goddess.bidding.enums.BusinessType;
import com.bjike.goddess.common.api.entity.BaseEntity;
import com.bjike.goddess.common.api.type.Status;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;


/**
 * 招标信息
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-03-16T13:48:29.938 ]
 * @Description: [ 招标信息 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Entity
@Table(name = "bidding_biddinginfo")
public class BiddingInfo extends BaseEntity {

    /**
     * 网站名称
     */
    @Column(name = "webName", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '网站名称'")
    private String webName;

    /**
     * 网址
     */
    @Column(name = "url", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '网址'")
    private String url;

    /**
     * 招投标类型
     */
    @Column(columnDefinition = "TINYINT(1)  COMMENT '招投标类型'")
    private BiddingType biddingType;


    /**
     * 业务类型
     */
    @Column(columnDefinition = "TINYINT(1)  COMMENT '业务类型'")
    private BusinessType businessType;

    /**
     * 业务方向科目
     */
    @Column(name = "businessDirectionSubject", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '业务方向科目'")
    private String businessDirectionSubject;

    /**
     * 标书模块
     */
    @Column(name = "tenderModule", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '标书模块'")
    private String tenderModule;

    /**
     * 招标编号
     */
    @Column(name = "tenderNumber", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '招标编号'")
    private String tenderNumber;

    /**
     * 项目名称
     */
    @Column(name = "projectName", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '项目名称'")
    private String projectName;

    /**
     * 报名时间
     */
    @Column(name = "registrationTime", nullable = false, columnDefinition = "DATE   COMMENT '报名时间'")
    private LocalDate registrationTime;

    /**
     * 投标时间
     */
    @Column(name = "biddingTime", nullable = false, columnDefinition = "DATE   COMMENT '投标时间'")
    private LocalDate biddingTime;

    /**
     * 投标资格要求
     */
    @Column(name = "biddingQualifications", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '投标资格要求'")
    private String biddingQualifications;

    /**
     * 省份
     */
    @Column(name = "provinces", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '省份'")
    private String provinces;

    /**
     * 地市
     */
    @Column(name = "cities", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '地市'")
    private String cities;

    /**
     * 账号
     */
    @Column(name = "account", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '账号'")
    private String account;

    /**
     * 密码
     */
    @Column(name = "password", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '密码'")
    private String password;

    /**
     * 注册人
     */
    @Column(name = "registrant", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '注册人'")
    private String registrant;

    /**
     * 注册信息
     */
    @Column(name = "registrationInfo", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '注册信息'")
    private String registrationInfo;

    /**
     * 状态
     */
    @Column(name = "", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '状态'")
    private Status status;

    /**
     * 购买标书时间
     */
    @Column(name = "buyTenderTime", nullable = false, columnDefinition = "DATE   COMMENT '购买标书时间'")
    private LocalDate buyTenderTime;

    /**
     * 价格
     */
    @Column(name = "price", nullable = false, columnDefinition = "DECIMAL(10,2)   COMMENT '价格'")
    private Double price;

    /**
     * 购买标书要求
     */
    @Column(name = "buyTenderRequirements", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '购买标书要求'")
    private String buyTenderRequirements;

    /**
     * 交保证金时间
     */
    @Column(name = "marginTime", nullable = false, columnDefinition = "DATE   COMMENT '交保证金时间'")
    private LocalDate marginTime;

    /**
     * 交保证金方式
     */
    @Column(name = "marginMethod", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '交保证金方式'")
    private String marginMethod;

    /**
     * 保证金退回时间
     */
    @Column(name = "backTimeDeposit", nullable = false, columnDefinition = "DATE   COMMENT '保证金退回时间'")
    private LocalDate backTimeDeposit;

    /**
     * 备注
     */
    @Column(name = "remark", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '备注'")
    private String remark;


    public String getWebName() {
        return webName;
    }

    public void setWebName(String webName) {
        this.webName = webName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public BiddingType getBiddingType() {
        return biddingType;
    }

    public void setBiddingType(BiddingType biddingType) {
        this.biddingType = biddingType;
    }

    public BusinessType getBusinessType() {
        return businessType;
    }

    public void setBusinessType(BusinessType businessType) {
        this.businessType = businessType;
    }

    public String getBusinessDirectionSubject() {
        return businessDirectionSubject;
    }

    public void setBusinessDirectionSubject(String businessDirectionSubject) {
        this.businessDirectionSubject = businessDirectionSubject;
    }

    public String getTenderModule() {
        return tenderModule;
    }

    public void setTenderModule(String tenderModule) {
        this.tenderModule = tenderModule;
    }

    public String getTenderNumber() {
        return tenderNumber;
    }

    public void setTenderNumber(String tenderNumber) {
        this.tenderNumber = tenderNumber;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public LocalDate getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(LocalDate registrationTime) {
        this.registrationTime = registrationTime;
    }

    public LocalDate getBiddingTime() {
        return biddingTime;
    }

    public void setBiddingTime(LocalDate biddingTime) {
        this.biddingTime = biddingTime;
    }

    public String getBiddingQualifications() {
        return biddingQualifications;
    }

    public void setBiddingQualifications(String biddingQualifications) {
        this.biddingQualifications = biddingQualifications;
    }

    public String getProvinces() {
        return provinces;
    }

    public void setProvinces(String provinces) {
        this.provinces = provinces;
    }

    public String getCities() {
        return cities;
    }

    public void setCities(String cities) {
        this.cities = cities;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegistrant() {
        return registrant;
    }

    public void setRegistrant(String registrant) {
        this.registrant = registrant;
    }

    public String getRegistrationInfo() {
        return registrationInfo;
    }

    public void setRegistrationInfo(String registrationInfo) {
        this.registrationInfo = registrationInfo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getBuyTenderTime() {
        return buyTenderTime;
    }

    public void setBuyTenderTime(LocalDate buyTenderTime) {
        this.buyTenderTime = buyTenderTime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBuyTenderRequirements() {
        return buyTenderRequirements;
    }

    public void setBuyTenderRequirements(String buyTenderRequirements) {
        this.buyTenderRequirements = buyTenderRequirements;
    }

    public LocalDate getMarginTime() {
        return marginTime;
    }

    public void setMarginTime(LocalDate marginTime) {
        this.marginTime = marginTime;
    }

    public String getMarginMethod() {
        return marginMethod;
    }

    public void setMarginMethod(String marginMethod) {
        this.marginMethod = marginMethod;
    }

    public LocalDate getBackTimeDeposit() {
        return backTimeDeposit;
    }

    public void setBackTimeDeposit(LocalDate backTimeDeposit) {
        this.backTimeDeposit = backTimeDeposit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}