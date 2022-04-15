package com.atguigu.myssm.trans;

import com.atguigu.myssm.basedao.ConnUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class TransactionManager {

    private ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    //开启事务
    public static void beginTrans() throws SQLException {
        Connection conn = ConnUtil.getConn();
        conn.setAutoCommit(false);

    }

    //提交事务
    public static void commit() throws SQLException {

        Connection conn = ConnUtil.getConn();
        conn.commit();
        conn.close();
        ConnUtil.closeConn();


    }

    //回滚事务
    public static void rollback() throws SQLException {

        Connection conn = ConnUtil.getConn();
        conn.rollback();
        ConnUtil.closeConn();
    }
}
