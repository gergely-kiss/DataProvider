package uk.gergely.kiss.data.provider.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.gergely.kiss.data.provider.rest.api.resources.APIConstants;
import uk.gergely.kiss.data.provider.rest.api.service.UserAPIService;

@Controller
@RequestMapping(path=APIConstants.USER_PATH)
public class UserAPI {
		
	@Autowired
	private UserAPIService userAPIService;
	
}
