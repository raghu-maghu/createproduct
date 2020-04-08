# TokenApi

All URIs are relative to *https://demo.iriusrisk.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usersUsernameTokenPost**](TokenApi.md#usersUsernameTokenPost) | **POST** /users/{username}/token | Generates a user API token


<a name="usersUsernameTokenPost"></a>
# **usersUsernameTokenPost**
> String usersUsernameTokenPost(apiToken, username)

Generates a user API token

Generates a new user API token. If the user already has a generated API token, generates a new one. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted, or   - To have the permission **MANAGE_USERS_BU** granted. Having this permission you can generate a user API token to users who belongs to some of your user groups. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TokenApi;


TokenApi apiInstance = new TokenApi();
String apiToken = "apiToken_example"; // String | Authentication token
String username = "username_example"; // String | User's username
try {
    String result = apiInstance.usersUsernameTokenPost(apiToken, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TokenApi#usersUsernameTokenPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **username** | **String**| User&#39;s username |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

