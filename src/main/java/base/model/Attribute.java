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
public class Attribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String label;

    @NotNull
    private String internalName;

    private String description;

    @NotNull
    @Enumerated(EnumType.STRING)
    private FieldType fieldType;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "group_id")
    private AttributeGroup attributeGroup;
}