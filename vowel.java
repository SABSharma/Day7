class vowel{
   public static void main(String[] args) {
   	    String s= "abhishek sharma abvgiet";
   	    int count =0;
   	    for(int i=0; i<s.length(); i++){
   	    if(s.charAt(i)=='i' || s.charAt(i)== 'o' || s.charAt(i)== 'a' ||s.charAt(i)=='e' ||s.charAt(i)=='s'){
   	    	count ++;
   	    }
   	}
   	    System.out.println("number of vowes in th given string is :" + count);
   }
}