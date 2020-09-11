public class Operation {

    public Integer MathResult(int x, int y, String op){

        Integer result;

        switch (op){
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;
            default:
                result = null;
                break;
        }

        return result;
    }
}
