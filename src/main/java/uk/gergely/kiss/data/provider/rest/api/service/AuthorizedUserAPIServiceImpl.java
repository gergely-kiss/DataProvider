package uk.gergely.kiss.data.provider.rest.api.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.gergely.kiss.data.provider.model.administration.util.model.AuthorizedUser;
import uk.gergely.kiss.data.provider.service.administration.AuthorizedUserService;

@Service
public class AuthorizedUserAPIServiceImpl implements AuthorizedUserAPIService {
	Logger LOGGER = Logger.getLogger(String.valueOf(AuthorizedUserAPIService.class));

	@Autowired
	AuthorizedUserService authorizedUserService;

	@Override
	public List<AuthorizedUser> getAllAuthorizedUser() {
		LOGGER.info("getAllAuthorizedUser called");
		List<AuthorizedUser> authorizedUserList = authorizedUserService.getAuthorizedUserList();
		LOGGER.info("getAllAuthorizedUser : " + authorizedUserList.toString());
		return authorizedUserList;
	}
}
