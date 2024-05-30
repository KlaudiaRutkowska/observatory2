public class QuestShield extends Quest {
    public QuestShield(Inventory inventory, Integer requiredCount) {
        super(inventory, requiredCount);
        
        this.requiredItem = new ItemShield();
    }
}
