package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

@Component
@Slf4j
public class Test {
    @PostConstruct
    @Scheduled(cron = "0/2 * * * * ?")
    public void test(){
        double x = 20001.2f;
        double y = 13000f;
        double z = x-y;

        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");
        list.add("HAHAHAHA");
        for (String i : list) {
            System.out.println(date()+"   "+i+"\n");
        }

        HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");  // 重复的元素不会被添加
        System.out.print(date()+"   "+list+"\n"+"\n");

//        System.out.println(Double.parseDouble("1123334.7")+"\n");


        // 统计次数
        int count, m, j = 0;
        for (int i = 4; i < 10000; i += 4) {
            count = 0;
            m = i;
            for (int k = 0; k < 5; k++) {
                j = i / 4 * 5 + 1;
                i = j;
                if (j % 4 == 0) {
                    count++;
                } else
                    break;
            }
            i = m;
            if (count == 4) {
                System.out.println("原有桃子" + j + "个");
            }
        }

        File f1 = new File("C:\\Windows");
        File f2 = new File("C:\\Windows\\notepad.exe");
        File f3 = new File("C:\\Windows\\nothing");
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.isDirectory());
        System.out.println(f3.isFile());
        System.out.println(f3.isDirectory());
    }






    public String date(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return String.valueOf(df.format(new Date()));
    }


}



