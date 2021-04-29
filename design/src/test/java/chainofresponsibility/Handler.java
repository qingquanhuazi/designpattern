package chainofresponsibility;

/**
 * 功能描述：
 *
 * @author : arthur
 * @date : 2021/4/6 0006 20:24
 */
public abstract class Handler {
    protected Handler chain;
    public void next(Handler handler) {
        this.chain = handler;
    }
    public abstract void doHandler(Member member);
}
