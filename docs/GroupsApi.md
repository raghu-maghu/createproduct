# GroupsApi

All URIs are relative to *https://demo.iriusrisk.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**groupsGet**](GroupsApi.md#groupsGet) | **GET** /groups | Gets a list of all Groups
[**groupsGroupRefDelete**](GroupsApi.md#groupsGroupRefDelete) | **DELETE** /groups/{groupRef} | Deletes a users group
[**groupsGroupRefGet**](GroupsApi.md#groupsGroupRefGet) | **GET** /groups/{groupRef} | Gets the group details.
[**groupsGroupRefPut**](GroupsApi.md#groupsGroupRefPut) | **PUT** /groups/{groupRef} | Update a users group
[**groupsGroupUsersDelete**](GroupsApi.md#groupsGroupUsersDelete) | **DELETE** /groups/{group}/users | Unassign a list of users from a group
[**groupsGroupUsersGet**](GroupsApi.md#groupsGroupUsersGet) | **GET** /groups/{group}/users | List users from a group
[**groupsGroupUsersPut**](GroupsApi.md#groupsGroupUsersPut) | **PUT** /groups/{group}/users | Assigns users to a group
[**groupsGroupUsersUserDelete**](GroupsApi.md#groupsGroupUsersUserDelete) | **DELETE** /groups/{group}/users/{user} | Removes a user from a group
[**groupsPost**](GroupsApi.md#groupsPost) | **POST** /groups | Creates a new user group
[**productsRefGroupsDelete**](GroupsApi.md#productsRefGroupsDelete) | **DELETE** /products/{ref}/groups | Unassigns a list of user groups from a product.
[**productsRefGroupsGet**](GroupsApi.md#productsRefGroupsGet) | **GET** /products/{ref}/groups | List all groups assigned to a product
[**productsRefGroupsPut**](GroupsApi.md#productsRefGroupsPut) | **PUT** /products/{ref}/groups | Assigns groups of users to a product.


<a name="groupsGet"></a>
# **groupsGet**
> List&lt;Group&gt; groupsGet(apiToken)

Gets a list of all Groups

Gets a list of all user&#39;s groups. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
String apiToken = "apiToken_example"; // String | Authentication token
try {
    List<Group> result = apiInstance.groupsGet(apiToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#groupsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |

### Return type

[**List&lt;Group&gt;**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="groupsGroupRefDelete"></a>
# **groupsGroupRefDelete**
> groupsGroupRefDelete(apiToken, groupRef)

Deletes a users group

Deletes a users group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String groupRef = "groupRef_example"; // String | unique name of the group
try {
    apiInstance.groupsGroupRefDelete(apiToken, groupRef);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#groupsGroupRefDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **groupRef** | **String**| unique name of the group |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="groupsGroupRefGet"></a>
# **groupsGroupRefGet**
> List&lt;Group&gt; groupsGroupRefGet(apiToken, groupRef)

Gets the group details.

Returns the group details for the requested group. Conditions to be able to perform the action:    - If the caller has the PRODUCTS_LIST_ALL permission then all groups can be queried without restriction.    - Without the PRODUCTS_LIST_ALL permission, the call will only return the group if the caller belongs to that group. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String groupRef = "groupRef_example"; // String | unique name of the group
try {
    List<Group> result = apiInstance.groupsGroupRefGet(apiToken, groupRef);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#groupsGroupRefGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **groupRef** | **String**| unique name of the group |

### Return type

[**List&lt;Group&gt;**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="groupsGroupRefPut"></a>
# **groupsGroupRefPut**
> Group groupsGroupRefPut(apiToken, groupRef, jsonData)

Update a users group

Updates a users group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String groupRef = "groupRef_example"; // String | unique ref of the group
JsonData2 jsonData = new JsonData2(); // JsonData2 | JSON data that contains information of the fields
try {
    Group result = apiInstance.groupsGroupRefPut(apiToken, groupRef, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#groupsGroupRefPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **groupRef** | **String**| unique ref of the group |
 **jsonData** | [**JsonData2**](JsonData2.md)| JSON data that contains information of the fields |

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="groupsGroupUsersDelete"></a>
# **groupsGroupUsersDelete**
> groupsGroupUsersDelete(apiToken, group, jsonData)

Unassign a list of users from a group

Unassign a list of users from a group. Conditions to be able to perform the action:  - To have the permission **ALL_USERS_UPDATE** granted, or  - To have the permission **MANAGE_USERS_BU** granted. With this permission you will be able to unassign users from a group, **if you belong to this group**. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String group = "group_example"; // String | name of the group
JsonData4 jsonData = new JsonData4(); // JsonData4 | JSON object that contains information to unassign users from group
try {
    apiInstance.groupsGroupUsersDelete(apiToken, group, jsonData);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#groupsGroupUsersDelete");
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
//import io.swagger.client.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String group = "group_example"; // String | name of the group
try {
    List<User> result = apiInstance.groupsGroupUsersGet(apiToken, group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#groupsGroupUsersGet");
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
//import io.swagger.client.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String group = "group_example"; // String | name of the group
JsonData3 jsonData = new JsonData3(); // JsonData3 | JSON object that contains information to assign users to group
try {
    InlineResponse201 result = apiInstance.groupsGroupUsersPut(apiToken, group, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#groupsGroupUsersPut");
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
//import io.swagger.client.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String group = "group_example"; // String | name of the group
String user = "user_example"; // String | user to be removed from group
try {
    apiInstance.groupsGroupUsersUserDelete(apiToken, group, user);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#groupsGroupUsersUserDelete");
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

<a name="groupsPost"></a>
# **groupsPost**
> Group groupsPost(apiToken, jsonData)

Creates a new user group

Creates a new user group. Conditions to be able to perform the action:    - To have the permission **ALL_USERS_UPDATE** granted. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
String apiToken = "apiToken_example"; // String | Authentication token
JsonData1 jsonData = new JsonData1(); // JsonData1 | JSON data that contains information of the fields
try {
    Group result = apiInstance.groupsPost(apiToken, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#groupsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiToken** | **String**| Authentication token |
 **jsonData** | [**JsonData1**](JsonData1.md)| JSON data that contains information of the fields |

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
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
//import io.swagger.client.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | Reference for product
JsonData14 jsonData = new JsonData14(); // JsonData14 | JSON object that contains information to unassign groups from a product
try {
    InlineResponse200 result = apiInstance.productsRefGroupsDelete(apiToken, ref, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#productsRefGroupsDelete");
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
//import io.swagger.client.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | Reference to product
try {
    List<String> result = apiInstance.productsRefGroupsGet(apiToken, ref);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#productsRefGroupsGet");
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
//import io.swagger.client.api.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
String apiToken = "apiToken_example"; // String | Authentication token
String ref = "ref_example"; // String | Reference for product
JsonData13 jsonData = new JsonData13(); // JsonData13 | JSON object that contains information to assign groups to product
try {
    ProductShortGroups result = apiInstance.productsRefGroupsPut(apiToken, ref, jsonData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#productsRefGroupsPut");
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

