package uk.gergely.kiss.data.provider.administration.util.domain;

import java.util.Objects;

import uk.gergely.kiss.data.provider.administration.PermissionEnum;
import uk.gergely.kiss.data.provider.administration.RoleEnum;

public class RolePermissionPair {

	private RoleEnum role;
	private PermissionEnum permission;

	
	/**
	 * 
	 */
	public RolePermissionPair() {
	}

	/**
	 * @param role
	 * @param permission
	 */
	public RolePermissionPair(RoleEnum role, PermissionEnum permission) {
		this.role = role;
		this.permission = permission;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RolePermissionPair [role=");
		builder.append(role);
		builder.append(", permission=");
		builder.append(permission);
		builder.append("]");
		return builder.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(permission, role);
	}

	/*
	 * (non-Javadoc)
	 * 
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
		if (!(obj instanceof RolePermissionPair)) {
			return false;
		}
		RolePermissionPair other = (RolePermissionPair) obj;
		return Objects.equals(permission, other.permission) && Objects.equals(role, other.role);
	}



	/**
	 * @return the role
	 */
	public RoleEnum getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(RoleEnum role) {
		this.role = role;
	}

	/**
	 * @return the permission
	 */
	public PermissionEnum getPermission() {
		return permission;
	}

	/**
	 * @param permission the permission to set
	 */
	public void setPermission(PermissionEnum permission) {
		this.permission = permission;
	}

}
