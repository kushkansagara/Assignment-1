public class Practical1_10
{
    static void Caesar_Cipher(String s1)
    {
        char c1;
        String  str = "";
        for(int i=0;i<s1.length();++i)
        {
            c1=s1.charAt(i);
            if(c1>='a' && c1<='z')//check if the current char in the enteres string is lower or not.
            {
                c1=(char)(c1+3);
                if(c1>'z')
                {
                    c1=(char)(c1-'z'+'a'-1);//it increases its ascii value by 'a' so char changes
                }
                str+=c1;
            }
            else if(c1>='A' && c1<='Z') {
                c1 = (char) (c1 + 3);
                if (c1 > 'Z') {
                    c1 = (char) (c1 - 'z' + 'a' - 1);//it increases its ascii value by 'a' so char changes
                }
                str += c1;
            }
            else
            {
                str+=c1;
            }
        }
        System.out.println(str);
    }
}
