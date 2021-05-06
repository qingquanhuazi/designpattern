package cn.arthur.design.adapter.demo.passport.adapterv2.adapters;


import cn.arthur.design.adapter.demo.passport.ResultMsg;

/**
 * Created by arthur.
 */
public interface ILoginAdapter {
    boolean support(Object object);
    ResultMsg login(String id, Object adapter);
}
