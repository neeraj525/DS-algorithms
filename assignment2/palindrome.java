import java.util.*;

class palindrome
{

public static void main(String[] x)
{

Scanner sc=new Scanner(System.in);

String s=sc.nextLine();

String str="";

char[] s1=s.toCharArray();

for(int i=s1.length-1;i>=0;i--)

{

str=str + s1[i];

}

if(str.equals(s))

{

System.out.println("Palindrome");

}

else

{

System.out.println("not Palindrome");

}

}
}


