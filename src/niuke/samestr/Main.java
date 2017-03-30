package niuke.samestr;

import java.util.Scanner;

/**
 * Created by luan on 2017/3/23.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n<1||n>50)
            return;
        String[] strings = new String[n];
        for(int i=0;i<n;i++){
            strings[i] = scanner.next();
        }
        if(n==1){
            System.out.println(1);
            return;
        }
        int gn=n;
        for(int i=0;i<n;i++){
            if(strings[i].equals("!~!"))
                continue;
            for(int j=i+1;j<n;j++){
                if(strings[j].equals("!~!"))
                    continue;
                if(isSame(strings[i],strings[j])){
                    strings[j]="!~!";
                    gn--;
                }
            }
        }

        System.out.println(gn);

    }

    public static boolean isSame(String a,String b){
        if(a.length()!=b.length())
            return false;
        int[] aa = new int[256];
        int[] bb = new int[256];
        for(char c:a.toCharArray()){
            aa[c]++;
        }
        for(char c:b.toCharArray()){
            bb[c]++;
        }
        for(int i=0;i<256;i++){
            if(aa[i]!=bb[i]){
                return false;
            }
        }
        return true;

    }
}
