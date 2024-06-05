package Design_Pattern.Decoder.BaseAddone;

import Design_Pattern.Decoder.Icecreem;

public class OrengeCone implements Icecreem {
    private Icecreem icecreem;

    public OrengeCone() {
    }

    public OrengeCone(Icecreem icecreem) {
        this.icecreem = icecreem;
    }

    @Override
    public int GetCost() {
        if(icecreem != null)
        {
            return icecreem.GetCost()+ 15;
        }else {
            return 15;
        }
    }
    public String GetDiscription(){
        if(icecreem != null)
        {
            return icecreem.GetDiscription() + ", then add Orenge cone";
        }else {
            return "First take the Orenge Cone ";
        }
    }
}
