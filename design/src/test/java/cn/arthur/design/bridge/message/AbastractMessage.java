package cn.arthur.design.bridge.message;

/**
 * Created by arthur.
 */
public abstract class AbastractMessage {
    private IMessage message;

    public AbastractMessage(IMessage message) {
        this.message = message;
    }
    void sendMessage(String message,String toUser){
        this.message.send(message,toUser);
    }
}
