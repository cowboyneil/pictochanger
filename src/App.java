import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App extends JPanel{

    public static int [] values = new int [128];

    public static void main(String[] args) throws FileNotFoundException{
    
    System.out.println("Hello user, welcome to the picto-changer!");
        readFile(values);
        int xy = values[127];

        Scanner name = new Scanner(System.in);
        System.out.println("What would you like to name the panel?");
        String nameInput = name.nextLine();

        while(true){
            Scanner user = new Scanner(System.in);
            System.out.println("What shape you like?");
            System.out.println("(R) Rectangle");
            System.out.println("(D) 3-D Rectangle");
            System.out.println("(Q) Quit");
            char option = user.next().charAt(0);
        option = Character.toUpperCase(option);
    if (option == 'R'){
        MyPanel panel = new MyPanel();
        MyPanel.edit(panel, xy, nameInput);
    } else if (option == 'D'){
        My3Rectangle panel = new My3Rectangle();
        My3Rectangle.edit(panel, xy, nameInput);
    }else if (option == 'Q'){
        System.out.println("Goodbye");
        System.out.println("#_#");
        break;
    } 
    else {
        System.out.println("Sorry, input not understood, please try again");
    }

    }//end of while
    }//end of method

    public static int[] readFile(int[] values) throws FileNotFoundException{
        File inputFile = new File("/Users/wgmpd/OneDrive/Desktop/JAVA CS 145/Week 7/Assignment_3/src/UserFile.txt");
        Scanner sc = new Scanner(inputFile);
        int xy = 0;
        int asciitochar;
        while(sc.hasNextLine()){
        char[] sArray = sc.nextLine().toCharArray();
        for(int i=0;i < sArray.length; i++){
            xy++;
            asciitochar = (int) sArray[i];
            values[asciitochar]++;
        }
        }
        values[127] = xy;
        return values;
    }
}
