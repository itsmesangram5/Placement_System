import java.util.*;
class mainprog
{ 
 public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.print("\n\n_________________________________________________Welcome_____________________________________________\n          Enter your colleage Name\n          ");
   String col=sc.nextLine();
   System.out.print("          Enter the number number of total Students \n          ");
   int n=sc.nextInt();
   placement s[]=new placement[n];
   int per1[]=new int[n];
   int per2[]=new int[n];
   int per3[]=new int[n];
   int t=0,z=0,b=0,c=0,d=0,e=0;
   for(int i=0;i<n;i++){
                       s[i]=new placement();
                       }
   System.out.println("\n                         >>>>>>>>>>>>  Welcome to "+col+"  <<<<<<<<<<<<                    ");
   for(int a=0;;a++){
               System.out.print("\n_____________________________________________________________________________________________________________________\n");
               System.out.print("       --------    HOME    ---------\n");           
               System.out.print("       Please select the option from following \n\n      1__New Student Registration\n      2__Display records\n      3__Update Records\n      4__Sort according to company criteria\n      5__More \n      6__User select Diplay Records \n      7__Exit\n");
               System.out.print("______________________________________________________________________________________________________________________\n     ");
               int p=sc.nextInt();
               if(p==1){
                        System.out.print("\n     Your Application Number is "+(z+1)+"\n");
                        s[z].get();
                        z++;
                       }
               if(p==2){
                        System.out.print("     Please Select \n      1__All Students Record\n      2__Particular Student Record\n      3__Back to Home\n       ");
                        int v=sc.nextInt();
                        if(v==1){
                                 for(int u=0;u<z;u++){
                                                       s[u].display();
                                                      }
                                 }
                        if(v==2){
                                 System.out.print("\n      Enter the Id of Student \n      ");
                                 long v1=sc.nextLong();
                                 for(int u=0;u<z;u++){
                                                       if(s[u].id==v1){
                                                                      s[u].display(); 
                                                                      }
                                                      }
                                 }
                       }
               if(p==3){
                        System.out.print("\n      Enter the Id of Student whoes record you want to update \n      ");
                        long v2=sc.nextLong();
                        for(int u1=0;u1<z;u1++){
                                             if(s[u1].id==v2){
                                                             s[u1].update(); 
                                                            }
                                            }
                       }
               if(p==4){
                        System.out.print("      Enter the criteria of company (Minimum average percentage of company) \n        ");
                        double avper=sc.nextDouble();
                        System.out.print("      What do you want  \n       1__whole imformation of student \n       2__Just Name and Id \n       3__Back to Home\n       ");
                        int w=sc.nextInt();
                        if(w==1){
                                 System.out.println("      Imformation of eligible students for company are      ");
                                 for(int wc=0;wc<z;wc++){
                                                 if(((s[wc].yr1+s[wc].yr2+s[wc].yr3)/3)>=avper){
                                                                                        s[wc].display();
                                                                                        t++;
                                                                                        }
                                                     }
                                 System.out.println("      There are total "+t+" eligible students for company ");
                                                     
                                 } 
                        if(w==2){
                                System.out.println("       Names and Roll numbers of eligible students for company are  ");
                                for(int wz=0;wz<z;wz++){
                                            if(((s[wz].yr1+s[wz].yr2+s[wz].yr3)/3)>=avper){
                                                                                      System.out.print(s[wz].name); 
                                                                                      System.out.println("____"+s[wz].id);
                                                                                      b++;
                                                                                        }
                                             }
                                 System.out.println("       There are total "+b+" eligible students for company ");
                                  }
                       }
               if(p==5){
                        System.out.println("      Select any of the option \n\n       1_Number of students who want placement \n       2_Number of students who already placed \n       3_Number of students who want to do higher studies \n       4_List of Students who want placement \n       5_List of students who already placed\n       6_List of students who want to do higher studies\n       7__Back to Home");
                        int q=sc.nextInt();
                         if(p==1){
                                  for(int w1=0;w1<z;w1++){
                                                 if(s[w1].status=="Want placement"){
                                                                                     c++;
                                                                                   }
                                                          }
                                   System.out.println("\n      There are total "+c+" students who want placement ");
                                                          
                                  }
                         if(p==2){
                                  for(int w2=0;w2<z;w2++){
                                                 if(s[w2].status=="Already placed"){
                                                                                     d++;
                                                                                   }
                                                         }
                                   System.out.println("\n      There are total "+d+" students who are already placed ");
                                                         
                                 }
                         if(p==3){
                                  for(int w3=0;w3<z;w3++){
                                                 if(s[w3].status=="Want to do higher studies"){
                                                                                        e++;
                                                                                        }
                                                           }
                                   System.out.println("\n       There are total "+e+" students who Want to do higher studies ");
                                                          
                                  }
                         if(p==4){
                                  System.out.println("\n        List of Students who want placement        Colleage Id");
                                  for(int w4=0;w4<z;w4++){
                                                 if(s[w4].status=="Want placement"){
                                                                                     System.out.print("   "+s[w4].name+"  "+s[w4].id);
                                                                                   }
                                                         }
                                  }
                         if(p==5){
                                  System.out.println("\n        List of Students who Already placed________Colleage Id__________Company Name");
                                  for(int w5=0;w5<z;w5++){
                                                 if(s[w5].status=="Already placed"){  
                                                                                     System.out.print("   "+s[w5].name+"   "+s[w5].id+s[w5].company);
                                                                                   }
                                                          }
                                  }
                         if(p==6){
                                  System.out.println("\n        List of Students who Want to do higher studies___________Colleage Id");
                                  for(int w6=0;w6<z;w6++){
                                                 if(s[w6].status=="Want to do higher studies"){  
                                                                                     System.out.print("   "+s[w6].name+"  "+s[w6].id);
                                                                                               }
                                                          }
                                  }
                       }
               if(p==6){
                       System.out.println("      Which record you want to display\n       1__Id\n       2__Name\n       3__10th Marks and 12th Marks With their Id's\n       4__1st Year marks with Id\n       5__2nd Year Marks With Id\n       6__3rd year Marks With Id \n       7__Mobile Number and Mail Id with Colleage Id \n       8__Average marks Student with Name and Id \n       9__Current placement Status With Name \n       10__Back to Home");
                       sc.nextLine();
                       String f=sc.nextLine();
                       int g=f.length();
                       for(int h=0;h<g;h++){
                           char o=f.charAt(h);
                           if(o=='1')
                                    System.out.println("_______Id's of Students are__________\n");
                           if(o=='2')
                                    System.out.println("_________Names of Students_______\n");
                           if(o=='3')
                                    System.out.println("____10th and 12th Marks with their Id's______\n______Colleage Id________10th Mark______12th Mark");       
                           if(o=='4')
                                    System.out.println("______1st Year Marks of Student with Id________\n_________Id______________Marks in %");
                           if(o=='5')
                                    System.out.println("______2nd Year Marks of Student With Id________\n_________Id______________Marks in %");
                           if(o=='6')
                                    System.out.println("______3rd Year Marks of Student With Id________\n_________Id______________Marks in %");
                           if(o=='7')
                                    System.out.println("______Mobile Number and Mail Id's of Student With Colleage Id________\n_________Id______________Mail Id____________Phone Number");
                           if(o=='8')
                                    System.out.println("______Average marks Student with Name and Id________\n_________Id______________Average Marks og 3 years in %");
                           if(o=='9')
                                    System.out.println("______Current Status of Placement With Name________\n_________Id______________Current Status of Placement");
                           for(int r=0;r<z;r++){
                                    if(o=='1') 
                                              System.out.println(s[r].id);
                                    if(o=='2')
                                              System.out.println(s[r].name);
                                    if(o=='3')
                                              System.out.println("      "+s[r].id+"      "+s[r].mark10+"%      "+s[r].mark12+"%");
                                    if(o=='4')
                                              System.out.println("      "+s[r].id+"      "+s[r].yr1+"%");
                                    if(o=='5')
                                              System.out.println("      "+s[r].id+"      "+s[r].yr2+"%");
                                    if(o=='6')
                                              System.out.println("      "+s[r].id+"      "+s[r].yr3+"%");
                                    if(o=='7')
                                              System.out.println("      "+s[r].id+"      "+s[r].mail+"      "+s[r].mob);
                                    if(o=='8')
                                              System.out.println("      "+s[r].id+"      "+((s[r].yr1+s[r].yr2+s[r].yr3)/3)+"%");
                                    if(o=='9')
                                              System.out.println("      "+s[r].name+"      "+s[r].status);
                                               
                                              }
                                          }
                                     
                       }         
               if(p==7){
                        s[z].exithere();
                        break;
                       }
                  }
                        
   }
}