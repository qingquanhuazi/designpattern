package cn.arthur.design.flyweight.ticket;

import org.junit.Test;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/5/1 0001 16:04
 */
public class FlyweightTest {
    @Test
    public void ticket(){
        ITicket iTicket = TicketFactory.queryTicket("杭州", "长沙");
        iTicket.showInfo("硬座");
        ITicket iTicket1 = TicketFactory.queryTicket("杭州", "北京");
        iTicket1.showInfo("软卧");
        ITicket iTicket2 = TicketFactory.queryTicket("杭州", "长沙");
        iTicket2.showInfo("硬卧");
    }
}
