package uk.gergely.kiss.data.provider.administration.resources;

import uk.gergely.kiss.data.provider.administration.model.UserRoleVO;

public class AdministrationTestConstants {
	
	public static final String TEST_USER_ROLE_NAME = "TEST_ROLE_NAME";
	public static final Integer TEST_USER_ROLE_ID = 9;
	public static final UserRoleVO TEST_USER_ROLE = new UserRoleVO(TEST_USER_ROLE_ID, TEST_USER_ROLE_NAME);
	public static final String DEFAULT_USER_ROLE_NAME = "ALL";
	public static final Integer DEFAULT_USER_ROLE_ID = 1;
	public static final UserRoleVO DEFAULT_USER_ROLE =  new UserRoleVO(DEFAULT_USER_ROLE_ID, DEFAULT_USER_ROLE_NAME);;

}
