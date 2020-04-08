# RiskPatternsApi

All URIs are relative to *https://demo.iriusrisk.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**librariesLibraryRefRiskpatternsPost**](RiskPatternsApi.md#librariesLibraryRefRiskpatternsPost) | **POST** /libraries/{libraryRef}/riskpatterns | Creates new Risk Pattern
[**librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost**](RiskPatternsApi.md#librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost) | **POST** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/countermeasures | Creates new countermeasure in a risk pattern
[**librariesLibraryRefRiskpatternsRiskPatternRefDelete**](RiskPatternsApi.md#librariesLibraryRefRiskpatternsRiskPatternRefDelete) | **DELETE** /libraries/{libraryRef}/riskpatterns/{riskPatternRef} | Deletes a Risk Pattern
[**librariesLibraryRefRiskpatternsRiskPatternRefGet**](RiskPatternsApi.md#librariesLibraryRefRiskpatternsRiskPatternRefGet) | **GET** /libraries/{libraryRef}/riskpatterns/{riskPatternRef} | Gets Risk Pattern details
[**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut**](RiskPatternsApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses | Associates weakness to a threat in a risk pattern.
[**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut**](RiskPatternsApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses/{weaknessRef}/countermeasures | Associates a countermeasure to a weakness in a risk pattern.
[**librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost**](RiskPatternsApi.md#librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost) | **POST** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/weaknesses | Creates a new weakness in a risk pattern


<a name="librariesLibraryRefRiskpatternsPost"></a>
# **librariesLibraryRefRiskpatternsPost**
> RiskPattern librariesLibraryRefRiskpatternsPost(apiToken, libraryRef, jsonData)

Creates new Risk Pattern

Creates new Risk Pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RiskPatternsApi;


RiskPatternsApi apiInstance = new RiskPatternsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String libraryRef = "libraryRef_example"; // String | Reference for library
JsonData6 jsonData = new JsonData6(); // JsonData6 | JSON data that contains information of the fields
try {
    RiskPattern result = apiInstance.librariesLibraryRefRiskpatternsPost(apiToken, libraryRef, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RiskPatternsApi#librariesLibraryRefRiskpatternsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **libraryRef** | **String**| Reference for library |
 **jsonData** | [**JsonData6**](JsonData6.md)| JSON data that contains information of the fields |

### Return type

[**RiskPattern**](RiskPattern.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost"></a>
# **librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost**
> LibraryControl librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost(apiToken, libraryRef, riskPatternRef, jsonData)

Creates new countermeasure in a risk pattern

Creates new countermeasure in a risk pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RiskPatternsApi;


RiskPatternsApi apiInstance = new RiskPatternsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String libraryRef = "libraryRef_example"; // String | Reference for library
String riskPatternRef = "riskPatternRef_example"; // String | Reference for Risk Pattern
ControlCommand jsonData = new ControlCommand(); // ControlCommand | JSON data that contains information of the fields
try {
    LibraryControl result = apiInstance.librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost(apiToken, libraryRef, riskPatternRef, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RiskPatternsApi#librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **libraryRef** | **String**| Reference for library |
 **riskPatternRef** | **String**| Reference for Risk Pattern |
 **jsonData** | [**ControlCommand**](ControlCommand.md)| JSON data that contains information of the fields |

### Return type

[**LibraryControl**](LibraryControl.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="librariesLibraryRefRiskpatternsRiskPatternRefDelete"></a>
# **librariesLibraryRefRiskpatternsRiskPatternRefDelete**
> librariesLibraryRefRiskpatternsRiskPatternRefDelete(apiToken, libraryRef, riskPatternRef)

Deletes a Risk Pattern

Deletes a Risk Pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RiskPatternsApi;


RiskPatternsApi apiInstance = new RiskPatternsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String libraryRef = "libraryRef_example"; // String | Reference for library
String riskPatternRef = "riskPatternRef_example"; // String | Reference for Risk Pattern
try {
    apiInstance.librariesLibraryRefRiskpatternsRiskPatternRefDelete(apiToken, libraryRef, riskPatternRef);
} catch (ApiException e) {
    System.err.println("Exception when calling RiskPatternsApi#librariesLibraryRefRiskpatternsRiskPatternRefDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **libraryRef** | **String**| Reference for library |
 **riskPatternRef** | **String**| Reference for Risk Pattern |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="librariesLibraryRefRiskpatternsRiskPatternRefGet"></a>
# **librariesLibraryRefRiskpatternsRiskPatternRefGet**
> RiskPattern librariesLibraryRefRiskpatternsRiskPatternRefGet(apiToken, libraryRef, riskPatternRef)

Gets Risk Pattern details

Gets Risk Pattern details. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RiskPatternsApi;


RiskPatternsApi apiInstance = new RiskPatternsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String libraryRef = "libraryRef_example"; // String | Reference for library
String riskPatternRef = "riskPatternRef_example"; // String | Reference for Risk Pattern
try {
    RiskPattern result = apiInstance.librariesLibraryRefRiskpatternsRiskPatternRefGet(apiToken, libraryRef, riskPatternRef);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RiskPatternsApi#librariesLibraryRefRiskpatternsRiskPatternRefGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **libraryRef** | **String**| Reference for library |
 **riskPatternRef** | **String**| Reference for Risk Pattern |

### Return type

[**RiskPattern**](RiskPattern.md)

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
//import io.swagger.client.api.RiskPatternsApi;


RiskPatternsApi apiInstance = new RiskPatternsApi();
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
    System.err.println("Exception when calling RiskPatternsApi#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut");
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
//import io.swagger.client.api.RiskPatternsApi;


RiskPatternsApi apiInstance = new RiskPatternsApi();
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
    System.err.println("Exception when calling RiskPatternsApi#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut");
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
//import io.swagger.client.api.RiskPatternsApi;


RiskPatternsApi apiInstance = new RiskPatternsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String libraryRef = "libraryRef_example"; // String | Reference for library
String riskPatternRef = "riskPatternRef_example"; // String | Reference for Risk Pattern
JsonData9 jsonData = new JsonData9(); // JsonData9 | JSON data that contains information of the fields
try {
    LibraryWeakness result = apiInstance.librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost(apiToken, libraryRef, riskPatternRef, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RiskPatternsApi#librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost");
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

