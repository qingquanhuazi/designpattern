package cn.arthur.design.mediator.rpc;

/**
 * Created by arthur.
 */
public class BService implements IService{
    Registy registy;
    BService(){
        registy.regist("bService",this);
    }
}
