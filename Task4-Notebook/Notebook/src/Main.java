import controller.Controller;
import model.Model;
import view.View;

/**
 * Created by sergey on 14/05/16.
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();

        Controller controller = new Controller(view, model);

        controller.processUser();
    }
}
