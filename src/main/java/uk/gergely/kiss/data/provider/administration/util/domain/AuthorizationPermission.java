package uk.gergely.kiss.data.provider.administration.util.domain;

import java.util.Objects;

import uk.gergely.kiss.data.provider.administration.PermissionEnum;
import uk.gergely.kiss.data.provider.administration.AuthorizationEnum;

public class AuthorizationPermission {

	private AuthorizationEnum role;
	private PermissionEnum permission;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AuthorizationPermission [Authorization=");
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
		if (!(obj instanceof AuthorizationPermission)) {
			return false;
		}
		AuthorizationPermission other = (AuthorizationPermission) obj;
		return Objects.equals(permission, other.permission) && Objects.equals(role, other.role);
	}



	/**
	 * @return the role
	 */
	public AuthorizationEnum getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(AuthorizationEnum role) {
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
