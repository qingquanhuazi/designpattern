package cn.arthur.design.bridge.message;

/**
 * Created by arthur.
 */
public interface IMessage {
    //发送消息的内容和接收人
    void send(String message,String toUser);
}
