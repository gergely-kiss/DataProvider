package uk.gergely.kiss.data.provider.administration.util.domain;

import java.util.List;
import java.util.Objects;

public class Role {

	private String name;
	private String description;
	private List<AuthorizationTypeEnumPermissionEnumPair> authorizationTypePermissionPairList;

	
	
	/**
	 * 
	 */
	public Role() {
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AuthorizationType [name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", authorizationTypePermissionPairList=");
		builder.append(authorizationTypePermissionPairList);
		builder.append("]");
		return builder.toString();
	}
	/**
	 * @param name
	 * @param description
	 * @param rolePermissionList
	 */
	public Role(String name, String description, List<AuthorizationTypeEnumPermissionEnumPair> rolePermissionList) {
		this.name = name;
		this.description = description;
		this.authorizationTypePermissionPairList = rolePermissionList;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(description, name, authorizationTypePermissionPairList);
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
		if (!(obj instanceof Role)) {
			return false;
		}
		Role other = (Role) obj;
		return Objects.equals(description, other.description) && Objects.equals(name, other.name)
				&& Objects.equals(authorizationTypePermissionPairList, other.authorizationTypePermissionPairList);
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the authorizationTypePermissionPairList
	 */
	public List<AuthorizationTypeEnumPermissionEnumPair> getAuthorizationTypePermissionPairList() {
		return authorizationTypePermissionPairList;
	}
	/**
	 * @param authorizationTypePermissionPairList the authorizationTypePermissionPairList to set
	 */
	public void setAuthorizationTypePermissionPairList(List<AuthorizationTypeEnumPermissionEnumPair> authorizationTypePermissionPairList) {
		this.authorizationTypePermissionPairList = authorizationTypePermissionPairList;
	};


}
