
# JsonData19

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **String** | Username of the user | 
**auth** | [**AuthEnum**](#AuthEnum) | Authentication type | 
**email** | **String** | Email of the user | 
**firstName** | **String** | First name of the user | 
**lastName** | **String** | Last name of the user | 
**roleGroups** | **List&lt;String&gt;** | List of roles&#39; refs to assign to the user. Can be an empty list. | 


<a name="AuthEnum"></a>
## Enum: AuthEnum
Name | Value
---- | -----
LDAP | &quot;ldap&quot;
SAML | &quot;saml&quot;



