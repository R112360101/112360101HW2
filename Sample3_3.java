package CH3;

public class Sample3_3
{
    public static void main(String[] args)
    {
        // 建立新物件 (car1)
        Car car1;
        car1 = new Car();

        // 指定車號和汽油量
        car1.num = 1234;
        car1.gas = 20.5;

        // 建立新物件 (car2)
        Car car2;
        car2 = new Car();

        // 指定車號和汽油量
        car2.num = 2345;
        car2.gas = 30.5;

        System.out.println("car1車號是" + car1.num);
        System.out.println("car1汽油量是" + car1.gas);

        System.out.println("car2車號是" + car2.num);
        System.out.println("car2汽油量是" + car2.gas);
    }
}

// Car類別
class Car
{
    int num;
    double gas;
}
