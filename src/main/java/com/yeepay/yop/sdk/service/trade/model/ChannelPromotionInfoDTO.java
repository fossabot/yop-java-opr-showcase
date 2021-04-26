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


package com.yeepay.yop.sdk.service.trade.model;

import org.apache.commons.lang3.ObjectUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.io.Serializable;

/**
 * ChannelPromotionInfoDTO
 */
public class ChannelPromotionInfoDTO implements Serializable{

  private static final long serialVersionUID = 1L;

  /**
   * 优惠券编码
   */
  @JsonProperty("promotionId")
  private String promotionId = null;

  /**
   * 优惠券名称
   */
  @JsonProperty("promotionName")
  private String promotionName = null;

  /**
   * 优惠券范围
   */
  @JsonProperty("promotionScope")
  private String promotionScope = null;

  /**
   * 优惠券金额
   */
  @JsonProperty("amount")
  private BigDecimal amount = null;

  /**
   * 优惠券活动id
   */
  @JsonProperty("activityId")
  private String activityId = null;

  /**
   * 渠道出资
   */
  @JsonProperty("channelContribute")
  private String channelContribute = null;

  /**
   * 商户出资
   */
  @JsonProperty("merchantContribute")
  private String merchantContribute = null;

  /**
   * 其他出资
   */
  @JsonProperty("otherContribute")
  private String otherContribute = null;

  /**
   * 备注信息
   */
  @JsonProperty("memo")
  private String memo = null;

  public ChannelPromotionInfoDTO promotionId(String promotionId) {
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 优惠券编码
   * @return promotionId
  **/

  public String getPromotionId() {
    return promotionId;
  }

  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }

  public ChannelPromotionInfoDTO promotionName(String promotionName) {
    this.promotionName = promotionName;
    return this;
  }

   /**
   * 优惠券名称
   * @return promotionName
  **/

  public String getPromotionName() {
    return promotionName;
  }

  public void setPromotionName(String promotionName) {
    this.promotionName = promotionName;
  }

  public ChannelPromotionInfoDTO promotionScope(String promotionScope) {
    this.promotionScope = promotionScope;
    return this;
  }

   /**
   * 优惠券范围
   * @return promotionScope
  **/

  public String getPromotionScope() {
    return promotionScope;
  }

  public void setPromotionScope(String promotionScope) {
    this.promotionScope = promotionScope;
  }

  public ChannelPromotionInfoDTO amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * 优惠券金额
   * @return amount
  **/

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public ChannelPromotionInfoDTO activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * 优惠券活动id
   * @return activityId
  **/

  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public ChannelPromotionInfoDTO channelContribute(String channelContribute) {
    this.channelContribute = channelContribute;
    return this;
  }

   /**
   * 渠道出资
   * @return channelContribute
  **/

  public String getChannelContribute() {
    return channelContribute;
  }

  public void setChannelContribute(String channelContribute) {
    this.channelContribute = channelContribute;
  }

  public ChannelPromotionInfoDTO merchantContribute(String merchantContribute) {
    this.merchantContribute = merchantContribute;
    return this;
  }

   /**
   * 商户出资
   * @return merchantContribute
  **/

  public String getMerchantContribute() {
    return merchantContribute;
  }

  public void setMerchantContribute(String merchantContribute) {
    this.merchantContribute = merchantContribute;
  }

  public ChannelPromotionInfoDTO otherContribute(String otherContribute) {
    this.otherContribute = otherContribute;
    return this;
  }

   /**
   * 其他出资
   * @return otherContribute
  **/

  public String getOtherContribute() {
    return otherContribute;
  }

  public void setOtherContribute(String otherContribute) {
    this.otherContribute = otherContribute;
  }

  public ChannelPromotionInfoDTO memo(String memo) {
    this.memo = memo;
    return this;
  }

   /**
   * 备注信息
   * @return memo
  **/

  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    ChannelPromotionInfoDTO channelPromotionInfoDTO = (ChannelPromotionInfoDTO) o;
    return ObjectUtils.equals(this.promotionId, channelPromotionInfoDTO.promotionId) &&
    ObjectUtils.equals(this.promotionName, channelPromotionInfoDTO.promotionName) &&
    ObjectUtils.equals(this.promotionScope, channelPromotionInfoDTO.promotionScope) &&
    ObjectUtils.equals(this.amount, channelPromotionInfoDTO.amount) &&
    ObjectUtils.equals(this.activityId, channelPromotionInfoDTO.activityId) &&
    ObjectUtils.equals(this.channelContribute, channelPromotionInfoDTO.channelContribute) &&
    ObjectUtils.equals(this.merchantContribute, channelPromotionInfoDTO.merchantContribute) &&
    ObjectUtils.equals(this.otherContribute, channelPromotionInfoDTO.otherContribute) &&
    ObjectUtils.equals(this.memo, channelPromotionInfoDTO.memo);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(promotionId, promotionName, promotionScope, amount, activityId, channelContribute, merchantContribute, otherContribute, memo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelPromotionInfoDTO {\n");
    
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    promotionName: ").append(toIndentedString(promotionName)).append("\n");
    sb.append("    promotionScope: ").append(toIndentedString(promotionScope)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    channelContribute: ").append(toIndentedString(channelContribute)).append("\n");
    sb.append("    merchantContribute: ").append(toIndentedString(merchantContribute)).append("\n");
    sb.append("    otherContribute: ").append(toIndentedString(otherContribute)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
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
