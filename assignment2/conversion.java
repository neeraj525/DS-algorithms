import java.util.*;

class conversion {

public String convert(String s) {

String m="";

char[] s1=s.toCharArray();

for(int i=0;i<s.length();i++)
{

int ascii=(int) s.charAt(i);

char letter=s.charAt(i);

if(ascii >= 65 && ascii <= 90)
{

 letter=Character.toLowerCase(letter);

 m = m + letter;

}

else
{

letter=Character.toUpperCase(letter);

m = m + letter;

}
}

return m;
}

public static void main(String[] x) {

Scanner sc=new Scanner(System.in);

conversion c=new conversion();

String s=sc.nextLine();

String b=c.convert(s);

System.out.println("toggled " + b);

}
}