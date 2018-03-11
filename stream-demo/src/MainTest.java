import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Kyle.Wang
 * 2018/1/29 0029 9:31
 */
public class MainTest {

    private ArrayList<Artist> artists = null;
    private long count = 0;

    {
        artists = new ArrayList<>();
        artists.add(new Artist("达芬奇", "意大利"));
        artists.add(new Artist("拉斐尔", "意大利"));
        artists.add(new Artist("米开朗基罗", "意大利"));
        artists.add(new Artist("米勒", "英国"));
        artists.add(new Artist("梵高", "法国"));
        artists.add(new Artist("齐白石", "中国"));
        artists.add(new Artist("莫奈", "法国"));
        artists.add(new Artist("毕加索", "西班牙"));
        artists.add(new Artist("列宾", "俄罗斯"));

    }


    @Test
    public void test1() {
        for (Artist artist : artists) {
            if (artist.getCountry().equals("意大利")) {
                count++;
            }
        }
        System.out.println(count);
    }


    /**
     * 筛选filter
     */
    @Test
    public void test2(){
        count = artists.stream().filter(artist -> artist.getCountry().equals("意大利")).count();
        System.out.println(count);
    }

    /**
     * collect(Collectors.toList()):流再转化成为集合，是一个及早求值的操作
     */
    @Test
    public void test3(){
        List result = artists.stream()
                .filter(artist -> artist.getCountry().equals("意大利"))
                .collect(Collectors.toList());
        System.out.println(result);
    }

    /**
     * 截取limit 截取流的前N个元素
     */
    @Test
    public void test4(){
        List result = artists.stream()
                .filter(artist -> artist.getCountry().equals("意大利"))
                .limit(1)
                .collect(Collectors.toList());
        System.out.println(result);
    }

    /**
     * 映射map 将一个流中的值转换成一个新的流
     */
    @Test
    public void test5(){
        List result = artists.stream()
                .filter(artist -> artist.getCountry().equals("意大利"))
                .map(artist -> artist.getName())
                .collect(Collectors.toList());
        System.out.println(result);
    }

    /**
     * flatMap 合并流
     */
    @Test
    public void test6(){
        List result = Stream.of(Arrays.asList(1,2,3),Arrays.asList(4,5,6))
                .flatMap(i->i.stream())
                .collect(Collectors.toList());
        System.out.println(result);
    }

    /**
     * 归约reduce
     */
    @Test
    public void test7(){
        int count = Stream.of(1,2,3).reduce(0,(acc,element) -> acc + element);
        System.out.println(count);
    }

    public void test8(){
        
    }

}
