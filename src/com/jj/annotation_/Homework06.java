package com.jj.annotation_;

/**
 * @author: 徐杰
 * @description:
 * @dateTime: 2024/3/4 22:33
 * @return
 **/
public class Homework06 {
    public static void main(String[] args) {
        Person person = new Person("唐僧", new Horse());
        person.passRiver();
        person.common();
        person.passMountain();
    }
}

interface Vehicles {
    void work();
}

class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("正常状态骑马\t");

    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("遇到大河坐船\t");
    }
}
class Plane implements Vehicles{

    @Override
    public void work() {
        System.out.println("过火焰山坐飞机");
    }
}

class VehicleFactory {
    private static Horse horse = new Horse();

    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }
    public static Plane getPlane() {
        return new Plane();
    }

    private VehicleFactory() {
    }
}

class Person {
    public String name;
    public Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    /**
     * 优化
     * 如何不浪费在构建对象时，传入的交通工具对象
     */
    public void passRiver() {
//        if(vehicles instanceof Boat){
//            vehicles.work();
//        }else{
//            Boat boat = VehicleFactory.getBoat();
//            boat.work();
//        }
        if (!(vehicles instanceof Boat)) {
            vehicles = VehicleFactory.getBoat();
        }
        vehicles.work();

    }

    public void common() {
        //判断一下，当前的vehicle是否就是需要的
//        if (vehicles instanceof Horse) {
//            vehicles.work();
//        } else {
//            Horse horse = VehicleFactory.getHorse();
//            horse.work();
//        }
        if (!(vehicles instanceof Horse)) {
            vehicles = VehicleFactory.getHorse();
        }
        vehicles.work();
    }
    public void passMountain(){
        if (!(vehicles instanceof Plane)) {
            vehicles = VehicleFactory.getPlane();
        }
        vehicles.work();
    }
}


