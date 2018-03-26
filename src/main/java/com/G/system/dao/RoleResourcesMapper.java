package com.G.system.dao;

import com.G.system.model.RoleResources;
import com.G.utils.UpdateParameterUtils;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public interface RoleResourcesMapper {
    List<RoleResources> select(RoleResources record);
    void update(UpdateParameterUtils updateParameterUtils);
    void delete(RoleResources record);
    void insert(RoleResources record);
}