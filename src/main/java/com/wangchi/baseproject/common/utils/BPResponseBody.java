package com.wangchi.baseproject.common.utils;



import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpStatus;

public class BPResponseBody extends HashMap<String,Object> {

    private static final long serialVersionUID = 1L;
    // 默认构造方法，填写默认值
    public BPResponseBody(){
        put("code",0);
        put("msg","success");
    }

    // 调用父类的put方法，放入数据。避免再写
    public BPResponseBody put(String key, Object value){
        super.put(key,value);
        return this;
    }

    // 成功方法
    public static BPResponseBody ok(){
        BPResponseBody r = new BPResponseBody();
        return r;
    }
    public static BPResponseBody ok(Map<String,Object> map){
        BPResponseBody r = new BPResponseBody();
        r.putAll(map);
        return r;
    }
    public static BPResponseBody ok(String msg){
        BPResponseBody r = new BPResponseBody();
        r.put("msg",msg);
        return r;
    }
    // 失败方法
    public static BPResponseBody error(){
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR,"未知异常，请联系管理员");
    }
    public static BPResponseBody error(String msg){
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR,msg);
    }
    public static BPResponseBody error(int code, String msg){
        BPResponseBody r = new BPResponseBody();
        r.put("code",code);
        r.put("msg", msg);
        return r;
    }
}
