package Design_Pattern.Factory;

import Design_Pattern.Factory.Componants.Button.Button;
import Design_Pattern.Factory.Componants.Dropdown.Dropdown;
import Design_Pattern.Factory.Componants.Manu.Menu;
import Design_Pattern.Factory.SupportedPlatform.SupportedPlatform;
import Design_Pattern.Factory.UIFactory.UIFactory;

public class Main {
    public static void main(String[] args) {
    Flutter flutter = new Flutter(SupportedPlatform.ANDROID);
        UIFactory uiFactory = flutter.createUIFactory();
        Menu menu = uiFactory.createMenu();
        Dropdown dropdown = uiFactory.createDropdown();
        Button button = uiFactory.createButton();
//        System.out.println(flutter.createUIFactory());
    }

}
