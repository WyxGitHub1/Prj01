import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class CountWords {
    public static HashMap<String, Integer> hashMap = new HashMap<>();
    public void saveWords(String s) {
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 32){  //判断是否为空格
                if(hashMap.containsKey(word)){ //判断是否存在
                    int value = hashMap.get(word);
                    hashMap.remove(word);
                    hashMap.put(word,value + 1);
                }
                else{
                    hashMap.put(word,1);
                }
//                System.out.print(word + " ");
                word = "";
            }
            else{
                if(Character.isLetter(c)){  //判断是否为字母
                    word += String.valueOf(c);
                }
            }
        }
//        System.out.println();
    }

    public void choseTen(){
        Collection<Integer> values = hashMap.values();
        Set<String> key = hashMap.keySet();
        int[] a = new int[values.size()];
        int n = 0;
        for (Integer value : values) {
            a[n++] = value;
        }
        Arrays.sort(a);
        int m = 0,count = 0;
        int[] b = new int[values.size()];
        for (int i = 0; i < a.length; i++) {
            if(i == 0 || a[i] != a[i - 1]){
                b[m++] = a[i];
            }
        }
        Arrays.sort(b,0,m);
        for(int i = n - 1; i >= m - 10;i --){
            for(String s : key){
                if(b[i] == hashMap.get(s)){
                    ++count;
                    System.out.println(s + " ");
                }
                if(count == 10) break;;
            }
            if (count == 10) break;
        }
    }

    public static void main(String[] args) {
        CountWords ctw = new CountWords();
        BufferedReader reader = null;
        long l = System.currentTimeMillis();
        try {
            reader = new BufferedReader(new FileReader("G://a.txt"));
            String s = reader.readLine();
            while (s != null) {
//                System.out.println(s);
                ctw.saveWords(s);
                s = reader.readLine();
            }
            ctw.choseTen();
        } catch (Exception e) {

        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long l1 = System.currentTimeMillis();
        System.out.println("花费的时间为:" + (l1 - l) + "毫秒");
    }
}
