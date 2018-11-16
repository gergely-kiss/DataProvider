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
import javax.persistence.UniqueConstraint;

/**
 * Value object to store registered users
 * @author kiss-
 *
 */
@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = { "host_reference" }))
public class UserVO {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(name = "host_reference")
	private String hostReference;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email_address")
	private String email;

	@OneToOne
	@JoinColumn(name = "id")
	private UserNameVO userNameVO;

	
	/**
	 * 
	 */
	public UserVO() {
	}

	/**
	 * @param id
	 * @param hostReference
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param userNameVO
	 */
	public UserVO(String hostReference, String firstName, String lastName, String email,UserNameVO userNameVO) {
		this.hostReference = hostReference;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userNameVO = userNameVO;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserVO [id=");
		builder.append(id);
		builder.append(", hostReference=");
		builder.append(hostReference);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", userNameVO=");
		builder.append(userNameVO);
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
		return Objects.hash(email, firstName, hostReference, id, lastName, userNameVO);
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
		if (!(obj instanceof UserVO)) {
			return false;
		}
		UserVO other = (UserVO) obj;
		return Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(hostReference, other.hostReference) && Objects.equals(id, other.id)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(userNameVO, other.userNameVO);
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
}
