package cn.com.open.openpaas.payservice.app.redis.service;
/**
 * redis 存储开开头
 * @author admin
 *
 */
public class RedisConstant {
 public static final String APP_INFO="appInfo_";
 public static final String USER_NAME_CHECK="userNameCheck_";
 public static final String USER_CACHE_INFO="userCacheInfo_";//存储方式：key:userCacheInfo_username value:""
 public static final String ORDER_ID="orderId_";
 public static final String ORDER_SCANCODE="orderScanCode_";
}
