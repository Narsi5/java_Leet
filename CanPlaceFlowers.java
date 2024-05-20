public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int plots = 0;
        int size = flowerbed.length;
        int i = 0;
        while (i < size) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == size - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                plots++;
            }
            i++;
        }
        return plots >= n;
    }

}
