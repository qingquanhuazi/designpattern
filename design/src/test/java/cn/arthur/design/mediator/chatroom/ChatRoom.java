package cn.arthur.design.mediator.chatroom;

/**
 * Created by arthur.
 */
public class ChatRoom {

    public void showMsg(User user,String msg){
        System.out.println("[" + user.getName() + "] : " + msg);
    }
}
