package com.testerhome.appcrawler.ut;

import com.testerhome.appcrawler.AppCrawler;
import org.junit.Test;

import java.util.Date;

public class BackBtnXpathTest {
    @Test
    public void testCase2(){
        AppCrawler.main(new String[]{
                "--capability",
                "appPackage=com.xueqiu.android," +
                        "appActivity=.view.WelcomeActivityAlias," +
                        "noReset=false," +
                        "automationName=uiautomator2," +
                        "autoGrantPermissions=true," +
                        "ignoreUnimportantViews=true," +
                        "disableAndroidWatchers=true",
                "-o",
                "/temp/xueqiu/ut/backBtnXpath/" + new java.text.SimpleDateFormat("YYYYMMddHHmmss").format(new Date().getTime()),
                "-c",
                "src/test/java/com/testerhome/appcrawler/it/xueqiu_conf.yml"
        });
    }
}
