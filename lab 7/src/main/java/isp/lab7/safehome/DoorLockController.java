package isp.lab7.safehome;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DoorLockController implements ControllerInterface{

    private Map<Tenant,AccessKey> validAccess= new HashMap<>();
    private ArrayList<AccessLog> accessLogs= new ArrayList<AccessLog>();
    private Door door = new Door();
    private int wrongAttempts=0;

    public DoorLockController() {
        validAccess.put(new Tenant(MASTER_TENANT_NAME), new AccessKey(MASTER_KEY));
    }

    @Override
    public DoorStatus enterPin(String pin) throws Exception {
        String name ="idk";
        if(Objects.equals(pin,ControllerInterface.MASTER_KEY)) wrongAttempts=0;
        if(validAccess.containsValue(new AccessKey(pin))&&wrongAttempts<3)wrongAttempts=0;
        if(wrongAttempts<2) {
            if (validAccess.containsValue(new AccessKey(pin))) {
                for (Map.Entry<Tenant, AccessKey> entry : validAccess.entrySet())
                    if (Objects.equals(entry.getValue(), new AccessKey(pin)))
                        name = entry.getKey().getName();

                if (door.getStatus() == DoorStatus.OPEN) door.lockDoor();
                else door.unlockDoor();
                wrongAttempts = 0;
                accessLogs.add(new AccessLog(name, "enterPin", door.getStatus(), ""));
                return door.getStatus();

            } else {
                accessLogs.add(new AccessLog(name, "enterPin", door.getStatus(), "InvalidPinException"));
                wrongAttempts++;
                throw new InvalidPinException("Wrong pin");
            }
        }
        else {
            accessLogs.add(new AccessLog(name, "enterPin", door.getStatus(), "TooManyAttemptsException"));
            wrongAttempts ++;
            throw new TooManyAttemptsException("Too many attempts");
        }
    }

    @Override
    public void addTenant(String pin, String name) throws Exception {
        Tenant t = new Tenant(name);
        if(validAccess.containsKey(t)) throw new TenantAlreadyExistsException("TenantAlreadyExistsException");
        validAccess.put(new Tenant(name),new AccessKey(pin));
    }

    @Override
    public void removeTenant(String name) throws Exception {
        if (!validAccess.containsKey(new Tenant(name))) throw new TenantNotFoundException("tenant not found");
        validAccess.remove(new Tenant(name));
    }
    public ArrayList<AccessLog> getAccessLogs() {
        return accessLogs;
    }

    public Map<Tenant, AccessKey> getValidAccess() {
        return validAccess;
    }

    @Override
    public String toString() {
        return "DoorLockController{" +
                "validAccess=" + validAccess +
                ", accessLogs=" + accessLogs +
                ", door=" + door +
                ", wrongAttempts=" + wrongAttempts +
                '}';
    }

    public Door getDoor() {
        return door;
    }
    public void showDoorStatus(){
        if(door.getStatus()==DoorStatus.CLOSE){
            System.out.println("Door is closed");
        }
        else System.out.println("Door is open");
    }
}
