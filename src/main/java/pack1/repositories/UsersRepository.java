package pack1.repositories;

import org.springframework.data.repository.CrudRepository;
import pack1.entity.User;

/**
 * Created by Timur.Abdykarimov on 19.08.2016.
 */
public interface UsersRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
