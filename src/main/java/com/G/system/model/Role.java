package com.G.system.model;

public class Role {
    private String roleId;

    private String roleName;

    private String roleCode;

    private String parentId;

    public Role(String roleId, String roleName, String roleCode, String parentId) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleCode = roleCode;
        this.parentId = parentId;
    }

    public Role() {
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}