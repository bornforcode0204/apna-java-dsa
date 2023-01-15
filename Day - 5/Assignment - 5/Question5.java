
public class Question5 {
    public static void main(String[] args) {
        for(int i=0; i<=5; i++){
            System.out.println("i = " + i);
        }
        System.out.println("i after the loop = " + i);
    }    
}

// Scope of variable is referred to the part of the program where the variable can be used.
// Inthisprogramvariableiisdeclaredintheforloop.Soscopeofvariableiislimitedtotheforlooponlythatisbetween{and}oftheforloop.Thereisadisplaystatementaftertheforloopwhere variableiis used which meansiis used outof scope. This leads to compilation errors.Theprogramgivenwillnotrunandgiveanerrorinstead.Tocorrecttheprogram,thevariableineeds to be declared outside the for loop.