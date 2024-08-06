public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image == null || image.length == 0 || image[sr][sc] == color){
            return image;
        }
        int start = image[sr][sc];
        dfs(image,start,color,sr,sc);
        return image;
    }

    public void dfs(int[][] image ,int start,int color,int sr,int sc){
        if(sr<0||sc<0 || sr>=image.length || sc>= image[0].length) return;
        if(image[sr][sc] != start) return;
        image[sr][sc] = color;
        dfs(image,start,color,sr+1,sc);
        dfs(image,start,color,sr-1,sc);
        dfs(image,start,color,sr,sc+1);
        dfs(image,start,color,sr,sc-1);
    }
}
