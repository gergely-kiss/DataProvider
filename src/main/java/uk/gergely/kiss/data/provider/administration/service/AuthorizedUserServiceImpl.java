package uk.gergely.kiss.data.provider.administration.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.gergely.kiss.data.provider.administration.model.AuthorizedUserVO;
import uk.gergely.kiss.data.provider.administration.repositories.AuthorizedUserVORepository;
import uk.gergely.kiss.data.provider.administration.util.AuthorizedUserVOToAuthorizedUserConvertUtil;
import uk.gergely.kiss.data.provider.administration.util.domain.AuthorizedUser;

@Service
public class AuthorizedUserServiceImpl implements AuthorizedUserService {
	@Autowired
	AuthorizedUserVORepository repo;

	@Autowired
	AuthorizedUserVOToAuthorizedUserConvertUtil converter;

	private final static Logger LOGGER = LoggerFactory.getLogger(AuthorizedUserService.class);

	@Override
	public List<AuthorizedUser> getAuthorizedUserList() {
		LOGGER.info("getAuthorizedUserList was called");
		List<AuthorizedUserVO> authorizedUserVOList = (List<AuthorizedUserVO>) repo.findAll();
		LOGGER.info("getAuthorizedUserList: authorizedUserVOList: {} ", authorizedUserVOList);
		List<AuthorizedUser> authorizedUser = converter.convert(authorizedUserVOList);
		return authorizedUser;
	}
}
