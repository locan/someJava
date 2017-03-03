package leetcode.q127;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by luan on 2017/2/28.
 */
public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int length = 1;

        List<String> nextlist = getSelectedList(wordList,beginWord);
        if (nextlist.size()==0)
            return 0;
        while(wordList.size()>0&&!nextlist.contains(endWord)){


            nextlist = dowork(nextlist,wordList,length++);


        }
        if(!nextlist.contains(endWord))
            return 0;
        length++;
        return length;

    }

    public List<String> dowork(List<String> list,List<String> all,int length){
        length++;
        List<String> nextlist = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            List<String> slist = getSelectedList(all,list.get(i));
            nextlist.addAll(slist);
        }
        return nextlist;
    }

    public List<String> getSelectedList(List<String> all,String begin){
        List<String> selectedStrings = new ArrayList<>();
        Iterator iter = all.iterator();
        while(iter.hasNext()){
            String current = (String)iter.next();
            Integer i = diff(current,begin);
            if(i==1){
               selectedStrings.add(current);
               iter.remove();
            }
        }
        return selectedStrings;
    }

    public Integer diff(String a,String b){
        Integer size = 0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                size++;
            }
        }
        return size;
    }

    public static void main(String[] args) {
         List<String> list = Arrays.asList("hot","dot","dog","lot","log","cog");
         ArrayList<String> list1 = new ArrayList<>(list);
        Solution solution = new Solution();
        Integer length = solution.ladderLength("hit","cog",list1);
        System.out.println(length);
        //测试好不好用
    }
}
