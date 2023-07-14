// Copyright 2021 Tencent Inc. All rights reserved.
//
// 连锁加盟供应链分账API
//
// No description provided (generated by Openapi Generator
// https://github.com/openapitools/openapi-generator)
//
// API version: 1.0.12

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.brandprofitsharing.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/** QueryBrandMerchantRatioRequest */
public class QueryBrandMerchantRatioRequest {
  /** 品牌商户号 说明：分账出资的品牌商户号，填写微信支付分配的商户号 */
  @SerializedName("brand_mchid")
  @Expose(serialize = false)
  private String brandMchid;

  public String getBrandMchid() {
    return brandMchid;
  }

  public void setBrandMchid(String brandMchid) {
    this.brandMchid = brandMchid;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryBrandMerchantRatioRequest {\n");
    sb.append("    brandMchid: ").append(toIndentedString(brandMchid)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}