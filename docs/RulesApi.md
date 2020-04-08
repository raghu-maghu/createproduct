# RulesApi

All URIs are relative to *https://demo.iriusrisk.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rulesProductRefPut**](RulesApi.md#rulesProductRefPut) | **PUT** /rules/product/{ref} | Executes rules by a product


<a name="rulesProductRefPut"></a>
# **rulesProductRefPut**
> rulesProductRefPut(apiToken, ref, deleteCountermeasures)

Executes rules by a product

Execute the rules engine for a product and for all components within the product.  If the deleteCountermeasures parameter is true, then threats and countermeasure that no longer apply to the model will automatically be removed.  If it is false, then those threats and countermeasures will remain in the model.   - To have the permission **ARCHITECTURE_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RulesApi;


RulesApi apiInstance = new RulesApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for Product
String deleteCountermeasures = "deleteCountermeasures_example"; // String | This flag indicates if the rules execution will delete the threat and countermeasures which don't apply to the new product threat model. If true, the threats and countermeasures will be automatically removed from the model. If false, the threats and countermeasures won't be removed from the model.
try {
    apiInstance.rulesProductRefPut(apiToken, ref, deleteCountermeasures);
} catch (ApiException e) {
    System.err.println("Exception when calling RulesApi#rulesProductRefPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| ID for Product |
 **deleteCountermeasures** | **String**| This flag indicates if the rules execution will delete the threat and countermeasures which don&#39;t apply to the new product threat model. If true, the threats and countermeasures will be automatically removed from the model. If false, the threats and countermeasures won&#39;t be removed from the model. | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

