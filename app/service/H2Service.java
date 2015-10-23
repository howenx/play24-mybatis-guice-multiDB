package service;

import domain.User;

import java.util.List;

/**
 *
 * Created by howen on 15/10/23.
 */
public interface H2Service {

    public List<User> getAllUser();

    void brokenInsert(User user);

    User doSomeBusinessStuff(String userId);
}
