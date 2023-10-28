public class App {
    public static void main(String[] args) throws Exception {
    int firstArg=0;
    if (args.length > 0) {
    try {
        firstArg = Integer.parseInt(args[0]);
    } catch (NumberFormatException e) {
        System.err.println("Argument " + args[0] + " must be an integer.");
        System.exit(1);
    }
int s =0; 
int t = 1; 
for( int i = 0; i< firstArg; i++){
int m = s + t;
s=t;
t=m;
 }  
 for (int i =0 ; i < firstArg; i++){
 }
  System.out.print(s + " ");
    }
    }
    }
