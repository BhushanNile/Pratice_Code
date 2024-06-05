package Design_Pattern.Decoder.Toopings;

import Design_Pattern.Decoder.Icecreem;

public class ChocoSyrup implements Icecreem{
    private Icecreem icecreem;

    public ChocoSyrup(Icecreem icecreem) {
        this.icecreem = icecreem;
    }

    @Override
    public int GetCost() {
        return icecreem.GetCost()+20;
    }

    @Override
    public String GetDiscription() {
        return icecreem.GetDiscription()+", then add the Choco syrup";
    }
}
