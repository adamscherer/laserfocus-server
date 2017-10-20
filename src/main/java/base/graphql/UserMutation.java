package base.graphql;

import base.model.User;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Adam Scherer
 * @since 1.0
 */
@Component
public class UserMutation implements GraphQLMutationResolver {

    private static final ModelMapper modelMapper = new ModelMapper();

    @PostConstruct
    public void init() {
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
    }

    @Autowired
    private base.repository.UserRepository userRepository;

    public User createUser(UserInput input) {
        User user = modelMapper.map(input, User.class);

        return userRepository.save(user);
    }

    public User updateUser(long userId, UserInput input) {
        User user = userRepository.findOne(userId);
        if (user == null) {
            return null;
        }

        modelMapper.map(input, user);

        return userRepository.save(user);
    }
}
