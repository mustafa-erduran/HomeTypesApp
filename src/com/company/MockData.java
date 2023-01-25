package com.company;

import java.util.Arrays;
import java.util.List;

public class MockData {

    private Home home1 = new Home(1000.0,58.0,1,1);
    private Home home2 = new Home(2000.0,90.0,2,1);
    private Home home3 = new Home(3000.0,178.35,3,1);
    private Home home4 = new Home(8649.32,352.45,6,4);

    private Villa villa1 = new Villa(12345.99,500.0,8,4);
    private Villa villa2 = new Villa(2356.78,547.78,9,6);
    private Villa villa3 = new Villa(23567.78,750.33,12,6);
    private Villa villa4 = new Villa(8888.67,710.3,5,2);

    private SummerHouse summerHouse1 = new SummerHouse(6665.0,300.0,4,2);
    private SummerHouse summerHouse2 = new SummerHouse(5555.0,677.0,5,2);
    private SummerHouse summerHouse3 = new SummerHouse(8586.0,888.0,7,3);
    private SummerHouse summerHouse4 = new SummerHouse(15999.0,999.9,10,5);

    private List<Home> homeList = Arrays.asList(home1,home2,home3,home4);
    private List<Villa> villaList = Arrays.asList(villa1,villa2,villa3,villa4);
    private List<SummerHouse> summerHouseList = Arrays.asList(summerHouse1,summerHouse2,summerHouse3,summerHouse4);

    public List<Home> getHomeList() {
        return homeList;
    }

    public List<Villa> getVillaList() {
        return villaList;
    }

    public List<SummerHouse> getSummerHouseList() {
        return summerHouseList;
    }


}
