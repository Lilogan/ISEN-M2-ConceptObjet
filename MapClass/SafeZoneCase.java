package MapClass;

import BeingsClass.Beings;

/**
 * SafeZoneCase
 */
public class SafeZoneCase extends Case {

    public SafeZoneCase(int x, int y, Map m) {
        super(x, y, m);
    }

    private String raceName;

    public void safeZoneEffect(Beings b){

    }

    public void setRaceName(String str){
        raceName = str;
    }
    public String getRaceName(){
        return raceName;
    }

}