# UsersApi

All URIs are relative to *https://demo.iriusrisk.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**groupsGroupUsersDelete**](UsersApi.md#groupsGroupUsersDelete) | **DELETE** /groups/{group}/users | Unassign a list of users from a group
[**groupsGroupUsersGet**](UsersApi.md#groupsGroupUsersGet) | **GET** /groups/{group}/users | List users from a group
[**groupsGroupUsersPut**](UsersApi.md#groupsGroupUsersPut) | **PUT** /groups/{group}/users | Assigns users to a group
[**groupsGroupUsersUserDelete**](UsersApi.md#groupsGroupUsersUserDelete) | **DELETE** /groups/{group}/users/{user} | Removes a user from a group
[**productsRefUsersDelete**](UsersApi.md#productsRefUsersDelete) | **DELETE** /products/{ref}/users | Unassigns a list of users from a product.
[**productsRefUsersGet**](UsersApi.md#productsRefUsersGet) | **GET** /products/{ref}/users | List all users assigned to a product
[**productsRefUsersPut**](UsersApi.md#productsRefUsersPut) | **PUT** /products/{ref}/users | Assigns users to a product.
[**productsRefUsersUserDelete**](UsersApi.md#productsRefUsersUserDelete) | **DELETE** /products/{ref}/users/{user} | Unassigns a user from a product
[**usersGet**](UsersApi.md#usersGet) | **GET** /users | List of all Users.
[**usersPost**](UsersApi.md#usersPost) | **POST** /users | Creates a new user
[**usersUsernameDelete**](UsersApi.md#usersUsernameDelete) | **DELETE** /users/{username} | Deletes a user
[**usersUsernameTokenPost**](UsersApi.md#usersUsernameTokenPost) | **POST** /users/{username}/token | Generates a user API token


<a name="groupsGroupUsersDelete"></a>
# **groupsGroupUsersDelete**
> groupsGroupUsersDelete(apiToken, group, jsonData)

Unassign a list of users from a group

Unassign a list of users from a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign users from a group, **if you belong to this group**. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String apiToken = "apiToken_example"; // String | Authentication token
String group = "group_example"; // String | name of the group
JsonData4 jsonData = new JsonData4(); // JsonData4 | JSON object that contains information to unassign users from group
try {
    apiInstance.groupsGroupUsersDelete(apiToken, group, jsonData);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#groupsGroupUsersDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **group** | **String**| name of the group |
 **jsonData** | [**JsonData4**](JsonData4.md)| JSON object that contains information to unassign users from group |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="groupsGroupUsersGet"></a>
# **groupsGroupUsersGet**
> List&lt;User&gt; groupsGroupUsersGet(apiToken, group)

List users from a group

List users who belongs to a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to list users of a group, **if you belong to this group**. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String apiToken = "apiToken_example"; // String | Authentication token
String group = "group_example"; // String | name of the group
try {
    List<User> result = apiInstance.groupsGroupUsersGet(apiToken, group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#groupsGroupUsersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **group** | **String**| name of the group |

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="groupsGroupUsersPut"></a>
# **groupsGroupUsersPut**
> InlineResponse201 groupsGroupUsersPut(apiToken, group, jsonData)

Assigns users to a group

Assigns users to a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to assign users to a group, **if you belong to this group**. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String apiToken = "apiToken_example"; // String | Authentication token
String group = "group_example"; // String | name of the group
JsonData3 jsonData = new JsonData3(); // JsonData3 | JSON object that contains information to assign users to group
try {
    InlineResponse201 result = apiInstance.groupsGroupUsersPut(apiToken, group, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#groupsGroupUsersPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **group** | **String**| name of the group |
 **jsonData** | [**JsonData3**](JsonData3.md)| JSON object that contains information to assign users to group |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="groupsGroupUsersUserDelete"></a>
# **groupsGroupUsersUserDelete**
> groupsGroupUsersUserDelete(apiToken, group, user)

Removes a user from a group

Unassign a user from a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign user from a group, **if you belong to this group**. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String apiToken = "apiToken_example"; // String | Authentication token
String group = "group_example"; // String | name of the group
String user = "user_example"; // String | user to be removed from group
try {
    apiInstance.groupsGroupUsersUserDelete(apiToken, group, user);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#groupsGroupUsersUserDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **group** | **String**| name of the group |
 **user** | **String**| user to be removed from group |

### Return type

null (empty response body)

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
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | Reference for product
JsonData16 jsonData = new JsonData16(); // JsonData16 | JSON object that contains information to unassign users from product
try {
    apiInstance.productsRefUsersDelete(apiToken, ref, jsonData);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#productsRefUsersDelete");
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
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | Reference to product
try {
    List<String> result = apiInstance.productsRefUsersGet(apiToken, ref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#productsRefUsersGet");
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
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | Reference for product
JsonData15 jsonData = new JsonData15(); // JsonData15 | JSON data that contains the information to assign users to product
try {
    ProductShortUsers result = apiInstance.productsRefUsersPut(apiToken, ref, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#productsRefUsersPut");
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
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | Reference for product
String user = "user_example"; // String | Username of the user who will be unassigned from the product
try {
    apiInstance.productsRefUsersUserDelete(apiToken, ref, user);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#productsRefUsersUserDelete");
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

<a name="usersGet"></a>
# **usersGet**
> List&lt;User&gt; usersGet(apiToken)

List of all Users.

Returns a list of all the users of the system. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String apiToken = "apiToken_example"; // String | Authentication token
try {
    List<User> result = apiInstance.usersGet(apiToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersPost"></a>
# **usersPost**
> usersPost(apiToken, jsonData)

Creates a new user

Creates a new user. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String apiToken = "apiToken_example"; // String | Authentication token
JsonData19 jsonData = new JsonData19(); // JsonData19 | JSON data that contains information to creates new user
try {
    apiInstance.usersPost(apiToken, jsonData);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **jsonData** | [**JsonData19**](JsonData19.md)| JSON data that contains information to creates new user |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="usersUsernameDelete"></a>
# **usersUsernameDelete**
> usersUsernameDelete(apiToken, username)

Deletes a user

Deletes a user. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted, or   - To have the permission **MANAGE_USERS_BU** granted. Having this permission you can delete users who belongs to some of your user groups. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String apiToken = "apiToken_example"; // String | Authentication token
String username = "username_example"; // String | User's username
try {
    apiInstance.usersUsernameDelete(apiToken, username);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUsernameDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **username** | **String**| User&#39;s username |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersUsernameTokenPost"></a>
# **usersUsernameTokenPost**
> String usersUsernameTokenPost(apiToken, username)

Generates a user API token

Generates a new user API token. If the user already has a generated API token, generates a new one. Conditions to be able to perform the action:   - To have the permission **ALL_USERS_UPDATE** granted, or   - To have the permission **MANAGE_USERS_BU** granted. Having this permission you can generate a user API token to users who belongs to some of your user groups. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String apiToken = "apiToken_example"; // String | Authentication token
String username = "username_example"; // String | User's username
try {
    String result = apiInstance.usersUsernameTokenPost(apiToken, username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#usersUsernameTokenPost");
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

