package uk.gergely.kiss.data.provider.model.administration.util.model;

import java.util.List;

public class AuthorizationType {

	private String name;
	private String description;
	private List<RolePermission> rolePermissionList;;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<RolePermission> getRolePermissionList() {
		return rolePermissionList;
	}

	public void setRolePermissionList(List<RolePermission> rolePermissionList) {
		this.rolePermissionList = rolePermissionList;
	}

}
