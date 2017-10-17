package base.repository;

import base.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 *
 * @author Adam Scherer
 * @since 1.0
 */
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByLastName(@Param("lastName") String lastName);
}
