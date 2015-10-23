package service;

import dao.UserDao;
import domain.User;
import org.mybatis.guice.transactional.Isolation;
import org.mybatis.guice.transactional.Transactional;
import util.CustomException;

import javax.inject.Inject;
import java.util.List;

/**
 * Use sqlsession.
 * Created by howen on 15/10/23.
 */
@Transactional(rethrowExceptionsAs= CustomException.class)
public class H2ServiceDaoImpl implements H2Service{

    @Inject
    private UserDao userDao;

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public User doSomeBusinessStuff(String userId) {
        return this.userDao.getUser(userId);
    }

    @Override
    @Transactional(isolation = Isolation.SERIALIZABLE, rethrowExceptionsAs=IllegalArgumentException.class)
    public void brokenInsert(User user) {
        this.userDao.brokenInsert(user);
    }
}
