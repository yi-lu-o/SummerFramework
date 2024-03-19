package com.yilu;

import com.summer.SummerApplicationContext;
import com.yilu.service.*;

public class Test {
    public static void main(String[] args) {
        SummerApplicationContext applicationContext = new SummerApplicationContext(AppConfig.class);
        Object userService = applicationContext.getBean("orderService");
    }
}
