class Message {
    String text;

    Message() {
    }

    ;

    Message(String text) {
        this.text = text;
    }

    public String toString() {
        return text;
    }
}

class SMS extends Message {
    String recipientContactInfo;

    SMS(String recipientContactInfo, String text) {
        super(text);
        this.recipientContactInfo = recipientContactInfo;
    }

    public String toString() {
        return  "Contact no : "+ recipientContactInfo +"\nMessage : "+ super.toString();
    }
}

class Email extends Message {
    String sender;
    String reciver;
    String Subject;

    Email(String sender, String reciver, String Subject, String text) {
        super(text);
        this.sender = sender;
        this.reciver = reciver;
        this.Subject = Subject;
    }

    public String toString() {
        return "From :  " + sender + "\nTo : " + reciver + "\nSubject : " + Subject + "\nBody : " + super.toString();
    }
}

public class Task2 {
    public static void main(String[] args) {
        SMS s1 = new SMS("03062722258", "Asalam-u-Alaikum Brother");
        System.out.println(s1.toString());
        Email e1 = new Email("Irfan Saeed", "Aamir Hussain", "Greetings", "How all Going, Good to have You.");
        System.out.println(e1.toString());
    }
}
