package com.company;

/**
 * Created by jpi1 on 6/8/2017.
 */
import java.util.*;
public class ConditionalStatements {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter input");
        String inputS = x.next();
        int inputI = x.nextInt();
//        System.out.println(inputS);
//        System.out.println(inputI);
        /* "C:\Program Files\Java\jdk1.8.0_131\bin\java" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2017.1.3\lib\idea_rt.jar=54550:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2017.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_131\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_131\jre\lib\rt.jar;C:\Users\jpi1\IdeaProjects\my_first_proj\out\production\my_first_proj" com.company.ConditionalStatements
Enter inputhello
12
hello
12 */
        if(inputI == 1){System.out.println("entered 1");}
        else if (inputI > 3){System.out.println("more than 3");}
        else if(inputS  == "hello"){System.out.println("its expected string");} // cannot  compare String  using == as its class
        else if(inputS.equals("password") || inputS.contains("A")){System.out.println("its expected Password or matched A");}
        else {System.out.println("No idea");}

    }
}

