package uk.gergely.kiss.data.provider.administration.repositories;
import org.springframework.data.repository.CrudRepository;

import uk.gergely.kiss.data.provider.administration.model.UserVO;;
public interface UserVORepository extends CrudRepository<UserVO, Integer>{

	UserVO findUserByHostReference(String hostReference);

}
