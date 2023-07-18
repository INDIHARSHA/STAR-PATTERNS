class Star{
    public static void main(String args[]){
        
        int row=4;
        int col=4;
         // * * * * * *
         //* * * * *
         //* * * *
         //* * *
         //* *
         //*
        for(int i=-1;i<=row;i++){
            System.out.println();
            
            for(int j=row;j>=i;j--){
                System.out.print(" *");
            
            }
            
        } 
        
    
    }  
}