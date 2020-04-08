# ThreatsApi

All URIs are relative to *https://demo.iriusrisk.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost**](ThreatsApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost) | **POST** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats | Creates a new threat in a library.
[**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut**](ThreatsApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/countermeasures | Associates a countermeasure to a threat in a risk pattern.
[**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut**](ThreatsApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses | Associates weakness to a threat in a risk pattern.
[**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut**](ThreatsApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses/{weaknessRef}/countermeasures | Associates a countermeasure to a weakness in a risk pattern.
[**productsRefThreatsGet**](ThreatsApi.md#productsRefThreatsGet) | **GET** /products/{ref}/threats | Gets a list of all threats of a product


<a name="librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost"></a>
# **librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost**
> LibraryThreat librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost(apiToken, libraryRef, riskPatternRef, useCaseRef, jsonData)

Creates a new threat in a library.

Creates a new threat in a library. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ThreatsApi;


ThreatsApi apiInstance = new ThreatsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String libraryRef = "libraryRef_example"; // String | Reference for library
String riskPatternRef = "riskPatternRef_example"; // String | Reference for Risk Pattern
String useCaseRef = "useCaseRef_example"; // String | Reference for Use Case
JsonData8 jsonData = new JsonData8(); // JsonData8 | JSON data that contains information of the fields
try {
    LibraryThreat result = apiInstance.librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost(apiToken, libraryRef, riskPatternRef, useCaseRef, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ThreatsApi#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost");
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
 **jsonData** | [**JsonData8**](JsonData8.md)| JSON data that contains information of the fields |

### Return type

[**LibraryThreat**](LibraryThreat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut"></a>
# **librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut**
> LibraryControl librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, jsonData)

Associates a countermeasure to a threat in a risk pattern.

Associates a countermeasure to a threat in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ThreatsApi;


ThreatsApi apiInstance = new ThreatsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String libraryRef = "libraryRef_example"; // String | Reference for library
String riskPatternRef = "riskPatternRef_example"; // String | Reference for Risk Pattern
String useCaseRef = "useCaseRef_example"; // String | Reference for Use Case
String threatRef = "threatRef_example"; // String | Reference for Threat
JsonData12 jsonData = new JsonData12(); // JsonData12 | JSON data that contains information of the fields
try {
    LibraryControl result = apiInstance.librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ThreatsApi#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut");
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
 **jsonData** | [**JsonData12**](JsonData12.md)| JSON data that contains information of the fields |

### Return type

[**LibraryControl**](LibraryControl.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut"></a>
# **librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut**
> LibraryWeakness librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut(apiToken, libraryRef, riskPatternRef, useCaseRef, threatRef, jsonData)

Associates weakness to a threat in a risk pattern.

Associates weakness to a threat in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ThreatsApi;


ThreatsApi apiInstance = new ThreatsApi();
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
    System.err.println("Exception when calling ThreatsApi#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut");
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
//import io.swagger.client.api.ThreatsApi;


ThreatsApi apiInstance = new ThreatsApi();
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
    System.err.println("Exception when calling ThreatsApi#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut");
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

<a name="productsRefThreatsGet"></a>
# **productsRefThreatsGet**
> List&lt;ComponentUseCaseThreatShort&gt; productsRefThreatsGet(apiToken, ref)

Gets a list of all threats of a product

Returns a list of all the threats of a product. Conditions to be able to perform the action:   - To have the permission **THREAT_VIEW** granted, or   - To have the permission **THREAT_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ThreatsApi;


ThreatsApi apiInstance = new ThreatsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
try {
    List<ComponentUseCaseThreatShort> result = apiInstance.productsRefThreatsGet(apiToken, ref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ThreatsApi#productsRefThreatsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| ID for product |

### Return type

[**List&lt;ComponentUseCaseThreatShort&gt;**](ComponentUseCaseThreatShort.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

