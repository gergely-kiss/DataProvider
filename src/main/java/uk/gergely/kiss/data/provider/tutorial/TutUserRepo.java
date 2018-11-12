package uk.gergely.kiss.data.provider.tutorial;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TutUserRepo extends JpaRepository<TutUser, Long> {
	TutUser findByUn(String un);
}
