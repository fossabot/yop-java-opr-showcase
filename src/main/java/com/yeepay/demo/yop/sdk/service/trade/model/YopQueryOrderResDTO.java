/*
 * 标准交易
 * <p>名称（中文）：新交易下单接口<br />名称（英文，xx.war）：opr-hessian.war<br />简介：合单支付下单与标准收款内部下单接口合并<br />wiki文档地址：http://wiki.yeepay.com/pages/viewpage.action?pageId=122095805(4.新api分组相关接口规划)<br />预计项目上线时间：2020年6月9日<br />归属/拟申请的sp编码（可选）：opr<br />期望api分组编码、名称（可选）：trade(标准交易)<br />涉及的接口：申请下单、订单查询、申请退款、退款查询</p>
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.yeepay.demo.yop.sdk.service.trade.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.ObjectUtils;

import java.math.BigDecimal;

/**
 * YopQueryOrderResDTO
 */
public class YopQueryOrderResDTO {
    @JsonProperty("code")
    private String code = null;

    @JsonProperty("message")
    private String message = null;

    @JsonProperty("parentMerchantNo")
    private String parentMerchantNo = null;

    @JsonProperty("merchantNo")
    private String merchantNo = null;

    @JsonProperty("orderId")
    private String orderId = null;

    @JsonProperty("uniqueOrderNo")
    private String uniqueOrderNo = null;

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("orderAmount")
    private BigDecimal orderAmount = null;

    @JsonProperty("payAmount")
    private BigDecimal payAmount = null;

    @JsonProperty("merchantFee")
    private BigDecimal merchantFee = null;

    @JsonProperty("customerFee")
    private BigDecimal customerFee = null;

    @JsonProperty("paySuccessDate")
    private String paySuccessDate = null;

    @JsonProperty("memo")
    private String memo = null;

    @JsonProperty("payWay")
    private String payWay = null;

    @JsonProperty("token")
    private String token = null;

    @JsonProperty("fundProcessType")
    private String fundProcessType = null;

    @JsonProperty("bankOrderId")
    private String bankOrderId = null;

    @JsonProperty("channelOrderId")
    private String channelOrderId = null;

    @JsonProperty("channel")
    private String channel = null;

    @JsonProperty("payerInfo")
    private com.yeepay.demo.yop.sdk.service.trade.model.PayerInfoDTO payerInfo = null;

    public YopQueryOrderResDTO code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     **/

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public YopQueryOrderResDTO message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     **/

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public YopQueryOrderResDTO parentMerchantNo(String parentMerchantNo) {
        this.parentMerchantNo = parentMerchantNo;
        return this;
    }

    /**
     * Get parentMerchantNo
     *
     * @return parentMerchantNo
     **/

    public String getParentMerchantNo() {
        return parentMerchantNo;
    }

    public void setParentMerchantNo(String parentMerchantNo) {
        this.parentMerchantNo = parentMerchantNo;
    }

    public YopQueryOrderResDTO merchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
        return this;
    }

    /**
     * Get merchantNo
     *
     * @return merchantNo
     **/

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public YopQueryOrderResDTO orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * Get orderId
     *
     * @return orderId
     **/

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public YopQueryOrderResDTO uniqueOrderNo(String uniqueOrderNo) {
        this.uniqueOrderNo = uniqueOrderNo;
        return this;
    }

    /**
     * Get uniqueOrderNo
     *
     * @return uniqueOrderNo
     **/

    public String getUniqueOrderNo() {
        return uniqueOrderNo;
    }

    public void setUniqueOrderNo(String uniqueOrderNo) {
        this.uniqueOrderNo = uniqueOrderNo;
    }

    public YopQueryOrderResDTO status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public YopQueryOrderResDTO orderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
        return this;
    }

    /**
     * Get orderAmount
     *
     * @return orderAmount
     **/

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public YopQueryOrderResDTO payAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
        return this;
    }

    /**
     * Get payAmount
     *
     * @return payAmount
     **/

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public YopQueryOrderResDTO merchantFee(BigDecimal merchantFee) {
        this.merchantFee = merchantFee;
        return this;
    }

    /**
     * Get merchantFee
     *
     * @return merchantFee
     **/

    public BigDecimal getMerchantFee() {
        return merchantFee;
    }

    public void setMerchantFee(BigDecimal merchantFee) {
        this.merchantFee = merchantFee;
    }

    public YopQueryOrderResDTO customerFee(BigDecimal customerFee) {
        this.customerFee = customerFee;
        return this;
    }

    /**
     * Get customerFee
     *
     * @return customerFee
     **/

    public BigDecimal getCustomerFee() {
        return customerFee;
    }

    public void setCustomerFee(BigDecimal customerFee) {
        this.customerFee = customerFee;
    }

    public YopQueryOrderResDTO paySuccessDate(String paySuccessDate) {
        this.paySuccessDate = paySuccessDate;
        return this;
    }

    /**
     * Get paySuccessDate
     *
     * @return paySuccessDate
     **/

    public String getPaySuccessDate() {
        return paySuccessDate;
    }

    public void setPaySuccessDate(String paySuccessDate) {
        this.paySuccessDate = paySuccessDate;
    }

    public YopQueryOrderResDTO memo(String memo) {
        this.memo = memo;
        return this;
    }

    /**
     * Get memo
     *
     * @return memo
     **/

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public YopQueryOrderResDTO payWay(String payWay) {
        this.payWay = payWay;
        return this;
    }

    /**
     * Get payWay
     *
     * @return payWay
     **/

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public YopQueryOrderResDTO token(String token) {
        this.token = token;
        return this;
    }

    /**
     * Get token
     *
     * @return token
     **/

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public YopQueryOrderResDTO fundProcessType(String fundProcessType) {
        this.fundProcessType = fundProcessType;
        return this;
    }

    /**
     * Get fundProcessType
     *
     * @return fundProcessType
     **/

    public String getFundProcessType() {
        return fundProcessType;
    }

    public void setFundProcessType(String fundProcessType) {
        this.fundProcessType = fundProcessType;
    }

    public YopQueryOrderResDTO bankOrderId(String bankOrderId) {
        this.bankOrderId = bankOrderId;
        return this;
    }

    /**
     * Get bankOrderId
     *
     * @return bankOrderId
     **/

    public String getBankOrderId() {
        return bankOrderId;
    }

    public void setBankOrderId(String bankOrderId) {
        this.bankOrderId = bankOrderId;
    }

    public YopQueryOrderResDTO channelOrderId(String channelOrderId) {
        this.channelOrderId = channelOrderId;
        return this;
    }

    /**
     * Get channelOrderId
     *
     * @return channelOrderId
     **/

    public String getChannelOrderId() {
        return channelOrderId;
    }

    public void setChannelOrderId(String channelOrderId) {
        this.channelOrderId = channelOrderId;
    }

    public YopQueryOrderResDTO channel(String channel) {
        this.channel = channel;
        return this;
    }

    /**
     * Get channel
     *
     * @return channel
     **/

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public YopQueryOrderResDTO payerInfo(com.yeepay.demo.yop.sdk.service.trade.model.PayerInfoDTO payerInfo) {
        this.payerInfo = payerInfo;
        return this;
    }

    /**
     * Get payerInfo
     *
     * @return payerInfo
     **/

    public com.yeepay.demo.yop.sdk.service.trade.model.PayerInfoDTO getPayerInfo() {
        return payerInfo;
    }

    public void setPayerInfo(PayerInfoDTO payerInfo) {
        this.payerInfo = payerInfo;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        YopQueryOrderResDTO yopQueryOrderResDTO = (YopQueryOrderResDTO) o;
        return ObjectUtils.equals(this.code, yopQueryOrderResDTO.code) &&
                ObjectUtils.equals(this.message, yopQueryOrderResDTO.message) &&
                ObjectUtils.equals(this.parentMerchantNo, yopQueryOrderResDTO.parentMerchantNo) &&
                ObjectUtils.equals(this.merchantNo, yopQueryOrderResDTO.merchantNo) &&
                ObjectUtils.equals(this.orderId, yopQueryOrderResDTO.orderId) &&
                ObjectUtils.equals(this.uniqueOrderNo, yopQueryOrderResDTO.uniqueOrderNo) &&
                ObjectUtils.equals(this.status, yopQueryOrderResDTO.status) &&
                ObjectUtils.equals(this.orderAmount, yopQueryOrderResDTO.orderAmount) &&
                ObjectUtils.equals(this.payAmount, yopQueryOrderResDTO.payAmount) &&
                ObjectUtils.equals(this.merchantFee, yopQueryOrderResDTO.merchantFee) &&
                ObjectUtils.equals(this.customerFee, yopQueryOrderResDTO.customerFee) &&
                ObjectUtils.equals(this.paySuccessDate, yopQueryOrderResDTO.paySuccessDate) &&
                ObjectUtils.equals(this.memo, yopQueryOrderResDTO.memo) &&
                ObjectUtils.equals(this.payWay, yopQueryOrderResDTO.payWay) &&
                ObjectUtils.equals(this.token, yopQueryOrderResDTO.token) &&
                ObjectUtils.equals(this.fundProcessType, yopQueryOrderResDTO.fundProcessType) &&
                ObjectUtils.equals(this.bankOrderId, yopQueryOrderResDTO.bankOrderId) &&
                ObjectUtils.equals(this.channelOrderId, yopQueryOrderResDTO.channelOrderId) &&
                ObjectUtils.equals(this.channel, yopQueryOrderResDTO.channel) &&
                ObjectUtils.equals(this.payerInfo, yopQueryOrderResDTO.payerInfo);
    }

    @Override
    public int hashCode() {
        return ObjectUtils.hashCodeMulti(code, message, parentMerchantNo, merchantNo, orderId, uniqueOrderNo, status, orderAmount, payAmount, merchantFee, customerFee, paySuccessDate, memo, payWay, token, fundProcessType, bankOrderId, channelOrderId, channel, payerInfo);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class YopQueryOrderResDTO {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    parentMerchantNo: ").append(toIndentedString(parentMerchantNo)).append("\n");
        sb.append("    merchantNo: ").append(toIndentedString(merchantNo)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    uniqueOrderNo: ").append(toIndentedString(uniqueOrderNo)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
        sb.append("    payAmount: ").append(toIndentedString(payAmount)).append("\n");
        sb.append("    merchantFee: ").append(toIndentedString(merchantFee)).append("\n");
        sb.append("    customerFee: ").append(toIndentedString(customerFee)).append("\n");
        sb.append("    paySuccessDate: ").append(toIndentedString(paySuccessDate)).append("\n");
        sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
        sb.append("    payWay: ").append(toIndentedString(payWay)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    fundProcessType: ").append(toIndentedString(fundProcessType)).append("\n");
        sb.append("    bankOrderId: ").append(toIndentedString(bankOrderId)).append("\n");
        sb.append("    channelOrderId: ").append(toIndentedString(channelOrderId)).append("\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    payerInfo: ").append(toIndentedString(payerInfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
