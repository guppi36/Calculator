public class MainClass {

    public static void main(String[] args){
        if(args.length == 0) MainBody();
        else ConsoleMeth(args);
    }

    public static void MainBody(){
        Input input = new Input();

        try {
            String str = input.ReadLineConsole();
            Parse pr = new Parse(str);
            System.out.println(pr.CreateResult());
        } catch (Exception err) {
            err.printStackTrace();
            input.Close();
            return;
        }

        MainBody();
    }

    public static void ConsoleMeth(String[] args){
        String str = "";
        for(String _str : args){
            str += _str + " ";
        }
        str = str.substring(0, str.length() - 1);
        Parse pr = new Parse(str);
        System.out.println(pr.CreateResult());
    }
}