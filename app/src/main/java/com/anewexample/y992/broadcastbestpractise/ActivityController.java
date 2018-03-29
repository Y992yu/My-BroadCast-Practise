package com.anewexample.y992.broadcastbestpractise;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by y992 on 2018/3/28.
 * 用于管理所有活动
 */

public class ActivityController {
    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity)
    {
        activities.add(activity);
    }

    public  static void removeActivity(Activity activity)
    {
        activities.remove(activity);
    }
    public static void finishAll(){
        for (Activity activity : activities){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
        activities.clear();
    }
}
