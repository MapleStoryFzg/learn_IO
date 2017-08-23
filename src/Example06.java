/**
 * Created by minlc on 2017/8/14.
 */
public class Example06 {
    public static void main(String[] args) {
        Car benz = new Car("Benz");
        System.out.println("包装前");
        benz.show();
        System.out.println("包装后");
        RadarCar decoratedCar_benz = new RadarCar(benz);
        decoratedCar_benz.show();
    }
}

class Car{
    private String carName;
    public Car(String carName){
        this.carName = carName;
    }
    public void show(){
        System.out.println("我是" + carName + "具有基本功能");
    }
}

class RadarCar{
    public Car mycar;
    public RadarCar(Car mycar){
        this.mycar = mycar;
    }
    public void show(){
        mycar.show();
        System.out.println("具有倒车雷达功能");
    }
}