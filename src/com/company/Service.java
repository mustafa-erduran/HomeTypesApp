package com.company;

import java.util.stream.Collectors;

public class Service {

    private MockData mockData = new MockData();

    public Double getHomeTotalPrice(){
       return mockData.getHomeList().stream().map(x -> x.getPrice()).reduce(0.0,Double::sum);
    }

    public Double getVillaTotalPrice(){
        return mockData.getVillaList().stream().map(x -> x.getPrice()).reduce(0.0,Double::sum);
    }

    public Double getSummerHouseTotalPrice(){
        return mockData.getSummerHouseList().stream().map(x -> x.getPrice()).reduce(0.0,Double::sum);
    }

    public Double totalPrice(){
        return getHomeTotalPrice() + getVillaTotalPrice() + getSummerHouseTotalPrice();
    }

    public Double calculateAverage(Double sum, int size){
        return sum/size;
    }

    public Double getHomeAverageArea(){
        return calculateAverage(mockData.getHomeList().stream().map(x -> x.getArea()).reduce(0.0,Double::sum),
                                mockData.getHomeList().size());
    }

    public Double getVillaAverageArea(){
        return calculateAverage(mockData.getVillaList().stream().map(x -> x.getArea()).reduce(0.0,Double::sum),
                mockData.getVillaList().size());
    }

    public Double getSummerHouseAverageArea(){
        return calculateAverage(mockData.getSummerHouseList().stream().map(x -> x.getArea()).reduce(0.0,Double::sum),
                mockData.getSummerHouseList().size());
    }

    public Double totalAverageArea(){
        return getHomeAverageArea() + getVillaAverageArea() + getSummerHouseAverageArea();
    }

    public int filterToRoomAndLivingRoom(int room, int livingRoom){
       int homeSize = mockData.getHomeList().stream().filter(c -> c.getRoom() > room && c.getLivingRoom() > livingRoom ).collect(Collectors.toList()).size();
       int villaSize = mockData.getVillaList().stream().filter(c -> c.getRoom() > room && c.getLivingRoom() > livingRoom ).collect(Collectors.toList()).size();
       int summerHouseSize = mockData.getSummerHouseList().stream().filter(c -> c.getRoom() > room && c.getLivingRoom() > livingRoom ).collect(Collectors.toList()).size();
       return homeSize + villaSize + summerHouseSize;
    }



}
