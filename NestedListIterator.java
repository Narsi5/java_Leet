import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class NestedListIterator {
    public static class NestedIterator implements Iterator<Integer> {
        List<Integer> flatList;
        int iterator;
        public NestedIterator(List<NestedInteger> nestedList) {
            flatList = new ArrayList<>();
            iterator = 0;
            flattenList(nestedList);
        }
        private void flattenList(List<NestedInteger> nestedList){
            for(NestedInteger ele : nestedList){
                if(ele.isInteger()){
                    flatList.add(ele.getInteger());
                }else{//recurse for the flatten list function
                    flattenList(ele.getList());
                }
            }
        }
        @Override
        public Integer next() {
            if(hasNext()){
                return flatList.get(iterator++);
            }else{
                return null;
            }
        }

        @Override
        public boolean hasNext() {
            return iterator < flatList.size();
        }
    }
    class NestedInteger {
        private List<NestedInteger> list;
        private Integer integer;

        public NestedInteger(List<NestedInteger> list){
            this.list = list;
        }

        public void add(NestedInteger nestedInteger) {
            if(this.list != null){
                this.list.add(nestedInteger);
            } else {
                this.list = new ArrayList();
                this.list.add(nestedInteger);
            }
        }

        public void setInteger(int num) {
            this.integer = num;
        }

        public NestedInteger(Integer integer){
            this.integer = integer;
        }

        public NestedInteger() {
            this.list = new ArrayList();
        }

        public boolean isInteger() {
            return integer != null;
        }

        public Integer getInteger() {
            return integer;
        }

        public List<NestedInteger> getList() {
            return list;
        }

        public String printNi(NestedInteger thisNi, StringBuilder sb){
            if(thisNi.isInteger()) {
                sb.append(thisNi.integer);
                sb.append(",");
            }
            sb.append("[");
            for(NestedInteger ni : thisNi.list){
                if(ni.isInteger()) {
                    sb.append(ni.integer);
                    sb.append(",");
                }
                else {
                    printNi(ni, sb);
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
