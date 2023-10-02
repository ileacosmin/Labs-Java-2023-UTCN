package isp.lab6.exercise3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExercise3 {
    @Test
    public void loginSystemTest(){
        User u1= new User("cosmin","parola");
        LoginSystem loginSystem=new LoginSystem();
        loginSystem.addUser(u1);
        assertEquals(true,loginSystem.login("cosmin","parola"));
    }
    @Test
    public void testOnlineStore(){
        OnlineStore onlineStore= new OnlineStore();
        onlineStore.addSesion("cosmin");
        Product product = new Product("Hat",15);
        onlineStore.addToCart("cosmin",product,10);
        assertEquals(150,onlineStore.getSessions().get("cosmin").getPriceOfShopingCart());
    }
}
