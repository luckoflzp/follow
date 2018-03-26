package com.G.system.dao;

import com.G.system.model.User;
import com.G.utils.UpdateParameterUtils;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public interface UserMapper {
    List<User> select(User user);
    void update(UpdateParameterUtils updateParameterUtils);
    void delete(User user);
    void insert(User user);
}