# RoleApi

All URIs are relative to *https://demo.iriusrisk.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rolesRoleNameDelete**](RoleApi.md#rolesRoleNameDelete) | **DELETE** /roles/{role_name} | Deletes an existing role


<a name="rolesRoleNameDelete"></a>
# **rolesRoleNameDelete**
> rolesRoleNameDelete(apiToken, roleName)

Deletes an existing role

Deletes an existing role. Conditions to be able to perform the action: - To have the permission **ROLES_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RoleApi;


RoleApi apiInstance = new RoleApi();
String apiToken = "apiToken_example"; // String | Authentication token
String roleName = "roleName_example"; // String | Role name to delete
try {
    apiInstance.rolesRoleNameDelete(apiToken, roleName);
} catch (ApiException e) {
    System.err.println("Exception when calling RoleApi#rolesRoleNameDelete");
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

