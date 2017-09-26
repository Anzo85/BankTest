package anzo.org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BankMain {
    public static void main(String[] args) throws IOException {

        Card testCard = new Card(1234, "Test", 33000);


        System.out.println("Banking system has been started");

        System.out.println("Insert your card!");
        BufferedReader set = new BufferedReader(new InputStreamReader(System.in));
        String key = set.readLine();
        if (key.equals("Y")){
            System.out.println(testCard);
        } else {

            BufferedReader set1 = new BufferedReader(new InputStreamReader(System.in));

            BufferedReader set2 = new BufferedReader(new InputStreamReader(System.in));

            BufferedReader set3 = new BufferedReader(new InputStreamReader(System.in));


            System.out.println("Insert your Pin:");
            int setPin = Integer.parseInt(set1.readLine());
            System.out.println("Insert your Name:");
            String setName = set2.readLine();
            System.out.println("Insert your Account:");
            int setAc = Integer.parseInt(set3.readLine());


            Card card = new Card(setPin, setName, setAc);

            System.out.println(card);

        }

    }
}
