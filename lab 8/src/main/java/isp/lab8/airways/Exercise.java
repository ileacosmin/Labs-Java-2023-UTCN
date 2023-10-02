package isp.lab8.airways;

import com.fasterxml.jackson.databind.ObjectMapper;
import examples.files.FilesAndFoldersUtil;

import java.io.IOException;

public class Exercise {
    public static void main(String[] args) throws IOException {
        Route route1 = new Route("LRCL-LROP");
        String workingFolder = "Data\\"+route1.getName();
        ObjectMapper objectMapper = new ObjectMapper();

        FilesAndFoldersUtil.createFolder(workingFolder);

        Waypoint waypoint1 = new Waypoint("TASOD", 47.0548, 23.9212, 10460);
        Waypoint waypoint2 = new Waypoint("LRCL",46.7852,23.6862,415);
        Waypoint waypoint3 = new Waypoint("SOPAV",46.9804, 24.7365, 10900);
        Waypoint waypoint4 = new Waypoint("BIRGU",45.9467, 26.0217, 10200);
        Waypoint waypoint5 = new Waypoint("LROP",44.5711, 26.0858, 106);

        route1.addWaypoint(waypoint1);
        route1.addWaypoint(waypoint2);

        System.out.println(route1.getTotalDistance() + " kilometers");
        Route.displayAllRoutes();
        Route.displayRoute(route1);
        Route route2 = new Route("LRCL-LROO");
        Route.removeRoute(route2);

    }
}
