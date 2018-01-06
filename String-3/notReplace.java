public String notReplace(String str) {
 final String IS_NOT = "is not";
 int n = str.length();
 if(n<=2){
   if(str.equals("is")){
     return IS_NOT;
   }
   else return str;
 }
 StringBuilder sb = new StringBuilder();
 int i = 0;
 for(;i<n-2;){
   if(i==0 && str.substring(0,2).equals("is") && !Character.isLetter(str.charAt(i+2))){
     sb.append(IS_NOT);
     i+=2;
   }else{
     char c = str.charAt(i);
     if (!Character.isLetter(c) && str.substring(i+1, i+3).equals("is")){
       if(i!=n-3 && Character.isLetter(str.charAt(i+3))){
         sb.append(str.substring(i,i+3));
       }else{
         sb.append(c+IS_NOT);
       }
       i+=3;
       
     } else {
       sb.append(c);
       i+=1;
     }
   }
 }
 sb.append(str.substring(i,n));
 return sb.toString();
}
