# AuthorizationApi

All URIs are relative to *https://demo.iriusrisk.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rolesPost**](AuthorizationApi.md#rolesPost) | **POST** /roles | Creates a new Role
[**rolesRoleNameDelete**](AuthorizationApi.md#rolesRoleNameDelete) | **DELETE** /roles/{role_name} | Deletes an existing role


<a name="rolesPost"></a>
# **rolesPost**
> rolesPost(apiToken, jsonData)

Creates a new Role

Creates a new role. Conditions to be able to perform the action:  - To have the permission **ROLES_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthorizationApi;


AuthorizationApi apiInstance = new AuthorizationApi();
String apiToken = "apiToken_example"; // String | Authentication token
JsonData jsonData = new JsonData(); // JsonData | JSON data that contains information of the fields
try {
    apiInstance.rolesPost(apiToken, jsonData);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#rolesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **jsonData** | [**JsonData**](JsonData.md)| JSON data that contains information of the fields |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rolesRoleNameDelete"></a>
# **rolesRoleNameDelete**
> rolesRoleNameDelete(apiToken, roleName)

Deletes an existing role

Deletes an existing role. Conditions to be able to perform the action: - To have the permission **ROLES_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthorizationApi;


AuthorizationApi apiInstance = new AuthorizationApi();
String apiToken = "apiToken_example"; // String | Authentication token
String roleName = "roleName_example"; // String | Role name to delete
try {
    apiInstance.rolesRoleNameDelete(apiToken, roleName);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizationApi#rolesRoleNameDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **roleName** | **String**| Role name to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

