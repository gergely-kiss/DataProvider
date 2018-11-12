package uk.gergely.kiss.data.provider;

import org.apache.catalina.authenticator.SpnegoAuthenticator.AuthenticateAction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

import uk.gergely.kiss.data.provider.tutorial.TutUserRepo;

@SpringBootApplication
public class DataProvider 
{
    public static void main( String[] args )
    {
        SpringApplication.run(DataProvider.class, args);
    }
    
    public void authenticationManager(AuthenticationManagerBuilder builder, TutUserRepo repo) {
    	builder.userDetailsService(new UserDetailsService())
    }
}
