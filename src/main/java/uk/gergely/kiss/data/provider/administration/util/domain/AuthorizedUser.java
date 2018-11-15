package uk.gergely.kiss.data.provider.administration.util.domain;

import java.util.Objects;

public class AuthorizedUser {

	private String id;
	private String salt;
	private String password;
	private String userName;
	private AuthorizationType type;
	
	/**
	 * 
	 */
	public AuthorizedUser() {
	}
	/**
	 * @param id
	 * @param salt
	 * @param password
	 * @param userName
	 * @param type
	 */
	public AuthorizedUser(String id, String salt, String password, String userName, AuthorizationType type) {
		this.id = id;
		this.salt = salt;
		this.password = password;
		this.userName = userName;
		this.type = type;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AuthorizedUser [id=");
		builder.append(id);
		builder.append(", salt=");
		builder.append(salt);
		builder.append(", password=");
		builder.append(password);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", type=");
		builder.append(type);
		builder.append("]");
		return builder.toString();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(id, password, salt, type, userName);
	}
	/* (non-Javadoc)
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
		if (!(obj instanceof AuthorizedUser)) {
			return false;
		}
		AuthorizedUser other = (AuthorizedUser) obj;
		return Objects.equals(id, other.id) && Objects.equals(password, other.password)
				&& Objects.equals(salt, other.salt) && Objects.equals(type, other.type)
				&& Objects.equals(userName, other.userName);
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the salt
	 */
	public String getSalt() {
		return salt;
	}
	/**
	 * @param salt the salt to set
	 */
	public void setSalt(String salt) {
		this.salt = salt;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the type
	 */
	public AuthorizationType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(AuthorizationType type) {
		this.type = type;
	}
}
