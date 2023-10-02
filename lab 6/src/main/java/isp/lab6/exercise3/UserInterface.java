package isp.lab6.exercise3;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInterface {
    private LoginSystem loginSyst= new LoginSystem();
    private static OnlineStore Store= new OnlineStore();

    public static void loadInterface() throws IOException {
        LoginSystem loginSystem =new LoginSystem();
        Scanner scanString = new Scanner(System.in);
        String username= new String();
        boolean login=false;
        System.out.println("1 to login/2 to register/0 to exit");
        String password = new String();

        while(true) {

            int num= scanString.nextInt();
            switch (num) {
                case 1:
                    System.out.println("username: ");
                    username = scanString.next();
                    System.out.println("passwrd: ");
                    password = scanString.next();

                    if (loginSystem.login(username, password)) {
                        System.out.println("Login sucesfull ");
                        login = true;
                    }
                    break;
                case 2:
                    System.out.println("username: ");
                    username = scanString.next();
                    System.out.println("passwrd: ");
                    password = scanString.next();
                    loginSystem.register(username, password);
                    login = true;
                    break;
                case 3:
                    if(login) {
                        ActiveSession activeSession = new ActiveSession(username);
                        Store.addSesion(username);
                        System.out.println("enter the product to add to cart: ");
                        Store.showProducts();
                        String productName = scanString.next();
                        System.out.println("enter nr of products to get: ");
                        int nrProd = scanString.nextInt();

                        Store.addToCart(username, Store.getProductByName(productName), nrProd);
                        System.out.println(Store.getSessions().get(username).getShoppingCart().toString());
                    }
                    break;

                case 4:
                    Store.checkOut(username);
                    loginSystem.logout(username);
                    break;

                case 5:
                    loginSystem.logout(username);
                    login=false;
                    break;
                case 0:
                    return;
            }
            System.out.println("1 to login/2 to register/3 to shop/4 to checkout/5 to logout/0 to exit");
        }
    }
}



