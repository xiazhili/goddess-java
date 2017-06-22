package com.bjike.goddess.staffmeeting.vo;

import com.bjike.goddess.common.api.type.Status;
import com.bjike.goddess.staffmeeting.enums.MeetingPurpose;

/**
 * 员工代表大会纪要表现层对象
 *
 * @Author: [ Jason ]
 * @Date: [ 2017-06-06 11:33 ]
 * @Description: [ 员工代表大会纪要表现层对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class MeetingSummaryVO {

    /**
     * id
     */
    private String id;
    /**
     * 会议编号
     */
    private String meetingNum;

    /**
     * 实际参会人员
     */
    private String actualUsers;

    /**
     * 新增参会人员
     */
    private String addUsers;

    /**
     * 未参会人员
     */
    private String notAttendUsers;

    /**
     * 会议目的
     */
    private MeetingPurpose meetingPurpose;

    /**
     * 参会人数
     */
    private Integer attendAccount;

    /**
     * 实际参会时间
     */
    private String actualTime;

    /**
     * 实际会议地点
     */
    private String actualPlace;

    /**
     * 最终监督结果
     */
    private String superviseResult;

    /**
     * 最终表决结果
     */
    private String voteResult;

    /**
     * 会议记录人
     */
    private String recordUser;

    /**
     * 会议主持人
     */
    private String compere;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMeetingNum() {
        return meetingNum;
    }

    public void setMeetingNum(String meetingNum) {
        this.meetingNum = meetingNum;
    }

    public String getActualUsers() {
        return actualUsers;
    }

    public void setActualUsers(String actualUsers) {
        this.actualUsers = actualUsers;
    }

    public String getAddUsers() {
        return addUsers;
    }

    public void setAddUsers(String addUsers) {
        this.addUsers = addUsers;
    }

    public String getNotAttendUsers() {
        return notAttendUsers;
    }

    public void setNotAttendUsers(String notAttendUsers) {
        this.notAttendUsers = notAttendUsers;
    }

    public MeetingPurpose getMeetingPurpose() {
        return meetingPurpose;
    }

    public void setMeetingPurpose(MeetingPurpose meetingPurpose) {
        this.meetingPurpose = meetingPurpose;
    }

    public Integer getAttendAccount() {
        return attendAccount;
    }

    public void setAttendAccount(Integer attendAccount) {
        this.attendAccount = attendAccount;
    }

    public String getActualTime() {
        return actualTime;
    }

    public void setActualTime(String actualTime) {
        this.actualTime = actualTime;
    }

    public String getActualPlace() {
        return actualPlace;
    }

    public void setActualPlace(String actualPlace) {
        this.actualPlace = actualPlace;
    }

    public String getSuperviseResult() {
        return superviseResult;
    }

    public void setSuperviseResult(String superviseResult) {
        this.superviseResult = superviseResult;
    }

    public String getVoteResult() {
        return voteResult;
    }

    public void setVoteResult(String voteResult) {
        this.voteResult = voteResult;
    }

    public String getRecordUser() {
        return recordUser;
    }

    public void setRecordUser(String recordUser) {
        this.recordUser = recordUser;
    }

    public String getCompere() {
        return compere;
    }

    public void setCompere(String compere) {
        this.compere = compere;
    }

}