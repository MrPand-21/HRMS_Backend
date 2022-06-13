# Api Documentation
Api Documentation

## Version: 1.0

### Terms of service
urn:tos

**License:** [Apache 2.0](http://www.apache.org/licenses/LICENSE-2.0)

### /api/activationpanel/setapproved

#### POST
##### Summary

setApproved

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| panelForJob | body | panelForJob | Yes | [PanelForJob](#panelforjob) |

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | object |
| 201 | Created |  |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/activationpanel/setunapproved

#### POST
##### Summary

setUnapproved

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| panelForJob | body | panelForJob | Yes | [PanelForJob](#panelforjob) |

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | object |
| 201 | Created |  |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/cities/add

#### POST
##### Summary

add

##### Parameters

| Name | Located in | Description                | Required | Schema |
| ---- | ---------- |----------------------------| -------- | ---- |
| cityName | query |                            | No | string |
| id | query |                            | No | integer |
| related spaces with JobAdvertisements[0] | query      | This is being developed... | No       | mixed   |


##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | object |
| 201 | Created |  |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/cities/delete

#### POST
##### Summary

delete

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| cityName | query |  | No | string |
| id | query |  | No | integer |
| related spaces with JobAdvertisements[0] | query      |   This is being developed...          | No       | mixed   |

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | object |
| 201 | Created |  |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/cities/getAll

#### GET
##### Summary

getAll

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | object |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/cities/update

#### POST
##### Summary

update

##### Parameters

| Name                                     | Located in | Description | Required | Schema  |
|------------------------------------------|------------|-------------|----------|---------|
| cityName                                 | query      |             | No       | string  |
| id                                       | query      |             | No       | integer |
| related spaces with JobAdvertisements[0] | query |This is being developed...| No | mixed |

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | object |
| 201 | Created |  |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/employers/add

#### POST
##### Summary

add

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| employer | body | employer | Yes | [Employer](#employer) |

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | [Result](#result) |
| 201 | Created |  |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/employers/getall

#### GET
##### Summary

getAll

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | [DataResult«List«Employer»»](#dataresult«list«employer»») |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/employers/getbyid

#### GET
##### Summary

getById

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| id | query | id | Yes | integer |

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | object |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/images/upload

#### POST
##### Summary

upload

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| image | body | image | Yes | [Image](#image) |

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | object |
| 201 | Created |  |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/jobpositions/getall

#### GET
##### Summary

getAll

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | [DataResult«List«JobPosition»»](#dataresult«list«jobposition»») |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/jobs/add

#### POST
##### Summary

add

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| JobForAddDto | body | JobForAddDto | Yes | [JobForAddDto](#jobforadddto) |

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | [Result](#result) |
| 201 | Created |  |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/jobs/delete

#### POST
##### Summary

delete

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| id | query | id | Yes | integer |

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | [Result](#result) |
| 201 | Created |  |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/jobs/getall

#### GET
##### Summary

getAll

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | [DataResult«List«JobForGetAllDto»»](#dataresult«list«jobforgetalldto»») |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/jobs/getallapprovedjobs

#### GET
##### Summary

getAllApprovedJobs

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | object |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/jobs/getallbydate

#### GET
##### Summary

getAllByDate

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | [DataResult«List«JobForGetAllDto»»](#dataresult«list«jobforgetalldto»») |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/jobs/getalljobsofemployer

#### POST
##### Summary

getAllJobsOfEmployer

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| employerId | query | employerId | Yes | integer |

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | [DataResult«List«Job»»](#dataresult«list«job»») |
| 201 | Created |  |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/jobs/getallunapprovedjobs

#### GET
##### Summary

getAllUnapprovedJobs

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | object |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/jobs/getjobbyid

#### GET
##### Summary

getJobById

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| id | query | id | No | integer |

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | object |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/jobs/getjobforgetalldtobyid

#### GET
##### Summary

getJobForGetAllDtoById

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| id | query | id | No | integer |

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | object |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/jobs/setactivetojobvisibility

#### POST
##### Summary

setActiveToJobVisibility

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| id | query | id | Yes | integer |

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | [Result](#result) |
| 201 | Created |  |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/jobs/setinactivetojobvisibility

#### POST
##### Summary

setInactiveToJobVisibility

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| id | query | id | Yes | integer |

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | [Result](#result) |
| 201 | Created |  |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/jobseekers/

#### POST
##### Summary

add

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| jobSeeker | body | jobSeeker | Yes | [JobSeeker](#jobseeker) |

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | [Result](#result) |
| 201 | Created |  |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/jobseekers/getAllByWorkExperiences

#### GET
##### Summary

getByWorkExperiencesDesc

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | object |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/jobseekers/getall

#### GET
##### Summary

getAll

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | [DataResult«List«JobSeeker»»](#dataresult«list«jobseeker»») |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/jobseekers/getbyid

#### GET
##### Summary

getById

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| id | query | id | Yes | integer |

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | object |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/workplaces/getById

#### GET
##### Summary

getById

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| id | query | id | No | integer |

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | object |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/workplaces/getall

#### GET
##### Summary

getAll

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | object |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/worktimes/getById

#### GET
##### Summary

getById

##### Parameters

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| id | query | id | No | integer |

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | object |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /api/worktimes/getall

#### GET
##### Summary

getAll

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | object |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

### /error

#### GET
##### Summary

errorHtml

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | [ModelAndView](#modelandview) |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

#### POST
##### Summary

errorHtml

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | [ModelAndView](#modelandview) |
| 201 | Created |  |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

#### PUT
##### Summary

errorHtml

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | [ModelAndView](#modelandview) |
| 201 | Created |  |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |
| 404 | Not Found |  |

#### DELETE
##### Summary

errorHtml

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | [ModelAndView](#modelandview) |
| 204 | No Content |  |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |

#### OPTIONS
##### Summary

errorHtml

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | [ModelAndView](#modelandview) |
| 204 | No Content |  |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |

#### PATCH
##### Summary

errorHtml

##### Responses

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | OK | [ModelAndView](#modelandview) |
| 204 | No Content |  |
| 401 | Unauthorized |  |
| 403 | Forbidden |  |

### Models

#### AttendedSchool

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| dateOfGraduation | dateTime |  | No |
| dateOfStarting | dateTime |  | No |
| id | integer |  | No |
| school | [School](#school) |  | No |

#### City

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| cityName | string |  | No |
| id | integer |  | No |

#### DataResult«List«Employer»»

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| data | [ [Employer](#employer) ] |  | No |
| message | string |  | No |
| success | boolean |  | No |

#### DataResult«List«JobForGetAllDto»»

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| data | [ [JobForGetAllDto](#jobforgetalldto) ] |  | No |
| message | string |  | No |
| success | boolean |  | No |

#### DataResult«List«JobPosition»»

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| data | [ [JobPosition](#jobposition) ] |  | No |
| message | string |  | No |
| success | boolean |  | No |

#### DataResult«List«JobSeeker»»

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| data | [ [JobSeeker](#jobseeker) ] |  | No |
| message | string |  | No |
| success | boolean |  | No |

#### DataResult«List«Job»»

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| data | [ [Job](#job) ] |  | No |
| message | string |  | No |
| success | boolean |  | No |

#### Department

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| departmentName | string |  | No |
| id | integer |  | No |

#### Employer

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| companyName | string |  | No |
| id | integer |  | No |
| phone | string |  | No |
| user | [User](#user) |  | No |
| webSites | string |  | No |

#### Image

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| id | integer |  | No |
| imagePath | string |  | No |
| imageTitle | string |  | No |

#### Job

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| active | boolean |  | No |
| city | [City](#city) |  | No |
| createdDate | dateTime |  | No |
| deadline | dateTime |  | No |
| description | string |  | No |
| employer | [Employer](#employer) |  | No |
| empty_positions | integer |  | No |
| id | integer |  | No |
| jobPosition | [JobPosition](#jobposition) |  | No |
| maximumSalary | integer |  | No |
| minimumSalary | integer |  | No |
| workPlace | [WorkPlace](#workplace) |  | No |
| workTime | [WorkTime](#worktime) |  | No |

#### JobForAddDto

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| cityId | integer |  | No |
| createdDate | dateTime |  | No |
| deadline | dateTime |  | No |
| description | string |  | No |
| employerId | integer |  | No |
| jobPositionId | integer |  | No |
| maximumSalary | integer |  | No |
| minimumSalary | integer |  | No |
| numberOfEmptyPositions | integer |  | No |
| workPlaceId | integer |  | No |
| workTimeId | integer |  | No |

#### JobForGetAllDto

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| active | boolean |  | No |
| approved | boolean |  | No |
| cityName | string |  | No |
| companyName | string |  | No |
| createdDate | dateTime |  | No |
| deadLine | dateTime |  | No |
| description | string |  | No |
| id | integer |  | No |
| maximumSalary | integer |  | No |
| minimumSalary | integer |  | No |
| number_of_empty_positions | integer |  | No |
| positionName | string |  | No |
| workPlaceName | string |  | No |
| workTimeName | string |  | No |

#### JobPosition

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| id | integer |  | No |
| position_name | string |  | No |

#### JobSeeker

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| attendedSchools | [ [AttendedSchool](#attendedschool) ] |  | No |
| birthDate | integer |  | No |
| firstName | string |  | No |
| githubAccount | string |  | No |
| id | integer |  | No |
| images | [ [Image](#image) ] |  | No |
| info | string |  | No |
| languages | [ [KnownLanguage](#knownlanguage) ] |  | No |
| lastName | string |  | No |
| linkedInAccount | string |  | No |
| nationalityId | long |  | No |
| user | [User](#user) |  | No |
| workExperiences | [ [WorkExperience](#workexperience) ] |  | No |

#### KnownLanguage

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| id | integer |  | No |
| languageLevel | [LanguageLevel](#languagelevel) |  | No |
| languageName | string |  | No |

#### LanguageLevel

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| id | integer |  | No |
| knownLanguages | [ [KnownLanguage](#knownlanguage) ] |  | No |
| levelDescription | string |  | No |

#### ModelAndView

| Name | Type | Description                          | Required |
| ---- | ---- |--------------------------------------| -------- |
| empty | boolean |                                      | No |
| model | object |                                      | No |
| modelMap | object |                                      | No |
| reference | boolean |                                      | No |
| status | string | _Enum:_ `From Error code 100 to 511` | No |
| view | [View](#view) |                                      | No |
| viewName | string |                                      | No |

#### PanelForJob

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| detail | string |  | No |
| jobId | integer |  | No |
| systemUserId | integer |  | No |

#### Result

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| message | string |  | No |
| success | boolean |  | No |

#### School

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| departments | [ [Department](#department) ] |  | No |
| id | integer |  | No |
| schoolName | string |  | No |

#### User

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| activated | boolean |  | No |
| createdDate | dateTime |  | No |
| email | string |  | No |
| id | integer |  | No |
| password | string |  | No |
| status | boolean |  | No |

#### View

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| contentType | string |  | No |

#### WorkExperience

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| id | integer |  | No |
| jobPosition | [JobPosition](#jobposition) |  | No |
| quitDate | dateTime |  | No |
| startingDate | dateTime |  | No |
| workplaceName | string |  | No |

#### WorkPlace

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| id | integer |  | No |
| workPlaceName | string |  | No |

#### WorkTime

| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| id | integer |  | No |
| workTimeName | string |  | No |
