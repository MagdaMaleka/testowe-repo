//to jest komentarz, a to jest dalszy komentarz

public class MarsApplication  {
    public static void main (String[] args){
        MarsRobot spirit = new MarsRobot();

        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;
        spirit.opportunity = "Test";

        spirit.showAttribiutes();

        System.out.println("Zwiekszamy predkosc do 3.");

        spirit.speed = 3;
        spirit.showAttribiutes();

        System.out.println("Zmiana temperatury na -90.");

        spirit.temperature = -90;
        spirit.showAttribiutes();

        System.out.println("Sprawdzenie temperatury");

        spirit.checkTemperature();
        spirit.showAttribiutes();
        spirit.checkStatus();


    }
}

