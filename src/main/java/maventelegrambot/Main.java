package maventelegrambot;

import com.mashape.unirest.http.exceptions.UnirestException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    public static void main(String[] args) {
        TelegramBot tb = new TelegramBot("1354461424:AAH_HWp4dAws73CEQvBEPu5RTM8Kw7eItKA");
        try {
            tb.run();
        } catch (UnirestException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
