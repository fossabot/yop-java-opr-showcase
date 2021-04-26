/*
 * 商家收银台
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.yeepay.demo.yop.sdk.service.cashier.request;

import com.yeepay.yop.sdk.http.Headers;
import com.yeepay.yop.sdk.http.HttpMethodName;
import com.yeepay.yop.sdk.internal.DefaultRequest;
import com.yeepay.yop.sdk.internal.Request;
import com.yeepay.yop.sdk.model.transform.RequestMarshaller;
import com.yeepay.yop.sdk.protocol.marshaller.PrimitiveMarshallerUtils;

import java.util.UUID;


public class PayLinkOrderRequestMarshaller implements RequestMarshaller<com.yeepay.demo.yop.sdk.service.cashier.request.PayLinkOrderRequest> {
    private final String serviceName = "Cashier";

    private final String resourcePath = "/rest/v1.0/cashier/pay-link/order";

    private final String contentType = "application/x-www-form-urlencoded";

    private final HttpMethodName httpMethodName = HttpMethodName.POST;

    @Override
    public Request<com.yeepay.demo.yop.sdk.service.cashier.request.PayLinkOrderRequest> marshall(com.yeepay.demo.yop.sdk.service.cashier.request.PayLinkOrderRequest request) {
        Request<com.yeepay.demo.yop.sdk.service.cashier.request.PayLinkOrderRequest> internalRequest = new DefaultRequest<PayLinkOrderRequest>(request, serviceName);
        internalRequest.setResourcePath(resourcePath);
        internalRequest.setHttpMethod(httpMethodName);
        if (!internalRequest.getHeaders().containsKey(Headers.YOP_REQUEST_ID)) {
            String requestId = UUID.randomUUID().toString();
            internalRequest.addHeader(Headers.YOP_REQUEST_ID, requestId);
        }

        if (request.getParentMerchantNo() != null) {
            internalRequest.addParameter("parentMerchantNo", PrimitiveMarshallerUtils.marshalling(request.getParentMerchantNo(), "String"));
        }
        if (request.getMerchantNo() != null) {
            internalRequest.addParameter("merchantNo", PrimitiveMarshallerUtils.marshalling(request.getMerchantNo(), "String"));
        }
        if (request.getOrderId() != null) {
            internalRequest.addParameter("orderId", PrimitiveMarshallerUtils.marshalling(request.getOrderId(), "String"));
        }
        if (request.getGoodsName() != null) {
            internalRequest.addParameter("goodsName", PrimitiveMarshallerUtils.marshalling(request.getGoodsName(), "String"));
        }
        if (request.getAmount() != null) {
            internalRequest.addParameter("amount", PrimitiveMarshallerUtils.marshalling(request.getAmount(), "BigDecimal"));
        }
        if (request.getExpiredTime() != null) {
            internalRequest.addParameter("expiredTime", PrimitiveMarshallerUtils.marshalling(request.getExpiredTime(), "String"));
        }
        if (request.getNotifyUrl() != null) {
            internalRequest.addParameter("notifyUrl", PrimitiveMarshallerUtils.marshalling(request.getNotifyUrl(), "String"));
        }
        if (request.getScene() != null) {
            internalRequest.addParameter("scene", PrimitiveMarshallerUtils.marshalling(request.getScene(), "String"));
        }
        internalRequest.addHeader(Headers.CONTENT_TYPE, contentType);
        return internalRequest;
    }


    private static class CacheInstanceHolder {
        public static PayLinkOrderRequestMarshaller INSTANCE = new PayLinkOrderRequestMarshaller();

        private CacheInstanceHolder() {
        }
    }

    public static PayLinkOrderRequestMarshaller getInstance() {
        return CacheInstanceHolder.INSTANCE;
    }
}