package uk.gergely.kiss.data.provider.administration.util.domain;

import java.util.Objects;

import uk.gergely.kiss.data.provider.administration.PermissionEnum;
import uk.gergely.kiss.data.provider.administration.AuthorizationTypeEnum;

public class AuthorizationTypeEnumPermissionEnumPair {

	private AuthorizationTypeEnum authorizationTypeEnum;
	private PermissionEnum permissionEnum;

	
	/**
	 * 
	 */
	public AuthorizationTypeEnumPermissionEnumPair() {
	}

	/**
	 * @param role
	 * @param permission
	 */
	public AuthorizationTypeEnumPermissionEnumPair(AuthorizationTypeEnum authorizationTypeEnum, PermissionEnum permissionEnum) {
		this.authorizationTypeEnum = authorizationTypeEnum;
		this.permissionEnum = permissionEnum;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AuthorizationTypeEnumPermissionEnumPair [authorizationTypeEnum=");
		builder.append(authorizationTypeEnum);
		builder.append(", permissionEnum=");
		builder.append(permissionEnum);
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
		return Objects.hash(permissionEnum, authorizationTypeEnum);
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
		if (!(obj instanceof AuthorizationTypeEnumPermissionEnumPair)) {
			return false;
		}
		AuthorizationTypeEnumPermissionEnumPair other = (AuthorizationTypeEnumPermissionEnumPair) obj;
		return Objects.equals(permissionEnum, other.permissionEnum) && Objects.equals(authorizationTypeEnum, other.authorizationTypeEnum);
	}



	/**
	 * @return the role
	 */
	public AuthorizationTypeEnum getAuthorizationTypeEnum() {
		return authorizationTypeEnum;
	}

	/**
	 * @param role the role to set
	 */
	public void setAuthorizationTypeEnum(AuthorizationTypeEnum authorizationTypeEnum) {
		this.authorizationTypeEnum = authorizationTypeEnum;
	}

	/**
	 * @return the permission
	 */
	public PermissionEnum getPermissionEnum() {
		return permissionEnum;
	}

	/**
	 * @param permissionEnum the permission to set
	 */
	public void setPermissionEnum(PermissionEnum permissionEnum) {
		this.permissionEnum = permissionEnum;
	}

}
