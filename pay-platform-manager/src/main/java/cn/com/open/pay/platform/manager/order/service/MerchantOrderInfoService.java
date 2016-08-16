package cn.com.open.pay.platform.manager.order.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.com.open.pay.platform.manager.order.model.MerchantOrderInfo;

//import cn.com.open.openpaas.payservice.app.order.model.MerchantOrderInfo;
//import cn.com.open.openpaas.payservice.app.record.model.UserSerialRecord;

/**
 * 
 */
public interface MerchantOrderInfoService {

	MerchantOrderInfo findByMerchantOrderId(String outTradeNo);
	MerchantOrderInfo findByMerchantOrderId(String outTradeNo,String appId);

	void saveMerchantOrderInfo(MerchantOrderInfo merchantOrderInfo);

	MerchantOrderInfo findById(String orderId);

	void updateOrderInfo(MerchantOrderInfo merchantOrderInfo);
	void updateOrder(MerchantOrderInfo merchantOrderInfo);
	void updateNotifyTimes(Integer notifyTimes,String id);
	void updatePayStatus(Integer payStatus,String id);
	void updateSourceType(Integer sourceType,String id);
	void updatePayWay(MerchantOrderInfo merchantOrderInfo);

	List<MerchantOrderInfo> findByPayAndNotifyStatus();

	void updateNotifyStatus(MerchantOrderInfo orderInfo);

	void updateOrderId(MerchantOrderInfo merchantOrderInfo);
	List<MerchantOrderInfo> findOrderByTime(String startTime,String endTime,String appId);
	HashMap<String, Object> getTotalAmountByTime(String startTime,String endTime,String appId);
	List<Map<String, Object>> getPayCount(String startTime, String endTime,String appId,String paymentId,String channelId);
	List<Map<String, Object>> getPayAmount(String startTime, String endTime,String appId,String paymentId,String channelId);
	List<Map<String, Object>> getUserCount(String startTime, String endTime,String appId,String paymentId,String channelId);
	List<Map<String, Object>> payCharge(String startTime, String endTime,String appId,String paymentId,String channelId);
	
	HashMap<String, Object> getTotalPayCount(String startTime, String endTime,String appId,String paymentId,String channelId);
	HashMap<String, Object> getTotalPayAmount(String startTime, String endTime,String appId,String paymentId,String channelId);
	HashMap<String, Object> getTotalUserCount(String startTime, String endTime,String appId,String paymentId,String channelId);
	HashMap<String, Object> payTotalCharge(String startTime, String endTime,String appId,String paymentId,String channelId);
	List<MerchantOrderInfo> findQueryMerchant(
			MerchantOrderInfo merchantOrderInfo);
	
}