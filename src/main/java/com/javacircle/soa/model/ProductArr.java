package com.javacircle.soa.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"productId",
"productName",
"productType",
"productClass",
"packaging"
})
public class ProductArr {

@JsonProperty("productId")
private String productId;
@JsonProperty("productName")
private String productName;
@JsonProperty("productType")
private String productType;
@JsonProperty("productClass")
private String productClass;
@JsonProperty("packaging")
private String packaging;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("productId")
public String getProductId() {
return productId;
}

@JsonProperty("productId")
public void setProductId(String productId) {
this.productId = productId;
}

@JsonProperty("productName")
public String getProductName() {
return productName;
}

@JsonProperty("productName")
public void setProductName(String productName) {
this.productName = productName;
}

@JsonProperty("productType")
public String getProductType() {
return productType;
}

@JsonProperty("productType")
public void setProductType(String productType) {
this.productType = productType;
}

@JsonProperty("productClass")
public String getProductClass() {
return productClass;
}

@JsonProperty("productClass")
public void setProductClass(String productClass) {
this.productClass = productClass;
}

@JsonProperty("packaging")
public String getPackaging() {
return packaging;
}

@JsonProperty("packaging")
public void setPackaging(String packaging) {
this.packaging = packaging;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}