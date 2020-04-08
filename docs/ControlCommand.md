
# ControlCommand

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ref** | **String** | Reference field value |  [optional]
**name** | **String** | Name field value |  [optional]
**desc** | **String** | Description field value |  [optional]
**mitigation** | **Integer** | Mitigation |  [optional]
**test** | [**TestCommand**](TestCommand.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) | Countermeasure state |  [optional]
**costRating** | [**CostRatingEnum**](#CostRatingEnum) | Countermeasure cost |  [optional]
**standards** | [**List&lt;ControlCommandStandards&gt;**](ControlCommandStandards.md) | List of standards |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
NOT_APPLICABLE | &quot;not-applicable&quot;
REJECTED | &quot;rejected&quot;
RECOMMENDED | &quot;recommended&quot;
REQUIRED | &quot;required&quot;
IMPLEMENTED | &quot;implemented&quot;


<a name="CostRatingEnum"></a>
## Enum: CostRatingEnum
Name | Value
---- | -----
LOW | &quot;low&quot;
MEDIUM | &quot;medium&quot;
HIGH | &quot;high&quot;



