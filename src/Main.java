import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
//        Date date = new Date();
//        System.out.println(date);
//        System.out.println(date.getTime());
//
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
//        String d = sdf.format(date);
//        System.out.println(d);

//        String s="01-01-2022";
//
//        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy");
//
//        Date date=simpleDateFormat.parse(s);
//        System.out.println(date);

        Scanner sc = new Scanner(System.in);
        System.out.println("type your birthday");

        String dateStr = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date dClient = sdf.parse(dateStr);

        Date dMe = sdf.parse("08-02-1993");

        long client = dClient.getTime();
        long me = dMe.getTime();

        long diff = client - me;

        Date diffD = new Date(diff);
        System.out.println(diffD);

        long ddays = diff / (24 * 60 * 60 * 1000)/365;

        System.out.println(ddays);
    }
}