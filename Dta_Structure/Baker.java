import java.util.*;

import javax.lang.model.element.Name;
public class Baker {
    private int Bakerid;
    private String bakerName;
    private char bakerclass;
    private double bakerRatting;
    private boolean onlineDilevery;
    Baker(int id ,String  bname,char bclass,double bRatting,boolean oDilevry){
        this.Bakerid=id;
        this.bakerName=bname;
        this.bakerRatting=bRatting;
        this.bakerclass=bclass;
        this.onlineDilevery=oDilevry;
        int Bakerid() {
            return Bakerid;
        }
    }
}
