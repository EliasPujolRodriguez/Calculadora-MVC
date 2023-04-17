package Main;
import Views.View;
import com.formdev.flatlaf.FlatIntelliJLaf;
import controllers.Controller;
import javax.swing.UIManager;
import models.Model;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());//Uso de libería FlatIntelliJLaf
            View view = new View();
            Model model = new Model();
            Controller controller = new Controller(view, model);

            view.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
