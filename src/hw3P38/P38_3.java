package hw3P38;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P38_3 {
	public static void main(String[] args) throws IOException
	{
System.out.println("請輸入字串");
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        
        System.out.println("請輸入要查詢的字");
        String str2 = br.readLine();
        char ch = str2.charAt(0);
        
        int num = str1.indexOf(ch);
        if(num != -1)
        	System.out.println(str1 +"的第"+ (num+1) +"個字就是 "+ ch);
        else
        	System.out.println(str1 +"裡面沒有 "+ ch +" 這個字");
	}	
}
