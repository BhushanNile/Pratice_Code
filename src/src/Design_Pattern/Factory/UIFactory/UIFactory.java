package Design_Pattern.Factory.UIFactory;

import Design_Pattern.Factory.Componants.Button.Button;
import Design_Pattern.Factory.Componants.Dropdown.Dropdown;
import Design_Pattern.Factory.Componants.Manu.Menu;

public interface UIFactory {
    Menu createMenu();
    Button createButton();
    Dropdown createDropdown();
}
