package problems.codechef;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Arrays;
import java.util.Properties;
/**
 * Created by arpit on 22/12/16.
 */

public class BigInt {

    public static void main(String[] args) {
        /*String s="ada=a=a=a=a";
        String s1[]=s.split("=");
        System.out.println(Arrays.toString(s1));
        System.out.println();*/

        vararg(1,2,3,4,5);
    }

    static void vararg(int start,int end,int...a){
        System.out.println(Arrays.toString(a)+" "+start+" "+end);
    }
    static class A implements Comparable<A>{
        Integer data;

        @Override
        public int compareTo(A a) {

            System.out.println(this.data+" "+a.data);
            return this.data.compareTo(a.data);
        }

        @Override
        public String toString() {
            return "A{" +
                    "a=" + data +
                    '}';
        }

        public A(Integer data) {
            this.data = data;
        }
    }

}

class Mailer{
    public static void send(String from,String password,String to,String sub,String msg){
        //Get properties object
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        //get Session
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from,password);
                    }
                });
        //compose message
        try {
            MimeMessage message = new MimeMessage(session);
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject(sub);
            message.setText(msg);
            //send message
            Transport.send(message);
            System.out.println("message sent successfully");
        } catch (MessagingException e) {throw new RuntimeException(e);}

    }
}