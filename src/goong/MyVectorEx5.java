package goong;

class MyVectorEx5 { 
    public static void main(String args[]) { 
          MyVector v = new MyVector(2); 

          v.add("AAA"); 
          v.add("BBB"); 
          v.add("CCC"); 
          v.add("DDD"); 

          Itr it = v.iterator();
          
          while(it.hasNext()) { 
                Object obj = it.next(); 
                System.out.println(obj); 

                if(obj.equals("BBB")) 
                      it.remove(); 
          } 

          System.out.println(v); 
    } // main 
}
