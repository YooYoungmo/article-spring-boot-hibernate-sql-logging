package ymyoo.hibernate.logging.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ymyoo.hibernate.logging.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
