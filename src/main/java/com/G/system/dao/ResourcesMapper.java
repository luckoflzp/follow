package com.G.system.dao;

import com.G.system.model.Resources;
import com.G.utils.UpdateParameterUtils;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public interface ResourcesMapper {
    List<Resources> select(Resources user);
    void update(UpdateParameterUtils updateParameterUtils);
    void delete(Resources user);
    void insert(Resources user);
}