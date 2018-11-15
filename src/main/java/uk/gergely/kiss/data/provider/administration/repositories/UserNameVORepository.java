package uk.gergely.kiss.data.provider.administration.repositories;

import org.springframework.data.repository.CrudRepository;
import uk.gergely.kiss.data.provider.administration.model.UserNameVO;

public interface UserNameVORepository extends CrudRepository<UserNameVO, Integer>{

	public void deleteByUserName(String userName);
	public UserNameVO findByUserName(String userName);

}
