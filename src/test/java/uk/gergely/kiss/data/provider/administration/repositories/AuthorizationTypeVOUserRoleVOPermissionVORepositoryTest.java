package uk.gergely.kiss.data.provider.administration.repositories;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import uk.gergely.kiss.data.provider.administration.model.AuthorizationTypeVOUserRoleVOPermissionVO;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AuthorizationTypeVOUserRoleVOPermissionVORepositoryTest {
	@Autowired
	private AuthorizationTypeVOUserRoleVOPermissionVORepository authorizationTypeVOUserRoleVOPermissionVORepository;

	@Test
	public void isDefaultExist() {
		List<AuthorizationTypeVOUserRoleVOPermissionVO> list = (List<AuthorizationTypeVOUserRoleVOPermissionVO>) authorizationTypeVOUserRoleVOPermissionVORepository
				.findAll();
		Assert.assertTrue(list.size() > 0);
	}
}
