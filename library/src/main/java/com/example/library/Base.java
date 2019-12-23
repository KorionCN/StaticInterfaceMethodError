package com.example.library;

/**
 * @author chenyinying
 * @date 2019-12-23
 */
public interface Base {

    void test();

    static Base create(){
        return new BaseImpl();
    }
}
