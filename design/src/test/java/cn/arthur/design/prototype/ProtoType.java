package cn.arthur.design.prototype;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * 功能描述：
 *  JSON实现深克隆
 * @author : arthur
 * @date : 2021/5/1 0001 0:15
 */
@Data
public class ProtoType {
    private String name;
    public ProtoType jsonClone() {
        ProtoType protoType=this;
        return JSON.toJavaObject((JSON) JSONObject.toJSON(protoType),
                ProtoType.class);
    }
}
