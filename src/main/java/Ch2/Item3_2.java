package Ch2;

public class Item3_2 {
    private static final Item3_2 INSTANCE = new Item3_2();
    private Item3_2(){
        System.out.println("Item3_2");
    }
    public static Item3_2 getInstance(){ return INSTANCE;}
    public void leaveTheBuilding(){
        System.out.println("Item3_2: leaveTheBuilding");
    }
}
