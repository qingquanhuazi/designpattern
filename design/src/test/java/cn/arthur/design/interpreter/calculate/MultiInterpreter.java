package cn.arthur.design.interpreter.calculate;

/**
 * Created by arthur.
 */
public class MultiInterpreter extends Interpreter {

    public MultiInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right){
        super(left,right);
    }

    public int interpret() {
        return this.left.interpret() * this.right.interpret();
    }

}
