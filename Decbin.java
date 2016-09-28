class DecBin{
   public static void main (String a[]){
   
   int n;
   String bin; String hex;
   hex = "the hex value";
   for (n = 0; n <= 17; n  ++){
            bin = Integer.toBinaryString(n);
            hex = Integer.toHexString(n);
            System.out.print(n);
            System.out.print(" ");
            System.out.print(bin);
            System.out.print(" ");
            System.out.print(hex);
            System.out.println();
            
		}
		
    }
}    
