package base.graphql;

import base.model.User;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Adam Scherer
 * @since 1.0
 */
@Component
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private base.repository.UserRepository userRepository;

    public User createUser(UserInput input) {
        User user = new User();
        user.setUserId(input.getUserId());
        user.setFirstName(input.getFirstName());
        user.setLastName(input.getLastName());
        return userRepository.save(user);
    }

    public User updateUser(long userId, UserInput input) {
        User user = userRepository.findOne(userId);
        if (user == null) {
            return null;
        }

        user.setUserId(input.getUserId());
        user.setFirstName(input.getFirstName());
        user.setLastName(input.getLastName());
        return userRepository.save(user);
    }
}
