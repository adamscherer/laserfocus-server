package base.repository;

import base.model.SkuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Adam Scherer
 * @since 1.0
 */
public interface SkuEntityRepository extends JpaRepository<SkuEntity, Long> {

}
