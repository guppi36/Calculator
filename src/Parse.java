public class Parse {

    private String[] words;
    private Value x, y;
    private NumeralsData nd = new NumeralsData();;

    public Parse(){ }

    public Parse(String _massege){
        ParseMeth(_massege);
    }

    public void ParseMeth(String _massege){
        words = _massege.split(" ", 3);
        CheckString();
    }

    private void CheckString(){
        if(words.length != 3) throw new UnsupportedOperationException("Exception: input error!");
        else{
            x = nd.FindNumber(words[0]);
            y = nd.FindNumber(words[2]);

            if(x == null || y == null){
                throw new NumberFormatException("Exception: params incorrect!");
            }
            else if(x.numeralType != y.numeralType){
                throw new NumberFormatException("Exception: unequal format parameters!");
            }
        }
    }

    public String CreateResult(){
        String resultStr;
        Operation calculate = new Operation();
        Integer result = calculate.MathResult(x.value, y.value, words[1]);
        if(result != null) {
            if(x.numeralType == NumeralType.Roman) resultStr = nd.ReturnRomanNum(result);
            else resultStr = String.valueOf(result);
        }
        else{
            throw new UnsupportedOperationException("Exception: Operation error!");
        }
        return resultStr;
    }
}
