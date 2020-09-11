public class Value {

    public Integer value;
    public NumeralType numeralType;

    public Value(Integer _value, NumeralType _numeralType){
        value = _value;
        numeralType = _numeralType;
    }

}

enum NumeralType{
    Arab,
    Roman
}