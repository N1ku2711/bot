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
            message.setText("Dobrinishte este faimoasa spa sta??iune, situata pe poalele mun??ii Pirin in partea de sud - est a valea Razlog la altitudine de 810 m deasupra nivelul m??rii.  " + " \n" + "------------------------------------------------------------ \n" + " https://bulgariaschi.ro/otherresorts/dobrinishte.shtml");
            SendMessage(message, update);


        }
        if (response.equals("Bodrost\uD83C\uDDE7\uD83C\uDDEC")) {
            message.setText("Bodrost se afla in regiunea Kartala, la 30 km de ora??ul Blagoevgrad. Este o mica sta??iune de schi, situata in partea sud-vest al mun??ii Rila la o altitudine de 1300 m. Sta??iunea ofer?? condi??ii bune de schi pentru ??ncepatori. Zona de schi Karlata este foarte buna cu stratul de z??pad?? bine ??ntre??inut din Decembrie pana la Aprilie." + "\n" + "------------------------------------------------------------ \n" + "https://bulgariaschi.ro/otherresorts/bodrost.shtml");
            SendMessage(message, update);

        }
        if (response.equals("Govedartsi\uD83C\uDDE7\uD83C\uDDEC")) {
            message.setText("Satul Govedartsi se afla la 80 km de Sofia, in Mun??ii Rila, l??nga r??ul Cherni Iskar. Turi??ti pot ajunge pe jos in valea Maliovitsa sau pot urca v??rful Maliovitsa pentru a se bucura la priveli??ti deosebite. Satul este un punct de plecare pe trasee spre manastirea Rila ??i Cele ??apte lacuri Rila. Aproape de satul este situat lacul Iovchevo, unde pute??i sa face??i un picnic. In regiune va pute??i plimba prin padurile frumoase de conifere, plini de fructe de padure, ciuperci ??i ierburi. ??n iarna zona ofer?? condi??ii foarte bune de schi. La dispozi??ie turi??tilor sunt mijloace de transport care fac legatura cu ora??ul Samokov unde dvs. pute??i vizita muzeele locale. " + "\n" + "------------------------------------------------------------ \n" + "https://bulgariaschi.ro/govedartsi/index.html");
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
            row12.add("Bra??ov\uD83C\uDDF7\uD83C\uDDF4");
            row12.add("Piatra Neam??\uD83C\uDDF7\uD83C\uDDF4");
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
            message.setText("Supranumit?? ???Perla Carpa??ilor???, Sinaia, fosta re??edin???? de var?? a Familiei Regale a Rom??niei, a r??mas ??i ??n prezent una dintre cele mai apreciate sta??iuni din ??ara noastr??. Or????elul situat la poalele mun??ilor Bucegi este cochet ??i se bucur?? de un peisaj superb, care atrage ??n orice sezon turi??ti de toate v??rstele." +
                    "\n" +
                    "Iarna, iubitorii schiului pot s?? se dea pe cele 14 p??rtii de dificult????i diferite. Vara, din Sinaia se pot face o mul??ime de drume??ii. De exemplu, ??n maxim o or?? ??i jum??tate de mers lejer de la Castelul Pele?? se poate ajunge ??ntr-un peisaj de poveste, la St??na Regal??. Din Sinaia se pot face drume??ii c??tre Cota 1400, Cota 2000, Piatra Ars??, Babele sau Vf. Omu. " + "\n" + "------------------------------------------------------------ \n" + "https://romania.directbooking.ro/prezentare-sinaia-informatii-poze-imagini-42.aspx ");
            SendMessage(message, update);
        }
        if (response.equals("Bra??ov\uD83C\uDDF7\uD83C\uDDF4")) {
            message.setText("Cunoscut ??i ca ???Ora??ul de sub T??mpa???, Bra??ov este ??n topul celor mai vizitate ora??e din Rom??nia. Amplasarea deosebit??, sub muntele T??mpa, centrul istoric plin de farmec cu cl??dirile sale ??n stil baroc, Pia??a Sfatului sau Biserica Neagr?? sunt doar c??teva din lucrurile care ??i atrag pe turi??ti an de an. Dac?? sunte??i ??ntr-o vizit?? prin Bra??ov, nu trebuie s?? rata??i nici Cet????uia de pe Straja, o fortifica??ie medieval?? impresionant??. De asemenea, este obligatoriu s?? face??i ??i o drume??ie pe T??mpa sau o excursie p??n?? ??n Poiana Bra??ov, sta??iunea preferat?? a schiorilor din Rom??nia. Iarna, ??n Poian?? schiorii se pot da pe 12 p??rtii de dificult????i diferite, iar vara pot pleca ??n drume??ii pe c??r??ri cu priveli??ti ??nc??nt??toare." + "\n" + "------------------------------------------------------------ \n" + "https://www.ghid-brasov.ro/");
            SendMessage(message, update);
        }
        if (response.equals("Predeal\uD83C\uDDF7\uD83C\uDDF4")) {
            message.setText("Sta??iunea Predeal este situat?? ??n centrul Rom??niei pe Valea Prahovei, ??ntre r??urile Prahova ??i Timi??, la poalele mun??ilor Bucegi la nord-est de ace??tia ??i cele ale mun??ilor Baiului la nord-vest. Ora??ul Predeal este cel mai inalt oras din tara, aflat la altitudinea de 1030m-1110m" + "\n" + "------------------------------------------------------------ \n" + "https://romania.directbooking.ro/prezentare-predeal-informatii-poze-imagini-39.aspx");
            SendMessage(message, update);
        }
        if (response.equals("Sovata\uD83C\uDDF7\uD83C\uDDF4")) {
            message.setText(" Sta??iune cu sezon permanent, Sovata a fost men??ionat?? pentru prima data ca loc t??m??duitor ??ntr-un document din 1597, dar abia ??n 1850 devine sta??iune balnear??. Este ??nconjurat?? de dealurile Cire??elu (912 m), Capela (720 m), Bechi?? (1.079 m), Dealul Mic ??i Muntele de Sare, fiind acoperit?? cu p??duri de fagi, stejari, carpeni, ulmi, castani, brazi ??i mesteceni." + "\n" + "------------------------------------------------------------ \n" + "https://romania.directbooking.ro/prezentare-sovata-informatii-poze-imagini-56.aspx ");
            SendMessage(message, update);
        }
        if (response.equals("Piatra Neam??\uD83C\uDDF7\uD83C\uDDF4")) {
            message.setText(" Municipiul Piatra Neam?? ??? re??edin??a jude??ului Neam?? ??? este a??ezat pe valea r??ului Bistri??a, mai exact la ie??irea acestuia dintre mun??i, la confluen??a cu p??r??ul Cuiejdi. Piatra Neam?? este amplasat ??ntr-un bazin intramontan, la altitudinea de 310 m, str??juit de culmile Pietricica (590 m) la sud-est, Cozla (679 m) la nord, Cernegura (852 m) la sud-vest, C??rloman (617 m) la nord-vest ??i B??tca Doamnei (462 m) la sud-vest." + "\n" + "------------------------------------------------------------ \n" + "https://romania.directbooking.ro/prezentare-piatra-neamt-informatii-poze-imagini-2252.aspx ");
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
            message.setText("Cel mai ??nalt munte ??i centrul din Austria al Parcului Na??ional High Tauern Pute??i s?? v?? apropia??i de Grossglockner ??n mai multe moduri diferite: este cel mai ??nalt munte al Republicii Alpine, una dintre cele mai atr??g??toare altitudine din Alpii de Est ??i v??rful pasiunii pentru mul??i alpinisti. . Muntele este, de asemenea, acas?? pentru oameni, numeroase animale ??i plante rare. Glockner este ??nvelit ??n secret, este chestia legendei ??i are o mare putere atr??g??toare. Este un obstacol pe calea de la nord la sud, totu??i un loc unde a fost dep????it prin milenii. Al??tura??i-v?? ??i cunoa??te??i maiestatea sa, Grossglockner, ??n numeroasele sale aspecte! " + "\n" + "------------------------------------------------------------ \n" + " https://www.tripadvisor.com/Attraction_Review-g190442-d195488-Reviews-Grossglockner-Tirol_Austrian_Alps.html");
            SendMessage(message, update);
        }
        if(response.equals("Kitzsteinhorn\uD83C\uDDE6\uD83C\uDDF9")) {
            message.setText(" Kitzsteinhorn este legendar: nu este doar un ghe??ar, ci este ghe??arul. Cea mai ??nalt?? zon?? de schi din Salzburg ofer?? o experien???? alpin?? de neegalat 365 de zile pe an. E aici c?? ??ncepe sezonul de iarn??. ??ncep??nd din toamn??, ve??i g??si deja z??pada perfect?? pentru o experien???? perfect?? de sporturi de iarn??. Indiferent dac?? circula??i pe p??rtii albe verzi sau pe traseele spectaculoase de schi off-piste sau pe bordul dvs. ??n parcurile de z??pad??, varietatea de op??iuni pe care le ve??i g??si este de neegalat." + "\n" + "------------------------------------------------------------ \n" + " https://www.tripadvisor.com/Attraction_Review-g608661-d1230926-Reviews-Kitzsteinhorn-Kaprun_Austrian_Alps.html");
            SendMessage(message, update);
        }
        if(response.equals("Gollinger Wasserfall\uD83C\uDDE6\uD83C\uDDF9")) {
            message.setText(" Impressive nature spectacle in Golling\n" +
                    "In the part of Golling known as Torren (???torren??? Romanic: torrential mountain river), near the fascinating late gothic pilgrimage church of St. Nikolaus, the Golling waterfalls plunge 75 metres down two giant steps into the valley below. The thunderous Golling falls are one of the provinces most attractive and romantic natural monuments." + "\n" + "------------------------------------------------------------ \n" + "https://www.golling.info/en/experience-excursion/golling-falls ");
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
            message.setText("Situat ??n Istanbul, la 1,1 km de Moscheea Suleymaniye, Beethoven Senfoni Hotel ofer?? cazare cu aer condi??ionat ??i un bar. Hotelul se afl?? la 1,7 km de Coloana lui Constantin ??i la 2,3 km de Moscheea Albastr??, iar oaspe??ii au la dispozi??ie un centru de wellness ??i spa ??i o teras??. De asemenea, oaspe??ii beneficiaz?? de recep??ie cu program nonstop, serviciu de transfer de la/la aeroport, room-service ??i acces gratuit la internet WiFi ??n ??ntreaga proprietate. " + "\n" + "------------------------------------------------------------ \n" + " https://www.booking.com/hotel/tr/beethoven-senfoni.ro.html?aid=356980;label=gog235jc-1DCAIo5AFCAnRySCBYA2iOAYgBAZgBILgBF8gBDNgBA-gBAfgBAogCAagCA7gCmsu09gXAAgE;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=-755070;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=1;hpos=1;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590503702;srpvid=436e668b28fe015d;type=total;ucfs=1&#hotelTmpl");
            SendMessage(message, update);
        }


        if (response.equals("Alanya\uD83C\uDDF9\uD83C\uDDF7")) {
            message.setText(" Situat ??n Alanya, la 500 de metri de autogara din Alanya ??i la 400 de metri de plaja Kleopatra, Cleopatra King Apart ofer?? cazare cu WiFi gratuit.\n" +
                    "\n" +
                    "Cu balcon cu vedere la munte, toate unit????ile sunt prev??zute cu buc??t??rie complet utilat??.\n" +
                    "\n" +
                    "Hotelul de apartamente serve??te un mic dejun continental sau halal.\n" +
                    "\n" +
                    "Cleopatra King Apart are ??i o piscin?? ??n aer liber.\n" +
                    "\n" +
                    "De asemenea, unitatea de cazare include o teras??.\n" +
                    "\n" +
                    "Printre punctele populare de interes din apropierea hotelului Cleopatra King Apart se num??r?? parcul acvatic Alanya, Muzeul de Arheologie din Alanya ??i Pe??tera Damlatas. Cel mai apropiat aeroport este Aeroportul din Gazipasa, aflat la 40 km de hotelul de apartamente." + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/tr/cleopatrakingapart.ro.html?aid=356980;label=gog235jc-1DCAIo5AFCAnRySCBYA2iOAYgBAZgBILgBF8gBDNgBA-gBAfgBAogCAagCA7gCmsu09gXAAgE;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=-734728;dest_type=city;dist=0;from_beach_non_key_ufi_sr=1;group_adults=2;group_children=0;hapos=1;hpos=1;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590503885;srpvid=cc0f66e6d444000c;type=total;ucfs=1&#hotelTmpl ");
            SendMessage(message, update);

        }
        if (response.equals("Antalya\uD83C\uDDF9\uD83C\uDDF7")) {

            message.setText(" Aflat la doar 100 de metri de plaja Konyaalti, Hotelul Lemon ofer?? camere cu aer condi??ionat ??i Wi-Fi gratuit. Hotelul include o piscin?? ??n aer liber cu o sec??iune separat?? pentru copii.\n" +
                    "\n" +
                    "Toate camerele de la Hotelul Lemon sunt izolate fonic, pentru un confort sporit. Ofer??, de asemenea, un balcon privat cu vedere la piscina ??n aer liber sau la Marea Mediteran??." + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/tr/lemon.ro.html?aid=356980;label=gog235jc-1DCAIo5AFCAnRySCBYA2iOAYgBAZgBILgBF8gBDNgBA-gBAfgBAogCAagCA7gCmsu09gXAAgE;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=-735347;dest_type=city;dist=0;from_beach_non_key_ufi_sr=1;group_adults=2;group_children=0;hapos=1;hpos=1;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590503949;srpvid=eb8967067df80195;type=total;ucfs=1&#hotelTmpl ");
            SendMessage(message, update);
        }
        if (response.equals("Marmaris\uD83C\uDDF9\uD83C\uDDF7")) {

            message.setText(
                    "Hotelul de apartamente Club Aquarium este situat ??n Icmeler. Proprietatea ofer?? facilit????i de sporturi acvatice, piscin?? sezonier?? ??n aer liber ??i acces WiFi gratuit.\n" +
                            "\n" +
                            "Unit????ile au aer condi??ionat, zon?? de relaxare cu TV prin satelit cu ecran plat, buc??t??rie complet utilat?? ??i baie privat??, prev??zut?? cu du?? ??i usc??tor de p??r.\n" +
                            "\n" +
                            "Proprietatea ofer?? zilnic mic dejun continental.\n" +
                            "\n" +
                            "Hotelul de apartamente are ??i o teras??.\n" +
                            "\n" +
                            "Zona este apreciat?? de amatorii de ciclism, iar proprietatea ofer?? serviciu de ??nchiriere de biciclete. " + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/tr/club-aquarium.ro.html?aid=356980;label=gog235jc-1DCAIo5AFCAnRySCBYA2iOAYgBAZgBILgBF8gBDNgBA-gBAfgBAogCAagCA7gCmsu09gXAAgE;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=-764696;dest_type=city;dist=0;from_beach_key_ufi_sr=1;group_adults=2;group_children=0;hapos=1;hpos=1;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590504001;srpvid=13df6720ca2f00f7;type=total;ucfs=1&#hotelTmpl ");
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
            message.setText(" Oferind un bar ??i o zon?? de plaj?? privat?? cu ??ezlonguri gratuite, Astoria Mare All Inclusive se afl?? ??n sta??iunea Nisipurile de Aur. La aceast?? proprietate exist?? un club al copiilor ??i un loc de joac?? pentru copii. Hotelul are 2 piscine, centru de fitness, program de divertisment de sear?? ??i recep??ie deschis?? non-stop.Hotelul are 3 restaurante care fac parte din programul all inclusive. Oaspe??ii pot lua masa la bufetul-restaurant principal, precum ??i la restaurantul italian ??i la cel oriental. Barul din hol ??i barul de la piscin?? ofer?? consuma??ie nelimitat?? de b??uturi alcoolice locale ??i b??uturi nealcoolice." + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/bg/astoria-mare-all-inclusive-zlatni-piastsi.ro.html?aid=356980&label=gog235jc-1DCAMYASgXQgxnb2xkZW4tc2FuZHNIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAL12rT2BcACAQ&sid=7dd80e9ddb9598b26cd4f6d53f249e9b&lp_sr_snippet=1 ");
            SendMessage(message, update);
        }

        if(response.equals("Cabacum Plaza\uD83C\uDDE7\uD83C\uDDEC")) {
            message.setText(" Cabacum Plaza Beach Apartments se afl?? ??n sta??iunea Nisipurile de Aur, pe malul m??rii, l??ng?? plaja Cabacum ??i pune la dispozi??ie o piscin?? sezonier?? ??n aer liber ??i teras?? la soare. Centrul sta??iunii Nisipurile de Aur se afl?? la 3,3 km. Oaspe??ii beneficiaz?? de acces gratuit la conexiunea WiFi ??n ??ntreaga proprietate ??i de o parcare privat?? gratuit??.\n" +
                    "\n" +
                    "Toate unit????ile au aer condi??ionat, zon?? de luat masa ??i zon?? de relaxare cu TV cu ecran plat ??i canale prin cablu. Exist?? ??i o buc??t??rie utilat?? cu plit??, frigider ??i cuptor cu microunde. Fiecare unitate include o baie privat?? cu du?? sau cad??. Se asigur?? prosoape ??i lenjerie de pat, care sunt schimbate la fiecare 3 zile." + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/bg/cabacum-plaza.ro.html?aid=356980&label=gog235jc-1DCAMYASgXQgxnb2xkZW4tc2FuZHNIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAL12rT2BcACAQ&sid=7dd80e9ddb9598b26cd4f6d53f249e9b&lp_sr_snippet=1 ");
            SendMessage(message, update);
        }

        if(response.equals("La Mer Apartcomplex\uD83C\uDDE7\uD83C\uDDEC")) {
            message.setText(" La Mer Apartcomplex se afl?? la mai pu??in de 200 de metri de plaja Riviera ??i ofer?? restaurant, piscin?? sezonier?? ??n aer liber, bar ??i lounge comun. Oaspe??ii beneficiaz?? de parcare privat?? ??i de WiFi gratuit ??n ??ntreaga proprietate.\n" +
                    "\n" +
                    "Oaspe??ii acestui aparthotel pot lua un mic dejun continental sau tip bufet.\n" +
                    "\n" +
                    "La Mer Apartcomplex ofer?? o teras?? la soare.\n" +
                    "\n" +
                    "Proprietatea are gr??din?? ??i un loc de joac?? pentru copii." + "\n" + "------------------------------------------------------------ \n" + " https://www.booking.com/hotel/bg/la-mer-apartcomplex.ro.html?aid=356980&label=gog235jc-1DCAMYASgXQgxnb2xkZW4tc2FuZHNIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAL12rT2BcACAQ&sid=7dd80e9ddb9598b26cd4f6d53f249e9b&lp_sr_snippet=1");
            SendMessage(message, update);
        }

        if(response.equals("Grifid Hotel Foresta\uD83C\uDDE7\uD83C\uDDEC")) {
            message.setText("Hotelul Grifid Foresta ofer?? servicii all inclusive ??i este situat ??ntr-o zon?? lini??tit?? din Nisipurile de Aur, la 800 de metri de plaja cu nisip ??i de centrul sta??iunii.\n" +
                    "\n" +
                    "Hotelul are restaurant, un bar ??n hol ??i piscin?? ??n aer liber, ??nconjurat?? de o teras?? cu ??ezlonguri. To??i oaspe??ii au la dispozi??ie o parcare privat?? cu plat??, iar accesul la internet WiFi este gratuit ??n toate camerele ??i ??n hol.\n" +
                    "\n" +
                    "Toate camerele au balcon; de asemenea, ofer?? aer condi??ionat, TV prin satelit ??i o baie privat?? modern?? cu du?? ??i usc??tor de p??r. Se ofer?? cutie de valori (la un cost suplimentar) ??i un minibar gratuit ??n fiecare camer??. " + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/bg/grifid-foresta.ro.html?aid=356980&label=gog235jc-1DCAMYASgXQgxnb2xkZW4tc2FuZHNIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAL12rT2BcACAQ&sid=7dd80e9ddb9598b26cd4f6d53f249e9b&lp_sr_snippet=1 ");
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
            message.setText("Fani House se afl?? ??n Kallithea Halkidikis, la 15 km de Hanioti, ??i are gr??din?? ??i WiFi gratuit.\n" +
                    "\n" +
                    "Sani Beach este la 20 km de apartament, iar Afitos se afl?? la 4,1 km. Cel mai apropiat aeroport este Aeroportul Salonic, situat la 79 km de Fani House.\n" +
                    "\n" +
                    "Acesta este locul preferat de turi??tii din Kallithea Halkidikis, conform comentariilor independente.\n" +
                    "\n" +
                    "Cuplurile apreciaz?? ??n mod deosebit aceast?? loca??ie. I-au dat scorul 8,5 pentru un sejur pentru 2 persoane. " + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/gr/fani-house-kallithea-khalkidikes.ro.html?aid=356980;label=gog235jc-1DCAYYAShcQgloYWxraWRpa2lIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAKv4rT2BcACAQ;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=819;dest_type=region;dist=0;group_adults=2;group_children=0;hapos=1;hpos=1;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590505781;srpvid=b0fb6a9ade010146;type=total;ucfs=1&#hotelTmpl ");
            SendMessage(message, update);
        }
        if(response.equals("Maria's Resort \uD83C\uDDEC\uD83C\uDDF7")) {
            message.setText(" Maria's Resort se afl?? ??n zona Stavros Thessalonikis ??i ofer?? studiouri dotate cu aer condi??ionat care sunt amplasate ??n jurul unei piscine cu form?? neregulat??. La proprietate exist?? de asemenea un snack bar ??i o cad?? cu hidromasaj ??n aer liber.\n" +
                    "\n" +
                    "Studiourile de la Maria's Resort sunt amenajate cu mobilier din lemn deschis la culoare ??i pardoseal?? de gresie. Acestea includ de asemenea o chicinet?? cu o mic?? zon?? de luat masa, un televizor ??i o baie privat?? cu du??." + "\n" + "------------------------------------------------------------ \n" + " https://www.booking.com/hotel/gr/maria-lux.ro.html?aid=356980;label=gog235jc-1DCAYYAShcQgloYWxraWRpa2lIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAKv4rT2BcACAQ;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=819;dest_type=region;dist=0;group_adults=2;group_children=0;hapos=3;hpos=3;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590505781;srpvid=b0fb6a9ade010146;type=total;ucfs=1&#hotelTmpl");
            SendMessage(message, update);
        }
        if(response.equals("Ammouda Villas \uD83C\uDDEC\uD83C\uDDF7")) {
            message.setText(" Situat la doar 50 de metri de plaj??, Ammouda Villas ofer?? unit????i de cazare ??n sistem self-catering, decorate elegant, cu acces WiFi gratuit ??n Ormos Panagias. Se afl?? ??n mijlocul unor gr??dini bine ??ngrijite ??i are o teras?? la soare, facilit????i de tenis de mas?? ??i de gr??tar Situat ??n mijlocul gr??dini bine ??ngrijite, aceasta are o teras?? la soare, ??mpreun?? cu un tenis de mas?? ??i facilit????i de gr??tar." + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/gr/ammouda-villas-4.ro.html?aid=356980;label=gog235jc-1DCAYYAShcQgloYWxraWRpa2lIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAKv4rT2BcACAQ;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=819;dest_type=region;dist=0;group_adults=2;group_children=0;hapos=4;hpos=4;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590505781;srpvid=b0fb6a9ade010146;type=total;ucfs=1&#hotelTmpl ");
            SendMessage(message, update);
        }
        if(response.equals("Gkoloi Studios & Apartments\uD83C\uDDEC\uD83C\uDDF7")) {
            message.setText("Situat ??n centrul ora??ului Kalivia Poliyirou, la doar c????iva metri de plaj??, Gkoloi Studios & Apartments ofer?? unit????i de cazare ??n sistem self-catering, cu balcon cu vedere la Marea Egee. Barurile de pe plaj?? ??i cafenelele se afl?? la 2 minute de mers pe jos.\n" +
                    "\n" +
                    "Toate unit????ile de cazare de la Gkoloi au o chicinet?? cu facilit????i de g??tit ??i frigider. Fiecare are un TV ??i o baie privat?? cu du??. " + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/gr/gkoloi-studios-and-apartments.ro.html?aid=356980;label=gog235jc-1DCAYYAShcQgloYWxraWRpa2lIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAKv4rT2BcACAQ;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=819;dest_type=region;dist=0;group_adults=2;group_children=0;hapos=9;hpos=9;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590505781;srpvid=b0fb6a9ade010146;type=total;ucfs=1&#hotelTmpl ");
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
            message.setText("Hadjios Valley se afl?? la mai pu??in de 2,5 km de plaja din Mazotos ??i are o piscin?? mare ??i un snack bar. Ofer?? vile spa??ioase ??n sistem self-catering, cu balcon sau patio cu vedere la gr??din?? ??i la terasa la soare. Accesul la internet prin fibr?? optic?? de mare vitez?? este gratuit.\n" +
                    "\n" +
                    "Toate vilele complexului Hadjios Valley au aer condi??ionat ??i o buc??t??rie utilat?? complet, cu aragaz, frigider, cuptor cu microunde ??i ma??in?? de sp??lat. Fiecare vil?? include o camer?? de zi cu canapea ??i TV cu ecran plat. " + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/cy/hadjios-valley.ro.html?aid=356980;label=gog235jc-1DCAIoOUICY3lIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAK67LT2BcACAQ;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=55;dest_type=country;dist=0;group_adults=2;group_children=0;hapos=2;hpos=2;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590507076;srpvid=c5ea6d22e87a0034;type=total;ucfs=1&#hotelTmpl ");
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
            message.setText("Ciutat de Barcelona se afl?? ??n Cartierul Gotic din Barcelona, la doar 100 de metri de Muzeul Picasso. Are o piscin?? ??n aer liber pe acoperi?? ??i ofer?? camere izolate fonic, dotate cu aer condi??ionat, WiFi gratuit ??i TV cu ecran plat.\n" +
                    "\n" +
                    "Camerele Hotelului Ciutat Barcelona au ??nc??lzire ??i includ birou. Baia privat?? este dotat?? cu usc??tor de p??r ??i articole de toalet?? ecologice marca Pure. " + "\n" + "------------------------------------------------------------ \n" + " https://www.booking.com/hotel/es/ciutat-de-barcelona.ro.html?aid=356980;label=gog235jc-1DCAMYAShGOIsDSCBYA2iOAYgBAZgBILgBF8gBDNgBA-gBAfgBAogCAagCA7gCyfC09gXAAgE;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=-372490;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=1;hpos=1;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590507596;srpvid=e4986e268e00004d;type=total;ucfs=1&#hotelTmpl");
            SendMessage(message, update);
        }
        if(response.equals("Negresco Princess\uD83C\uDDEA\uD83C\uDDF8")) {
            message.setText("Negresco Princess se afl?? ??n Barcelona, ??n regiunea Catalonia, ??i pune la dispozi??ie o saun?? ??i un centru de fitness. Hotelul ofer?? o piscin?? ??n aer liber ??i o teras?? la soare, dar ??i un restaurant.\n" +
                    "\n" +
                    "Toate camerele acestui hotel au aer condi??ionat, minibar gratuit ??i TV cu ecran plat cu canale prin satelit. Pentru confortul dumneavoastr??, sunt furnizate articole de toalet?? gratuite ??i usc??tor de p??r. Negresco Princess ofer?? WiFi gratuit ??n ??ntreaga proprietate. " + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/es/negresco-princess.ro.html?aid=356980;label=gog235jc-1DCAMYAShGOIsDSCBYA2iOAYgBAZgBILgBF8gBDNgBA-gBAfgBAogCAagCA7gCyfC09gXAAgE;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=-372490;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=2;hpos=2;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590507596;srpvid=e4986e268e00004d;type=total;ucfs=1&#hotelTmpl ");
            SendMessage(message, update);
        }
        if(response.equals("Barcelona Princess\uD83C\uDDEA\uD83C\uDDF8")) {
            message.setText("Hotelul Barcelona Princess este la 10 minute de mers pe jos de plaj??, ??n zona Forum a ora??ului. Acesta ofer?? saun?? gratuit??, sal?? de gimnastic?? ??i vedere superb??. ??n ??ntreaga proprietate este disponibil acces gratuit la internet WiFi.\n" +
                    "\n" +
                    "To??i oaspe??ii beneficiaz?? de acces gratuit la cele 2 piscine ??n aer liber ??nc??lzite. Piscina de la etajul 23 ofer?? vedere spectaculoas?? la mare. " + "\n" + "------------------------------------------------------------ \n" + " https://www.booking.com/hotel/es/barcelonaprincess.ro.html?aid=356980;label=gog235jc-1DCAMYAShGOIsDSCBYA2iOAYgBAZgBILgBF8gBDNgBA-gBAfgBAogCAagCA7gCyfC09gXAAgE;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=-372490;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=3;hpos=3;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590507596;srpvid=e4986e268e00004d;type=total;ucfs=1&#hotelTmpl");
            SendMessage(message, update);
        }
        if(response.equals("Aparthotel Senator Barcelona\uD83C\uDDEA\uD83C\uDDF8")) {
            message.setText("Hotelul de apartamente Senator Barcelona este situat pe Via Augusta, ??ntr-o zon?? reziden??ial?? pl??cut??, la 2 minute de mers pe jos de gara Muntaner. Unit????ile de cazare sunt dotate cu aer condi??ionat, ??nc??lzire ??i acces gratuit la internet WiFi.\n" +
                    "\n" +
                    "Toate camerele ??i apartamentele au TV, telefon ??i o baie privat?? cu du?? sau cad??. Apartamentele includ ??i o chicinet??. " + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/es/aparthotelcitysenator.ro.html?aid=356980;label=gog235jc-1DCAMYAShGOIsDSCBYA2iOAYgBAZgBILgBF8gBDNgBA-gBAfgBAogCAagCA7gCyfC09gXAAgE;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=-372490;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=4;hpos=4;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590507596;srpvid=e4986e268e00004d;type=total;ucfs=1&#hotelTmpl ");
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
            row41.add("Parad?? Tuscany EcoResort\uD83C\uDDEE\uD83C\uDDF9");
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
            message.setText("Acest hotel de 3 stele este situat chiar pe plaja din Marina di Castagneto, la doar c????iva pa??i distan???? de p??duri de brazi. Acesta ofer?? o teras?? cu vedere la mare.\n" +
                    "\n" +
                    "Hotel Alta La Vista ofer?? camere luminoase cu aer condi??ionat, televizor cu ecran cu plasm??, Wi-Fi gratuit, precum ??i un balcon. Unele au vedere la mare ??i la arhipelagul toscan. " + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/it/alta-la-vista.ro.html?aid=356980;label=gog235jc-1DCAYYAShxOHFIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAKj9LT2BcACAQ;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=910;dest_type=region;dist=0;group_adults=2;group_children=0;hapos=4;hpos=4;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590508070;srpvid=e6db6f1378180080;type=total;ucfs=1&#hotelTmpl ");
            SendMessage(message, update);
        }
        if(response.equals("Canado Club Family Village\uD83C\uDDEE\uD83C\uDDF9")) {
            message.setText(" Amplasat chiar pe propria plaj?? privat?? din Donoratico, Canado Club Family Village este un complex cu restaurante, facilit????i de agrement ??i divertisment pentru copii ??i adul??i. Complexul pune la dispozi??ie camere ??i apartamente, precum ??i WiFi gratuit ??n toate zonele.\n" +
                    "\n" +
                    "Camerele de la Canado Club Family Village au baie privat?? ??i seif. Apartamentele includ o chicinet?? cu frigider ??i cuptor cu microunde." + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/it/cantiere-navale.ro.html?aid=356980;label=gog235jc-1DCAYYAShxOHFIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAKj9LT2BcACAQ;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=910;dest_type=region;dist=0;group_adults=2;group_children=0;hapos=3;hpos=3;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590508070;srpvid=e6db6f1378180080;type=total;ucfs=1&#hotelTmpl ");
            SendMessage(message, update);
        }
        if(response.equals("Casa nella pineta\uD83C\uDDEE\uD83C\uDDF9")) {
            message.setText("Boasting garden views, Casa nella pineta | Pinewood House offers accommodation with a garden and a patio, around 1.2 km from Cavallino Matto. This holiday home features free private parking, a 24-hour front desk and free WiFi.\n" +
                    "\n" +
                    "The holiday home has 3 bedrooms, a flat-screen TV with satellite channels, an equipped kitchen with a microwave and a fridge, a washing machine, and 3 bathrooms with a bidet. " + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/it/casa-nella-pineta-pinewood-house.ro.html?aid=356980;label=gog235jc-1DCAYYAShxOHFIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAKj9LT2BcACAQ;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=910;dest_type=region;dist=0;group_adults=2;group_children=0;hapos=2;hpos=2;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590508070;srpvid=e6db6f1378180080;type=total;ucfs=1&#hotelTmpl ");
            SendMessage(message, update);
        }
        if(response.equals("Parad?? Tuscany EcoResort\uD83C\uDDEE\uD83C\uDDF9")) {
            message.setText("Parad?? Tuscany EcoResort este situat ??n Marina di Castagneto Carducci, ??n Toscana, la 48 km de Livorno. Oaspe??ii au la dispozi??ie o cad?? cu hidromasaj ??i zon?? privat?? de plaj??. Volterra se afl?? la 37 km. Accesul la internet WiFi ??i parcarea privat?? sunt disponibile gratuit.\n" +
                    "\n" +
                    "Parad?? Toscana Ecoresort are piscin?? sezonier?? ??n aer liber. De asemenea, exist?? un loc de joac?? pentru copii ??i un restaurant. ??n plus, complexul g??zduie??te un bar de vin ??i un restaurant pe plaj??. Sunt oferite ??i meniuri speciale de diet??. " + "\n" + "------------------------------------------------------------ \n" + "https://www.booking.com/hotel/it/paradu-39-resort.ro.html?aid=356980;label=gog235jc-1DCAYYAShxOHFIIFgDaI4BiAEBmAEguAEXyAEM2AED6AEB-AECiAIBqAIDuAKj9LT2BcACAQ;sid=7dd80e9ddb9598b26cd4f6d53f249e9b;dest_id=910;dest_type=region;dist=0;group_adults=2;group_children=0;hapos=1;hpos=1;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;srepoch=1590508070;srpvid=e6db6f1378180080;type=total;ucfs=1&#hotelTmpl ");
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
            message.setText("Chefchaouen sau Ora??ul Albastru, Maroc " + "\n" + "------------------------------------------------------------ \n" + "Chefchaouen din Maroc pare a fi ora??ul de provincie ??n care s-a n??scut marea, dar ??n care aceasta nu a mai fost niciodat?? v??zut?? dup?? plecarea la facultate ??i p??r??sirea ??inutului de ba??tin??. Totu??i, ??n ciuda totalei ei absen??e, pare s??-??i fi impregnat personalitatea ??n fiecare centimetru de cl??dire de la poalele Mun??ilor Rif, l??s??nd ca amintire o culoare calm?? de albastru etern.\n" +
                    "\n" +
                    "Ora??ul a v??zut lumina zilei undeva ??n 1471, iar anii de june??e ??i i-a petrecut ??n datoria de fort??rea???? maur?? pentru exila??ii spanioli. Trec??nd pragul primei tinere??i, ??i-a deschis por??ile deopotriv?? pentru adep??ii iudaismului ??i ai cre??tinismului care au tr??it cum se cuvine aici, laolalt?? cu b????tina??ii de origine berber??.\n" +
                    "\n" +
                    "??n promenadele pe care le vei face str??b??t??nd aceast?? oaz?? de albastru, vei cocheta negre??it cu g??ndul c?? oamenii de aici trebuie s?? aib?? un sim?? artistic deosebit de acut. Un g??nd de foarte mare bun sim??, de altfel, dar motivul albastrului ????i trage r??d??cinile mai degrab?? din cauze religioase.\n" +
                    "\n" +
                    "Potrivit vechilor ??nv??????minte evreie??ti care ??i-au croit drum p??n?? ??n zilele noastre, culoarea m??rii aminte??te de puterea lui Dumnezeu. ??n??elepciunea popular?? mai spunea, de asemenea, c?? albastrul poate ??ine mosquitos (????n??arii) la distan????.\n" +
                    "\n" +
                    "Singurele lucruri care ??ntrerup pe alocuri cursivitatea albastrului sunt tonurile p??m??ntii ale p??turilor ??esute manual, covoarele sau abajururile dispuse ??n fa??a micilor magazine. Nu-??i r??m??ne dec??t s?? te pierzi pe tine ??i tot ce ??ine de existen??a-??i cotidian??, plimb??ndu-te pe-aceste str??zi labirintice pietruite. "+"\n"+"------------------------------------------------------------ \n "+"https://www.momondo.ro/discover/top-atractii-turistice-din-lume");
            SendMessage(message, update);
        }
        if(response.equals("2")) {
            message.setText(" T??r??mul liber din Christiania, Copenhaga, Danemarca" + "\n" + "------------------------------------------------------------ \n" + "Copenhaga lui 1971: Revolu??ia hippie ajunge pe valu-i cel mai ??nalt, ??n vreme ce un grup de intru??i ocup?? incinta militar?? abandonat?? din zona portuar?? Christianshavn. Poli??ia e??ueaz?? ??n ??ncerc??rile de eliberare a zonei. ??n paralel, ia na??tere o nou?? comunitate bazat?? pe un stil de via???? alternativ, pe toleran???? ??i cu o guvernare proprie.\n" +
                    "\n" +
                    "De??i acceptat?? ini??ial sub considerentele unui experiment social, pentru a supravie??ui de-a lungul timpului, Christiania este nevoit?? s?? se schimbe ??i s?? se adapteze continuu. Copenhaga lui 2016: ??n Christiania tr??iesc acum ??n jur de 1000 de oameni. ??n acest ??inut al libert????ii se pot distinge ast??zi dovezile creativit????ii ??i culturii hipiote: cl??diri ridicate sub pecetea DIY, gr??dini lini??tite, localuri cu muzic?? ??i mici restaurante cu aer de familie.\n" +
                    "\n" +
                    "Christiania a fost dintotdeauna o zon?? controversat??, iar comer??ul cu ha??i??, de??i ????i are partea lui de r??spundere, nu este deloc singurul culpabil. Cu toate c?? este o zon?? la fel de sigur?? ca oricare alta, s-a considerat c?? regula de c??p??t??i trebuie s?? r??m??n?? de-a pururi ??nsemnat?? pe zidul de la intrare: ???filmarea este strict interzis??, ??n special pe ???Pusher Street???, una dintre str??du??ele principale.\n" +
                    "\n" +
                    "(N-am ??ti s?? spunem exact dac?? pe alte str??du??e sunt mai pu??in interzise, dar o certitudine o avem: orice camer?? video sau inten??ie neortodox?? trebuie s?? stea departe de ???Pusher Street!!)\n" +
                    "\n" +
                    "Cite??te ??i: Cele mai faine locuri scandinave ??? 3 zile petrecute ??n Copenhaga "+"\n"+"------------------------------------------------------------ \n "+"https://www.momondo.ro/discover/top-atractii-turistice-din-lume");
            SendMessage(message, update);
        }
        if(response.equals("3")) {
            message.setText(" Terasele de orez din Sapa, Vietnam" + "\n" + "------------------------------------------------------------ \n" + " Terasele nesf??r??ite de orez care alunec?? la vale ??n pante v??luroase, p??durile sub??iri de bambus ??i mun??ii cufunda??i ??n p??tura de nori, toate fac din Sapa unul dintre ora??ele de poveste ale Vietnamului. Pe vremuri, aceast?? zon?? nu era nimic mai mult dec??t o mare de pante abrupte cu un sol c??t se poate de fertil.\n" +
                    "\n" +
                    "??ncet-??ncet, localnicii au adoptat o tehnic?? foarte popular?? ??n zonele montane, ??ncep??nd s?? transforme treptele teraselor ??n pante, cu inten??ia v??dit?? de a cultiva orez. Aceast?? metod?? eficient?? de a ??mprieteni natura reduce eroziunea solului ??i ??nlesne??te irigarea culturilor.\n" +
                    "\n" +
                    "Dar agricultura mai scoate un as din m??nec?? ??i ne arat?? ??i obrazu-i estetic: privind acest peisaj, aproape vei uita complet c?? ai ??n fa???? o cultur?? de orez, ??i nu un t??r??m ??n care ????i fac veacul z??ne, elfi ??i spiridu??i.\n" +
                    "\n" +
                    "Culorile se schimb?? dup?? mendrele mi??c??rii de revolu??ie a P??m??ntului, astfel ??nc??t, ??n perioada iunie-iulie vei g??si c??mpurile de orez musterde. Iar dac?? ajungi aici ??n septembrie-octombrie le vei g??si deja coapte ??? c??mpuri aurii ??n plin?? maturitate, cochet??nd cu p??durea verde de al??turi."+"\n"+" ------------------------------------------------------------ \n"+"https://www.momondo.ro/discover/top-atractii-turistice-din-lume");
            SendMessage(message, update);
        }
        if(response.equals("4")) {
            message.setText("Ora??ul ??? stat Vatican " + "\n" + "------------------------------------------------------------ \n" + " Impun??torul Vatican ??i-a c????tigat independen??a ??i statutul legal de ora??-stat ??n 1929, devenind, totodat??, ??i cel mai mic stat din lume. Dar 1929 nu are leg??tur?? cu importan??a turistic?? pe care a avut-o dintotdeauna, indiferent de religia celor care i-au c??lcat pragul.\n" +
                    "\n" +
                    "Da, f??r?? ??ndoial??, la intrarea ??n cetate vei da peste numeroase manifest??ri ale cli??eelor turistice, dar odat?? trecute standurile cu brelocuri inscrip??ionate cu ???Popemobile??? (mai rar ceva at??t de neinspirat), te a??teapt?? una dintre cele mai impresionante arhitecturi Baroc ??i Renascentiste.\n" +
                    "\n" +
                    "Pe m??sur?? ce ochii ??i se vor c??sca la vederea g??rzilor elve??iene ??mbr??cate colorat, a Muzeului Vaticanului ??i a Bazilicii Sf??ntului Petru, sufletul se va sim??i iremediabil transportat cu 500 de ani ??n timp. ??i roag?? pe cineva s??-??i filmeze reac??ia c??nd te vei trezi ??n fa??a Capelei Sixtine. Vestea cea mai bun??: po??i vizita totul ??ntr-o singur?? zi.\n" +
                    "\n" +
                    "De notat: De??i nu este nic??ieri negru pe alb scris c?? nu ai voie s?? vii cu m??inile ??i cu picioarele descoperite, dac?? vrei s?? evi??i spr??ncene care se ??nal???? ??n semn v??dit de dezaprobare, f?? bine ??i acoper??-te!\n" +
                    "\n" +
                    "De notat: De??i nu este nic??ieri negru pe alb scris c?? nu ai voie s?? vii cu m??inile ??i cu picioarele descoperite, dac?? vrei s?? evi??i spr??ncene care se ??nal???? ??n semn v??dit de dezaprobare, f?? bine ??i acoper??-te!"+"\n"+" ------------------------------------------------------------ \n"+"https://www.momondo.ro/discover/top-atractii-turistice-din-lume");
            SendMessage(message, update);
        }
        if(response.equals("5")) {
            message.setText(" Cappadocia, Turcia" + "\n" + "------------------------------------------------------------ \n" + " u siguran???? ai v??zut tot soiul de ilustr??ri ale Cappadociei, dar este imposibil ca o biat?? fotografie s?? ??i poat?? face dreptate acestei regiuni; pur ??i simplu nu are resurse pentru a concura cu adev??rul de la fa??a locului. La numai o or?? de condus de la Kayseri, cel mai mare ora?? din Anatolia, acest regat antic a existat, ??ntr-o form?? sau alta, de mai bine de 3500 de ani. Ast??zi, hotelurile-grot?? care ??l populeaz??, ??mpreun?? cu forma??iunile facile de roc?? vulcanic?? ??i surprind chiar ??i pe cei mai sobri din milionul de c??l??tori ajun??i aici ??n fiecare an.\n" +
                    "\n" +
                    "Nu e cale mai bun?? de a trage la m??seaua privirii aici dec??t s?? iei calea norilor. Poate c?? pre??ul de 200??? al unei c??l??torii cu balonul cu aer cald ????i poate p??rea un ??iretlic turistic m??r??av, dar nu ??l l??sa s?? te dea ??napoi. Vei vedea c?? merit?? p??n?? la ultimul b??nu??. ??i nu ar fi de mirare ca, dup?? ce te ??ntorci pe p??m??nt, s?? te sim??i m??nat de imboldul de a mai ??i l??sa ceva peste.\n" +
                    "\n" +
                    "De notat: Scoate tot untul din experien??a pe deasupra Cappadociei, plas??nd-o undeva ??nainte de r??s??ritul soarelui"+"\n"+"------------------------------------------------------------ \n "+"https://www.momondo.ro/discover/top-atractii-turistice-din-lume");
            SendMessage(message, update);
        }
        if(response.equals("6")) {
            message.setText("Palatul Versailles, Fran??a " + "\n" + "------------------------------------------------------------ \n" + "De??i Fran??a abund?? de castele regale, toate p??lesc ??n fa??a grandorii celui de la Versailles. Acest ch??teau enorm construit ??n stil baroc a fost numit ???cas????? de c??tre familia regal?? din 1682 ??i p??n?? c??nd Revolu??ia Francez?? a v??zut lumina soarelui ??n 1789.\n" +
                    "\n" +
                    "Ast??zi, castelul ????i ??ine por??ile deschise pentru prin??i ??i cer??etori deopotriv?? (plus toate categoriile sociale aflate ??ntre) ??i numai o or?? de mers cu trenul din Centrul Parisului ??l desparte de orice ochi gurmand de frumos. Las?? ca o plimbare lejer?? prin Gr??dinile Regale de la Versailles s?? se ocupe de debutul c??l??toriei tale ??nainte de a te ascunde la umbra Marelui Palat Trianon.\n" +
                    "\n" +
                    "Dup?? ce abia ??i-ai umezit buzele cu splendorile regale ??i te sim??i preg??tit s?? ??nfrun??i coada din fa??a palatului pentru a te ghiftui cum se cuvine, a??az??-te cuminte ??i preg??te??te-te pentru piesa de rezisten????: Galeria Oglinzilor. Acest culoar lung de 73 de metri ??ine sub acoperi??u-i 17 oglinzi uria??e dispuse de o parte ??i de alta, 17 ferestre la fel de grandiose care dau spre gr??dina de afar?? ??i o fresc?? din calea-afar?? de opulent?? ce se ??ndeletnice??te cu povestitul groz??viilor s??v??r??ite de conduc??torii francezi. "+"\n"+" ------------------------------------------------------------ \n"+"https://www.momondo.ro/discover/top-atractii-turistice-din-lume");
            SendMessage(message, update);
        }
        if(response.equals("7")) {
            message.setText("M??n??stirile de la Meteora, Grecia " + "\n" + "------------------------------------------------------------ \n" + "Vechile m??n??stiri ortodoxe de la Meteora sunt exact locul unde natura ??i arhitectura ??i-au dat m??na ??i au lucrat ??mpreun?? la mo??tenirea umanit????ii. Aceste forma??iuni de roc?? pot privi ca de la egal la egal o cl??dire cu 120 de etaje ??i ad??postesc 6 m??n??stiri ce au copil??rit ??n secolul XIV.\n" +
                    "\n" +
                    "Legendele spun c?? primii oameni care au populat zona, au ajuns aici ??n secolul IX ??i au luat drumul sih??striei, locuind ??n micile pe??teri ale locului ??i transport??nd lucruri ??n??untru ??i ??n afara grotelor folosindu-se co??uri ??i plase legate cu sfori.\n" +
                    "\n" +
                    "Cu trecerea anilor, s-a format o mic?? comunitate care a ??nv????at s?? se apere ??mpotriva invadatorilor, ??ncep??nd s?? construiasc?? m??n??stiri. De??i, ??n prezent, treptele s??pate ??n roc?? reprezint?? metode mai ??ng??duitoare de a p??trunde ??n m??n??stiri, ??nc?? este nevoie de ceva ambi??ie pentru a urca p??n?? ??n v??rf. Dar odat?? ajuns, vei ??n??elege prea bine de ce c??lug??rii ??nc?? vor s?? tr??iasc?? acolo. "+"\n"+" ------------------------------------------------------------ \n"+"https://www.momondo.ro/discover/top-atractii-turistice-din-lume");
            SendMessage(message, update);
        }
        if(response.equals("8")) {
            message.setText("Laguna Albastr?? + luminile nordice, Islanda " + "\n" + "------------------------------------------------------------ \n" + "C??nd urechile aud cuv??ntul ???Islanda???, ochii min??ii nu pot s?? ??nf????i??eze altceva dec??t Laguna Albastr??. Acest spa geotermal a devenit sinonim de sens pentru regiunea nordic??, iar popularitatea tot mai cresc??nd?? din ultimii ani l-a transformat ??ntr-un loc deosebit de vizitat.\n" +
                    "\n" +
                    "Credem cu toat?? t??ria c?? cei 50 de kilometri care despart laguna de ora??ul Reykjavik, precum ??i cei 45??? pl??ti??i la intrare sunt eforturi prea pu??in ??nsemnate pentru r??sf????ul care te a??teapt??. Proximitatea fa???? de zona cu lav?? ??i condi??iile geologice din ??mprejurimi ridic?? temperatura apei la 39 ??C ??i o alimenteaz?? cu minerale precum sulful ??i siliciul, a??a ??nc??t cei ce ajung aici pentru o baie fierbinte, mai beneficiaz?? ??i de tratament natural pentru re??ntinerire.\n" +
                    "\n" +
                    "Iar dac?? norocul face s?? c??l??tore??ti ??n timpul toamnei sau al iernii islandeze, nu trebuie sub nicio form?? s??-??i scape dansul de lumini al Aurorei Boreale, una dintre altele minuni date ochiului de p??m??ntean.\n" +
                    "\n" +
                    "De notat: Dac?? astrele sunt a??ezate potrivit, viziteaz?? chiar acum website-ul Lagunei Albastre ??i cump??r??-??i bilete. De ce ar fi o alt?? zi mai potrivit?? dec??t asta pentru a-??i lua elanul? "+"\n"+" ------------------------------------------------------------ \n"+"https://www.momondo.ro/discover/top-atractii-turistice-din-lume");
            SendMessage(message, update);
        }
        if(response.equals("9")) {
            message.setText("Ora??ul Petra din Iordania " + "\n" + "------------------------------------------------------------ \n" + "??n Orientul Mijlociu, Petra este cunoscut?? ca o oaz?? de pace, dar audien??a ceva mai vestic?? o asociaz?? mai degrab?? cu o cultur?? pop; aceast?? ultim?? tendin???? nu este str??in?? de produc??ii cinematografice precum Indiana Jones ??i ultima Cruciad?? sau de Transformers 2.\n" +
                    "\n" +
                    "De??i inten??ia oamenilor de a trece acest monument al Patrimoniului UNESCO pe lista personal?? de lucruri v??zute este strunit?? de filmele mai sus numite, ceea ce r??m??ne impregnat ??n memorie ??i ??n suflet dup?? ??ntoarcerea acas?? este, f??r?? ??ndoial??, frumuse??ea tulbur??toare ??i autenticitatea ora??ului Petra.\n" +
                    "\n" +
                    "Construit de c??tre nabateeni ??n anul 300 ??.Hr cu migal?? absolut?? ??i aten??ie cople??itoare pentru detalii, acest sit arheologic ??ncorporeaz?? morminte, grajduri ??i chiar un amfiteatru antic, toate sculptate ??n piatra de nisip a falezei. Las?? lipsa de cuvinte resim??it?? aici pe seama uimirii pe m??sur?? ce explorezi ora??ul, iar c??nd sim??i c?? puterile ??ncep s??-??i cam ia t??lp????i??a din trupu-??i ??i la fel ??i soarele de pe ??ntinsul cer, ??ntoarce-te la templul Al Khazneh.\n" +
                    "\n" +
                    "Petrece acolo c??teva momente de contemplare la lumina ro??ie a unei lum??n??ri ??i vei ??n??elege prea bine de ce locul mai este cunoscut drept ???Comoara???. "+"\n"+"------------------------------------------------------------ \n "+"https://www.momondo.ro/discover/top-atractii-turistice-din-lume");
            SendMessage(message, update);
        }
        if(response.equals("10")) {
            message.setText("Machu Picchu, Peru " + "\n" + "------------------------------------------------------------ \n" + " Nu mul??i se lanseaz?? ??n dispute atunci c??nd se afirm?? c?? Machu Picchu este cea mai mare atrac??ie din America de Sud. Cel pu??in nu cei ce cunosc c??te ceva despre farmecul pu??in p??m??ntean al acestui loc situat la 2431 de metri fa???? de nivelul m??rii.\n" +
                    "\n" +
                    "Construit undeva pe la mijlocul secolului XV, Machu Picchu r??m??ne cea mai mare realizare a Imperiului Inca??. ??i de??i timpul a ??inut cu tot dinadinsul s??-??i fac?? sim??it?? prezen??a asupra acestor ruine, nu a reu??it s?? erodeze chintesen??a construc??iilor inca??e.\n" +
                    "\n" +
                    "Sc??rile, templele, apeductele ??i punctele de observa??ie se g??sesc ??mpr????tiate ??ntr-un labirint de peisaje montane ??ntins pe 12 acri (presque 50.000 de m??). De la o a??ezare situat?? pu??in deasupra nivelului norilor te-ai a??tepta s?? nu se ajung?? prea lesne, dar Machu Picchu surprinde ??i aici.\n" +
                    "\n" +
                    "V??z??ndu-te ajuns ??n ora??ul Cuzco (dup?? un zbor de numai 90 de minute din aeroportul Lima) po??i lua, fie trenul, fie autobuzul, fie, dac?? te sim??i cu toate puterile la ele acas??, te po??i al??tura unui grup de drume??i, pornind-o la pas ??n susul dealului."+"\n"+"------------------------------------------------------------ \n "+"https://www.momondo.ro/discover/top-atractii-turistice-din-lume");
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
