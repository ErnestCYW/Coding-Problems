import java.util.*;

public class Spelling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numOfCases = Integer.parseInt(sc.nextLine());
        
        //Code out dictionary using HashMap
        HashMap<Character,String> dictionary = new HashMap<>();
        dictionary.put('a',"2");
        dictionary.put('b',"22");
        dictionary.put('c',"222");
        dictionary.put('d',"3");
        dictionary.put('e',"33");
        dictionary.put('f',"333");
        dictionary.put('g',"4");
        dictionary.put('h',"44");
        dictionary.put('i',"444");
        dictionary.put('j',"5");
        dictionary.put('k',"55");
        dictionary.put('l',"555");
        dictionary.put('m',"6");
        dictionary.put('n',"66");
        dictionary.put('o',"666");
        dictionary.put('p',"7");
        dictionary.put('q',"77");
        dictionary.put('r',"777");
        dictionary.put('s',"7777");
        dictionary.put('t',"8");
        dictionary.put('u',"88");
        dictionary.put('v',"888");
        dictionary.put('w',"9");
        dictionary.put('x',"99");
        dictionary.put('y',"999");
        dictionary.put('z',"9999");
        dictionary.put(' ',"0");

        int count = 1;
        while (count <= numOfCases) {   //iterate through string
            String toReturn = "Case #" + count + ": ";
            char[] toConvert = sc.nextLine().toCharArray(); //assign given string to charArray
            int previousGroup = 0;  //initialise previousGroup which is the number group
            for (int i = 0; i < toConvert.length; i++) {    //iterate through charArray
                String temp = dictionary.get(toConvert[i]); //get dictionary value
                if (Character.getNumericValue(temp.charAt(0)) == previousGroup ) { //if same group as previous add space
                    toReturn += " " + temp;
                } else {
                    toReturn += temp;
                }
                previousGroup = Character.getNumericValue(temp.charAt(0)); //assign new previous group
            }
            System.out.println(toReturn);
            count++;
        }

    }
    
}
