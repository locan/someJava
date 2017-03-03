package leetcode.q126;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by luan on 2017/2/28.
 */
public class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new ArrayList<>();
        List<String> firstList = new ArrayList<>();
        firstList.add(beginWord);
        result.add(firstList);
        List<String> secondLevelItem = getSelectedList(wordList,beginWord);



        return result;
    }

    public void dowork(List<String> nextLevelItems,List<List<String>> result){

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

    }
}
