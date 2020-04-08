# ComponentsApi

All URIs are relative to *https://demo.iriusrisk.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productsRefComponentsComponentRefTestsCwePut**](ComponentsApi.md#productsRefComponentsComponentRefTestsCwePut) | **PUT** /products/{ref}/components/{componentRef}/tests/{cwe} | Updates a single test to a component.
[**productsRefComponentsComponentRefTestsTestTypeUploadPost**](ComponentsApi.md#productsRefComponentsComponentRefTestsTestTypeUploadPost) | **POST** /products/{ref}/components/{componentRef}/tests/{testType}/upload | Imports test results from different sources to a component


<a name="productsRefComponentsComponentRefTestsCwePut"></a>
# **productsRefComponentsComponentRefTestsCwePut**
> List&lt;InlineResponse2001&gt; productsRefComponentsComponentRefTestsCwePut(apiToken, ref, componentRef, cwe, jsonData)

Updates a single test to a component.

Updates a single test to a component. Conditions to be able to perform the action:   - To have the permission **TEST_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ComponentsApi;


ComponentsApi apiInstance = new ComponentsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
String componentRef = "componentRef_example"; // String | ID for component
String cwe = "cwe_example"; // String | countermeasure or weakness CWE
JsonData18 jsonData = new JsonData18(); // JsonData18 | JSON data that contains the information to update test
try {
    List<InlineResponse2001> result = apiInstance.productsRefComponentsComponentRefTestsCwePut(apiToken, ref, componentRef, cwe, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComponentsApi#productsRefComponentsComponentRefTestsCwePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| ID for product |
 **componentRef** | **String**| ID for component |
 **cwe** | **String**| countermeasure or weakness CWE |
 **jsonData** | [**JsonData18**](JsonData18.md)| JSON data that contains the information to update test |

### Return type

[**List&lt;InlineResponse2001&gt;**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="productsRefComponentsComponentRefTestsTestTypeUploadPost"></a>
# **productsRefComponentsComponentRefTestsTestTypeUploadPost**
> InlineResponse2011 productsRefComponentsComponentRefTestsTestTypeUploadPost(apiToken, ref, componentRef, testType, fileName)

Imports test results from different sources to a component

Imports test results from different sources (OWASP ZAP, Cucumber, Micro Focus Fortify) into the specified component. More than one file can be attached to the call. Conditions to be able to perform the action:   - To have the permission **TEST_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ComponentsApi;


ComponentsApi apiInstance = new ComponentsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
String componentRef = "componentRef_example"; // String | ID for component
String testType = "testType_example"; // String | Type of test to be imported (zap|cucumber|junit|hp-fortify)
File fileName = new File("/path/to/file.txt"); // File | File to upload
try {
    InlineResponse2011 result = apiInstance.productsRefComponentsComponentRefTestsTestTypeUploadPost(apiToken, ref, componentRef, testType, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ComponentsApi#productsRefComponentsComponentRefTestsTestTypeUploadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| ID for product |
 **componentRef** | **String**| ID for component |
 **testType** | **String**| Type of test to be imported (zap|cucumber|junit|hp-fortify) | [enum: zap, cucumber, junit, hp-fortify]
 **fileName** | **File**| File to upload | [optional]

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

