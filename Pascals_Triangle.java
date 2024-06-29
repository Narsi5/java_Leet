import java.util.List;
import java.util.ArrayList;
public class Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0){
            return result;
        }
        if(numRows == 1){
            List<Integer> fr = new ArrayList<>();
            fr.add(1);
            result.add(fr);
            return result;
        }
        result= generate(numRows -1);
        List<Integer> prevRow = result.get(numRows -2);
        List<Integer> currRow = new ArrayList<>();
        currRow.add(1);
        for(int i = 1;i<numRows-1;i++){
            currRow.add(prevRow.get(i-1)+prevRow.get(i));
        }
        currRow.add(1);
        result.add(currRow);

        return result;


    }
}
