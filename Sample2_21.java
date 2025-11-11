package CH2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class Sample2_21 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.println("請輸入5個人的分數");
        Integer test[] = new Integer[5]; // 使用 Integer (物件) 陣列

        // 依序讀入數字
        for (int i=0; i<test.length; i++)
        {
            String str = br.readLine();
            test[i] = Integer.parseInt(str);
        }

        // 使用 Collections.reverseOrder() 進行降序排列 (必須使用物件陣列)
        Arrays.sort(test, Collections.reverseOrder()); 

        // 輸出結果
        for (int i=0; i<test.length; i++)
        {
            System.out.println("第" + (i+1) + "名的分數是" + test[i]);
        }
    }
}