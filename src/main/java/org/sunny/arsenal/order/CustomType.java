package org.sunny.arsenal.order;

public enum CustomType {

    CUSTOM("自定义", 1), DATE("日期", 2), RANDOMNO("随机数", 3);

    private CustomType(String key, int value) {
        this.key = key;
        this.value = value;

    }

    CustomType(CustomType type, String customFormat) {


    }


    private String key;

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return this.key;
    }

    private int value;


    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    private CustomType type;

    public void setType(CustomType type) {
        this.type = type;
    }

    public CustomType getType() {
        return this.type;
    }
}
