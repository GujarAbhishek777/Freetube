package Abhi123;

import java.util.*;

//freetube class as a Supermost in the Heirarchy
//Level 1 of tree
class FreeTube{
    String creator_Name;
    String date_Of_Join;
    long subscribers;
    long channel_Views;
    int no_Of_Videos;
    String creator_EmailID;

    public FreeTube() {

    }
        public FreeTube(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name = creator_Name;
        this.date_Of_Join = date_Of_Join;
        this.subscribers = subscribers;
        this.channel_Views =  channel_Views;
        this.no_Of_Videos = no_Of_Videos;
        this.creator_EmailID = creator_EmailID;
  }
}
//Level 2 of tree E-1
class ShortChannel extends FreeTube {

    //This is a method to Selection of Category of Short Channel
public static void Level1_1(){
    Scanner sc= new Scanner(System.in);
    System.out.println("***************************************");
    System.out.println("Please Select Category of Short Channel");
    System.out.println("***************************************");
    System.out.println("1. Motivation");
    System.out.println("2. Education");
    System.out.println("3. Sports");
    System.out.println("4. Finance and Business");
    System.out.println("5. Entertainment");
    System.out.println("6. Gaming");
    System.out.println("7. Technology");
    System.out.println("8. Fashion and Beauty");
    int a=0;
    try {
        a = sc.nextInt();
    }catch(Exception e){
        a=9;
    }
    switch(a)
    {
        case 1:
            System.out.println("**You have Selected Motivation**");
            Motivation1 m1=new Motivation1();
            m1.level2s_1();
            break;
        case 2:
            System.out.println("**You have Selected Education**");
            Education1 e1=new Education1();
            e1.level2s_2();
            break;
        case 3:
            System.out.println("**You have Selected Sports**");
            Sport1 s1=new Sport1();
            s1.level2s_3();
            break;
        case 4:
            System.out.println("**You have Selected Finance and Business**");
            Finance_Business1 fb1=new Finance_Business1();
            fb1.level2s_4();
            break;
        case 5:
            System.out.println("**You have Selected Entertainment**");
            Entertainment1 et1=new Entertainment1();
            et1.level2s_5();
            break;
        case 6:
            System.out.println("**You have Selected Gaming**");
            Gaming1 g1=new Gaming1();
            g1.level2s_6();
            break;
        case 7:
            System.out.println("**You have Selected Technology**");
            Technology1 t1=new Technology1();
            t1.level2s_7();
            break;
        case 8:
            System.out.println("**You have Selected Fashion and Beauty**");
            Fashion_Beauty1 bf1=new Fashion_Beauty1();
            bf1.level2s_8();
            break;
        default :
            System.out.println("## Please Enter Valid Input ##");
            Level1_1();
            break;

    }

}
}
//Level 2 tree E-2
class MainChannel extends FreeTube {

//This is a method to Selection of Category of Main Channel
public static void Level1_2(){
    Scanner sc= new Scanner(System.in);
    System.out.println("**************************************");
    System.out.println("Please Select Category of Main Channel");
    System.out.println("***************************************");
    System.out.println("1. Motivation");
    System.out.println("2. Education");
    System.out.println("3. Sports");
    System.out.println("4. Finance and Business");
    System.out.println("5. Entertainment");
    System.out.println("6. Gaming");
    System.out.println("7. Technology");
    System.out.println("8. Fashion and Beauty");
    int a=0;
    try {
        a = sc.nextInt();
    }catch(Exception e){
        a=9;
    }
    switch(a)
    {
        case 1:
            System.out.println("You have Selected Motivation");
            Motivation2 m1=new Motivation2();
             m1.level2m_1();
            break;
        case 2:
            System.out.println("You have Selected Education");
            Education2 e1=new Education2();
            e1.level2m_2();
            break;
        case 3:
            System.out.println("You have Selected Sports");
            Sport2 s1= new Sport2();
            s1.level2m_3();
            break;
        case 4:
            System.out.println("You have Selected Finance and Business");
            Finance_Business2 fb1=new Finance_Business2();
            fb1.level2m_4();
            break;
        case 5:
            System.out.println("You have Selected Entertainment");
            Entertainment2 et1=new Entertainment2();
            et1.level2m_5();
            break;
        case 6:
            System.out.println("You have Selected Gaming");
            Gaming2 g1=new Gaming2();
            g1.level2m_6();
            break;
        case 7:
            System.out.println("You have Selected Technology");
            Technology2 t1=new Technology2();
            t1.level2m_7();
            break;
        case 8:
            System.out.println("You have Selected Fashion and Beauty");
            Fashion_Beauty2 bf1=new Fashion_Beauty2();
            bf1.level2m_8();
            break;
        default :
            System.out.println("## Please Enter Valid Input ##");
            Level1_2();
            break;

    }
}
}
//Level 3 tree E-1-1
class Motivation1 extends ShortChannel {

//Method for motivation short channel
public static void level2s_1(){
    Scanner sc= new Scanner(System.in);
    System.out.println("***************************************************");
    System.out.println("Please Select Category of Motivation for Short Channel");
    System.out.println("****************************************************");
    System.out.println("1. Study Motivation");
    System.out.println("2. Motivation Talks");
    int a=0;
    try {
        a = sc.nextInt();
    }catch(Exception e){
        a=9;
    }
    switch (a){
        case 1:
            System.out.println("**You have Selected Study Motivation**");
            StudyMotivation1 sm1=new StudyMotivation1();
            sm1. llevel1();
            break;
        case 2:
            System.out.println("**You have Selected Motivation Talks**");
            MotivationTalks1 mt1=new MotivationTalks1();
            mt1.llevel2();
            break;
        default:
            System.out.println("## Please Enter Valid Input##");
            level2s_1();
            break;
    }

}
}
class StudyMotivation1 extends Motivation1 {
    //Method for Study Motivation Short Channels
    public static void llevel1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for Content");
        System.out.println("****************************************************");
        System.out.println("1. Tech Neuro");
        System.out.println("2. A2 Motivation");
        System.out.println("3. Jeet Fix");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Tech Neuro**");
                Tech_Neuro tn=new Tech_Neuro();
                tn.details();
                break;
            case 2:
                System.out.println("**You have Selected A2 Motivation**");
                A2_Motivation a2=new A2_Motivation();
                a2.details();
                break;
            case 3:
                System.out.println("**You have Selected Jeet Fix**");
                Jeet_Fix jf=new Jeet_Fix();
                jf.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                llevel1();
                break;
        }
    }

}
class Tech_Neuro extends StudyMotivation1{
    public Tech_Neuro() {
        System.out.println("The Details of the Channel as Follows:");
    }
    public Tech_Neuro(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
       FreeTube a1= new Tech_Neuro("Rahul Maan","12-Jul-2020",320105,5385065,350,"biztrue11@gmail.com");
        System.out.println("$$$$$$$$$$$$           TECH-NEURO             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("TECH-NEURO SHORTS");
        }
        else if(a==2){
            StudyMotivation1 sm1=new StudyMotivation1();
            sm1. llevel1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
   }
}
class A2_Motivation extends StudyMotivation1{
    public A2_Motivation() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public A2_Motivation(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new A2_Motivation("Arvind Arora","07 April 2017",1430000,815911984,2400,"growwitha2@gmail.com");
        System.out.println("$$$$$$$$$$$$          A2-MOTIVATION             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("A2-MOTIVATION SHORTS");
        }
        else if(a==2){
            StudyMotivation1 sm1=new StudyMotivation1();
            sm1. llevel1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Jeet_Fix extends StudyMotivation1{
    public Jeet_Fix() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Jeet_Fix(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Jeet_Fix("Sandeep Samadhan More","24-Jul-2019",5600000,55002057,270,"contact.jeetfix@yahoo.com");
        System.out.println("$$$$$$$$$$$$           JEET FIX             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("JEET FIX SHORTS");
        }
        else if(a==2){
            StudyMotivation1 sm1=new StudyMotivation1();
            sm1. llevel1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}

class MotivationTalks1 extends Motivation1 {
    //Method for Motivational Talks Short Channel
    public static void llevel2(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for Content");
        System.out.println("****************************************************");
        System.out.println("1. Sonu Sharma ");
        System.out.println("2. Ranveer Allahabadia");
        System.out.println("3. Gyanwatsal Swamy");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
            }
        switch (a){
            case 1:
                System.out.println("**You have Selected Sonu Sharma**");
                Sonu_Sharma ss1=new Sonu_Sharma();
                ss1.details();
                break;
            case 2:
                System.out.println("**You have Selected Ranveer Allahabadia**");
                Ranveer_Allabadia ra=new Ranveer_Allabadia();
                ra.details();
                break;
            case 3:
                System.out.println("**You have Selected Gyanwatsal Swamy**");
                Gyanwatsal_Swamy gs=new Gyanwatsal_Swamy();
                gs.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                llevel2();
                break;
        }
    }
}
class Sonu_Sharma extends MotivationTalks1{
    public Sonu_Sharma() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Sonu_Sharma(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Sonu_Sharma("Sonu Sharma","07-Oct-2006",1000000,750305720,322,"sonusharma@gmail.com");
        System.out.println("$$$$$$$$$$$$           SONU SHARMA             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("SONU SHARMA SHORTS");
        }
        else if(a==2){
            MotivationTalks1 mt1=new MotivationTalks1();
            mt1.llevel2();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Ranveer_Allabadia extends MotivationTalks1{
    public Ranveer_Allabadia() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Ranveer_Allabadia(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Ranveer_Allabadia("Raveer Allabadia","29-Mar-2017",4000000,327987358,396,"ranveer@gmail.com");
        System.out.println("$$$$$$$$$$$$           RANVEER ALLABADIA             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("RANVEER ALLABADIA SHORTS");
        }
        else if(a==2){
            MotivationTalks1 mt1=new MotivationTalks1();
            mt1.llevel2();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Gyanwatsal_Swamy extends MotivationTalks1{
    public Gyanwatsal_Swamy() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Gyanwatsal_Swamy(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Gyanwatsal_Swamy("Gyanwatsal_Swamy","18-May-2020",600000,7865426,321,"gyanmot11@gmail.com");
        System.out.println("$$$$$$$$$$$$           GYANWATSAL SWAMY             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" GYANWATSAL SWAMY SHORTS");
        }
        else if(a==2){
            MotivationTalks1 mt1=new MotivationTalks1();
            mt1.llevel2();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
//Level 3 tree E-2-1
class Motivation2 extends MainChannel {

//Method for Motivation main channel
public static  void level2m_1(){
    Scanner sc= new Scanner(System.in);
    System.out.println("**************************************************");
    System.out.println("Please Select Category of Motivation for Main Channel");
    System.out.println("**************************************************");
    System.out.println("1. Study Motivation");
    System.out.println("2. Motivation Talks");
    int a=0;
    try {
        a = sc.nextInt();
    }catch(Exception e){
        a=9;
    }
    switch (a){
        case 1:
            System.out.println("**You have Selected Study Motivation**");
            StudyMotivation2 st1=new StudyMotivation2();
            st1.llevel3();
            break;
        case 2:
            System.out.println("**You have Selected Motivation Talks**");
            MotivationTalks2 mt1=new MotivationTalks2();
            mt1.llevel4();
            break;
        default:
            System.out.println("## Please Enter Valid Input##");
            level2m_1();
            break;
    }

}

}
class StudyMotivation2 extends Motivation2 {
    //Method for Study motivation main channel
      public static void llevel3(){
          Scanner sc= new Scanner(System.in);
          System.out.println("***************************************************");
          System.out.println("Please Select Channel for Content");
          System.out.println("****************************************************");
          System.out.println("1. Deepak Dahiya");
          System.out.println("2. Motivation2Study");
          System.out.println("3. Shobit Nirwan");
          int a=0;
          try {
              a = sc.nextInt();
          }catch(Exception e){
              a=9;
          }
          switch (a){
              case 1:
                  System.out.println("**You have Selected Deepak Dahiya**");
                  Deepak_Dahiya dd=new Deepak_Dahiya();
                  dd.details();
                  break;
              case 2:
                  System.out.println("**You have Selected Motivation2Study**");
                  Motivation2Study ms=new Motivation2Study();
                  ms.details();
                  break;
              case 3:
                  System.out.println("**You have Selected Shobit Nirwan**");
                  Shobit_Nirwan sn=new Shobit_Nirwan();
                  sn.details();
                  break;
              default:
                  System.out.println("## Please Enter Valid Input##");
                  llevel3();
                  break;
          }
      }
}
class Deepak_Dahiya extends StudyMotivation2{
    public Deepak_Dahiya() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Deepak_Dahiya(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Deepak_Dahiya("Deepak Dahiya","04-May-2017",3500000,538504655,208,"deepakdaiyaofficial@gmail.com");
        System.out.println("$$$$$$$$$$$$           DEEPAK DAHIYA             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("DEEPAK DAHIYA MAIN");
        }
        else if(a==2){
            StudyMotivation2 st1=new StudyMotivation2();
            st1.llevel3();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Motivation2Study extends StudyMotivation2{
    public Motivation2Study() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Motivation2Study(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Motivation2Study("Santosh Choudhari","04-Mar-2017",4000000,564824564,292,"motivation2study@gmail.com");
        System.out.println("$$$$$$$$$$$$           MOTIVATION-2-STUDY             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" MOTIVATION-2-STUDY MAIN");
        }
        else if(a==2){
            StudyMotivation2 st1=new StudyMotivation2();
            st1.llevel3();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Shobit_Nirwan extends StudyMotivation2{
    public Shobit_Nirwan() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Shobit_Nirwan(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Shobit_Nirwan("Shobit Nirwan","25-Aug-2019",1700000,538504658,195,"nirwanshobhit17@gmail.com");
        System.out.println("$$$$$$$$$$$$           SHOBIT NIRWAN             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("SHOBIT NIRWAN MAIN");
        }
        else if(a==2){
            StudyMotivation2 st1=new StudyMotivation2();
            st1.llevel3();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class MotivationTalks2 extends Motivation2 {
    //Method for motivation talks main channel
     public static void llevel4(){
         Scanner sc= new Scanner(System.in);
         System.out.println("***************************************************");
         System.out.println("Please Select Channel for Content");
         System.out.println("****************************************************");
         System.out.println("1. Sandeep Maheshwari");
         System.out.println("2. Chetan Bhagat");
         System.out.println("3. Harshwardhan Jain");
         int a=0;
         try {
             a = sc.nextInt();
         }catch(Exception e){
             a=9;
         }
         switch (a){
             case 1:
                 System.out.println("**You have Selected Sandeep Maheshwari**");
                 Sandeep_Maheshwari sm=new Sandeep_Maheshwari();
                 sm.details();
                 break;
             case 2:
                 System.out.println("**You have Selected Chetan Bhagat**");
                 Chetan_Bhagat cb=new Chetan_Bhagat();
                 cb.details();
                 break;
             case 3:
                 System.out.println("**You have Selected Harshwardhan Jain**");
                 Harshwardhan_Jain hj=new Harshwardhan_Jain();
                 hj.details();
                 break;
             default:
                 System.out.println("## Please Enter Valid Input##");
                 llevel4();
                 break;
         }
     }
}
class Sandeep_Maheshwari extends MotivationTalks2{
    public Sandeep_Maheshwari() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Sandeep_Maheshwari(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Sandeep_Maheshwari("Sandeep Maheshwari","13-Feb-2012",32010026L,538504567,350,"sandeepmahe@gmail.com");
        System.out.println("$$$$$$$$$$$$           SANDEEP MAHESHWARI             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("SANDEEP MAHESHWARI MAIN");
        }
        else if(a==2){
            MotivationTalks2 mt1=new MotivationTalks2();
            mt1.llevel4();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Chetan_Bhagat extends MotivationTalks2{
    public Chetan_Bhagat() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Chetan_Bhagat(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Chetan_Bhagat("Chetan Bhagat","21-Apr-2014",320104568,954672265,150,"chetan123@gmail.com");
        System.out.println("$$$$$$$$$$$$           CHETAN BHAGAT             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("CHETAN BHAGAT MAIN");
        }
        else if(a==2){
            MotivationTalks2 mt1=new MotivationTalks2();
            mt1.llevel4();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Harshwardhan_Jain extends MotivationTalks2{
    public Harshwardhan_Jain() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Harshwardhan_Jain(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Harshwardhan_Jain("Harshwardhan Jain","12-Jul-2015",45861361,455678964,250,"jainharsh11@gmail.com");
        System.out.println("$$$$$$$$$$$$           HARSHWARDHAN JAIN             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("HARSHWARDHAN JAIN MAIN");
        }
        else if(a==2){
            MotivationTalks2 mt1=new MotivationTalks2();
            mt1.llevel4();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
//Level 3 tree E-1-2
class Education1 extends ShortChannel {

//Method for Education short channel
public static void level2s_2(){

    Scanner sc= new Scanner(System.in);
    System.out.println("***************************************************");
    System.out.println("Please Select Category of Education for Short Channel");
    System.out.println("****************************************************");
    System.out.println("1. School Education");
    System.out.println("2. College Education");
    int a=0;
    try {
        a = sc.nextInt();
    }catch(Exception e){
        a=9;
    }
    switch (a){
        case 1:
            System.out.println("**You have Selected School Education**");
            Education_School1 es1=new Education_School1();
            es1.level3s_2s2_1();
            break;
        case 2:
            System.out.println("**You have Selected College Education**");
            Education_College1 ec1=new Education_College1();
            ec1.level3s_2s_11();
            break;
        default:
            System.out.println("## Please Enter Valid Input##");
            level2s_2();
            break;
    }

}
}
class Education_School1 extends Education1 {
    //Method for School Education--Education--Short Channel
    public static void level3s_2s2_1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Category of School Education for Short Channel");
        System.out.println("****************************************************");
        System.out.println("1. Board Study");
        System.out.println("2. Competitive Exam Study");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Board Study**");
                BoardStudy1 bs1=new BoardStudy1();
                bs1.level2a();
                break;
            case 2:
                System.out.println("**You have Selected Competitive Exam Study**");
                CompetitiveExam1 ce1=new CompetitiveExam1();
                ce1.level4s_21();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                level3s_2s2_1();
                break;
        }
    }

}
class BoardStudy1 extends Education_School1 {
    //Method for Board study channel short channel
      public static void level2a(){
          Scanner sc= new Scanner(System.in);
          System.out.println("***************************************************");
          System.out.println("Please Select Channel for Content");
          System.out.println("****************************************************");
          System.out.println("1. Padaku Student");
          System.out.println("2. Prashant Kirad");
          System.out.println("3. Apni Kaksha");
          int a=0;
          try {
              a = sc.nextInt();
          }catch(Exception e){
              a=9;
          }
          switch (a){
              case 1:
                  System.out.println("**You have Selected Padaku Student**");
                  Padaku_Student ps=new Padaku_Student();
                  ps.details();
                  break;
              case 2:
                  System.out.println("**You have Selected Prashant Kirad**");
                  Prashant_Kirad pk=new Prashant_Kirad();
                  pk.details();
                  break;
              case 3:
                  System.out.println("**You have Selected Apni Kaksha**");
                  Apni_Kaksha ak=new Apni_Kaksha();
                  ak.details();
                  break;
              default:
                  System.out.println("## Please Enter Valid Input##");
                  level2a();
                  break;
          }
      }
}
class Padaku_Student extends BoardStudy1{
    public Padaku_Student() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Padaku_Student(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Padaku_Student("Ganesh Satose","12-March-2018",3201046,524865768,195,"padstudent@gmail.com");
        System.out.println("$$$$$$$$$$$$           PADAKU-STUDENT             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" PADAKU-STUDENT SHORTS");
        }
        else if(a==2){
            BoardStudy1 bs1=new BoardStudy1();
            bs1.level2a();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Prashant_Kirad extends BoardStudy1{
    public Prashant_Kirad() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Prashant_Kirad(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Prashant_Kirad("Prashant Kirad","12-Aug-2019",784691,50746817,120,"prashantkirad@gmail.com");
        System.out.println("$$$$$$$$$$$$           PRASHANT KIRAD             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("PRASHANT KIRAD SHORTS");
        }
        else if(a==2){
            BoardStudy1 bs1=new BoardStudy1();
            bs1.level2a();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Apni_Kaksha extends BoardStudy1{
    public Apni_Kaksha() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Apni_Kaksha(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Apni_Kaksha("Aman Dhattarwal","12-Jul-2020",145267,45786497,210,"apnikaksha@gmail.com");
        System.out.println("$$$$$$$$$$$$           APNI-KAKSHA             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" APNI-KAKSHA SHORTS");
        }
        else if(a==2){
            BoardStudy1 bs1=new BoardStudy1();
            bs1.level2a();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class CompetitiveExam1 extends Education_School1 {
    //Method for School Education--Education--Competitive exam--Short Channel
    public static void level4s_21(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Category of Competitive Exam for Short Channel");
        System.out.println("****************************************************");
        System.out.println("1. JEE");
        System.out.println("2. NEET");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected JEE**");
                JEE1 j1=new JEE1();
                j1.coex();
                break;
            case 2:
                System.out.println("**You have Selected NEET**");
                NEET1 n1=new NEET1();
                n1.neetcomp();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                level4s_21();
                break;
        }
    }
}
class JEE1 extends CompetitiveExam1 {
    //Method for JEE Channels
    public static void coex(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for Content");
        System.out.println("****************************************************");
        System.out.println("1. JEE Simplified");
        System.out.println("2. Kota JEE");
        System.out.println("3. Yash Garg");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected JEE Simplified**");
                Jee_Simplified js=new Jee_Simplified();
                js.details();
                break;
            case 2:
                System.out.println("**You have Selected Kota JEE**");
                Kota_Jee kj=new Kota_Jee();
                kj.details();
                break;
            case 3:
                System.out.println("**You have Selected Yash Garg**");
                Yash_Garg yg=new Yash_Garg();
                yg.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                coex();
                break;
        }
    }
}
class Jee_Simplified extends JEE1{
    public Jee_Simplified() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Jee_Simplified(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Jee_Simplified("Rakesh Makhanwala","07-Feb-2017",456273,50456794,250,"jeesimplified11@gmail.com");
        System.out.println("$$$$$$$$$$$$           JEE-SIMPLIFIED             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("JEE-SIMPLIFIED SHORTS");
        }
        else if(a==2){
            JEE1 j1=new JEE1();
            j1.coex();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Kota_Jee extends JEE1{
    public Kota_Jee() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Kota_Jee(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Kota_Jee("Manish Singh","12-Jul-2016",3201045,538504456,350,"manishsingh21@gmail.com");
        System.out.println("$$$$$$$$$$$$           KOTA JEE             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" KOTA JEE SHORTS");
        }
        else if(a==2){
            JEE1 j1=new JEE1();
            j1.coex();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }


}
class Yash_Garg extends JEE1{
    public Yash_Garg() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Yash_Garg(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Yash_Garg("Yash Garg","12-Jul-20219",3201045,85045786,220,"yashgarg1@gmail.com");
        System.out.println("$$$$$$$$$$$$           YASH GARG             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" YASH GARG SHORTS");
        }
        else if(a==2){
            JEE1 j1=new JEE1();
            j1.coex();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }


}
class NEET1 extends CompetitiveExam1 {
    //Method for NEET  short channels
      public static void neetcomp(){
          Scanner sc= new Scanner(System.in);
          System.out.println("***************************************************");
          System.out.println("Please Select Channel for Content");
          System.out.println("****************************************************");
          System.out.println("1. Madhukar Kumar");
          System.out.println("2. NEET Guide Official");
          System.out.println("3. Medico Om");
          int a=0;
          try {
              a = sc.nextInt();
          }catch(Exception e){
              a=9;
          }
          switch (a){
              case 1:
                  System.out.println("**You have Selected Madhukar Kumar**");
                  Madhukar_Kumar mk=new Madhukar_Kumar();
                  mk.details();
                  break;
              case 2:
                  System.out.println("**You have Selected NEET Guide Official**");
                  NEET_guide_Official ngo=new NEET_guide_Official();
                  ngo.details();
                  break;
              case 3:
                  System.out.println("**You have Selected Medico Om**");
                  Medico_Om mo=new Medico_Om();
                  mo.details();
                  break;
              default:
                  System.out.println("## Please Enter Valid Input##");
                  neetcomp();
                  break;
          }
      }
}
class Madhukar_Kumar extends NEET1{
    public Madhukar_Kumar() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Madhukar_Kumar(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Madhukar_Kumar("Madhukar Kumar","12-Oct-2020",7564826,124553850,292,"madhukark@gmail.com");
        System.out.println("$$$$$$$$$$$$           MADHUKAR KUMAR             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("MADHUKAR KUMAR SHORTS");
        }
        else if(a==2){
            NEET1 n1=new NEET1();
            n1.neetcomp();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }


}
class NEET_guide_Official extends NEET1{
    public NEET_guide_Official() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public NEET_guide_Official(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new NEET_guide_Official("Rahul Upadhyay","31-May-2010",20104756,501234562,300,"neetofficial11@gmail.com");
        System.out.println("$$$$$$$$$$$$           NEET-GUIDE-OFFICIAL             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("NEET-GUIDE-OFFICIAL SHORTS");
        }
        else if(a==2){
            NEET1 n1=new NEET1();
            n1.neetcomp();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Medico_Om extends NEET1{
    public Medico_Om() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Medico_Om(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Medico_Om("Omkar Raj","12-Jul-2020",45454626,764659655,310,"ommedico@gmail.com");
        System.out.println("$$$$$$$$$$$$           MEDICO OM             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" MEDICO OM SHORTS");
        }
        else if(a==2){
            NEET1 n1=new NEET1();
            n1.neetcomp();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}

class Education_College1 extends Education1 {
    //Method for college education--Short channel
    public static void level3s_2s_11(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Category of College Education for Short Channel");
        System.out.println("****************************************************");
        System.out.println("1. COMPUTER");
        System.out.println("2. MECH");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected CS**");
                ComputerChannels1 cc1=new ComputerChannels1();
                cc1.cschannel();
                break;
            case 2:
                System.out.println("**You have Selected MECH**");
                MechanicalChannels1 mc1=new MechanicalChannels1();
                mc1.mechchannel();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                level3s_2s_11();
                break;
        }
    }
}
class ComputerChannels1 extends Education_College1 {
    public static void cschannel(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for Content");
        System.out.println("****************************************************");
        System.out.println("1. Knowledge Time");
        System.out.println("2. SkillSiya");
        System.out.println("3. Nishant Chahar");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Knowledge Time**");
                Knowledge_Time kt=new Knowledge_Time();
                kt.details();
                break;
            case 2:
                System.out.println("**You have Selected SkillSiya**");
                SkillSiya ss=new SkillSiya();
                ss.details();
                break;
            case 3:
                System.out.println("**You have Selected Nishant Chahar**");
                Nishat_Chahar nc=new Nishat_Chahar();
                nc.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                cschannel();
                break;
        }
    }

}
class Knowledge_Time extends ComputerChannels1{
    public Knowledge_Time() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Knowledge_Time(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Knowledge_Time("Virat Singh","11-Jun-2020",1457689,501457565,350,"knowledgetime@gmail.com");
        System.out.println("$$$$$$$$$$$$           KNOWLEDGE-TIME             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("KNOWLEDGE-TIME SHORTS");
        }
        else if(a==2){
            ComputerChannels1 cc1=new ComputerChannels1();
            cc1.cschannel();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class SkillSiya extends ComputerChannels1{
    public SkillSiya() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public SkillSiya(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new SkillSiya("Manish Patode","12-April-2020",7986457,345678915,345,"manishpatole@gmail.com");
        System.out.println("$$$$$$$$$$$$           SKILL-SIYA             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("SKILL-SIYA SHORTS");
        }
        else if(a==2){
            ComputerChannels1 cc1=new ComputerChannels1();
            cc1.cschannel();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Nishat_Chahar extends ComputerChannels1{
    public Nishat_Chahar() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Nishat_Chahar(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Nishat_Chahar("Nishant Chahar","18-Sept-2021",456785,4756568,110,"chaharnishant@gmail.com");
        System.out.println("$$$$$$$$$$$$           NISHANT CHAHAR             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("NISHANT CHAHAR SHORTS");
        }
        else if(a==2){
            ComputerChannels1 cc1=new ComputerChannels1();
            cc1.cschannel();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class MechanicalChannels1 extends Education_College1 {
    //Method for mech short channels
      public static void mechchannel(){
          Scanner sc= new Scanner(System.in);
          System.out.println("***************************************************");
          System.out.println("Please Select Channel for Content");
          System.out.println("****************************************************");
          System.out.println("1. Best Mechanical Engineering");
          System.out.println("2. MechTricks");
          System.out.println("3. Ujjwal Sen");
          int a=0;
          try {
              a = sc.nextInt();
          }catch(Exception e){
              a=9;
          }
          switch (a){
              case 1:
                  System.out.println("**You have Selected Best Mechanical Engineering**");
                  Best_Mech_eng bme=new Best_Mech_eng();
                  bme.details();
                  break;
              case 2:
                  System.out.println("**You have Selected MechTricks**");
                  MechTricks mt=new MechTricks();
                  mt.details();
                  break;
              case 3:
                  System.out.println("**You have Selected Ujjwal Sen**");
                  Ujjwal_Sen us=new Ujjwal_Sen();
                  us.details();
                  break;
              default:
                  System.out.println("## Please Enter Valid Input##");
                  mechchannel();
                  break;
          }
      }
}
class Best_Mech_eng extends MechanicalChannels1{
    public Best_Mech_eng() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Best_Mech_eng(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Best_Mech_eng("Pritesh Deshmukh","12-Jul-2020",5648666,144567896,324,"bestenggdesh@gmail.com");
        System.out.println("$$$$$$$$$$$$           BEST MECHANICAL ENGINEERING            $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("BEST MECHANICAL ENGINEERING SHORTS");
        }
        else if(a==2){
            MechanicalChannels1 mc1=new MechanicalChannels1();
            mc1.mechchannel();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class MechTricks extends MechanicalChannels1{
    public MechTricks() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public MechTricks(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new MechTricks("Rohit Shettey","12-Jul-2014",456324,14562584,190,"rohitshettey@gmail.com");
        System.out.println("$$$$$$$$$$$$           MECH-TRICKS             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" MECH-TRICKS SHORTS");
        }
        else if(a==2){
            MechanicalChannels1 mc1=new MechanicalChannels1();
            mc1.mechchannel();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Ujjwal_Sen extends MechanicalChannels1{
    public Ujjwal_Sen() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Ujjwal_Sen(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Ujjwal_Sen("Ujjwal Sen","14-Nov-2015",4562155,748564954,175,"ujjwalsen@gmail.com");
        System.out.println("$$$$$$$$$$$$           UJJWAL SEN             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" UJJWAL SEN SHORTS");
        }
        else if(a==2){
            MechanicalChannels1 mc1=new MechanicalChannels1();
            mc1.mechchannel();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}

//Level 3 tree E-2-2
class Education2 extends MainChannel {

//Method for Education Main Channel
public static void level2m_2(){
    Scanner sc= new Scanner(System.in);
    System.out.println("***************************************************");
    System.out.println("Please Select Category of Education  for Main Channel");
    System.out.println("****************************************************");
    System.out.println("1. School Education");
    System.out.println("2. College Education");
    int a=0;
    try {
        a = sc.nextInt();
    }catch(Exception e){
        a=9;
    }
    switch (a){
        case 1:
            System.out.println("**You have Selected School Education**");
            Education_School2 es1=new Education_School2();
            es1.level3s_2s2_2();
            break;
        case 2:
            System.out.println("**You have Selected College Education**");
            Education_College2 ec1=new Education_College2();
            ec1.levelce123();
            break;
        default:
            System.out.println("## Please Enter Valid Input##");
            level2m_2();
            break;
    }
}

}
class Education_School2 extends Education2 {
    //Method for School Education--Education--Main channel
    public static void level3s_2s2_2(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Category of School Education for Main Channel");
        System.out.println("****************************************************");
        System.out.println("1. Board Study");
        System.out.println("2. Competitive Exam Study");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Board Study**");
                BoardStudy2 bs1=new BoardStudy2();
                bs1.board();
                break;
            case 2:
                System.out.println("**You have Selected Competitive Exam Study**");
                CompetitiveExam2 ce1=new CompetitiveExam2();
                ce1.level4m_21();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                level3s_2s2_2();
                break;
        }
    }
}
class BoardStudy2 extends Education_School2 {
    //Method for board main channels
        public static void board(){
            Scanner sc= new Scanner(System.in);
            System.out.println("***************************************************");
            System.out.println("Please Select Channel for Content");
            System.out.println("****************************************************");
            System.out.println("1. Online Board Study");
            System.out.println("2. Ayush Agarwal");
            System.out.println("3. Shiksha Gyan");
            int a=0;
            try {
                a = sc.nextInt();
            }catch(Exception e){
                a=9;
            }
            switch (a){
                case 1:
                    System.out.println("**You have Selected Online Board Study**");
                    Online_Board_Study obs=new Online_Board_Study();
                    obs.details();
                    break;
                case 2:
                    System.out.println("**You have Selected Ayush Agarwal**");
                    Ayush_Agarwal ag=new Ayush_Agarwal();
                    ag.details();
                    break;
                case 3:
                    System.out.println("**You have Selected Shiksha Gyan**");
                    Shiksha_Gyan sg=new Shiksha_Gyan();
                    sg.details();
                    break;
                default:
                    System.out.println("## Please Enter Valid Input##");
                    board();
                    break;
            }
        }
}
class Online_Board_Study extends BoardStudy2{
    public Online_Board_Study() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Online_Board_Study(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Online_Board_Study("Anand Takkar","19-Dec-2019",786425,94563247,145,"anandtak@gmail.com");
        System.out.println("$$$$$$$$$$$$           ONLINE-BOARD-STUDY             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("ONLINE-BOARD-STUDY MAIN");
        }
        else if(a==2){
            BoardStudy2 bs1=new BoardStudy2();
            bs1.board();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Ayush_Agarwal extends BoardStudy2{
    public Ayush_Agarwal() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Ayush_Agarwal(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Ayush_Agarwal("Ayush Agarwal","14-Jul-2015",6457865,978564234,215,"ayushagarwal@gmail.com");
        System.out.println("$$$$$$$$$$$$           AYUSH AGARWAL             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("AYUSH AGARWAL MAIN");
        }
        else if(a==2){
            BoardStudy2 bs1=new BoardStudy2();
            bs1.board();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Shiksha_Gyan extends BoardStudy2{
    public Shiksha_Gyan() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Shiksha_Gyan(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Shiksha_Gyan("Bhushan Mane","17-Jun-2016",3204567,794561428,220,"manebhushan17@gmail.com");
        System.out.println("$$$$$$$$$$$$           SHIKSHA-GYAN             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" SHIKSHA-GYAN MAIN");
        }
        else if(a==2){
            BoardStudy2 bs1=new BoardStudy2();
            bs1.board();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class CompetitiveExam2 extends Education_School2 {
    //Method for School Education--Education--Competitive exam--Main channel
    public static void level4m_21(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Category of Competitive Exam for Main Channel");
        System.out.println("****************************************************");
        System.out.println("1. JEE");
        System.out.println("2. NEET");
        System.out.println("3. NDA");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected JEE**");
                JEE2 j1=new JEE2();
                j1.jeeex();
                break;
            case 2:
                System.out.println("**You have Selected NEET**");
                NEET2 n1=new NEET2();
                n1.neet12();
                break;
            case 3:
                System.out.println("**You have Selected NDA**");
                NDA nd1=new NDA();
                nd1.nda1();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                level4m_21();
                break;
        }
    }
}
class JEE2 extends CompetitiveExam2 {
    //Method for jee main channels
     public static void jeeex(){
         Scanner sc= new Scanner(System.in);
         System.out.println("***************************************************");
         System.out.println("Please Select Channel for Content");
         System.out.println("****************************************************");
         System.out.println("1. Alakh Pandey-PW");
         System.out.println("2. Allen");
         System.out.println("3. NV Sir");
         int a=0;
         try {
             a = sc.nextInt();
         }catch(Exception e){
             a=9;
         }
         switch (a){
             case 1:
                 System.out.println("**You have Selected Alakh Pandey-PW**");
                 Alakh_Pandey ap=new Alakh_Pandey();
                 ap.details();
                 break;
             case 2:
                 System.out.println("**You have Selected Allen**");
                 Allen a1=new Allen();
                 a1.details();
                 break;
             case 3:
                 System.out.println("**You have Selected NV Sir**");
                 NV_Sir nv=new NV_Sir();
                 nv.details();
                 break;
             default:
                 System.out.println("## Please Enter Valid Input##");
                 jeeex();
                 break;
         }
     }
}
class Alakh_Pandey extends JEE2{
    public Alakh_Pandey() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Alakh_Pandey(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Alakh_Pandey("Alakh Pandey","25-Feb-2017",97845612,987456123,350,"Alakh Pandey@gmail.com");
        System.out.println("$$$$$$$$$$$$           ALAKH-PANDEY-PW             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("ALAKH-PANDEY-PW MAIN");
        }
        else if(a==2){
            JEE2 j1=new JEE2();
            j1.jeeex();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Allen extends JEE2{
    public Allen() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Allen(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Allen("Brijesh Maheshwari","11-Aug-2013",7614354,756483249,308,"allencontact@gmail.com");
        System.out.println("$$$$$$$$$$$$           ALLEN-KOTA             $$$$$$$$$$$$$");
        System.out.println("***********************************************************");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("ALLEN-KOTA MAIN");
        }
        else if(a==2){
            JEE2 j1=new JEE2();
            j1.jeeex();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class NV_Sir extends JEE2{
    public NV_Sir() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public NV_Sir(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new NV_Sir("Navin Verma","09-April-2019",7564583,89456354,169,"nvsir2145@gmail.com");
        System.out.println("$$$$$$$$$$$$           NV-SIR-JEE             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("NV-SIR-JEE MAIN");
        }
        else if(a==2){
            JEE2 j1=new JEE2();
            j1.jeeex();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class NEET2 extends CompetitiveExam2 {
    //Method for neet main channels
       public static void neet12(){
           Scanner sc= new Scanner(System.in);
           System.out.println("***************************************************");
           System.out.println("Please Select Channel for Content");
           System.out.println("****************************************************");
           System.out.println("1. AIM AIIMS ");
           System.out.println("2. NEET Total Guide");
           System.out.println("3. Allen-NEET");
           int a=0;
           try {
               a = sc.nextInt();
           }catch(Exception e){
               a=9;
           }
           switch (a){
               case 1:
                   System.out.println("**You have Selected AIM AIIMS**");
                   Aim_Aiims aa=new Aim_Aiims();
                   aa.details();
                   break;
               case 2:
                   System.out.println("**You have Selected NEET Total Guide**");
                   Neet_Total_Guide ntg=new Neet_Total_Guide();
                   ntg.details();
                   break;
               case 3:
                   System.out.println("**You have Selected Allen-NEET**");
                   Allen_Neet an=new Allen_Neet();
                   an.details();
                   break;
               default:
                   System.out.println("## Please Enter Valid Input##");
                   neet12();
                   break;
           }
       }
}
class Aim_Aiims extends NEET2{
    public Aim_Aiims() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Aim_Aiims(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Aim_Aiims("Manisha Chandra","05-Oct-2016",6452357,745613568,146,"aimaiims@gmail.com");
        System.out.println("$$$$$$$$$$$$           AIM-AIIMS             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("AIM-AIIMS MAIN");
        }
        else if(a==2){
            NEET2 n1=new NEET2();
            n1.neet12();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Neet_Total_Guide extends NEET2{
    public Neet_Total_Guide() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Neet_Total_Guide(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Neet_Total_Guide("Rahul Saru","12-Jul-2020",3201647,538504567,222,"neet455@gmail.com");
        System.out.println("$$$$$$$$$$$$           NEET-TOTAL GUIDE             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("NEET-TOTAL GUIDE MAIN");
        }
        else if(a==2){
            NEET2 n1=new NEET2();
            n1.neet12();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Allen_Neet extends NEET2{
    public Allen_Neet() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Allen_Neet(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Allen_Neet("Brijesh Maheshwari","12-Jul-2013",4667995,971563233,355,"allenneet1@gmail.com");
        System.out.println("$$$$$$$$$$$$           ALLEN NEET             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" ALLEN NEET MAIN");
        }
        else if(a==2){
            NEET2 n1=new NEET2();
            n1.neet12();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class NDA extends CompetitiveExam2 {
    //Method for nda channels
        public static void nda1(){
            Scanner sc= new Scanner(System.in);
            System.out.println("***************************************************");
            System.out.println("Please Select Channel for Content");
            System.out.println("****************************************************");
            System.out.println("1. NDA Official ");
            System.out.println("2. Officer Guide ");
            System.out.println("3. Army Tantra");
            int a=0;
            try {
                a = sc.nextInt();
            }catch(Exception e){
                a=9;
            }
            switch (a){
                case 1:
                    System.out.println("**You have Selected NDA Official**");
                    Nda_Official no=new Nda_Official();
                    no.details();
                    break;
                case 2:
                    System.out.println("**You have Selected Officer Guide**");
                    Officer_Guide og=new Officer_Guide();
                    og.details();
                    break;
                case 3:
                    System.out.println("**You have Selected Army Tantra**");
                    Army_tantra at=new Army_tantra();
                    at.details();
                    break;
                default:
                    System.out.println("## Please Enter Valid Input##");
                    nda1();
                    break;
            }
        }
}
class Nda_Official extends NDA{
    public Nda_Official() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Nda_Official(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Nda_Official("Rakesh Keshwala","12-Jul-2018",785651,784651686,165,"ndaofficial11@gmail.com");
        System.out.println("$$$$$$$$$$$$           NDA-OFFICIAL             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("NDA-OFFICIAL MAIN");
        }
        else if(a==2){
            NDA nd1=new NDA();
            nd1.nda1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Officer_Guide extends NDA{
    public Officer_Guide() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Officer_Guide(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Officer_Guide("Krishna Kashid","26-March-2014",4576824,346476156,400,"guideofficer@gmail.com");
        System.out.println("$$$$$$$$$$$$           OFFICER GUIDE             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("OFFICER GUIDE MAIN");
        }
        else if(a==2){
            NDA nd1=new NDA();
            nd1.nda1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Army_tantra extends NDA{
    public Army_tantra() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Army_tantra(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Army_tantra("Anup Sontakke","12-Jul-2018",3656486,457864235,264,"tantraarmy@gmail.com");
        System.out.println("$$$$$$$$$$$$           ARMY TANTRA             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("ARMY TANTRA MAIN");
        }
        else if(a==2){
            NDA nd1=new NDA();
            nd1.nda1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }


}
class Education_College2 extends Education2 {
    //method for college education --main channel
    public static void levelce123(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Category of College Education for Main Channel");
        System.out.println("****************************************************");
        System.out.println("1. CS");
        System.out.println("2. MECH");
        System.out.println("3. ELECTRICAL");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected CS**");
                ComputerChannels2 cc1=new ComputerChannels2();
                cc1.compsm();
                break;
            case 2:
                System.out.println("**You have Selected MECH**");
                MechanicalChannels2 mc1=new MechanicalChannels2();
                mc1.mechm();
                break;
            case 3:
                System.out.println("**You have Selected ELECTRICAL**");
                ElectricalChannels2 ec1=new ElectricalChannels2();
                ec1.elecm();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                levelce123();
                break;
        }
    }
}
class ComputerChannels2 extends Education_College2 {
    //Method for CS main channels
       public static void compsm(){
           Scanner sc= new Scanner(System.in);
           System.out.println("***************************************************");
           System.out.println("Please Select Channel for Content");
           System.out.println("****************************************************");
           System.out.println("1. NPTEl CS");
           System.out.println("2. Skill CS");
           System.out.println("3. Love Babbar");
           int a=0;
           try {
               a = sc.nextInt();
           }catch(Exception e){
               a=9;
           }
           switch (a){
               case 1:
                   System.out.println("**You have Selected NPTEl CS**");
                   Nptel_cs ncs=new Nptel_cs();
                   ncs.details();
                   break;
               case 2:
                   System.out.println("**You have Selected Skill CS**");
                   Skill_cs sk=new Skill_cs();
                   sk.details();
                   break;
               case 3:
                   System.out.println("**You have Selected Love Babbar**");
                   Love_Babbar lb=new Love_Babbar();
                   lb.details();
                   break;
               default:
                   System.out.println("## Please Enter Valid Input##");
                   compsm();
                   break;
           }
       }
}
class Nptel_cs extends ComputerChannels2{
    public Nptel_cs() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Nptel_cs(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Nptel_cs("NPTEL","07-Jul-2014",3231565,645789496,359,"nptelco@gmail.com");
        System.out.println("$$$$$$$$$$$$           NPTEL-CS             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("NPTEL-CS MAIN");
        }
        else if(a==2){
            ComputerChannels2 cc1=new ComputerChannels2();
            cc1.compsm();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }


}
class Skill_cs extends ComputerChannels2{
    public Skill_cs() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Skill_cs(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Skill_cs("Virat Jaiswar","20-Sept-2014",3154795,465786312,200,"viratjaiswar@gmail.com");
        System.out.println("$$$$$$$$$$$$           SKILL-CS             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("SKILL-CS MAIN");
        }
        else if(a==2){
            ComputerChannels2 cc1=new ComputerChannels2();
            cc1.compsm();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Love_Babbar extends ComputerChannels2{
    public Love_Babbar() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Love_Babbar(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Love_Babbar("Love Babbar","23-DEC-2016",6457886,98455656,298,"lovebabbar@gmail.com");
        System.out.println("$$$$$$$$$$$$           LOVE BABBAR             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("LOVE BABBAR MAIN");
        }
        else if(a==2){
            ComputerChannels2 cc1=new ComputerChannels2();
            cc1.compsm();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class MechanicalChannels2 extends Education_College2 {
    //Method for mech main channels
       public static void mechm(){
           Scanner sc= new Scanner(System.in);
           System.out.println("***************************************************");
           System.out.println("Please Select Channel for Content");
           System.out.println("****************************************************");
           System.out.println("1. NPTEl Mech");
           System.out.println("2. Skill Mech");
           System.out.println("3. Unacademy-Mech");
           int a=0;
           try {
               a = sc.nextInt();
           }catch(Exception e){
               a=9;
           }
           switch (a){
               case 1:
                   System.out.println("**You have Selected NPTEl Mech**");
                   Nptel_Mech nm=new Nptel_Mech();
                   nm.details();
                   break;
               case 2:
                   System.out.println("**You have Selected Skill Mech**");
                   Skill_Mech sm=new Skill_Mech();
                   sm.details();
                   break;
               case 3:
                   System.out.println("**You have Selected Unacademy-Mech**");
                   Unacademy_mech nm1=new Unacademy_mech();
                   nm1.details();
                   break;
               default:
                   System.out.println("## Please Enter Valid Input##");
                   mechm();
                   break;
           }
       }
}
class Nptel_Mech extends MechanicalChannels2{
    public Nptel_Mech() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Nptel_Mech(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Nptel_Mech("NPTEL","12-Jul-2014",3465678,457456765,265,"nptelco@gmail.com");
        System.out.println("$$$$$$$$$$$$           NPTEL-MECH             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("NPTEL-MECH MAIN");
        }
        else if(a==2){
            MechanicalChannels2 mc1=new MechanicalChannels2();
            mc1.mechm();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }


}
class Skill_Mech extends MechanicalChannels2{
    public Skill_Mech() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Skill_Mech(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Skill_Mech("Rohit Mishra","11-JAN-2018",456766,57664656,456,"rohitmishra@gmail.com");
        System.out.println("$$$$$$$$$$$$           SKILL-MECH             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("SKILL-MECH MAIN");
        }
        else if(a==2){
            MechanicalChannels2 mc1=new MechanicalChannels2();
            mc1.mechm();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Unacademy_mech extends MechanicalChannels2{
    public Unacademy_mech() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Unacademy_mech(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Unacademy_mech("Unacademy.co.in","12-Jul-2019",456476,154688946,357,"unacademy@gmail.com");
        System.out.println("$$$$$$$$$$$$           UNACADEMY-MECH             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("UNACADEMY-MECH MAIN");
        }
        else if(a==2){
            MechanicalChannels2 mc1=new MechanicalChannels2();
            mc1.mechm();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class ElectricalChannels2 extends Education_College2 {
    //Method for electrical main channels
         public static void elecm(){
             Scanner sc= new Scanner(System.in);
             System.out.println("***************************************************");
             System.out.println("Please Select Channel for Content");
             System.out.println("****************************************************");
             System.out.println("1. NPTEL Electrical");
             System.out.println("2. ELectroflex");
             System.out.println("3. ElectroGyan");
             int a=0;
             try {
                 a = sc.nextInt();
             }catch(Exception e){
                 a=9;
             }
             switch (a){
                 case 1:
                     System.out.println("**You have Selected NPTEL Electrical**");
                     Nptel_elc ne=new Nptel_elc();
                     ne.details();
                     break;
                 case 2:
                     System.out.println("**You have Selected Electroflex**");
                     Electroflex elf=new Electroflex();
                     elf.details();
                     break;
                 case 3:
                     System.out.println("**You have Selected ElectroGyan**");
                     ElectroGyan eg=new ElectroGyan();
                     eg.details();
                     break;
                 default:
                     System.out.println("## Please Enter Valid Input##");
                     elecm();
                     break;
             }
         }
}
class Nptel_elc extends ElectricalChannels2{
    public Nptel_elc() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Nptel_elc(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Nptel_elc("NPTEL","12-Jul-2015",7664659,478665646,410,"nptelco@gmail.com");
        System.out.println("$$$$$$$$$$$$           NPTEL-ELECTRO             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" NPTEL-ELECTRO MAIN");
        }
        else if(a==2){
            ElectricalChannels2 ec1=new ElectricalChannels2();
            ec1.elecm();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Electroflex extends ElectricalChannels2{
    public Electroflex() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Electroflex(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Electroflex("Omkar Pillai","18-Jun-2017",4567886,84623579,456,"omkarpillai@gmail.com");
        System.out.println("$$$$$$$$$$$$           ELECTRO-FLEX             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("ELECTRO-FLEX  MAIN");
        }
        else if(a==2){
            ElectricalChannels2 ec1=new ElectricalChannels2();
            ec1.elecm();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class ElectroGyan extends ElectricalChannels2{
    public ElectroGyan() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public ElectroGyan(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new ElectroGyan("Ramesh Maher","29-Jul-2018",456785,9876452,300,"electrogyan@gmail.com");
        System.out.println("$$$$$$$$$$$$           ELECTRO-GYAN             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" ELECTRO-GYAN MAIN");
        }
        else if(a==2){
            ElectricalChannels2 ec1=new ElectricalChannels2();
            ec1.elecm();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
//Level 3 tree E-1-3
class Sport1 extends ShortChannel {

//Method for Sports Short channel
public static void level2s_3(){
    Scanner sc= new Scanner(System.in);
    System.out.println("***************************************************");
    System.out.println("Please Select Category of Sports  for Short Channel");
    System.out.println("****************************************************");
    System.out.println("1. Cricket ");
    System.out.println("2. Football");
    System.out.println("3. Kabaddi");

    int a=0;
    try {
        a = sc.nextInt();
    }catch(Exception e){
        a=9;
    }
    switch (a){
        case 1:
            System.out.println("**You have Selected Sport: Cricket**");
            Cricket1 c1=new Cricket1();
            c1.crick1();
            break;
        case 2:
            System.out.println("**You have Selected Sport: Football**");
            Football1 f1=new Football1();
            f1.foot1();
            break;
        case 3:
            System.out.println("**You have Selected Sport: Kabaddi**");
            Kabaddi1 k1=new Kabaddi1();
            k1.kab1();
            break;
        default:
            System.out.println("## Please Enter Valid Input##");
            level2s_3();
            break;
    }

}
}
class Cricket1 extends Sport1 {
    //Method for cricket short videos
     public static void crick1(){
         Scanner sc= new Scanner(System.in);
         System.out.println("***************************************************");
         System.out.println("Please Select Channel for Content");
         System.out.println("****************************************************");
         System.out.println("1. ICC Cricket");
         System.out.println("2. Crick-Star");
         System.out.println("3. Cricko");
         int a=0;
         try {
             a = sc.nextInt();
         }catch(Exception e){
             a=9;
         }
         switch (a){
             case 1:
                 System.out.println("**You have Selected ICC Cricket**");
                 ICC_Crick ic=new ICC_Crick();
                 ic.details();
                 break;
             case 2:
                 System.out.println("**You have Selected Crick-Star**");
                 Crick_Star cs=new Crick_Star();
                 cs.details();
                 break;
             case 3:
                 System.out.println("**You have Selected Cricko**");
                 Cricko cr=new Cricko();
                 cr.details();
                 break;
             default:
                 System.out.println("## Please Enter Valid Input##");
                 crick1();
                 break;
         }
     }
}
class ICC_Crick extends Cricket1{
    public ICC_Crick() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public ICC_Crick(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new ICC_Crick("ICC.co","12-Jul-2012",645786,45678952,345,"iccco@gmail.com");
        System.out.println("$$$$$$$$$$$$           ICC CRICKET             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" ICC CRICKET SHORTS");
        }
        else if(a==2){
            Cricket1 c1=new Cricket1();
            c1.crick1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Crick_Star extends Cricket1{
    public Crick_Star() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Crick_Star(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Crick_Star("Dinesh Mehra","06-May-2016",457634,7643594,427,"crickstar@gmail.com");
        System.out.println("$$$$$$$$$$$$           CRICK-STAR             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("CRICK-STAR SHORTS");
        }
        else if(a==2){
            Cricket1 c1=new Cricket1();
            c1.crick1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Cricko extends Cricket1{
    public Cricko() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Cricko(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Cricko("Abhishek Mann","12-Jul-2019",324567,47569975,455,"mannabhishek@gmail.com");
        System.out.println("$$$$$$$$$$$$           CRICKO             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("CRICKO SHORTS");
        }
        else if(a==2){
            Cricket1 c1=new Cricket1();
            c1.crick1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Football1 extends Sport1 {
    //Method for Football short channels
      public static void foot1(){
          Scanner sc= new Scanner(System.in);
          System.out.println("***************************************************");
          System.out.println("Please Select Channel for Content");
          System.out.println("****************************************************");
          System.out.println("1. FIFA Shorts");
          System.out.println("2. Football-Star");
          System.out.println("3. Alsido Football");
          int a=0;
          try {
              a = sc.nextInt();
          }catch(Exception e){
              a=9;
          }
          switch (a){
              case 1:
                  System.out.println("**You have Selected FIFA Shorts**");
                  Fifa_shorts ff=new Fifa_shorts();
                  ff.details();
                  break;
              case 2:
                  System.out.println("**You have Selected Football-Star**");
                  Football_stars fs=new Football_stars();
                  fs.details();
                  break;
              case 3:
                  System.out.println("**You have Selected Alsido Football**");
                  Alsido_Football af=new Alsido_Football();
                  af.details();
                  break;
              default:
                  System.out.println("## Please Enter Valid Input##");
                  foot1();
                  break;
          }
      }
}
class Fifa_shorts extends Football1{
    public Fifa_shorts() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Fifa_shorts(String creator_Name, String date_Of_Join, long subscribers,long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Fifa_shorts("FIFA.CO.IN","12-DEC-2016",456782,124567865,245,"fifacoin@gmail.com");
        System.out.println("$$$$$$$$$$$$           FIFA SHORTS             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("FIFA SHORTS");
        }
        else if(a==2){
            Football1 f1=new Football1();
            f1.foot1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Football_stars extends Football1{
    public Football_stars() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Football_stars(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Football_stars("Mandeep Singh","13-Aug-2016",356426,1546583,288,"footballstars@gmail.com");
        System.out.println("$$$$$$$$$$$$           FOOTBALL STARS             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("FOOTBALL STARS SHORTS");
        }
        else if(a==2){
            Football1 f1=new Football1();
            f1.foot1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Alsido_Football extends Football1{
    public Alsido_Football() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Alsido_Football(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Alsido_Football("Alsido Tango","22-Jun-2013",3201256,53850655,350,"alsido11@gmail.com");
        System.out.println("$$$$$$$$$$$$           ALSIDO FOOTBALL             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("ALSIDO FOOTBALL SHORTS");
        }
        else if(a==2){
            Football1 f1=new Football1();
            f1.foot1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Kabaddi1 extends Sport1 {
    //Method for Kabaddi short channels
        public static void kab1(){
            Scanner sc= new Scanner(System.in);
            System.out.println("***************************************************");
            System.out.println("Please Select Channel for Content");
            System.out.println("****************************************************");
            System.out.println("1. Kabaddi Pros");
            System.out.println("2. Kabaddi Heroes");
            System.out.println("3. World Kabaddi");
            int a=0;
            try {
                a = sc.nextInt();
            }catch(Exception e){
                a=9;
            }
            switch (a){
                case 1:
                    System.out.println("**You have Selected Kabaddi Pros**");
                    Kabaddi_pros kp=new Kabaddi_pros();
                    kp.details();
                    break;
                case 2:
                    System.out.println("**You have Selected Kabaddi Heroes**");
                    Kabaddi_Heroes kh=new Kabaddi_Heroes();
                    kh.details();
                    break;
                case 3:
                    System.out.println("**You have Selected World Kabaddi**");
                    World_Kabaddi wk=new World_Kabaddi();
                    wk.details();
                    break;
                default:
                    System.out.println("## Please Enter Valid Input##");
                    kab1();
                    break;
            }
        }
}
class Kabaddi_pros extends Kabaddi1{
    public Kabaddi_pros() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Kabaddi_pros(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Kabaddi_pros("Hansika Jain","12-Jul-2016",456385,79458625,218,"hansikajain@gmail.com");
        System.out.println("$$$$$$$$$$$$           KABADDI-PROS             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("KABADDI-PROS SHORTS");
        }
        else if(a==2){
            Kabaddi1 k1=new Kabaddi1();
            k1.kab1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }


}
class Kabaddi_Heroes extends Kabaddi1{
    public Kabaddi_Heroes() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Kabaddi_Heroes(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Kabaddi_Heroes("Rajesh Shukla","18-July-2014",455689,7546825,321,"rajeshshukla@gmail.com");
        System.out.println("$$$$$$$$$$$$           KABADDI HEROES             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("KABADDI HEROES SHORTS");
        }
        else if(a==2){
            Kabaddi1 k1=new Kabaddi1();
            k1.kab1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }


}
class World_Kabaddi extends Kabaddi1{
    public World_Kabaddi() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public World_Kabaddi(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new World_Kabaddi("Manoj Tripathi","05-Oct-2019",786466,64586124,376,"worldkabaddi21@gmail.com");
        System.out.println("$$$$$$$$$$$$           WORLD-KABADDI             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("WORLD-KABADDI  SHORTS");
        }
        else if(a==2){
            Kabaddi1 k1=new Kabaddi1();
            k1.kab1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }


}
//Level 3 tree E-2-3
class Sport2 extends MainChannel {

//Method for Sports Main Channel
public static void level2m_3(){
    Scanner sc= new Scanner(System.in);
    System.out.println("***************************************************");
    System.out.println("Please Select Category of Sports  for Main Channel");
    System.out.println("****************************************************");
    System.out.println("1. Cricket ");
    System.out.println("2. Football");
    System.out.println("3. Kabaddi");

    int a=0;
    try {
        a = sc.nextInt();
    }catch(Exception e){
        a=9;
    }
    switch (a){
        case 1:
            System.out.println("**You have Selected Sport: Cricket**");
            Cricket2 c1=new Cricket2();
            c1.crick2();
            break;
        case 2:
            System.out.println("**You have Selected Sport: Football**");
            Football2 f1=new Football2();
            f1.foot2();
            break;
        case 3:
            System.out.println("**You have Selected Sport: Kabaddi**");
            Kabaddi2 k1=new Kabaddi2();
            k1.kab2();
            break;
        default:
            System.out.println("## Please Enter Valid Input##");
            level2m_3();
            break;
    }
}
}
class Cricket2 extends Sport2 {
    //Method for cricket main channel
    public static void crick2(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for Content");
        System.out.println("****************************************************");
        System.out.println("1. ICC Cricket");
        System.out.println("2. Crick-Star");
        System.out.println("3. Cricko");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected ICC Cricket**");
                ICC_Crick1 ic=new ICC_Crick1();
                ic.details();
                break;
            case 2:
                System.out.println("**You have Selected Crick-Star**");
                Crick_Star1 cs=new Crick_Star1();
                cs.details();
                break;
            case 3:
                System.out.println("**You have Selected Cricko**");
                Cricko1 cr=new Cricko1();
                cr.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                crick2();
                break;
        }
    }

}
class ICC_Crick1 extends Cricket2{
    public ICC_Crick1() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public ICC_Crick1(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new ICC_Crick1("ICC CRICKET CO.IN","15-Jul-2014",3201645,456283746,415,"icccoin@gmail.com");
        System.out.println("$$$$$$$$$$$$           ICC-CRICKET             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("ICC-CRICKET MAIN");
        }
        else if(a==2){
            Cricket2 c1=new Cricket2();
            c1.crick2();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Crick_Star1 extends Cricket2{
    public Crick_Star1() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Crick_Star1(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Crick_Star1("Mangesh Hunjale","12-Jul-2018",645725,74562143,217,"mangeshhunjale@gmail.com");
        System.out.println("$$$$$$$$$$$$           CRICKET STARS             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("CRICKET STARS MAIN");
        }
        else if(a==2){
            Cricket2 c1=new Cricket2();
            c1.crick2();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Cricko1 extends Cricket2{
    public Cricko1() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Cricko1(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Cricko1("Jatin Sapru","28-Jul-2016",4564563,457624665,394,"jatinsaprucricko@gmail.com");
        System.out.println("$$$$$$$$$$$$           CRICKO             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if (a==1){
            Main m1=new Main();
            m1.subscribe("CRICKO MAIN");
        }
        else if(a==2){
            Cricket2 c1=new Cricket2();
            c1.crick2();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Football2 extends Sport2 {
    //Method for Football Main Channels
    public static void foot2(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for Content");
        System.out.println("****************************************************");
        System.out.println("1. FIFA Main");
        System.out.println("2. Football-Star");
        System.out.println("3. Alsido Football");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected FIFA Shorts**");
                Fifa_shorts1 ff=new Fifa_shorts1();
                ff.details();
                break;
            case 2:
                System.out.println("**You have Selected Football-Star**");
                Football_stars1 fs=new Football_stars1();
                fs.details();
                break;
            case 3:
                System.out.println("**You have Selected Alsido Football**");
                Alsido_Football1 af=new Alsido_Football1();
                af.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                foot2();
                break;
        }
    }

}
class Fifa_shorts1 extends Football2{
    public Fifa_shorts1() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Fifa_shorts1(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Fifa_shorts1("FIFA CO.IN","12-Jul-2012",456257,42567846,286,"fifacoin@gmail.com");
        System.out.println("$$$$$$$$$$$$           FIFA             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("  FIFA MAIN");
        }
        else if(a==2){
            Football2 f1=new Football2();
            f1.foot2();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Football_stars1 extends Football2{
    public Football_stars1() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Football_stars1(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Football_stars1("Rajat Swamy","23-Jun-2016",4665726,476583459,450,"rajatswamy@gmail.com");
        System.out.println("$$$$$$$$$$$$           FOOTBALL-STARS             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" FOOTBALL-STARS  MAIN");
        }
        else if(a==2){
            Football2 f1=new Football2();
            f1.foot2();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Alsido_Football1 extends Football2{
    public Alsido_Football1() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Alsido_Football1(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Alsido_Football1("Alsido Marsh","27-March-2014",4662483,455625635,471,"alsidofootball@gmail.com");
        System.out.println("$$$$$$$$$$$$           ALSIDO-FOOTBALL             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("ALSIDO-FOOTBALL MAIN");
        }
        else if(a==2){
            Football2 f1=new Football2();
            f1.foot2();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Kabaddi2 extends Sport2 {
    //Method for kabaddi Main channels
    public static void kab2(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for Content");
        System.out.println("****************************************************");
        System.out.println("1. Kabaddi Pros");
        System.out.println("2. Kabaddi Heroes");
        System.out.println("3. World Kabaddi");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Kabaddi Pros**");
               Kabaddi_pros1 kb1=new Kabaddi_pros1();
               kb1.details();
                break;
            case 2:
                System.out.println("**You have Selected Kabaddi Heroes**");
                Kabaddi_Heroes1 kh1=new Kabaddi_Heroes1();
                kh1.details();
                break;
            case 3:
                System.out.println("**You have Selected World Kabaddi**");
                World_Kabaddi1 wk1=new World_Kabaddi1();
                wk1.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                kab2();
                break;
        }
    }

}
class Kabaddi_pros1 extends Kabaddi2{
    public Kabaddi_pros1() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Kabaddi_pros1(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Kabaddi_pros1("Manish Shah","19-Jul-2014",472563,74356248,421,"manishshah@gmail.com");
        System.out.println("$$$$$$$$$$$$           KABADDI PROS             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("KABADDI PROS MAIN");
        }
        else if(a==2){
            Kabaddi2 k1=new Kabaddi2();
            k1.kab2();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Kabaddi_Heroes1 extends Kabaddi2{
    public Kabaddi_Heroes1() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Kabaddi_Heroes1(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Kabaddi_Heroes1("Mahesh Dravid","02-Oct-2018",145286,71256348,248,"dravidmahesh12@gmail.com");
        System.out.println("$$$$$$$$$$$$           KABADDI-HEROES             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" KABADDI-HEROES MAIN");
        }
        else if(a==2){
            Kabaddi2 k1=new Kabaddi2();
            k1.kab2();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class World_Kabaddi1 extends Kabaddi2{
    public World_Kabaddi1() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public World_Kabaddi1(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new World_Kabaddi1("Prathamesh Jadeja","04-Dec-2017",3246157,94632571,420,"jadejaprathamesh21gmail.com");
        System.out.println("$$$$$$$$$$$$           WORLD-KABADDI             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" WORLD-KABADDI MAIN");
        }
        else if(a==2){
            Kabaddi2 k1=new Kabaddi2();
            k1.kab2();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
//Level 3 tree E-1-4
class Finance_Business1 extends ShortChannel {

//Method for Finance and Business Short Channel
public static void level2s_4(){
    Scanner sc= new Scanner(System.in);
    System.out.println("***************************************************");
    System.out.println("Please Select Category of Finance And Business for Short Channel");
    System.out.println("****************************************************");
    System.out.println("1. Finance");
    System.out.println("2. Business");
    int a=0;
    try {
        a = sc.nextInt();
    }catch(Exception e){
        a=9;
    }
    switch (a){
        case 1:
            System.out.println("**You have Selected Finance**");
            Finance1 f1=new Finance1();
            f1.fin1();
            break;
        case 2:
            System.out.println("**You have Selected Business**");
            Business1 b1=new Business1();
            b1.busi1();
            break;
        default:
            System.out.println("## Please Enter Valid Input##");
            level2s_4();
            break;
    }
}
}
class Finance1 extends Finance_Business1 {
    //Method for finance short channels
    public static void fin1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. LLA");
        System.out.println("2. Finance with Sharan");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected LLA**");
                LLA la=new LLA();
                la.details();
                break;
            case 2:
                System.out.println("**You have Selected Finance with Sharan**");
                Finance_with_Sharan fws=new Finance_with_Sharan();
                fws.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                fin1();
                break;
        }
    }

}
class LLA extends Finance1{
    public LLA() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public LLA(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new LLA("Ankit Solanki","07-Jan-2015",745236,9456127,398,"labourlawco@gmail.com");
        System.out.println("$$$$$$$$$$$$           LABOUR LAW ADVISOR             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("LABOUR LAW ADVISOR SHORTS");
        }
        else if(a==2){
            Finance1 f1=new Finance1();
            f1.fin1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Finance_with_Sharan extends Finance1{
    public Finance_with_Sharan() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Finance_with_Sharan(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Finance_with_Sharan("Sharan Sharma","09-April-2019",156483,1456237,217,"financewithsharan@gmail.com");
        System.out.println("$$$$$$$$$$$$           FINANCE WITH SHARAN             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("FINANCE WITH SHARAN SHORTS");
        }
        else if(a==2){
            Finance1 f1=new Finance1();
            f1.fin1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}

class Business1 extends Finance_Business1 {
    //Method for Business short channel
    public static void busi1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. Vivek Bindra Shorts");
        System.out.println("2. Ujjwal Pathani");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Vivek Bindra Shorts**");
                Vivek_bindras vb=new Vivek_bindras();
                vb.details();
                break;
            case 2:
                System.out.println("**You have Selected Ujjwal Pathani**");
                Ujjwal_patani up=new Ujjwal_patani();
                up.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                busi1();
                break;
        }
    }

}
class Vivek_bindras extends Business1{
    public Vivek_bindras() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Vivek_bindras(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Vivek_bindras("Vivek Bindra","12-Jan-2014",1264573,754123648,411,"bindrashorts@gmail.com");
        System.out.println("$$$$$$$$$$$$           VIVEK BINDRA SHORTS             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("VIVEK BINDRA SHORTS ");
        }
        else if(a==2){
            Business1 b1=new Business1();
            b1.busi1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Ujjwal_patani extends Business1{
    public Ujjwal_patani() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Ujjwal_patani(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Ujjwal_patani("Ujjwal Patani","21-Sept-2016",745215,8451624,379,"ujjwalpatanis@gmail.com");
        System.out.println("$$$$$$$$$$$$           UJJWAL PATANI SHORTS             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("UJJWAL PATANI SHORTS");
        }
        else if(a==2){
            Business1 b1=new Business1();
            b1.busi1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}

//Level 3 tree E-2-4
class Finance_Business2 extends MainChannel {

//Method for Finance and Business Main Channel
public static void level2m_4(){
    Scanner sc= new Scanner(System.in);
    System.out.println("***************************************************");
    System.out.println("Please Select Category of Finance And Business for Main Channel");
    System.out.println("****************************************************");
    System.out.println("1. Finance");
    System.out.println("2. Business");
    int a=0;
    try {
        a = sc.nextInt();
    }catch(Exception e){
        a=9;
    }
    switch (a){
        case 1:
            System.out.println("**You have Selected Finance**");
            Finance2 f1=new Finance2();
            f1.fin2();
            break;
        case 2:
            System.out.println("**You have Selected Business**");
            Business2 b1=new Business2();
            b1.level4m_b();
            break;
        default:
            System.out.println("## Please Enter Valid Input##");
            level2m_4();
            break;
    }
}

}
class Finance2 extends Finance_Business2 {
    //Method for Finance 2 main channel
    public static void fin2(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. Rachana Ranade");
        System.out.println("2. Robert Kiyosaki");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Rachana Ranade**");
                Rachana_Ranade rr=new Rachana_Ranade();
                rr.details();
                break;
            case 2:
                System.out.println("**You have Selected Robert Kiyosaki**");
                Robert_Kiyosaki rk=new Robert_Kiyosaki();
                rk.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                fin2();
                break;
        }
    }

}
class Rachana_Ranade extends Finance2{
    public Rachana_Ranade() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Rachana_Ranade(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Rachana_Ranade("Rachana Ranade","16-March-2015",451635,7456124,219,"rachanaranade@gmail.com");
        System.out.println("$$$$$$$$$$$$           CA-RACHANA RANADE             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("CA-RACHANA RANADE MAIN");
        }
        else if(a==2){
            Finance2 f1=new Finance2();
            f1.fin2();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Robert_Kiyosaki extends Finance2{
    public Robert_Kiyosaki() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Robert_Kiyosaki(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Robert_Kiyosaki("Robert Kiyosaki","05-Nov-2011",4621534,74621534,321,"robertkiyosaki@gmail.com");
        System.out.println("$$$$$$$$$$$$           ROBERT-KIYOSAKI             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("ROBERT-KIYOSAKI MAIN");
        }
        else if(a==2){
            Finance2 f1=new Finance2();
            f1.fin2();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Business2 extends Finance_Business2 {
    //Method for f&b--business--main channel
    public static void level4m_b(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Category of Business for Main Channel");
        System.out.println("****************************************************");
        System.out.println("1. Business Story");
        System.out.println("2. Entrepreneurship");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Business Study**");
                BusinessStudy bs1=new BusinessStudy();
                bs1.bus1();
                break;
            case 2:
                System.out.println("**You have Selected Entrepreneurship**");
                Entrepreneur2 ep1=new Entrepreneur2();
                ep1.ent();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                level4m_b();
                break;
        }
    }
}
class BusinessStudy extends Business2 {
    //Method for Business study  main channels
    public static void bus1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. Stanford Business Study");
        System.out.println("2. Jamanalal Bajaj");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Stanford Business Study**");
               Stanford sf=new Stanford();
               sf.details();
                break;
            case 2:
                System.out.println("**You have Selected Jamanalal Bajaj**");
                Jamanalal jb=new Jamanalal();
                jb.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                bus1();
                break;
        }
    }
}
class Stanford extends BusinessStudy{
    public Stanford() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Stanford(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Stanford("Stanford Business Study","31-Aug-2011",465234,945623154,246,"stanfordbusiness@gmail.com");
        System.out.println("$$$$$$$$$$$$           STANFORD BUSINESS STUDY             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("STANFORD BUSINESS STUDY MAIN");
        }
        else if(a==2){
            BusinessStudy bs1=new BusinessStudy();
            bs1.bus1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Jamanalal extends  BusinessStudy{
    public Jamanalal() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Jamanalal(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Jamanalal("Jamanalal Bajaj","21-Jul-2016",320124,53845623,378,"jamanalalbajaj@gmail.com");
        System.out.println("$$$$$$$$$$$$           JAMANALLAL BAJAJ             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("JAMANALLAL BAJAJ MAIN");
        }
        else if(a==2){
            BusinessStudy bs1=new BusinessStudy();
            bs1.bus1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Entrepreneur2 extends Business2 {
    //Method for entrepreuneship main channels
    public static void ent(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. Ankur Warrikoo");
        System.out.println("2. Startup Gyan");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Ankur Warrikoo**");
                Ankur ak=new Ankur();
                ak.details();
                break;
            case 2:
                System.out.println("**You have Selected Startup Gyan**");
                Startup st=new Startup();
                st.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                ent();
                break;
        }
    }

}
class Ankur extends Entrepreneur2{
    public Ankur() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Ankur(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Ankur("Ankur Warikoo","21-Aug-2019",4526145,456799214,321,"ankurwarikoo@gmail.com");
        System.out.println("$$$$$$$$$$$$           ANKUR WARIKOO             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("ANKUR WARIKOO MAIN");
        }
        else if(a==2){
            Entrepreneur2 ep1=new Entrepreneur2();
            ep1.ent();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Startup extends Entrepreneur2{
    public Startup() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Startup(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Startup("Raushni Sharma","25-May-2015",354628,75642564,296,"raushnisharma@gmail.com");
        System.out.println("$$$$$$$$$$$$           STARTUP             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("STARTUP MAIN");
        }
        else if(a==2){
            Entrepreneur2 ep1=new Entrepreneur2();
            ep1.ent();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}

//Level 3 tree E-1-5
class Entertainment1 extends ShortChannel {

//Method for Entertainment for Short channel
public static void level2s_5(){
    Scanner sc= new Scanner(System.in);
    System.out.println("***************************************************");
    System.out.println("Please Select Category of Entertainment for Short Channel");
    System.out.println("****************************************************");
    System.out.println("1. Comedy");
    System.out.println("2. Reels");
    int a=0;
    try {
        a = sc.nextInt();
    }catch(Exception e){
        a=9;
    }
    switch (a){
        case 1:
            System.out.println("**You have Selected Comedy**");
            Comedy1 c1=new Comedy1();
            c1.com1();
            break;
        case 2:
            System.out.println("**You have Selected Reels**");
            Reels r1=new Reels();
            r1.rel();
            break;
        default:
            System.out.println("## Please Enter Valid Input##");
            level2s_5();
            break;
    }
}
}
class Comedy1 extends Entertainment1 {
    //Method for comedy short channels
    public static void com1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. Funcho");
        System.out.println("2. Kushal Pawar");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Funcho**");
                Funcho f=new Funcho();
                f.details();
                break;
            case 2:
                System.out.println("**You have Selected Kushal Pawar**");
                Kushal_pawar kp=new Kushal_pawar();
                kp.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                com1();
                break;
        }
    }

}
class Funcho extends Comedy1{
    public Funcho() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Funcho(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Funcho("Harsh Patel","20-Nov-2017",6523142,96423514,198,"funcho@gmail.com");
        System.out.println("$$$$$$$$$$$$           FUNCHO             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("FUNCHO SHORTS");
        }
        else if(a==2){
            Comedy1 c1=new Comedy1();
            c1.com1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }


}
class Kushal_pawar extends Comedy1{
    public Kushal_pawar() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Kushal_pawar(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Kushal_pawar("Kushal Pawar","23-May-2016",1564235,7645284,333,"kushalpawar@gmail.com");
        System.out.println("$$$$$$$$$$$$           KUSHAL PAWAR             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" KUSHAL PAWAR SHORTS");
        }
        else if(a==2){
            Comedy1 c1=new Comedy1();
            c1.com1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Reels extends Entertainment1 {
    //Method for Reels short channel
    public static void rel(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. Ashish Chanchlani");
        System.out.println("2. BB ki Vines");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Ashish Chanchlani**");
                Ashish as=new Ashish();
                as.details();
                break;
            case 2:
                System.out.println("**You have Selected BB ki Vines**");
                BB_Vines bb=new BB_Vines();
                bb.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                rel();
                break;
        }
    }


}
class Ashish extends Reels{
    public Ashish() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Ashish(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Ashish("Ashish Chanchlani","14-Jul-2016",6425314,76542564,401,"ashishchanchlani@gmail.com");
        System.out.println("$$$$$$$$$$$$           ASHISH CHANCHLANI VINES            $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("ASHISH CHANCHLANI VINES SHORTS");
        }
        else if(a==2){
            Reels r1=new Reels();
            r1.rel();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class BB_Vines extends Reels{
    public BB_Vines() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public BB_Vines(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new BB_Vines("Bhuvan Bam","02-Aug-2013",4561755,364521456,601,"bbkivines@gmail.com");
        System.out.println("$$$$$$$$$$$$           BB KI VINES             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("BB KI VINES SHORTS");
        }
        else if(a==2){
            Reels r1=new Reels();
            r1.rel();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
//Level 3 tree E-2-5
class Entertainment2 extends MainChannel {

//Method for Entertainment Main channel
public static void level2m_5(){
    Scanner sc= new Scanner(System.in);
    System.out.println("***************************************************");
    System.out.println("Please Select Category of Entertainment for Main Channel");
    System.out.println("****************************************************");
    System.out.println("1. Comedy");
    System.out.println("2. Vlogging");
    System.out.println("3. Movies");
    System.out.println("4. Reality Show");
    int a=0;
    try {
        a = sc.nextInt();
    }catch(Exception e){
        a=9;
    }
    switch (a){
        case 1:
            System.out.println("**You have Selected Comedy**");
            Comedy2 c1=new Comedy2();
            c1.com2();
            break;
        case 2:
            System.out.println("**You have Selected Vlogging**");
            Vlogging v1=new Vlogging();
            v1.vlog();
            break;
        case 3:
            System.out.println("**You have Selected Movies**");
            Movies m1=new Movies();
            m1.mov();
            break;
        case 4:
            System.out.println("**You have Selected Reality Show**");
            RealityShows rs1=new RealityShows();
            rs1.rea();
            break;
        default:
            System.out.println("## Please Enter Valid Input##");
            level2m_5();
            break;
    }
}

}
class Comedy2 extends Entertainment2 {
    //Method for comedy main channels
    public static void com2(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. Ashish Chanchlani ");
        System.out.println("2. BB ki Vines");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Ashish Chanchlani**");
                Ashish1 as=new Ashish1();
                as.details();
                break;
            case 2:
                System.out.println("**You have Selected BB ki Vines**");
                BB_Vines1 bb=new BB_Vines1();
                bb.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                com2();
                break;
        }
    }

}
class Ashish1 extends Comedy2{
    public Ashish1() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Ashish1(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Ashish1("Ashish Chanchlani","30-Sept-2016",415642,7541236,225,"ashishchanchlani@gmail.com");
        System.out.println("$$$$$$$$$$$$           ASHISH CHANCHLANI             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("ASHISH CHANCHLANI MAIN");
        }
        else if(a==2){
            Comedy2 c1=new Comedy2();
            c1.com2();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class BB_Vines1 extends Comedy2{
    public BB_Vines1() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public BB_Vines1(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new BB_Vines1("BB KI VINES ","06-Feb-2016",456253,74563254,212,"bbkivines@gmail.com");
        System.out.println("$$$$$$$$$$$$           BB KI VINES             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" BB KI VINES MAIN");
        }
        else if(a==2){
            Comedy2 c1=new Comedy2();
            c1.com2();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Vlogging extends Entertainment2 {
    //Method for Vlogging main channels
    public static void vlog(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. Sourav Joshi");
        System.out.println("2. Flying Beast");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Sourav Joshi**");
                Sourav s=new Sourav();
                s.details();
                break;
            case 2:
                System.out.println("**You have Selected Flying Beast**");
                Beast b=new Beast();
                b.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                vlog();
                break;
        }
    }

}
class Sourav extends Vlogging{
    public Sourav() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Sourav(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Sourav("Sourav Joshi","13-March-2015",4521568,945632514,398,"souravjoshi@gmail.com");
        System.out.println("$$$$$$$$$$$$           SOURAV JOSHI             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("SOURAV JOSHI MAIN");
        }
        else if(a==2){
            Vlogging v1=new Vlogging();
            v1.vlog();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Beast extends Vlogging{
    public Beast() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Beast(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Beast("Gourav Taneja","23-Jul-2016",4586246,75462345,615,"flyingbeast@gmail.com");
        System.out.println("$$$$$$$$$$$$           FLYING BEAST             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("FLYING BEAST MAIN");
        }
        else if(a==2){
            Vlogging v1=new Vlogging();
            v1.vlog();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Movies extends Entertainment2 {
    //Method for movies main channels
    public static void mov(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. Goldmines ");
        System.out.println("2. Humbale Films");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Goldmines**");
                Goldmines g=new Goldmines();
                g.details();
                break;
            case 2:
                System.out.println("**You have Selected Humbale Films**");
                Humbale h=new Humbale();
                h.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                mov();
                break;
        }
    }

}
class Goldmines extends Movies{
    public Goldmines() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Goldmines(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Goldmines("Goldmines Films","08-Dec-2017",451267,7564821,422,"goldminefilms@gmail.com");
        System.out.println("$$$$$$$$$$$$           GOLDMINES FILMS             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("GOLDMINES FILMS MAIN");
        }
        else if(a==2){
            Movies m1=new Movies();
            m1.mov();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Humbale extends Movies{
    public Humbale() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Humbale(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Humbale("Humbale Films","13-Nov-2015",462514,6485264,245,"humbalefimlsco@gmail.com");
        System.out.println("$$$$$$$$$$$$           HUMBALE FILMS             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" HUMBALE FILMS MAIN");
        }
        else if(a==2){
            Movies m1=new Movies();
            m1.mov();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class RealityShows extends Entertainment2 {
    //Method for Reality shows Main channels
    public static void rea(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. Dance plus  ");
        System.out.println("2. Indian Ideal");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Dance plus**");
                Dance d=new Dance();
                d.details();
                break;
            case 2:
                System.out.println("**You have Selected  Indian Ideal**");
                Indianideal id=new Indianideal();
                id.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                rea();
                break;
        }
    }
}
class Dance extends RealityShows{
    public Dance() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Dance(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Dance("Robin Gupta","17-April-2015",478562,7564215,451,"danceplus@gmail.com");
        System.out.println("$$$$$$$$$$$$           DANCE PLUS             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("DANCE PLUS MAIN");
        }
        else if(a==2){
            RealityShows rs1=new RealityShows();
            rs1.rea();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Indianideal extends RealityShows{
    public Indianideal() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Indianideal(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Indianideal("Mahima Mitra","12-Jul-2021",456214,4562463,350,"mahimamitra@gmail.com");
        System.out.println("$$$$$$$$$$$$           INDIAN IDEAL             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("INDIAN IDEAL MAIN");
        }
        else if(a==2){
            RealityShows rs1=new RealityShows();
            rs1.rea();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }


}
//Level 3 tree E-1-6
class Gaming1 extends ShortChannel {
    //Method for Gaming Short Channel
    public static void level2s_6(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Category of Gaming for Short Channel");
        System.out.println("****************************************************");
        System.out.println("1. BGMI");
        System.out.println("2. FreeFire");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected BGMI**");
                BGMI1 bg1=new BGMI1();
                bg1.bgm();
                break;
            case 2:
                System.out.println("**You have Selected FreeFire**");
                FreeFire1 ff1=new FreeFire1();
                ff1.free1();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                level2s_6();
                break;
        }
    }

}
class BGMI1 extends Gaming1 {
    //BGMI channels
    public static void bgm(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. Shreeman Legend ");
        System.out.println("2. Mortal Gaming");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Shreeman Legend**");
                Shreeman s=new Shreeman();
                s.details();
                break;
            case 2:
                System.out.println("**You have Selected  Mortal Gaming**");
                Mortal m=new Mortal();
                m.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                bgm();
                break;
        }
    }

}
class Shreeman extends BGMI1{
    public Shreeman() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Shreeman(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Shreeman("Shreeman","12-Jul-2016",3201045,53850456,350,"shreemangaming@gmail.com");
        System.out.println("$$$$$$$$$$$$           SHREEMAN LEGEND             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("SHREEMAN LEGEND SHORTS");
        }
        else if(a==2){
            BGMI1 bg1=new BGMI1();
            bg1.bgm();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Mortal extends BGMI1{
    public Mortal() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Mortal(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Mortal("Mortal","11-May-2017",754632,75648245,452,"mortalgaming@gmail.com");
        System.out.println("$$$$$$$$$$$$           MORTAL GAMING             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("MORTAL GAMING SHORTS");
        }
        else if(a==2){
            BGMI1 bg1=new BGMI1();
            bg1.bgm();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class FreeFire1 extends Gaming1 {
    //Method freefire channels
    public static void free1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. FreeFire India Official ");
        System.out.println("2. Born2Kill");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected FreeFire India Official**");
                FreeIndia fi=new FreeIndia();
                fi.details();
                break;
            case 2:
                System.out.println("**You have Selected  Born2Kill**");
                Born2Kill b2=new Born2Kill();
                b2.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                free1();
                break;
        }
    }

}
class FreeIndia extends FreeFire1{
    public  FreeIndia() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public  FreeIndia(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new  FreeIndia("Mankrit Singh","12-Jul-2019",456876,47561245,378,"freefireindia@gmail.com");
        System.out.println("$$$$$$$$$$$$           FREE-FIRE-INDIA  OFFICIAL             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("  FREE-FIRE-INDIA  OFFICIAL SHORTS");
        }
        else if(a==2){
            FreeFire1 ff1=new FreeFire1();
            ff1.free1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Born2Kill extends FreeFire1{
    public  Born2Kill() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public  Born2Kill(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new  Born2Kill("Virat Shaikh","14-Sept-2020",456785,1546587,452,"born2kill@gmail.com");
        System.out.println("$$$$$$$$$$$$           BORN-2-KILL             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("BORN-2-KILL SHORTS");
        }
        else if(a==2){
            FreeFire1 ff1=new FreeFire1();
            ff1.free1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
//Level 3 tree E-2-6
class Gaming2 extends MainChannel {
    //Method for Gaming Main Channel
    public static void level2m_6(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Category of Gaming for Main Channel");
        System.out.println("****************************************************");
        System.out.println("1. Stream Channel");
        System.out.println("2. Game Channel");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Stream Channel**");
                Streamers s1=new Streamers();
                s1.str();
                break;
            case 2:
                System.out.println("**You have Selected Game Channel**");
                Gamers2 g1=new Gamers2();
                g1.level4m_game();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                level2m_6();
                break;
        }
    }
}
class Streamers extends Gaming2 {
    //Method for streamers
    public static void str(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. Shreeman Legend ");
        System.out.println("2. Mortal Gaming");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Shreeman Legend**");
                Shreeman1 s=new Shreeman1();
                s.details();
                break;
            case 2:
                System.out.println("**You have Selected  Mortal Gaming**");
                Mortal1 m=new Mortal1();
                m.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                str();
                break;
        }
    }


}
class Shreeman1 extends Streamers{
    public Shreeman1() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public  Shreeman1(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new  Shreeman1("Shreeman","12-Jul-2018",654852,74568245,284,"shreemangaming@gmail.com");
        System.out.println("$$$$$$$$$$$$           SHREEMAN LEGEND GAMING             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("SHREEMAN LEGEND GAMING MAIN");
        }
        else if(a==2){
            Streamers s1=new Streamers();
            s1.str();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Mortal1 extends Streamers{
    public Mortal1() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public  Mortal1(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new  Mortal1("Mortal","21-Jul-2016",4527864,75648246,410,"mortalgaming@gmail.com");
        System.out.println("$$$$$$$$$$$$           MORTAL GAMING             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("MORTAL GAMING MAIN");
        }
        else if(a==2){
            Streamers s1=new Streamers();
            s1.str();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Gamers2 extends Gaming2 {
    //Method for game --gamers--gaming--main channel
    public static void level4m_game(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Category of Game channel for Main Channel");
        System.out.println("****************************************************");
        System.out.println("1. BGMI");
        System.out.println("2. FreeFire");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected BGMI**");
                BGMI2 bg1=new BGMI2();
                bg1.bg();
                break;
            case 2:
                System.out.println("**You have Selected FreeFire**");
                FreeFire2 ff1=new FreeFire2();
                ff1.ffr();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                level4m_game();
                break;
        }
    }

}
class BGMI2 extends Gamers2 {
    //Method for BGMI
    public static void bg(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. Jonathan Gaming");
        System.out.println("2. Mortal Gaming");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Jonathan Gaming**");
                Jonathan j=new Jonathan();
                j.details();
                break;
            case 2:
                System.out.println("**You have Selected  Mortal Gaming**");
                Mortal2 m=new Mortal2();
                m.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                bg();
                break;
        }
    }


}
class Jonathan extends BGMI2{
    public Jonathan() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public  Jonathan(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Jonathan("Jonathan","23-Dec-2014",746254,45876524,355,"jonathangaming@gmail.com");
        System.out.println("$$$$$$$$$$$$           JONATHAN GAMING             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("JONATHAN GAMING MAIN");
        }
        else if(a==2){
            BGMI2 bg1=new BGMI2();
            bg1.bg();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Mortal2 extends BGMI2{
    public Mortal2() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public  Mortal2(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Mortal2("Mortal","11-Jul-2016",754682,7468542,267,"mortalgaming@gmail.com");
        System.out.println("$$$$$$$$$$$$           MORTAL GAMING             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("MORTAL GAMING MAIN");
        }
        else if(a==2){
            BGMI2 bg1=new BGMI2();
            bg1.bg();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class FreeFire2 extends Gamers2 {
    //Method freefire main channels
    public static void ffr(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. FreeFire India Official ");
        System.out.println("2. Born2Kill");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected FreeFire India Official**");
                FreeIndia1 fi=new FreeIndia1();
                fi.details();
                break;
            case 2:
                System.out.println("**You have Selected  Born2Kill**");
                Born2Kill1 b2=new Born2Kill1();
                b2.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                ffr();
                break;
        }
    }


}
class FreeIndia1 extends FreeFire2{
    public FreeIndia1() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public  FreeIndia1(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new FreeIndia1("Free Fire Co.In","12-Jul-2019",6754824,74685424,364,"freefireindiaco@gmail.com");
        System.out.println("$$$$$$$$$$$$           FREE-FIRE-INDIA-OFFICIAL             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("FREE-FIRE-INDIA-OFFICIAL MAIN");
        }
        else if(a==2){
            FreeFire2 ff1=new FreeFire2();
            ff1.ffr();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }


}
class Born2Kill1 extends FreeFire2{
    public Born2Kill1() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public  Born2Kill1(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Born2Kill1("Harish Mahajan","12-Jul-2020",3201045,53850124,364,"harishmahajan@gmail.com");
        System.out.println("$$$$$$$$$$$$           BORN-2-KILL             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("BORN-2-KILL MAIN");
        }
        else if(a==2){
            FreeFire2 ff1=new FreeFire2();
            ff1.ffr();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
//Level 3 tree E-1-7
class Technology1 extends ShortChannel {
    //Method for Technology Short Channel
    public static void level2s_7(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Category of Technology for Short Channel");
        System.out.println("****************************************************");
        System.out.println("1. Tech Tricks ");
        System.out.println("2. Tech News");

        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Tech Tricks**");
                TechTricks tt1=new TechTricks();
                tt1.tech();
                break;
            case 2:
                System.out.println("**You have Selected Tech News**");
                TechNews tn1=new TechNews();
                tn1.news();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                level2s_7();
                break;
        }
    }

}
class TechTricks extends Technology1 {
    //methods of techtricks short channel
    public static void tech(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. Tech-ila");
        System.out.println("2. Technical Sky");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Tech-ila**");
                Techila t=new Techila();
                t.details();
                break;
            case 2:
                System.out.println("**You have Selected  Technical Sky**");
                TechSky ts=new TechSky();
                ts.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                tech();
                break;
        }
    }

}
class Techila extends TechTricks{
    public Techila() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public  Techila(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Techila("Mahesh Bharat","04-Jul-2017",458975,74632145,345,"maheshtechils@gmail.com");
        System.out.println("$$$$$$$$$$$$           TECH-ILA             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("TECH-ILA SHORTS");
        }
        else if(a==2){
            TechTricks tt1=new TechTricks();
            tt1.tech();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class TechSky extends TechTricks{
    public TechSky() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public  TechSky(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new TechSky("Akash Gupta","16-April-2014",648597,76485415,315,"technicalsky@gmail.com");
        System.out.println("$$$$$$$$$$$$           TECHNICAL SKY             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("TECHNICAL SKY SHORTS");
        }
        else if(a==2){
            TechTricks tt1=new TechTricks();
            tt1.tech();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class TechNews extends Technology1 {
    //methods of technews short
    public static void news(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. Tech Master Short");
        System.out.println("2. Technical Gyan");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Tech Master Short**");
                Tech_master tm=new Tech_master();
                tm.details();
                break;
            case 2:
                System.out.println("**You have Selected  Technical Gyan**");
                Technical_gyan ts=new Technical_gyan();
                ts.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                news();
                break;
        }
    }

}
class Tech_master extends TechNews{
    public Tech_master() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public  Tech_master(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Tech_master("Ajay Jadeja","12-Jul-2015",768452,9456815,245,"techmastershorts@gmail.com");
        System.out.println("$$$$$$$$$$$$           TECH-MASTER-SHORTS             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("TECH-MASTER-SHORTS");
        }
        else if(a==2){
            TechNews tn1=new TechNews();
            tn1.news();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Technical_gyan extends  TechNews{
    public Technical_gyan() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Technical_gyan(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Technical_gyan("Rajesh Khanna","12-May-2018",468421,76452846,316,"technicalsky@gmail.com");
        System.out.println("$$$$$$$$$$$$           TECHNICAL GUY             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" TECHNICAL GUY SHORTS");
        }
        else if(a==2){
            TechNews tn1=new TechNews();
            tn1.news();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}

//Level 3 tree E-2-7
class Technology2 extends MainChannel {
    //Method for Technology Main Channel
    public static void level2m_7(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Category of Technology for Main Channel");
        System.out.println("****************************************************");
        System.out.println("1. Tech Experiment ");
        System.out.println("2. Tech Gadgets");
        System.out.println("3. Programming ");

        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Tech Experiment**");
                TechExperiment te1=new TechExperiment();
                te1.exp();
                break;
            case 2:
                System.out.println("**You have Selected Tech Gadgets**");
                TechGadgets2 tg1=new TechGadgets2();
                tg1.gad();
                break;
            case 3:
                System.out.println("**You have Selected Programming**");
                Programming p=new Programming();
                p.pro();
                break;

            default:
                System.out.println("## Please Enter Valid Input##");
                level2m_7();
                break;
        }
    }


}
class TechExperiment extends Technology2 {
    //method techexperiment main video
    public static void exp(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. Mr.IndianHacker");
        System.out.println("2. XYZ Exp");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Mr.IndianHacker**");
                MrIndian tm=new MrIndian();
                tm.details();
                break;
            case 2:
                System.out.println("**You have Selected  XYZ Exp**");
                Xyz ts=new Xyz();
                ts.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                exp();
                break;
        }
    }

}
class MrIndian extends TechExperiment{
    public MrIndian() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public MrIndian(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new MrIndian("Indian Hacker","12-Jul-2016",764597,42567845,345,"mrindianhacker@gmail.com");
        System.out.println("$$$$$$$$$$$$           MR. INDIAN HACKER             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" MR. INDIAN HACKER MAIN");
        }
        else if(a==2){
            TechExperiment te1=new TechExperiment();
            te1.exp();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }


}
class Xyz extends TechExperiment{
    public Xyz() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Xyz(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Xyz("Praful Singh","12-Dec-2017",645724,64857469,425,"xyzexperiments@gmail.com");
        System.out.println("$$$$$$$$$$$$           XYZ-EXPERIMENTS             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("XYZ-EXPERIMENTS MAIN");
        }
        else if(a==2){
            TechExperiment te1=new TechExperiment();
            te1.exp();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }


}
class TechGadgets2 extends Technology2 {
    //method techgadget
    public static void gad(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. Technical Guruji");
        System.out.println("2. Tech Burner");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Technical Guruji**");
                Technical t=new Technical();
                t.details();
                break;
            case 2:
                System.out.println("**You have Selected  Tech Burner**");
                Techburner tb= new Techburner();
                tb.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                gad();
                break;
        }
    }

}
class Technical extends TechGadgets2{
    public Technical() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Technical(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Technical("Gourav Choudhari","12-Jul-2015",64574564,456768656,365,"technicalguruji@gmail.com");
        System.out.println("$$$$$$$$$$$$           TECHNICAL GURUJI             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("TECHNICAL GURUJI MAIN");
        }
        else if(a==2){
            TechGadgets2 tg1=new TechGadgets2();
            tg1.gad();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Techburner extends  TechGadgets2{
    public Techburner() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Techburner(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Techburner("Tech Burner","12-Jul-2018",6457425,74859647,463,"techburner@gmail.com");
        System.out.println("$$$$$$$$$$$$           TECH-BURNER             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("TECH-BURNER MAIN");
        }
        else if(a==2){
            TechGadgets2 tg1=new TechGadgets2();
            tg1.gad();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Programming extends Technology2 {
    //Method programming channels
    public static void pro(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. Apna College");
        System.out.println("2. Kunal Khushwah");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Apna College**");
                Apna_college ak=new Apna_college();
                ak.details();
                break;
            case 2:
                System.out.println("**You have Selected  Kunal Khushwah**");
                Kunal_Khushwah kk=new Kunal_Khushwah();
                kk.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                pro();
                break;
        }
    }

}
class Apna_college extends Programming{
    public Apna_college() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Apna_college(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Apna_college("Shraddha Khapra","30-Oct-2015",467859,34651275,37,"apnacollege@gmail.com");
        System.out.println("$$$$$$$$$$$$           APNA COLLEGE             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("APNA COLLEGE MAIN");
        }
        else if(a==2){
            Programming po=new Programming();
            po.pro();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }


}
class Kunal_Khushwah extends Programming{
    public Kunal_Khushwah() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Kunal_Khushwah(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Kunal_Khushwah("Kunal Khushwah","11-Feb-2019",462513,74635421,299,"kunalkhushwah@gmail.com");
        System.out.println("$$$$$$$$$$$$           KUNAL KHUSHWAH             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("KUNAL KHUSHWAH MAIN");
        }
        else if(a==2){
            Programming po=new Programming();
            po.pro();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}

//Level 3 tree E-1-8
class Fashion_Beauty1 extends ShortChannel {
    //Method for Fashion And Beauty Short Channel
    public static void level2s_8(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Category of Fashion And Beauty for Short Channel");
        System.out.println("****************************************************");
        System.out.println("1. Fashion Tips");
        System.out.println("2. Product Review");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Fashion Tips**");
                FashionTips1 ft1=new FashionTips1();
                ft1.fati();
                break;
            case 2:
                System.out.println("**You have Selected Product Review**");
                BeautyProductReview1 bpr=new BeautyProductReview1();
                bpr.bpr1();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                level2s_8();
                break;
        }
    }

}
class FashionTips1 extends Fashion_Beauty1 {
    //FAshionTips short channel
    public static void fati(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. The Beer Bicep");
        System.out.println("2. The Formal Edit");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected The Beer Bicep**");
                BearBicep bb=new BearBicep();
                bb.details();
                break;
            case 2:
                System.out.println("**You have Selected  The Formal Edit**");
                TheFormal ft=new TheFormal();
                ft.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                fati();
                break;
        }
    }

}
class BearBicep extends FashionTips1{
    public BearBicep() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public BearBicep(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new BearBicep("Ranveer Allahabadia","12-Sept-2017",654258,74196365,365,"thebeerbicep@gmail.com");
        System.out.println("$$$$$$$$$$$$           THE-BEER-BICEP             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("THE-BEER-BICEP SHORTS");
        }
        else if(a==2){
            FashionTips1 ft1=new FashionTips1();
            ft1.fati();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class TheFormal extends FashionTips1{
    public TheFormal() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public TheFormal(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new TheFormal("Mahendra Jain","25-Jun-2017",679452,55645784,465,"theformaledit@gmail.com");
        System.out.println("$$$$$$$$$$$$           THE FORMAL EDIT             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("THE FORMAL EDIT SHORTS");
        }
        else if(a==2){
            FashionTips1 ft1=new FashionTips1();
            ft1.fati();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class BeautyProductReview1 extends Fashion_Beauty1 {
    //method for short channel
    public static void bpr1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. Fittube");
        System.out.println("2. Beauty-Review");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Fittube**");
                Fittube bb=new Fittube();
                bb.details();
                break;
            case 2:
                System.out.println("**You have Selected  Beauty-Review**");
                BeautyReview ft=new BeautyReview();
                ft.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                bpr1();
                break;
        }
    }

}
class Fittube extends BeautyProductReview1{
    public Fittube() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Fittube(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Fittube("Ankit Modi","12-Jul-2019",739146,9173482,431,"fittube@gmail.com");
        System.out.println("$$$$$$$$$$$$           FIT-TUBE             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("FIT-TUBE SHORTS");
        }
        else if(a==2){
            BeautyProductReview1 bpr=new BeautyProductReview1();
            bpr.bpr1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class BeautyReview extends  BeautyProductReview1{
    public BeautyReview() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public BeautyReview(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new BeautyReview("Manisha Patela","12-Jul-2015",346157,5345975,315,"beautyreview@gmail.com");
        System.out.println("$$$$$$$$$$$$           BEAUTY REVIEW             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("BEAUTY REVIEW SHORTS");
        }
        else if(a==2){
            BeautyProductReview1 bpr=new BeautyProductReview1();
            bpr.bpr1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
//Level 3 tree E-2-8
class Fashion_Beauty2 extends MainChannel {
    //Method for Fashion And Beauty Main Channel
    public static void level2m_8(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Category of Fashion And Beauty for Short Channel");
        System.out.println("****************************************************");
        System.out.println("1. Fashion Tips");
        System.out.println("2. Product Review");
        System.out.println("2. MakeUp");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Fashion Tips**");
                FashionTips2 ft1=new FashionTips2();
                ft1.fati();
                break;
            case 2:
                System.out.println("**You have Selected Product Review**");
                BeautyProductReview2 bpr=new BeautyProductReview2();
                bpr.bpr1();
                break;
            case 3:
                System.out.println("**You have Selected MakeUp**");
                MakeUp mu1=new MakeUp();
                mu1.mkp();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                level2m_8();
                break;
        }
    }
}
class FashionTips2 extends Fashion_Beauty2 {
    //method for main channel
    public static void fati(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. The Beer Bicep");
        System.out.println("2. The Formal Edit");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected The Beer Bicep**");
                BearBicep1 bb=new BearBicep1();
                bb.details();
                break;
            case 2:
                System.out.println("**You have Selected  The Formal Edit**");
                TheFormal1 ft=new TheFormal1();
                ft.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                fati();
                break;
        }
    }

}
class BearBicep1 extends FashionTips2{
    public BearBicep1() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public BearBicep1(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new BearBicep1("Ranveer Allahabadia","06-Jan-2017",364253,75395146,384,"thebeerbicep@gmail.com");
        System.out.println("$$$$$$$$$$$$           THE BEER BICEP             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("THE BEER BICEP MAIN");
        }
        else if(a==2){
            FashionTips2 ft1=new FashionTips2();
            ft1.fati();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class TheFormal1 extends FashionTips2{
    public TheFormal1() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public TheFormal1(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new TheFormal1("Akash Fawad","14-Jul-2019",647235,6482344,427,"akashfawad@gmail.com");
        System.out.println("$$$$$$$$$$$$           THE FORMAL EDIT             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("THE FORMAL EDIT MAIN");
        }
        else if(a==2){
            FashionTips2 ft1=new FashionTips2();
            ft1.fati();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class BeautyProductReview2 extends Fashion_Beauty2 {
    //method for main channel
    public static void bpr1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. Fittube");
        System.out.println("2. Beauty-Review");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Fittube**");
                Fittube1 bb=new Fittube1();
                bb.details();
                break;
            case 2:
                System.out.println("**You have Selected  Beauty-Review**");
                BeautyReview1 ft=new BeautyReview1();
                ft.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                bpr1();
                break;
        }
    }


}
class Fittube1 extends BeautyProductReview2{
    public Fittube1() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Fittube1(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Fittube("Ankit Modi","12-Jul-2019",739146,9173482,431,"fittube@gmail.com");
        System.out.println("$$$$$$$$$$$$           FIT-TUBE             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("FIT-TUBE MAIN");
        }
        else if(a==2){
            BeautyProductReview2 bpr=new BeautyProductReview2();
            bpr.bpr1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class BeautyReview1 extends  BeautyProductReview2{
    public BeautyReview1() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public BeautyReview1(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new BeautyReview("Manisha Patela","12-Jul-2015",346157,5345975,315,"beautyreview@gmail.com");
        System.out.println("$$$$$$$$$$$$           BEAUTY REVIEW             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" BEAUTY REVIEW MAIN");
        }
        else if(a==2){
            BeautyProductReview2 bpr=new BeautyProductReview2();
            bpr.bpr1();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class MakeUp extends Fashion_Beauty2 {
    //method for makeup main channels
    public static void mkp(){
        Scanner sc= new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Please Select Channel for the Content");
        System.out.println("****************************************************");
        System.out.println("1. Sugar Cosmetics");
        System.out.println("2. PK Makeup Studio");
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            a=9;
        }
        switch (a){
            case 1:
                System.out.println("**You have Selected Sugar Cosmetics**");
                Sugarcosmetics sk=new Sugarcosmetics();
                sk.details();
                break;
            case 2:
                System.out.println("**You have Selected  PK Makeup Studio**");
                PkStudio pk=new PkStudio();
                pk.details();
                break;
            default:
                System.out.println("## Please Enter Valid Input##");
                mkp();
                break;
        }
    }

}
class Sugarcosmetics extends MakeUp{
    public Sugarcosmetics() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public Sugarcosmetics(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new Sugarcosmetics("Sugarcosmo.co.in","12-Jul-2019",741963,96365452,365,"sugarcosmoco@gmail.com");
        System.out.println("$$$$$$$$$$$$           SUGAR COSMETICS             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe("SUGAR COSMETICS MAIN");
        }
        else if(a==2){
            MakeUp mu1=new MakeUp();
            mu1.mkp();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class PkStudio extends MakeUp{
    public PkStudio() {
        System.out.println("The Details of the Channel as Follows:");
    }

    public PkStudio(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID) {
        this.creator_Name=creator_Name;
        this.date_Of_Join=date_Of_Join;
        this.subscribers=subscribers;
        this.channel_Views=channel_Views;
        this.no_Of_Videos=no_Of_Videos;
        this.creator_EmailID=creator_EmailID;
    }

    public static void details(){
        FreeTube a1= new PkStudio("Manjeet Chillar","12-Oct-2016",951753,65485246,651,"pkstudio@gmail.com");
        System.out.println("$$$$$$$$$$$$           PK-STUDIO             $$$$$$$$$$$$$");
        Print p=new Print();
        p.methods(a1.creator_Name,a1.date_Of_Join,a1.subscribers,a1.channel_Views,a1.no_Of_Videos,a1.creator_EmailID);
        Scanner sc=new Scanner(System.in);
        int a=0;
        try {
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
            System.out.println("***********************************************************");
            details();
        }
        if(a==1){
            Main m1=new Main();
            m1.subscribe(" PK-STUDIO MAIN");
        }
        else if(a==2){
            MakeUp mu1=new MakeUp();
            mu1.mkp();
        }
        else if(a==3){
            Main m1=new Main();
            m1.select();
        }
        else{
            System.out.println("Thank You!!!!!!!!!");
        }
    }

}
class Print{
    public void methods(String creator_Name, String date_Of_Join, long subscribers, long channel_Views, int no_Of_Videos, String creator_EmailID){
        System.out.println("***********************************************************");
        System.out.println("Creator Name           : "+creator_Name);
        System.out.println("Channel Created On Date: "+date_Of_Join);
        System.out.println("No.of Subscribers      : "+subscribers);
        System.out.println("No. of Views           : "+channel_Views);
        System.out.println("No.of Videos on Channel: "+no_Of_Videos);
        System.out.println("Email-ID for Contact   : "+creator_EmailID);
        System.out.println("***********************************************************");
        System.out.println("If you want to Subscribe this Channel Enter 1");
        System.out.println("If you want to go for another channels Enter 2");
        System.out.println("If you want to go for another Category Enter 3");
        System.out.println("If you don't want to Subscribe Any Channel Enter 4");
    }
}
public class Main {
    static
    {
        System.out.println("*****************************");
        System.out.println("**** WELCOME TO FREETUBE ****");
        System.out.println("*****************************");
    }

    //This is method for password Logic
    public static void password(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter Password");
        String password1=sc.next();
        if(password1.length()<7){
            System.out.println("Please Enter Strong Password of Min 7 Characters");
            password();
        }else {
            System.out.println("Confirm Your Password");
            String password2 = sc.next();

            if (!password1.equals(password2)) {
                System.out.println("## Password is not Matching ##");
                password();
            }
        }
    }
    //This is the method for gmail input
    public static String gmail(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Your EmailID");
        String email=sc.next();
        if(!(email.endsWith("@gmail.com") || email.endsWith("@hotmail.com")) ){
            System.out.println("## Please Enter Valid EmailID ##");

            String email1= gmail();
            return email1;
        }
        return email;
    }
    //This is input for Mobile number input
    public static String mobileNo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Mobile Number");
        String mobileNo=sc.next();
        if(!(mobileNo.length()==10)){
            System.out.println("## Please Enter 10 Digit Mobile Number ##");
            String mobileNo1=mobileNo();
            return mobileNo1;
        }
        return mobileNo;
    }
    //This is method for login credentials
    //This is a method for Selection of Channel
    public static void select(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please Select Channel ");
        System.out.println("************************");
        System.out.println("1. SHORTS CHANNEL");
        System.out.println("2. MAIN CHANNEL");
        System.out.println("************************");
        int n=0;
        try {
            n = sc.nextInt();
        }catch(Exception e){
            System.out.println("Please Enter Proper Input!!!!");
           n=9;
        }
        switch(n)
        {
            case 1:
                System.out.println("You have Selected Short Channel");
                String ab4=sc.nextLine();
                ShortChannel s1=new ShortChannel();
                s1.Level1_1();
                break;
            case 2:
                System.out.println("You have Selected Main Channel");
                MainChannel s2=new MainChannel();
                s2.Level1_2();
                break;
            default:
                System.out.println("## Please Enter Valid Input ##");
                System.out.println();
                select();
                break;
        }

    }
      static HashSet l=new HashSet();
    public static void subscribe(String s){

        l.add(s);
        if(!s.equals("*******")) {
            System.out.println("Thank You !!!!!!");
            System.out.println("         for Subscribing the Channel---> " + s);
            System.out.println("*************************************************** ");
            System.out.println("The Annual Subscription Fee for The Channel is Rs.10");
            System.out.println("****************************************************");
            System.out.println();
        }else{
            System.out.println("The Channels You have Subscribed are as Follows: ");
            System.out.println("**************************************************");
            //System.out.println(l);
            int k=1;
            Iterator i=l.iterator();
            while(i.hasNext()){
                System.out.println(k+":-->"+i.next());
                k++;
            }
        }
    }
    public static void printing(String name,String lastname,String mobileNo,String email){
        Scanner sc= new Scanner(System.in);
        //int count = 1;
       // for(int i=0;i<=50;i++) {
         //   System.out.println("The no. of Channels you have Checked : "+count);
            if(l.size()>=0) {
                System.out.println("No.of Channels Added to Cart: " + l.size());
                System.out.println("The Total Amount to be Paid is Rs. : " + (10 * l.size()));
            }
            System.out.println("*****************************************************************");
            System.out.println("If you want to subscribe another channel then Enter 1 otherwise 0");
            int n=-1;
            try {
               n = sc.nextInt();
            }catch(Exception e){
                n=4;
            }
             switch(n){
                 case 1:
                      select();
                      printing(name,lastname,mobileNo,email);
                      break;
                 case 0:
                     subscribe("*******");
                     billing(name,lastname,mobileNo,email);
                     break;
                 default:
                     printing(name,lastname,mobileNo,email);
                     break;
             }
    }
    public static void billing(String name,String lastname,String mobileNo,String email){
        if(l.size()>1) {
            System.out.println("*********************************************");
            System.out.println("The Bill of Subscription ");
            System.out.println("*********************************************");
            System.out.println("Name of Subscriber:: " + name + " " + lastname);
            System.out.println("Mobile No:: " + mobileNo);
            System.out.println("Email ID:: " + email);

            System.out.println("No.of Channels Subscribed: " + (l.size() - 1));
            System.out.println("The Subscription Fee per Channel is Rs.10");
            System.out.println("***********************************************");
            System.out.println("The Total Amount to be Paid is Rs. : " + (10 * (l.size() - 1)));
            System.out.println("***********************************************");
            System.out.println("Thank You for using our Services!!!!!!!!");
            System.out.println("                         ----FREE-TUBE***");
        }
    }
    //This is a main Method ******************
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        //This is method for login credentials
        System.out.println("Please Enter Your First Name");
        String name=sc.nextLine();
        System.out.println("Please Enter Your Last Name ");
        String lastname=sc.next();
        // here I run the gmail method to get email
        String email=gmail();
        //Here this call is for mobileNo method
        String mobileNo=mobileNo();
        password();
        System.out.println("************************************************************");
        System.out.println("Account Created Successfully!!!");
        System.out.println("***********************************************************");
        String ab2=sc.nextLine();
        System.out.println("The Details of the Subscriber are as follows::");
        System.out.println("************************************************************");
        System.out.println("Name of Subscriber:: "+name+" "+lastname);
        System.out.println("Mobile No:: "+mobileNo);
        System.out.println("Email ID:: "+email);
        System.out.println("************************************************************");
        System.out.println();
        System.out.println("Login Successfully!!!!");
        System.out.println("************************************************************");
        System.out.println("Please Press ENTER to proceed further...");
        String ab3=sc.nextLine();
        select();
        printing(name,lastname,mobileNo,email);
    }
}
