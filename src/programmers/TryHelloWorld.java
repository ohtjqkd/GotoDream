package programmers;

class TryHelloWorld
{
    public String getDayName(int a, int b)
    {
        String answer = "";
        double total = b + 13*(a+1)/5 - 15;
        int indexDay = (int) total % 7;
        switch(indexDay) {
        case 0:
        	return "SAT";
        case 1:
        	return "SUN";
        case 2:
        	return "MON";
        case 3:
        	return "TUE";
        case 4:
        	return "WED";
        case 5:
        	return "THU";
        case 6:
        	return "FRI";        			
        }
        return answer;
    }
    public static void main(String[] args)
    {
        TryHelloWorld test = new TryHelloWorld();
        int a=5, b=24;
        System.out.println(test.getDayName(a,b));
    }
}