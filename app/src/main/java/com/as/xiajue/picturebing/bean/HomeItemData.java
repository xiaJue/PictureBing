package com.as.xiajue.picturebing.bean;

import com.as.xiajue.picturebing.Const;

import java.util.List;

/**
 * Created by Moing_Admin on 2017/7/30.
 */

public class HomeItemData {

       /**
        * 标题=copyright
        * 时间=enddate
        * 图片网络路径=url//相对路径,需要加上域名：https://bing.ioliu.cn/
        */
       private String url;
       private String copyright;
       private String enddate;
       public String rootUrl = Const.BASE_URL;

       public HomeItemData(String url, String copyright, String enddate) {
           this.url = url;
           this.copyright = copyright;
           this.enddate = enddate;
       }

       public HomeItemData() {
       }
       public void setUrl(String url) {
           this.url = url;
       }

       public void setCopyright(String copyright) {
           this.copyright = copyright;
       }

       public void setEnddate(String enddate) {
           this.enddate = enddate;
       }

       /**
        * 获得完整的url路径
        *
        * @return
        */
       public String getUrl() {
           return url;
       }

       public String getAbsUrl() {
           return rootUrl + url;
       }

       public String getCopyright() {
           return copyright;
       }

       public String getEnddate() {
           return enddate;
       }

       /**
        * 通过URL比较两个模型是否相同
        *
        * @param obj
        * @return
        */
       @Override
       public boolean equals(Object obj) {
           HomeItemData data = (HomeItemData) obj;
           return data.getUrl().equals(this.getUrl());
       }

       /**
        * 列表中是否存在该模型对象
        *
        * @param list
        * @param itemData
        * @return
        */
       public static boolean listContains(List<HomeItemData> list, HomeItemData itemData) {
           for (HomeItemData data :
                   list) {
               if (data.getUrl().equals(itemData.getUrl())) {
                   return true;
               }
           }
           return false;
       }

       /**
        * 格式化日期
        *
        * @param dateStr
        * @return String
        */
       public static String getFormatDate(String dateStr) {
           String yy = dateStr.substring(0, 4);
           String MM = dateStr.substring(4, 6);
           String dd = dateStr.substring(6, 8);
           return yy + "-" + MM + "-" + dd;
       }
}
