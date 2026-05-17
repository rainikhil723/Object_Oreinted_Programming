package NestedInterface;

public interface A {
    // nested interface
    public interface NestedInterface {
        boolean isodd (int num);
    }
}
class B implements A. NestedInterface {
    @Override
    public boolean isodd (int num) {
        return (num & 1) == 1;
    }
}

