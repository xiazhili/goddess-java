package com.bjike.goddess.royalty.to;

import com.bjike.goddess.common.api.to.BaseTO;

/**
 * 指标库
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-07-10 11:23 ]
 * @Description: [ 指标库 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class IndexLibraryTO extends BaseTO {
    public interface TestAdd {
    }

    public interface TestEdit {
    }

    /**
     * 指标编号
     */
    private String indexNum;

    /**
     * 指标维度
     */
    private String indexDimension;

    /**
     * 指标名称
     */
    private String indexName;

    /**
     * 指标描述
     */
    private String indexDescription;

    /**
     * 意义
     */
    private String sense;

    /**
     * 考核部门
     */
    private String inspectionDepartment;

    /**
     * 适用岗位
     */
    private String forPost;

    /**
     * 数据来源
     */
    private String dataSource;


    public String getIndexNum() {
        return indexNum;
    }

    public void setIndexNum(String indexNum) {
        this.indexNum = indexNum;
    }

    public String getIndexDimension() {
        return indexDimension;
    }

    public void setIndexDimension(String indexDimension) {
        this.indexDimension = indexDimension;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public String getIndexDescription() {
        return indexDescription;
    }

    public void setIndexDescription(String indexDescription) {
        this.indexDescription = indexDescription;
    }

    public String getSense() {
        return sense;
    }

    public void setSense(String sense) {
        this.sense = sense;
    }

    public String getInspectionDepartment() {
        return inspectionDepartment;
    }

    public void setInspectionDepartment(String inspectionDepartment) {
        this.inspectionDepartment = inspectionDepartment;
    }

    public String getForPost() {
        return forPost;
    }

    public void setForPost(String forPost) {
        this.forPost = forPost;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }
}