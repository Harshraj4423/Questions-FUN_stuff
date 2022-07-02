class pattern{
    public static void main(String[] args) {
        
        int n = 9;
        int p1 , p2  , p3 , p4;
        p1 = n;
        p2 = n;
        p3 = (n * 3 -2);
        p4 = p3;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= ((n*4)-3); j++) {
                if( i == 1 && (j == n || j == p3)){
                    System.out.print("*");
                 
                }
                else if(j == p1 || j == p2 || j == p3 || j == p4 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            p1--;
            p2++;
            p3--;
            p4++;

            System.out.println();
            
        }
      
      //output
//     *       *    
//    * *     * *   
//   *   *   *   *  
//  *     * *     * 
// *       *       *


    }
}
