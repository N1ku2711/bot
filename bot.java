import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.sql.SQLOutput;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;


public class bot extends TelegramLongPollingBot {
    Date date = new Date();

    SendMessage message = new SendMessage();
    ReplyKeyboardMarkup replykeyboardmarkup = new ReplyKeyboardMarkup();
    List<KeyboardRow> keyboard = new ArrayList<>();
    KeyboardRow row1 = new KeyboardRow();
    KeyboardRow row2 = new KeyboardRow();
    KeyboardRow row3 = new KeyboardRow();
    KeyboardRow row4 = new KeyboardRow();
    KeyboardRow row5 = new KeyboardRow();
    KeyboardRow row6 = new KeyboardRow();
    KeyboardRow row7 = new KeyboardRow();
    KeyboardRow row8 = new KeyboardRow();
    KeyboardRow row9 = new KeyboardRow();
    KeyboardRow row10 = new KeyboardRow();
    KeyboardRow row11 = new KeyboardRow();
    KeyboardRow row12 = new KeyboardRow();
    KeyboardRow row13 = new KeyboardRow();
    KeyboardRow row14 = new KeyboardRow();
    KeyboardRow row15 = new KeyboardRow();
    KeyboardRow row16 = new KeyboardRow();
    KeyboardRow row17 = new KeyboardRow();
    KeyboardRow row18 = new KeyboardRow();
    KeyboardRow row19 = new KeyboardRow();
    KeyboardRow row20 = new KeyboardRow();
    KeyboardRow row21 = new KeyboardRow();
    KeyboardRow row22 = new KeyboardRow();
    KeyboardRow row23 = new KeyboardRow();
    KeyboardRow row24 = new KeyboardRow();

    KeyboardRow row25 = new KeyboardRow();
    KeyboardRow row26= new KeyboardRow();
    KeyboardRow row27 = new KeyboardRow();
    KeyboardRow row28= new KeyboardRow();
    KeyboardRow row29 = new KeyboardRow();
    KeyboardRow row30 = new KeyboardRow();
    KeyboardRow row31 = new KeyboardRow();
    KeyboardRow row32 = new KeyboardRow();
    KeyboardRow row33= new KeyboardRow();
    KeyboardRow row34 = new KeyboardRow();
    KeyboardRow row35 = new KeyboardRow();
    KeyboardRow row36 = new KeyboardRow();
    KeyboardRow row37 = new KeyboardRow();
    KeyboardRow row38 = new KeyboardRow();
    KeyboardRow row39 = new KeyboardRow();
    KeyboardRow row40 = new KeyboardRow();
    KeyboardRow row41 = new KeyboardRow();
    KeyboardRow row42 = new KeyboardRow();
    KeyboardRow row43 = new KeyboardRow();
    KeyboardRow row44 = new KeyboardRow();
    KeyboardRow row45 = new KeyboardRow();
    KeyboardRow row46 = new KeyboardRow();
    KeyboardRow row47 = new KeyboardRow();
    KeyboardRow row48 = new KeyboardRow();
    public void onUpdateReceived(Update update) {
        String response = update.getMessage().getText();
        System.out.println(response);

        if (response.equals("/start")) {
            row1.clear();
            row2.clear();
            row3.clear();

            keyboard.clear();

            row1.add("la munte\uD83D\uDDFB ");
            row2.add("la mare \uD83C\uDF05 ");
            row3.add("calatorii cu familia \uD83D\uDC6A");


            keyboard.add(row1);
            keyboard.add(row2);
            keyboard.add(row3);

            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Alege unde doresti sa calatoresti:");

            SendMessage(message, update);


        }

        if (response.equals("la munte\uD83D\uDDFB")) {


        }
        if (response.equals("la mare \uD83C\uDF05")) {


        }
        if (response.equals("calatorii cu familia \uD83D\uDC6A")) {


        }


        if (response.equals("la munte\uD83D\uDDFB")) {
            row4.clear();
            row5.clear();
            row6.clear();
            row7.clear();
            row15.clear();
            keyboard.clear();


            row4.add("Bulgaria \uD83C\uDDE7\uD83C\uDDEC");
            row5.add("Romania \uD83C\uDDF7\uD83C\uDDF4");
            row6.add("Austria \uD83C\uDDE6\uD83C\uDDF9");
            row7.add("Italia \uD83C\uDDEE\uD83C\uDDF9");
            row15.add("Inapoii");
            keyboard.add(row4);
            keyboard.add(row5);
            keyboard.add(row6);
            keyboard.add(row7);
            keyboard.add(row15);
            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Alege tara in care ai dori sa calatoresti:");
            SendMessage(message, update);

        }


        if (response.equals("Bulgaria \uD83C\uDDE7\uD83C\uDDEC")) {


        }
        if (response.equals("Romania \uD83C\uDDF7\uD83C\uDDF4")) {


        }
        if (response.equals("Austria \uD83C\uDDE6\uD83C\uDDF9")) {


        }
        if (response.equals("Italia \uD83C\uDDEE\uD83C\uDDF9")) {


        }
        if (response.equals("Inapoii")) {

        }
        if (response.equals("Inapoii")) {
            row1.clear();
            row2.clear();
            row3.clear();

            keyboard.clear();

            row1.add("la munte\uD83D\uDDFB ");
            row2.add("la mare \uD83C\uDF05 ");
            row3.add("calatorii cu familia \uD83D\uDC6A");


            keyboard.add(row1);
            keyboard.add(row2);
            keyboard.add(row3);

            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Alege unde doresti sa calatoresti:");

            SendMessage(message, update);


        }

        if (response.equals("la munte\uD83D\uDDFB")) {


        }
        if (response.equals("la mare \uD83C\uDF05")) {


        }
        if (response.equals("calatorii cu familia \uD83D\uDC6A")) {


        }


        //bulgaria//


        if (response.equals("Bulgaria \uD83C\uDDE7\uD83C\uDDEC")) {
            row7.clear();
            row8.clear();
            row9.clear();
            row14.clear();
            keyboard.clear();

            row7.add("Dobrinishte\uD83C\uDDE7\uD83C\uDDEC");
            row8.add("Bodrost\uD83C\uDDE7\uD83C\uDDEC");
            row9.add("Govedartsi\uD83C\uDDE7\uD83C\uDDEC");
            row14.add("Inapoi");

            keyboard.add(row7);
            keyboard.add(row8);
            keyboard.add(row9);
            keyboard.add(row14);

            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Acum alege orasul:");

            SendMessage(message, update);


        }

        if (response.equals("Dobrinishte\uD83C\uDDE7\uD83C\uDDEC")) {
            message.setText("Dobrinishte este faimoasa spa staţiune, situata pe poalele munţii Pirin in partea de sud - est a valea Razlog la altitudine de 810 m deasupra nivelul mării.  " + " \n" + "------------------------------------------------------------ \n" + " https://bulgariaschi.ro/otherresorts/dobrinishte.shtml");
            SendMessage(message, update);


        }
        if (response.equals("Bodrost\uD83C\uDDE7\uD83C\uDDEC")) {
            message.setText("Bodrost se afla in regiunea Kartala, la 30 km de oraşul Blagoevgrad. Este o mica stațiune de schi, situata in partea sud-vest al munţii Rila la o altitudine de 1300 m. Staţiunea oferă condiţii bune de schi pentru începatori. Zona de schi Karlata este foarte buna cu stratul de zăpadă bine întreţinut din Decembrie pana la Aprilie." + "\n" + "------------------------------------------------------------ \n" + "https://bulgariaschi.ro/otherresorts/bodrost.shtml");
            SendMessage(message, update);

        }
        if (response.equals("Govedartsi\uD83C\uDDE7\uD83C\uDDEC")) {
            message.setText("Satul Govedartsi se afla la 80 km de Sofia, in Munții Rila, lânga răul Cherni Iskar. Turişti pot ajunge pe jos in valea Maliovitsa sau pot urca vărful Maliovitsa pentru a se bucura la priveliști deosebite. Satul este un punct de plecare pe trasee spre manastirea Rila şi Cele Şapte lacuri Rila. Aproape de satul este situat lacul Iovchevo, unde puteţi sa faceţi un picnic. In regiune va puteți plimba prin padurile frumoase de conifere, plini de fructe de padure, ciuperci şi ierburi. În iarna zona oferă condiţii foarte bune de schi. La dispoziție turiștilor sunt mijloace de transport care fac legatura cu oraşul Samokov unde dvs. puteți vizita muzeele locale. " + "\n" + "------------------------------------------------------------ \n" + "https://bulgariaschi.ro/govedartsi/index.html");
            SendMessage(message, update);
        }
        if (response.equals("Inapoi")) {

        }

        if (response.equals("Inapoi")) {
            row4.clear();
            row5.clear();
            row6.clear();
            row7.clear();
            row15.clear();
            keyboard.clear();


            row4.add("Bulgaria \uD83C\uDDE7\uD83C\uDDEC");
            row5.add("Romania \uD83C\uDDF7\uD83C\uDDF4");
            row6.add("Austria \uD83C\uDDE6\uD83C\uDDF9");
            row7.add("Italia \uD83C\uDDEE\uD83C\uDDF9");
            row15.add("Inapoii");
            keyboard.add(row4);
            keyboard.add(row5);
            keyboard.add(row6);
            keyboard.add(row7);
            keyboard.add(row15);
            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Alege tara in care ai dori sa calatoresti:");
            SendMessage(message, update);

        }


        if (response.equals("Bulgaria \uD83C\uDDE7\uD83C\uDDEC")) {


        }
        if (response.equals("Romania \uD83C\uDDF7\uD83C\uDDF4")) {


        }
        if (response.equals("Austria \uD83C\uDDE6\uD83C\uDDF9")) {


        }
        if (response.equals("Italia \uD83C\uDDEE\uD83C\uDDF9")) {


        }
        if (response.equals("Inapoii")) {

        }


        //rominia//


        if (response.equals("Romania \uD83C\uDDF7\uD83C\uDDF4")) {
            row11.clear();
            row12.clear();
            row13.clear();
            row16.clear();
            keyboard.clear();

            row11.add("Sinaia\uD83C\uDDF7\uD83C\uDDF4");
            row11.add("Predeal\uD83C\uDDF7\uD83C\uDDF4");
            row12.add("Brașov\uD83C\uDDF7\uD83C\uDDF4");
            row12.add("Piatra Neamț\uD83C\uDDF7\uD83C\uDDF4");
            row13.add("Sovata\uD83C\uDDF7\uD83C\uDDF4");
            row16.add("Inapoi\uD83C\uDDF7\uD83C\uDDF4");

            keyboard.add(row11);
            keyboard.add(row12);
            keyboard.add(row13);
            keyboard.add(row16);
            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Acum alege orasul:");

            SendMessage(message, update);
        }
        if (response.equals("Sinaia\uD83C\uDDF7\uD83C\uDDF4")) {
            message.setText("Supranumită “Perla Carpaților”, Sinaia, fosta reședință de vară a Familiei Regale a României, a rămas și în prezent una dintre cele mai apreciate stațiuni din țara noastră. Orășelul situat la poalele munților Bucegi este cochet și se bucură de un peisaj superb, care atrage în orice sezon turiști de toate vârstele." +
                    "\n" +
                    "Iarna, iubitorii schiului pot să se dea pe cele 14 pârtii de dificultăți diferite. Vara, din Sinaia se pot face o mulțime de drumeții. De exemplu, în maxim o oră și jumătate de mers lejer de la Castelul Peleș se poate ajunge într-un peisaj de poveste, la Stâna Regală. Din Sinaia se pot face drumeții către Cota 1400, Cota 2000, Piatra Arsă, Babele sau Vf. Omu. " + "\n" + "------------------------------------------------------------ \n" + "https://romania.directbooking.ro/prezentare-sinaia-informatii-poze-imagini-42.aspx ");
            SendMessage(message, update);
        }
        if (response.equals("Brașov\uD83C\uDDF7\uD83C\uDDF4")) {
            message.setText("Cunoscut și ca “Orașul de sub Tâmpa”, Brașov este în topul celor mai vizitate orașe din România. Amplasarea deosebită, sub muntele Tâmpa, centrul istoric plin de farmec cu clădirile sale în stil baroc, Piața Sfatului sau Biserica Neagră sunt doar câteva din lucrurile care îi atrag pe turiști an de an. Dacă sunteți într-o vizită prin Brașov, nu trebuie să ratați nici Cetățuia de pe Straja, o fortificație medievală impresionantă. De asemenea, este obligatoriu să faceți și o drumeție pe Tâmpa sau o excursie până în Poiana Brașov, stațiunea preferată a schiorilor din România. Iarna, în Poiană schiorii se pot da pe 12 pârtii de dificultăți diferite, iar vara pot pleca în drumeții pe cărări cu priveliști încântătoare." + "\n" + "------------------------------------------------------------ \n" + "https://www.ghid-brasov.ro/");
            SendMessage(message, update);
        }
        if (response.equals("Predeal\uD83C\uDDF7\uD83C\uDDF4")) {
            message.setText("Staţiunea Predeal este situatã în centrul României pe Valea Prahovei, între râurile Prahova şi Timiş, la poalele munţilor Bucegi la nord-est de aceştia şi cele ale munţilor Baiului la nord-vest. Oraşul Predeal este cel mai inalt oras din tara, aflat la altitudinea de 1030m-1110m" + "\n" + "------------------------------------------------------------ \n" + "https://romania.directbooking.ro/prezentare-predeal-informatii-poze-imagini-39.aspx");
            SendMessage(message, update);
        }
        if (response.equals("Sovata\uD83C\uDDF7\uD83C\uDDF4")) {
            message.setText(" Stațiune cu sezon permanent, Sovata a fost menționată pentru prima data ca loc tămăduitor într-un document din 1597, dar abia în 1850 devine stațiune balneară. Este înconjurată de dealurile Cireșelu (912 m), Capela (720 m), Bechiș (1.079 m), Dealul Mic și Muntele de Sare, fiind acoperită cu păduri de fagi, stejari, carpeni, ulmi, castani, brazi și mesteceni." + "\n" + "------------------------------------------------------------ \n" + "https://romania.directbooking.ro/prezentare-sovata-informatii-poze-imagini-56.aspx ");
            SendMessage(message, update);
        }
        if (response.equals("Piatra Neamț\uD83C\uDDF7\uD83C\uDDF4")) {
            message.setText(" Municipiul Piatra Neamț – reședința județului Neamț – este așezat pe valea râului Bistrița, mai exact la ieșirea acestuia dintre munți, la confluența cu pârâul Cuiejdi. Piatra Neamț este amplasat într-un bazin intramontan, la altitudinea de 310 m, străjuit de culmile Pietricica (590 m) la sud-est, Cozla (679 m) la nord, Cernegura (852 m) la sud-vest, Cârloman (617 m) la nord-vest și Bâtca Doamnei (462 m) la sud-vest." + "\n" + "------------------------------------------------------------ \n" + "https://romania.directbooking.ro/prezentare-piatra-neamt-informatii-poze-imagini-2252.aspx ");
            SendMessage(message, update);
        }
        if (response.equals("Inapoi\uD83C\uDDF7\uD83C\uDDF4")) ;
        {
        }

        if (response.equals("Inapoi\uD83C\uDDF7\uD83C\uDDF4")) {
            row4.clear();
            row5.clear();
            row6.clear();
            row7.clear();
            row15.clear();
            keyboard.clear();


            row4.add("Bulgaria \uD83C\uDDE7\uD83C\uDDEC");
            row5.add("Romania \uD83C\uDDF7\uD83C\uDDF4");
            row6.add("Austria \uD83C\uDDE6\uD83C\uDDF9");
            row7.add("Italia \uD83C\uDDEE\uD83C\uDDF9");
            row15.add("Inapoii");
            keyboard.add(row4);
            keyboard.add(row5);
            keyboard.add(row6);
            keyboard.add(row7);
            keyboard.add(row15);
            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Alege tara in care ai dori sa calatoresti:");
            SendMessage(message, update);

        }


        if (response.equals("Bulgaria \uD83C\uDDE7\uD83C\uDDEC")) {


        }
        if (response.equals("Romania \uD83C\uDDF7\uD83C\uDDF4")) {


        }
        if (response.equals("Austria \uD83C\uDDE6\uD83C\uDDF9")) {


        }
        if (response.equals("Italia \uD83C\uDDEE\uD83C\uDDF9")) {


        }
        if (response.equals("Inapoii")) {

        }







        if (response.equals("Austria \uD83C\uDDE6\uD83C\uDDF9")) {
            row17.clear();
            row18.clear();
            row19.clear();
            row20.clear();
            keyboard.clear();

            row17.add("Grossglockner\uD83C\uDDE6\uD83C\uDDF9");
            row18.add("Kitzsteinhorn\uD83C\uDDE6\uD83C\uDDF9");
            row19.add("Gollinger Wasserfall\uD83C\uDDE6\uD83C\uDDF9");
            row20.add("Inapoi\uD83C\uDDE6\uD83C\uDDF9");

            keyboard.add(row17);
            keyboard.add(row18);
            keyboard.add(row19);
            keyboard.add(row20);

            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Acum alege orasul:");

            SendMessage(message, update);

        }
        if(response.equals("Grossglockner\uD83C\uDDE6\uD83C\uDDF9")){
            message.setText("Cel mai înalt munte și centrul din Austria al Parcului Național High Tauern Puteți să vă apropiați de Grossglockner în mai multe moduri diferite: este cel mai înalt munte al Republicii Alpine, una dintre cele mai atrăgătoare altitudine din Alpii de Est și vârful pasiunii pentru mulți alpinisti. . Muntele este, de asemenea, acasă pentru oameni, numeroase animale și plante rare. Glockner este învelit în secret, este chestia legendei și are o mare putere atrăgătoare. Este un obstacol pe calea de la nord la sud, totuși un loc unde a fost depășit prin milenii. Alăturați-vă și cunoașteți maiestatea sa, Grossglockner, în numeroasele sale aspecte! " + "\n" + "------------------------------------------------------------ \n" + " https://www.tripadvisor.com/Attraction_Review-g190442-d195488-Reviews-Grossglockner-Tirol_Austrian_Alps.html");
            SendMessage(message, update);
        }
        if(response.equals("Kitzsteinhorn\uD83C\uDDE6\uD83C\uDDF9")) {
            message.setText(" Kitzsteinhorn este legendar: nu este doar un ghețar, ci este ghețarul. Cea mai înaltă zonă de schi din Salzburg oferă o experiență alpină de neegalat 365 de zile pe an. E aici că începe sezonul de iarnă. Începând din toamnă, veți găsi deja zăpada perfectă pentru o experiență perfectă de sporturi de iarnă. Indiferent dacă circulați pe pârtii albe verzi sau pe traseele spectaculoase de schi off-piste sau pe bordul dvs. în parcurile de zăpadă, varietatea de opțiuni pe care le veți găsi este de neegalat." + "\n" + "------------------------------------------------------------ \n" + " https://www.tripadvisor.com/Attraction_Review-g608661-d1230926-Reviews-Kitzsteinhorn-Kaprun_Austrian_Alps.html");
            SendMessage(message, update);
        }
        if(response.equals("Gollinger Wasserfall\uD83C\uDDE6\uD83C\uDDF9")) {
            message.setText(" Impressive nature spectacle in Golling\n" +
                    "In the part of Golling known as Torren („torren“ Romanic: torrential mountain river), near the fascinating late gothic pilgrimage church of St. Nikolaus, the Golling waterfalls plunge 75 metres down two giant steps into the valley below. The thunderous Golling falls are one of the provinces most attractive and romantic natural monuments." + "\n" + "------------------------------------------------------------ \n" + "https://www.golling.info/en/experience-excursion/golling-falls ");
            SendMessage(message, update);
        }
        if(response.equals("Inapoi\uD83C\uDDE6\uD83C\uDDF9")){
        }

        if (response.equals("Inapoi\uD83C\uDDE6\uD83C\uDDF9")) {
            row4.clear();
            row5.clear();
            row6.clear();
            row7.clear();
            row15.clear();
            keyboard.clear();


            row4.add("Bulgaria \uD83C\uDDE7\uD83C\uDDEC");
            row5.add("Romania \uD83C\uDDF7\uD83C\uDDF4");
            row6.add("Austria \uD83C\uDDE6\uD83C\uDDF9");
            row7.add("Italia \uD83C\uDDEE\uD83C\uDDF9");
            row15.add("Inapoii");
            keyboard.add(row4);
            keyboard.add(row5);
            keyboard.add(row6);
            keyboard.add(row7);
            keyboard.add(row15);
            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Alege tara in care ai dori sa calatoresti:");
            SendMessage(message, update);

        }


        if (response.equals("Bulgaria \uD83C\uDDE7\uD83C\uDDEC")) {


        }
        if (response.equals("Romania \uD83C\uDDF7\uD83C\uDDF4")) {


        }
        if (response.equals("Austria \uD83C\uDDE6\uD83C\uDDF9")) {


        }
        if (response.equals("Italia \uD83C\uDDEE\uD83C\uDDF9")) {


        }
        if (response.equals("Inapoii")) {

        }


        if (response.equals("Italia \uD83C\uDDEE\uD83C\uDDF9")) {
            row21.clear();
            row22.clear();
            row23.clear();
            row24.clear();
            keyboard.clear();

            row21.add("Mount Etna\uD83C\uDDEE\uD83C\uDDF9");
            row22.add("Monte Solaro\uD83C\uDDEE\uD83C\uDDF9");
            row23.add("Gran Sasso\uD83C\uDDEE\uD83C\uDDF9");
            row24.add("Inapoi\uD83C\uDDEE\uD83C\uDDF9");

            keyboard.add(row21);
            keyboard.add(row22);
            keyboard.add(row23);
            keyboard.add(row24);

            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Acum alege orasul:");

            SendMessage(message, update);

        }
        if(response.equals("Mount Etna\uD83C\uDDEE\uD83C\uDDF9")) {
            message.setText("Sicily's greatest natural attraction is also its highest mountain: Mount Etna, at 10,990 feet, is the most active volcano in Europe and the oldest recorded active volcano in the world. " + "\n" + "------------------------------------------------------------ \n" + " https://www.tripadvisor.com/Attraction_Review-g187888-d195063-Reviews-Mount_Etna-Catania_Province_of_Catania_Sicily.html");
            SendMessage(message, update);
        }

        if(response.equals("Monte Solaro\uD83C\uDDEE\uD83C\uDDF9")) {
            message.setText(" From Piazza della Vittoria you can take a breathtaking chairlift to the top of Mount Solaro, the highest point on Capri at 1,932 feet." + "\n" + "------------------------------------------------------------ \n" + " https://www.tripadvisor.com/Attraction_Review-g488299-d195542-Reviews-Monte_Solaro-Anacapri_Island_of_Capri_Province_of_Naples_Campania.html");
            SendMessage(message, update);
        }
        if(response.equals("Gran Sasso\uD83C\uDDEE\uD83C\uDDF9")) {
            message.setText( " https://www.tripadvisor.com/Attraction_Review-g187769-d246242-Reviews-Gran_Sasso-Abruzzo.html");
            SendMessage(message, update);
        }
        if(response.equals("Inapoi\uD83C\uDDEE\uD83C\uDDF9")){}

        if (response.equals("Inapoi\uD83C\uDDEE\uD83C\uDDF9")) {
            row4.clear();
            row5.clear();
            row6.clear();
            row7.clear();
            row15.clear();
            keyboard.clear();


            row4.add("Bulgaria \uD83C\uDDE7\uD83C\uDDEC");
            row5.add("Romania \uD83C\uDDF7\uD83C\uDDF4");
            row6.add("Austria \uD83C\uDDE6\uD83C\uDDF9");
            row7.add("Italia \uD83C\uDDEE\uD83C\uDDF9");
            row15.add("Inapoii");
            keyboard.add(row4);
            keyboard.add(row5);
            keyboard.add(row6);
            keyboard.add(row7);
            keyboard.add(row15);
            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Alege tara in care ai dori sa calatoresti:");
            SendMessage(message, update);

        }


        if (response.equals("Bulgaria \uD83C\uDDE7\uD83C\uDDEC")) {


        }
        if (response.equals("Romania \uD83C\uDDF7\uD83C\uDDF4")) {


        }
        if (response.equals("Austria \uD83C\uDDE6\uD83C\uDDF9")) {


        }
        if (response.equals("Italia \uD83C\uDDEE\uD83C\uDDF9")) {


        }
        if (response.equals("Inapoii")) {

        }










        if (response.equals("la mare \uD83C\uDF05")) {
            row25.clear();
            row26.clear();
            row27.clear();
            row15.clear();
            keyboard.clear();


            row25.add("Turcia\uD83C\uDDF9\uD83C\uDDF7");
            row25.add("Bulgaria\uD83C\uDDE7\uD83C\uDDEC");
            row26.add("Grecia\uD83C\uDDEC\uD83C\uDDF7");
            row26.add("Cipru\uD83C\uDDE8\uD83C\uDDFE");
            row27.add("Spania\uD83C\uDDEA\uD83C\uDDF8");
            row27.add("Italia\uD83C\uDDEE\uD83C\uDDF9");
            row15.add("Inapoiii");
            keyboard.add(row25);
            keyboard.add(row26);
            keyboard.add(row27);
            keyboard.add(row15);
            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Alege tara in care ai dori sa calatoresti:");
            SendMessage(message, update);

        }


        if (response.equals("Turcia\uD83C\uDDF9\uD83C\uDDF7")) {


        }
        if (response.equals("Bulgaria\uD83C\uDDE7\uD83C\uDDEC")) {


        }
        if (response.equals("Grecia\uD83C\uDDEC\uD83C\uDDF7")) {


        }
        if (response.equals("Cipru\uD83C\uDDE8\uD83C\uDDFE")) {


        }
        if (response.equals("Spania\uD83C\uDDEA\uD83C\uDDF8")) {

        }
        if (response.equals("Italia\uD83C\uDDEE\uD83C\uDDF9")) {

        }
        if (response.equals("Inapoiii")) {

        }

        if (response.equals("Inapoiii")) {
            row1.clear();
            row2.clear();
            row3.clear();

            keyboard.clear();

            row1.add("la munte\uD83D\uDDFB ");
            row2.add("la mare \uD83C\uDF05 ");
            row3.add("calatorii cu familia \uD83D\uDC6A");


            keyboard.add(row1);
            keyboard.add(row2);
            keyboard.add(row3);

            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Alege unde doresti sa calatoresti:");

            SendMessage(message, update);


        }

        if (response.equals("la munte\uD83D\uDDFB")) {


        }
        if (response.equals("la mare \uD83C\uDF05")) {


        }
        if (response.equals("calatorii cu familia \uD83D\uDC6A")) {


        }













        if (response.equals("Turcia\uD83C\uDDF9\uD83C\uDDF7")) {
            row28.clear();
            row29.clear();
            row30.clear();
            keyboard.clear();

            row28.add("Istambul\uD83C\uDDF9\uD83C\uDDF7");
            row28.add("Alanya\uD83C\uDDF9\uD83C\uDDF7");
            row29.add("Antalya\uD83C\uDDF9\uD83C\uDDF7");
            row29.add("Marmaris\uD83C\uDDF9\uD83C\uDDF7");
            row30.add("Inapoiiii");
            keyboard.add(row28);
            keyboard.add(row29);
            keyboard.add(row30);

            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Acum alege orasul:");

            SendMessage(message, update);


        }

        if (response.equals("Istambul\uD83C\uDDF9\uD83C\uDDF7")) {
            message.setText("Situat în Istanbul, la 1,1 km de Moscheea Suleymaniye, Beethoven Senfoni Hotel oferă cazare cu aer condiționat și un bar. Hotelul se află la 1,7 km de Coloana lui Constantin și la 2,3 km de Moscheea Albastră, iar oaspeții au la dispoziție un centru de wellness și spa și o terasă. De asemenea, oaspeții beneficiază de recepție cu program nonstop, serviciu de transfer de la/la aeroport, room-service și acces gratuit la internet WiFi în întreaga proprietate. " + "\n" + "------------------------------------------------------------ \n" + " https://www.booking.com/hotel/tr/beethoven-senfoni.ro.html?aid=356980;label=gog235jc-1DCAIo5AFCAnRySCBYA2iOAYgBAZgBILgBF8gBDNgBA-gBAfgBAogCAagCA7gCmsu09gXAAgE;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=-755070;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=1;hpos=1;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590503702;srpvid=436e668b28fe015d;type=total;ucfs=1&#hotelTmpl");
            SendMessage(message, update);
        }


        if (response.equals("Alanya\uD83C\uDDF9\uD83C\uDDF7")) {
            message.setText(" Situat în Alanya, la 500 de metri de autogara din Alanya și la 400 de metri de plaja Kleopatra, Cleopatra King Apart oferă cazare cu WiFi gratuit.\n" +
                    "\n" +
                    "Cu balcon cu vedere la munte, toate unitățile sunt prevăzute cu bucătărie complet utilată.\n" +
                    "\n" +
                    "Hotelul de apartamente servește un mic dejun continental sau halal.\n" +
                    "\n" +
                    "Cleopatra King Apart are și o piscină în aer liber.\n" +
                    "\n" +
                    "De asemenea, unitatea de cazare include o terasă.\n" +
                    "\n" +
                    "Printre punctele populare de interes din apropierea hotelului Cleopatra King Apart se numără parcul acvatic Alanya, Muzeul de Arheologie din Alanya și Peștera Damlatas. Cel mai apropiat aeroport este Aeroportul din Gazipasa, aflat la 40 km de hotelul de apartamente." + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/tr/cleopatrakingapart.ro.html?aid=356980;label=gog235jc-1DCAIo5AFCAnRySCBYA2iOAYgBAZgBILgBF8gBDNgBA-gBAfgBAogCAagCA7gCmsu09gXAAgE;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=-734728;dest_type=city;dist=0;from_beach_non_key_ufi_sr=1;group_adults=2;group_children=0;hapos=1;hpos=1;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590503885;srpvid=cc0f66e6d444000c;type=total;ucfs=1&#hotelTmpl ");
            SendMessage(message, update);

        }
        if (response.equals("Antalya\uD83C\uDDF9\uD83C\uDDF7")) {

            message.setText(" Aflat la doar 100 de metri de plaja Konyaalti, Hotelul Lemon oferă camere cu aer condiționat și Wi-Fi gratuit. Hotelul include o piscină în aer liber cu o secțiune separată pentru copii.\n" +
                    "\n" +
                    "Toate camerele de la Hotelul Lemon sunt izolate fonic, pentru un confort sporit. Oferă, de asemenea, un balcon privat cu vedere la piscina în aer liber sau la Marea Mediterană." + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/tr/lemon.ro.html?aid=356980;label=gog235jc-1DCAIo5AFCAnRySCBYA2iOAYgBAZgBILgBF8gBDNgBA-gBAfgBAogCAagCA7gCmsu09gXAAgE;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=-735347;dest_type=city;dist=0;from_beach_non_key_ufi_sr=1;group_adults=2;group_children=0;hapos=1;hpos=1;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590503949;srpvid=eb8967067df80195;type=total;ucfs=1&#hotelTmpl ");
            SendMessage(message, update);
        }
        if (response.equals("Marmaris\uD83C\uDDF9\uD83C\uDDF7")) {

            message.setText(
                    "Hotelul de apartamente Club Aquarium este situat în Icmeler. Proprietatea oferă facilități de sporturi acvatice, piscină sezonieră în aer liber și acces WiFi gratuit.\n" +
                            "\n" +
                            "Unitățile au aer condiționat, zonă de relaxare cu TV prin satelit cu ecran plat, bucătărie complet utilată și baie privată, prevăzută cu duș și uscător de păr.\n" +
                            "\n" +
                            "Proprietatea oferă zilnic mic dejun continental.\n" +
                            "\n" +
                            "Hotelul de apartamente are și o terasă.\n" +
                            "\n" +
                            "Zona este apreciată de amatorii de ciclism, iar proprietatea oferă serviciu de închiriere de biciclete. " + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/tr/club-aquarium.ro.html?aid=356980;label=gog235jc-1DCAIo5AFCAnRySCBYA2iOAYgBAZgBILgBF8gBDNgBA-gBAfgBAogCAagCA7gCmsu09gXAAgE;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=-764696;dest_type=city;dist=0;from_beach_key_ufi_sr=1;group_adults=2;group_children=0;hapos=1;hpos=1;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590504001;srpvid=13df6720ca2f00f7;type=total;ucfs=1&#hotelTmpl ");
            SendMessage(message, update);
        }
        if (response.equals("Inapoiiii")) {


        }


        if (response.equals("Inapoiiii")) {
            row25.clear();
            row26.clear();
            row27.clear();
            row15.clear();
            keyboard.clear();


            row25.add("Turcia\uD83C\uDDF9\uD83C\uDDF7");
            row25.add("Bulgaria\uD83C\uDDE7\uD83C\uDDEC");
            row26.add("Grecia\uD83C\uDDEC\uD83C\uDDF7");
            row26.add("Cipru\uD83C\uDDE8\uD83C\uDDFE");
            row27.add("Spania\uD83C\uDDEA\uD83C\uDDF8");
            row27.add("Italia\uD83C\uDDEE\uD83C\uDDF9");
            row15.add("Inapoiii");
            keyboard.add(row25);
            keyboard.add(row26);
            keyboard.add(row27);
            keyboard.add(row15);
            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Alege tara in care ai dori sa calatoresti:");
            SendMessage(message, update);

        }


        if (response.equals("Turcia\uD83C\uDDF9\uD83C\uDDF7")) {


        }
        if (response.equals("Bulgaria\uD83C\uDDE7\uD83C\uDDEC")) {


        }
        if (response.equals("Grecia\uD83C\uDDEC\uD83C\uDDF7")) {


        }
        if (response.equals("Cipru\uD83C\uDDE8\uD83C\uDDFE")) {


        }
        if (response.equals("Spania\uD83C\uDDEA\uD83C\uDDF8")) {

        }
        if (response.equals("Italia\uD83C\uDDEE\uD83C\uDDF9")) {

        }
        if (response.equals("Inapoiii")) {

        }













        if (response.equals("Bulgaria\uD83C\uDDE7\uD83C\uDDEC")) {
            row31.clear();
            row32.clear();
            row33.clear();
            keyboard.clear();

            row31.add("Astoria Mare \uD83C\uDDE7\uD83C\uDDEC");
            row31.add("Cabacum Plaza\uD83C\uDDE7\uD83C\uDDEC");
            row32.add("La Mer Apartcomplex\uD83C\uDDE7\uD83C\uDDEC");
            row32.add("Grifid Hotel Foresta\uD83C\uDDE7\uD83C\uDDEC");
            row33.add("Inapoiiiii");
            keyboard.add(row31);
            keyboard.add(row32);
            keyboard.add(row33);

            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Acum alege orasul:");

            SendMessage(message, update);


        }

        if(response.equals("Astoria Mare \uD83C\uDDE7\uD83C\uDDEC")) {
            message.setText(" Oferind un bar și o zonă de plajă privată cu șezlonguri gratuite, Astoria Mare All Inclusive se află în stațiunea Nisipurile de Aur. La această proprietate există un club al copiilor și un loc de joacă pentru copii. Hotelul are 2 piscine, centru de fitness, program de divertisment de seară și recepție deschisă non-stop.Hotelul are 3 restaurante care fac parte din programul all inclusive. Oaspeții pot lua masa la bufetul-restaurant principal, precum și la restaurantul italian și la cel oriental. Barul din hol și barul de la piscină oferă consumație nelimitată de băuturi alcoolice locale și băuturi nealcoolice." + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/bg/astoria-mare-all-inclusive-zlatni-piastsi.ro.html?aid=356980&label=gog235jc-1DCAMYASgXQgxnb2xkZW4tc2FuZHNIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAL12rT2BcACAQ&sid=7dd80e9ddb9598b26cd4f6d53f249e9b&lp_sr_snippet=1 ");
            SendMessage(message, update);
        }

        if(response.equals("Cabacum Plaza\uD83C\uDDE7\uD83C\uDDEC")) {
            message.setText(" Cabacum Plaza Beach Apartments se află în stațiunea Nisipurile de Aur, pe malul mării, lângă plaja Cabacum și pune la dispoziție o piscină sezonieră în aer liber și terasă la soare. Centrul staţiunii Nisipurile de Aur se află la 3,3 km. Oaspeții beneficiază de acces gratuit la conexiunea WiFi în întreaga proprietate și de o parcare privată gratuită.\n" +
                    "\n" +
                    "Toate unitățile au aer condiționat, zonă de luat masa și zonă de relaxare cu TV cu ecran plat şi canale prin cablu. Există și o bucătărie utilată cu plită, frigider și cuptor cu microunde. Fiecare unitate include o baie privată cu duş sau cadă. Se asigură prosoape și lenjerie de pat, care sunt schimbate la fiecare 3 zile." + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/bg/cabacum-plaza.ro.html?aid=356980&label=gog235jc-1DCAMYASgXQgxnb2xkZW4tc2FuZHNIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAL12rT2BcACAQ&sid=7dd80e9ddb9598b26cd4f6d53f249e9b&lp_sr_snippet=1 ");
            SendMessage(message, update);
        }

        if(response.equals("La Mer Apartcomplex\uD83C\uDDE7\uD83C\uDDEC")) {
            message.setText(" La Mer Apartcomplex se află la mai puțin de 200 de metri de plaja Riviera și oferă restaurant, piscină sezonieră în aer liber, bar și lounge comun. Oaspeții beneficiază de parcare privată și de WiFi gratuit în întreaga proprietate.\n" +
                    "\n" +
                    "Oaspeții acestui aparthotel pot lua un mic dejun continental sau tip bufet.\n" +
                    "\n" +
                    "La Mer Apartcomplex oferă o terasă la soare.\n" +
                    "\n" +
                    "Proprietatea are grădină și un loc de joacă pentru copii." + "\n" + "------------------------------------------------------------ \n" + " https://www.booking.com/hotel/bg/la-mer-apartcomplex.ro.html?aid=356980&label=gog235jc-1DCAMYASgXQgxnb2xkZW4tc2FuZHNIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAL12rT2BcACAQ&sid=7dd80e9ddb9598b26cd4f6d53f249e9b&lp_sr_snippet=1");
            SendMessage(message, update);
        }

        if(response.equals("Grifid Hotel Foresta\uD83C\uDDE7\uD83C\uDDEC")) {
            message.setText("Hotelul Grifid Foresta oferă servicii all inclusive şi este situat într-o zonă liniştită din Nisipurile de Aur, la 800 de metri de plaja cu nisip şi de centrul stațiunii.\n" +
                    "\n" +
                    "Hotelul are restaurant, un bar în hol și piscină în aer liber, înconjurată de o terasă cu șezlonguri. Toţi oaspeţii au la dispoziție o parcare privată cu plată, iar accesul la internet WiFi este gratuit în toate camerele şi în hol.\n" +
                    "\n" +
                    "Toate camerele au balcon; de asemenea, oferă aer condiţionat, TV prin satelit şi o baie privată modernă cu duş şi uscător de păr. Se oferă cutie de valori (la un cost suplimentar) și un minibar gratuit în fiecare cameră. " + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/bg/grifid-foresta.ro.html?aid=356980&label=gog235jc-1DCAMYASgXQgxnb2xkZW4tc2FuZHNIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAL12rT2BcACAQ&sid=7dd80e9ddb9598b26cd4f6d53f249e9b&lp_sr_snippet=1 ");
            SendMessage(message, update);
        }

        if(response.equals("Inapoiiiii")){

        }

        if (response.equals("Inapoiiiii")) {
            row25.clear();
            row26.clear();
            row27.clear();
            row15.clear();
            keyboard.clear();


            row25.add("Turcia\uD83C\uDDF9\uD83C\uDDF7");
            row25.add("Bulgaria\uD83C\uDDE7\uD83C\uDDEC");
            row26.add("Grecia\uD83C\uDDEC\uD83C\uDDF7");
            row26.add("Cipru\uD83C\uDDE8\uD83C\uDDFE");
            row27.add("Spania\uD83C\uDDEA\uD83C\uDDF8");
            row27.add("Italia\uD83C\uDDEE\uD83C\uDDF9");
            row15.add("Inapoiii");
            keyboard.add(row25);
            keyboard.add(row26);
            keyboard.add(row27);
            keyboard.add(row15);
            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Alege tara in care ai dori sa calatoresti:");
            SendMessage(message, update);

        }


        if (response.equals("Turcia\uD83C\uDDF9\uD83C\uDDF7")) {


        }
        if (response.equals("Bulgaria\uD83C\uDDE7\uD83C\uDDEC")) {


        }
        if (response.equals("Grecia\uD83C\uDDEC\uD83C\uDDF7")) {


        }
        if (response.equals("Cipru\uD83C\uDDE8\uD83C\uDDFE")) {


        }
        if (response.equals("Spania\uD83C\uDDEA\uD83C\uDDF8")) {

        }
        if (response.equals("Italia\uD83C\uDDEE\uD83C\uDDF9")) {

        }
        if (response.equals("Inapoiii")) {

        }










        if (response.equals("Grecia\uD83C\uDDEC\uD83C\uDDF7")) {
            row31.clear();
            row32.clear();
            row33.clear();
            keyboard.clear();

            row31.add("Fani House \uD83C\uDDEC\uD83C\uDDF7");
            row31.add("Maria's Resort \uD83C\uDDEC\uD83C\uDDF7");
            row32.add("Ammouda Villas \uD83C\uDDEC\uD83C\uDDF7");
            row32.add("Gkoloi Studios & Apartments\uD83C\uDDEC\uD83C\uDDF7");
            row33.add("Inapooiiii");
            keyboard.add(row31);
            keyboard.add(row32);
            keyboard.add(row33);

            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Acum alege orasul:");

            SendMessage(message, update);


        }
        if(response.equals("Fani House \uD83C\uDDEC\uD83C\uDDF7")) {
            message.setText("Fani House se află în Kallithea Halkidikis, la 15 km de Hanioti, și are grădină și WiFi gratuit.\n" +
                    "\n" +
                    "Sani Beach este la 20 km de apartament, iar Afitos se află la 4,1 km. Cel mai apropiat aeroport este Aeroportul Salonic, situat la 79 km de Fani House.\n" +
                    "\n" +
                    "Acesta este locul preferat de turiștii din Kallithea Halkidikis, conform comentariilor independente.\n" +
                    "\n" +
                    "Cuplurile apreciază în mod deosebit această locaţie. I-au dat scorul 8,5 pentru un sejur pentru 2 persoane. " + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/gr/fani-house-kallithea-khalkidikes.ro.html?aid=356980;label=gog235jc-1DCAYYAShcQgloYWxraWRpa2lIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAKv4rT2BcACAQ;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=819;dest_type=region;dist=0;group_adults=2;group_children=0;hapos=1;hpos=1;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590505781;srpvid=b0fb6a9ade010146;type=total;ucfs=1&#hotelTmpl ");
            SendMessage(message, update);
        }
        if(response.equals("Maria's Resort \uD83C\uDDEC\uD83C\uDDF7")) {
            message.setText(" Maria's Resort se află în zona Stavros Thessalonikis și oferă studiouri dotate cu aer condiționat care sunt amplasate în jurul unei piscine cu formă neregulată. La proprietate există de asemenea un snack bar și o cadă cu hidromasaj în aer liber.\n" +
                    "\n" +
                    "Studiourile de la Maria's Resort sunt amenajate cu mobilier din lemn deschis la culoare și pardoseală de gresie. Acestea includ de asemenea o chicinetă cu o mică zonă de luat masa, un televizor și o baie privată cu duș." + "\n" + "------------------------------------------------------------ \n" + " https://www.booking.com/hotel/gr/maria-lux.ro.html?aid=356980;label=gog235jc-1DCAYYAShcQgloYWxraWRpa2lIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAKv4rT2BcACAQ;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=819;dest_type=region;dist=0;group_adults=2;group_children=0;hapos=3;hpos=3;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590505781;srpvid=b0fb6a9ade010146;type=total;ucfs=1&#hotelTmpl");
            SendMessage(message, update);
        }
        if(response.equals("Ammouda Villas \uD83C\uDDEC\uD83C\uDDF7")) {
            message.setText(" Situat la doar 50 de metri de plajă, Ammouda Villas oferă unități de cazare în sistem self-catering, decorate elegant, cu acces WiFi gratuit în Ormos Panagias. Se află în mijlocul unor grădini bine îngrijite și are o terasă la soare, facilități de tenis de masă și de grătar Situat în mijlocul grădini bine îngrijite, aceasta are o terasă la soare, împreună cu un tenis de masă și facilități de grătar." + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/gr/ammouda-villas-4.ro.html?aid=356980;label=gog235jc-1DCAYYAShcQgloYWxraWRpa2lIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAKv4rT2BcACAQ;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=819;dest_type=region;dist=0;group_adults=2;group_children=0;hapos=4;hpos=4;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590505781;srpvid=b0fb6a9ade010146;type=total;ucfs=1&#hotelTmpl ");
            SendMessage(message, update);
        }
        if(response.equals("Gkoloi Studios & Apartments\uD83C\uDDEC\uD83C\uDDF7")) {
            message.setText("Situat în centrul oraşului Kalivia Poliyirou, la doar câțiva metri de plajă, Gkoloi Studios & Apartments oferă unităţi de cazare în sistem self-catering, cu balcon cu vedere la Marea Egee. Barurile de pe plajă și cafenelele se află la 2 minute de mers pe jos.\n" +
                    "\n" +
                    "Toate unităţile de cazare de la Gkoloi au o chicinetă cu facilităţi de gătit şi frigider. Fiecare are un TV și o baie privată cu duș. " + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/gr/gkoloi-studios-and-apartments.ro.html?aid=356980;label=gog235jc-1DCAYYAShcQgloYWxraWRpa2lIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAKv4rT2BcACAQ;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=819;dest_type=region;dist=0;group_adults=2;group_children=0;hapos=9;hpos=9;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590505781;srpvid=b0fb6a9ade010146;type=total;ucfs=1&#hotelTmpl ");
            SendMessage(message, update);
        }
        if(response.equals("Inapooiiii"))


            if (response.equals("Inapooiiii")) {
                row25.clear();
                row26.clear();
                row27.clear();
                row15.clear();
                keyboard.clear();


                row25.add("Turcia\uD83C\uDDF9\uD83C\uDDF7");
                row25.add("Bulgaria\uD83C\uDDE7\uD83C\uDDEC");
                row26.add("Grecia\uD83C\uDDEC\uD83C\uDDF7");
                row26.add("Cipru\uD83C\uDDE8\uD83C\uDDFE");
                row27.add("Spania\uD83C\uDDEA\uD83C\uDDF8");
                row27.add("Italia\uD83C\uDDEE\uD83C\uDDF9");
                row15.add("Inapoiii");
                keyboard.add(row25);
                keyboard.add(row26);
                keyboard.add(row27);
                keyboard.add(row15);
                replykeyboardmarkup.setKeyboard(keyboard);
                message.setReplyMarkup(replykeyboardmarkup);
                message.setText("Alege tara in care ai dori sa calatoresti:");
                SendMessage(message, update);

            }


        if (response.equals("Turcia\uD83C\uDDF9\uD83C\uDDF7")) {


        }
        if (response.equals("Bulgaria\uD83C\uDDE7\uD83C\uDDEC")) {


        }
        if (response.equals("Grecia\uD83C\uDDEC\uD83C\uDDF7")) {


        }
        if (response.equals("Cipru\uD83C\uDDE8\uD83C\uDDFE")) {


        }
        if (response.equals("Spania\uD83C\uDDEA\uD83C\uDDF8")) {

        }
        if (response.equals("Italia\uD83C\uDDEE\uD83C\uDDF9")) {

        }
        if (response.equals("Inapoiii")) {

        }






        if (response.equals("Cipru\uD83C\uDDE8\uD83C\uDDFE")) {
            row34.clear();
            row35.clear();
            row36.clear();
            keyboard.clear();

            row34.add("Hadjios Valley\uD83C\uDDE8\uD83C\uDDFE");
            row34.add("The Pomegranate's House\uD83C\uDDE8\uD83C\uDDFE");
            row35.add("Villa Grand Zeus\uD83C\uDDE8\uD83C\uDDFE");
            row35.add("Villa Avgoustis\uD83C\uDDE8\uD83C\uDDFE");
            row36.add("Inapooiii");
            keyboard.add(row34);
            keyboard.add(row35);
            keyboard.add(row36);

            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Acum alege orasul:");

            SendMessage(message, update);


        }
        if(response.equals("Hadjios Valley\uD83C\uDDE8\uD83C\uDDFE")) {
            message.setText("Hadjios Valley se află la mai puţin de 2,5 km de plaja din Mazotos şi are o piscină mare şi un snack bar. Oferă vile spaţioase în sistem self-catering, cu balcon sau patio cu vedere la grădină şi la terasa la soare. Accesul la internet prin fibră optică de mare viteză este gratuit.\n" +
                    "\n" +
                    "Toate vilele complexului Hadjios Valley au aer condiţionat şi o bucătărie utilată complet, cu aragaz, frigider, cuptor cu microunde şi maşină de spălat. Fiecare vilă include o cameră de zi cu canapea şi TV cu ecran plat. " + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/cy/hadjios-valley.ro.html?aid=356980;label=gog235jc-1DCAIoOUICY3lIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAK67LT2BcACAQ;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=55;dest_type=country;dist=0;group_adults=2;group_children=0;hapos=2;hpos=2;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590507076;srpvid=c5ea6d22e87a0034;type=total;ucfs=1&#hotelTmpl ");
            SendMessage(message, update);
        }
        if(response.equals("The Pomegranate's House\uD83C\uDDE8\uD83C\uDDFE")) {
            message.setText(
                    "Boasting an outdoor swimming pool, a shared lounge, and a garden, The Pomegranate's House offers accommodation in Ephtagonia with free WiFi and pool views. The air-conditioned accommodation is 34 km from Platres.\n" +
                            "\n" +
                            "The holiday home has 3 bedrooms, a flat-screen TV, an equipped kitchen with a dishwasher and a fridge, a washing machine, and 1 bathroom with a shower. For added convenience, the property can provide towels and bed linen for an extra charge. " + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/cy/the-pomegranate-39-s-house.ro.html?aid=356980;label=gog235jc-1DCAIoOUICY3lIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAK67LT2BcACAQ;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=55;dest_type=country;dist=0;group_adults=2;group_children=0;hapos=3;hpos=3;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590507076;srpvid=c5ea6d22e87a0034;type=total;ucfs=1&#hotelTmpl ");
            SendMessage(message, update);
        }
        if(response.equals("Villa Grand Zeus\uD83C\uDDE8\uD83C\uDDFE")) {
            message.setText(
                    "Located in Anoyira, Villa Grand Zeus features a free-form pool and a large sun terrace and offers split-level accommodation with free Wi-Fi. Pissouri Beach is a 10-minute drive away.\n" +
                            "\n" +
                            "Grand Zeus Villa is stone built and consists of 4 separate bedrooms, a fully equipped kitchen, living room with fireplace and dining area. Facilities include a flat-screen TV, washing machine, dishwasher and 4 bathrooms, one with spa bath. The balconies offer views over the pool and the sea." + "\n" + "------------------------------------------------------------ \n" + " https://www.booking.com/hotel/cy/grand-zeus.ro.html?aid=356980;label=gog235jc-1DCAIoOUICY3lIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAK67LT2BcACAQ;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=55;dest_type=country;dist=0;group_adults=2;group_children=0;hapos=4;hpos=4;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590507076;srpvid=c5ea6d22e87a0034;type=total;ucfs=1&#hotelTmpl");
            SendMessage(message, update);
        }
        if(response.equals("Villa Avgoustis\uD83C\uDDE8\uD83C\uDDFE")) {
            message.setText("Located in Pachna village, in the district of Limassol, Villa Avgoustis is amidst a citrus-tree garden with a private pool and BBQ facilities. It consists of 5 bedrooms, 3 bathrooms, a fully equipped kitchen and living room with fireplace.\n" +
                    "\n" +
                    "Fitted with stone walls and beamed ceilings, the open-plan kitchen has a stove, full-size fridge and country-style dining table. Facilities also include a washing machine, dishwasher and flat-screen TV. Free WiFi is available throughout. The outdoor space comprises of shaded seating areas or sun terraces for sunbathing." + "\n" + "------------------------------------------------------------ \n" + " https://www.booking.com/hotel/cy/avgoustis-house.ro.html?aid=356980;label=gog235jc-1DCAIoOUICY3lIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAK67LT2BcACAQ;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=55;dest_type=country;dist=0;group_adults=2;group_children=0;hapos=5;hpos=5;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590507076;srpvid=c5ea6d22e87a0034;type=total;ucfs=1&#hotelTmpl");
            SendMessage(message, update);
        }
        if(response.equals("Inapooiii")){

        }



        if (response.equals("Inapooiii")) {
            row25.clear();
            row26.clear();
            row27.clear();
            row15.clear();
            keyboard.clear();


            row25.add("Turcia\uD83C\uDDF9\uD83C\uDDF7");
            row25.add("Bulgaria\uD83C\uDDE7\uD83C\uDDEC");
            row26.add("Grecia\uD83C\uDDEC\uD83C\uDDF7");
            row26.add("Cipru\uD83C\uDDE8\uD83C\uDDFE");
            row27.add("Spania\uD83C\uDDEA\uD83C\uDDF8");
            row27.add("Italia\uD83C\uDDEE\uD83C\uDDF9");
            row15.add("Inapoiii");
            keyboard.add(row25);
            keyboard.add(row26);
            keyboard.add(row27);
            keyboard.add(row15);
            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Alege tara in care ai dori sa calatoresti:");
            SendMessage(message, update);

        }


        if (response.equals("Turcia\uD83C\uDDF9\uD83C\uDDF7")) {


        }
        if (response.equals("Bulgaria\uD83C\uDDE7\uD83C\uDDEC")) {


        }
        if (response.equals("Grecia\uD83C\uDDEC\uD83C\uDDF7")) {


        }
        if (response.equals("Cipru\uD83C\uDDE8\uD83C\uDDFE")) {


        }
        if (response.equals("Spania\uD83C\uDDEA\uD83C\uDDF8")) {

        }
        if (response.equals("Italia\uD83C\uDDEE\uD83C\uDDF9")) {

        }
        if (response.equals("Inapoiii")) {

        }





        if (response.equals("Spania\uD83C\uDDEA\uD83C\uDDF8")) {
            row37.clear();
            row38.clear();
            row39.clear();
            keyboard.clear();

            row37.add("Ciutat de Barcelona\uD83C\uDDEA\uD83C\uDDF8");
            row37.add("Negresco Princess\uD83C\uDDEA\uD83C\uDDF8");
            row38.add("Barcelona Princess\uD83C\uDDEA\uD83C\uDDF8");
            row38.add("Aparthotel Senator Barcelona\uD83C\uDDEA\uD83C\uDDF8");
            row39.add("Inapooii");
            keyboard.add(row37);
            keyboard.add(row38);
            keyboard.add(row39);

            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Acum alege orasul:");

            SendMessage(message, update);


        }
        if(response.equals("Ciutat de Barcelona\uD83C\uDDEA\uD83C\uDDF8")) {
            message.setText("Ciutat de Barcelona se află în Cartierul Gotic din Barcelona, la doar 100 de metri de Muzeul Picasso. Are o piscină în aer liber pe acoperiș și oferă camere izolate fonic, dotate cu aer condiționat, WiFi gratuit și TV cu ecran plat.\n" +
                    "\n" +
                    "Camerele Hotelului Ciutat Barcelona au încălzire și includ birou. Baia privată este dotată cu uscător de păr și articole de toaletă ecologice marca Pure. " + "\n" + "------------------------------------------------------------ \n" + " https://www.booking.com/hotel/es/ciutat-de-barcelona.ro.html?aid=356980;label=gog235jc-1DCAMYAShGOIsDSCBYA2iOAYgBAZgBILgBF8gBDNgBA-gBAfgBAogCAagCA7gCyfC09gXAAgE;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=-372490;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=1;hpos=1;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590507596;srpvid=e4986e268e00004d;type=total;ucfs=1&#hotelTmpl");
            SendMessage(message, update);
        }
        if(response.equals("Negresco Princess\uD83C\uDDEA\uD83C\uDDF8")) {
            message.setText("Negresco Princess se află în Barcelona, în regiunea Catalonia, și pune la dispoziție o saună și un centru de fitness. Hotelul oferă o piscină în aer liber și o terasă la soare, dar și un restaurant.\n" +
                    "\n" +
                    "Toate camerele acestui hotel au aer condiționat, minibar gratuit și TV cu ecran plat cu canale prin satelit. Pentru confortul dumneavoastră, sunt furnizate articole de toaletă gratuite şi uscător de păr. Negresco Princess oferă WiFi gratuit în întreaga proprietate. " + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/es/negresco-princess.ro.html?aid=356980;label=gog235jc-1DCAMYAShGOIsDSCBYA2iOAYgBAZgBILgBF8gBDNgBA-gBAfgBAogCAagCA7gCyfC09gXAAgE;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=-372490;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=2;hpos=2;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590507596;srpvid=e4986e268e00004d;type=total;ucfs=1&#hotelTmpl ");
            SendMessage(message, update);
        }
        if(response.equals("Barcelona Princess\uD83C\uDDEA\uD83C\uDDF8")) {
            message.setText("Hotelul Barcelona Princess este la 10 minute de mers pe jos de plajă, în zona Forum a oraşului. Acesta oferă saună gratuită, sală de gimnastică şi vedere superbă. În întreaga proprietate este disponibil acces gratuit la internet WiFi.\n" +
                    "\n" +
                    "Toţi oaspeţii beneficiază de acces gratuit la cele 2 piscine în aer liber încălzite. Piscina de la etajul 23 oferă vedere spectaculoasă la mare. " + "\n" + "------------------------------------------------------------ \n" + " https://www.booking.com/hotel/es/barcelonaprincess.ro.html?aid=356980;label=gog235jc-1DCAMYAShGOIsDSCBYA2iOAYgBAZgBILgBF8gBDNgBA-gBAfgBAogCAagCA7gCyfC09gXAAgE;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=-372490;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=3;hpos=3;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590507596;srpvid=e4986e268e00004d;type=total;ucfs=1&#hotelTmpl");
            SendMessage(message, update);
        }
        if(response.equals("Aparthotel Senator Barcelona\uD83C\uDDEA\uD83C\uDDF8")) {
            message.setText("Hotelul de apartamente Senator Barcelona este situat pe Via Augusta, într-o zonă rezidenţială plăcută, la 2 minute de mers pe jos de gara Muntaner. Unităţile de cazare sunt dotate cu aer condiţionat, încălzire şi acces gratuit la internet WiFi.\n" +
                    "\n" +
                    "Toate camerele şi apartamentele au TV, telefon şi o baie privată cu duş sau cadă. Apartamentele includ şi o chicinetă. " + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/es/aparthotelcitysenator.ro.html?aid=356980;label=gog235jc-1DCAMYAShGOIsDSCBYA2iOAYgBAZgBILgBF8gBDNgBA-gBAfgBAogCAagCA7gCyfC09gXAAgE;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=-372490;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=4;hpos=4;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590507596;srpvid=e4986e268e00004d;type=total;ucfs=1&#hotelTmpl ");
            SendMessage(message, update);
        }
        if(response.equals("Inapooii")){}

        if (response.equals("Inapooii")) {
            row25.clear();
            row26.clear();
            row27.clear();
            row15.clear();
            keyboard.clear();


            row25.add("Turcia\uD83C\uDDF9\uD83C\uDDF7");
            row25.add("Bulgaria\uD83C\uDDE7\uD83C\uDDEC");
            row26.add("Grecia\uD83C\uDDEC\uD83C\uDDF7");
            row26.add("Cipru\uD83C\uDDE8\uD83C\uDDFE");
            row27.add("Spania\uD83C\uDDEA\uD83C\uDDF8");
            row27.add("Italia\uD83C\uDDEE\uD83C\uDDF9");
            row15.add("Inapoiii");
            keyboard.add(row25);
            keyboard.add(row26);
            keyboard.add(row27);
            keyboard.add(row15);
            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Alege tara in care ai dori sa calatoresti:");
            SendMessage(message, update);

        }


        if (response.equals("Turcia\uD83C\uDDF9\uD83C\uDDF7")) {


        }
        if (response.equals("Bulgaria\uD83C\uDDE7\uD83C\uDDEC")) {


        }
        if (response.equals("Grecia\uD83C\uDDEC\uD83C\uDDF7")) {


        }
        if (response.equals("Cipru\uD83C\uDDE8\uD83C\uDDFE")) {


        }
        if (response.equals("Spania\uD83C\uDDEA\uD83C\uDDF8")) {

        }
        if (response.equals("Italia\uD83C\uDDEE\uD83C\uDDF9")) {

        }
        if (response.equals("Inapoiii")) {

        }






        if (response.equals("Italia\uD83C\uDDEE\uD83C\uDDF9")) {
            row40.clear();
            row41.clear();
            row42.clear();
            keyboard.clear();

            row40.add("Hotel Alta La Vista\uD83C\uDDEE\uD83C\uDDF9");
            row40.add("Canado Club Family Village\uD83C\uDDEE\uD83C\uDDF9");
            row41.add("Casa nella pineta\uD83C\uDDEE\uD83C\uDDF9");
            row41.add("Paradù Tuscany EcoResort\uD83C\uDDEE\uD83C\uDDF9");
            row42.add("Inapooi");
            keyboard.add(row40);
            keyboard.add(row41);
            keyboard.add(row42);

            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Acum alege orasul:");

            SendMessage(message, update);


        }
        if(response.equals("Hotel Alta La Vista\uD83C\uDDEE\uD83C\uDDF9")) {
            message.setText("Acest hotel de 3 stele este situat chiar pe plaja din Marina di Castagneto, la doar câţiva paşi distanţă de păduri de brazi. Acesta oferă o terasă cu vedere la mare.\n" +
                    "\n" +
                    "Hotel Alta La Vista oferă camere luminoase cu aer condiţionat, televizor cu ecran cu plasmă, Wi-Fi gratuit, precum şi un balcon. Unele au vedere la mare şi la arhipelagul toscan. " + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/it/alta-la-vista.ro.html?aid=356980;label=gog235jc-1DCAYYAShxOHFIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAKj9LT2BcACAQ;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=910;dest_type=region;dist=0;group_adults=2;group_children=0;hapos=4;hpos=4;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590508070;srpvid=e6db6f1378180080;type=total;ucfs=1&#hotelTmpl ");
            SendMessage(message, update);
        }
        if(response.equals("Canado Club Family Village\uD83C\uDDEE\uD83C\uDDF9")) {
            message.setText(" Amplasat chiar pe propria plajă privată din Donoratico, Canado Club Family Village este un complex cu restaurante, facilități de agrement şi divertisment pentru copii şi adulți. Complexul pune la dispoziție camere şi apartamente, precum și WiFi gratuit în toate zonele.\n" +
                    "\n" +
                    "Camerele de la Canado Club Family Village au baie privată şi seif. Apartamentele includ o chicinetă cu frigider şi cuptor cu microunde." + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/it/cantiere-navale.ro.html?aid=356980;label=gog235jc-1DCAYYAShxOHFIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAKj9LT2BcACAQ;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=910;dest_type=region;dist=0;group_adults=2;group_children=0;hapos=3;hpos=3;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590508070;srpvid=e6db6f1378180080;type=total;ucfs=1&#hotelTmpl ");
            SendMessage(message, update);
        }
        if(response.equals("Casa nella pineta\uD83C\uDDEE\uD83C\uDDF9")) {
            message.setText("Boasting garden views, Casa nella pineta | Pinewood House offers accommodation with a garden and a patio, around 1.2 km from Cavallino Matto. This holiday home features free private parking, a 24-hour front desk and free WiFi.\n" +
                    "\n" +
                    "The holiday home has 3 bedrooms, a flat-screen TV with satellite channels, an equipped kitchen with a microwave and a fridge, a washing machine, and 3 bathrooms with a bidet. " + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/it/casa-nella-pineta-pinewood-house.ro.html?aid=356980;label=gog235jc-1DCAYYAShxOHFIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAKj9LT2BcACAQ;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=910;dest_type=region;dist=0;group_adults=2;group_children=0;hapos=2;hpos=2;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590508070;srpvid=e6db6f1378180080;type=total;ucfs=1&#hotelTmpl ");
            SendMessage(message, update);
        }
        if(response.equals("Paradù Tuscany EcoResort\uD83C\uDDEE\uD83C\uDDF9")) {
            message.setText("Paradù Tuscany EcoResort este situat în Marina di Castagneto Carducci, în Toscana, la 48 km de Livorno. Oaspeții au la dispoziție o cadă cu hidromasaj și zonă privată de plajă. Volterra se află la 37 km. Accesul la internet WiFi și parcarea privată sunt disponibile gratuit.\n" +
                    "\n" +
                    "Paradù Toscana Ecoresort are piscină sezonieră în aer liber. De asemenea, există un loc de joacă pentru copii și un restaurant. În plus, complexul găzduiește un bar de vin și un restaurant pe plajă. Sunt oferite și meniuri speciale de dietă. " + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/it/paradu-39-resort.ro.html?aid=356980;label=gog235jc-1DCAYYAShxOHFIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAKj9LT2BcACAQ;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=910;dest_type=region;dist=0;group_adults=2;group_children=0;hapos=1;hpos=1;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590508070;srpvid=e6db6f1378180080;type=total;ucfs=1&#hotelTmpl ");
            SendMessage(message, update);
        }
        if(response.equals("Inapooi")){}




        if (response.equals("Inapooi")) {
            row25.clear();
            row26.clear();
            row27.clear();
            row15.clear();
            keyboard.clear();


            row25.add("Turcia\uD83C\uDDF9\uD83C\uDDF7");
            row25.add("Bulgaria\uD83C\uDDE7\uD83C\uDDEC");
            row26.add("Grecia\uD83C\uDDEC\uD83C\uDDF7");
            row26.add("Cipru\uD83C\uDDE8\uD83C\uDDFE");
            row27.add("Spania\uD83C\uDDEA\uD83C\uDDF8");
            row27.add("Italia\uD83C\uDDEE\uD83C\uDDF9");
            row15.add("Inapoiii");
            keyboard.add(row25);
            keyboard.add(row26);
            keyboard.add(row27);
            keyboard.add(row15);
            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Alege tara in care ai dori sa calatoresti:");
            SendMessage(message, update);

        }


        if (response.equals("Turcia\uD83C\uDDF9\uD83C\uDDF7")) {


        }
        if (response.equals("Bulgaria\uD83C\uDDE7\uD83C\uDDEC")) {


        }
        if (response.equals("Grecia\uD83C\uDDEC\uD83C\uDDF7")) {


        }
        if (response.equals("Cipru\uD83C\uDDE8\uD83C\uDDFE")) {


        }
        if (response.equals("Spania\uD83C\uDDEA\uD83C\uDDF8")) {

        }
        if (response.equals("Italia\uD83C\uDDEE\uD83C\uDDF9")) {

        }
        if (response.equals("Inapoiii")) {

        }







        if (response.equals("calatorii cu familia \uD83D\uDC6A")) {
            row43.clear();
            row44.clear();
            row45.clear();
            row47.clear();
            row48.clear();
            row36.clear();
            keyboard.clear();

            row43.add("1");
            row43.add("2");
            row44.add("3");
            row44.add("4");
            row45.add("5");
            row45.add("6");
            row47.add("7");
            row47.add("8");
            row48.add("9");
            row48.add("10");
            row36.add("Inapoooi");
            keyboard.add(row43);
            keyboard.add(row44);
            keyboard.add(row45);
            keyboard.add(row47);
            keyboard.add(row48);

            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Uite cele mai populate locuri:");

            SendMessage(message, update);


        }
        if(response.equals("1")) {
            message.setText("Chefchaouen sau Orașul Albastru, Maroc " + "\n" + "------------------------------------------------------------ \n" + "Chefchaouen din Maroc pare a fi orașul de provincie în care s-a născut marea, dar în care aceasta nu a mai fost niciodată văzută după plecarea la facultate și părăsirea ținutului de baștină. Totuși, în ciuda totalei ei absențe, pare să-și fi impregnat personalitatea în fiecare centimetru de clădire de la poalele Munților Rif, lăsând ca amintire o culoare calmă de albastru etern.\n" +
                    "\n" +
                    "Orașul a văzut lumina zilei undeva în 1471, iar anii de junețe și i-a petrecut în datoria de fortăreață maură pentru exilații spanioli. Trecând pragul primei tinereți, și-a deschis porțile deopotrivă pentru adepții iudaismului și ai creștinismului care au trăit cum se cuvine aici, laolaltă cu băștinașii de origine berberă.\n" +
                    "\n" +
                    "În promenadele pe care le vei face străbătând această oază de albastru, vei cocheta negreșit cu gândul că oamenii de aici trebuie să aibă un simț artistic deosebit de acut. Un gând de foarte mare bun simț, de altfel, dar motivul albastrului își trage rădăcinile mai degrabă din cauze religioase.\n" +
                    "\n" +
                    "Potrivit vechilor învățăminte evreiești care și-au croit drum până în zilele noastre, culoarea mării amintește de puterea lui Dumnezeu. Înțelepciunea populară mai spunea, de asemenea, că albastrul poate ține mosquitos (țânțarii) la distanță.\n" +
                    "\n" +
                    "Singurele lucruri care întrerup pe alocuri cursivitatea albastrului sunt tonurile pământii ale păturilor țesute manual, covoarele sau abajururile dispuse în fața micilor magazine. Nu-ți rămâne decât să te pierzi pe tine și tot ce ține de existența-ți cotidiană, plimbându-te pe-aceste străzi labirintice pietruite. "+"\n"+"------------------------------------------------------------ \n "+"https://www.momondo.ro/discover/top-atractii-turistice-din-lume");
            SendMessage(message, update);
        }
        if(response.equals("2")) {
            message.setText(" Tărâmul liber din Christiania, Copenhaga, Danemarca" + "\n" + "------------------------------------------------------------ \n" + "Copenhaga lui 1971: Revoluția hippie ajunge pe valu-i cel mai înalt, în vreme ce un grup de intruși ocupă incinta militară abandonată din zona portuară Christianshavn. Poliția eșuează în încercările de eliberare a zonei. În paralel, ia naștere o nouă comunitate bazată pe un stil de viață alternativ, pe toleranță și cu o guvernare proprie.\n" +
                    "\n" +
                    "Deși acceptată inițial sub considerentele unui experiment social, pentru a supraviețui de-a lungul timpului, Christiania este nevoită să se schimbe și să se adapteze continuu. Copenhaga lui 2016: În Christiania trăiesc acum în jur de 1000 de oameni. În acest ținut al libertății se pot distinge astăzi dovezile creativității și culturii hipiote: clădiri ridicate sub pecetea DIY, grădini liniștite, localuri cu muzică și mici restaurante cu aer de familie.\n" +
                    "\n" +
                    "Christiania a fost dintotdeauna o zonă controversată, iar comerțul cu hașiș, deși își are partea lui de răspundere, nu este deloc singurul culpabil. Cu toate că este o zonă la fel de sigură ca oricare alta, s-a considerat că regula de căpătâi trebuie să rămână de-a pururi însemnată pe zidul de la intrare: „filmarea este strict interzisă, în special pe „Pusher Street”, una dintre străduțele principale.\n" +
                    "\n" +
                    "(N-am ști să spunem exact dacă pe alte străduțe sunt mai puțin interzise, dar o certitudine o avem: orice cameră video sau intenție neortodoxă trebuie să stea departe de „Pusher Street!!)\n" +
                    "\n" +
                    "Citește și: Cele mai faine locuri scandinave – 3 zile petrecute în Copenhaga "+"\n"+"------------------------------------------------------------ \n "+"https://www.momondo.ro/discover/top-atractii-turistice-din-lume");
            SendMessage(message, update);
        }
        if(response.equals("3")) {
            message.setText(" Terasele de orez din Sapa, Vietnam" + "\n" + "------------------------------------------------------------ \n" + " Terasele nesfârșite de orez care alunecă la vale în pante văluroase, pădurile subțiri de bambus și munții cufundați în pătura de nori, toate fac din Sapa unul dintre orașele de poveste ale Vietnamului. Pe vremuri, această zonă nu era nimic mai mult decât o mare de pante abrupte cu un sol cât se poate de fertil.\n" +
                    "\n" +
                    "Încet-încet, localnicii au adoptat o tehnică foarte populară în zonele montane, începând să transforme treptele teraselor în pante, cu intenția vădită de a cultiva orez. Această metodă eficientă de a împrieteni natura reduce eroziunea solului și înlesnește irigarea culturilor.\n" +
                    "\n" +
                    "Dar agricultura mai scoate un as din mânecă și ne arată și obrazu-i estetic: privind acest peisaj, aproape vei uita complet că ai în față o cultură de orez, și nu un tărâm în care își fac veacul zâne, elfi și spiriduși.\n" +
                    "\n" +
                    "Culorile se schimbă după mendrele mișcării de revoluție a Pământului, astfel încât, în perioada iunie-iulie vei găsi câmpurile de orez musterde. Iar dacă ajungi aici în septembrie-octombrie le vei găsi deja coapte – câmpuri aurii în plină maturitate, cochetând cu pădurea verde de alături."+"\n"+" ------------------------------------------------------------ \n"+"https://www.momondo.ro/discover/top-atractii-turistice-din-lume");
            SendMessage(message, update);
        }
        if(response.equals("4")) {
            message.setText("Orașul – stat Vatican " + "\n" + "------------------------------------------------------------ \n" + " Impunătorul Vatican și-a câștigat independența și statutul legal de oraș-stat în 1929, devenind, totodată, și cel mai mic stat din lume. Dar 1929 nu are legătură cu importanța turistică pe care a avut-o dintotdeauna, indiferent de religia celor care i-au călcat pragul.\n" +
                    "\n" +
                    "Da, fără îndoială, la intrarea în cetate vei da peste numeroase manifestări ale clișeelor turistice, dar odată trecute standurile cu brelocuri inscripționate cu „Popemobile” (mai rar ceva atât de neinspirat), te așteaptă una dintre cele mai impresionante arhitecturi Baroc și Renascentiste.\n" +
                    "\n" +
                    "Pe măsură ce ochii ți se vor căsca la vederea gărzilor elvețiene îmbrăcate colorat, a Muzeului Vaticanului și a Bazilicii Sfântului Petru, sufletul se va simți iremediabil transportat cu 500 de ani în timp. Și roagă pe cineva să-ți filmeze reacția când te vei trezi în fața Capelei Sixtine. Vestea cea mai bună: poți vizita totul într-o singură zi.\n" +
                    "\n" +
                    "De notat: Deși nu este nicăieri negru pe alb scris că nu ai voie să vii cu mâinile și cu picioarele descoperite, dacă vrei să eviți sprâncene care se înalță în semn vădit de dezaprobare, fă bine și acoperă-te!\n" +
                    "\n" +
                    "De notat: Deși nu este nicăieri negru pe alb scris că nu ai voie să vii cu mâinile și cu picioarele descoperite, dacă vrei să eviți sprâncene care se înalță în semn vădit de dezaprobare, fă bine și acoperă-te!"+"\n"+" ------------------------------------------------------------ \n"+"https://www.momondo.ro/discover/top-atractii-turistice-din-lume");
            SendMessage(message, update);
        }
        if(response.equals("5")) {
            message.setText(" Cappadocia, Turcia" + "\n" + "------------------------------------------------------------ \n" + " u siguranță ai văzut tot soiul de ilustrări ale Cappadociei, dar este imposibil ca o biată fotografie să îi poată face dreptate acestei regiuni; pur și simplu nu are resurse pentru a concura cu adevărul de la fața locului. La numai o oră de condus de la Kayseri, cel mai mare oraș din Anatolia, acest regat antic a existat, într-o formă sau alta, de mai bine de 3500 de ani. Astăzi, hotelurile-grotă care îl populează, împreună cu formațiunile facile de rocă vulcanică îi surprind chiar și pe cei mai sobri din milionul de călători ajunși aici în fiecare an.\n" +
                    "\n" +
                    "Nu e cale mai bună de a trage la măseaua privirii aici decât să iei calea norilor. Poate că prețul de 200€ al unei călătorii cu balonul cu aer cald îți poate părea un șiretlic turistic mârșav, dar nu îl lăsa să te dea înapoi. Vei vedea că merită până la ultimul bănuț. Și nu ar fi de mirare ca, după ce te întorci pe pământ, să te simți mânat de imboldul de a mai și lăsa ceva peste.\n" +
                    "\n" +
                    "De notat: Scoate tot untul din experiența pe deasupra Cappadociei, plasând-o undeva înainte de răsăritul soarelui"+"\n"+"------------------------------------------------------------ \n "+"https://www.momondo.ro/discover/top-atractii-turistice-din-lume");
            SendMessage(message, update);
        }
        if(response.equals("6")) {
            message.setText("Palatul Versailles, Franța " + "\n" + "------------------------------------------------------------ \n" + "Deși Franța abundă de castele regale, toate pălesc în fața grandorii celui de la Versailles. Acest château enorm construit în stil baroc a fost numit „casă” de către familia regală din 1682 și până când Revoluția Franceză a văzut lumina soarelui în 1789.\n" +
                    "\n" +
                    "Astăzi, castelul își ține porțile deschise pentru prinți și cerșetori deopotrivă (plus toate categoriile sociale aflate între) și numai o oră de mers cu trenul din Centrul Parisului îl desparte de orice ochi gurmand de frumos. Lasă ca o plimbare lejeră prin Grădinile Regale de la Versailles să se ocupe de debutul călătoriei tale înainte de a te ascunde la umbra Marelui Palat Trianon.\n" +
                    "\n" +
                    "După ce abia ți-ai umezit buzele cu splendorile regale și te simți pregătit să înfrunți coada din fața palatului pentru a te ghiftui cum se cuvine, așază-te cuminte și pregătește-te pentru piesa de rezistență: Galeria Oglinzilor. Acest culoar lung de 73 de metri ține sub acoperișu-i 17 oglinzi uriașe dispuse de o parte și de alta, 17 ferestre la fel de grandiose care dau spre grădina de afară și o frescă din calea-afară de opulentă ce se îndeletnicește cu povestitul grozăviilor săvârșite de conducătorii francezi. "+"\n"+" ------------------------------------------------------------ \n"+"https://www.momondo.ro/discover/top-atractii-turistice-din-lume");
            SendMessage(message, update);
        }
        if(response.equals("7")) {
            message.setText("Mănăstirile de la Meteora, Grecia " + "\n" + "------------------------------------------------------------ \n" + "Vechile mănăstiri ortodoxe de la Meteora sunt exact locul unde natura și arhitectura și-au dat mâna și au lucrat împreună la moștenirea umanității. Aceste formațiuni de rocă pot privi ca de la egal la egal o clădire cu 120 de etaje și adăpostesc 6 mănăstiri ce au copilărit în secolul XIV.\n" +
                    "\n" +
                    "Legendele spun că primii oameni care au populat zona, au ajuns aici în secolul IX și au luat drumul sihăstriei, locuind în micile peșteri ale locului și transportând lucruri înăuntru și în afara grotelor folosindu-se coșuri și plase legate cu sfori.\n" +
                    "\n" +
                    "Cu trecerea anilor, s-a format o mică comunitate care a învățat să se apere împotriva invadatorilor, începând să construiască mănăstiri. Deși, în prezent, treptele săpate în rocă reprezintă metode mai îngăduitoare de a pătrunde în mănăstiri, încă este nevoie de ceva ambiție pentru a urca până în vârf. Dar odată ajuns, vei înțelege prea bine de ce călugării încă vor să trăiască acolo. "+"\n"+" ------------------------------------------------------------ \n"+"https://www.momondo.ro/discover/top-atractii-turistice-din-lume");
            SendMessage(message, update);
        }
        if(response.equals("8")) {
            message.setText("Laguna Albastră + luminile nordice, Islanda " + "\n" + "------------------------------------------------------------ \n" + "Când urechile aud cuvântul „Islanda”, ochii minții nu pot să înfățișeze altceva decât Laguna Albastră. Acest spa geotermal a devenit sinonim de sens pentru regiunea nordică, iar popularitatea tot mai crescândă din ultimii ani l-a transformat într-un loc deosebit de vizitat.\n" +
                    "\n" +
                    "Credem cu toată tăria că cei 50 de kilometri care despart laguna de orașul Reykjavik, precum și cei 45€ plătiți la intrare sunt eforturi prea puțin însemnate pentru răsfățul care te așteaptă. Proximitatea față de zona cu lavă și condițiile geologice din împrejurimi ridică temperatura apei la 39 °C și o alimentează cu minerale precum sulful și siliciul, așa încât cei ce ajung aici pentru o baie fierbinte, mai beneficiază și de tratament natural pentru reîntinerire.\n" +
                    "\n" +
                    "Iar dacă norocul face să călătorești în timpul toamnei sau al iernii islandeze, nu trebuie sub nicio formă să-ți scape dansul de lumini al Aurorei Boreale, una dintre altele minuni date ochiului de pământean.\n" +
                    "\n" +
                    "De notat: Dacă astrele sunt așezate potrivit, vizitează chiar acum website-ul Lagunei Albastre și cumpără-ți bilete. De ce ar fi o altă zi mai potrivită decât asta pentru a-ți lua elanul? "+"\n"+" ------------------------------------------------------------ \n"+"https://www.momondo.ro/discover/top-atractii-turistice-din-lume");
            SendMessage(message, update);
        }
        if(response.equals("9")) {
            message.setText("Orașul Petra din Iordania " + "\n" + "------------------------------------------------------------ \n" + "În Orientul Mijlociu, Petra este cunoscută ca o oază de pace, dar audiența ceva mai vestică o asociază mai degrabă cu o cultură pop; această ultimă tendință nu este străină de producții cinematografice precum Indiana Jones și ultima Cruciadă sau de Transformers 2.\n" +
                    "\n" +
                    "Deși intenția oamenilor de a trece acest monument al Patrimoniului UNESCO pe lista personală de lucruri văzute este strunită de filmele mai sus numite, ceea ce rămâne impregnat în memorie și în suflet după întoarcerea acasă este, fără îndoială, frumusețea tulburătoare și autenticitatea orașului Petra.\n" +
                    "\n" +
                    "Construit de către nabateeni în anul 300 î.Hr cu migală absolută și atenție copleșitoare pentru detalii, acest sit arheologic încorporează morminte, grajduri și chiar un amfiteatru antic, toate sculptate în piatra de nisip a falezei. Lasă lipsa de cuvinte resimțită aici pe seama uimirii pe măsură ce explorezi orașul, iar când simți că puterile încep să-și cam ia tălpășița din trupu-ți și la fel și soarele de pe întinsul cer, întoarce-te la templul Al Khazneh.\n" +
                    "\n" +
                    "Petrece acolo câteva momente de contemplare la lumina roșie a unei lumânări și vei înțelege prea bine de ce locul mai este cunoscut drept „Comoara”. "+"\n"+"------------------------------------------------------------ \n "+"https://www.momondo.ro/discover/top-atractii-turistice-din-lume");
            SendMessage(message, update);
        }
        if(response.equals("10")) {
            message.setText("Machu Picchu, Peru " + "\n" + "------------------------------------------------------------ \n" + " Nu mulți se lansează în dispute atunci când se afirmă că Machu Picchu este cea mai mare atracție din America de Sud. Cel puțin nu cei ce cunosc câte ceva despre farmecul puțin pământean al acestui loc situat la 2431 de metri față de nivelul mării.\n" +
                    "\n" +
                    "Construit undeva pe la mijlocul secolului XV, Machu Picchu rămâne cea mai mare realizare a Imperiului Incaș. Și deși timpul a ținut cu tot dinadinsul să-și facă simțită prezența asupra acestor ruine, nu a reușit să erodeze chintesența construcțiilor incașe.\n" +
                    "\n" +
                    "Scările, templele, apeductele și punctele de observație se găsesc împrăștiate într-un labirint de peisaje montane întins pe 12 acri (presque 50.000 de m²). De la o așezare situată puțin deasupra nivelului norilor te-ai aștepta să nu se ajungă prea lesne, dar Machu Picchu surprinde și aici.\n" +
                    "\n" +
                    "Văzându-te ajuns în orașul Cuzco (după un zbor de numai 90 de minute din aeroportul Lima) poți lua, fie trenul, fie autobuzul, fie, dacă te simți cu toate puterile la ele acasă, te poți alătura unui grup de drumeți, pornind-o la pas în susul dealului."+"\n"+"------------------------------------------------------------ \n "+"https://www.momondo.ro/discover/top-atractii-turistice-din-lume");
            SendMessage(message, update);
        }
        if(response.equals("Inapoooi")){}


        if (response.equals("Inapoooi")) {
            row25.clear();
            row26.clear();
            row27.clear();
            row15.clear();
            keyboard.clear();


            row25.add("Turcia\uD83C\uDDF9\uD83C\uDDF7");
            row25.add("Bulgaria\uD83C\uDDE7\uD83C\uDDEC");
            row26.add("Grecia\uD83C\uDDEC\uD83C\uDDF7");
            row26.add("Cipru\uD83C\uDDE8\uD83C\uDDFE");
            row27.add("Spania\uD83C\uDDEA\uD83C\uDDF8");
            row27.add("Italia\uD83C\uDDEE\uD83C\uDDF9");
            row15.add("Inapoiii");
            keyboard.add(row25);
            keyboard.add(row26);
            keyboard.add(row27);
            keyboard.add(row15);
            replykeyboardmarkup.setKeyboard(keyboard);
            message.setReplyMarkup(replykeyboardmarkup);
            message.setText("Alege tara in care ai dori sa calatoresti:");
            SendMessage(message, update);

        }


        if (response.equals("Turcia\uD83C\uDDF9\uD83C\uDDF7")) {


        }
        if (response.equals("Bulgaria\uD83C\uDDE7\uD83C\uDDEC")) {


        }
        if (response.equals("Grecia\uD83C\uDDEC\uD83C\uDDF7")) {


        }
        if (response.equals("Cipru\uD83C\uDDE8\uD83C\uDDFE")) {


        }
        if (response.equals("Spania\uD83C\uDDEA\uD83C\uDDF8")) {

        }
        if (response.equals("Italia\uD83C\uDDEE\uD83C\uDDF9")) {

        }
        if (response.equals("Inapoiii")) {

        }



    }



    public String getBotUsername() {
        return "niku_final_bot";
    }

    public String getBotToken() {
        return "1277069733:AAFpuQbagzfyMxTxpq4Z-UXvjbzUyEjB2ZI";
    }

    public void SendMessage(SendMessage message, Update update)  {
        message.setChatId(update.getMessage().getChatId());

        try{
            execute(message);
        }
        catch (TelegramApiException e){
            e.printStackTrace();
        }
    }

}
