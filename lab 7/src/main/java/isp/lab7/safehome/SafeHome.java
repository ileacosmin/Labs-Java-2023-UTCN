package isp.lab7.safehome;

import java.util.Scanner;

public class SafeHome {
    public  void userInterface() throws Exception {
        boolean option=false;



        ControllerInterface ctrl;
        ctrl=new DoorLockController();

        ctrl.addTenant("123","user");

        System.out.println("1.User");
        System.out.println("2.Admin");

        Scanner scaner=new Scanner(System.in);
        String s=new String();

        s=scaner.nextLine();
        ((DoorLockController) ctrl).showDoorStatus();
        switch (s){
            case "1":
                System.out.println("Enter the lognin info:");
                System.out.println("Username: ");
                String name=scaner.nextLine();
                System.out.println("key: ");
                String key=scaner.nextLine();
                boolean login=false;

                if(((DoorLockController) ctrl).getValidAccess().get(new Tenant((name))).getPin().equals(key))
                        login=true;
                else{
                    System.out.println("user does not exist please contact admin to add user");
                }
                while(login){
                    System.out.println("1. unlock/lock door");
                    System.out.println("2. logout");
                    String c=scaner.nextLine();

                    switch (c){
                        case "1":
                            System.out.println("enter pin:");
                            String pin = scaner.nextLine();
                            ctrl.enterPin(pin);
                            ((DoorLockController) ctrl).showDoorStatus();
                            break;
                        case "2":
                            System.out.println("loged out");
                            login =false;

                            break;

                    }

                }
                break;

            case "2":
                System.out.println("Enter the mater user info:");
                System.out.println("master user name: ");
                String mname=scaner.nextLine();
                System.out.println("master key: ");
                String mkey=scaner.nextLine();
                boolean mlogin=false;

                if(mname.equals(ControllerInterface.MASTER_TENANT_NAME)&& mkey.equals(ControllerInterface.MASTER_KEY))
                    mlogin=true;
                else{
                    System.out.println("user does not exist please contact admin to add user");
                }
                while(mlogin){
                    System.out.println("1. unlock/lock door");
                    System.out.println("2. add usser");
                    System.out.println("3. remove user");
                    System.out.println("4. logout");
                    String c=scaner.nextLine();

                    switch (c){
                        case "1":
                            System.out.println("enter pin:");
                            String pin = scaner.nextLine();
                            ctrl.enterPin(pin);
                            ((DoorLockController) ctrl).showDoorStatus();
                            break;
                        case "2":
                            System.out.println("new user name:");
                            String newUser=scaner.nextLine();
                            System.out.println("password: ");
                            String newPass =scaner.nextLine();
                            ctrl.addTenant(newPass,newUser);
                            System.out.println("user added sucessfully");
                            break;
                        case "3":
                            System.out.println("user to remove name: ");
                            String remUser=scaner.nextLine();
                            ctrl.removeTenant(remUser);

                            break;

                        case "4":
                            System.out.println("logout sucessful");
                            mlogin=false;
                            break;

                    }

                }
                break;

        }

    }
    public static void main(String[] args) throws Exception {
        SafeHome safeHome=new SafeHome();
        safeHome.userInterface();

    }


}
