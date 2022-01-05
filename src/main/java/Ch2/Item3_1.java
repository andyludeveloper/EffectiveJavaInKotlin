package Ch2;

public class Item3_1 {
    public static final Item3_1 INSTANCE = new Item3_1();
    private Item3_1(){
        System.out.println("Item3_1");
    }
    public void leaveTheBuilding(){
        System.out.println("Item3_1: leaveTheBuilding");
    }
}