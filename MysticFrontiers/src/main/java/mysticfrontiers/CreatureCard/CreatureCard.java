package main.java.mysticfrontiers.CreatureCard;

import main.java.mysticfrontiers.common.Card;

public class CreatureCard extends Card {
    private int manaCost;
    private String elementType;
    private String creatureType;
    private String cardClass;
    private String territoryAffiliation;
    private Integer offense;
    private Integer resistance;
    private Integer movement;
    private String summoningMethod; // Optional, based on your design for high mana cost creatures
    private String effectDescription; // For "Effect" creatures
    
    public CreatureCard(String id, String name, String description, int manaCost, String elementType,
                        String creatureType, String cardClass, String territoryAffiliation,
                        Integer offense, Integer resistance, Integer movement,
                        String summoningMethod, String effectDescription) {
        super(id, name, description);
        this.manaCost = manaCost;
        this.elementType = elementType;
        this.creatureType = creatureType;
        this.cardClass = cardClass;
        this.territoryAffiliation = territoryAffiliation;
        this.offense = offense;
        this.resistance = resistance;
        this.movement = movement;
        this.summoningMethod = summoningMethod;
        this.effectDescription = effectDescription;
    }
    
    @Override
    public void displayCardInfo() {
        System.out.printf("Name: %s, Mana Cost: %d, Element: %s%n", name, manaCost, elementType);
        System.out.println("Description: " + description);
        System.out.printf("Creature Type: %s, Class: %s, Territory: %s%n", creatureType, cardClass, territoryAffiliation);
        if (!"Normal".equals(creatureType) && effectDescription != null && !effectDescription.isEmpty()) {
            System.out.println("Effect: " + effectDescription);
        }
        System.out.printf("Offense: %d, Resistance: %d, Movement: %d%n", offense, resistance, movement);
    }
    
    
    
    // Getters and setters
    public int getManaCost() {
        return manaCost;
    }
    
    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }
    
    public String getElementType() {
        return elementType;
    }
    
    public void setElementType(String elementType) {
        this.elementType = elementType;
    }
    
    public String getCreatureType() {
        return creatureType;
    }
    
    public void setCreatureType(String creatureType) {
        this.creatureType = creatureType;
    }
    
    public String getCardClass() {
        return cardClass;
    }
    
    public void setCardClass(String cardClass) {
        this.cardClass = cardClass;
    }
    
    public String getTerritoryAffiliation() {
        return territoryAffiliation;
    }
    
    public void setTerritoryAffiliation(String territoryAffiliation) {
        this.territoryAffiliation = territoryAffiliation;
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
    
    public String getSummoningMethod() {
        return summoningMethod;
    }
    
    public void setSummoningMethod(String summoningMethod) {
        this.summoningMethod = summoningMethod;
    }
    
    public String getEffectDescription() {
        return effectDescription;
    }
    
    public void setEffectDescription(String effectDescription) {
        this.effectDescription = effectDescription;
    }
}

