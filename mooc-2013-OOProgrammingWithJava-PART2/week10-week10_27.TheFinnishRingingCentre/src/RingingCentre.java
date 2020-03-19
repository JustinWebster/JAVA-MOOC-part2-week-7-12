
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
/**
 *
 * @author spike
 */
public class RingingCentre {

    private Map<Bird, List<String>> listOfBirds = new HashMap();

    public void observe(Bird bird, String place) {
        if (!listOfBirds.containsKey(bird)) {
            listOfBirds.put(bird, bird.places);

        }
        for (Bird key : listOfBirds.keySet()) {
            if (key.equals(bird)) {
                key.places.add(place);
            }
        }

    }

    public void observations(Bird bird) {
        int i = 0;
        if (!listOfBirds.containsKey(bird)) {
            listOfBirds.put(bird, bird.places);

        }
        for (Bird key : listOfBirds.keySet()) {//each bird does not have its own list of birds fix this!

            if (key.equals(bird)) {
                System.out.println(bird.toString() + " " + "observations: " + key.places.size());
                while (i < key.places.size()) {

                    System.out.println(key.places.get(i));
                    i++;
                }
            }
        }

    }
}
