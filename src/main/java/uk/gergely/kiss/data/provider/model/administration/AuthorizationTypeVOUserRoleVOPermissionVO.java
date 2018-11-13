package uk.gergely.kiss.data.provider.model.administration;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
	@JoinColumn(name = "authorization_type_id")
	private AuthorizationTypeVO authorizationTypeVO;
	@OneToOne
	@JoinColumn(name = "user_role_id")
	private UserRoleVO userRoleVO;
	private String permission;

	public AuthorizationTypeVO getAuthorizationTypeVO() {
		return authorizationTypeVO;
	}

	public void setAuthorizationTypeVO(AuthorizationTypeVO authorizationTypeVO) {
		this.authorizationTypeVO = authorizationTypeVO;
	}

	public UserRoleVO getUserRoleVO() {
		return userRoleVO;
	}

	public void setUserRoleVO(UserRoleVO userRoleVO) {
		this.userRoleVO = userRoleVO;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}
}
