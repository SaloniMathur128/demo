package Demo.Demo;

public class Patterns {
	//right angle triangle of stars
	public static void starTriangle1(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//right angle triangle of numbers
	public static void numTriangle2(int n) {
		
		for(int i =1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	//right angle triangle for inverse number
    public static void invNumTriangle3(int n) {
		int count = n;
		for(int i =1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(count);
				}
			count--;
			System.out.println();
		}
	}
    //right angle triangle for continuous increasing numbers
      public static void incNumTriangle4(int n) {
		
		for(int i =1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
   //right angle triangle for continuous decreasing number
     public static void decNumTriangle5(int n) {
	
	for(int i =1; i<=n; i++) {
		int count = n;
		for(int j = 1; j<=i; j++) {
			System.out.print(count);
			count--;
			}
		
		System.out.println();
	}
}
     //right angle triangle 
     /* 1
      * 21
      * 321
      * 4321
      * 54321
      */
     public static void incDecNumTriangle6(int n) {
    	 for(int i = 1; i<=n; i++) {
    		 for(int j = i; j>=1; j--) {
    			 System.out.print(j);
    		 }
    		 System.out.println();
     }
    	 }
     /*
      *  5
 		45
 		345
 		2345
 		12345
      */
     public static void decDecNumTriangle7(int n) {
     	int count = n;
     	for(int i = 1;i<=n;i++){
     		for(int j = 1;j<=i;j++) {
     			int a = j-i;
     			System.out.print((count+a));
     			
     		}
     		
     		System.out.println();
     		
     	}
     }
//   ########################################################################################################################################  
     
     //right angle triangle of  alphabet
     public static void alphabetTriangle1(int n) {
    	 char ch = 'A' ;
    	 for(int i = 1;i<=n;i++) {
    		 for(int j = 1; j<=i;j++) {
    			 System.out.print(ch);
    			 
    		 }
    		 ch++;
    		 System.out.println();
    	 }
     }
   //right angle triangle of inverse alphabet
     public static void invAlphabetTriangle2(int n) {
    	 int ch = 'A' +n-1;
    	 for(int i = 1;i<=n;i++) {
    		 for(int j = 1; j<=i;j++) {
    			 System.out.print((char)ch);
    			 
    		 }
    		 ch--;
    		 System.out.println();
    	 }
     }
    //right angle triangle for continuous decreasing alphabets
     public static void decAlphabetTriangle3_1(int n) {
    	 for(int i =1; i<=n; i++) {
    		 int count = n-1;
    			for(int j = 1; j<=i; j++) {
        			int ch = 'A' + count;
    				System.out.print((char)ch);
    				count--;
    				}
    			
    			System.out.println();
    		}
    	 
     }
     public static void decAlphabetTriangle3_2(int n) {
    	 for(int i =1; i<=n; i++) {
               for(int j = 1; j<=i; j++) {
        			int ch = 65 ;
    				System.out.print((char)(ch +n-j));
    				}
    			
    			System.out.println();
    		}
    	 
     }
    //right angle triangle for continuous increasing alphabets
     public static void incAlphabetTriangle4(int n) {
    	 for(int i =1; i<=n; i++) {
    			for(int j = 1; j<=i; j++) {
        			int ch = 64 ;
    				System.out.print((char)(ch +j));
    				}
    			
    			System.out.println();
    		}
    	 
     }
    /*
      * A
		BA
		CBA
		DCBA
		EDCBA

      */
    public static void incDecAlphabetTriangle5(int n) {
    	int ch = 64;
    	for(int i = 1;i<=n;i++){
    		for(int j = i;j>=1;j--) {
    			System.out.print((char)(ch+j));
    		}
    		System.out.println();
    		
    	}
    }
  /*
     * E
     * DE
     * CDE
     * BCDE
     * ABCDE
     */
    public static void decDecAlphabetTriangle6(int n) {
    	for(int i = 1;i<=n;i++){
    		int ch = 64 +n;
    		
    		for(int j = 1;j<=i;j++) {
    			int a = j-i;
    			System.out.print((char)(ch+a));
    			
    		}
    		
    		System.out.println();
    		
    	}
    }
//    ############################################################
    
/*
 * a
 * bb
 * ccc
 * dddd
 * eeeee
 */
    public static void smlAlpTriangle1(int n) {
    	char ch = 'a';
    	for(int i = 1; i<=n;i++) {
    		for(int j = 1;j<=i;j++) {
    		   System.out.print(ch );
    		}
    		ch++;
    		System.out.println();
    	}
    }
    /*
     * e
     * dd
     * ccc
     * bbbb
     * aaaaa
     */
    public static void invSmlAlpTriangle2(int n) {
    	int ch = 'a'+n-1;
    	for(int i = 1; i<=n;i++) {
    		for(int j = 1;j<=i;j++) {
    		   System.out.print((char)ch );
    		}
    		ch--;
    		System.out.println();
    	}
    }
     //right angle triangle for continuous decreasing lowercase alphabets
    /*
     *  e
		ed
		edc
		edcb
		edcba

     */
    public static void decSmlAlpTriangle3(int n) {
   	 for(int i =1; i<=n; i++) {
   		 int count = n-1;
   			for(int j = 1; j<=i; j++) {
       			int ch = 'a' + count;
   				System.out.print((char)ch);
   				count--;
   				}
   			
   			System.out.println();
   		}
   	 
    }
       /*
      * a
		ab
		abc
		abcd
		abcde
		      */
    public static void incSmlAlpTriangle4(int n) {
    	int ch = 96 ;
    	for(int i = 1; i<=n;i++) {
    		for(int j = 1;j<=i;j++) {
    			System.out.print((char)(ch+j));
    		}
    		
    		System.out.println();
    	}
    }
    /*
     * 	e
		de
		cde
		bcde
		abcde

     */
    public static void decDecSmlAlpTriangle5(int n) {
    	for(int i = 1;i<=n;i++){
    		int ch = 96 +n;
    		
    		for(int j = 1;j<=i;j++) {
    			int a = j-i;
    			System.out.print((char)(ch+a));
    			
    		}
    		
    		System.out.println();
    		
    	}
    }
    public static void incDecSmlAlpTriangle6(int n) {
    	int ch = 96;
    	for(int i = 1;i<=n;i++){
    		for(int j = i;j>=1;j--) {
    			System.out.print((char)(ch+j));
    		}
    		System.out.println();
    		
    	}
    }
//    ############################################################################
    
    /*
     *  *****
     *  ****
     *  ***
     *  **
     *  *
     */
    public static void starInvTriangle1(int n) {
    	for(int i = n; i>=1; i--) {
    		for(int j = 1;j<=i;j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
    /*
     *  11111
		2222
		333
		44
		5
		     */
    public static void numInvTriangle2(int n) {
    	int count = 1;
    	for(int i = n; i>=1; i--) {
    		for(int j = 1;j<=i;j++) {
    			System.out.print(count);
    		}
    		count++;
    		System.out.println();
    	}
    }
 /*
     *  55555
		4444
		333
		22
		1
		     */
    public static void invNumInvTriangle3(int n) {
    	for(int i = n; i>=1; i--) {
    		for(int j = 1;j<=i;j++) {
    			System.out.print(i);
    		}
    		System.out.println();
    	}
    }
    /*
     *  12345
		1234
		123
		12
		1
     */
    public static void incNumInvTriangle4(int n) {
    	
    	for(int i = n; i>=1; i--) {
    		for(int j = 1;j<=i;j++) {
    			System.out.print(j);
    		}
    		
    		System.out.println();
    	}
    }
    /*
		 *  54321
			5432
			543
			54
			5
		 */
	   public static void invNumInvDecTriangle5(int n) {
		   
		for(int i = n; i>=1; i--) {
			int count = n;
			for(int j = 1;j<=i;j++) {
				System.out.print(count);
				count--;
			}
			System.out.println();
		}
	}
	   /*	54321
			4321
			321
			21
			1
			*/
	   public static void invNumDecTriangle6(int n) {
		   int count = n+1;
		   for(int i = n;i>=1;i--) {
			 for(int j = 1; j<=i;j++) {
				   System.out.print(count-j);
			   }
			 count--;
			   System.out.println();
		   }
	   } 
	   /*
	    *   12345
			2345
			345
			45
			5
	    */
	   public static void incNumDecTriangle7(int n) {
		   int count = 0;
		   for(int i = n;i>=1;i--) {
			 for(int j = 1; j<=i;j++) {
				   System.out.print(count+j);
			   }
			 count++;
			   System.out.println();
		   }
	   }
//	   ############################################################################
	   
	   /*
	    *   EEEEE
			DDDD
			CCC
			BB
			A
	    */
	   public static void invAlpInvTriangle1(int n) {
		   int ch = 64+n;
	    	for(int i = n; i>=1; i--) {
	    		for(int j = 1;j<=i;j++) {
	    			System.out.print((char)ch);
	    		}
	    		ch--;
	    		System.out.println();
	    	}
	   }
	   /*
	    * 	AAAAA
			BBBB
			CCC
			DD
			E
	    */
	   public static void incAlpInvTriangle2(int n) {
		   int ch = 65;
	    	for(int i = n; i>=1; i--) {
	    		for(int j = 1;j<=i;j++) {
	    			System.out.print((char)ch);
	    		}
	    		ch++;
	    		System.out.println();
	    	}
	   }
	   /*
	    * 	EDCBA
			EDCB
			EDC
			ED
			E
	    */
	   public static void invAlpInvDecTriangle3(int n){
		  
	    	for(int i = n; i>=1; i--) {
	    		int ch = 65+n;
	    		for(int j = 1;j<=i;j++) {
	    			System.out.print((char)(ch-j));
	    		}
	    		ch--;
	    		System.out.println();
	    	}
	   }
	   /*
	    * 	ABCDE
			ABCD
			ABC
			AB
			A
	    */
	   public static void incAlpDecTriangle4(int n){
			  
	    	for(int i = n; i>=1; i--) {
	    		int ch = 64;
	    		for(int j = 1;j<=i;j++) {
	    			System.out.print((char)(ch+j));
	    		}
	    		ch++;
	    		System.out.println();
	    	}
	   }
	   /*
	    *   ABCDE
			BCDE
			CDE
			DE
			E
	    */
	   public static void incAlpIncDecTriangle5(int n){
		   int ch = 64;
	    	for(int i = n; i>=1; i--) {
	    		for(int j = 1;j<=i;j++) {
	    			System.out.print((char)(ch+j));
	    		}
	    		ch++;
	    		System.out.println();
	    	}
	   }
	   /*
	    *   EDCBA
			DCBA
			CBA
			BA
			A

	    */
	   public static void decAlpIncDecTriangle6(int n){
		   int ch = 65+n;
	    	for(int i = n; i>=1; i--) {
	    		for(int j = 1;j<=i;j++) {
	    			System.out.print((char)(ch-j));
	    		}
	    		ch--;
	    		System.out.println();
	    	}
	   }
//	   #########################################################
	   
	   /*
	    *   eeeee
			dddd
			ccc
			bb
			a
	    */
	   public static void invSmlAlpInvTriangle1(int n) {
		   int ch = 96+n;
	    	for(int i = n; i>=1; i--) {
	    		for(int j = 1;j<=i;j++) {
	    			System.out.print((char)ch);
	    		}
	    		ch--;
	    		System.out.println();
	    	}
	   }
	   /*
	    * 	aaaaa
			bbbb
			ccc
			dd
			e
	    */
	   public static void incSmlAlpInvTriangle2(int n) {
		   int ch = 97;
	    	for(int i = n; i>=1; i--) {
	    		for(int j = 1;j<=i;j++) {
	    			System.out.print((char)ch);
	    		}
	    		ch++;
	    		System.out.println();
	    	}
	   }
	   /*
	    *   edcba
			edcb
			edc
			ed
			e
	    */
	   public static void invSmlAlpInvDecTriangle3(int n){
			  
	    	for(int i = n; i>=1; i--) {
	    		int ch = 97+n;
	    		for(int j = 1;j<=i;j++) {
	    			System.out.print((char)(ch-j));
	    		}
	    		ch--;
	    		System.out.println();
	    	}
	   }
	   /*
	    * 	abcde
			abcd
			abc
			ab
			a
	    */
	  public static void incSmlAlpDecTriangle4(int n){
			  
	    	for(int i = n; i>=1; i--) {
	    		int ch = 96;
	    		for(int j = 1;j<=i;j++) {
	    			System.out.print((char)(ch+j));
	    		}
	    		ch++;
	    		System.out.println();
	    	}
	   }
	  /*
	   * 	abcde
			bcde
			cde
			de
			e
	   */
	  public static void incSmlAlpIncDecTriangle5(int n){
		   int ch = 96;
	    	for(int i = n; i>=1; i--) {
	    		for(int j = 1;j<=i;j++) {
	    			System.out.print((char)(ch+j));
	    		}
	    		ch++;
	    		System.out.println();
	    	}
	   }
	  /*
	   * 	edcba
			dcba
			cba
			ba
			a

	   */
	   public static void decSmlAlpIncDecTriangle6(int n){
		   int ch = 97+n;
	    	for(int i = n; i>=1; i--) {
	    		for(int j = 1;j<=i;j++) {
	    			System.out.print((char)(ch-j));
	    		}
	    		ch--;
	    		System.out.println();
	    	}
	   }
//	   ########################################################################
	   
	   /*
	    *       *
			   **
			  ***
			 ****
			*****
	    */
	   public static void starInvRTriangle1(int n) {
		   for(int i = 1;i<=n;i++) {
		   for(int j = 1;j<=n-i;j++) {
			   System.out.print(" ");
			   }
		   for(int k = 1;k<=i;k++) {
			   System.out.print("*");
		   }
		   
		   System.out.println();
		   }
		 
		   }
	   /*
	    *       1
			   22
			  333
			 4444
			55555
	    */
	   public static void numInvRTriangle2(int n) {
		   for(int i = 1;i<=n;i++) {
		   for(int j = 1;j<=n-i;j++) {
			   System.out.print(" ");
			   }
		   for(int k = 1;k<=i;k++) {
			   System.out.print(i);
		   }
		   
		   System.out.println();
		   }
		 
		   }
	   /*
	    * 	    5
			   44
			  333
			 2222
			11111
	    */
	   public static void numInvRInvTriangle3(int n) {
		   for(int i = 1;i<=n;i++) {
		   for(int j = 1;j<=n-i;j++) {
			   System.out.print(" ");
			   }
		   for(int k = 1;k<=i;k++) {
			   System.out.print(n-i+1);
		   }
		   
		   System.out.println();
		   }
		 
		   }
	   /*
	    *       1
			   12
			  123
			 1234
			12345
	    */
	   public static void numInvIncRTriangle4(int n) {
		   for(int i = 1;i<=n;i++) {
		   for(int j = 1;j<=n-i;j++) {
			   System.out.print(" ");
			   }
		   for(int k = 1;k<=i;k++) {
			   System.out.print(k);
		   }
		   
		   System.out.println();
		   }
		 
		   }
	   /*
	    *       5
			   54
			  543
			 5432
			54321
	    */
	   public static void numInvDecRTriangle5(int n) {
		   for(int i = 1;i<=n;i++) {
		   for(int j = 1;j<=n-i;j++) {
			   System.out.print(" ");
			   }
		   for(int k = 1;k<=i;k++) {
			   System.out.print(n-k+1);
		   }
		   
		   System.out.println();
		   }
		 
		   }
	   /*
	    *       1
			   21
			  321
			 4321
			54321
	    */
	   public static void numIncRTriangle6(int n) {
		   for(int i = 1;i<=n;i++) {
			   int count = n;
		     for(int j = 1;j<=n-i;j++) {
			   System.out.print(" ");
			  count--;
			   }
		      for(int k = 1;k<=i;k++) {
			   System.out.print(count);
			   count--;
		   }
		  
		   System.out.println();
		   }
		 
		   }
	   /*
	    *       5
			   45
			  345
			 2345
			12345
	    */
	   public static void numIncRTriangle7(int n) {
		   for(int i = 1;i<=n;i++) {
			   int count = 1;
		     for(int j = 1;j<=n-i;j++) {
			   System.out.print(" ");
			  count++;
			   }
		      for(int k = 1;k<=i;k++) {
			   System.out.print(count);
			   count++;
		   }
		  
		   System.out.println();
		   }
		 
		   }
//	   ####################################################################################
	   
	   /*
	    *       A
			   BB
			  CCC
			 DDDD
			EEEEE

	    */
	   public static void alpInvRTriangle1(int n) {
		   char ch =  'A';
		   for(int i = 1;i<=n;i++) {
		   for(int j = 1;j<=n-i;j++) {
			   System.out.print(" ");
			   }
		   for(int k = 1;k<=i;k++) {
			   System.out.print(ch);
		   }
		   ch++;
		   System.out.println();
		   }
		 
		   }
	   /*
	    *       E
			   DD
			  CCC
			 BBBB
			AAAAA
	    */
	   public static void alpInvRInvTriangle2(int n) {
		   int ch =  'A' + n-1;
		   for(int i = 1;i<=n;i++) {
		   for(int j = 1;j<=n-i;j++) {
			   System.out.print(" ");
			   }
		   for(int k = 1;k<=i;k++) {
			   System.out.print((char)ch);
		   }
		   ch--;
		   System.out.println();
		   }
		 
		   }
	   /*
	    *           A
				   AB
				  ABC
				 ABCD
				ABCDE

	    */
	   public static void alpInvRIncTriangle3(int n) {
		  
		   for(int i = 1;i<=n;i++) {
			   int ch =  64 ;
		   for(int j = 1;j<=n-i;j++) {
			   System.out.print(" ");
			   }
		   for(int k = 1;k<=i;k++) {
			   System.out.print((char)(ch+k));
		   }
		   ch++;
		   System.out.println();
		   }
		 
		   }
		   /*
				    E
				   ED
				  EDC
				 EDCB
				EDCBA
		 */
	   public static void alpInvRDecTriangle4(int n) {
			  
		   for(int i = 1;i<=n;i++) {
			   int ch =  65+n; ;
		   for(int j = 1;j<=n-i;j++) {
			   System.out.print(" ");
			   }
		   for(int k = 1;k<=i;k++) {
			   System.out.print((char)(ch-k));
		   }
		   ch--;
		   System.out.println();
		   }
	   }
	   /*
	    *       A
			   BA
			  CBA
			 DCBA
			EDCBA
	    */
	   public static void alpInvRIncLeftTriangle5(int n) {
	    for(int i = 1;i<=n;i++) {
	    	   int ch =  64 ; 
			   int count = n;
		   for(int j = 1;j<=n-i;j++) {
			   System.out.print(" ");
			   count--;
			   }
		   for(int k = 1;k<=i;k++) {
			   System.out.print((char)(ch+count));
			   count--;
		   }
		   ch++;
		   
		   System.out.println();
		   }
	   }
	   /*
	    *       E
			   DE
			  CDE
			 BCDE
			ABCDE

	    */
	   public static void alpInvRDecLeftTriangle6(int n) {
		    for(int i = 1;i<=n;i++) {
		    	   int ch =  64 ; 
				   int count = 1;
			   for(int j = 1;j<=n-i;j++) {
				   System.out.print(" ");
				   count++;
				   }
			   for(int k = 1;k<=i;k++) {
				   System.out.print((char)(ch+count));
				   count++;
			   }
			   ch++;
			   
			   System.out.println();
			   }
		   }
//	   ###################################################################
	   
	   /*
	    *           a
				   bb
				  ccc
				 dddd
				eeeee

	    */
	   public static void alpSmlInvRTriangle1(int n) {
		   char ch =  'a';
		   for(int i = 1;i<=n;i++) {
		   for(int j = 1;j<=n-i;j++) {
			   System.out.print(" ");
			   }
		   for(int k = 1;k<=i;k++) {
			   System.out.print(ch);
		   }
		   ch++;
		   System.out.println();
		   }
		 
		   }
	   /*
	    *           e
				   dd
				  ccc
				 bbbb
				aaaaa
	    */
	   public static void alpSmlInvRInvTriangle2(int n) {
		   int ch =  'a' + n-1;
		   for(int i = 1;i<=n;i++) {
		   for(int j = 1;j<=n-i;j++) {
			   System.out.print(" ");
			   }
		   for(int k = 1;k<=i;k++) {
			   System.out.print((char)ch);
		   }
		   ch--;
		   System.out.println();
		   }
		 
		   }
	   /*
	    *               a
					   ab
					  abc
					 abcd
					abcde
						    */
	   public static void alpSmlInvRIncTriangle3(int n) {
		  
		   for(int i = 1;i<=n;i++) {
			   int ch =  96 ;
		   for(int j = 1;j<=n-i;j++) {
			   System.out.print(" ");
			   }
		   for(int k = 1;k<=i;k++) {
			   System.out.print((char)(ch+k));
		   }
		   ch++;
		   System.out.println();
		   }
		 
		   }
		   /*
		    *       e
				   ed
				  edc
				 edcb
				edcba
		 */
	   public static void alpSmlInvRDecTriangle4(int n) {
			  
		   for(int i = 1;i<=n;i++) {
			   int ch =  97+n; ;
		   for(int j = 1;j<=n-i;j++) {
			   System.out.print(" ");
			   }
		   for(int k = 1;k<=i;k++) {
			   System.out.print((char)(ch-k));
		   }
		   ch--;
		   System.out.println();
		   }
	   }
	   /*
	    *           a
				   ba
				  cba
				 dcba
				edcba
	    */
	   public static void alpSmlInvRIncLeftTriangle5(int n) {
	    for(int i = 1;i<=n;i++) {
	    	   int ch =  96 ; 
			   int count = n;
		   for(int j = 1;j<=n-i;j++) {
			   System.out.print(" ");
			   count--;
			   }
		   for(int k = 1;k<=i;k++) {
			   System.out.print((char)(ch+count));
			   count--;
		   }
		   ch++;
		   
		   System.out.println();
		   }
	   }
	   /*
	    *       e
			   de
			  cde
			 bcde
			abcde

	    */
	   public static void alpSmlInvRDecLeftTriangle6(int n) {
		    for(int i = 1;i<=n;i++) {
		    	   int ch =  96 ; 
				   int count = 1;
			   for(int j = 1;j<=n-i;j++) {
				   System.out.print(" ");
				   count++;
				   }
			   for(int k = 1;k<=i;k++) {
				   System.out.print((char)(ch+count));
				   count++;
			   }
			   ch++;
			   
			   System.out.println();
			   }
		   }
//	   public static void a(int n) {
//		   for(int i = 1;i<=n;i++) {
//			   for(int j = 1;j<=n;j++) {
//				   if(i == (n/2)+1 || j == (n/2)+1 ) 
//					   System.out.print("*");
//				   else if(i == 1 && j >=(n/2)+1)
//					   System.out.print("*");
//				   else
//					   System.out.print(" ");
//			   }
//			   System.out.println();
//		   }
//	   }

	   
	public static void main(String args[]) {
		int num = 5;
//		starTriangle1(num);
//		numTriangle2(num);
//		 invNumTriangle3( num);
//		 incNumTriangle4(num);
//		decNumTriangle5(num);
//		incDecNumTriangle6(num);
//		decDecNumTriangle7(num);
//	    ########################################	
		
//		alphabetTriangle1(num); 
//		invAlphabetTriangle2(num);
//		decAlphabetTriangle3_1( num);
//		decAlphabetTriangle3_2( num);
//		incAlphabetTriangle4(num);
//		incDecAlphabetTriangle5(num);
//		decDecAlphabetTriangle6(num);
//		########################################	
		
//		smlAlpTriangle1(num);
//		invSmlAlpTriangle2(num);
//		decSmlAlpTriangle3(num);
//		incSmlAlpTriangle4(num);
//		decDecSmlAlpTriangle5(num);
//		incDecSmlAlpTriangle6(num);
//		 #######################################
		 		 
//		starInvTriangle1(num);
//		numInvTriangle2(num) ;
//		invNumInvTriangle3(num);
//		incNumInvTriangle4(num);
//		 invNumInvDecTriangle5(num);
//		 invNumDecTriangle6(num);
//		incNumDecTriangle7(num);
//		############################################
		
//		invAlpInvTriangle1(num);
//		incAlpInvTriangle2(num);
//		invAlpInvDecTriangle3(num);
//		incAlpDecTriangle4(num);
//		incAlpIncDecTriangle5(num);
//		decAlpIncDecTriangle6(num);
//		##########################################
		
//		invSmlAlpInvTriangle1(num);
//		incSmlAlpInvTriangle2(num);
//		invSmlAlpInvDecTriangle3(num);
//		incSmlAlpDecTriangle4(num);
//		incSmlAlpIncDecTriangle5(num);
//		decSmlAlpIncDecTriangle6(num);
//		#############################################
		
//		starInvRTriangle1(num);
//		numInvRTriangle2(num);
//		numInvRInvTriangle3(num);
//		numInvIncRTriangle4(num) ;
//		numInvDecRTriangle5(num); 
//		numIncRTriangle6(num);
//		numIncRTriangle7(num);
//		##########################################
		
//		alpInvRTriangle1(num);
//		alpInvRInvTriangle2(num);
//		alpInvRIncTriangle3(num); 
//		alpInvRDecTriangle4(num);
//		alpInvRIncLeftTriangle5(num);
//		alpInvRDecLeftTriangle6(num); 
//		##############################################
		
		alpSmlInvRTriangle1(num);
		alpSmlInvRInvTriangle2(num);
		alpSmlInvRIncTriangle3(num); 
		alpSmlInvRDecTriangle4(num);
		alpSmlInvRIncLeftTriangle5(num);
		alpSmlInvRDecLeftTriangle6(num); 
	}

}
