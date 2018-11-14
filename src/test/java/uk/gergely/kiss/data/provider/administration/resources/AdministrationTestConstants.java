package uk.gergely.kiss.data.provider.administration.resources;

import uk.gergely.kiss.data.provider.administration.model.AuthorizationTypeVO;
import uk.gergely.kiss.data.provider.administration.model.AuthorizationTypeVOUserRoleVOPermissionVO;
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
	public static final AuthorizationTypeVOUserRoleVOPermissionVO DEFAULT_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO = new AuthorizationTypeVOUserRoleVOPermissionVO();
	public static final AuthorizationTypeVOUserRoleVOPermissionVO TEST__AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO = new AuthorizationTypeVOUserRoleVOPermissionVO();

	/* '1', '1', 'ANY' */

}
