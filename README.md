# Springboot-jwt
Example of implementing JSON Web Token in SpringBoot app.

Application was made with tutorial from DevDojoAcademy with few changes, including password encoding.
Link to video:
https://youtu.be/q0aYyEocWPU

### Instruction

To retrieve token you have to pass credential to /login endpoint via POST Method:
```sh
localhost:8092/login

body:
{
"username": "user",
"password": "password"
}
```
Endpoint will send response with token in header. Example:
```sh
authorization → Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwiZXhwIjoxNTM4ODM3MDc0fQ.2bLFpLG3fxfPn1u6fjrGffMejXZegFDbo4QXr11_ZrA
```
Every other endpoint requires this JWT. It has to be passed in header with key 'Authorization' and value 'Bearer ...'
