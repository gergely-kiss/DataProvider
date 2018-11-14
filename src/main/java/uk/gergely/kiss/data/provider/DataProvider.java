package uk.gergely.kiss.data.provider;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataProvider 
{
	public static final Logger LOGGER = Logger.getLogger(String.valueOf(DataProvider.class));
    public static void main( String[] args )
    {
        SpringApplication.run(DataProvider.class, args);
    }
}
