/**
 * Created by aamerine on 6/3/17.
 */
public class Die {
    private Integer sides;
    private DieEnum type;

    public Die(Integer sides, DieEnum type){
        this.sides = sides;
        this.type = type;
    }

    public Integer getNumberOfSides(){
        return this.sides;
    }

    public DieEnum getType(){
        return this.type;
    }

    public Integer roll(){
        return (int)(Math.random() * this.sides + 1);
    }
}
