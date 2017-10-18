package base.graphql;

import lombok.Data;

/**
 *
 * @author Adam Scherer
 * @since 1.0
 */
@Data
public class UserInput {

    private String userId;

    private String firstName;

    private String lastName;
}