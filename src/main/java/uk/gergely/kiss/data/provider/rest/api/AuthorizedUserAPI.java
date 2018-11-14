package uk.gergely.kiss.data.provider.rest.api;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import uk.gergely.kiss.data.provider.administration.util.domain.AuthorizedUser;
import uk.gergely.kiss.data.provider.rest.api.resources.APIConstants;
import uk.gergely.kiss.data.provider.rest.api.service.AuthorizedUserAPIService;

@Controller
@RequestMapping(path = APIConstants.AUTHORIZED_USER_PATH)
public class AuthorizedUserAPI {
	Logger LOGGER = LoggerFactory.getLogger(AuthorizedUserAPI.class);
	@Autowired
	AuthorizedUserAPIService authorizedUserAPIService;

	@GetMapping
	public @ResponseBody List<AuthorizedUser> getAllAuthorizedUsers() {
		LOGGER.info("getAllAuthorizedUsers called");
		List<AuthorizedUser> authorizedUserList = authorizedUserAPIService.getAllAuthorizedUser();
		LOGGER.info("getAllAuthorizedUsers authorizedUserList : {}", authorizedUserList);
		return authorizedUserList;
	}
}
