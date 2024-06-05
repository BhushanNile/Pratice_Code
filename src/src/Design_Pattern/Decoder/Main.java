package Design_Pattern.Decoder;

import Design_Pattern.Decoder.BaseAddone.ChocoCone;
import Design_Pattern.Decoder.BaseAddone.OrengeCone;
import Design_Pattern.Decoder.Toopings.ChocoChips;
import Design_Pattern.Decoder.Toopings.ChocoSyrup;
import Design_Pattern.Decoder.Toopings.VenilaScop;

public class Main {
    public static void main(String[] args) {
        Icecreem ic = new ChocoChips(
                        new VenilaScop(
                            new OrengeCone(
                                 new ChocoSyrup(
                                    new ChocoCone()))));
        System.out.println(ic.GetCost());
        System.out.println(ic.GetDiscription());
    }

}
