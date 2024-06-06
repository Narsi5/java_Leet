public class Rectanglearea {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2-ax1)*(ay2-ay1);
        int area2= (bx2-bx1)*(by2-by1);

        //Common area coordinates
        int commonx1=(ax1>bx1)?ax1:bx1;
        int commony1=(ay1>by1)?ay1:by1;
        int commonx2=(ax2<bx2)?ax2:bx2;
        int commony2=(ay2<by2)?ay2:by2;

        //common area
        int x= (commonx2 - commonx1);
        int y = (commony2 - commony1);
        int commonarea =0;
        int tot = area1 + area2;
        if(x>0 && y > 0 ){
            commonarea = x*y;
        }

        return area1+area2-commonarea;
    }
}
