package isp.lab10.exercise1;

import java.util.ArrayList;

public class ATC {


    public void addAircraft(String id){

        System.out.println("Aircraft with id " + id + " added");
    }

    public void sendCommand(String id, AtcCommand command){
        System.out.println("Aircraft with id " + id + " received command " + command);
    }

    public void showAircrafts(){
        System.out.println("Display aircrfats.");
    }
}

class AtcCommand {
    String command;

    public AtcCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "AtcCommand{" +
                "command='" + command + '\'' +
                '}';
    }
}
