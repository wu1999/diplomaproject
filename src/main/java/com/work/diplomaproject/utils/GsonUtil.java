package com.work.diplomaproject.utils;

import com.google.gson.Gson;

public class GsonUtil {
    public static String getJson(Object obj){
       return new Gson().toJson(obj);
    }
}
