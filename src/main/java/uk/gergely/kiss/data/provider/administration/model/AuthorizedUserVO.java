package uk.gergely.kiss.data.provider.administration.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/**
 * Value object to store authorized users
 * @author kiss-
 *
 */
@Entity
@Table(name = "authorized_users")
public class AuthorizedUserVO {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name = "host_reference")
	private String hostReference;
	private String salt;
	private String password;

	@OneToOne
	@JoinColumn(name = "id")
	private UserNameVO userNameVO;
	@OneToOne
	@JoinColumn(name = "id")
	private AuthorizationTypeVO authorizationTypeVO;
	
	

	/**
	 * 
	 */
	public AuthorizedUserVO() {
	}

	/**
	 * @param id
	 * @param hostReference
	 * @param salt
	 * @param password
	 * @param userNameVO
	 * @param authorizationTypeVO
	 */
	
	
	public AuthorizedUserVO(Integer id, String hostReference, String salt, String password, UserNameVO userNameVO,
			AuthorizationTypeVO authorizationTypeVO) {
		this.id = id;
		this.hostReference = hostReference;
		this.salt = salt;
		this.password = password;
		this.userNameVO = userNameVO;
		this.authorizationTypeVO = authorizationTypeVO;
	}

	/**
	 * @param id
	 * @param salt
	 * @param password
	 * @param userNameVO
	 * @param authorizationTypeVO
	 */
	public AuthorizedUserVO(Integer id, String salt, String password, UserNameVO userNameVO,
			AuthorizationTypeVO authorizationTypeVO) {
		this.id = id;
		this.salt = salt;
		this.password = password;
		this.userNameVO = userNameVO;
		this.authorizationTypeVO = authorizationTypeVO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AuthorizedUserVO [id=");
		builder.append(id);
		builder.append(", hostReference=");
		builder.append(hostReference);
		builder.append(", salt=");
		builder.append(salt);
		builder.append(", password=");
		builder.append(password);
		builder.append(", userNameVO=");
		builder.append(userNameVO);
		builder.append(", authorizationTypeVO=");
		builder.append(authorizationTypeVO);
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
		return Objects.hash(authorizationTypeVO, hostReference, id, password, salt, userNameVO);
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
		if (!(obj instanceof AuthorizedUserVO)) {
			return false;
		}
		AuthorizedUserVO other = (AuthorizedUserVO) obj;
		return Objects.equals(authorizationTypeVO, other.authorizationTypeVO)
				&& Objects.equals(hostReference, other.hostReference) && Objects.equals(id, other.id)
				&& Objects.equals(password, other.password) && Objects.equals(salt, other.salt)
				&& Objects.equals(userNameVO, other.userNameVO);
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
	 * @return the hostReference
	 */
	public String getHostReference() {
		return hostReference;
	}

	/**
	 * @param hostReference the hostReference to set
	 */
	public void setHostReference(String hostReference) {
		this.hostReference = hostReference;
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
	 * @return the userNameVO
	 */
	public UserNameVO getUserNameVO() {
		return userNameVO;
	}

	/**
	 * @param userNameVO the userNameVO to set
	 */
	public void setUserNameVO(UserNameVO userNameVO) {
		this.userNameVO = userNameVO;
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

}
