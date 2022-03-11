public class Alphabet_Basic {

    public static void printH() {
        int n = 5;// n should be Odd
        for (int i = 1; i <= n; i++) {
            for (int j = 4; j <=n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n; j++) {
                if ( j == 0 || j == 5 || i == ((n >> 1)) + 1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printA() {
        int n  = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= (n - i) ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i ; j++) {
                if (i<=3) {
                    System.out.print("*" +" ");
                }else if(i > 3){
                    if(j == 1 || j == i){
                        System.out.print('*');
                    }
                    System.out.print("  ");
                }
                
                    
            }
            System.out.println();

        }
        System.out.println();
        
        
    }

    public static void printR() {
            int n = 5;
            int temp = n/2+1;
        for (int i = 1; i <= n; i++) {
            for (int j = 4; j <=n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= temp; j++) {
                if (j == 1 || j == temp || i == 1 || i == temp){
                    System.out.print("*"+ " ");
                }
                else{
                    System.out.print("   ");
                }
            }
         
            
            System.out.println();
        }
        System.out.println();

        
    }


    public static void printS() {
            int n = 5;
            int temp = n/2+1;
        for (int i = 1; i <= n; i++) {
            for (int j = 4; j <=n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n; j++) {
               if (i <= temp) {
                if (i == 1 || j == 1 || i == temp) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            if(i > temp){
                if (j == n || i == n) {
                    System.out.print("*");  
                }else{
                    System.out.print(" ");
                }
            }

                
            }

            System.out.println();
            
        }
        System.out.println();

        
    }

    public static void printJ() {

        int n = 5;
        int temp = n/2 + 1;
        for (int i = 1; i <=n; i++) {
            for (int j = 4; j <=n; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=n; j++) {
                if (i == 1 || j == temp || (i == n && j < temp)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
            
        }
        System.out.println();
        
    }




    public static void main(String[] args) {
    
    }
    
}
