package uk.gergely.kiss.data.provider.model.administration;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "user_names", uniqueConstraints = @UniqueConstraint(columnNames = { "host_reference", "user_name" }))
public class UserNameVO {
	@Id
	private Integer id;
	@Column(name = "host_reference")
	private String hostReference;
	@Column(name = "user_name")
	private String userName;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserNameVO [id=");
		builder.append(id);
		builder.append(", hostReference=");
		builder.append(hostReference);
		builder.append(", userName=");
		builder.append(userName);
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
		return Objects.hash(hostReference, id, userName);
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
		if (!(obj instanceof UserNameVO)) {
			return false;
		}
		UserNameVO other = (UserNameVO) obj;
		return Objects.equals(hostReference, other.hostReference) && Objects.equals(id, other.id)
				&& Objects.equals(userName, other.userName);
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

}
