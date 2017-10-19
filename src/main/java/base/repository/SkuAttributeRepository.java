package base.repository;

import base.model.SkuAttribute;
import base.model.SkuEntity;
import base.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 *
 * @author Adam Scherer
 * @since 1.0
 */
public interface SkuAttributeRepository extends JpaRepository<SkuAttribute, Long> {

    List<SkuAttribute> findBySkuId(@Param("skuId") long skuId);
}
