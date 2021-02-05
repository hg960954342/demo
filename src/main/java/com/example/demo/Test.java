package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
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

        List<String> list=new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");
        for (String i : list) {
//            System.out.println(date()+"   "+i+"\n");
        }

        HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");  // 重复的元素不会被添加
        System.out.print(date()+"   "+sites+"\n"+"\n");
    }

    public String date(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return String.valueOf(df.format(new Date()));
    }


}





