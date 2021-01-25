import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class PortfolioGenerator {


    public static void main(String[] args) throws IOException {
FileWriter writer = new FileWriter("student.txt");
    Scanner input = new Scanner(System.in);

    System.out.print("Name:");
    String Name = input.nextLine();

    System.out.print("Email:");
    String Email = input.nextLine();

    System.out.print("Personal Background");
    String Background = input.nextLine();



    ArrayList<String> langs = new ArrayList<>();
    System.out.print("Enter known languages");
        Scanner languages = new Scanner(System.in);
    while(input.hasNext()) {

        langs.add(languages.next());
    }
    int len = langs.toArray().length;
    for (int i = 0; i < len; i++) {
        try {
            writer.write(langs.get(i));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

        ArrayList<String> achievements = new ArrayList<>();
        System.out.print("Enter achievements");
        Scanner myinput = new Scanner(System.in);
        while(input.hasNext()) {

            achievements.add(myinput.next());
        }
        int length = achievements.toArray().length;
        for (int i = 0; i < len; i++) {
            try {
                writer.write(achievements.get(i));
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }




    }
}
