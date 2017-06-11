import java.util.HashMap;
import java.util.Map;

/**
 * Created by aamerine on 6/3/17.
 */
public class Dice {
    private Map<Die,Integer> dice;

    public Dice(){
        this.dice = new HashMap<Die,Integer>();
    }

    public void addDice(String diceString){
        DiceParserResult dpr = DiceParserUtils.parseDiceString(diceString);
        if(dpr != null){
            if(dpr.die != null){
                this.dice.put(dpr.die, dpr.number);
            }
        }
    }

    public Integer throwDice(){
        Integer total = 0;
        for(Die d : this.dice.keySet()){
            System.out.println("Rolling "+this.dice.get(d)+"d"+d.getNumberOfSides()+d.getModifierStr());
            for(int ii = 1; ii <= this.dice.get(d); ++ii){
                total += d.roll();
            }
            total += d.getModifier();
        }
        return total;
    }
}