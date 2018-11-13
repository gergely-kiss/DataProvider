package uk.gergely.kiss.data.provider.model.administration.util.model;

public class RolePermission {

	private String role;
	private String permission;

	@Override
	public String toString() {
		return new StringBuilder().append("RolePermission [role=" + role + ", permission=" + permission + "]")
				.toString();
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

}
