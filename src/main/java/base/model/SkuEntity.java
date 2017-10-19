package base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 *
 * @author Adam Scherer
 * @since 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SkuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String name;

    @NotNull
    private Date createdOn;

    @NotNull
    private Date modifiedOn;

}