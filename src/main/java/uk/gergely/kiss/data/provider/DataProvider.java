package uk.gergely.kiss.data.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataProvider 
{
	public static final Logger LOGGER = LoggerFactory.getLogger(DataProvider.class);
    public static void main( String[] args )
    {
        SpringApplication.run(DataProvider.class, args);
    }
}
