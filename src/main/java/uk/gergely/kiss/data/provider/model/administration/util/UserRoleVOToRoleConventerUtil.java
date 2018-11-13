package uk.gergely.kiss.data.provider.model.administration.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import uk.gergely.kiss.data.provider.model.administration.UserRoleVO;
import uk.gergely.kiss.data.provider.model.administration.util.model.Role;

@Component
public class UserRoleVOToRoleConventerUtil {

	public Role convert(UserRoleVO userRoleVO) {
		Role role = new Role();
		role.setName(userRoleVO.getName());
		role.setDescription(userRoleVO.getDescription());
		return role;
	}
	
	public List<Role> convert(List<UserRoleVO> userRoleVOList){
		List<Role> roleList = new ArrayList<>();
		for (UserRoleVO userRoleVO : userRoleVOList) {
			roleList.add(convert(userRoleVO));
		}
		return roleList;
	}
}
