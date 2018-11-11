package uk.gergely.kiss.data.provider.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "authorization_type")
public class AuthorizationTypeVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "host_reference")
	private String hostReference;

	private String name;
	
	@OneToOne
	@JoinColumn(name = "id")
	private RoleVO roleVO;
}
