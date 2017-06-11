import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by aamerine on 6/3/17.
 */
class DiceParserUtils {
    static DiceParserResult parseDiceString(String diceString){
        Pattern pattern = Pattern.compile("([1-9]\\d*)?d([1-9]\\d*)?([+-]\\d+)?");
        Matcher matcher = pattern.matcher(diceString);
        if(matcher.matches()){
            DiceParserResult dpr = new DiceParserResult();
            dpr.number = (matcher.group(1) != null) ? Integer.parseInt(matcher.group(1)) : 1;
            Integer modifier = 0;
            if(matcher.group(3) != null){
                modifier = (matcher.group(3).startsWith("-")) ? Integer.parseInt(matcher.group(3)) : Integer.parseInt(matcher.group(3).substring(1));
            }
            dpr.die = new Die(Integer.parseInt(matcher.group(2)), modifier);
            return dpr;
        }
        return null;
    }
}
