package goong;
class MyVectorEx2 { 
    public static void main(String args[]) { 
          MyVector v = new MyVector(2); 

          v.add("AAA"); 
          v.add("BBB"); 
          v.add("CCC"); 

          for(int i=0; i < v.size();i++) { 
                System.out.println(v.get(i)); 
          } 

          System.out.println("size:"+v.size()); 
          System.out.println("capacity:"+v.capacity()); 
          System.out.println("isEmpty:"+v.isEmpty() ); 

          v.set(0, "aaa"); 

          for(int i=0; i < v.size();i++) { 
                System.out.println(v.get(i)); 
          } 

    } // main 
}