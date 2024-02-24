package by.belhard.Lesson8.klass.Task1;

public class SenderPractice {
    public static void main(String[] args) {
        String to;
        String msg;

        Sender[] senders =new Sender[3];

        senders[0] = new SenderEmail();
        senders[1] = new SenderSms();
        senders[2] = new SenderTelegram();

        for (Sender i: senders){
            i.send("ergdg@gmail.com", "Hello");
        }

    }
}
