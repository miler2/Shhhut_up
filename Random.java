class MyClass {
    int randomWithRange(int min, int max){   //defining method for a random number generator
    
        int range = (max - min) + 1;     
        return (int)(Math.random() * range) + min;
    }  
    public static void main( String args[] ) {
        MyClass obj1=new MyClass();       // creating an object of MyClass
        int rand=obj1.randomWithRange(1,100); // range is from 1 to 100 
        System.out.println(rand);
    }
}