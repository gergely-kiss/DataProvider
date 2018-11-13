package uk.gergely.kiss.data.provider.model.administration.util.model;

public class AuthorizedUser {

	private String hostReference;
	private String salt;
	private String password;
	private String userName;
	private AuthorizationType type;

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
