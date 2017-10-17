package base.repository;

import base.model.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Adam Scherer
 * @since 1.0
 */
public interface AttributeRepository extends JpaRepository<Attribute, Long> {

}
