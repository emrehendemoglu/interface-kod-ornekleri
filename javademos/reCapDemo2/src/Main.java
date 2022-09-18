import java.util.Locale;

public class Main {

    public static void main(String[] args) {

       String mesaj = "bugün hava çok güzel ";

        System.out.println(mesaj.substring(2,4));

        for (String KELİME : mesaj.split("")){
            System.out.println(mesaj.toLowerCase(Locale.ROOT));
        }

    }
}

