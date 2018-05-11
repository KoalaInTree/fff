package Default;

import C_4_24.Interface2;
import C_4_24.MyException;

public class Son2 extends Parent implements Interface2 {
    @Override
    public void inter2() {

    }

    @Override
    public void exp() throws MyException {
        super.exp();
    }
}
