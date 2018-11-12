package uk.gergely.kiss.data.provider.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import uk.gergely.kiss.data.provider.model.administration.UserVO;
import uk.gergely.kiss.data.provider.repositories.administration.UserVORepository;
import uk.gergely.kiss.data.provider.rest.api.resources.APIConstants;

@Controller
@RequestMapping(path=APIConstants.USER_PATH)
public class UserAPI {
		
	@Autowired
	private UserVORepository userRepository;
	
	@PostMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewUser (@RequestParam String name
			, @RequestParam String email) {
		UserVO n = new UserVO();
		userRepository.save(n);
		return "Saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<UserVO> getAllUsers() {
		return userRepository.findAll();
	}

}
