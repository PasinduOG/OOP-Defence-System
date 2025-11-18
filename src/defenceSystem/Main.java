package defenceSystem;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import defenceSystem.controller.Controller;
import defenceSystem.view.MainController;

public class Main {

    public static void main(String[] args) {
        FlatMacDarkLaf.setup();
        Controller controller = new Controller();
        new MainController(controller).setVisible(true);
    }
}