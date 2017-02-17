package problems.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by arpit on 17/1/16.
 */
public class Experiment {




    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t,p1,p2,z,oMRO,nMRO;
        long psel;
        HashMap<Long,String> map=new HashMap<>();
        HashMap<String,String>closedMro=new HashMap<>();
        String[]s;
        t=Integer.parseInt(br.readLine());
        while (t-->0){

            p1=Integer.parseInt(br.readLine());
            for (int i = 0; i < p1; i++) {

                s=br.readLine().split("\\s");
                map.put(Long.parseLong(s[0]),s[1]);

            }
            z=Integer.parseInt(br.readLine());

            for (int i = 0; i < z; i++) {
                s=br.readLine().split("\\s");
                closedMro.put(s[0],s[1]);
            }
            p2=Integer.parseInt(br.readLine());
            for (int i = 0; i < p2; i++) {
                psel=Long.parseLong(br.readLine());
                String s1=map.get(psel);
                if (!closedMro.containsKey(s1))
                    System.out.println(psel+" "+s1);

                else  System.out.println(psel+" "+closedMro.get(map.get(psel)));
            }
            map.clear();
            closedMro.clear();
            System.out.println();
        }
    }


}
