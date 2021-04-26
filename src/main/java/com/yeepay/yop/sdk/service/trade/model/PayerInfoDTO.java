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
import java.io.Serializable;

/**
 * &lt;span style&#x3D;\&quot;caret-color: #333333; color: #333333; font-family: Arial, sans-serif;\&quot;&gt;付款信息&lt;/span&gt;
 */
public class PayerInfoDTO implements Serializable{

  private static final long serialVersionUID = 1L;

  /**
   * 银行编号
   */
  @JsonProperty("bankId")
  private String bankId = null;

  /**
   * 账户名称
   */
  @JsonProperty("accountName")
  private String accountName = null;

  /**
   * 银行卡号
   */
  @JsonProperty("bankCardNo")
  private String bankCardNo = null;

  /**
   * 手机号
   */
  @JsonProperty("mobilePhoneNo")
  private String mobilePhoneNo = null;

  /**
   * 卡类型
   */
  @JsonProperty("cardType")
  private String cardType = null;

  /**
   * 用户ID
   */
  @JsonProperty("userID")
  private String userID = null;

  /**
   * unionID
   */
  @JsonProperty("unionID")
  private String unionID = null;

  public PayerInfoDTO bankId(String bankId) {
    this.bankId = bankId;
    return this;
  }

   /**
   * 银行编号
   * @return bankId
  **/

  public String getBankId() {
    return bankId;
  }

  public void setBankId(String bankId) {
    this.bankId = bankId;
  }

  public PayerInfoDTO accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * 账户名称
   * @return accountName
  **/

  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public PayerInfoDTO bankCardNo(String bankCardNo) {
    this.bankCardNo = bankCardNo;
    return this;
  }

   /**
   * 银行卡号
   * @return bankCardNo
  **/

  public String getBankCardNo() {
    return bankCardNo;
  }

  public void setBankCardNo(String bankCardNo) {
    this.bankCardNo = bankCardNo;
  }

  public PayerInfoDTO mobilePhoneNo(String mobilePhoneNo) {
    this.mobilePhoneNo = mobilePhoneNo;
    return this;
  }

   /**
   * 手机号
   * @return mobilePhoneNo
  **/

  public String getMobilePhoneNo() {
    return mobilePhoneNo;
  }

  public void setMobilePhoneNo(String mobilePhoneNo) {
    this.mobilePhoneNo = mobilePhoneNo;
  }

  public PayerInfoDTO cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * 卡类型
   * @return cardType
  **/

  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public PayerInfoDTO userID(String userID) {
    this.userID = userID;
    return this;
  }

   /**
   * 用户ID
   * @return userID
  **/

  public String getUserID() {
    return userID;
  }

  public void setUserID(String userID) {
    this.userID = userID;
  }

  public PayerInfoDTO unionID(String unionID) {
    this.unionID = unionID;
    return this;
  }

   /**
   * unionID
   * @return unionID
  **/

  public String getUnionID() {
    return unionID;
  }

  public void setUnionID(String unionID) {
    this.unionID = unionID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    PayerInfoDTO payerInfo = (PayerInfoDTO) o;
    return ObjectUtils.equals(this.bankId, payerInfo.bankId) &&
    ObjectUtils.equals(this.accountName, payerInfo.accountName) &&
    ObjectUtils.equals(this.bankCardNo, payerInfo.bankCardNo) &&
    ObjectUtils.equals(this.mobilePhoneNo, payerInfo.mobilePhoneNo) &&
    ObjectUtils.equals(this.cardType, payerInfo.cardType) &&
    ObjectUtils.equals(this.userID, payerInfo.userID) &&
    ObjectUtils.equals(this.unionID, payerInfo.unionID);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(bankId, accountName, bankCardNo, mobilePhoneNo, cardType, userID, unionID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayerInfoDTO {\n");
    
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    bankCardNo: ").append(toIndentedString(bankCardNo)).append("\n");
    sb.append("    mobilePhoneNo: ").append(toIndentedString(mobilePhoneNo)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    unionID: ").append(toIndentedString(unionID)).append("\n");
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
