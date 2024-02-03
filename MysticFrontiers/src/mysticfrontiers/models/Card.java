package mysticfrontiers.models;

public abstract class Card {
    protected String id;
    protected String name;
    protected String description;
    protected Integer offense; // Nullable for cards without offense points
    protected Integer resistance; // Nullable for cards without defense points
    protected Integer movement; // Nullable for cards without movement capability
    protected String territoryAffiliation;
    protected String cardType; // Could be "Creature", "Ability", "Action", "Trick", etc.
    protected String cardClass; // Could be "Warrior", "Mage", "Rogue", etc. if applicable
    protected String elementType; // "Fire", "Water", "Earth", "Air", etc.

    public Card(String id, String name, String description, Integer offense, Integer resistance,
                Integer movement, String territoryAffiliation, String cardType, 
                String cardClass, String elementType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.offense = offense;
        this.resistance = resistance;
        this.movement = movement;
        this.territoryAffiliation = territoryAffiliation;
        this.cardType = cardType;
        this.cardClass = cardClass;
        this.elementType = elementType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getOffense() {
        return offense;
    }

    public void setOffense(Integer offense) {
        this.offense = offense;
    }

    public Integer getResistance() {
        return resistance;
    }

    public void setResistance(Integer resistance) {
        this.resistance = resistance;
    }

    public Integer getMovement() {
        return movement;
    }

    public void setMovement(Integer movement) {
        this.movement = movement;
    }

    public String getTerritoryAffiliation() {
        return territoryAffiliation;
    }

    public void setTerritoryAffiliation(String territoryAffiliation) {
        this.territoryAffiliation = territoryAffiliation;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardClass() {
        return cardClass;
    }

    public void setCardClass(String cardClass) {
        this.cardClass = cardClass;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    

    // Abstract method to display card information - to be overridden by subclasses
    public abstract void displayCardInfo();
}
