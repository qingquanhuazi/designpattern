package chainofresponsibility.builder;

import chainofresponsibility.Member;

/**
 * 功能描述：
 *    建造者模式和责任链模式组合
 *   责任链模式具备链式结构，如果业务过于复杂，会造成组装链接结构的角色代码相对臃肿，
 *   而且不符合开闭原则，但是结合建造者模式使用，会自动进行链式组装，而且还能指定不同的节点对象顺序，构造出来的链接结构也会不同，且符合开闭原则。
 *
 *   通过建造者模式指定调用链的顺序和具体调用链的实现，通过责任链模式来执行调用。
 * @author : arthur
 * @date : 2021/4/6 0006 20:32
 */
public abstract class Handler {
    /**
     * 由于建造者模式要构建的是节点处理者，所以这里我们把 Builder 作为 Handler 的静态内部类
     */
    protected Handler chain;

    /**
     * 因为客户端不需要进行链式封装，所以还可以把链式组装方法 next()
     *  设置为 private，使 Handler 更加高聚合
     */
    private void next(Handler handler) {
        this.chain = handler;
    }
    public abstract void doHandler(Member member);
    public static class Builder {
        private Handler head;
        private Handler tail;

        public Builder addHandler(Handler handler) {
            if (this.head == null) {
                this.head = this.tail = handler;
                return this;
            }
            this.tail.next(handler);
            this.tail = handler;
            return this;
        }
        public Handler build() {
            return this.head;
        }
    }
}
