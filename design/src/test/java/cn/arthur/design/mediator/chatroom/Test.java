package cn.arthur.design.mediator.chatroom;

/**
 * Created by arthur.
 */
public class Test {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User arthur = new User("arthur",chatRoom);
        User jerry = new User("Jerry",chatRoom);

        arthur.sendMessage("Hi! I am arthur.");
        jerry.sendMessage("Hello! My name is Jerry.");
    }
}
