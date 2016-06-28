package cn.com.open.openpaas.payservice.app.channel.alipay;

public enum PaymentType{
    //通过括号赋值,而且必须带有一个参构造器和一个属性跟方法，否则编译出错
    //赋值必须都赋值或都不赋值，不能一部分赋值一部分不赋值；如果不赋值则不能写构造器，赋值编译也出错
    ALI(10001), WEIXIN(10002),ALIFTF(10003);
    
    private final Integer value;

    //构造器默认也只能是private, 从而保证构造函数只能在内部使用
    PaymentType(Integer value) {
        this.value = value;
    }
    
    public Integer getValue() {
        return value;
    }
}
