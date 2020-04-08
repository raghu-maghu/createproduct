# WeaknessesApi

All URIs are relative to *https://demo.iriusrisk.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut**](WeaknessesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses | Associates weakness to a threat in a risk pattern.
[**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut**](WeaknessesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses/{weaknessRef}/countermeasures | Associates a countermeasure to a weakness in a risk pattern.
[**librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost**](WeaknessesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost) | **POST** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/weaknesses | Creates a new weakness in a risk pattern
[**productsRefWeaknessesGet**](WeaknessesApi.md#productsRefWeaknessesGet) | **GET** /products/{ref}/weaknesses | Gets a list of all weaknesses of a product
[**productsRefWeaknessesTestStateGet**](WeaknessesApi.md#productsRefWeaknessesTestStateGet) | **GET** /products/{ref}/weaknesses/{test_state} | Gets a list of all weaknesses of a product filtered by test state


<a name="librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut"></a>
# **librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut**
> LibraryWeakness librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, jsonData)

Associates weakness to a threat in a risk pattern.

Associates weakness to a threat in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WeaknessesApi;


WeaknessesApi apiInstance = new WeaknessesApi();
String apiToken = "apiToken_example"; // String | Authentication token
String libraryRef = "libraryRef_example"; // String | Reference for library
String riskPatternRef = "riskPatternRef_example"; // String | Reference for Risk Pattern
String useCaseRef = "useCaseRef_example"; // String | Reference for Use Case
String threatRef = "threatRef_example"; // String | Reference for Threat
JsonData10 jsonData = new JsonData10(); // JsonData10 | JSON data that contains information of the fields
try {
    LibraryWeakness result = apiInstance.librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WeaknessesApi#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **libraryRef** | **String**| Reference for library |
 **riskPatternRef** | **String**| Reference for Risk Pattern |
 **useCaseRef** | **String**| Reference for Use Case |
 **threatRef** | **String**| Reference for Threat |
 **jsonData** | [**JsonData10**](JsonData10.md)| JSON data that contains information of the fields |

### Return type

[**LibraryWeakness**](LibraryWeakness.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut"></a>
# **librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut**
> LibraryControl librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, weaknessRef, jsonData)

Associates a countermeasure to a weakness in a risk pattern.

Associates a countermeasure to a weakness in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WeaknessesApi;


WeaknessesApi apiInstance = new WeaknessesApi();
String apiToken = "apiToken_example"; // String | Authentication token
String libraryRef = "libraryRef_example"; // String | Reference for library
String riskPatternRef = "riskPatternRef_example"; // String | Reference for Risk Pattern
String useCaseRef = "useCaseRef_example"; // String | Reference for Use Case
String threatRef = "threatRef_example"; // String | Reference for Threat
String weaknessRef = "weaknessRef_example"; // String | Reference for Weakness
JsonData11 jsonData = new JsonData11(); // JsonData11 | JSON data that contains information of the fields
try {
    LibraryControl result = apiInstance.librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, weaknessRef, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WeaknessesApi#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **libraryRef** | **String**| Reference for library |
 **riskPatternRef** | **String**| Reference for Risk Pattern |
 **useCaseRef** | **String**| Reference for Use Case |
 **threatRef** | **String**| Reference for Threat |
 **weaknessRef** | **String**| Reference for Weakness |
 **jsonData** | [**JsonData11**](JsonData11.md)| JSON data that contains information of the fields |

### Return type

[**LibraryControl**](LibraryControl.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost"></a>
# **librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost**
> LibraryWeakness librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost(apiToken, libraryRef, riskPatternRef, jsonData)

Creates a new weakness in a risk pattern

Creates a new Weakness in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WeaknessesApi;


WeaknessesApi apiInstance = new WeaknessesApi();
String apiToken = "apiToken_example"; // String | Authentication token
String libraryRef = "libraryRef_example"; // String | Reference for library
String riskPatternRef = "riskPatternRef_example"; // String | Reference for Risk Pattern
JsonData9 jsonData = new JsonData9(); // JsonData9 | JSON data that contains information of the fields
try {
    LibraryWeakness result = apiInstance.librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost(apiToken, libraryRef, riskPatternRef, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WeaknessesApi#librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **libraryRef** | **String**| Reference for library |
 **riskPatternRef** | **String**| Reference for Risk Pattern |
 **jsonData** | [**JsonData9**](JsonData9.md)| JSON data that contains information of the fields |

### Return type

[**LibraryWeakness**](LibraryWeakness.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="productsRefWeaknessesGet"></a>
# **productsRefWeaknessesGet**
> List&lt;ComponentWeakness&gt; productsRefWeaknessesGet(apiToken, ref)

Gets a list of all weaknesses of a product

Returns a list of all the weaknesses of a product. Conditions to be able to perform the action:   - To have the permission **THREAT_VIEW** granted, or   - To have the permission **THREAT_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WeaknessesApi;


WeaknessesApi apiInstance = new WeaknessesApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
try {
    List<ComponentWeakness> result = apiInstance.productsRefWeaknessesGet(apiToken, ref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WeaknessesApi#productsRefWeaknessesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| ID for product |

### Return type

[**List&lt;ComponentWeakness&gt;**](ComponentWeakness.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="productsRefWeaknessesTestStateGet"></a>
# **productsRefWeaknessesTestStateGet**
> List&lt;ComponentWeakness&gt; productsRefWeaknessesTestStateGet(apiToken, ref, testState)

Gets a list of all weaknesses of a product filtered by test state

Returns a list of all the weaknesses of a product. With the optional parameter &#x60;test_state&#x60; can filter the weakness by test state. Conditions to be able to perform the action:   - To have the permission **THREAT_VIEW** granted, or   - To have the permission **THREAT_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WeaknessesApi;


WeaknessesApi apiInstance = new WeaknessesApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
String testState = "testState_example"; // String | Code for a test state
try {
    List<ComponentWeakness> result = apiInstance.productsRefWeaknessesTestStateGet(apiToken, ref, testState);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WeaknessesApi#productsRefWeaknessesTestStateGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| ID for product |
 **testState** | **String**| Code for a test state | [enum: failed, error, not-tested, passed, not-applicable, partially-tested]

### Return type

[**List&lt;ComponentWeakness&gt;**](ComponentWeakness.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

