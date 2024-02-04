package mysticfrontiers.models;

public class CreatureCard extends Card {
    private String creatureType; // Specific to CreatureCard, not present in the generic Card

    public CreatureCard(String id, String name, String description, Integer offense, Integer resistance,
                        Integer movement, String territoryAffiliation, String cardType, 
                        String cardClass, String elementType, String creatureType, Integer manaCost) {
        // Call the super constructor with all parameters
        super(id, name, description, offense, resistance, movement, 
              territoryAffiliation, cardType, cardClass, elementType, manaCost);
              
        this.creatureType = creatureType;
    }

    // Creature-specific getters and setters
    public String getCreatureType() {
        return creatureType;
    }

    public void setCreatureType(String creatureType) {
        this.creatureType = creatureType;
    }

    @Override
    public void displayCardInfo(Object [] creatureType) {
        super.displayCardInfo(creatureType); // Assuming the Card class has a basic implementation of this method
    }
}
