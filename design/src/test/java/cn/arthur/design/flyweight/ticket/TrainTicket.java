package cn.arthur.design.flyweight.ticket;

import lombok.Data;

import java.util.Random;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/5/1 0001 15:57
 */
@Data
public class TrainTicket implements ITicket {
    private String from;
    private String to;
    private Integer price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showInfo(String bunk) {
        this.price=new Random().nextInt(500);
        System.out.println(from + "->" + to + ":" + bunk + "价格:" + this.price);
    }
}
