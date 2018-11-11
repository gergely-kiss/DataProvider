package uk.gergely.kiss.data.provider.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String hostReference;
	private String firstName;
	private String lastName;
	private String email;
}
