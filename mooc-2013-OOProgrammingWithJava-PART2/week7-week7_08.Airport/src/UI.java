
import java.util.Scanner;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
/**
 *
 * @author spike
 */
public class UI {

    Flight f;
    Airplane a;
    private Scanner reader = new Scanner(System.in);

    public UI() {
        a = new Airplane();
        f = new Flight();
    }

    public void start() {
        String command = "";
        String id = "";
        int cap = 0;
        String airportD;
        String airportA;
        System.out.println("Airport panel\n"
                + "--------------------\n");
        while (true) {
            System.out.print(
                    "Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit\n"
                    + "> ");
            command = reader.nextLine();
            if (command.equals("1")) {
                System.out.print("Give plane ID: ");
                id = reader.nextLine();
                System.out.print("Give plane capacity: ");
                cap = Integer.parseInt(reader.nextLine());
                a.addPlane(id, cap);
            } else if (command.equals("2")) {
                System.out.print("Give plane ID: ");
                id = reader.nextLine();
                System.out.print("Give departure airport code: ");
                airportD = reader.nextLine();
                System.out.print("Give destination airport code: ");
                airportA = reader.nextLine();
                f.addFlight(airportD, airportA, id);

            } else if (command.equals("x")) {
                System.out.println();
                startNextPanel();

                break;
            }

        }
    }

    public void startNextPanel() {
        String command;
        String id;
        System.out.println("Flight service\n"
                + "------------\n");

        while (true) {
            System.out.print(
                    "Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit\n"
                    + "> "  );
            command = reader.nextLine();
            if (command.equals("1")) {
                a.printPlanes();
            } else if (command.equals("2")) {
                System.out.println();
                f.printFlights(a);
                System.out.println();
            } else if (command.equals("3")) {
                System.out.print("Give plane ID: ");
                id = reader.nextLine();
                System.out.println(a.printPlaneInfo(id));
                System.out.println();
            } else if (command.equals("x")) {
                System.out.println();
                break;
            }

        }
    }

}
