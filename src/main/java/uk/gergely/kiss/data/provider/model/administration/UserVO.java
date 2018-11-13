package uk.gergely.kiss.data.provider.model.administration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = { "host_reference" }))
public class UserVO {

	@Id
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
	
	
}
