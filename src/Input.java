import java.util.Scanner;

public class Input {

    private Scanner in = new Scanner(System.in);

    public String ReadLineConsole(){
        System.out.println("Calculator. Enter expression: ");
        String str = in.nextLine();
        return str;
    }

    public void Close(){
        in.close();
    }
}
