public class Character extends Actor {

    public enum ClassType {
        HUNTER,
        ASSASSIN,
        KNIGHT
    }

    // Instance variable
    private ClassType classType;

    // Constructor
    public Character(String name, int level, String classType) {
        super(name, level);
        this.classType = ClassType.valueOf(classType);

        switch (this.classType) {
            case HUNTER:
                setHp(level*2);
                setAttack(level*3);
                setCritPercentage(level*1);
                break;
            case ASSASSIN: 
                setHp(level*1);
                setAttack(level*2);
                setCritPercentage(level*3);
                break;
            case KNIGHT:
                setHp(level*3);
                setAttack(level*2);
                setCritPercentage(level*1);
                break;
        }
    }
    
    // Override levelUp() method
    @Override void levelUp(double expPercentage) {
        while (expPercentage >= 100) {
            setLevel(getLevel() + 1);
            switch (this.classType) {
                case HUNTER: 
                    setHp(getLevel() * 2);
                    setAttack(getLevel() * 3);
                    setCritPercentage(getLevel() * 1);
                    setExpPercentage(getExpPercentage() - 100);
                    break;

                case ASSASSIN: 
                    setHp(getLevel() * 1);
                    setAttack(getLevel() * 2);
                    setCritPercentage(getLevel() * 3);
                    setExpPercentage(getExpPercentage() - 100);
                    expPercentage -= 100;
                    break;

                case KNIGHT:
                    setHp(getLevel() * 3);
                    setAttack(getLevel() * 2);
                    setCritPercentage(getLevel() * 1);
                    setExpPercentage(getExpPercentage() - 100);
                    expPercentage -= 100;
                    break;
            }

            if(getExpPercentage() < 100){

            }
        }
        
    }

    public void setMainCharClass(ClassType classType) {
        this.classType = classType;
    }

    public ClassType getMainCharClass() {
        return classType;
    }
}
