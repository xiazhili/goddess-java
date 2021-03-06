package com.bjike.goddess.budget.service;

import com.bjike.goddess.budget.bo.ProjectWeekBO;
import com.bjike.goddess.budget.bo.ProjectWeekCountBO;
import com.bjike.goddess.budget.dto.ArrivalWeekDTO;
import com.bjike.goddess.budget.dto.ProjectWeekDTO;
import com.bjike.goddess.budget.entity.ProjectWeek;
import com.bjike.goddess.budget.to.GuidePermissionTO;
import com.bjike.goddess.budget.to.ProjectWeekTO;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;

import java.util.List;

/**
 * 项目收入周业务接口
 *
 * @Author: [ chenjunhao ]
 * @Date: [ 2017-05-02 03:58 ]
 * @Description: [ 项目收入周业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface ProjectWeekSer extends Ser<ProjectWeek, ProjectWeekDTO> {
    /**
     * 下拉导航权限
     */
    Boolean sonPermission() throws SerException;

    /**
     * 导航权限
     */
    Boolean guidePermission(GuidePermissionTO guidePermissionTO) throws SerException;

    /**
     * 添加
     *
     * @param to 项目收入周信息
     * @return class ProjectWeekBO
     * @throws SerException
     */
    default ProjectWeekBO save(ProjectWeekTO to) throws SerException {
        return null;
    }

    /**
     * 编辑
     *
     * @param to 项目收入周信息
     * @throws SerException
     */
    default void edit(ProjectWeekTO to) throws SerException {
    }

    /**
     * 删除
     *
     * @param id 项目收入周id
     * @throws SerException
     */
    default void delete(String id) throws SerException {

    }

    /**
     * 查找
     *
     * @param dto 项目收入周分页信息
     * @return class ProjectWeekBO
     * @throws SerException
     */
    default List<ProjectWeekBO> list(ProjectWeekDTO dto) throws SerException {
        return null;
    }

    /**
     * 通过id查找
     *
     * @param id 项目收入周id
     * @return class ProjectWeekBO
     * @throws SerException
     */
    default ProjectWeekBO findByID(String id) throws SerException {
        return null;
    }

    /**
     * 汇总
     *
     * @return class ProjectWeekCountBO
     * @throws SerException
     */
    default List<ProjectWeekCountBO> count() throws SerException {
        return null;
    }

    /**
     * 分项目汇总
     *
     * @param dto1 dto
     * @return class ProjectWeekCountBO
     * @throws SerException
     */
    List<ProjectWeekCountBO> conditionsCount(ProjectWeekDTO dto1) throws SerException;

    /**
     * 查询总记录数
     *
     * @param dto dto
     * @return class Long
     * @throws SerException
     */
    default Long countNum(ProjectWeekDTO dto) throws SerException {
        return null;
    }

    /**
     * 查找所有项目
     *
     * @throws SerException
     */
    default List<String> findAllProjects() throws SerException {
        return null;
    }
}