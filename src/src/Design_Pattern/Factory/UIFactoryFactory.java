package Design_Pattern.Factory;

import Code_Practice.MultiThreading.Adder__Sbustracter.Substractor;
import Design_Pattern.Factory.SupportedPlatform.SupportedPlatform;
import Design_Pattern.Factory.UIFactory.AndroidFactory;
import Design_Pattern.Factory.UIFactory.UIFactory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatform supportedPlatform){
        switch (supportedPlatform)
        {
            case ANDROID -> {return new AndroidFactory();}
        }
        return null;
    }
}
