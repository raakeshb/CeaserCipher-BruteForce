public class Main
{
public static void main(String[] args) {
String word = "YJQQ RJ FSI N KTWLJY YJFHM RJ FSI N WJRJRGJW NSATQAJ RJ FSI N QJFWS";// decrypted text
String[] k = word.split(" ",0); //splitting text based by the spaces
            for(int p=1;p<=26;p++) // for loop p loops for 26 as there are 26 characters in alphabets.
                {  System.out.println("Key :"+p); // Key will be printed
                        for(int i=0;i<k.length;i++) // for loop i loops for length of the splitted string available i.e after eliminating spaces
                { 
                                for(int j=0;j<k[i].length();j++) // for loop j loops for length of the string eg: FSI so its 3.
                                    { char singlechar = k[i].charAt(j); // converting single string to char
                                        int chartoascii = singlechar - p;
                                        int sin = singlechar;
                                            if(chartoascii <65)  // if char after adding key goes below letter "A" . it will start with Z
                                            {   int diff = ((sin - 65)-p)*-1;// diff gives the diff between the A to current char. Eg: if current char is B and calculations will be 66-65 I.E B-A which gives shifted element
                                                chartoascii = 91-diff;// Calculations for hopping to required char
                                            }
                                        char newchar = (char)chartoascii;
                        System.out.print(newchar);
                        }
                    System.out.print(" ");
                }
                System.out.println();
        System.out.println();
        }
    }   
}
