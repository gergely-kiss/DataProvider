package uk.gergely.kiss.data.provider.model.administration.util.model;

public class AuthorizedUser {

	private String id;
	private String salt;
	private String password;
	private String userName;
	private AuthorizationType type;

	@Override
	public String toString() {
		return new StringBuilder().append("AuthorizedUser: [id=" + id + ", salt=" + salt + ", password=" + password
				+ ", userName=" + userName + ", type=" + type + "]").toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public AuthorizationType getType() {
		return type;
	}

	public void setType(AuthorizationType type) {
		this.type = type;
	}

}
