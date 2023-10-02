package isp.lab8.airways;

import com.fasterxml.jackson.databind.ObjectMapper;
import examples.files.FileReadUtil;
import examples.files.FilesAndFoldersUtil;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Route {
    private String name;
    private String path = ".\\src\\main\\java\\isp\\lab8\\airways\\Routes\\";
    private List<Waypoint> waypoints = new ArrayList<>();

    public Route(String name) {
        this.name = name;
        this.path = path + this.name;
        this.createRoute();
    }
    public void createRoute() {
        File theDir = new File(path);
        if (!theDir.exists()){
            theDir.mkdirs();
        }
    }
    public void addWaypoint(Waypoint w1) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new FileWriter(path+"\\"+w1.getIndex()+".json"), w1);
    }
    public double getTotalDistance() throws IOException {
        double distance = 0;
        ObjectMapper objectMapper = new ObjectMapper();
        List<String> files = FilesAndFoldersUtil.getFilesInFolder(this.path);
        if (files.size() < 2) return 0;
        String file = files.get(0);
        String jsonContent = FileReadUtil.readAllFileLines(this.path + "\\" + file).stream().collect( Collectors.joining( "\n" ));
        Waypoint way1 = objectMapper.readValue(jsonContent, Waypoint.class);
        double altitude_dist = 0, total_distance = 0;
        for(int i=1; i<files.size();i++) {
            file = files.get(i);
            jsonContent = FileReadUtil.readAllFileLines(this.path + "\\" + file).stream().collect( Collectors.joining( "\n" ));
            Waypoint way2 = objectMapper.readValue(jsonContent, Waypoint.class);
            distance += WaypointDistanceCalculator.calculateDistance(way1.getLatitude(), way1.getLongitude(), way2.getLatitude(), way2.getLongitude());
            altitude_dist = abs(way1.getAltitude() - way2.getAltitude())/1000.0;
            total_distance += sqrt(distance*distance + altitude_dist*altitude_dist);
            way1 = way2;
        }
        return total_distance;
    }
    public static void displayAllRoutes() {
        System.out.println("Available Routes are:");
        List<String> files = FilesAndFoldersUtil.getFilesInFolder(".\\src\\main\\java\\isp\\lab8\\airways\\Routes");
        int i=1;
        for (String file : files) {
            System.out.println(i++ + ". " + file);
        }
    }
    public static void displayRoute(Route route) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println("Displaying route " + route.getName() + ":");
        List<String> files = FilesAndFoldersUtil.getFilesInFolder(route.getPath());
        for(String file : files) {
            String jsonContent = FileReadUtil.readAllFileLines(route.getPath() + "\\" + file).stream().collect( Collectors.joining( "\n" ));
            Waypoint write = objectMapper.readValue(jsonContent, Waypoint.class);
            System.out.println("    " + write);
        }
        System.out.println("Total Distance: " + route.getTotalDistance() + " kilometers");
    }
    public static void removeRoute(Route route) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<String> files = FilesAndFoldersUtil.getFilesInFolder(route.getPath());
        for(String file : files) {
            String file_path = route.getPath() + "\\" + file;
            new File(file_path).delete();
        }
        new File(route.getPath()).delete();
    }
    public String getName() {
        return name;
    }
    public Route() {
    }
    public String getPath() { return path; }
    @Override
    public String toString() {
        return "Route{" +
                "name='" + name + '\'' +
                ", waypoints=" + waypoints +
                '}';
    }
}
