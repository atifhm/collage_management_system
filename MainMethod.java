package CollageManagement;

/**
 *
 * @author Atif Hyder
 */
public class MainMethod {

    public static void main(String[] args) {

        SplashScreen us = new SplashScreen();
        us.setVisible(true);
        try {

            for (int i = 0; i <= 100; i++) {
                Thread.sleep(30);
                
              us.uniloadbar.setValue(i);
            }

        } catch (InterruptedException e) {
        }
        us.dispose();

         // new MainFrame().setVisible(true);
        new newMainFrame().setVisible(true);
    }

}
