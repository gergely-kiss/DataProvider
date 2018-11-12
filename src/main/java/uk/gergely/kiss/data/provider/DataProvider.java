package uk.gergely.kiss.data.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

import uk.gergely.kiss.data.provider.tutorial.CustomUserDetails;
import uk.gergely.kiss.data.provider.tutorial.TutUserRepo;


@SpringBootApplication
public class DataProvider {
	public static void main(String[] args) {
		SpringApplication.run(DataProvider.class, args);
	}

	@Autowired
	public void authenticationManager(AuthenticationManagerBuilder builder, TutUserRepo repo) throws Exception {
		builder.userDetailsService(s -> new CustomUserDetails(repo.findByUn(s)));
	}
}
