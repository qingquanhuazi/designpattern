package cn.arthur.design.flyweight.ticket;

import lombok.Data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/5/1 0001 16:00
 */
@Data
public class TicketFactory {
    private static Map<String, ITicket> pool = new ConcurrentHashMap<>();

    public static ITicket queryTicket(String from, String to) {
        String key=from+"->"+to;
        if(pool.containsKey(key)){
            System.out.println("使用缓存"+key);
            return pool.get(key);
        }
        ITicket iTicket=new TrainTicket(from,to);
        pool.put(key,iTicket);
        System.out.println("第一次查询"+key);
        return iTicket;
    }
}
