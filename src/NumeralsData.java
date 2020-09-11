import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class NumeralsData {

    private Map<String,Integer> dataDictionary = new HashMap<String,Integer>();

    public NumeralsData(){
        try {
            InitData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Value FindNumber(String str){
        Value i;
        if(dataDictionary.containsKey(str)){
            i = new Value(dataDictionary.get(str), NumeralType.Roman);
        }
        else {
            try {
                i = new Value(Integer.parseInt(str.trim()), NumeralType.Arab);
            } catch (NumberFormatException nfe) {
                return null;
            }
        }
        return i;
    }

    public String ReturnRomanNum(Integer _num){
        for (Map.Entry<String, Integer> entry : dataDictionary.entrySet()) {
            if (Objects.equals(_num, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    private void InitData() throws IOException{
        File f = new File(System.getProperty("user.dir") + "\\data.txt"); // src\
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        while ((line = fin.readLine()) != null) {
            String[] str = line.split("\t");
            dataDictionary.put(str[1], Integer.parseInt(str[0]));
        }
    }
}

