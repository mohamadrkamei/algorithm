package validSubSequence;

import javax.naming.PartialResultException;

public class SubSequence {

    public static void main(String[] args ){
        int [] arrry = {1,22,17,66,999,897};
        int[] sub = {22,66,890};
       System.out.print(isSubSequence(arrry,sub));

    }


    public static boolean isSubSequence(int[] array , int[] subsequence){
        int arrayindx= 0;
        int subsequnceindx = 0;

       while (arrayindx < array.length && subsequnceindx < subsequence.length) {

           if(array[arrayindx] == subsequence[subsequnceindx])
           {
               subsequnceindx +=1;
           }
           arrayindx += 1 ;

       }

       return subsequnceindx == subsequence.length;
    }
}
