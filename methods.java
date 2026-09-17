public class methods {
    void  add(){ // Method
        int a=10;
        int b=5;
        int c=a+b;
        System.out.println("THE NUMBER IS ADD:"+c);
    }

    void sub(int a,int b){
        int c=a-b;
        System.out.println("THE NUMBER IS SUB:"+c);
    }

    void String(String a, String b){
        System.out.println("THE STRING IS ADD"+a+b);
    }

    int return_type(int a,int b){
        int c=a+b;
        return c;
    }

    public static void main(String[] args){ // Main Method
        
        methods ms= new methods(); //Object Create

        ms.add(); // Function Call
        ms.sub(5,6);
        ms.String("parthi","kumar");

        int d=ms.return_type(45,6); // Return Function Call
        System.out.println("THE RETURN TYPE :"+d);
    }   
}


