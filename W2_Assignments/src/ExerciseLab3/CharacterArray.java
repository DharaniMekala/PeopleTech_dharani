//Exercise 4:- Create a method that accepts a character array and count the number of times each character is present in array.
package ExerciseLab3;
public class CharacterArray {
public static void main(String[] args) { 
char ch[] = {'d','h','a','r','a','n','i'}; 
int a[] = new int[26]; 
for (int i=0; i<ch.length; i++) { 
a[ch[i]-97]+=1; 
} 
for (int i=0; i<a.length; i++) { 
if(a[i] >=  1) { 
	System.out.println((char)(i+97)+" = "+a[i]); 

}
} 
}
}

  
