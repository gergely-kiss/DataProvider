package uk.gergely.kiss.data.provider.model.administration;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "authorization_type")
public class AuthorizationTypeVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "host_reference")
	private String hostReference;
	@Column
	private String name;
	@OneToMany
	@JoinColumn(name = "id")
	private List<RoleVO> roleVO;

	@Override
	public String toString() {
		return "AuthorizationTypeVO [id=" + id + ", hostReference=" + hostReference + ", name=" + name + ", roleVO="
				+ roleVO + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHostReference() {
		return hostReference;
	}

	public void setHostReference(String hostReference) {
		this.hostReference = hostReference;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<RoleVO> getRoleVO() {
		return roleVO;
	}

	public void setRoleVO(List<RoleVO> roleVO) {
		this.roleVO = roleVO;
	}
}
