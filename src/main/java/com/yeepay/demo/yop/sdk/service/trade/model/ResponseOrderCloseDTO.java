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

/**
 * ResponseOrderCloseDTO
 */
public class ResponseOrderCloseDTO {
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

    public ResponseOrderCloseDTO code(String code) {
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

    public ResponseOrderCloseDTO message(String message) {
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

    public ResponseOrderCloseDTO parentMerchantNo(String parentMerchantNo) {
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

    public ResponseOrderCloseDTO merchantNo(String merchantNo) {
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

    public ResponseOrderCloseDTO orderId(String orderId) {
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


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseOrderCloseDTO responseOrderCloseDTO = (ResponseOrderCloseDTO) o;
        return ObjectUtils.equals(this.code, responseOrderCloseDTO.code) &&
                ObjectUtils.equals(this.message, responseOrderCloseDTO.message) &&
                ObjectUtils.equals(this.parentMerchantNo, responseOrderCloseDTO.parentMerchantNo) &&
                ObjectUtils.equals(this.merchantNo, responseOrderCloseDTO.merchantNo) &&
                ObjectUtils.equals(this.orderId, responseOrderCloseDTO.orderId);
    }

    @Override
    public int hashCode() {
        return ObjectUtils.hashCodeMulti(code, message, parentMerchantNo, merchantNo, orderId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseOrderCloseDTO {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    parentMerchantNo: ").append(toIndentedString(parentMerchantNo)).append("\n");
        sb.append("    merchantNo: ").append(toIndentedString(merchantNo)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
