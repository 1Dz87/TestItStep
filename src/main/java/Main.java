import model.CaffeeHall;
import model.Hall;

public class Main {

    public static void main(String[] args) {
        Menu menuOne = new Menu();
        Menu menuTwo = new Menu();
        CaffeeHall caffeeHall = new HallOne(menuOne);
        CaffeeHall caffeeHallTwo = new HellTwo(menuTwo);
        menuOne.setCaffeeHall(caffeeHall);
        menuTwo.setCaffeeHall(caffeeHallTwo);
    }
}
