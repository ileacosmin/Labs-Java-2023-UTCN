package isp.lab3.exercise5;


import java.util.Scanner;

public class VendingMachine {
    private String[] ProductsNames = {"Mars", "Kinder", "Lays", "Water Bottle", "CocaCola", "Fanta", "Sandwich", "Nuhs", "Alvcv"};
    private int[] ProductIds = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private int coins;
    private static int [] Prices={1,3,5,7,3,1,2,3,5};

    public static int[] getPrices() {
        return Prices;
    }

    public String[] getProductsNames() {
        return ProductsNames;
    }

    public void setProductsNames(String[] productsNames) {
        ProductsNames = productsNames;
    }

    public int[] getProductIds() {
        return ProductIds;
    }

    public void setProductIds(int[] productIds) {
        ProductIds = productIds;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
    public void displayProducts(){

        String afis[]= this.getProductsNames();
        for(int i=0;i<=2;i++) {
            for (int j = 0; j <= 2; j++)
                System.out.print(afis[j+i] + " ");
            System.out.println('\n');
        }
    }

    public void insertCoin(int coins){
        this.coins+=coins;
    }
    public String selectProduct(int id){
        if (coins>=Prices[id]){
            System.out.println("You get the product");
         coins-=Prices[id];
            System.out.println("you have "+coins+" left ");
         return ProductsNames[id];
        }else{
            System.out.println("not enough money");
            return " ";
        }
    }
    public void displayCredit(){
        System.out.println("you have "+coins+" coins left ");
    }

    public void userMenu(){

        this.displayProducts();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("0-insert more coin");
        int myint = keyboard.nextInt();

        while(myint!=-1){
            switch (myint) {
                case 0:
                    System.out.println("enter nr of coins: ");
                    myint= keyboard.nextInt();
                    insertCoin(myint);
                    break;
                default:
                    System.out.println("enter id of the product: ");
                    myint= keyboard.nextInt();
                    System.out.println(this.selectProduct(myint));
                    System.out.println("enter another id or -1 to get the money back and exit");
                    myint = keyboard.nextInt();
            }
        }
        System.out.println("return: "+coins);
    }

    public static void main(String[] args) {
    VendingMachine P = new VendingMachine();
    P.userMenu();
    }
}