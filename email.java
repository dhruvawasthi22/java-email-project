import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.*;
class email
{
    public static void main(String args[])throws IOException
    {
        int asd=1;
        do{
 String name,hobby,phone,sports,color,place,lucky;
 int ph=0;       
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\f");       
        name=JOptionPane.showInputDialog(null,"Enter your first and last name(eg. dhruv awasthi)","email id",JOptionPane.WARNING_MESSAGE);
    int nl1=name.length();
        char blank=' ';
        int fn1=name.indexOf(blank);
        String fn=name.substring(0,fn1);
        String ln=name.substring(fn1,nl1);        
    name=" "+name;
    String in="";
    int nl=name.length();
    char initial;
    for(int i=0;i<nl;i++)
    {
         initial=name.charAt(i);
         if(initial==' ')
         {
             in=in+ name.charAt(i+1);
               
    }
}
System.out.println("\t\t\t"+"  Hello  "+fn);
System.out.println("\t\t\t"+"@@@@@@@@@@@@@@");
System.out.println("\tThis is a program to generate your email-id and password "+"\n"+ "\tafter collecting some information of your interest");
System.out.println("\t"+"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
       JFrame jf = new JFrame();
         String[] choices2 = { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31" };
    String dd = (String) JOptionPane.showInputDialog(null, "Choose date....",
        "DATE OF BIRTH", JOptionPane.QUESTION_MESSAGE, null,choices2,choices2[1]); 
   
    String[] choices = { "1", "2", "3", "4", "5", "6","7", "8", "9", "10", "11", "12" };
    String mm = (String) JOptionPane.showInputDialog(null, "Choose month....",
        "DATE OF BIRTH", JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]);    
    String[] choices3 = {"1960","1961","1962","1963","1964","1965","1966","1967","1968","1969", "1970","1971","1972","1973","1974","1975","1976","1977","1978","1979","1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016"};
    String yy = (String) JOptionPane.showInputDialog(null, "Choose year....",
        "DATE OF BIRTH", JOptionPane.QUESTION_MESSAGE, null,choices3,choices3[1]);

    hobby=JOptionPane.showInputDialog(null,"Enter your hobby","email id",JOptionPane.WARNING_MESSAGE);
char chh;
String h1="",h2="";
    int hl=hobby.length();
    for (int h=0;h<hl;h++)
    {
        chh=hobby.charAt(h);
        if(chh!=' ')
        {
            h1=h1+chh;
        }
        else if(chh==' ')
        {
            h2=h2+chh;
        }
    }
    hobby=h1+h2;
int l =0;
do
{
    phone=JOptionPane.showInputDialog(null,"Enter your phone no.(10 digit)","email id",JOptionPane.WARNING_MESSAGE);   
    l=phone.length();    
}while(l!=10);
String iph=phone.substring(7,10);
String iph2=phone.substring(0,4);        
    sports=JOptionPane.showInputDialog(null,"Enter name of your favourite movie star(full name)","email id",JOptionPane.WARNING_MESSAGE);
    String sp="";
    int sl=sports.length();
    char chs;
    for(int f=0;f<sl;f++)
    {
        chs=sports.charAt(f);
        if(chs!=' ')
        {
            sp=sp+chs;
        }
        else
        break;
    }
    {
    
     color=JOptionPane.showInputDialog(null,"Enter your fav. colour ","email id",JOptionPane.WARNING_MESSAGE);
}
place=JOptionPane.showInputDialog(null,"Enter place you would like to visit  ","email id",JOptionPane.WARNING_MESSAGE);
 int lucky1;int ct;  int ll;
 do{
     ct=0;
     lucky =JOptionPane.showInputDialog(null,"Enter  your lucky no.  ","email id",JOptionPane.WARNING_MESSAGE);   
      ll=lucky.length();
     for(int q=0;q<ll;q++)
     {
         char ch1=lucky.charAt(q);
         if(ch1=='0'||ch1=='1'|| ch1=='2'||ch1=='3'|| ch1=='4'||ch1=='5'|| ch1=='6'||ch1=='7'|| ch1=='8'||ch1=='9')
         {
             ct++;
            }
        }      
    }while(ct!=ll);  
     JFrame jf2 = new JFrame();
    JOptionPane.showMessageDialog(jf2 , name +"\n" + "Date of birth is : "+"\t"+ "(" + dd+ "/"+ mm +"/"+ yy+")"+"\n"+"Your hobby : "+hobby+"\n"+"Your phone no. : "+phone+"\n"+"Fav. movie star : "+sports+"\n"+"Your fav. colour : "+color+"\n"+"Place you would like to visit : "+place+"\n"+"Your lucky no. : "+lucky);
    String em1=in+dd+"."+hobby+iph+"@gmail.com";
  String em2=fn+"."+dd+mm+color+"@gmail.com";
  String em3=ln+"."+sp+yy+"@gmail.com";
  String em4=in+"."+color+iph2+"@gmail.com";
  String em5=fn+mm+yy+"."+sp+"@gmail.com";
   JFrame jf3 = new JFrame();
    String choiceid; 
    int choiceid1;
 do{
     choiceid=JOptionPane.showInputDialog(null,"\n"+"1."+em1+"\n"+"2."+em2+"\n"+"3."+em3+"\n"+"4."+em4 +"\n"+"5."+em5+ "\n",
    "enter your choice 1/2/3/4/5 for email-id ",JOptionPane.INFORMATION_MESSAGE);
     choiceid1=Integer.parseInt(choiceid);
}while(choiceid1>5||choiceid1<1);
    String pass1=place+dd+mm;
    String pass2=fn+hobby+iph;
    String pass3=phone;
    String pass4=sp+ln+yy;
    String pass5=in+lucky+place;
    String choiceps;
    int choiceps1;   
    do{
        choiceps=JOptionPane.showInputDialog(null,"\n"+"1."+pass1+"\n"+"2."+pass2+"\n"+"3."+pass3+"\n"+"4."+pass4 +"\n"+"5."+pass5+ "\n",
    "enter your choice 1/2/3/4/5 for password ",JOptionPane.INFORMATION_MESSAGE);
     choiceps1=Integer.parseInt(choiceps);
}while(choiceps1>5||choiceps1<1);
String printid="",printps="";
int choiceid2=Integer.parseInt(choiceid);
if(choiceid2==1)

    printid=em1;

else if(choiceid2==2)

    printid=em2;

else if(choiceid2==3)

    printid=em3;

else if(choiceid2==4)

    printid=em4;

else if(choiceid2==5)

    printid=em5;

int choiceps2=Integer.parseInt(choiceps);
if(choiceps2==1)

    printps=pass1;

else if(choiceps2==2)

    printps=pass2;

else if(choiceps2==3)

    printps=pass3;

else if(choiceps2==4)

    printps=pass4;

else if(choiceps2==5)
 printps=pass5;
       JOptionPane.showMessageDialog(null,"your preffered email id :"+printid+"\n"+"your preffered password :"+printps+"\n");
    JOptionPane.showMessageDialog(null,"Thanking you......."+"\n"+"Dhruv Awasthi");
}while(asd==1);
}   
}