class CopyOfStar{
    public static void main(String args[]){
        
        int row=4;
        int col=4;
           // *  *  *  *  *  *  
             // *  *  *  *  *  
               // *  *  *  *  
                 // *  *  *  
                   // *  *  
                     // *  
        for(int i=-1;i<=row;i++){
            
            
            
             for(int jv=0;jv<=i+1;jv++){
                System.out.print("  ");
            
            }
           for(int j=row+1;j>i;j--){
               
                System.out.print(" * ");
             }
             System.out.println(" ");
            
        
        } 
         
            
        
        
    
    
    
    
    
    
    
    
    
    
    
    }  
}
