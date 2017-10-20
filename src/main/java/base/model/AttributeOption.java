package base.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 *
 * @author Adam Scherer
 * @since 1.0
 */
@Getter
@Setter
public class AttributeOption {

    @NotNull
    private String label;

    @NotNull
    private String value;

}