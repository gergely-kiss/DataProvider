package uk.gergely.kiss.data.provider.administration.resources;

import java.util.Arrays;
import java.util.List;

import uk.gergely.kiss.data.provider.administration.PermissionEnum;
import uk.gergely.kiss.data.provider.administration.AuthorizationTypeEnum;
import uk.gergely.kiss.data.provider.administration.model.UserRoleVO;
import uk.gergely.kiss.data.provider.administration.model.AuthorizationTypeVOUserRoleVOPermissionVO;
import uk.gergely.kiss.data.provider.administration.model.AuthorizedUserVO;
import uk.gergely.kiss.data.provider.administration.model.UserNameVO;
import uk.gergely.kiss.data.provider.administration.model.AuthorizationTypeVO;
import uk.gergely.kiss.data.provider.administration.model.UserVO;
import uk.gergely.kiss.data.provider.administration.util.domain.Role;
import uk.gergely.kiss.data.provider.administration.util.domain.AuthorizedUser;
import uk.gergely.kiss.data.provider.administration.util.domain.AuthorizationTypeEnumPermissionEnumPair;
import uk.gergely.kiss.data.provider.administration.util.domain.User;

public class AdministrationTestConstants {
	public static final Integer FIRST_ID = 1;
	public static final Integer TEST_ID = 9;
	public static final String[] PERMISSION_ENUMS_STRING_VALUES_FOR_ADMINISTRATION = { "ANY", "CREATE", "READ",
			"EXECUTE", "DELETE" };
	public static final String[] AUTHORIZATION_TYPE_ENUMS_STRING_VALUES_FOR_ADMINISTRATION = { "ALL", "AUTHORIZATION", "USER" };
	// Value Objects
	public static final String TEST_AUTHORIZATION_TYPE_ENUM_NAME = "TEST_ROLE_NAME";
	public static final AuthorizationTypeVO TEST_AUTHORIZATION_TYPE_VO = new AuthorizationTypeVO(TEST_AUTHORIZATION_TYPE_ENUM_NAME);

	public static final String TEST_AUTHORIZATION_TYPE_VO_NAME = "TEST_AUTHORIZATION_TYPE_NAME";
	public static final String TEST_AUTHORIZATION_TYPE_VO_DESCRIPTION = "TEST_AUTHORIZATION_TYPE_VO_DESCRIPTION";
	public static final UserRoleVO TEST_USER_ROLE_VO = new UserRoleVO(TEST_AUTHORIZATION_TYPE_ENUM_NAME,
			TEST_AUTHORIZATION_TYPE_VO_DESCRIPTION);
	public static final Integer TEST_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO_ID = TEST_ID;
	public static final String TEST_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO_NAME = "TEST_NAME";
	public static final AuthorizationTypeVOUserRoleVOPermissionVO TEST_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO = new AuthorizationTypeVOUserRoleVOPermissionVO(
			TEST_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO_ID, TEST_USER_ROLE_VO, TEST_AUTHORIZATION_TYPE_VO,
			TEST_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO_NAME);

	public static final Integer TEST_USER_NAME_VO_ID = TEST_ID;
	public static final String TEST_USER_NAME_VO_HOST_REFERENCE = "0987654321asdfghjkl";
	public static final String TEST_USER_NAME_VO_NAME = "TEST_USER_NAME";
	public static final UserNameVO TEST_USER_NAME_VO = new UserNameVO(TEST_USER_NAME_VO_NAME);

	public static final String TEST_AUTHORIZED_USER_VO_HOST_REFERENCE = "0987654321asdfghjkl";
	public static final Integer TEST_AUTHORIZED_USER_VO_ID = TEST_ID;
	public static final String TEST_AUTHORIZED_USER_VO_SALT = "9876asdf";
	public static final String TEST_AUTHORIZED_USER_VO_PASSWORD = "9876asdf0987654321asdfghjkl";
	public static final AuthorizedUserVO TEST_AUTHORIZED_USER_VO = new AuthorizedUserVO(TEST_AUTHORIZED_USER_VO_ID,
			TEST_AUTHORIZED_USER_VO_HOST_REFERENCE, TEST_AUTHORIZED_USER_VO_SALT, TEST_AUTHORIZED_USER_VO_PASSWORD,
			TEST_USER_NAME_VO, TEST_USER_ROLE_VO);

	public static final Integer TEST_USER_VO_ID = FIRST_ID;
	public static final String TEST_USER_VO_HOST_REFERENCE = "hostrefId";
	public static final String TEST_USER_VO_FIRST_NAME = "test_first_name";
	public static final String TEST_USER_VO_LAST_NAME = "test_last_name";
	public static final String TEST_USER_VO_EMAIL = "test_email@test.ts";
	public static final String UPDATE_USER_VO_EMAIL = "update_email@test.ts";
	public static final UserVO TEST_USER_VO = new UserVO(
			TEST_USER_VO_HOST_REFERENCE, TEST_USER_VO_FIRST_NAME,
			TEST_USER_VO_LAST_NAME, TEST_USER_VO_EMAIL, TEST_USER_NAME_VO);
	public static final User TEST_USER = new User(
			TEST_USER_VO_HOST_REFERENCE, TEST_USER_VO_FIRST_NAME,
			TEST_USER_VO_LAST_NAME, TEST_USER_VO_EMAIL, TEST_USER_NAME_VO_NAME);
	// Domain Objects
	public static final PermissionEnum TEST_PERMISSION = PermissionEnum.READ;
	public static final AuthorizationTypeEnum TEST_ROLE = AuthorizationTypeEnum.USER;
	public static final AuthorizationTypeEnumPermissionEnumPair TEST_ROLE_PERMISSION_PAIR = new AuthorizationTypeEnumPermissionEnumPair(TEST_ROLE,
			TEST_PERMISSION);

	private static final String TEST_AUTHORIZATION_NAME = "TEST_AUTHORIZATION_NAME";
	private static final String TEST_AUTHORIZATION_DESCRIPTION = "TEST_AUTHORIZATION_DESCRIPTION";
	private static final List<AuthorizationTypeEnumPermissionEnumPair> TEST_AUTHORIZATION_ROLE_PERMISSION_LIST = Arrays
			.asList(TEST_ROLE_PERMISSION_PAIR);
	public static final Role TEST_AUTHORIZATION_TYPE = new Role(TEST_AUTHORIZATION_NAME,
			TEST_AUTHORIZATION_DESCRIPTION, TEST_AUTHORIZATION_ROLE_PERMISSION_LIST);

	public static final AuthorizedUser TEST_AUTHORIZED_USER = new AuthorizedUser(
			TEST_AUTHORIZED_USER_VO_HOST_REFERENCE, TEST_AUTHORIZED_USER_VO_SALT, TEST_AUTHORIZED_USER_VO_PASSWORD,
			TEST_USER_NAME_VO_NAME, TEST_AUTHORIZATION_TYPE);
	public static final String TEST_USER_NAME_VO_NON_EXISTING = "TEST_USER_NAME_VO_NON_EXISTING";

}
