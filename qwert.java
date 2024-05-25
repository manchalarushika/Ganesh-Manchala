import java.util.*;
public class qwert
{
    public static boolean poweroftwo(int num)
    {
        int count=0;
        while(num>0)
        {
            if(num%2==1){
            count++;
            }
            num=num/2;
        }
        if(count==1)
        return true;
        else
        return false;
    }
    public static int met(int a)
    {
        String s=Integer.toBinaryString(a);
        char ch[]=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            ch[i]=s.charAt(i);
        }
        for(int i=ch.length-1;i>=0;i--)
        {
            if(ch[i]=='0'){
                ch[i]='1';
                break;
            }
        }
        int num=0,k=0;
        for(int i=ch.length-1;i>=0;i--)
        {
            if(ch[i]=='1'){
                num=num+(int)Math.pow(2,k);
            }
            k++;
        }
        return num;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(poweroftwo(n+1))
		System.out.println(n+1);
		else
		System.out.println(met(n));
	}
}
