
public class Main {

    public static void main(String[] args) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        Thing brick;
        Suitcase brickCase;

        for (int i = 1; i <= 100; i++) {
            brickCase = new Suitcase(i);
            brick = new Thing("Brick", i);
            brickCase.addThing(brick);

            container.addSuitcase(brickCase);
            
        }
    }
}
