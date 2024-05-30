//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Quest questArmor = new QuestArmor(inventory, 2);
        Quest questShield = new QuestShield(inventory, 1);
        Quest questSword = new QuestSword(inventory, 5);

        Item itemArmor = new ItemArmor();
        Item itemShield = new ItemShield();
        Item itemSword = new ItemSword();

        inventory.addItem(itemArmor);
        inventory.addItem(itemShield);
        inventory.addItem(itemSword);
        inventory.addItem(itemSword);

        inventory.removeItem(itemArmor);

        inventory.addItem(itemSword);
        inventory.addItem(itemArmor);

        inventory.removeItem(itemSword);

        inventory.addItem(itemArmor);
        inventory.addItem(itemSword);
        inventory.addItem(itemSword);
        inventory.addItem(itemSword);
    }
}