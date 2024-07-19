import java.util.HashMap;

public class MaxiPointsonLine {
    public int maxPoints(int[][] points) {
        int x1 = 0,x2 = 0,y1 = 0,y2 = 0;
        int maxPoints = 1;
        for(int i =0 ;i<points.length;i++){
            HashMap<Double,Integer> map= new HashMap<>();
            y1 = points[i][1];
            x1 = points[i][0];

            for(int j = i+1;j<points.length;j++){
                y2 = points[j][1];
                x2 = points[j][0];
                double m = 0;
                if( x1 == x2){
                    m = Double.MAX_VALUE;
                }
                else if(y1 == y2){
                    m = 0;
                }
                else {
                    m = (double)(y2 - y1) / (x2 - x1);
                }
                map.put(m, map.getOrDefault(m, 1) + 1);

            }

            for (int count : map.values()) {
                maxPoints = Math.max(maxPoints, count);
            }
        }


        return maxPoints;
    }
}
