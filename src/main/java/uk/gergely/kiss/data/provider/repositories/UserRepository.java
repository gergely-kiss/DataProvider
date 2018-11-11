package uk.gergely.kiss.data.provider.repositories;
import org.springframework.data.repository.CrudRepository;

import uk.gergely.kiss.data.provider.model.UserVO;;
public interface UserRepository extends CrudRepository<UserVO, Integer>{

}
