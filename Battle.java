public class Battle {
    // Instance variables
    public Actor attacker;
    public Actor defender;

    // Constructor
    public Battle(Actor attacker, Actor defender) {
        this.attacker = attacker;
        this.defender = defender;
    }

    // Getters and setters
    public void setAttacker() {
        this.attacker = attacker;
    }

    public Actor getAttacker() {
        return attacker;
    }

    public void setDefender() {
        this.defender = defender;
    }
    public Actor getDefender() {
        return defender;
    }

    // Method to check for winner
    public Actor checkForWinner() {
        Actor winner = null;
        if (attacker.getHp() <= 0) {
            winner = attacker;
            return winner;
        }
        else if (defender.getHp() <= 0) {
            winner = defender;
            return winner;
        }
        else {
            return winner;
        }
    }

    // Method to start the battle
    public Actor startBattle(){

        // Attacker attacks defender
        while (attacker.getHp() > 0 && defender.getHp() > 0) {
            defender.setHp(defender.getHp() - attacker.getAttack());
           
            // Check for winner
            Actor winner = checkForWinner();
            if (checkForWinner() != null) {

                //Allocate exp
                int expGain = (int)((Math.floor(defender.getLevel() / (double) attacker.getLevel()) + 5) * 10);
                winner.setExpPercentage(winner.getExpPercentage() + expGain);

                if(winner.getExpPercentage() >= 100) {
                    winner.levelUp(expGain);
                }
                
                //Return the winner
                return winner;
            }

            // Swap attacker and defender
            Actor value = attacker;
            attacker = defender;
            defender = value;
        }

        // No winner
        return null;

    }


}
