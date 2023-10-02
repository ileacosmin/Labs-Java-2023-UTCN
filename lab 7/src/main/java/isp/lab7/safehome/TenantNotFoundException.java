package isp.lab7.safehome;

public class TenantNotFoundException extends Exception{
    public TenantNotFoundException(String message){
        super(message);
    }
}
