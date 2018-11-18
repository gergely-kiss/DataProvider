package uk.gergely.kiss.data.provider.administration.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
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
	private Integer id;

	@OneToOne
	@JoinColumn(name = "user_role_id")
	private UserRoleVO userRoleVO;
	@OneToOne
	@JoinColumn(name = "authorization_id")
	private AuthorizationVO authorizationVO;
	private String permission;
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
	 * @return the authorizationVO
	 */
	public AuthorizationVO getAuthorizationVO() {
		return authorizationVO;
	}
	/**
	 * @param authorizationVO the authorizationVO to set
	 */
	public void setAuthorizationVO(AuthorizationVO authorizationVO) {
		this.authorizationVO = authorizationVO;
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