package uk.gergely.kiss.data.provider.repositories.administration;
import org.springframework.data.repository.CrudRepository;
import uk.gergely.kiss.data.provider.model.administration.UserRoleVO;
public interface RoleVORepository extends CrudRepository<UserRoleVO, Integer>{

}
