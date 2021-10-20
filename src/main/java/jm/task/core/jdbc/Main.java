package jm.task.core.jdbc;

//import com.mysql.fabric.jdbc.FabricMySQLDriver;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        UserDaoJDBCImpl userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();
        userDao.saveUser("Vasya", "Puking", (byte) 99);
        userDao.saveUser("Volodya", "Putking", (byte) 69);
        userDao.saveUser("Volondya", "Demordking", (byte) 96);
        userDao.saveUser("And", "Other", (byte) 66);

        for (User user : userDao.getAllUsers()) {
            System.out.println(user.toString());
        }

        userDao.cleanUsersTable();
        userDao.dropUsersTable();


    }
}
