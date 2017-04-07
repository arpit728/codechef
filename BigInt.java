package problems.codechef;

import academics.SC_Experiment_6;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Scanner;

/**
 * Created by arpit on 22/12/16.
 */

public class BigInt {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException, InterruptedException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char[]s=new char[50];
        int t=Integer.parseInt(br.readLine());
        while (t-->0){
            br.read(s);
            System.out.println(Arrays.toString(s));
        }

    }
    public int rangeBitwiseAnd(int M, int N) {
        if(M == 0){
            return 0;
        }
        int step = 1;
        while(M != N){
            M >>= 1;
            N >>= 1;
            step <<= 1;
        }
        return M * step;
    }

}
/*
10
10
01
0101010
101010
1001
11
0
1
11000001
1100
1000*/
