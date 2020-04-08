# ControlsApi

All URIs are relative to *https://demo.iriusrisk.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productsRefComponentsComponentRefControlsControlRefStatusPut**](ControlsApi.md#productsRefComponentsComponentRefControlsControlRefStatusPut) | **PUT** /products/{ref}/components/{componentRef}/controls/{controlRef}/status | Sets the desired status to a countermeasure
[**productsRefControlsGet**](ControlsApi.md#productsRefControlsGet) | **GET** /products/{ref}/controls | Gets a list of all product countermeasures
[**productsRefControlsImplementedGet**](ControlsApi.md#productsRefControlsImplementedGet) | **GET** /products/{ref}/controls/implemented | Gets a list of all implemented countermeasures of a product.
[**productsRefControlsRequiredGet**](ControlsApi.md#productsRefControlsRequiredGet) | **GET** /products/{ref}/controls/required | Gets a list of all required countermeasures of a product


<a name="productsRefComponentsComponentRefControlsControlRefStatusPut"></a>
# **productsRefComponentsComponentRefControlsControlRefStatusPut**
> productsRefComponentsComponentRefControlsControlRefStatusPut(apiToken, ref, componentRef, controlRef, jsonData)

Sets the desired status to a countermeasure

Sets the desired status to a countermeasure. Possible values are:             - implemented             - recommended             - rejected             - required Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_UPDATE** granted to set any state.   - To have the permission **COUNTERMEASURE_SELECT_IMPLEMENTED** granted to set implemented state.   - To have the permission **COUNTERMEASURE_SELECT_RECOMMENDED** granted to set recommended state.   - To have the permission **COUNTERMEASURE_SELECT_REJECTED** granted to set reject state.   - To have the permission **COUNTERMEASURE_SELECT_REQUIRED** granted to set required state. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ControlsApi;


ControlsApi apiInstance = new ControlsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
String componentRef = "componentRef_example"; // String | ID for component
String controlRef = "controlRef_example"; // String | Control ref
JsonData17 jsonData = new JsonData17(); // JsonData17 | JSON data that contains the information to update countermeasure
try {
    apiInstance.productsRefComponentsComponentRefControlsControlRefStatusPut(apiToken, ref, componentRef, controlRef, jsonData);
} catch (ApiException e) {
    System.err.println("Exception when calling ControlsApi#productsRefComponentsComponentRefControlsControlRefStatusPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| ID for product |
 **componentRef** | **String**| ID for component |
 **controlRef** | **String**| Control ref |
 **jsonData** | [**JsonData17**](JsonData17.md)| JSON data that contains the information to update countermeasure |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="productsRefControlsGet"></a>
# **productsRefControlsGet**
> List&lt;ComponentControl&gt; productsRefControlsGet(apiToken, ref)

Gets a list of all product countermeasures

Returns a list of all the countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ControlsApi;


ControlsApi apiInstance = new ControlsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
try {
    List<ComponentControl> result = apiInstance.productsRefControlsGet(apiToken, ref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControlsApi#productsRefControlsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| ID for product |

### Return type

[**List&lt;ComponentControl&gt;**](ComponentControl.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="productsRefControlsImplementedGet"></a>
# **productsRefControlsImplementedGet**
> List&lt;ComponentControl&gt; productsRefControlsImplementedGet(apiToken, ref)

Gets a list of all implemented countermeasures of a product.

Returns a list of all the implemented countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ControlsApi;


ControlsApi apiInstance = new ControlsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
try {
    List<ComponentControl> result = apiInstance.productsRefControlsImplementedGet(apiToken, ref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControlsApi#productsRefControlsImplementedGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| ID for product |

### Return type

[**List&lt;ComponentControl&gt;**](ComponentControl.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="productsRefControlsRequiredGet"></a>
# **productsRefControlsRequiredGet**
> List&lt;ComponentControl&gt; productsRefControlsRequiredGet(apiToken, ref)

Gets a list of all required countermeasures of a product

Returns a list of all the required countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ControlsApi;


ControlsApi apiInstance = new ControlsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
try {
    List<ComponentControl> result = apiInstance.productsRefControlsRequiredGet(apiToken, ref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ControlsApi#productsRefControlsRequiredGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| ID for product |

### Return type

[**List&lt;ComponentControl&gt;**](ComponentControl.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

