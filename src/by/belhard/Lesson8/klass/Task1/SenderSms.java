package by.belhard.Lesson8.klass.Task1;

public class SenderSms extends Sender {
    @Override
    boolean send(String to, String msg) {
        if (to.startsWith("+375") ){
            System.out.println("Сообщение " + msg + " было отправлено" + to + " по SMS");
            return true;
        }else {
            System.out.println( to + " не корректный");
            return false;
        }
    }
}
