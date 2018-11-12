package uk.gergely.kiss.data.provider.model.administration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_roles")
public class RoleVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "host_reference")
	private String hostReference;
	@Column
	private String name;
	@Column
	private String description;
		
	@Override
	public String toString() {
		return "RoleVO [id=" + id + ", hostReference=" + hostReference + ", name=" + name + ", description="
				+ description + "]";
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
