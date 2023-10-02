package isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args){
        Chargeable laptop = new Laptop();
        ((Laptop) laptop).setBatteryLevel(0);
        laptop.charge(30);
        System.out.println(laptop.getBatteryLevel());

        Chargeable smartPhone = new SmartPhone();
        smartPhone.charge(30);
        System.out.println(smartPhone.getBatteryLevel());

        Chargeable smartWatch = new SmartWatch();
        smartWatch.charge(30);
        System.out.println(smartWatch.getBatteryLevel());
    }
}
