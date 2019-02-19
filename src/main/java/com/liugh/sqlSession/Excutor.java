package com.liugh.sqlSession;

/**
 * @author: yiqq
 * @date: 2019/2/18
 * @description:
 */
public interface Excutor {
    public <T> T query(String statement,Object parameter);
}
