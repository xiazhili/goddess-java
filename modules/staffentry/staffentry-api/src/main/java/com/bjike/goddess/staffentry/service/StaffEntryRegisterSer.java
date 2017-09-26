package com.bjike.goddess.staffentry.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.staffentry.bo.EntrySummaryBO;
import com.bjike.goddess.staffentry.bo.LinkDateStaffEntryBO;
import com.bjike.goddess.staffentry.bo.StaffEntryRegisterBO;
import com.bjike.goddess.staffentry.dto.StaffEntryRegisterDTO;
import com.bjike.goddess.staffentry.entity.StaffEntryRegister;
import com.bjike.goddess.staffentry.to.*;
import com.bjike.goddess.staffentry.vo.SonPermissionObject;

import java.util.List;

/**
 * 员工入职注册业务接口
 *
 * @Author: [ tanghaixiang ]
 * @Date: [ 2017-05-15 07:03 ]
 * @Description: [ 员工入职注册业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface StaffEntryRegisterSer extends Ser<StaffEntryRegister, StaffEntryRegisterDTO> {


    /**
     * 下拉导航权限
     */
    default List<SonPermissionObject> sonPermission() throws SerException {

        return null;
    }

    /**
     * 工能导航权限
     */
    default Boolean guidePermission(GuidePermissionTO guidePermissionTO) throws SerException {
        return null;
    }

    /**
     * 员工入职注册列表总条数
     */
    default Long countStaffEntryRegister(StaffEntryRegisterDTO staffEntryRegisterDTO) throws SerException {
        return null;
    }

    /**
     * 根据id获取员工入职注册
     *
     * @return class StaffEntryRegisterBO
     */
    default StaffEntryRegisterBO getOne(String id) throws SerException {
        return null;
    }

    /**
     * 员工入职注册列表
     *
     * @return class StaffEntryRegisterBO
     */
    default List<StaffEntryRegisterBO> listStaffEntryRegister(StaffEntryRegisterDTO staffEntryRegisterDTO) throws SerException {
        return null;
    }

    /**
     * 添加
     *
     * @param staffEntryRegisterTO 员工入职注册信息
     * @return class StaffEntryRegisterBO
     */
    default StaffEntryRegisterBO addStaffEntryRegister(StaffEntryRegisterTO staffEntryRegisterTO) throws SerException {
        return null;
    }

    /**
     * 手填可以所有进行修改编辑
     *
     * @param staffEntryRegisterTO 员工入职注册信息
     * @return class StaffEntryRegisterBO
     */
    default StaffEntryRegisterBO editStaffEntryRegister(StaffEntryRegisterTO staffEntryRegisterTO) throws SerException {
        return null;
    }

    /**
     * 删除
     *
     * @param id 员工入职注册信息id
     */
    default void delete(String id) throws SerException {
    }


    /**
     * 获取注册的员工编号
     */
    default String maxEmpNumber() throws SerException {
        return null;
    }

    /**
     * 账号密码告知
     *
     * @param staffEntryRegisterEmailTO 账号密码告知
     */
    default void sendAccountToEmp(StaffEntryRegisterEmailTO staffEntryRegisterEmailTO) throws SerException {
    }

    /**
     * 根据员工姓名获取注册的员工编号
     *
     * @param name
     * @return
     * @throws SerException
     */
    default String getMaxEmpNumberByName(String name) throws SerException {
        return null;
    }

    /**
     * 导出Excel
     *
     * @throws SerException
     */
    byte[] exportExcel() throws SerException;

    /**
     * 导出Excel
     *
     * @throws SerException
     */
    byte[] templateExport() throws SerException;

    /**
     * 导入
     *
     * @param staffEntryRegisterTOS 注册to
     */
    void importExcel(List<StaffEntryRegisterTO> staffEntryRegisterTOS) throws SerException;

    /**
     * 获取通过内容
     * @param ids 注册id
     * @return
     * @throws SerException
     */
    default String findNotisDate(String[] ids) throws SerException{
        return null;
    }

    /**
     * 通告
     * @param content 通告内容
     * @param emails 通告人email
     * @param ids 注册id
     * @throws SerException
     */
    default void notis(String content,String[] emails,String[] ids) throws SerException{
        return;
    }

    /**
     * 获取所有的员工编号
     * @throws SerException
     */
    default List<String> findEmpNum()throws SerException{
        return null;
    }
    /**
     * 根据员工编号获取数据
     * @throws SerException
     */
    default LinkDateStaffEntryBO findByEmpNum(String empNum)throws SerException{
        return null;
    }

    /**
     * 获取所有的地区
     * @throws SerException
     */
    default List<String> findAllArea()throws SerException{
        return null;
    }
    /**
     * 根据地区获取所有项目组
     * @throws SerException
     */
    default List<String> findDepByArea(String area)throws SerException{
        return null;
    }
    /**
     * 入职管理日汇总
     * @param summationDate 时间
     * @return class SummationBO
     * @throws SerException
     */
    default List<EntrySummaryBO> summaDay(String summationDate) throws SerException{
        return null;
    }
    /**
     * 入职管理周汇总
     * @param year 年份
     * @param month 月份
     * @param week 周期
     * @return class SummationBO
     * @throws SerException
     */
    default List<EntrySummaryBO> summaWeek(Integer year,Integer month,Integer week) throws SerException{
        return null;
    }
    /**
     * 入职管理月汇总
     * @param year 年份
     * @param month 月份
     * @return class SummationBO
     * @throws SerException
     */
    default List<EntrySummaryBO> summaMonth(Integer year,Integer month) throws SerException{
        return null;
    }
    /**
     * 入职管理累计汇总
     * @param endDate 截止日期
     * @return class SummationBO
     * @throws SerException
     */
    default List<EntrySummaryBO> summaTotal(String endDate) throws SerException{
        return null;
    }
}