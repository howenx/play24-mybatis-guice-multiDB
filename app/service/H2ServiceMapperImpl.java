package service;

import domain.User;
import mapper.UserMapper;
import org.mybatis.guice.transactional.Isolation;
import org.mybatis.guice.transactional.Transactional;
import util.CustomException;

import javax.inject.Inject;
import java.util.List;

/**
 * Use Mybatis Mapper, easy.
 * Created by howen on 15/10/23.
 */
@Transactional(isolation = Isolation.SERIALIZABLE, rethrowExceptionsAs= CustomException.class)
public class H2ServiceMapperImpl implements H2Service{

    @Inject
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.all();
    }

    @Override
    public User doSomeBusinessStuff(String userId) {
        return this.userMapper.getUser(userId);
    }

    @Override
    @Transactional(isolation = Isolation.SERIALIZABLE, rethrowExceptionsAs=IllegalArgumentException.class)
    public void brokenInsert(User user) {
        this.userMapper.brokenAdd(user);
    }
}
