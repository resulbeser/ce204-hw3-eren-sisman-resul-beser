package App;


import Model.Model;
import View.Editor;
import Controller.SaveListener;


public class App {
    public static void main(String[] args) {
    	Model model = new Model();
        Editor view = new Editor();
        SaveListener saveListener = new SaveListener(view,model);
    	//Controller controller = new Controller(view, model,saveListener);
 
    }
}