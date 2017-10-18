package base.graphql;

import base.model.User;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Adam Scherer
 * @since 1.0
 */
@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private base.repository.UserRepository userRepository;

    public List<User> users() {
        return userRepository.findAll();
    }

    public User user(long id) {
        return userRepository.findOne(id);
    }
}
