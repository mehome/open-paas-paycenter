package cn.com.open.openpaas.payservice.app.order.model;
import java.io.Serializable;
import java.util.Date;

public class PayLoanInfo  implements Serializable {
	
	
	 *易汇金分期贷款 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id; //主键
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getRepaymentMethod() {
		return repaymentMethod;
	}
	public void setRepaymentMethod(String repaymentMethod) {
		this.repaymentMethod = repaymentMethod;
	}
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAnnualRate() {
		return annualRate;
	}
	public void setAnnualRate(String annualRate) {
		this.annualRate = annualRate;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCompleteTime() {
		return completeTime;
	}
	public void setCompleteTime(Date completeTime) {
		this.completeTime = completeTime;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Double getEstimatedDueInterest() {
		return estimatedDueInterest;
	}
	public void setEstimatedDueInterest(Double estimatedDueInterest) {
		this.estimatedDueInterest = estimatedDueInterest;
	}
	public Double getDuePrincipal() {
		return duePrincipal;
	}
	public void setDuePrincipal(Double duePrincipal) {
		this.duePrincipal = duePrincipal;
	}
	public Date getOverDueDate() {
		return overDueDate;
	}
	public void setOverDueDate(Date overDueDate) {
		this.overDueDate = overDueDate;
	}
	public Date getBreakContractDate() {
		return breakContractDate;
	}
	public void setBreakContractDate(Date breakContractDate) {
		this.breakContractDate = breakContractDate;
	}
	
	
}
