package Design_Pattern.Decoder.Toopings;

import Design_Pattern.Decoder.Icecreem;

public class VenilaScop implements Icecreem {
    private Icecreem icecreem;

    public VenilaScop(Icecreem icecreem) {
        this.icecreem = icecreem;
    }

    @Override
    public int GetCost() {
        return icecreem.GetCost()+45;
    }

    @Override
    public String GetDiscription() {
        return icecreem.GetDiscription()+", then add the scop of Venila Icecreem";
    }
}
