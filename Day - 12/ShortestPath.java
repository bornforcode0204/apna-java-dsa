import java.util.Scanner;

/**
 * ShortestPath
 */
public class ShortestPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.next().toUpperCase();
        
        sc.close();

        System.out.println("The shortest path is : " + findShortestPath(path));
    }

    public static double findShortestPath(String path) {
        int x =0, y = 0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            //east
            if( dir == 'E'){
                x++;
            }
            // west
            else if(dir == 'W'){
                x--;
            }
            // north
            else if(dir == 'N'){
                y++;
            }
            // south
            else if(dir == 'S'){
                y--;
            }
        }

        double shortestPath =  Math.sqrt((x*x) + (y*y));

        return shortestPath;
        }
    }
    
