package com.liugh;

import com.liugh.bean.User;
import com.liugh.mapper.UserMapper;
import com.liugh.sqlSession.MySqlsession;

/**
 * @author: yiqq
 * @date: 2019/2/18
 * @description:
 */
public class TestMybatis {
    public static void main(String[] args) {
        MySqlsession sqlsession=new MySqlsession();
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);
        User user = mapper.getUserById("1");
        System.out.println(user);
    }
}
