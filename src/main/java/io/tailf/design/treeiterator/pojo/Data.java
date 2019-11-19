package io.tailf.design.treeiterator.pojo;

public class Data {
private Integer val;

    public Data(Integer val) {
        this.val = val;
    }

    public Integer getVal() {
        return val;
    }

    public void setVal(Integer val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Data{" +
            "val=" + val +
            '}';
    }
}
