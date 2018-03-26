package com.G.system.dao;

import com.G.system.model.Role;
import com.G.utils.UpdateParameterUtils;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public interface RoleMapper {
   List<Role> select(Role role);
   void update(UpdateParameterUtils updateParameterUtils);
   void delete(Role role);
   void insert(Role role);
}