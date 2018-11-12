package uk.gergely.kiss.data.provider.repositories.administration;
import org.springframework.data.repository.CrudRepository;

import uk.gergely.kiss.data.provider.model.administration.UserVO;;
public interface UserRepository extends CrudRepository<UserVO, Integer>{

}
