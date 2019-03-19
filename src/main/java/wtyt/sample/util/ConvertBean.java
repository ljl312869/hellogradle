package wtyt.sample.util;

import wtyt.sample.util.base.BaseException;
import org.apache.commons.lang.StringUtils;


public class ConvertBean {
    public static String transJsonValueNotNull(String key, org.json.JSONObject js) throws Exception{
        if(!js.has(key)){
            throw new BaseException(key+" 栏位不存在！");
        }
        String value=js.getString(key).trim();
        if(StringUtils.isBlank(value)){
            throw new BaseException(key+" 栏位值为空！");
        }
        return value;
    }

    public static String transJsonValueNotNull(String key, com.alibaba.fastjson.JSONObject js) throws Exception {
        if (!js.containsKey(key)) {
            throw new BaseException(key + " 栏位不存在！");
        }
        String value = js.getString(key).trim();
        if (StringUtils.isBlank(value)) {
            throw new BaseException(key + " 栏位值为空！");
        }
        return value;
    }

    public static String transJsonValue(String key, org.json.JSONObject js) throws Exception{
        if(!js.has(key)){
            return "";
        }else{
            return js.getString(key).trim();
        }
    }

    public static String transJsonValue(String key, com.alibaba.fastjson.JSONObject js) throws Exception {
        if (!js.containsKey(key)) {
           return "";
        }else{
            return js.getString(key).trim();
        }
    }

}
