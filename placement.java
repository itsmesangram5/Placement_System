import java.util.*;
class placement
{
 int temp;
 long mob,id;
 double yr1,yr2,yr3,mark10,mark12;
 String name,mail,status,company;
 void get(){
            Scanner sc =new Scanner(System.in);
            System.out.print("     Enter your ID \n      ");
            id=sc.nextLong();
            System.out.print("     Enter your Full Name\n      ");
            sc.nextLine();
            name=sc.nextLine();
            System.out.print("     Enter your Mobile Number \n      ");
            mob=sc.nextLong();  
            System.out.print("     Enter your mail Id\n      ");
            sc.nextLine();
            mail=sc.nextLine();
            System.out.print("     Enter 10th Marks in percentage \n      ");
            mark10=sc.nextDouble();
            System.out.print("     Enter 12th Marks in percentage \n      ");
            mark12=sc.nextDouble();
            System.out.print("     Enter 1st year marks in percentage \n      ");
            yr1=sc.nextDouble();
            System.out.print("     Enter 2nd year marks percentage \n      ");
            yr2=sc.nextDouble();
            System.out.print("     Enter 3rd year marks percentage \n      ");
            yr3=sc.nextDouble();
            System.out.print("     Enter your current status \n      1_Yes,I want placement \n      2_I have already placed \n      3_No,I want to do higher studies \n     ");
            temp=sc.nextInt();
            if(temp==1)
                  status="Want placement";
            if(temp==2){
                  status="Already placed";
                  System.out.print("     Enter the name of Company you have placed \n      ");
                  sc.nextLine();
                  company=sc.nextLine();
                        }
            if(temp==1)
                  status="Want to do higher studies";
           }
  void display(){
            System.out.println("\n\n      Student ID is - "+id);
            System.out.println("      Name of the student is - "+name);
            System.out.println("      10th marks - "+mark10+"%");
            System.out.println("      12th marks - "+mark12+"%");
            System.out.println("      Marks of 1st year is - "+yr1+"%");
            System.out.println("      Marks of 2nd year is -  "+yr2+"%");
            System.out.println("      Marks of 3rd year is -  "+yr3+"%");
            System.out.println("      Mail Id is - "+mail);
            System.out.println("      Mobile No. is - "+mob);
            System.out.println("      Current Status of Student is - "+status);
            if(status=="Already placed")
                 System.out.println("      At "+company+"\n");
            System.out.print("_________________________________________________________\n");
                }
  void update(){
                Scanner sc =new Scanner(System.in);
                System.out.println("Which record you want to update \n 1__Id\n 2__Name\n 3__10th Marks\n 4__12th marks\n 5__1st Year marks\n 6__2nd Year Marks \n 7__3rd year \n 8__Mail Id \n 9__Mobile Number \n  10__Status \n 11__or all ");
                int u=sc.nextInt();
                switch(u)
                     {
                    case 1:
                     { System.out.println("Enter updated ID ");
                       id=sc.nextLong();
                       break;
                      }
                    case 2:
                     { System.out.println("Enter your Full Name ");
                       sc.nextLine();
                       name=sc.nextLine();
                       break;
                      }
                    case 3:
                     { System.out.println("Enter 10th Marks in percentage ");
                       mark10=sc.nextDouble();
                       break;
                      }
                    case 4:
                     { System.out.println("Enter 12th Marks in percentage ");
                       mark12=sc.nextDouble();
                       break;
                      }
                    case 5:
                     { System.out.println("Enter 1st year marks in percentage ");
                       yr1=sc.nextDouble();
                       break;
                      }
                    case 6:
                     { System.out.println("Enter 2nd year marks percentage ");
                       yr2=sc.nextDouble();
                       break;
                      }
                    case 7:
                     { System.out.println("Enter 3rd year marks percentage ");
                       yr3=sc.nextDouble();
                       break;
                      }
                    case 8:
                     { System.out.println("Enter your mail Id ");
                       sc.nextLine();
                       mail=sc.nextLine();
                       break;
                      }
                    case 9:
                     { System.out.println("Enter your Mobile Number ");
                       mob=sc.nextLong();
                       break;
                      }
                    case 10:
                     { System.out.println("Enter your current status \n 1_Yes,I want placement \n 2_I have already placed \n 3_No,I want to do higher studies ");
                       temp=sc.nextInt();
                       if(temp==1)
                             status="Want placement";
                       if(temp==2){
                             status="Already placed";
                             System.out.println("Enter the name of Company you have placed ");
                             sc.nextLine();
                             company=sc.nextLine();
                                   }
                       if(temp==1)
                            status="Want to do higher studies";
                       break;
                     }
                    case 11:
                     { get();
                       break;
                      }
                   }
                 }
   void exithere(){
               System.exit(0);
               }
  
}