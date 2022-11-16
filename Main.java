//package review3;
//import Investor.java;
import java.util.*;
import java.io.*;
public class Main {
	public static String opt="yes";
	public static void main(String[] args) 
	{
		System.out.print(".");
		System.out.print("\033[H\033[2J");
        System.out.flush();

		System.out.println("***************************************");
		System.out.println("Welcome to F4 Asset management System");
		System.out.println("***************************************");
		System.out.println("1.User \n2. Admin");
		
		

		Scanner in=new Scanner(System.in);
		Console console = System.console();
		
		int ch=in.nextInt();
		
		System.out.print("\033[H\033[2J");
        System.out.flush();

		/*Investor[] investor=new Investor[4];
		investor[0]=new Investor("amrithk","amrith123","I01","Amrith Krishnan",15000.00,2,2000);
		investor[1]=new Investor("keshavs","keshav123","I02","Keshav Sundararaman",20000.00,3,3000);
		investor[2]=new Investor("karthiksumod","karthik123","I03","Karthik Sumod",25000.00,3,3500);
		investor[3]=new Investor("maheshmadhav","mahesh123","I04","Mahesh Madhav",30000.00,3,4000);*/

		InvPersonal[] investorpersonal=new InvPersonal[4];
		investorpersonal[0]=new InvPersonal("I01","amrithk","amrith123","Amrith Krishnan",15000.00F,4,2000,"23/09/2001","Kallan street",9087346425L,123456789012L);
		investorpersonal[1]=new InvPersonal("I02","keshavs","keshav123","Keshav Sundararaman",20000.00F,4,3000,"25/05/2002","Adyar Chennai",9840041248L,749495961628L);
		investorpersonal[2]=new InvPersonal("I03","karthiksumod","karthik123","Karthik Sumod",25000.00F,6,3500,"4/11/2001","Kannur",8956078329L,894579652501L);
		investorpersonal[3]=new InvPersonal("I04","maheshmadhav","mahesh123","Mahesh Madhav",30000.00F,6,4000,"17/06/2002","Chennai",9783472048L,489375048537L);

		Stocks[] stocks=new Stocks[4];
		stocks[0]=new Stocks(new String[]{"S01","S02"},"I01",new int[]{400,420},new int[]{15,20},new float[]{3.98F,7.20F},new float[]{1.6F,2.1F},new float[]{2.8F,5.7F});
		stocks[1]=new Stocks(new String[]{"S02","S03"},"I02",new int[]{500,560},new int[]{10,20},new float[]{3.71F,6.50F},new float[]{2.1F,3.4F},new float[]{3.4F,7.5F});
		stocks[2]=new Stocks(new String[]{"S03","S04","S05"},"I03",new int[]{440,390,330},new int[]{15,20,17},new float[]{4.13F,6.69F,5.93F},new float[]{2.3F,5.1F,4.4F},new float[]{2.8F,5.7F,3.6F});
		stocks[3]=new Stocks(new String[]{"S04","S05"},"I04",new int[]{300,220},new int[]{12,23},new float[]{3.98F,7.20F},new float[]{1.6F,2.1F},new float[]{2.1F,5.3F});
		//System.out.println(Arrays.toString(stocks[0].totalShares));
		//System.out.println(investorpersonal);
		int stockflag=4;
		Properties[] props=new Properties[4];
		props[0]=new Properties(new String[]{"S06"},"I02",new float[]{5000000F},new float[]{5400000F},new float[]{1.08F},new String[]{"Commercial"});
		props[1]=new Properties(new String[]{"S06","S07"},"I04",new float[]{5000000F,2500000F},new float[]{5400000F,2600000F},new float[]{1.08F,1.04F},new String[]{"Commercial","Residential"});
		//System.out.println(Arrays.toString(stocks[0].totalShares));
		//investorpersonal[0].display();
		int propflag=2;
		//Not calculated formally
		Bonds[] bonds=new Bonds[4];
		bonds[0]=new Bonds(new String[]{"S08","S09"},"I01",new float[]{8.2F,7.8F},new int[]{24,30},new String[]{"05/10/2020","18/03/2021"},new String[]{"05/10/2022","18/09/2022"});
		bonds[1]=new Bonds(new String[]{"S08"},"I02",new float[]{8.2F},new int[]{24},new String[]{"05/10/2020"},new String[]{"05/10/2022"});
		bonds[2]=new Bonds(new String[]{"S08","S09"},"I03",new float[]{8.2F,7.8F},new int[]{24,30},new String[]{"05/10/2020","18/03/2021"},new String[]{"05/10/2022","18/09/2022"});
		bonds[3]=new Bonds(new String[]{"S09"},"I04",new float[]{7.8F},new int[]{30},new String[]{"18/03/2021"},new String[]{"18/09/2022"});

		int bondflag=4;
		
		Commodities[] commo=new Commodities[4];
		commo[0]=new Commodities(new String[]{"S10"},"I03",new String[]{"Self-Care Products"},new float[]{50000F},new float[]{54000F},new String[]{"20/10/2021"},new String[]{"Germany"},new String[]{"Completed"});
		commo[1]=new Commodities(new String[]{"S10"},"I04",new String[]{"Self-Care Products"},new float[]{50000F},new float[]{54000F},new String[]{"20/10/2021"},new String[]{"Germany"},new String[]{"In Transit"});
		//commo[0].schemeCode[1]="S06";
		int commflag=2;
		//System.out.println(commo[0].schemeCode[1]);

		Schemes[] schemes=new Schemes[20];
		schemes[0]=new Schemes("S01", "Google Stocks", "Stocks", 100000F, 1, "GOOGL", "A01",400,4.2F,1.3F,3.7F);
		schemes[1]=new Schemes("S02", "Apple Stocks", "Stocks", 500000F, 2, "APPL", "A01",350,5.0F,1.2F,3.6F);
		schemes[2]=new Schemes("S03", "Tesla Stocks","Stocks", 700000F, 2, "TSLA", "A01",600,2.8F, 1.1F, 2.5F);
		schemes[3]=new Schemes("S04", "SpaceX Stocks","Stocks", 500000F, 2, "SPCX", "A01",500,3F,1.8F,3F);
		schemes[4]=new Schemes("S05", "Amazon Stocks", "Stocks", 100000F, 2, "AMZN", "A01",350,4.7F,2.1F,3.4F);
		schemes[5]=new Schemes("S06", "3BHK Residential by Saira", "Properties", 10000000F, 2, "Saira Builders Co.", "A01",2100000F);
		schemes[6]=new Schemes("S07", "3 FLOOR SHOPPING COMPLEX IN CBE","Properties", 5000000F, 1, "VIP Constructions", "A01",5000000F);
		schemes[7]=new Schemes("S08", "1.5 Year Bond from PWD","Bonds", 7000000F, 3, "PWD COIMBATORE", "A01",7F,"11/10/2021");
		schemes[8]=new Schemes("S09", "Bond for 2 years from Akbar Steels","Bonds", 8000000F, 3, "AKBAR STEELS", "A01",6.3F,"23/08/2021");
		schemes[9]=new Schemes("S10", "Narcissus Suncreen Limited Export","Commodities", 100000F, 2, "Narcissus Self-Care", "A01","Self-Care",84000F,"Greece");

		int schemeflag=10;
		
		//schemes[4]=schemes[5];
		

		//System.out.println(schemes[4].schemeProv);

		Admin[] admin=new Admin[1];
		admin[0]=new Admin("A01","Saira P","sairap","saira1234",10,8);
		
		Funds[] funds=new Funds[4];
		funds[0]=new Funds(new String[]{"IN01","IN02","IN03","IN04"},new String[]{"S01","S02","S08","S09"},"I01",new float[]{10000F,10000F,25000F,30000F},new String[]{"GREEN","GREEN","GREEN","YELLOW"},new float[]{1200F,1200F,3000F,4000F});
		funds[1]=new Funds(new String[]{"IN05","IN06","IN07","IN08"},new String[]{"S01","S03","S06","S08"},"I02",new float[]{12000F,10000F,5000000F,25000F},new String[]{"GREEN","GREEN","GREEN","GREEN"},new float[]{2200F,3200F,30000F,3000F});
		funds[2]=new Funds(new String[]{"IN09","IN10","IN11","IN12","IN13","IN14"},new String[]{"S03","S04","S05","S08","S09","S10"},"I03",new float[]{20000F,15000F,13000F,25000F,30000F,50000F},new String[]{"GREEN","GREEN","GREEN","GREEN","GREEN","GREEN"},new float[]{1950F,1000F,1750F,4500F,5000F,7120F});
		funds[3]=new Funds(new String[]{"IN15","IN16","IN17","IN18","IN19","IN20"},new String[]{"S04","S05","S06","S07","S09","S10"},"I04",new float[]{15000F,13000F,5000000F,2500000F,30000F,50000F},new String[]{"GREEN","GREEN","GREEN","GREEN","GREEN","GREEN"},new float[]{950F,1000F,111750F,4700F,50000F,3090F});
		
		int fundflag=4;

		Transac[] transac=new Transac[3];
		transac[0]=new Transac("IN05","TR01","14:29:57","07/01/2022",2000F,"SUCCESS");
		transac[1]=new Transac("IN08","TR02","00:15:12","08/01/2022",3500F,"SUCCESS");
		transac[2]=new Transac("IN18","TR03","17:48:33","08/01/2022",4000F,"TERMINATED");

		int transflag=3;

		
		switch(ch)
		{
			case 1://user
			{
				System.out.print("Enter Username: ");
				String tuname= in.next();
				//System.out.println(tuname);
				char[] tpass = console.readPassword("Enter your secret password: ");
				String temppass= new String(tpass);
				//System.out.println(temppass);
				boolean f=false;
				
				String icode;
				
				for(int i=0;i<4;i++)
				{
					//System.out.println(investorpersonal[i].uname);
					if(tuname.equals(investorpersonal[i].uname))
					{
						f=true;
						
						//System.out.println("IN");
						if(temppass.equals(investorpersonal[i].getipass()))
						{
							System.out.println("Success!");//Loged in
							System.out.print("\033[H\033[2J");
        					System.out.flush();
							do
							{

								System.out.println("----------------------------------------------");
								System.out.println("1. View Schemes");
								System.out.println("2. View Profile");
								System.out.println("3. View your Transactions");
								System.out.println("4. Update wallet balance");
								System.out.println("5. Update Investments");
								System.out.println("6. Opt out of investments");
								System.out.println("7. View all investments");
								System.out.println("----------------------------------------------");
								System.out.println();

							System.out.println("Enter your option");
							icode=investorpersonal[i].invCode;


							int ch1=in.nextInt();
				
							System.out.print("\033[H\033[2J");
        					System.out.flush();
					

							switch(ch1)
							{
								case 1:
								{
									//Display all schemes
									//Chooses Scheme code
									System.out.println("Available schemes");
									System.out.println();
									System.out.println("-------------------------------------------------------------------------------------------------");
									System.out.println("Scheme Code\t\t\tScheme Name\t\t\t\t");
									System.out.println("-------------------------------------------------------------------------------------------------");
									for(int j=0;j<schemeflag;j++)
									{
										schemes[j].displayonlyschemes();
										//schemes[i].displayonlyschemes(schemes[i].schemeCode,schemes[i].schemeName);
										//System.out.println(schemes[i].schemeCode+" "+schemes[i].schemeName);
										//System.out.println(Arrays.toString(schemes[i]));
									}
									System.out.println("Choose yor option:");

									String schemeoption=in.next().toUpperCase();

									System.out.print("\033[H\033[2J");
        							System.out.flush();

									for(int k=0;k<schemeflag;k++)
									{
										if(schemeoption.equals(schemes[k].schemeCode))
										{
											switch(schemes[k].assetClass.toLowerCase())
											{
												case "stocks":
												{
													schemes[k].displaystock();
													break;
												}
												case "bonds":
												{
													schemes[k].displaybonds();
													break;
												}
												case "properties":
												{
													schemes[k].displayprop();
													break;
												}
												case "commodities":
												{
													schemes[k].displaycomm();
													break;
												}
											}
										}
									}
									break;
								}

								
								case 2://Display personal info
								{
									for(int j=0;j<investorpersonal.length;j++)
									{
										if(tuname.equals(investorpersonal[j].uname))
										{
											investorpersonal[j].display();
										}
									}
									break;
								}
								
								case 3://View all transactions 
								{
									int flag=0;
									
									for(int j=0;j<investorpersonal.length;j++)
									{
										if(icode.equals(funds[j].invCode))
										{
											for(int k=0;k<funds[j].investCode.length;k++)
											{
												if(funds[j].investCode[k].equals(transac[j].investCode))
												{
													transac[j].displaytransac();
													flag=1;
												}
											}
										}
									}
									
									if(flag==0)
									{
										System.out.println("No transaction under this investor yet.");
									}
									
									break;
								}
								case 4://Update wallet
								{
									int uamt;
									int uchoice;
									
									System.out.println("Current Wallet Amount:"+investorpersonal[i].totalCapital);
									
									System.out.println("Press 1. for Deposit");
									System.out.println("Press 2. for Rollback");
									uchoice=in.nextInt();
									
									System.out.println("Enter amount you would like to update:");
									uamt=in.nextInt();
									
									if(uchoice==1)
									{
										investorpersonal[i].totalCapital+=uamt;
									}
									
									else if(uchoice==2)
									{
										investorpersonal[i].totalCapital=investorpersonal[i].totalCapital-uamt;
									}
									
									else
									{
										System.out.println("No changes applied to wallet during update.");
									}
									
									System.out.println("Updated Wallet Amount:"+investorpersonal[i].totalCapital);
									break;
								}
								case 5://Update funds
								{
									float uamt; 
									
									System.out.println("All active investments:");
									
									for(int a=0;a<fundflag;a++)
									{
										if(investorpersonal[i].invCode.equals(funds[a].invCode))
										{
											for(int b=0;b<funds[a].appStatus.length;b++)
											{
												if(funds[a].appStatus[b].equals("GREEN"))
												{	
											    	System.out.println("-----------------------");
													System.out.println("Investment Code:"+funds[a].investCode[b]);
											        System.out.println("Scheme Code:"+funds[a].schemeCode[b]);
											        System.out.println("Allocated Funds:"+funds[a].allocFunds[b]);
											        System.out.println("Profit/Loss Ratio:"+funds[a].fundsProfitLoss[b]);
											    	System.out.println("-----------------------");
												}
											}
											
											System.out.println("Enter investment code for updation:");
											String uinvest=in.next().toUpperCase();
											
											System.out.println("Press 1. to Deposit");
											System.out.println("Press 2. to Withdraw");
											int uchoice=in.nextInt();
											
											System.out.println("Enter amount for updation:");
											uamt=in.nextFloat();
											
											if(uchoice==1)
											{
											
											if(uamt>0&&uamt<=investorpersonal[i].totalCapital)
											{
												for(int b=0;b<funds[a].appStatus.length;b++)
												{
													if(funds[a].appStatus[b].equals("GREEN")&&funds[a].investCode[b].equals(uinvest))
													{	
														funds[a].allocFunds[b]+=uamt;
														System.out.println("Updated allocated funds:"+funds[a].allocFunds[b]);
														
														investorpersonal[i].totalCapital=investorpersonal[i].totalCapital-uamt;

													}
													
													//else
													//{
														//System.out.println("Investment ineligible for updation.");
													//}
												}
											}
											
			
											else
											{
												System.out.println("Incorrect entry or insufficient balance in wallet for updation.");
											}
																						
											}
											
											else if(uchoice==2)
											{
												for(int b=0;b<funds[a].appStatus.length;b++)
													{
														if(funds[a].appStatus[b].equals("GREEN")&&funds[a].investCode[b].equals(uinvest))
														{	
															funds[a].allocFunds[b]=funds[a].allocFunds[b]-uamt;
															System.out.println("Updated allocated funds:"+funds[a].allocFunds[b]);
															
															investorpersonal[i].totalCapital=investorpersonal[i].totalCapital+uamt;

															
														}
														
														//else
														//{
															//System.out.println("Investment cannot be updated.");
														//}
													}	
											}
											
											else
											{
												System.out.println("Incorrect selection.");
											}
											
										}
									}
									
									break;
								}
								case 6: //Opt out of investment
								{
									
									int pos1=0;
									String schemeID="";
									String schemeType="";
									
									System.out.println("All investments:");
									
									for(int a=0;a<fundflag;a++)
									{
										
										if(investorpersonal[i].invCode.equals(funds[a].invCode))
										{
											for(int b=0;b<funds[a].investCode.length;b++)
											{		
													System.out.println("-----------------------");
													System.out.println("Investment Code:"+funds[a].investCode[b]);
											        System.out.println("Scheme Code:"+funds[a].schemeCode[b]);
											        System.out.println("Approval Status:"+funds[a].appStatus[b]);
											        System.out.println("Allocated Funds:"+funds[a].allocFunds[b]);
											        System.out.println("Profit/Loss Ratio:"+funds[a].fundsProfitLoss[b]);
											    	System.out.println("-----------------------");
											}
											
											System.out.println("Enter investment code for opting out:");
											String uout=in.next().toUpperCase();
											
											for(int c=0;c<funds[a].investCode.length;c++)
											{		
													if(funds[a].investCode[c].equals(uout))
													{
														pos1=c;
														schemeID=funds[a].schemeCode[c];
													}
											}
											
											investorpersonal[i].totalCapital+=funds[a].allocFunds[pos1];
											
											for(int d=pos1;d<funds[a].investCode.length-1;d++)
											{
												funds[a].investCode[d]=funds[a].investCode[d+1];
											    funds[a].schemeCode[d]=funds[a].schemeCode[d+1];
											    funds[a].allocFunds[d]=funds[a].allocFunds[d+1];
											    funds[a].appStatus[d]=funds[a].appStatus[d+1];
											    funds[a].fundsProfitLoss[d]=funds[a].fundsProfitLoss[d+1];
											    
											}
											
											fundflag--;	
											investorpersonal[i].activeScheme--;
										}
									}
									
									int pos2=0;
									
									for(int x=0;x<schemeflag;x++)
									{
										if(schemes[x].schemeCode.equals(schemeID))
										{
											schemeType=schemes[x].assetClass;
										}
									}
									
									if(schemeType=="Stocks")
									{
										for(int a=0; a<stocks.length;a++)
										{
											for(int b=0; b<stocks[a].schemeCode.length;b++)
											{
												 if(schemeID.equals(stocks[a].schemeCode[b]))
												 {
													 pos2=b;
												 } 
											}
											
											for(int c=pos2;c<stocks[a].schemeCode.length-1;c++)
											{
												stocks[a].schemeCode[c]=stocks[a].schemeCode[c+1];
												stocks[a].totalShares[c]=stocks[a].totalShares[c+1];
												stocks[a].invShares[c]=stocks[a].invShares[c+1];
												stocks[a].shareVal[c]=stocks[a].shareVal[c+1];
												stocks[a].shareTrend[c]=stocks[a].shareTrend[c+1];
												stocks[a].shareIPO[c]=stocks[a].shareIPO[c+1];
											}
											
										}
									}
									
									else if(schemeType=="Bonds")
									{
										for(int a=0; a<bonds.length;a++)
										{
											for(int b=0; b<bonds[a].schemeCode.length;b++)
											{
												 if(schemeID.equals(bonds[a].schemeCode[b]))
												 {
													 pos2=b;
												 }
												 
											}
											
											for(int c=pos2;c<bonds[a].schemeCode.length-1;c++)
											{
												bonds[a].schemeCode[c]=bonds[a].schemeCode[c+1];
												bonds[a].interestRate[c]=bonds[a].interestRate[c+1];
												bonds[a].totalMonths[c]=bonds[a].totalMonths[c+1];
												bonds[a].matDate[c]=bonds[a].matDate[c+1];
												bonds[a].initialLendingDate[c]=bonds[a].initialLendingDate[c+1];
											}
											
										}
										
									}
									
									else if(schemeType=="Commodities")
									{
										for(int a=0; a<commo.length;a++)
										{
											for(int b=0; b<commo[a].schemeCode.length;b++)
											{
												 if(schemeID.equals(commo[a].schemeCode[b]))
												 {
													 pos2=b;
												 }
												 
											}
											
											for(int c=pos2;c<commo[a].schemeCode.length-1;c++)
											{
												commo[a].schemeCode[c]=commo[a].schemeCode[c+1];
												commo[a].commType[c]=commo[a].commType[c+1];
												commo[a].commBuyPrice[c]=commo[a].commBuyPrice[c+1];
												commo[a].commsellPrice[c]=commo[a].commsellPrice[c+1];
												commo[a].buyDate[c]=commo[a].buyDate[c+1];
												commo[a].srcCountry[c]=commo[a].srcCountry[c+1];
												commo[a].commTransStat[c]=commo[a].commTransStat[c+1];
											}
											
										}
									}
									
									else if(schemeType=="Properties")
									{
										for(int a=0; a<propflag;a++)
										{
											for(int b=0; b<props[a].schemeCode.length;b++)
											{
												 if(schemeID.equals(props[a].schemeCode[b]))
												 {
													 pos2=b;
												 }
												 
											}
											
											for(int c=pos2;c<props[a].schemeCode.length-1;c++)
											{
												props[a].schemeCode[c]=props[a].schemeCode[c+1];
												props[a].propBuyPrice[c]=props[a].propBuyPrice[c+1];
												props[a].propSellPrice[c]=props[a].propSellPrice[c+1];
												props[a].propValGrow[c]=props[a].propValGrow[c+1];
												props[a].propType[c]=props[a].propType[c+1];
											}
											
										}
									}
									
									System.out.println("Opted out of investment successfully.");
									break;
								}
								case 7:
								{
									for(int j=0;j<fundflag;j++)
									{
										if(funds[j].invCode.equals(investorpersonal[j].invCode))
										{
											funds[j].displayfunds();
										}
									}
									break;
								}

								//System.out.println("Do you want to return to main menu? yes/no?");
								//opt=in.next().toLowerCase();
							}
							
							System.out.println("Do you want to return to main menu? yes/no?");
							opt=in.next().toLowerCase();
							System.out.print("\033[H\033[2J");
        					System.out.flush();
							if(!opt.equals("yes"))
							{
								System.out.println("---------------------------------------------------------------------");
								System.out.println("Thank you for using F4 Asset management system!");
								System.out.println("---------------------------------------------------------------------");

							}
						}while(opt.equals("yes"));
					}
						else
						{
							System.out.println("Wrong Username or Password!");//Failed
						}
					}
				
				//if(f==false)
				//{
					//System.out.println("Wrong Username");
				//}
				
			
			}
			break;
		}
				
				
			//end of user

			case 2://admin
			{
				System.out.print("Enter Username: ");
				String tuname= in.next();
				//System.out.println(tuname);
				char[] tpass = console.readPassword("Enter your secret password: ");
				String temppass= new String(tpass);
				//System.out.println(temppass);
				boolean f=false;
				
				//String icode;
				
				for(int i=0;i<1;i++)
				{
					//System.out.println(investorpersonal[i].uname);
					if(tuname.equals(admin[i].adminUname))
					{
						f=true;
						
						//System.out.println("IN");
						if(temppass.equals(admin[i].getadminPass()))
						{
							System.out.println("Success!");//Loged in
							System.out.print("\033[H\033[2J");
        					System.out.flush();
							do
							{
								System.out.println("----------------------------------------------");
								System.out.println("1. View Schemes");
								System.out.println("2. View Funds");
								System.out.println("3. View Investors");
								System.out.println("4. View Transactions");
								System.out.println("5. Add Schemes");
								System.out.println("6. Remove Schemes");
								System.out.println("7. Manage Investments");
								System.out.println("----------------------------------------------");
								System.out.println();
								System.out.println("Enter your option");
							
							String acode=admin[i].adminCode;

							int ch1=in.nextInt();
							
							System.out.print("\033[H\033[2J");
        					System.out.flush();
							switch(ch1)
							{
							//{
							
							//}
							case 1:
							{
								//Display all schemes
								//Chooses Scheme code
								System.out.println("Available schemes");
								System.out.println();
								System.out.println("Scheme Code\t\t\tScheme Name");
								for(int j=0;j<schemeflag;j++)
								{
									schemes[j].displayonlyschemes();
									//schemes[i].displayonlyschemes(schemes[i].schemeCode,schemes[i].schemeName);
									//System.out.println(schemes[i].schemeCode+" "+schemes[i].schemeName);
									//System.out.println(Arrays.toString(schemes[i]));
								}
								System.out.println("Choose your option:");

								String schemeoption=in.next().toUpperCase();


								for(int k=0;k<schemeflag;k++)
									{
										if(schemeoption.equals(schemes[k].schemeCode))
										{
											switch(schemes[k].assetClass.toLowerCase())
											{
												case "stocks":
												{
													schemes[k].displaystock();
													break;
												}
												case "bonds":
												{
													schemes[k].displaybonds();
													break;
												}
												case "properties":
												{
													schemes[k].displayprop();
													break;
												}
												case "commodities":
												{
													schemes[k].displaycomm();
													break;
												}
											}
										}
									}
									break;
								
							}
							
							case 2:
							{
								for(int l=0; l<fundflag;l++)
								{
									funds[l].displayfunds();
								}
								
								break;
							}
							
							case 3:
							{
								int bc; 
								
								System.out.println("1. View all investors");
								System.out.println("2. Search by investor code");
								
								bc=in.nextInt();
								
								if(bc==1)
								{
									for(int l=0;l<investorpersonal.length;l++)
									{
										investorpersonal[l].display();
									}
								}
								
								else if(bc==2)
								{
								
									System.out.println("Enter investor code:");
									String searchCode=in.next();
									
									for(int l=0;l<investorpersonal.length;l++)
									{
										if(searchCode.equals(investorpersonal[l].invCode))
										{
											investorpersonal[l].display();
											break;
										}
										
										else
										{
											System.out.println("Investor not available in the system.");
										}
											
									}
									
								}
					
								
								break;
							}
							
							case 4:
							{
								for(int l=0;l<transflag;l++)
								{
									transac[l].displaytransac();
								}
								
								break;
							}
							case 5:// add scheme
							{
								System.out.println("Enter Asset class to be added");
								String inpassetclass=in.next().toLowerCase();

								switch(inpassetclass)
								{
									case "stocks":
									{
										System.out.println("Enter Scheme code");
										String schemeCode=in.next();
										System.out.println("Enter Scheme name");
										String schemeName=in.next();
										//System.out.println("Enter Total funds");
										//float totalFunds=in.nextFloat();
										//System.out.println("Enter Active investors");
										//int activeInv=in.nextInt();
										System.out.println("Enter Scheme Provider");
										String schemeProv=in.next();
										//System.out.println("Enter Admin code");
										//String adminCode=in.next();
										System.out.println("Enter Total shares");
										int totalShares=in.nextInt();
										System.out.println("Enter Share value");
										float shareVal=in.nextFloat();
										System.out.println("Enter Share trend");
										float shareTrend=in.nextFloat();
										System.out.println("Enter Share IPO");
										float shareIPO=in.nextFloat();

										schemes[schemeflag]=new Schemes(schemeCode, schemeName, "Stocks", 0.0F, 0, schemeProv, acode, totalShares, shareVal, shareTrend, shareIPO);
										schemes[schemeflag].displaystock();
										schemeflag++;
										//schemes[schemeflag]=new Schemes(System.console("Scheme code:").readLine(), System.console("Scheme name:"), "Stocks", System.console("Total funds:").readInt(), System.console("Active investors:").readInt(), System.console("Scheme Provider:").readLine(), System.console("Admin code:").readLine(), System.console("Total Shares:").readInt(), System.console("Share value:").readFloat(), System.console("Share trend:").readFloat(), System.console("Share IPO:").readFloat())
										break;
									}
									case "commodities":
									{
										System.out.println("Enter Scheme code");
										String schemeCode=in.next();
										System.out.println("Enter Scheme name");
										String schemeName=in.next();
										System.out.println("Enter Scheme Provider");
										String schemeProv=in.next();
										System.out.println("Enter Commodity Type:");
										String commType=in.next();
										System.out.println("Enter Commodity Buy Price:");
										float commBuyPrice=in.nextFloat();
										System.out.println("Enter Source Country:");
										String srcCountry=in.next();

										schemes[schemeflag]=new Schemes(schemeCode, schemeName, "Commodities", 0.0F, 0, schemeProv, acode, commType, commBuyPrice, srcCountry);

										schemes[schemeflag].displaycomm();
										schemeflag++;
										//schemes[schemeflag]=new Schemes(System.console("Scheme code:").readLine(), System.console("Scheme name:"), "Stocks", System.console("Total funds:").readInt(), System.console("Active investors:").readInt(), System.console("Scheme Provider:").readLine(), System.console("Admin code:").readLine(), System.console("Total Shares:").readInt(), System.console("Share value:").readFloat(), System.console("Share trend:").readFloat(), System.console("Share IPO:").readFloat())
										break;
									}
									
									case "bonds":
									{
										System.out.println("Enter Scheme code");
										String schemeCode=in.next();
										System.out.println("Enter Scheme name");
										String schemeName=in.next();
										System.out.println("Enter Scheme Provider");
										String schemeProv=in.next();
										System.out.println("Enter Interest Rate:");
										float interestRate=in.nextFloat();
										System.out.println("Enter Maturity Date:");
										String matDate=in.next();

										schemes[schemeflag]=new Schemes(schemeCode, schemeName, "Bonds", 0.0F, 0, schemeProv, acode, interestRate, matDate);
										schemes[schemeflag].displaybonds();
										schemeflag++;
										//schemes[schemeflag]=new Schemes(System.console("Scheme code:").readLine(), System.console("Scheme name:"), "Stocks", System.console("Total funds:").readInt(), System.console("Active investors:").readInt(), System.console("Scheme Provider:").readLine(), System.console("Admin code:").readLine(), System.console("Total Shares:").readInt(), System.console("Share value:").readFloat(), System.console("Share trend:").readFloat(), System.console("Share IPO:").readFloat())
										break;
									}
									
									case "properties":
									{
										System.out.println("Enter Scheme code");
										String schemeCode=in.next();
										System.out.println("Enter Scheme name");
										String schemeName=in.next();
										System.out.println("Enter Scheme Provider");
										String schemeProv=in.next();
										System.out.println("Enter Property Buy Price:");
										float propBuyPrice=in.nextFloat();
										
										schemes[schemeflag]=new Schemes(schemeCode, schemeName, "Properties", 0.0F, 0, schemeProv, acode, propBuyPrice);
										schemes[schemeflag].displayprop();
										schemeflag++;
										//schemes[schemeflag]=new Schemes(System.console("Scheme code:").readLine(), System.console("Scheme name:"), "Stocks", System.console("Total funds:").readInt(), System.console("Active investors:").readInt(), System.console("Scheme Provider:").readLine(), System.console("Admin code:").readLine(), System.console("Total Shares:").readInt(), System.console("Share value:").readFloat(), System.console("Share trend:").readFloat(), System.console("Share IPO:").readFloat())
										break;
									}
									
									default:
									{
										System.out.println("Incorrect selection.");
										break;
									}
								}
								
								admin[i].totalSchemes++;
								break;


							}
							
							case 6://remove schemes
							{
								String rcode; 
								int pos1=0;
								String schemeType="";
								
								System.out.println("Available schemes");
								System.out.println();
								System.out.println("Scheme Code\t\t\tScheme Name");
								for(int j=0;j<schemeflag;j++)
								{
									schemes[j].displayonlyschemes();
									//schemes[i].displayonlyschemes(schemes[i].schemeCode,schemes[i].schemeName);
									//System.out.println(schemes[i].schemeCode+" "+schemes[i].schemeName);
									//System.out.println(Arrays.toString(schemes[i]));
								}
								
								System.out.println("Enter code of scheme to be removed:");
								rcode=in.next().toUpperCase();
								
								for(int l=0;l<schemeflag;l++)
								{
									if(rcode.equals(schemes[l].schemeCode))
									{
										pos1=l;
										schemeType=schemes[l].assetClass;
									}
								}
								
								for(int m=pos1;m<schemeflag-1;m++)
								{
									schemes[m]=schemes[m+1];
								}
								
								
								int pos2=0;
								String flag3="";
								
								for(int a=0; a<fundflag;a++)
								{
									for(int b=0; b<funds[a].schemeCode.length;b++)
									{
										 if(rcode.equals(funds[a].schemeCode[b]))
										 {
											 pos2=b;
										 }
										 
									}
									
									for(int c=pos2;c<funds[a].schemeCode.length-1;c++)
									{
										funds[a].schemeCode[c]=funds[a].schemeCode[c+1];
										funds[a].investCode[c]=funds[a].investCode[c+1];
										funds[a].allocFunds[c]=funds[a].allocFunds[c+1];
										funds[a].appStatus[c]=funds[a].appStatus[c+1];
										funds[a].fundsProfitLoss[c]=funds[a].fundsProfitLoss[c+1];
									}
									
								}
								fundflag--;
								if(schemeType=="Stocks")
								{
									for(int a=0; a<stockflag;a++)
									{
										for(int b=0; b<stocks[a].schemeCode.length;b++)
										{
											 if(rcode.equals(stocks[a].schemeCode[b]))
											 {
												 pos2=b;
												 flag3=stocks[a].invCode;
											 }
											 
										}
										
										for(int c=pos2;c<stocks[a].schemeCode.length-1;c++)
										{
											stocks[a].schemeCode[c]=stocks[a].schemeCode[c+1];
											stocks[a].totalShares[c]=stocks[a].totalShares[c+1];
											stocks[a].invShares[c]=stocks[a].invShares[c+1];
											stocks[a].shareVal[c]=stocks[a].shareVal[c+1];
											stocks[a].shareTrend[c]=stocks[a].shareTrend[c+1];
											stocks[a].shareIPO[c]=stocks[a].shareIPO[c+1];
										}
										
									}

									stockflag--;
								}
								
								else if(schemeType=="Bonds")
								{
									for(int a=0; a<bondflag;a++)
									{
										for(int b=0; b<bonds[a].schemeCode.length;b++)
										{
											 if(rcode.equals(bonds[a].schemeCode[b]))
											 {
												 pos2=b;
												 flag3=bonds[a].invCode;
											 }
											 
										}
										
										for(int c=pos2;c<bonds[a].schemeCode.length-1;c++)
										{
											bonds[a].schemeCode[c]=bonds[a].schemeCode[c+1];
											bonds[a].interestRate[c]=bonds[a].interestRate[c+1];
											bonds[a].totalMonths[c]=bonds[a].totalMonths[c+1];
											bonds[a].matDate[c]=bonds[a].matDate[c+1];
											bonds[a].initialLendingDate[c]=bonds[a].initialLendingDate[c+1];
										}
										
									}
									bondflag--;
								}
								
								else if(schemeType=="Commodities")
								{
									for(int a=0; a<commflag;a++)
									{
										for(int b=0; b<commo[a].schemeCode.length;b++)
										{
											 if(rcode.equals(commo[a].schemeCode[b]))
											 {
												 pos2=b;
												 flag3=commo[a].invCode;
											 }
											 
										}
										
										for(int c=pos2;c<commo[a].schemeCode.length-1;c++)
										{
											commo[a].schemeCode[c]=commo[a].schemeCode[c+1];
											commo[a].commType[c]=commo[a].commType[c+1];
											commo[a].commBuyPrice[c]=commo[a].commBuyPrice[c+1];
											commo[a].commsellPrice[c]=commo[a].commsellPrice[c+1];
											commo[a].buyDate[c]=commo[a].buyDate[c+1];
											commo[a].srcCountry[c]=commo[a].srcCountry[c+1];
											commo[a].commTransStat[c]=commo[a].commTransStat[c+1];
										}
										
									}
									commflag--;
								}
								
								else if(schemeType=="Properties")
								{
									for(int a=0; a<propflag;a++)
									{
										for(int b=0; b<props[a].schemeCode.length;b++)
										{
											 if(rcode.equals(props[a].schemeCode[b]))
											 {
												 pos2=b;
												 flag3=props[a].invCode;
											 }
											 
										}
										
										for(int c=pos2;c<props[a].schemeCode.length-1;c++)
										{
											props[a].schemeCode[c]=props[a].schemeCode[c+1];
											props[a].propBuyPrice[c]=props[a].propBuyPrice[c+1];
											props[a].propSellPrice[c]=props[a].propSellPrice[c+1];
											props[a].propValGrow[c]=props[a].propValGrow[c+1];
											props[a].propType[c]=props[a].propType[c+1];
										}
										
									}
									propflag--;
								}
								
								for(int d=0; d<investorpersonal.length;d++)
								{
									if(flag3.equals(investorpersonal[d].invCode))
									{
										investorpersonal[d].activeScheme--;
									}
								}
								
				
								schemeflag--;
								admin[i].totalSchemes--;
								System.out.println("Scheme deleted successfully.");
								break;
							}
							case 7://approve or reject investments
							{
								String jcode;
								String kcode;
								
								System.out.println("All investments:");
								
								for(int l=0;l<fundflag;l++)
								{
									funds[l].displayfunds();
								}
								
								System.out.println("Enter investor code:");
								jcode=in.next().toUpperCase();
								
								System.out.println("Enter investment code of investment to be modified:");
								kcode=in.next().toUpperCase();
								
								for(int l=0;l<fundflag;l++)
								{
									if(funds[l].invCode.equals(jcode))
									{
										for(int m=0; m<funds[l].investCode.length;m++)
										{
											if(funds[l].investCode[m].equals(kcode))
											{
												int ap;
												
												System.out.println("Press 1. Approve");
												System.out.println("Press 2. Reject");
												System.out.println("Press 3. Under Review");
												ap=in.nextInt();
												
												if(ap==1)
												{
													funds[l].appStatus[m]="GREEN";
													admin[i].totalApp++;
												}
												
												else if(ap==2)
												{
													funds[l].appStatus[m]="RED";
													admin[i].totalApp--;
												}
												
												else if(ap==3)
												{
													funds[l].appStatus[m]="YELLOW";
												}
												
												else
												{
													System.out.println("Incorrect selection.");
												}
												
											}
										}
									}
								}
								
								System.out.println("Changes made successfully.");
								break;
							}
			
			default:
			{
				System.out.println("Invalid option!");
			}
		}
		System.out.println("Do you want to return to main menu? yes/no?");
		opt=in.next().toLowerCase();

		System.out.print("\033[H\033[2J");
        System.out.flush();

		System.out.println("---------------------------------------------------------------------");
		System.out.println("Successfully logged out!");
		System.out.println("---------------------------------------------------------------------");
		}
		while(opt.equals("yes"));
						}
					}
				}
			}
		}
	}
}

