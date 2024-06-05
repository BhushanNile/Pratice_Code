package Design_Pattern.Factory;

import Design_Pattern.Factory.SupportedPlatform.SupportedPlatform;
import Design_Pattern.Factory.UIFactory.UIFactory;

public class Flutter {
    private SupportedPlatform supportedPlatform;

    public Flutter(SupportedPlatform supportedPlatform) {
        this.supportedPlatform = supportedPlatform;
    }
    public UIFactory createUIFactory(){
        System.out.println("crating the UIFactory Method for " + supportedPlatform);
        return UIFactoryFactory.getUIFactory(supportedPlatform);
    }
}
