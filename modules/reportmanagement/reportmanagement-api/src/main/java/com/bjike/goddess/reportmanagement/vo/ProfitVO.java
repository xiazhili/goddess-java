package com.bjike.goddess.reportmanagement.vo;

/**
 * 利润表表现层对象
 *
 * @Author: [ chenjunhao ]
 * @Date: [ 2017-06-22 06:03 ]
 * @Description: [ 利润表表现层对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class ProfitVO {

    /**
     * id
     */
    private String id;
    /**
     * 项目
     */
    private String project;

    /**
     * 本月数
     */
    private Double currentMonthAmount;

    /**
     * 本年累计数
     */
    private Double currentYearAmount;

//    /**
//     * 1季度
//     */
//    private Double firstSeason;
//
//    /**
//     * 2季度
//     */
//    private Double secondSeason;
//
//    /**
//     * 3季度
//     */
//    private Double thirdSeason;
//
//    /**
//     * 4季度
//     */
//    private Double fourthSeason;

//    public Double getFirstSeason() {
//        return firstSeason;
//    }
//
//    public void setFirstSeason(Double firstSeason) {
//        this.firstSeason = firstSeason;
//    }
//
//    public Double getSecondSeason() {
//        return secondSeason;
//    }
//
//    public void setSecondSeason(Double secondSeason) {
//        this.secondSeason = secondSeason;
//    }
//
//    public Double getThirdSeason() {
//        return thirdSeason;
//    }
//
//    public void setThirdSeason(Double thirdSeason) {
//        this.thirdSeason = thirdSeason;
//    }
//
//    public Double getFourthSeason() {
//        return fourthSeason;
//    }
//
//    public void setFourthSeason(Double fourthSeason) {
//        this.fourthSeason = fourthSeason;
//    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Double getCurrentMonthAmount() {
        return currentMonthAmount;
    }

    public void setCurrentMonthAmount(Double currentMonthAmount) {
        this.currentMonthAmount = currentMonthAmount;
    }

    public Double getCurrentYearAmount() {
        return currentYearAmount;
    }

    public void setCurrentYearAmount(Double currentYearAmount) {
        this.currentYearAmount = currentYearAmount;
    }
}