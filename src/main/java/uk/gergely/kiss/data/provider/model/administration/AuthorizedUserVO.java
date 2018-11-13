package uk.gergely.kiss.data.provider.model.administration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "authorized_users")
public class AuthorizedUserVO {

	@Id
	private Integer id;
	@Column(name = "host_reference")
	private String hostReference;
	private String salt;
	private String password;
	@OneToOne
	@JoinColumn(name = "user_name")
	private UserNameVO userNameVO;
	@OneToOne
	@JoinColumn(name = "authorization_type_name")
	private AuthorizationTypeVO type;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHostReference() {
		return hostReference;
	}

	public void setHostReference(String hostReference) {
		this.hostReference = hostReference;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserNameVO getUserNameVO() {
		return userNameVO;
	}

	public void setUserNameVO(UserNameVO userNameVO) {
		this.userNameVO = userNameVO;
	}

	public AuthorizationTypeVO getType() {
		return type;
	}

	public void setType(AuthorizationTypeVO type) {
		this.type = type;
	}
}
