# ProductsApi

All URIs are relative to *https://demo.iriusrisk.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productsGet**](ProductsApi.md#productsGet) | **GET** /products | Gets a list of all products.
[**productsPost**](ProductsApi.md#productsPost) | **POST** /products | Creates a new product
[**productsRefComponentsComponentRefControlsControlRefStatusPut**](ProductsApi.md#productsRefComponentsComponentRefControlsControlRefStatusPut) | **PUT** /products/{ref}/components/{componentRef}/controls/{controlRef}/status | Sets the desired status to a countermeasure
[**productsRefComponentsComponentRefTestsCwePut**](ProductsApi.md#productsRefComponentsComponentRefTestsCwePut) | **PUT** /products/{ref}/components/{componentRef}/tests/{cwe} | Updates a single test to a component.
[**productsRefComponentsComponentRefTestsTestTypeUploadPost**](ProductsApi.md#productsRefComponentsComponentRefTestsTestTypeUploadPost) | **POST** /products/{ref}/components/{componentRef}/tests/{testType}/upload | Imports test results from different sources to a component
[**productsRefControlsGet**](ProductsApi.md#productsRefControlsGet) | **GET** /products/{ref}/controls | Gets a list of all product countermeasures
[**productsRefControlsImplementedGet**](ProductsApi.md#productsRefControlsImplementedGet) | **GET** /products/{ref}/controls/implemented | Gets a list of all implemented countermeasures of a product.
[**productsRefControlsRequiredGet**](ProductsApi.md#productsRefControlsRequiredGet) | **GET** /products/{ref}/controls/required | Gets a list of all required countermeasures of a product
[**productsRefDelete**](ProductsApi.md#productsRefDelete) | **DELETE** /products/{ref} | Deletes a product
[**productsRefGet**](ProductsApi.md#productsRefGet) | **GET** /products/{ref} | Gets product details
[**productsRefGroupsDelete**](ProductsApi.md#productsRefGroupsDelete) | **DELETE** /products/{ref}/groups | Unassigns a list of user groups from a product.
[**productsRefGroupsGet**](ProductsApi.md#productsRefGroupsGet) | **GET** /products/{ref}/groups | List all groups assigned to a product
[**productsRefGroupsPut**](ProductsApi.md#productsRefGroupsPut) | **PUT** /products/{ref}/groups | Assigns groups of users to a product.
[**productsRefPut**](ProductsApi.md#productsRefPut) | **PUT** /products/{ref} | Updates a product
[**productsRefRisksGet**](ProductsApi.md#productsRefRisksGet) | **GET** /products/{ref}/risks | Gets the risks summary of a product
[**productsRefTestsTestTypeUploadPost**](ProductsApi.md#productsRefTestsTestTypeUploadPost) | **POST** /products/{ref}/tests/{testType}/upload | Imports test results from different sources to a product.
[**productsRefThreatsGet**](ProductsApi.md#productsRefThreatsGet) | **GET** /products/{ref}/threats | Gets a list of all threats of a product
[**productsRefUsersDelete**](ProductsApi.md#productsRefUsersDelete) | **DELETE** /products/{ref}/users | Unassigns a list of users from a product.
[**productsRefUsersGet**](ProductsApi.md#productsRefUsersGet) | **GET** /products/{ref}/users | List all users assigned to a product
[**productsRefUsersPut**](ProductsApi.md#productsRefUsersPut) | **PUT** /products/{ref}/users | Assigns users to a product.
[**productsRefUsersUserDelete**](ProductsApi.md#productsRefUsersUserDelete) | **DELETE** /products/{ref}/users/{user} | Unassigns a user from a product
[**productsRefWeaknessesGet**](ProductsApi.md#productsRefWeaknessesGet) | **GET** /products/{ref}/weaknesses | Gets a list of all weaknesses of a product
[**productsRefWeaknessesTestStateGet**](ProductsApi.md#productsRefWeaknessesTestStateGet) | **GET** /products/{ref}/weaknesses/{test_state} | Gets a list of all weaknesses of a product filtered by test state
[**productsUploadPost**](ProductsApi.md#productsUploadPost) | **POST** /products/upload | Creates a new product, library or template from a XML file upload.
[**productsUploadRefPost**](ProductsApi.md#productsUploadRefPost) | **POST** /products/upload/{ref} | Updates an existing product from a XML file upload.
[**rulesProductRefPut**](ProductsApi.md#rulesProductRefPut) | **PUT** /rules/product/{ref} | Executes rules by a product


<a name="productsGet"></a>
# **productsGet**
> List&lt;ProductShort&gt; productsGet(apiToken)

Gets a list of all products.

Gets a list of all products visible by the user who perform the call. Conditions to be able to perform the action:   - No permissions are required to perform this action. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
try {
    List<ProductShort> result = apiInstance.productsGet(apiToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |

### Return type

[**List&lt;ProductShort&gt;**](ProductShort.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="productsPost"></a>
# **productsPost**
> ProductShort productsPost(apiToken, jsonData)

Creates a new product

Createa a new product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_CREATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
CreateProduct jsonData = new CreateProduct(); // CreateProduct | JSON data that contains information to create new product
try {
    ProductShort result = apiInstance.productsPost(apiToken, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **jsonData** | [**CreateProduct**](CreateProduct.md)| JSON data that contains information to create new product |

### Return type

[**ProductShort**](ProductShort.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="productsRefComponentsComponentRefControlsControlRefStatusPut"></a>
# **productsRefComponentsComponentRefControlsControlRefStatusPut**
> productsRefComponentsComponentRefControlsControlRefStatusPut(apiToken, ref, componentRef, controlRef, jsonData)

Sets the desired status to a countermeasure

Sets the desired status to a countermeasure. Possible values are:             - implemented             - recommended             - rejected             - required Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_UPDATE** granted to set any state.   - To have the permission **COUNTERMEASURE_SELECT_IMPLEMENTED** granted to set implemented state.   - To have the permission **COUNTERMEASURE_SELECT_RECOMMENDED** granted to set recommended state.   - To have the permission **COUNTERMEASURE_SELECT_REJECTED** granted to set reject state.   - To have the permission **COUNTERMEASURE_SELECT_REQUIRED** granted to set required state. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
String componentRef = "componentRef_example"; // String | ID for component
String controlRef = "controlRef_example"; // String | Control ref
JsonData17 jsonData = new JsonData17(); // JsonData17 | JSON data that contains the information to update countermeasure
try {
    apiInstance.productsRefComponentsComponentRefControlsControlRefStatusPut(apiToken, ref, componentRef, controlRef, jsonData);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsRefComponentsComponentRefControlsControlRefStatusPut");
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

<a name="productsRefComponentsComponentRefTestsCwePut"></a>
# **productsRefComponentsComponentRefTestsCwePut**
> List&lt;InlineResponse2001&gt; productsRefComponentsComponentRefTestsCwePut(apiToken, ref, componentRef, cwe, jsonData)

Updates a single test to a component.

Updates a single test to a component. Conditions to be able to perform the action:   - To have the permission **TEST_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
String componentRef = "componentRef_example"; // String | ID for component
String cwe = "cwe_example"; // String | countermeasure or weakness CWE
JsonData18 jsonData = new JsonData18(); // JsonData18 | JSON data that contains the information to update test
try {
    List<InlineResponse2001> result = apiInstance.productsRefComponentsComponentRefTestsCwePut(apiToken, ref, componentRef, cwe, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsRefComponentsComponentRefTestsCwePut");
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
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
String componentRef = "componentRef_example"; // String | ID for component
String testType = "testType_example"; // String | Type of test to be imported (zap|cucumber|junit|hp-fortify)
File fileName = new File("/path/to/file.txt"); // File | File to upload
try {
    InlineResponse2011 result = apiInstance.productsRefComponentsComponentRefTestsTestTypeUploadPost(apiToken, ref, componentRef, testType, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsRefComponentsComponentRefTestsTestTypeUploadPost");
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

<a name="productsRefControlsGet"></a>
# **productsRefControlsGet**
> List&lt;ComponentControl&gt; productsRefControlsGet(apiToken, ref)

Gets a list of all product countermeasures

Returns a list of all the countermeasures of a product. Conditions to be able to perform the action:   - To have the permission **COUNTERMEASURE_VIEW** granted, or   - To have the permission **COUNTERMEASURE_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
try {
    List<ComponentControl> result = apiInstance.productsRefControlsGet(apiToken, ref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsRefControlsGet");
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
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
try {
    List<ComponentControl> result = apiInstance.productsRefControlsImplementedGet(apiToken, ref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsRefControlsImplementedGet");
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
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
try {
    List<ComponentControl> result = apiInstance.productsRefControlsRequiredGet(apiToken, ref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsRefControlsRequiredGet");
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

<a name="productsRefDelete"></a>
# **productsRefDelete**
> productsRefDelete(apiToken, ref)

Deletes a product

Deletes a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_DELETE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
try {
    apiInstance.productsRefDelete(apiToken, ref);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsRefDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| ID for product |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="productsRefGet"></a>
# **productsRefGet**
> Product productsRefGet(apiToken, ref)

Gets product details

Gets the details of a product. Conditions to be able to perform the action:   - No permissions are required to perform this action. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
try {
    Product result = apiInstance.productsRefGet(apiToken, ref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsRefGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| ID for product |

### Return type

[**Product**](Product.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="productsRefGroupsDelete"></a>
# **productsRefGroupsDelete**
> InlineResponse200 productsRefGroupsDelete(apiToken, ref, jsonData)

Unassigns a list of user groups from a product.

Unassigns a list of user groups from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | Reference for product
JsonData14 jsonData = new JsonData14(); // JsonData14 | JSON object that contains information to unassign groups from a product
try {
    InlineResponse200 result = apiInstance.productsRefGroupsDelete(apiToken, ref, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsRefGroupsDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| Reference for product |
 **jsonData** | [**JsonData14**](JsonData14.md)| JSON object that contains information to unassign groups from a product |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="productsRefGroupsGet"></a>
# **productsRefGroupsGet**
> List&lt;String&gt; productsRefGroupsGet(apiToken, ref)

List all groups assigned to a product

List all groups assigned to a product.     Conditions to be able to perform the action:         - If the caller has the PRODUCTS_LIST_ALL permission then all products can be queried without restriction.         - Without the PRODUCTS_LIST_ALL permission, the call will only return the groups if the caller belongs to that product. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | Reference to product
try {
    List<String> result = apiInstance.productsRefGroupsGet(apiToken, ref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsRefGroupsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| Reference to product |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="productsRefGroupsPut"></a>
# **productsRefGroupsPut**
> ProductShortGroups productsRefGroupsPut(apiToken, ref, jsonData)

Assigns groups of users to a product.

Assigns groups of users to a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | Reference for product
JsonData13 jsonData = new JsonData13(); // JsonData13 | JSON object that contains information to assign groups to product
try {
    ProductShortGroups result = apiInstance.productsRefGroupsPut(apiToken, ref, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsRefGroupsPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| Reference for product |
 **jsonData** | [**JsonData13**](JsonData13.md)| JSON object that contains information to assign groups to product |

### Return type

[**ProductShortGroups**](ProductShortGroups.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="productsRefPut"></a>
# **productsRefPut**
> productsRefPut(apiToken, ref, jsonData)

Updates a product

Updates the details of a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
UpdateProduct jsonData = new UpdateProduct(); // UpdateProduct | JSON data that contains product details to update
try {
    apiInstance.productsRefPut(apiToken, ref, jsonData);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsRefPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| ID for product |
 **jsonData** | [**UpdateProduct**](UpdateProduct.md)| JSON data that contains product details to update |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="productsRefRisksGet"></a>
# **productsRefRisksGet**
> RiskSummary productsRefRisksGet(apiToken, ref)

Gets the risks summary of a product

This endpoint returns a summary of the risks of a product. Conditions to be able to perform the action:   - No permissions are required to perform this action. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
try {
    RiskSummary result = apiInstance.productsRefRisksGet(apiToken, ref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsRefRisksGet");
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

<a name="productsRefTestsTestTypeUploadPost"></a>
# **productsRefTestsTestTypeUploadPost**
> InlineResponse2011 productsRefTestsTestTypeUploadPost(apiToken, ref, testType, fileName)

Imports test results from different sources to a product.

Imports test results from different sources (OWASP ZAP, Cucumber, Micro Focus Fortify) uploading files. More than one file can be attached to the call. Conditions to be able to perform the action:   - To have the permission **TEST_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
String testType = "testType_example"; // String | Type of test to be imported (zap|cucumber|junit|hp-fortify)
File fileName = new File("/path/to/file.txt"); // File | File to upload
try {
    InlineResponse2011 result = apiInstance.productsRefTestsTestTypeUploadPost(apiToken, ref, testType, fileName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsRefTestsTestTypeUploadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| ID for product |
 **testType** | **String**| Type of test to be imported (zap|cucumber|junit|hp-fortify) | [enum: zap, cucumber, junit, hp-fortify]
 **fileName** | **File**| File to upload | [optional]

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
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
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
try {
    List<ComponentUseCaseThreatShort> result = apiInstance.productsRefThreatsGet(apiToken, ref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsRefThreatsGet");
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

<a name="productsRefUsersDelete"></a>
# **productsRefUsersDelete**
> productsRefUsersDelete(apiToken, ref, jsonData)

Unassigns a list of users from a product.

Unassign a list of users from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | Reference for product
JsonData16 jsonData = new JsonData16(); // JsonData16 | JSON object that contains information to unassign users from product
try {
    apiInstance.productsRefUsersDelete(apiToken, ref, jsonData);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsRefUsersDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| Reference for product |
 **jsonData** | [**JsonData16**](JsonData16.md)| JSON object that contains information to unassign users from product |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="productsRefUsersGet"></a>
# **productsRefUsersGet**
> List&lt;String&gt; productsRefUsersGet(apiToken, ref)

List all users assigned to a product

List all users assigned to a product.     Conditions to be able to perform the action:         - No permissions are required to perform this action. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | Reference to product
try {
    List<String> result = apiInstance.productsRefUsersGet(apiToken, ref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsRefUsersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| Reference to product |

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="productsRefUsersPut"></a>
# **productsRefUsersPut**
> ProductShortUsers productsRefUsersPut(apiToken, ref, jsonData)

Assigns users to a product.

Assigns users to a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | Reference for product
JsonData15 jsonData = new JsonData15(); // JsonData15 | JSON data that contains the information to assign users to product
try {
    ProductShortUsers result = apiInstance.productsRefUsersPut(apiToken, ref, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsRefUsersPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| Reference for product |
 **jsonData** | [**JsonData15**](JsonData15.md)| JSON data that contains the information to assign users to product |

### Return type

[**ProductShortUsers**](ProductShortUsers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="productsRefUsersUserDelete"></a>
# **productsRefUsersUserDelete**
> productsRefUsersUserDelete(apiToken, ref, user)

Unassigns a user from a product

Unassigns a user from a product. Conditions to be able to perform the action:   - To have the permission **PRODUCT_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | Reference for product
String user = "user_example"; // String | Username of the user who will be unassigned from the product
try {
    apiInstance.productsRefUsersUserDelete(apiToken, ref, user);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsRefUsersUserDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| Reference for product |
 **user** | **String**| Username of the user who will be unassigned from the product |

### Return type

null (empty response body)

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
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
try {
    List<ComponentWeakness> result = apiInstance.productsRefWeaknessesGet(apiToken, ref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsRefWeaknessesGet");
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
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
String testState = "testState_example"; // String | Code for a test state
try {
    List<ComponentWeakness> result = apiInstance.productsRefWeaknessesTestStateGet(apiToken, ref, testState);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsRefWeaknessesTestStateGet");
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

<a name="productsUploadPost"></a>
# **productsUploadPost**
> ProductShort productsUploadPost(apiToken, ref, name, fileName, type)

Creates a new product, library or template from a XML file upload.

Creates a new product, library or template from a XML file upload. Conditions to be able to perform the action: - To have the permission **PRODUCT_CREATE** granted allows to create a product. - To have the permission **LIBRARY_UPDATE** granted allows to create a library. - To have the permission **TEMPLATE_UPDATE** granted allows to create a template. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | Product ref
String name = "name_example"; // String | Product name
File fileName = new File("/path/to/file.txt"); // File | File to upload in XML format
String type = "type_example"; // String | Product type - STANDARD (By default), TEMPLATE or LIBRARY
try {
    ProductShort result = apiInstance.productsUploadPost(apiToken, ref, name, fileName, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsUploadPost");
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

<a name="productsUploadRefPost"></a>
# **productsUploadRefPost**
> ProductShort productsUploadRefPost(apiToken, ref, fileName, deleteCountermeasures)

Updates an existing product from a XML file upload.

Updates a product from a XML file upload. Conditions to be able to perform the action: - To have the permission **PRODUCT_UPDATE** granted allows to update a product. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for product
File fileName = new File("/path/to/file.txt"); // File | File to upload in XML format
String deleteCountermeasures = "deleteCountermeasures_example"; // String | This flag indicates if the rules execution will delete the threat and countermeasures which don't apply to the new product threat model. If true, the threats and countermeasures will be automatically removed from the model. If false, the threats and countermeasures won't be removed from the model.
try {
    ProductShort result = apiInstance.productsUploadRefPost(apiToken, ref, fileName, deleteCountermeasures);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#productsUploadRefPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **ref** | **String**| ID for product |
 **fileName** | **File**| File to upload in XML format |
 **deleteCountermeasures** | **String**| This flag indicates if the rules execution will delete the threat and countermeasures which don&#39;t apply to the new product threat model. If true, the threats and countermeasures will be automatically removed from the model. If false, the threats and countermeasures won&#39;t be removed from the model. | [optional]

### Return type

[**ProductShort**](ProductShort.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="rulesProductRefPut"></a>
# **rulesProductRefPut**
> rulesProductRefPut(apiToken, ref, deleteCountermeasures)

Executes rules by a product

Execute the rules engine for a product and for all components within the product.  If the deleteCountermeasures parameter is true, then threats and countermeasure that no longer apply to the model will automatically be removed.  If it is false, then those threats and countermeasures will remain in the model.   - To have the permission **ARCHITECTURE_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | ID for Product
String deleteCountermeasures = "deleteCountermeasures_example"; // String | This flag indicates if the rules execution will delete the threat and countermeasures which don't apply to the new product threat model. If true, the threats and countermeasures will be automatically removed from the model. If false, the threats and countermeasures won't be removed from the model.
try {
    apiInstance.rulesProductRefPut(apiToken, ref, deleteCountermeasures);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#rulesProductRefPut");
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

