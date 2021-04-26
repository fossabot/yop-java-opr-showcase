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

package com.yeepay.demo.yop.sdk.service.cashier;


import com.yeepay.yop.sdk.auth.AuthorizationReqRegistry;
import com.yeepay.yop.sdk.auth.DefaultAuthorizationReqRegistry;
import com.yeepay.yop.sdk.client.AbstractServiceClientBuilder;
import com.yeepay.yop.sdk.client.ClientParams;

@javax.annotation.Generated(value = "com.yeepay.g3.core.yop.codegen.generator2.java.YopJavaClientCodegen", date = "2020-11-05T11:17:05.732+08:00[Asia/Shanghai]")
public class CashierClientBuilder extends AbstractServiceClientBuilder<CashierClientBuilder, com.yeepay.demo.yop.sdk.service.cashier.CashierClientImpl> {

    private static final AuthorizationReqRegistry REGISTRY;

    static {
        REGISTRY = new DefaultAuthorizationReqRegistry();
        REGISTRY.register("payLinkOrder", "YOP-RSA2048-SHA256");
    }

    @Override
    protected AuthorizationReqRegistry authorizationReqRegistry() {
        return REGISTRY;
    }

    @Override
    protected com.yeepay.demo.yop.sdk.service.cashier.CashierClientImpl build(ClientParams params) {
        return new CashierClientImpl(params);
    }

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static CashierClientBuilder builder() {
        return new CashierClientBuilder();
    }

}