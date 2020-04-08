# TemplatesApi

All URIs are relative to *https://demo.iriusrisk.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productsUploadPost**](TemplatesApi.md#productsUploadPost) | **POST** /products/upload | Creates a new product, library or template from a XML file upload.


<a name="productsUploadPost"></a>
# **productsUploadPost**
> ProductShort productsUploadPost(apiToken, ref, name, fileName, type)

Creates a new product, library or template from a XML file upload.

Creates a new product, library or template from a XML file upload. Conditions to be able to perform the action: - To have the permission **PRODUCT_CREATE** granted allows to create a product. - To have the permission **LIBRARY_UPDATE** granted allows to create a library. - To have the permission **TEMPLATE_UPDATE** granted allows to create a template. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TemplatesApi;


TemplatesApi apiInstance = new TemplatesApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | Product ref
String name = "name_example"; // String | Product name
File fileName = new File("/path/to/file.txt"); // File | File to upload in XML format
String type = "type_example"; // String | Product type - STANDARD (By default), TEMPLATE or LIBRARY
try {
    ProductShort result = apiInstance.productsUploadPost(apiToken, ref, name, fileName, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TemplatesApi#productsUploadPost");
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

