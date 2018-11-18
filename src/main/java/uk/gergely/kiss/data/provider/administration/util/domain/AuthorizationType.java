package uk.gergely.kiss.data.provider.administration.util.domain;

import java.util.List;
import java.util.Objects;

public class AuthorizationType {

	private String name;
	private String description;
	private List<RolePermissionPair> rolePermissionList;

	
	
	/**
	 * 
	 */
	public AuthorizationType() {
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AuthorizationType [name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", rolePermissionList=");
		builder.append(rolePermissionList);
		builder.append("]");
		return builder.toString();
	}
	/**
	 * @param name
	 * @param description
	 * @param rolePermissionList
	 */
	public AuthorizationType(String name, String description, List<RolePermissionPair> rolePermissionList) {
		this.name = name;
		this.description = description;
		this.rolePermissionList = rolePermissionList;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(description, name, rolePermissionList);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AuthorizationType)) {
			return false;
		}
		AuthorizationType other = (AuthorizationType) obj;
		return Objects.equals(description, other.description) && Objects.equals(name, other.name)
				&& Objects.equals(rolePermissionList, other.rolePermissionList);
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the rolePermissionList
	 */
	public List<RolePermissionPair> getRolePermissionList() {
		return rolePermissionList;
	}
	/**
	 * @param rolePermissionList the rolePermissionList to set
	 */
	public void setRolePermissionList(List<RolePermissionPair> rolePermissionList) {
		this.rolePermissionList = rolePermissionList;
	};


}
