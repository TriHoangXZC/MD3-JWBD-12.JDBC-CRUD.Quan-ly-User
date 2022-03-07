package com.codegym.service;

import com.codegym.dao.IUserDAO;
import com.codegym.model.User;

import java.util.List;

public class UserServiceImpl implements IUserService{
    private IUserDAO userDAO;

    public UserServiceImpl(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> displayAll() {
        return userDAO.displayAll();
    }

    @Override
    public User findById(int id) {
        return userDAO.findById(id);
    }

    @Override
    public boolean create(User user) {
        return userDAO.create(user);
    }

    @Override
    public boolean updateById(int id, User user) {
        return userDAO.updateById(id, user);
    }

    @Override
    public boolean deleteById(int id) {
        return userDAO.deleteById(id);
    }
}
