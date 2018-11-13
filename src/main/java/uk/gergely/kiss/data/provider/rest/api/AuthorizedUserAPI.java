package uk.gergely.kiss.data.provider.rest.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.gergely.kiss.data.provider.model.administration.util.model.AuthorizedUser;
import uk.gergely.kiss.data.provider.rest.api.resources.APIConstants;
import uk.gergely.kiss.data.provider.service.administration.AuthorizedUserService;

@Controller
@RequestMapping(path = APIConstants.AUTHORIZED_USER_PATH)
public class AuthorizedUserAPI {
	@Autowired
	AuthorizedUserService service;

	@GetMapping
	public List<AuthorizedUser> getAuthorizedUser() {
		return service.getAuthorizedUserList();
	}
}
