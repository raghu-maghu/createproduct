# RisksApi

All URIs are relative to *https://demo.iriusrisk.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productsRefRisksGet**](RisksApi.md#productsRefRisksGet) | **GET** /products/{ref}/risks | Gets the risks summary of a product


<a name="productsRefRisksGet"></a>
# **productsRefRisksGet**
> RiskSummary productsRefRisksGet(apiToken, ref)

Gets the risks summary of a product

This endpoint returns a summary of the risks of a product. Conditions to be able to perform the action:   - No permissions are required to perform this action. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RisksApi;


RisksApi apiInstance = new RisksApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
try {
    RiskSummary result = apiInstance.productsRefRisksGet(apiToken, ref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RisksApi#productsRefRisksGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| ID for product |

### Return type

[**RiskSummary**](RiskSummary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

