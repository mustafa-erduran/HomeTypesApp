package com.company;

public class Main {

    public static void main(String[] args) {

        Service service = new Service();

        System.out.println("Home total price is : " + service.getHomeTotalPrice());
        System.out.println("Villa total price is : " + service.getVillaTotalPrice());
        System.out.println("SummerHouse total price is : " + service.getSummerHouseTotalPrice());
        System.out.println("All Houses total price are : " + service.totalPrice());
        System.out.println();
        System.out.println("Home average area is :" + service.getHomeAverageArea());
        System.out.println("Villa average area is :" + service.getVillaAverageArea());
        System.out.println("SummerHouse average area is :" + service.getSummerHouseAverageArea());
        System.out.println("All houses average area are :" + service.totalAverageArea());
        System.out.println();
        System.out.println("Number of houses greater than 1 room and 2 living room : " + service.filterToRoomAndLivingRoom(1,2));
        System.out.println("Number of houses greater than 2 room and 4 living room : " + service.filterToRoomAndLivingRoom(2,4));
        System.out.println("Number of houses greater than 9 room and 3 living room : " + service.filterToRoomAndLivingRoom(9,3));
        System.out.println("Number of houses greater than 3 room and 3 living room : " + service.filterToRoomAndLivingRoom(3,3));


    }
}
