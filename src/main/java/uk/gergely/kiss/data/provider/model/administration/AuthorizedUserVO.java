package uk.gergely.kiss.data.provider.model.administration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "authorized_users")
public class AuthorizedUserVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@OneToOne
	@JoinColumn(name = "id")
	private UserVO userVO;
	@OneToOne
	@JoinColumn(name = "id")
	private AuthorizationTypeVO type;
	@Column(name = "host_reference")
	private String hostReference;
	@Column(name = "user_name")
	private String userName;
	@Column
	private String salt;
	@Column
	private String password;
	public int getId() {
		return id;
	}
		
	@Override
	public String toString() {
		return "AuthorizedUserVO [id=" + id + ", userVO=" + userVO + ", type=" + type + ", hostReference="
				+ hostReference + ", userName=" + userName + ", salt=" + salt + ", password=" + password + "]";
	}

	public void setId(int id) {
		this.id = id;
	}
	public UserVO getUserVO() {
		return userVO;
	}
	public void setUserVO(UserVO userVO) {
		this.userVO = userVO;
	}
	public AuthorizationTypeVO getType() {
		return type;
	}
	public void setType(AuthorizationTypeVO type) {
		this.type = type;
	}
	public String getHostReference() {
		return hostReference;
	}
	public void setHostReference(String hostReference) {
		this.hostReference = hostReference;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
}
