package Ch2;


public class Item {
    public static void main(String[] args) {
        final Item3_1 item3_1 = Item3_1.INSTANCE;
        final Item3_1 item3_12 = Item3_1.INSTANCE;
        item3_1.leaveTheBuilding();
        item3_12.leaveTheBuilding();
        System.out.println("-----");
        final Item3_2 item3_2 = Item3_2.getInstance();
        final Item3_2 item3_22 = Item3_2.getInstance();
        item3_2.leaveTheBuilding();
        item3_22.leaveTheBuilding();

        System.out.println("-----");
        final Item3_3 item3_3 = Item3_3.INSTANCE;
        final Item3_3 item3_32 = Item3_3.INSTANCE;
        item3_3.leaveTheBuilding();
        item3_32.leaveTheBuilding();
    }
}
