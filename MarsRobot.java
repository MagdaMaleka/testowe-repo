import java.sql.SQLOutput;

public class MarsRobot implements Robot{
    String status;
    int speed;
    float temperature;
    String opportunity;

    public void checkStatus(){
        System.out.println("Biezacy status robota: " + status);
    }
    public void checkTemperature() {
        if (temperature < -80){
            status = "powrot do domu";
            speed = 5;
        }
    }

    void showAttribiutes(){
        System.out.println("Status: " + status);
        System.out.println("Predkosc: " + speed);
        System.out.println("Temperatura: " + temperature);
        System.out.println("Oportunity: " + opportunity);
    }
}
