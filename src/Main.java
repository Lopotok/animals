import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        List<String> lines = FileReader.fileReadHandler("res/dog.txt");
        for (String line: lines) {
            String[] linaAsArray = line.split(",");

            dogs.add(new Dog(linaAsArray[0],
                    Integer.parseInt(linaAsArray[1]),
                    (linaAsArray[2])));
        }

        for (var actual:dogs) {
            System.out.println(actual);
        }

        List<Chicken> chickens = new ArrayList<>();
        List<String> liness = FileReader.fileReadHandler("res/chicken.txt");
        for (String line: liness) {
            String[] linaAsArray = line.split(",");

            chickens.add(new Chicken((int) Double.parseDouble(linaAsArray[0]),
                    Double.parseDouble(linaAsArray[1])));

        }

        for (var actual:chickens) {
            System.out.println(actual);
        }
        List<Animal> animals = new ArrayList<>();
        List<String> linesss = FileReader.fileReadHandler("res/dog.txt");
        for (String line: lines) {
            String[] linaAsArray = line.split(",");

            dogs.add(new Dog(linaAsArray[0],
                    Integer.parseInt(linaAsArray[1]),
                    (linaAsArray[2])));
        }

        for (var actual:dogs) {
            System.out.println(actual);
        }
    }

}


