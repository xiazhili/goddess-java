package com.bjike.goddess.managepromotion.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.managepromotion.bo.SkillPromotionApplyBO;
import com.bjike.goddess.managepromotion.dto.SkillPromotionApplyDTO;
import com.bjike.goddess.managepromotion.service.SkillPromotionApplySer;
import com.bjike.goddess.managepromotion.to.SkillPromotionApplyTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 技能晋升申请业务接口实现
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-05-23 09:03 ]
 * @Description: [ 技能晋升申请业务接口实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Service("skillPromotionApplyApiImpl")
public class SkillPromotionApplyApiImpl implements SkillPromotionApplyAPI {
    @Autowired
    private SkillPromotionApplySer skillPromotionApplySer;

    @Override
    public Long countSkillPromotionApply(SkillPromotionApplyDTO skillPromotionApplyDTO) throws SerException {
        return skillPromotionApplySer.countSkillPromotionApply(skillPromotionApplyDTO);
    }
    @Override
    public SkillPromotionApplyBO getOne(String id) throws SerException {
        return skillPromotionApplySer.getOne(id);
    }

    @Override
    public List<SkillPromotionApplyBO> findListSkillPromotionApply(SkillPromotionApplyDTO skillPromotionApplyDTO) throws SerException {
        return skillPromotionApplySer.findListSkillPromotionApply(skillPromotionApplyDTO);
    }

    @Override
    public SkillPromotionApplyBO insertSkillPromotionApply(SkillPromotionApplyTO skillPromotionApplyTO) throws SerException {
        return skillPromotionApplySer.insertSkillPromotionApply(skillPromotionApplyTO);
    }

    @Override
    public SkillPromotionApplyBO editSkillPromotionApply(SkillPromotionApplyTO skillPromotionApplyTO) throws SerException {
        return skillPromotionApplySer.editSkillPromotionApply(skillPromotionApplyTO);
    }

}