package Design_Pattern.Decoder.BaseAddone;

import Design_Pattern.Decoder.Icecreem;

public class ChocoCone implements Icecreem {
    private Icecreem icecreem;

    public ChocoCone() {
    }

    public ChocoCone(Icecreem icecreem) {
        this.icecreem = icecreem;
    }

    public int GetCost(){
        if(icecreem != null)
        {
            return icecreem.GetCost()+20;
        }else{
            return 20;
        }
    }
    public String GetDiscription(){
        if(icecreem != null)
        {
            return icecreem.GetDiscription()+", then add Choco cone";
        }else{
            return "First take the ChocoCone ";
        }
    }
}
