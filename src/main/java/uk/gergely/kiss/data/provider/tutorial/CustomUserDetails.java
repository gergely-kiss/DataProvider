package uk.gergely.kiss.data.provider.tutorial;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@SuppressWarnings("serial")
public class CustomUserDetails implements UserDetails {

	private String userName;
	private String password;
	Collection<? extends GrantedAuthority> authories;

	public CustomUserDetails(TutUser tutUser) {
		this.userName = tutUser.getUn();
		this.password = tutUser.getPw();
		List<GrantedAuthority> authList = new ArrayList<>();
		
		for (TutRole trole : tutUser.getTutRoles()) {
			authList.add(new SimpleGrantedAuthority(trole.getName().toUpperCase()));
		}
		this.authories = authList;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authories;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
