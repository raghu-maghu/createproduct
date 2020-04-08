# LibrariesApi

All URIs are relative to *https://demo.iriusrisk.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**librariesLibraryRefDelete**](LibrariesApi.md#librariesLibraryRefDelete) | **DELETE** /libraries/{libraryRef} | Deletes a Library
[**librariesLibraryRefGet**](LibrariesApi.md#librariesLibraryRefGet) | **GET** /libraries/{libraryRef} | Gets library details
[**librariesLibraryRefRiskpatternsPost**](LibrariesApi.md#librariesLibraryRefRiskpatternsPost) | **POST** /libraries/{libraryRef}/riskpatterns | Creates new Risk Pattern
[**librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost**](LibrariesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost) | **POST** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/countermeasures | Creates new countermeasure in a risk pattern
[**librariesLibraryRefRiskpatternsRiskPatternRefDelete**](LibrariesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefDelete) | **DELETE** /libraries/{libraryRef}/riskpatterns/{riskPatternRef} | Deletes a Risk Pattern
[**librariesLibraryRefRiskpatternsRiskPatternRefGet**](LibrariesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefGet) | **GET** /libraries/{libraryRef}/riskpatterns/{riskPatternRef} | Gets Risk Pattern details
[**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesPost**](LibrariesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesPost) | **POST** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases | Creates new use case in a library.
[**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost**](LibrariesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost) | **POST** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats | Creates a new threat in a library.
[**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut**](LibrariesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/countermeasures | Associates a countermeasure to a threat in a risk pattern.
[**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut**](LibrariesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses | Associates weakness to a threat in a risk pattern.
[**librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut**](LibrariesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut) | **PUT** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/usecases/{useCaseRef}/threats/{threatRef}/weaknesses/{weaknessRef}/countermeasures | Associates a countermeasure to a weakness in a risk pattern.
[**librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost**](LibrariesApi.md#librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost) | **POST** /libraries/{libraryRef}/riskpatterns/{riskPatternRef}/weaknesses | Creates a new weakness in a risk pattern
[**librariesPost**](LibrariesApi.md#librariesPost) | **POST** /libraries | Creates a Library
[**productsUploadPost**](LibrariesApi.md#productsUploadPost) | **POST** /products/upload | Creates a new product, library or template from a XML file upload.


<a name="librariesLibraryRefDelete"></a>
# **librariesLibraryRefDelete**
> librariesLibraryRefDelete(apiToken, libraryRef)

Deletes a Library

Deletes a library. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LibrariesApi;


LibrariesApi apiInstance = new LibrariesApi();
String apiToken = "apiToken_example"; // String | Authentication token
String libraryRef = "libraryRef_example"; // String | Reference for library
try {
    apiInstance.librariesLibraryRefDelete(apiToken, libraryRef);
} catch (ApiException e) {
    System.err.println("Exception when calling LibrariesApi#librariesLibraryRefDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **libraryRef** | **String**| Reference for library |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="librariesLibraryRefGet"></a>
# **librariesLibraryRefGet**
> Library librariesLibraryRefGet(apiToken, libraryRef)

Gets library details

Gets the library details. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LibrariesApi;


LibrariesApi apiInstance = new LibrariesApi();
String apiToken = "apiToken_example"; // String | Authentication token
String libraryRef = "libraryRef_example"; // String | Reference for library
try {
    Library result = apiInstance.librariesLibraryRefGet(apiToken, libraryRef);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibrariesApi#librariesLibraryRefGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **libraryRef** | **String**| Reference for library |

### Return type

[**Library**](Library.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="librariesLibraryRefRiskpatternsPost"></a>
# **librariesLibraryRefRiskpatternsPost**
> RiskPattern librariesLibraryRefRiskpatternsPost(apiToken, libraryRef, jsonData)

Creates new Risk Pattern

Creates new Risk Pattern. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LibrariesApi;


LibrariesApi apiInstance = new LibrariesApi();
String apiToken = "apiToken_example"; // String | Authentication token
String libraryRef = "libraryRef_example"; // String | Reference for library
JsonData6 jsonData = new JsonData6(); // JsonData6 | JSON data that contains information of the fields
try {
    RiskPattern result = apiInstance.librariesLibraryRefRiskpatternsPost(apiToken, libraryRef, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibrariesApi#librariesLibraryRefRiskpatternsPost");
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
//import io.swagger.client.api.LibrariesApi;


LibrariesApi apiInstance = new LibrariesApi();
String apiToken = "apiToken_example"; // String | Authentication token
String libraryRef = "libraryRef_example"; // String | Reference for library
String riskPatternRef = "riskPatternRef_example"; // String | Reference for Risk Pattern
ControlCommand jsonData = new ControlCommand(); // ControlCommand | JSON data that contains information of the fields
try {
    LibraryControl result = apiInstance.librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost(apiToken, libraryRef, riskPatternRef, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibrariesApi#librariesLibraryRefRiskpatternsRiskPatternRefCountermeasuresPost");
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
//import io.swagger.client.api.LibrariesApi;


LibrariesApi apiInstance = new LibrariesApi();
String apiToken = "apiToken_example"; // String | Authentication token
String libraryRef = "libraryRef_example"; // String | Reference for library
String riskPatternRef = "riskPatternRef_example"; // String | Reference for Risk Pattern
try {
    apiInstance.librariesLibraryRefRiskpatternsRiskPatternRefDelete(apiToken, libraryRef, riskPatternRef);
} catch (ApiException e) {
    System.err.println("Exception when calling LibrariesApi#librariesLibraryRefRiskpatternsRiskPatternRefDelete");
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
//import io.swagger.client.api.LibrariesApi;


LibrariesApi apiInstance = new LibrariesApi();
String apiToken = "apiToken_example"; // String | Authentication token
String libraryRef = "libraryRef_example"; // String | Reference for library
String riskPatternRef = "riskPatternRef_example"; // String | Reference for Risk Pattern
try {
    RiskPattern result = apiInstance.librariesLibraryRefRiskpatternsRiskPatternRefGet(apiToken, libraryRef, riskPatternRef);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibrariesApi#librariesLibraryRefRiskpatternsRiskPatternRefGet");
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

<a name="librariesLibraryRefRiskpatternsRiskPatternRefUsecasesPost"></a>
# **librariesLibraryRefRiskpatternsRiskPatternRefUsecasesPost**
> LibraryUseCase librariesLibraryRefRiskpatternsRiskPatternRefUsecasesPost(apiToken, libraryRef, riskPatternRef, jsonData)

Creates new use case in a library.

Creates new use case in a library. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LibrariesApi;


LibrariesApi apiInstance = new LibrariesApi();
String apiToken = "apiToken_example"; // String | Authentication token
String libraryRef = "libraryRef_example"; // String | Reference for library
String riskPatternRef = "riskPatternRef_example"; // String | Reference for Risk Pattern
JsonData7 jsonData = new JsonData7(); // JsonData7 | JSON data that contains information of the fields
try {
    LibraryUseCase result = apiInstance.librariesLibraryRefRiskpatternsRiskPatternRefUsecasesPost(apiToken, libraryRef, riskPatternRef, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibrariesApi#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **libraryRef** | **String**| Reference for library |
 **riskPatternRef** | **String**| Reference for Risk Pattern |
 **jsonData** | [**JsonData7**](JsonData7.md)| JSON data that contains information of the fields |

### Return type

[**LibraryUseCase**](LibraryUseCase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost"></a>
# **librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost**
> LibraryThreat librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost(apiToken, libraryRef, riskPatternRef, useCaseRef, jsonData)

Creates a new threat in a library.

Creates a new threat in a library. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LibrariesApi;


LibrariesApi apiInstance = new LibrariesApi();
String apiToken = "apiToken_example"; // String | Authentication token
String libraryRef = "libraryRef_example"; // String | Reference for library
String riskPatternRef = "riskPatternRef_example"; // String | Reference for Risk Pattern
String useCaseRef = "useCaseRef_example"; // String | Reference for Use Case
JsonData8 jsonData = new JsonData8(); // JsonData8 | JSON data that contains information of the fields
try {
    LibraryThreat result = apiInstance.librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost(apiToken, libraryRef, riskPatternRef, useCaseRef, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibrariesApi#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsPost");
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
//import io.swagger.client.api.LibrariesApi;


LibrariesApi apiInstance = new LibrariesApi();
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
    System.err.println("Exception when calling LibrariesApi#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefCountermeasuresPut");
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
//import io.swagger.client.api.LibrariesApi;


LibrariesApi apiInstance = new LibrariesApi();
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
    System.err.println("Exception when calling LibrariesApi#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesPut");
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
//import io.swagger.client.api.LibrariesApi;


LibrariesApi apiInstance = new LibrariesApi();
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
    System.err.println("Exception when calling LibrariesApi#librariesLibraryRefRiskpatternsRiskPatternRefUsecasesUseCaseRefThreatsThreatRefWeaknessesWeaknessRefCountermeasuresPut");
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
//import io.swagger.client.api.LibrariesApi;


LibrariesApi apiInstance = new LibrariesApi();
String apiToken = "apiToken_example"; // String | Authentication token
String libraryRef = "libraryRef_example"; // String | Reference for library
String riskPatternRef = "riskPatternRef_example"; // String | Reference for Risk Pattern
JsonData9 jsonData = new JsonData9(); // JsonData9 | JSON data that contains information of the fields
try {
    LibraryWeakness result = apiInstance.librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost(apiToken, libraryRef, riskPatternRef, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibrariesApi#librariesLibraryRefRiskpatternsRiskPatternRefWeaknessesPost");
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

<a name="librariesPost"></a>
# **librariesPost**
> Library librariesPost(apiToken, jsonData)

Creates a Library

Creates a new empty Library. Conditions to be able to perform the action:   - To have the permission **LIBRARY_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LibrariesApi;


LibrariesApi apiInstance = new LibrariesApi();
String apiToken = "apiToken_example"; // String | Authentication token
JsonData5 jsonData = new JsonData5(); // JsonData5 | JSON data that contains information of the fields
try {
    Library result = apiInstance.librariesPost(apiToken, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibrariesApi#librariesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **jsonData** | [**JsonData5**](JsonData5.md)| JSON data that contains information of the fields |

### Return type

[**Library**](Library.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="productsUploadPost"></a>
# **productsUploadPost**
> ProductShort productsUploadPost(apiToken, ref, name, fileName, type)

Creates a new product, library or template from a XML file upload.

Creates a new product, library or template from a XML file upload. Conditions to be able to perform the action: - To have the permission **PRODUCT_CREATE** granted allows to create a product. - To have the permission **LIBRARY_UPDATE** granted allows to create a library. - To have the permission **TEMPLATE_UPDATE** granted allows to create a template. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LibrariesApi;


LibrariesApi apiInstance = new LibrariesApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | Product ref
String name = "name_example"; // String | Product name
File fileName = new File("/path/to/file.txt"); // File | File to upload in XML format
String type = "type_example"; // String | Product type - STANDARD (By default), TEMPLATE or LIBRARY
try {
    ProductShort result = apiInstance.productsUploadPost(apiToken, ref, name, fileName, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LibrariesApi#productsUploadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| Product ref |
 **name** | **String**| Product name |
 **fileName** | **File**| File to upload in XML format |
 **type** | **String**| Product type - STANDARD (By default), TEMPLATE or LIBRARY | [optional]

### Return type

[**ProductShort**](ProductShort.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

