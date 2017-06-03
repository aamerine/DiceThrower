import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by aamerine on 6/3/17.
 */
public class DiceParserUtils {
    public static DiceParserResult parseDiceString(String diceString){
        Pattern pattern = Pattern.compile("([1-9]\\d*)?(d[1-9]\\d*)?", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(diceString);
        if(matcher.matches()){
            DiceParserResult dpr = new DiceParserResult();
            dpr.number = (matcher.group(1) != null) ? Integer.parseInt(matcher.group(1)) : 1;
            dpr.die = DieEnum.getDieByName(matcher.group(2));
            return dpr;
        }
        return null;
    }
}
