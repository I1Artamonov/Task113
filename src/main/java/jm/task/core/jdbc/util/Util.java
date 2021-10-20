package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    //только настройка соединения с БД (и мб стейтмент, если через него можно сделать все операции)
    private static final String URL = "jdbc:mysql://localhost:3306/schema113?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "vroot";


    public static Connection getConnection() throws SQLException {
        //добавить проверку на уже установленное соединение
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

}