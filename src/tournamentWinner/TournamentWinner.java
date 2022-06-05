package tournamentWinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {

    public static void main(String[] args){

        ArrayList<ArrayList<String>> competiotions = new ArrayList<>();
        ArrayList<String> lan1 = new ArrayList<String>();
        ArrayList<String> lan2= new ArrayList<String>();
        ArrayList<String> lan3 = new ArrayList<String>();
        lan1.add("html");
        lan1.add("c#");
        competiotions.add(lan1);
        lan2.add("python");
        lan2.add("c#");
        competiotions.add(lan2);
        lan3.add("python");
        lan3.add("html#");
        competiotions.add(lan3);
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(0);
        result.add(1);
        System.out.print(tournametWinn(competiotions,result));

    }

    public static String tournametWinn(ArrayList<ArrayList<String>> competitions , ArrayList<Integer> result) {

        String courentBestTeam = "";

        Map<String , Integer> source = new HashMap<>();
        source.put(courentBestTeam,0 );
       for(int i = 0; i<competitions.size(); i++) {

           String winner = result.get(i) == 0 ? competitions.get(i).get(1): competitions.get(i).get(0);
          if (source.containsKey(winner)){
             int updateSource =  source.get(winner) + 3;
             source.put(winner , updateSource);
          }

          if (!source.containsKey(winner)){

              source.put(winner,3);
          }
          if (source.get(winner)> source.get(courentBestTeam)){

              courentBestTeam = winner;
          }
        }

        return courentBestTeam;
    }
}
