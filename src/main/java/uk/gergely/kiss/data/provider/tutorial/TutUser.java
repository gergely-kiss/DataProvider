package uk.gergely.kiss.data.provider.tutorial;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class TutUser {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String un;
	private String pw;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<TutRole> tutRoles;

	public TutUser() {
	}

	public TutUser(String un, String pw, List<TutRole> tutRoles) {
		super();
		this.un = un;
		this.pw = pw;
		this.tutRoles = tutRoles;
	}

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public List<TutRole> getTutRoles() {
		return tutRoles;
	}

	public void setTutRoles(List<TutRole> tutRoles) {
		this.tutRoles = tutRoles;
	}

}
