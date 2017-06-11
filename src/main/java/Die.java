/**
 * Created by aamerine on 6/3/17.
 */
public class Die {
    private Integer sides;
    private Integer modifier;

    public Die(Integer sides, Integer modifier){
        this.sides = sides;
        this.modifier = modifier;
    }

    public Integer getNumberOfSides(){
        return this.sides;
    }

    public Integer getModifier(){
        return this.modifier;
    }

    public String getModifierStr(){
        if(this.modifier == 0){
            return "";
        }
        if(this.modifier < 0){
            return this.modifier.toString();
        }
        return "+"+this.modifier.toString();
    }

    public Integer roll(){
        return (int)(Math.random() * this.sides + 1);
    }
}
