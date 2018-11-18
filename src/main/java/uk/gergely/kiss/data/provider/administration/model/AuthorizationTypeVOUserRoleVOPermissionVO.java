package uk.gergely.kiss.data.provider.administration.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Value object to store authorization type roles and the corresponding
 * permissions
 * 
 * @author kiss-
 *
 */
@Entity
@Table(name = "authorization_type_user_role_permissions")
public class AuthorizationTypeVOUserRoleVOPermissionVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1_000_000L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@OneToOne
	@JoinColumn(name = "authorization_type_id")
	private UserRoleVO userRoleVO;
	@OneToOne
	@JoinColumn(name = "user_role_id")
	private AuthorizationTypeVO authorizationTypeVO;
	private String permission;

	/**
	 * 
	 */
	public AuthorizationTypeVOUserRoleVOPermissionVO() {
	}

	/**
	 * @param id
	 * @param userRoleVO
	 * @param authorizationTypeVO
	 * @param permission
	 */
	public AuthorizationTypeVOUserRoleVOPermissionVO(Integer id, UserRoleVO userRoleVO,
			AuthorizationTypeVO authorizationTypeVO, String permission) {
		this.id = id;
		this.userRoleVO = userRoleVO;
		this.authorizationTypeVO = authorizationTypeVO;
		this.permission = permission;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(authorizationTypeVO, id, permission, userRoleVO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuthorizationTypeVOUserRoleVOPermissionVO other = (AuthorizationTypeVOUserRoleVOPermissionVO) obj;
		return Objects.equals(authorizationTypeVO, other.authorizationTypeVO) && Objects.equals(id, other.id)
				&& Objects.equals(permission, other.permission) && Objects.equals(userRoleVO, other.userRoleVO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AuthorizationTypeVOUserRoleVOPermissionVO [id=");
		builder.append(id);
		builder.append(", userRoleVO=");
		builder.append(userRoleVO);
		builder.append(", authorizationTypeVO=");
		builder.append(authorizationTypeVO);
		builder.append(", permission=");
		builder.append(permission);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the userRoleVO
	 */
	public UserRoleVO getUserRoleVO() {
		return userRoleVO;
	}

	/**
	 * @param userRoleVO the userRoleVO to set
	 */
	public void setUserRoleVO(UserRoleVO userRoleVO) {
		this.userRoleVO = userRoleVO;
	}

	/**
	 * @return the authorizationTypeVO
	 */
	public AuthorizationTypeVO getAuthorizationTypeVO() {
		return authorizationTypeVO;
	}

	/**
	 * @param authorizationTypeVO the authorizationTypeVO to set
	 */
	public void setAuthorizationTypeVO(AuthorizationTypeVO authorizationTypeVO) {
		this.authorizationTypeVO = authorizationTypeVO;
	}

	/**
	 * @return the permission
	 */
	public String getPermission() {
		return permission;
	}

	/**
	 * @param permission the permission to set
	 */
	public void setPermission(String permission) {
		this.permission = permission;
	}
}
