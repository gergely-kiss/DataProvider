package uk.gergely.kiss.data.provider.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import uk.gergely.kiss.data.provider.administration.model.AuthorizationTypeVO;
import uk.gergely.kiss.data.provider.administration.resources.AdministrationTestConstants;
import uk.gergely.kiss.data.provider.administration.service.AuthorizationTypeService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AuthorizationTypeServiceTest {

	@Autowired
	private AuthorizationTypeService authorizationTypeService;

	@Test
	public void getAuthorizationTypeById() {

	}
}
