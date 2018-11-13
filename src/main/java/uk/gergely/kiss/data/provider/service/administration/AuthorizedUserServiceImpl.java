package uk.gergely.kiss.data.provider.service.administration;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.gergely.kiss.data.provider.model.administration.AuthorizedUserVO;
import uk.gergely.kiss.data.provider.model.administration.util.AuthorizedUserVOToAuthorizedUserConvertUtil;
import uk.gergely.kiss.data.provider.model.administration.util.model.AuthorizedUser;
import uk.gergely.kiss.data.provider.repositories.administration.AuthorizedUserVORepository;

@Service
public class AuthorizedUserServiceImpl implements AuthorizedUserService {
	@Autowired
	AuthorizedUserVORepository repo;

	@Autowired
	AuthorizedUserVOToAuthorizedUserConvertUtil converter;

	private final static Logger LOGGER = Logger.getLogger(String.valueOf(AuthorizedUserService.class));

	@Override
	public List<AuthorizedUser> getAuthorizedUserList() {
		LOGGER.info("getAuthorizedUserList was called");
		List<AuthorizedUserVO> authorizedUserVOList = (List<AuthorizedUserVO>) repo.findAll();
		LOGGER.info("getAuthorizedUserList: authorizedUserVOList: " + authorizedUserVOList);
		List<AuthorizedUser> authorizedUser= converter.convert(authorizedUserVOList); 
		return authorizedUser;
	}
}
