package goong;
class MyVectorEx3 { 
    public static void main(String args[]) { 
          MyVector v = new MyVector(2); 

          v.add("AAA"); 
          v.add("BBB"); 
          v.add("CCC"); 
          v.add("BBB"); 

          for(int i=0; i < v.size();i++) { 
                System.out.println(i+":"+v.get(i)); 
          } 

          System.out.println("indexOf BBB:"+v.indexOf("BBB")); 
          System.out.println("lastIndexOf BBB:"+v.lastIndexOf("BBB")); 
          System.out.println("contains BBB:"+v.contains("BBB")); 

    } // main 
}
