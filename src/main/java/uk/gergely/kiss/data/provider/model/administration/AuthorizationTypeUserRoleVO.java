package uk.gergely.kiss.data.provider.model.administration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "authorization_types_user_roles")
public class AuthorizationTypeUserRoleVO {

	@Id
	private Integer authorizationTypeId;
	@Column(name = "user_role_id")
	private Integer userRoleId;

	public Integer getAuthorizationTypeId() {
		return authorizationTypeId;
	}

	public void setAuthorizationTypeId(Integer authorizationTypeId) {
		this.authorizationTypeId = authorizationTypeId;
	}

	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}
}
