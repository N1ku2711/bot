import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;


public class main {



    public static void main(String[] args){
        System.err.close();
        ApiContextInitializer.init();

        TelegramBotsApi botsApi = new TelegramBotsApi();

        try {
            botsApi.registerBot(new bot());
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }

    }

}
