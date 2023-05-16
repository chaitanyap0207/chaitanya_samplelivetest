validating API requests

Post request
url=https://reqres.in/api/users
OUTPUT:
HTTP/1.1 201 Created
Date: Tue, 16 May 2023 16:47:19 GMT
Content-Type: application/json; charset=utf-8
Content-Length: 84
Connection: keep-alive
X-Powered-By: Express
Access-Control-Allow-Origin: *
Etag: W/"54-F+Rczd9vdpY3kWGM9yhkdTfG16c"
Via: 1.1 vegur
CF-Cache-Status: DYNAMIC
Report-To: {"endpoints":[{"url":"https:\/\/a.nel.cloudflare.com\/report\/v3?s=xV%2Bo6juQ7M7epG%2BZuxTpfoEAaSqVVWvGcWYmo25jbkADGHfUQ%2Fgwy86Rxl45FpTBW%2Bvp8JXHifd8phNDNbl9azkNGQcqlTSYlSNfyl0bq6lS3Rjm%2FKfgotJcmA%3D%3D"}],"group":"cf-nel","max_age":604800}
NEL: {"success_fraction":0,"report_to":"cf-nel","max_age":604800}
Server: cloudflare
CF-RAY: 7c851a101b0e69a1-BOM

{
    "id": "734",
    "name": "morpheus",
    "job": "leader",
    "createdAt": "2023-05-16T16:47:19.266Z"
}

Get request

performed all type of validations for given api
url=https://reqres.in/api/users?page=1
OUTPUT:
HTTP/1.1 200 OK
Date: Tue, 16 May 2023 16:47:20 GMT
Content-Type: application/json; charset=utf-8
Transfer-Encoding: chunked
Connection: keep-alive
X-Powered-By: Express
Access-Control-Allow-Origin: *
Etag: W/"3e4-2RLXvr5wTg9YQ6aH95CkYoFNuO8"
Via: 1.1 vegur
Cache-Control: max-age=14400
CF-Cache-Status: HIT
Age: 6684
Report-To: {"endpoints":[{"url":"https:\/\/a.nel.cloudflare.com\/report\/v3?s=myi5j9BniRZWxG4zmDT847F8hboek71O%2FPDx6Qqru4eiQmZe%2FW3nmwNuDO4R2nL2vddwm%2FMWdepEXfLuxhr5sj3i8Hh5ns0vF%2Bv%2BiuC%2BgLihrgbvuoSiiG1VhQ%3D%3D"}],"group":"cf-nel","max_age":604800}
NEL: {"success_fraction":0,"report_to":"cf-nel","max_age":604800}
Vary: Accept-Encoding
Server: cloudflare
CF-RAY: 7c851a1b3f40f4b4-BOM
Content-Encoding: gzip

{
    "page": 1,
    "per_page": 6,
    "total": 12,
    "total_pages": 2,
    "data": [
        {
            "id": 1,
            "email": "george.bluth@reqres.in",
            "first_name": "George",
            "last_name": "Bluth",
            "avatar": "https://reqres.in/img/faces/1-image.jpg"
        },
        {
            "id": 2,
            "email": "janet.weaver@reqres.in",
            "first_name": "Janet",
            "last_name": "Weaver",
            "avatar": "https://reqres.in/img/faces/2-image.jpg"
        },
        {
            "id": 3,
            "email": "emma.wong@reqres.in",
            "first_name": "Emma",
            "last_name": "Wong",
            "avatar": "https://reqres.in/img/faces/3-image.jpg"
        },
        {
            "id": 4,
            "email": "eve.holt@reqres.in",
            "first_name": "Eve",
            "last_name": "Holt",
            "avatar": "https://reqres.in/img/faces/4-image.jpg"
        },
        {
            "id": 5,
            "email": "charles.morris@reqres.in",
            "first_name": "Charles",
            "last_name": "Morris",
            "avatar": "https://reqres.in/img/faces/5-image.jpg"
        },
        {
            "id": 6,
            "email": "tracey.ramos@reqres.in",
            "first_name": "Tracey",
            "last_name": "Ramos",
            "avatar": "https://reqres.in/img/faces/6-image.jpg"
        }
    ],
    "support": {
        "url": "https://reqres.in/#support-heading",
        "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
    }
}
Schema is valid
George
george.bluth@reqres.in
no null value in email
Janet
janet.weaver@reqres.in
no null value in email
Emma
emma.wong@reqres.in
no null value in email
Eve
eve.holt@reqres.in
no null value in email
Charles
charles.morris@reqres.in
no null value in email
Tracey
tracey.ramos@reqres.in
no null value in email
email is valid

Put request:
"https://reqres.in/api/users/{id}"
 The id which is generated from post request is passsed through put request 
Eventhough i am sending the id value i am unable to update the put request for id generated


