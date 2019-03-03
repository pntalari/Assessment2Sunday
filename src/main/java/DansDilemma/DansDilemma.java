package DansDilemma;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        return dilemmaOfN(input1,input2);
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {

        return dilemmaOfN(input1,input2,input3);
    }

    public Integer dilemmaOfN(Double... args){
        Set<Double> track = new HashSet<Double>();

        for(int i =1;i<args.length;i++){
            for(int j = 0;j<i;j++){
                Set<Double> temp = dilemmaHelper(args[i],args[j]);
                track = merge(track,temp);
            }
        }

        return track.size();
    }


   public Set<Double> dilemmaHelper(Double input1,Double input2){
       Set<Double> track = new HashSet<Double>();
       track.add(input1+input2);
       track.add(input1-input2);
       track.add(input1*input2);
       if(input2!=0){
           track.add(input1/input2);
       }
       track.add(input2+input1);
       track.add(input2-input1);
       track.add(input2*input1);
       if(input1!=0){
           track.add(input2/input1);
       }

       return track;
   }

    private Set<Double> merge(Set<Double> set1, Set<Double> set2) {
        Set<Double> result = set1;
        for(Double d : set2){
            result.add(d);
        }
        return result;
    }
}
