package goong;
import java.util.*; 

class MyVector { 
      protected Object[] data = null;     // 객체를 담기 위한 객체배열을 선언한다. 
      protected int capacity = 0;           // 용량 
      protected int size = 0;                // 크기 

      public MyVector(int capacity) { 
            if (capacity < 0) 
                  throw new IllegalArgumentException("유효하지 않은 값입니다. :"+ capacity); 
            this.capacity = capacity; 
            data = new Object[capacity];             
      } 

      public MyVector() { 
            this(10);             // 크기를 지정하지 않으면 크기를 10으로 한다. 
      } 

      public boolean isEmpty() { // MyVector가 비어있는지 확인한다. 
            return size==0; 
      } 

      public int capacity() { // MyVector의 용량(크기)를 반환한다. 
            return capacity; 
      } 

      public int size() {             // MyVector에 저장된 객체의 개수를 반환한다. 
            return size; 
      } 

      public void ensureCapacity(int minCapacity) { 
            int newCapacity = capacity; 

            if(minCapacity > capacity) { 
                  newCapacity = capacity * 2; 
            } 

            if(minCapacity > newCapacity) { 
                  newCapacity = minCapacity; 
            } 

            setCapacity(newCapacity); 
      } 

      public void setCapacity(int newCapacity) { 
            if(this.capacity==newCapacity) return; 

            Object[] tmp = new Object[newCapacity]; 
            System.arraycopy(data,0, tmp, 0, size); 

            this.data = tmp; 
            this.capacity = newCapacity; 
      } 
      
      public boolean add(Object obj) { 
            // 새로운 객체를 저장하기 전에 저장할 공간을 확보한다. 
            ensureCapacity(size+1); 
            data[size++] = obj; 
            return true; 
      } 

      public Object get(int index) { 
            if(index < 0 || index >= size) 
                  throw new IndexOutOfBoundsException("범위를 벗어났습니다."); 
            return data[index]; 
      } 

public Object set(int index, Object obj) { 
            if (index >= size) 
                  throw new ArrayIndexOutOfBoundsException(index); 

            Object oldValue = data[index]; 
            data[index] = obj; 
            return oldValue; 
} 

      public int indexOf(Object obj, int index) { 
            if (obj == null) { 
                  for (int i = index ; i < size ; i++) { 
                        if (data[i]==null) 
                              return i; 
                  } // for 
            } else { 
                  for (int i = index ; i < size ; i++) { 
                        if (obj.equals(data[i])) 
                              return i; 
                  } // for 
            } 

            return -1;       
      } 

      public int lastIndexOf(Object obj, int index) { 
                  if (index >= size) 
                        throw new IndexOutOfBoundsException(index + " >= "+ size); 

            if (obj == null) { 
                  for (int i = index; i >= 0; i--) 
                  if (data[i]==null) 
                        return i; 
            } else { 
                  for (int i = index; i >= 0; i--) 
                  if (obj.equals(data[i])) 
                        return i; 
            } 

            return -1; 
      } 

      public boolean contains(Object obj) { 
            return indexOf(obj, 0) >= 0;       
      } 

      public int indexOf(Object obj) { 
            // 찾기 시작할 위치(index)를 지정하지 않으면 처음부터 찾는다. 
            return indexOf(obj, 0);       
      } 

      public int lastIndexOf(Object obj) { 
            // 찾기 시작할 위치(index)를 지정하지 않으면 끝부터 찾는다. 
            return lastIndexOf(obj, size-1); 
      } 

      public void insert(Object obj, int index) { 
            if (index > size) { 
                  throw new ArrayIndexOutOfBoundsException(index + " > " + size); 
            } 

            ensureCapacity(size+1); 
            System.arraycopy(data, index, data, index + 1, size - index); 
            data[index] = obj; 
            size++;             
      } 

      public void add(int index, Object obj) { 
            insert(obj, index); 
      } 

      public Object remove(int index) { 
            Object oldObj = null; 

            if(index < 0 || index >= size) 
                  throw new IndexOutOfBoundsException("범위를 벗어났습니다."); 

            oldObj = data[index]; 

            // 삭제하고자 하는 객체가 마지막 객체가 아니라면, 배열복사를 통해 빈자리를 채워줘야 한다. 
            if(index != size-1) { 
                  System.arraycopy(data, index+1, data, index, size-index-1); 
            } 
// 마지막 데이터를 null로 한다. 배열은 0 부터 시작하므로 마지막 요소는 index가 size-1이다. 
            data[size-1] = null;       
            size--; 
            return oldObj; 
      } 

      public boolean remove(Object obj) { 
            for(int i=0; i < size; i++) { 
                  if(obj.equals(data[i])) { 
                        remove(i); 
                        return true; 
                  } 
            } 
            return false; 
      } 

      public void clear(){ 
            for (int i = 0; i < size; i++) 
                  data[i] = null; 

            size = 0; 
      } 

      public Object[] toArray(){ 
            Object[] result = new Object[size]; 
            System.arraycopy(data, 0, result, 0, size); 

            return result; 
      } 

      public String toString() { 
            StringBuffer sb = new StringBuffer(100); 

            sb.append("["); 

            for(int i=0; i < size;i++) { 
                  if(i!=0) 
                        sb.append(","); 
                  sb.append(get(i).toString()); 
            } 

            sb.append("]"); 

            return sb.toString(); 
      } 

      public Iterator iterator() {
    	  return new Itr();
            /*

              다음의 코드를 완성하세요.

 

              1. 내부클래스 Itr의 객체를 생성해서 반환한다.

           */
      } 

      private class Itr implements Iterator { 
            int cursor = 0;    // 읽어올 요소의 위치(index) 
            int lastRet = -1;  // 직전에 읽어온 객체의 위치(index)

            public Object next() { 
            	Object tmp = get(cursor);
            	lastRet = cursor;
            	cursor++;
            	return tmp;
                  /*

                    다음의 코드를 완성하세요.

 

                    1. cursor가 가리키고 있는 위치(index)의 객체를 꺼내온다.(get()사용)

                    2. cursor의 값을 lastRet에 저장하고 cursor의 값을 1 증가시킨다.

                       (예를 들어 cursor의 값이 1 이었으면 lastRet의 값은 1이 되고, cursor의 값은 2가 된다.)

                    3. 1에서 꺼내온 객체를 반환한다.

                 */

            } 

            public boolean hasNext() { 
            	return cursor<size;
                    /*

                       코드를 완성하세요.

                        hint : cursor의 값이 객체배열의 마지막요소의 위치(index)에 다다랐는지 확인한다.

                   */   

            } 

            public void remove() {
            	if(lastRet == -1)
            		throw new IllegalStateException();
            	
            	MyVector.this.remove(lastRet);
            	if(lastRet < cursor)
            		cursor--;
            	
            	lastRet = -1;
                  /*

                      다음의 코드를 완성하세요.

 

                      1. lastRet의 값이 -1이면(직전에 읽어온 객체가 없거나 삭제 되었으면)

                         IllegalStateException을 발생시킨다.

                      2. 직전에 읽어온 객체를 객체배열에서 제거한다.(MyVector의 remove()사용)

                      3. lastRet의 값이 cursor의 값보다 작으면 cursor의 값을 1감소 시킨다.

                          (현재 cursor의 위치보다 이전의 값이 삭제되면 cursor의 위치도 변경되어야 하므로)

                      4. lastRet에 -1을 저장한다.(직전에 읽어온 객체가 삭제되었으므로)

 

                      예를 들어 next()를 호출해서 객체배열의 index가 3인 요소를 읽어오면..

                       cursor(다음에 읽어올 객체의 위치)의 값은 4가 되고, lastRet의 값은 3이 된다.

 

                       이때 remove()가 호출되면, 읽어온 객체인 index가 3인 요소는 삭제 되고

                       index가 4인 위치에 있던 객체는 index가 3인 위치로 이동하게 된다.

                       (빈 자리를 메꾸기 위해 index가 4 이후의 모든 객체가 이동해야함)

 

                       그래서 cursor의 값은 4에서 3이 되어야 하고, lastRet의 값은 -1이 되어서

                       읽어온 객체가 없거나 삭제 되었음을 의미한다.                     

                  */
            } 
      } // private class Itr 
} // class MyVector 

