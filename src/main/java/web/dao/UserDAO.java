package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    List<User> index();

    public User show(int id);

    public void save(User user);

    public void update(int id, User user);

    public void delete(int id);
}
