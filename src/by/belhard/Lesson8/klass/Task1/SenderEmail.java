package by.belhard.Lesson8.klass.Task1;

public class SenderEmail extends Sender{
    @Override
    boolean send(String to, String msg) {
        if (to.endsWith("@gmail.com") ){
            System.out.println("Сообщение " + msg + " было отправлено" + to + " по Email");
            return true;
        }else {
            System.out.println( to + " не корректный");
            return false;
        }
    }
}
