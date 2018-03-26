package com.G.system.dao;

import com.G.system.model.RoleUser;
import com.G.utils.UpdateParameterUtils;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public interface RoleUserMapper {
    List<RoleUser> select(RoleUser roleUser);
    void update(UpdateParameterUtils updateParameterUtils);
    void delete(RoleUser roleUser);
    void insert(RoleUser roleUser);
}