package Design_Pattern.Decoder.Toopings;

import Design_Pattern.Decoder.Icecreem;

public class ChocoChips implements Icecreem {
    private Icecreem icecreem;

    public ChocoChips(Icecreem icecreem) {
        this.icecreem = icecreem;
    }

    @Override
    public int GetCost() {
        return icecreem.GetCost()+15;
    }

    @Override
    public String GetDiscription() {
        return icecreem.GetDiscription()+", then add some Choco Chips";
    }
}
