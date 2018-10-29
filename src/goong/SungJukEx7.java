package goong;
import java.util.*; 

class SungJukEx7 { 
      public static void main(String[] args) { 
            ArrayList<Student><STUDENT> list = new ArrayList<Student><STUDENT>(); 

 

            Scanner sc = null; 

            try { 
                  sc = new Scanner(new File(args[0]));             
            } catch(Exception e) { 
                  System.out.println(args[0] + " - 지정하신 파일을 찾을 수 없습니다."); 
                  System.exit(0); 
            } 

 

           /*

                 다음의 코드를 완성하세요.

                1. 파일로부터 데이터를 라인별로 읽어서(반복문과 Scanner클래스의 nextLine()사용)

                      1.1 읽어온 라인을 다시 Scanner를 이용해서 ','를 구분자로 해서 나눈다.

                           (Scanner클래스의 useDelimiter(String pattern)사용)

                      1.2 나누어진 데이터로 Student객체를 생성해서 list에 담는다.

           */

 

            calculateSchoolRank(list); // 전교등수를 계산한다.

            calculateClassRank(list);  // 반등수를 계산한다.
            printList(list); 
      } 

      public static void printList(List<Student><STUDENT> list) { 
            System.out.println("이름     반  번호  국어  수학  영어   총점  전교등수  반등수"); 
            System.out.println("============================================================="); 

            for(Student s : list) { 
                  System.out.println(s); 
            } 

            System.out.println("============================================================="); 
      } 

      public static void calculateSchoolRank(List<STUDENT> list) { 
            Collections.sort(list); 

            int prevRank = -1; 
            int prevTotal = -1; 
            int length = list.size(); 

            for(int i=0;i < length; i++) { 
                  Student s = list.get(i); 

                  if(s.total==prevTotal) { 
                        s.schoolRank = prevRank; 
                  } else { 
                        s.schoolRank = i + 1; 
                  } 

                  prevRank = s.schoolRank; 
                  prevTotal = s.total; 
            } 
      } // public static void calculateSchoolRank(List<STUDENT> list) { 

      public static void calculateClassRank(List<Student> list) { 
            Collections.sort(list, new ClassTotalComparator()); // 먼저 반별 총점기준 내림차순으로 정렬한다.

            int prevClassNo = -1; 
            int prevRank = -1; 
            int prevTotal = -1; 
            int length = list.size();

 

            for(int i=0, n=0; i < length; i++, n++) { 
                  Student s = list.get(i); 

                  if(s.classNo!=prevClassNo) { 
                        prevRank = -1; 
                        prevTotal = -1; 
                        n = 0; 
                  } 

                  if(s.total==prevTotal) { 
                        s.classRank = prevRank; 
                  } else { 
                        s.classRank = n + 1; 
                  } 

                  prevClassNo = s.classNo; 
                  prevRank = s.classRank; 
                  prevTotal = s.total; 
            } 
      } // public static void calculateClassRank(List<STUDENT> list) {

} 

class Student implements Comparable<Student><STUDENT> {

      final static int LEFT = 0; 
      final static int CENTER = 1; 
      final static int RIGHT = 2;

 

      String name = ""; 
      int classNo = 0; 
      int studentNo = 0; 
      int koreanScore = 0; 
      int mathScore = 0; 
      int englishScore = 0; 

      int total = 0; 

      int schoolRank = 0; // 전교등수

      int classRank = 0;  // 반등수

      Student(String name, int classNo, int studentNo, int koreanScore, int mathScore, int englishScore) { 
            this.name = name; 
            this.classNo = classNo; 
            this.studentNo = studentNo; 
            this.koreanScore = koreanScore; 
            this.mathScore = mathScore; 
            this.englishScore = englishScore; 

            total = koreanScore + mathScore + englishScore; 
      } 

      public String toString() { 
            return format(name, 5, LEFT) 
            + format(""+classNo, 4, RIGHT) 
            + format(""+studentNo, 4, RIGHT) 
            + format(""+koreanScore, 6, RIGHT) 
            + format(""+mathScore, 6, RIGHT) 
            + format(""+englishScore, 6, RIGHT) 
            + format(""+total, 8, RIGHT) 
            + format(""+schoolRank, 8, RIGHT)

            + format(""+classRank, 8, RIGHT) ; 
      }

 

       public int compareTo(Student obj) { 
            return obj.total - this.total; 
//             return this.name.compareTo(obj.name); // 이름기준으로 오름차순 정렬 
      } 

/* 제네릭스(Generics) 사용하지 않은 버젼 
      public int compareTo(Object obj) { 
            int result = -1; 

            if(obj instanceof Student) { 
                  Student tmp = (Student)obj; 

                  result = tmp.total - this.total; 
            } 

            return result; 
      } 
*/

      public static String format(String str, int length, int alignment) {

            if(str==null) str = "";
            int diff = length - str.length();

 

            // 주어진 문자열(str)의 길이보다 length의 값이 작으면 str를 length만큼만 남기고 잘라낸다.

            // 예를 들어, str이 "012345"이고, length가 3이면 결과는 "012"가 된다.
            if(diff < 0) return str.substring(0, length);  


            char[] source = str.toCharArray(); 
            char[] result = new char[length]; 

            // 배열 result를 공백으로 채운다. 
            for(int i=0; i < result.length; i++) 
                  result[i] = ' '; 

 

            switch(alignment) { 
                  case CENTER : 
                        System.arraycopy(source, 0, result, diff/2, source.length); 
                        break; 
                  case RIGHT : 
                        System.arraycopy(source, 0, result, diff, source.length); 
                        break; 
                  case LEFT : 
                  default : 
                        System.arraycopy(source, 0, result, 0, source.length); 
            } 
 

           return new String(result); 
      }

} // end of class Student 

class ClassTotalComparator implements Comparator<Student><STUDENT><STUDENT> { 
      public int compare(Student s1, Student s2) { 
            int result = s1.classNo - s2.classNo; 

            if(result==0) 
                  result = s2.total - s1.total; 

            return result; 
      } 
} 

class ClassStudentNoComparator implements Comparator<Student><STUDENT><STUDENT> { 
      public int compare(Student s1, Student s2) { 

            int result = s1.classNo - s2.classNo; 

            if(result==0) 
                  result = s1.studentNo - s2.studentNo; 

            return result; 
      } 
}

 
