package com.zlm.vo;
import com.zlm.common.type.RType;
import lombok.Data;

@Data
public class R<T> {
    private int code;
    private String msg;
    private T data;

    public static <T>  R getR(int code, String msg, T data){
        R<T> tr = new R<T>();
        tr.setCode(code);
        tr.setData(data);
        tr.setMsg(msg);
        return tr;
    }

    public static R ok(){return getR(RType.成功,"ok",null);}
    public static<T> R ok(T t){return getR(RType.成功,"ok",t);}
    public static R fail(){return getR(RType.失败,"fail",null);}
}
