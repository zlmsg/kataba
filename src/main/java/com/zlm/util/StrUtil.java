package com.zlm.util;

public class StrUtil {
    public boolean checkNoEmpty(String... strings){
        Boolean r = true;
        for (String string : strings) {
            if(string==null||string.length()==0){
                r=false;
                break;
            }
        }
        return r;
    }
}
