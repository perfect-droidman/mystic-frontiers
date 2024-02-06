package main.java.mysticfrontiers.CreatureCard;

/**
 * EnigmaCodex is a subclass of Creature
 */
public final class EnigmaCodex extends CreatureCard {
    private String summoningEnigma; // Describes the unique enigma or condition required to summon this card
    
    // Constructor
    public EnigmaCodex(String id, String name, String description, int manaCost, String elementType,
                           String creatureType, String cardClass, String territoryAffiliation,
                           Integer offense, Integer resistance, Integer movement,
                           String summoningMethod, String effectDescription, String summoningEnigma) {
        super(id, name, description, manaCost, elementType, creatureType, cardClass, territoryAffiliation,
                offense, resistance, movement, summoningMethod, effectDescription);
        this.summoningEnigma = summoningEnigma;
    }
    
    // Overridden method to display Enigma Codex card info with its unique summoning enigma
    @Override
    public void displayCardInfo() {
        super.displayCardInfo(); // Display the info from CreatureCard
        System.out.println("Enigma Codex Summoning Condition: " + summoningEnigma);
    }
    
    // Getters and setters
    public String getSummoningEnigma() {
        return summoningEnigma;
    }
    
    public void setSummoningEnigma(String summoningEnigma) {
        this.summoningEnigma = summoningEnigma;
    }
}

