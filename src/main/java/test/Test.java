package test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * @author torchstar
 * @date 2022年06月05日 1:28
 */
public class Test {
    public static void main(String[] args) {

        try {
            Document post = Jsoup.connect("https://www.zhipin.com/xian/?ka=header-home").get();
            System.out.println(post.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
