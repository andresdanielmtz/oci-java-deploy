# OCI-Microservice 

## TC3004B - Software Design Planning

Java + Oracle Cloud Springboot Repository deployed on Render.com.

> Due to render.com constrains, sometimes it takes up to a couple of minutes to load the data from the API. Please take that into consideraton.

---

### Endpoint

`https://oci-java-deploy.onrender.com/`

#### Methods

- **GET** `students/`
`https://oci-java-deploy.onrender.com/students`

Get list of students

---

- **GET** `students/{id}`
`https://oci-java-deploy.onrender.com/students/18775`

Get information of specific user.

---

- **POST** `students/`
`https://oci-java-deploy.onrender.com/students`

Create and upload student to OCI database.

#### Body Structure

```json
{
    "firstName": string,
    "lastName": string,
    "email": string
}
```

#### Body Example

```json
{
    "firstName": "Andrés",
    "lastName": "Martínez",
    "email": "andresdanielmtz@hotmail.com"
}
```
