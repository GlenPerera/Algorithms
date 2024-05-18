package Practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class listprac {


    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);
        for (String car : cars) {
            System.out.println(car);
        }

        HashMap<String, String> jeep = new HashMap<>();
        jeep.put("SUV", "Vezel");
        jeep.put("SUV-1", "OutLander");
        jeep.put("original", "Montero");
        jeep.put("original-premium", "Land Cruiser-V8");

        for(String key : jeep.keySet()) {
            System.out.println(key + ": " + jeep.get(key));
        }

    }
}
