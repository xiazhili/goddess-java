package com.bjike.goddess.archive.dao;

import com.bjike.goddess.common.jpa.dao.JpaRep;
import com.bjike.goddess.archive.dto.LaborRelationDTO;
import com.bjike.goddess.archive.entity.LaborRelation;

/**
* 劳动关系类型持久化接口, 继承基类可使用ｊｐａ命名查询
* @Author:			[ dengjunren ]
* @Date:			[  2017-04-12 11:05 ]
* @Description:	[ 劳动关系类型持久化接口, 继承基类可使用ｊｐａ命名查询 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public interface LaborRelationRep extends JpaRep<LaborRelation ,LaborRelationDTO> { 

 }