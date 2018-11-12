package uk.gergely.kiss.data.provider.model.administration;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private List<RoleVO> roleVOList;
	
	@Override
	public String toString() {
		return "AuthorizationTypeVO [id=" + id + ", hostReference=" + hostReference + ", name=" + name + ", roleVOList="
				+ roleVOList + "]";
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
	public List<RoleVO> getRoleVOList() {
		return roleVOList;
	}
	public void setRoleVOList(List<RoleVO> roleVOList) {
		this.roleVOList = roleVOList;
	}

}
