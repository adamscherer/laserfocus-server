package base.repository;

import base.model.AttributeHistory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Adam Scherer
 * @since 1.0
 */
public interface AttributeHistoryRepository extends JpaRepository<AttributeHistory, Long> {

}
