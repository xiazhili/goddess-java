package com.bjike.goddess.financeinit.bo;

import com.bjike.goddess.common.api.bo.BaseBO;
import com.bjike.goddess.financeinit.enums.CategoryName;

import javax.persistence.Column;

/**
 * 类别业务传输对象
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-03-29 04:18 ]
 * @Description: [ 类别业务传输对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class CategoryBO extends BaseBO {

    /**
     * 代码
     */
    private String code;

    /**
     * 一级科目代码
     */
    private String firstCode;
    /**
     * 二级科目代码
     */
    private String secondCode;
    /**
     * 三级科目代码
     */
    private String thirdCode;

    /**
     * 一级科目
     */
    private FirstSubjectBO firstSubjectBO;

    /**
     * 二级科目
     */
    private String secondSubject;

    /**
     * 三级科目
     */
    private String thirdSubject;

    /**
     * 说明
     */
    private String remark;

    /**
     * 类别
     */
    private CategoryName categoryName;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String modifyTime;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFirstCode() {
        return firstCode;
    }

    public void setFirstCode(String firstCode) {
        this.firstCode = firstCode;
    }

    public String getSecondCode() {
        return secondCode;
    }

    public void setSecondCode(String secondCode) {
        this.secondCode = secondCode;
    }

    public String getThirdCode() {
        return thirdCode;
    }

    public void setThirdCode(String thirdCode) {
        this.thirdCode = thirdCode;
    }

    public FirstSubjectBO getFirstSubjectBO() {
        return firstSubjectBO;
    }

    public void setFirstSubjectBO(FirstSubjectBO firstSubjectBO) {
        this.firstSubjectBO = firstSubjectBO;
    }

    public String getSecondSubject() {
        return secondSubject;
    }

    public void setSecondSubject(String secondSubject) {
        this.secondSubject = secondSubject;
    }

    public String getThirdSubject() {
        return thirdSubject;
    }

    public void setThirdSubject(String thirdSubject) {
        this.thirdSubject = thirdSubject;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public CategoryName getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(CategoryName categoryName) {
        this.categoryName = categoryName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }
}