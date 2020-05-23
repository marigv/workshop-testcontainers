import java.util.Arrays;

public class MyPaceApp {

    public static void main(String[] args) {
        System.out.println("App has started");
        System.out.println("Calculating pace [min/km]...");
        int argSize = args.length;
        if (argSize != 4) {
            System.out.println("Wrong amount of arguments, need to be 4. Closing app");
            return;
        }
        Double distance = Double.parseDouble(args[0]);
        String distanceUnit = args[1];
        Double time = Double.parseDouble(args[2]);
        String timeUnit = args[3];
        Double pace = null;

        String[] distanceUnitDefined = {"km", "m"};
        boolean distanceUnitCheck = Arrays.asList(distanceUnitDefined).contains(distanceUnit);
        if (!distanceUnitCheck) {
            System.out.println("Unit is not km or m, should throw an exception instead.");
            return;
        }

        String[] timeUnitDefined = {"min", "s"};
        boolean timeUnitCheck = Arrays.asList(timeUnitDefined).contains(timeUnit);
        if (!timeUnitCheck) {
            System.out.println("Unit is not km or m, should throw an exception instead.");
            return;
        }
        if (distanceUnit.equals("m")) {
            distance = distance/1000; // making "m" to "km"
        }
        if (timeUnit.equals("s")) {
            time = time / 60; // making "s" to "min"
        }
        pace = time / distance;
        int paceMin = (int) Math.floor(pace);
        int paceSec = 0;
        if ((pace - paceMin) != 0) {
            paceSec = (int) Math.floor((pace - paceMin) * 60);
        }
        if (paceSec < 10) {
            System.out.println("Your pace is: " + paceMin + ":0" + paceSec + "/km");
        } else {
            System.out.println("Your pace is: " + paceMin + ":" + paceSec + "/km");
        }
    }
}
