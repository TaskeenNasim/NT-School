//default package
import MyPackage.*; //Import everything
// import MyPackage.Shop2;
// import MyPackage.User;

class Shop {
    Shop() {
        System.out.println("Shop 1");
    }
}

public class Dev {
    public static void main(String[] args) {
        MyPackage.Shop shop = new MyPackage.Shop();
//        Shop shop = new Shop();
        MyPackage.Shop.shop = new MyPackage.Shop();

    }
}
