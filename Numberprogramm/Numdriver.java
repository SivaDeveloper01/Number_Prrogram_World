package Numberprogramm;


import java.util.Scanner;

public class Numdriver {
		  static Scanner sc=new Scanner (System.in);
		  static int t=0;
	         public static void main(String[] args) {
	        	 Scanner sc=new Scanner(System.in);
				System.out.println("\t\t\"WELCOME TO NUMBER PROGRAMM WORLD\"");
				Numbuilder ref=new Numgives();
				System.out.println("OUR NUMBER PROGRAMS ARE,....\n\n1.SUM VALUES\n2.LARGEST 2-NUMBERS\n3.LARGEST 3-NUMBERS\n4.SECOND LARGEST NUMBER\n5.PRIME NUMBERS\n6.PERFECT NUMBER\n7.STRONG NUMBER\n8.PALINDROME NUMBER\n9.ARMSTRONG NUMBER\n10.FEBONACY NUMBER\n11.PRIME NUMBER IN RANGE\n12.FACTORS \n13.FACTORIALS\n14.XYLEM NUMBER\n15.COUNT NUMBERS\n16.EXIT");
			    System.out.print("\n\"SELECT YOU WANT IT\"....");
			    int input=sc.nextInt();
			    /*+ "n1.SUM VALUES\n2.LARGEST 3-NUMBERS\n3.LARGEST 2-NUMBERS\n4.SECOND LARGEST NUMBER\"
				+ "n5.PRIME NUMBERS\n6.PERFECT NUMBER\n7.STRONG NUMBER\n8.PALINDROME NUMBER\n"
				+ "9.ARMSTRONG NUMBER\n10.FEBONACY NUMBER\n11.PRIME NUMBER IN RANGE\n"
				+ "12.FACTORS \n13.FACTORIALS\n14.XYLEM NUMBER\n15.COUNT NUMBERS"*/
			    switch (input) {
				case 1: {do{ System.out.println("WELCOME:\"YOU CHOOSE SUM THE GIVEN VALUES...\"");
				          ref.sumvalues();
				          System.out.println("\t\t\"THE PROGRAMME FINISHED SUCCESFULLY\"");
				          System.out.println();

							 System.out.println("NOTE:IF YOU WANT TO USE AGAIN THIS CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"1\"");
								System.out.println("NOTE:IF YOU  DON'T WANT TO USE AGAIN THE CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"2\"");
								int X=sc.nextInt();
								if(X==1) {
									t=1;
								}else {
									t=2;
								}
				
				
				}while(t==1);
				break;}
				case 2: {do{
					System.out.println("WELCOME:\"YOU CHOOSE FIND LARGSET NUMBER AMONG 2 NUMBERS...\"");
			          ref.largestnumber();
			          System.out.println("\t\t\"THE PROGRAMME FINISHED SUCCESFULLY\"");
			          System.out.println();

						 System.out.println("NOTE:IF YOU WANT TO USE AGAIN THIS CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"1\"");
							System.out.println("NOTE:IF YOU  DON'T WANT TO USE AGAIN THE CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"2\"");
							int X=sc.nextInt();
							if(X==1) {
								t=1;
							}else {
								t=2;}
						
					
				}while(t==1);
				break;}
				case 3:{do{ 
					System.out.println("WELCOME:\"YOU CHOOSE FIND LARGSET NUMBER AMONG 3 NUMBERS...\"");
			          ref.largestnumbers3();
			          System.out.println("\t\t\"THE PROGRAMME FINISHED SUCCESFULLY\"");
			          System.out.println();

						 System.out.println("NOTE:IF YOU WANT TO USE AGAIN THIS CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"1\"");
							System.out.println("NOTE:IF YOU  DON'T WANT TO USE AGAIN THE CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"2\"");
							int X=sc.nextInt();
							if(X==1) {
								t=1;
							}else {
								t=2;}
						
					
				}while(t==1);
				break;}
				
				case 4: {do{
					System.out.println("WELCOME:\"YOU CHOOSE SECOND LARGEST NUMBER AMONG 3 NUMBERS...\"");
			          ref.secondlargest();
			          System.out.println("\t\t\"THE PROGRAMME FINISHED SUCCESFULLY\"");
			          System.out.println();

						 System.out.println("NOTE:IF YOU WANT TO USE AGAIN THIS CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"1\"");
							System.out.println("NOTE:IF YOU  DON'T WANT TO USE AGAIN THE CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"2\"");
							int X=sc.nextInt();
							if(X==1) {
								t=1;
							}else {
								t=2;}
						
					
				}while(t==1);
				break;}
				case 5:do{ {
					System.out.println("WELCOME:\"YOU CHOOSE PRIME NUMBER PROGRAMM...\"");
			          ref.primenumber();
			          System.out.println("\t\t\"THE PROGRAMME FINISHED SUCCESFULLY\"");
			          System.out.println();

						 System.out.println("NOTE:IF YOU WANT TO USE AGAIN THIS CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"1\"");
							System.out.println("NOTE:IF YOU  DON'T WANT TO USE AGAIN THE CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"2\"");
							int X=sc.nextInt();
							if(X==1) {
								t=1;
							}else {
								t=2;}
						
					}
				}while(t==1);
				break;
				case 6:do{ {
					System.out.println("WELCOME:\"YOU CHOOSE PERFECT NUMBER PROGRAMME...\"");
			          ref.perfectnumbers();
			          System.out.println("\t\t\"THE PROGRAMME FINISHED SUCCESFULLY\"");
			          System.out.println();

						 System.out.println("NOTE:IF YOU WANT TO USE AGAIN THIS CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"1\"");
							System.out.println("NOTE:IF YOU  DON'T WANT TO USE AGAIN THE CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"2\"");
							int X=sc.nextInt();
							if(X==1) {
								t=1;
							}else {
								t=2;}
						
					}
				}while(t==1);
				break;
				case 7:do{ {
					System.out.println("WELCOME:\"YOU CHOOSE STRONG NUMBER PROGRAMME...\"");
			          ref.strongnumber();
			          System.out.println("\t\t\"THE PROGRAMME FINISHED SUCCESFULLY\"");
			          		          System.out.println();

						 System.out.println("NOTE:IF YOU WANT TO USE AGAIN THIS CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"1\"");
							System.out.println("NOTE:IF YOU  DON'T WANT TO USE AGAIN THE CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"2\"");
							int X=sc.nextInt();
							if(X==1) {
								t=1;
							}else {
								t=2;}
						
					}
				}while(t==1);
				break;
				case 8: do{{ System.out.println("WELCOME!:\"YOU CHOOSE PALINDROME NUMBER PROGRAMME...\"");
		          ref.palindrome();
		          System.out.println("\t\t\"THE PROGRAMME FINISHED SUCCESFULLY\"");
		          System.out.println();

					 System.out.println("NOTE:IF YOU WANT TO USE AGAIN THIS CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"1\"");
						System.out.println("NOTE:IF YOU  DON'T WANT TO USE AGAIN THE CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"2\"");
						int X=sc.nextInt();
						if(X==1) {
							t=1;
						}else {
							t=2;}
					
				}
			}while(t==1);
			break;
				case 9: do{{System.out.println("WELCOME!:\"YOU CHOOSE ARMSTRONG NUMBER PROGRAMME...\"");
		          ref.armstrongnumber();
		          System.out.println("\t\t\"THE PROGRAMME FINISHED SUCCESFULLY\"");
		          System.out.println();

					 System.out.println("NOTE:IF YOU WANT TO USE AGAIN THIS CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"1\"");
						System.out.println("NOTE:IF YOU  DON'T WANT TO USE AGAIN THE CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"2\"");
						int X=sc.nextInt();
						if(X==1) {
							t=1;
						}else {
							t=2;}
					
				}
			}while(t==1);
			break;
				case 10: do{{System.out.println("WELCOME:\"YOU CHOOSE FEBONACY NUMBER PROGRAMME...\"");
		          ref.febonacy();
		          System.out.println("\t\t\"THE PROGRAMME FINISHED SUCCESFULLY\"");
		          System.out.println();

					 System.out.println("NOTE:IF YOU WANT TO USE AGAIN THIS CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"1\"");
						System.out.println("NOTE:IF YOU  DON'T WANT TO USE AGAIN THE CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"2\"");
						int X=sc.nextInt();
						if(X==1) {
							t=1;
						}else {
							t=2;}
					
				}
			}while(t==1);
			break;
				case 11: do{{System.out.println("WELCOME:\"YOU CHOOSE PRIME NUMBER IN RANGE PROGRAMME...\"");
		          ref.primenumberinrange();
		          System.out.println("\t\t\"THE PROGRAMME FINISHED SUCCESFULLY\"");
		          System.out.println();

					 System.out.println("NOTE:IF YOU WANT TO USE AGAIN THIS CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"1\"");
						System.out.println("NOTE:IF YOU  DON'T WANT TO USE AGAIN THE CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"2\"");
						int X=sc.nextInt();
						if(X==1) {
							t=1;
						}else {
							t=2;}
					
				}
			}while(t==1);
			break;
				case 12:do{ {System.out.println("WELCOME:\"YOU CHOOSE FIND FACTORS IN GIVEN VALUE...\"");
		          ref.factorial();
		          System.out.println("\t\t\"THE PROGRAMME FINISHED SUCCESFULLY\"");
		          System.out.println();

					 System.out.println("NOTE:IF YOU WANT TO USE AGAIN THIS CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"1\"");
						System.out.println("NOTE:IF YOU  DON'T WANT TO USE AGAIN THE CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"2\"");
						int X=sc.nextInt();
						if(X==1) {
							t=1;
						}else {
							t=2;}
					
				}
			}while(t==1);
			break;
				case 13:{do{System.out.println("WELCOME:\"YOU CHOOSE FACTORIALS IN GIVEN NUMBERS...\"");
		          ref.factorial();
		          System.out.println("\t\t\"THE PROGRAMME FINISHED SUCCESFULLY\"");
		          System.out.println();

					 System.out.println("NOTE:IF YOU WANT TO USE AGAIN THIS CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"1\"");
						System.out.println("NOTE:IF YOU  DON'T WANT TO USE AGAIN THE CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"2\"");
						int X=sc.nextInt();
						if(X==1) {
							t=1;
						}else {
							t=2;}
					
				
			}while(t==1);
			break;}
				case 14:{do{ System.out.println("WELCOME:\"YOU CHOOSE XYLEM NUMBER PROGRAMME...\"");
		          ref.xylem();
		          System.out.println("\t\t\"THE PROGRAMME FINISHED SUCCESFULLY\"");
		          System.out.println();

					 System.out.println("NOTE:IF YOU WANT TO USE AGAIN THIS CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"1\"");
						System.out.println("NOTE:IF YOU  DON'T WANT TO USE AGAIN THE CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"2\"");
						int X=sc.nextInt();
						if(X==1) {
							t=1;
						}else {
							t=2;}
					
				
			}while(t==1);
			break;}
				case 15: {do{System.out.println("WELCOME:\"YOU CHOOSE COUNT THE NUMBERS PROGRAMME...\"");
		          ref.countnumbers();
		          System.out.println("\t\t\"THE PROGRAMME FINISHED SUCCESFULLY\"");
		          System.out.println();

					 System.out.println("NOTE:IF YOU WANT TO USE AGAIN THIS CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"1\"");
						System.out.println("NOTE:IF YOU  DON'T WANT TO USE AGAIN THE CURRENT NUMBER PROGRAMME PLEASE PRESS PRESS \"2\"");
						int X=sc.nextInt();
						if(X==1) {
							t=1;
						}else {
							t=2;}
					
				
			}while(t==1);
			break;}
				
				default:{System.out.println("IF YOU DON'T WANT ANY PROGRAMME.....");
		           System.out.println("\t\tTHANK YOU\3\3\3");
					  
				break;}
			
				}
			       System.out.println("\t\tNOTE:THE INSTRUCTION GIVEN FROM \"NPW\"");
			    System.out.println("1)If You Don't Want To Use Again The \"NUMBER PROGRAMM WORLD APP\" Please Press\"1\"");
				System.out.println("2)If You  Don't Want To Use Again The \"NUMBER PROGRAMM WORLD APP\" Please Press\"2\"");
					int inp=sc.nextInt();
					switch (inp) {
					case 1: {
						
						 Numdriver.main(args);
					}
					default:{
						   System.out.println("\t\t<........THANK YOU\3\3\3........>");}
					}
				
			
			}
	}
