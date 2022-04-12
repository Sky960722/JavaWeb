package com.atguigu.fruit.dao;

import com.atguigu.fruit.pojo.Fruit;

import java.util.List;

public interface FruitDAO {

    List<Fruit> getFruitList(String keyword, Integer pageWeb);

    Fruit getFruitById(Integer fid);

    void updateFruit(Fruit fruit);

    void delFruit(Integer fid);

    void addFruit(Fruit fruit);

    int getFruitCount(String keyword);
}
