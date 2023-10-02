package isp.lab7.safehome;

public class TenantAlreadyExistsException extends Exception{
    public TenantAlreadyExistsException(String message){
        super(message);
    }
}
