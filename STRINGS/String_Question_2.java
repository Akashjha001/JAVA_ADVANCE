/*
Given a route containing 4 direction (N,S,W,E),
Find the shortest path to reach destination 
"WNEENESENNN"
*/
public class String_Question_2{
    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt (i);
            switch (dir) {
                case 'S' -> //south
                    y--;
                case 'N' -> //north
                    y++;
                case 'W' -> //west
                    x--;
                default -> //east
                    x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return(float)Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}