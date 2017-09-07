package jrtt;

import java.util.Scanner;

/**
 * Created by locan on 17/4/18.
 */
public class Main {

    public static void main(String[] args) {
        char[][][] a = new char[10][][];
        a[0] = new char[][]{{'*','*','*'},
                            {'*',' ','*'},
                            {'*',' ','*'},
                            {'*',' ','*'},
                            {'*','*','*'}};

        a[1] = new char[][]{{'*'},
                            {'*'},
                            {'*'},
                            {'*'},
                            {'*'}};

        a[2] = new char[][]{{'*','*','*'},
                            {' ',' ','*'},
                            {'*','*','*'},
                            {'*',' ',' '},
                            {'*','*','*'}};

        a[3] = new char[][]{{'*','*','*'},
                            {' ',' ','*'},
                            {'*','*','*'},
                            {' ',' ','*'},
                            {'*','*','*'}};

        a[4] = new char[][]{{'*',' ','*'},
                            {'*',' ','*'},
                            {'*','*','*'},
                            {' ',' ','*'},
                            {' ',' ','*'}};

        a[5] = new char[][]{{'*','*','*'},
                            {'*',' ',' '},
                            {'*','*','*'},
                            {' ',' ','*'},
                            {'*','*','*'}};

        a[6] = new char[][]{{'*','*','*'},
                            {'*',' ',' '},
                            {'*','*','*'},
                            {'*',' ','*'},
                            {'*','*','*'}};

        a[7] = new char[][]{{'*','*','*'},
                            {' ',' ','*'},
                            {' ',' ','*'},
                            {' ',' ','*'},
                            {' ',' ','*'}};

        a[8] = new char[][]{{'*','*','*'},
                            {'*',' ','*'},
                            {'*','*','*'},
                            {'*',' ','*'},
                            {'*','*','*'}};

        a[9] = new char[][]{
                {'*','*','*'},
                {'*',' ','*'},
                {'*','*','*'},
                {' ',' ','*'},
                {' ',' ','*'}
        };
        char[][] add = new char[][]{
                {' ',' ',' '},
                {' ','*',' '},
                {'*','*','*'},
                {' ','*',' '},
                {' ',' ',' '}
        };
        char[][] jian = new char[][]{
                {' ',' ',' '},
                {' ',' ',' '},
                {'*','*','*'},
                {' ',' ',' '},
                {' ',' ',' '}
        };
        char[][] cheng = new char[][]{
                {' ',' ',' '},
                {'*','*','*'},
                {' ','*',' '},
                {'*','*','*'},
                {' ',' ',' '}
        };
        char[][] chu = new char[][]{
                {' ',' ',' '},
                {' ',' ','*'},
                {' ','*',' '},
                {'*',' ',' '},
                {' ',' ',' '}
        };

        char[][] deng = new char[][]{
                {' ',' ',' '},
                {'*','*','*'},
                {' ',' ',' '},
                {'*','*','*'},
                {' ',' ',' '}
        };
        char[][] dian = new char[][]{
                {' ',' ',' '},
                {' ',' ',' '},
                {' ','*','*'},
                {' ','*','*'},
                {' ',' ',' '}
        };
        char[][] kong = new char[][]{{' '},
                {' '},
                {' '},
                {' '},
                {' '}};


        Scanner scanner = new Scanner(System.in);
        Integer aa = scanner.nextInt();
        String oper = scanner.next();
        Integer bb = scanner.nextInt();
        char[][] rea,reb,reoper,result;

        int awidth = 0,ahight = 5,bwidth = 0,bhigjt = 5;
        awidth+=width(aa,a);
        awidth+=width(bb,a);
        awidth+=8;






    }

    public static void write(char[][] a,char[][] b,int begin){
        int w = b[0].length;
        for(int i=0;i<5;i++){
            for(int j=begin;j<w+begin;j++){
                a[i][j] = b[i][j-begin];
            }
        }
        for(int i = 0;i<5;i++)
            a[i][w+begin] = ' ';
    }
    public static void print(char[][] a){
        int h = a.length;
        int w = a[0].length;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    public static int width(int a,char[][][] shu){
        String as = String.valueOf(a);
        int width =0;
        for(int i = 0;i<as.length();i++){
            if(i==0&&as.charAt(i)=='-'){
                width+=4;
                continue;
            }
            int index = Integer.valueOf(String.valueOf(as.charAt(i)));

            width+=shu[index][0].length;
            width++;

        }
        return width;
    }

    public static char[][] num2Array(int a,char[][][] shu,char[][] fu,char[][] kong){
        char[][] res;
        int w = width(a,shu);
        res = new char[5][w];
        if(a<0){
            write(res,fu,0);
            write(res,kong,3);
            a = -a;

        }else{

        }
        return null;
    }

    public static char[][] operation(int a,int b,String oper,char[][][] shu){
        if(oper.equals("+")){
            int res = a+b;
            return null;
        }else if(oper.equals("-")){

        }else if(oper.equals("*")){

        }else if(oper.equals("/")){

        }
        return null;
    }

}
