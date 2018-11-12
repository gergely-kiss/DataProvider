package uk.gergely.kiss.data.provider.repositories.administration;
import org.springframework.data.repository.CrudRepository;
import uk.gergely.kiss.data.provider.model.administration.AuthorizedUserVO;
public interface AuthorizedUserVORepository extends CrudRepository<AuthorizedUserVO, Integer>{

}
