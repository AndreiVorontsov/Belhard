package by.belhard.Lesson8.klass.Task1;

public class SenderTelegram extends Sender{

    @Override
    boolean send(String to, String msg) {
        if (to.startsWith("@") ){
            System.out.println("Сообщение " + msg + " было отправлено" + to + " по Telegram");
            return true;
        }else {
            System.out.println( to + " не корректный");
            return false;
        }
    }
}
