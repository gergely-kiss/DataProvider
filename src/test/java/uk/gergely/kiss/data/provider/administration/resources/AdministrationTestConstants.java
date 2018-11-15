package uk.gergely.kiss.data.provider.administration.resources;

import uk.gergely.kiss.data.provider.administration.model.AuthorizationTypeVO;
import uk.gergely.kiss.data.provider.administration.model.AuthorizationTypeVOUserRoleVOPermissionVO;
import uk.gergely.kiss.data.provider.administration.model.AuthorizedUserVO;
import uk.gergely.kiss.data.provider.administration.model.UserNameVO;
import uk.gergely.kiss.data.provider.administration.model.UserRoleVO;

public class AdministrationTestConstants {

	public static final String TEST_USER_ROLE_VO_NAME = "TEST_ROLE_NAME";
	public static final Integer TEST_USER_ROLE_VO_ID = 9;
	public static final String DEFAULT_USER_ROLE_VO_NAME = "ALL";
	public static final Integer DEFAULT_USER_ROLE_VO_ID = 1;
	public static final UserRoleVO TEST_USER_ROLE_VO = new UserRoleVO(TEST_USER_ROLE_VO_ID, TEST_USER_ROLE_VO_NAME);
	public static final UserRoleVO DEFAULT_USER_ROLE_VO = new UserRoleVO(DEFAULT_USER_ROLE_VO_ID,
			DEFAULT_USER_ROLE_VO_NAME);

	public static final String TEST_AUTHORIZATION_TYPE_VO_NAME = "TEST_AUTHORIZATION_TYPE_NAME";
	public static final String TEST_AUTHORIZATION_TYPE_VO_DESCRIPTION = "TEST_AUTHORIZATION_TYPE_VO_DESCRIPTION";
	public static final Integer TEST_AUTHORIZATION_TYPE_VO_ID = 9;
	public static final String DEFAULT_AUTHORIZATION_TYPE_VO_NAME = "SUPERUSER";
	public static final String DEFAULT_AUTHORIZATION_TYPE_VO_DESCRIPTION = "Authorization for everything";
	public static final Integer DEFAULT_AUTHORIZATION_TYPE_VO_ID = 1;
	public static final AuthorizationTypeVO TEST_AUTHORIZATION_TYPE_VO = new AuthorizationTypeVO(
			TEST_AUTHORIZATION_TYPE_VO_ID, TEST_USER_ROLE_VO_NAME, TEST_AUTHORIZATION_TYPE_VO_DESCRIPTION);
	public static final AuthorizationTypeVO DEFAULT_AUTHORIZATION_TYPE_VO = new AuthorizationTypeVO(
			DEFAULT_AUTHORIZATION_TYPE_VO_ID, DEFAULT_AUTHORIZATION_TYPE_VO_NAME,
			DEFAULT_AUTHORIZATION_TYPE_VO_DESCRIPTION);

	public static final Integer TEST_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO_ID = 9;
	public static final Integer DEFAULT_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO_ID = 1;
	public static final String TEST_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO_NAME = "TEST_NAME";
	public static final String DEFAULT_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO_NAME = "ANY";
	public static final AuthorizationTypeVOUserRoleVOPermissionVO DEFAULT_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO = new AuthorizationTypeVOUserRoleVOPermissionVO(
			DEFAULT_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO_ID, DEFAULT_AUTHORIZATION_TYPE_VO,
			DEFAULT_USER_ROLE_VO, DEFAULT_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO_NAME);
	public static final AuthorizationTypeVOUserRoleVOPermissionVO TEST_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO = new AuthorizationTypeVOUserRoleVOPermissionVO(
			TEST_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO_ID, TEST_AUTHORIZATION_TYPE_VO, TEST_USER_ROLE_VO,
			TEST_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO_NAME);

	public static final Integer TEST_USER_NAME_VO_ID = 9;
	public static final String TEST_USER_NAME_VO_HOST_REFERENCE = "0987654321asdfghjkl";
	public static final String TEST_USER_NAME_VO_NAME = "TEST_USER_NAME";
	public static final Integer DEFAULT_USER_NAME_VO_ID = 1;
	public static final String DEFAULT_USER_NAME_VO_HOST_REFERENCE = "1234567890_Superuser";
	public static final String DEFAULT_USER_NAME_VO_NAME = "Superuser";
	public static final UserNameVO TEST_USER_NAME_VO = new UserNameVO(TEST_USER_NAME_VO_ID,
			TEST_USER_NAME_VO_HOST_REFERENCE, TEST_USER_NAME_VO_NAME);
	public static final UserNameVO DEFAULT_USER_NAME_VO = new UserNameVO(DEFAULT_USER_NAME_VO_ID,
			DEFAULT_USER_NAME_VO_HOST_REFERENCE, DEFAULT_USER_NAME_VO_NAME);

	public static final String TEST_AUTHORIZED_USER_VO_HOST_REFERENCE = "0987654321asdfghjkl";
	public static final Integer TEST_AUTHORIZED_USER_VO_ID = 9;
	public static final String TEST_AUTHORIZED_USER_VO_SALT = "9876asdf";
	public static final String TEST_AUTHORIZED_USER_VO_PASSWORD = "9876asdf0987654321asdfghjkl";
	public static final AuthorizedUserVO TEST_AUTHORIZED_USER_VO = new AuthorizedUserVO(TEST_AUTHORIZED_USER_VO_ID,
			TEST_AUTHORIZED_USER_VO_HOST_REFERENCE, TEST_AUTHORIZED_USER_VO_SALT, TEST_AUTHORIZED_USER_VO_PASSWORD,
			TEST_USER_NAME_VO, TEST_AUTHORIZATION_TYPE_VO);
	public static final String DEFAULT_AUTHORIZED_USER_VO_HOST_REFERENCE = "1234567890_Superuser";
	public static final Integer DEFAULT_AUTHORIZED_USER_VO_ID = 1;
	public static final String DEFAULT_AUTHORIZED_USER_VO_SALT = "1234567890";
	public static final String DEFAULT_AUTHORIZED_USER_VO_PASSWORD = "SUPERPASSWORD";
	public static final AuthorizedUserVO DEFAULT_AUTHORIZED_USER_VO = new AuthorizedUserVO(
			DEFAULT_AUTHORIZED_USER_VO_ID, DEFAULT_AUTHORIZED_USER_VO_HOST_REFERENCE, DEFAULT_AUTHORIZED_USER_VO_SALT,
			DEFAULT_AUTHORIZED_USER_VO_PASSWORD, DEFAULT_USER_NAME_VO, DEFAULT_AUTHORIZATION_TYPE_VO);
	
	//public static final UserRoleVO[] DEFAULT_USER_ROLES = {new UserRoleVO(1, "SUPERUSER"),new UserRoleVO(2, "AUTHORIZATION"),new UserRoleVO(3, "USER")};
}
