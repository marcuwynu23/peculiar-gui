

import com.github.peculiar.app.AppAuthForm;
import com.github.peculiar.app.SetMVCApp;
import java.util.ArrayList;


public class App  implements SetMVCApp {
    
    private View view;
    private Model model;
    private Controller controller;
    
    public App(){
        setAppView();
        setAppModel();
        setAppController();
    }
    @Override
    public void setAppView() {
      var auth = new AppAuthForm();
      auth.setAuthenticate(new View(), new ArrayList<>());
      auth.showAppForm();
    }
    @Override
    public void setAppModel() {
      model = new Model();  
    }
    @Override
    public void setAppController() {
        controller = new Controller();
    }
    
    
   public static void main(String[] args){
       var app = new App();
   }
} 
   
