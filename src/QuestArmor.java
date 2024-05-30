public class QuestArmor extends Quest {
    public QuestArmor(Inventory inventory, Integer requiredCount) {
        super(inventory, requiredCount);
        
        this.requiredItem = new ItemArmor();
    }
}
