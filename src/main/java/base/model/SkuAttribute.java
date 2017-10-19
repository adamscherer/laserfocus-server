package base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Adam Scherer
 * @since 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SkuAttribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private long skuId;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "attribute_id")
    private Attribute attribute;

    @NotNull
    private String value;

}