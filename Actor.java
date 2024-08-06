public class Actor {
    // Instance variables
    public String name; 
    public String opponent;
    public int level = 1;
    public int hp = 10;
    public int attack = 1; 
    public double critPercentage = 0.01;
    public double expPercentage = 0.0;

    // Constructors
    public Actor(String name, int level, int hp, int attack, double critPercentage, double expPercentage) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.attack = attack;
        this.critPercentage = critPercentage;
        this.expPercentage = expPercentage;
    }

    public Actor(String name, int level) {
        this.name = name;
        this.level = level;
    }

    // Getters and setters
    public void setName(String name) {
        this.name = name;
    }
     public String getName() {
        return name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }

    public double getCritPercentage() {
        return critPercentage;
    }

    public void setCritPercentage(double critPercentage) {
        this.critPercentage = critPercentage;
    }

    public double getExpPercentage() {
        return expPercentage;
    }

    public void setExpPercentage(double expPercentage) {
        this.expPercentage = expPercentage;
    }
    
    // Method to represent damage
    int calculateAttackDamage(int attack) {
        int attackDamage;
        int randomValue = ((int)(Math.random() * 100));
        boolean isCritical = randomValue < critPercentage;
        if (isCritical) {
            attackDamage = attack + (int)(attack/2);
        }
        else {
            attackDamage = attack;
        }
        return attackDamage;
    }   

    // Method to calc damage
    void attack(Actor opponent) {
        int damage = calculateAttackDamage(attack);
        int hpAfter = hp - damage;
        if (hpAfter <= 0) {
            hp = 0;
        }
        else {
            hp = hpAfter;
        }        
    }

    // Method to calc level up
    void levelUp(double expPercentage) {
        while (expPercentage >= 100) {
            level += level;
            hp += hp;
            attack += attack;
            expPercentage -= 100;
        }
    }
}


