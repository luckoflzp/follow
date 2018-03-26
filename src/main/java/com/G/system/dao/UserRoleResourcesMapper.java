package com.G.system.dao;

import com.G.system.model.User;
import com.G.system.model.UserRoleResources;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public interface UserRoleResourcesMapper {
    List<UserRoleResources> select(User user);
}
