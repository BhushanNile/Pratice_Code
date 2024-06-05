package Design_Pattern.Factory.UIFactory;


import Design_Pattern.Factory.Componants.Button.AndroidButton;
import Design_Pattern.Factory.Componants.Button.Button;
import Design_Pattern.Factory.Componants.Dropdown.AndroidDropdown;
import Design_Pattern.Factory.Componants.Manu.AndroidMenu;
import Design_Pattern.Factory.Componants.Manu.Menu;

public class AndroidFactory implements UIFactory {
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidDropdown createDropdown() {
        return new AndroidDropdown();
    }
}
