# Project Setup

1. Run this command

```
docker compose up -d --build
```

# Postman Setup

1. Copy postman_collation.json
2. Open Postman application
3. Open a Postman workspace
4. Import postman_collection into postman workspace
5. Run test top to bottom

# Screenshots

## 1. GitHub Actions workflow (CI/CD success)

Successful run of the CI/CD pipeline: build, test, Docker build, and integration test.

![GitHub Actions workflow](Screenshots/workflow-success.png)

## 2. Services running with Docker Compose

Both Product Service and Order Service running via `docker compose up`.

**Terminal (docker compose):**

![Docker Compose - Services Running](Screenshots/Docker%20Compose%20-%20Services%20Running.png)

**Docker Desktop:**

![Docker Desktop - Services Running](Screenshots/Docker%20Desktop%20-%20Services%20Running.png)

## 3. API calls (Product & Order services)

Successful API calls to both services from Postman.

| Description | Screenshot |
|-------------|------------|
| POST - Setup - Create Product for Orders | ![Setup](Screenshots/postman/POST%20-%20Setup%20-%20Create%20Product%20for%20Orders.png) |
| GET - Get All Products | ![Get All Products](Screenshots/postman/GET%20-%20Get%20All%20Products.png) |
| GET - Get Product by ID | ![Get Product by ID](Screenshots/postman/GET%20-%20Get%20Product%20by%20ID.png) |
| POST - Create Product | ![Create Product](Screenshots/postman/POST%20-%20Create%20Product.png) |
| DELETE - Delete Product | ![Delete Product](Screenshots/postman/DELETE%20-%20Delete%20Product.png) |
| GET - Get Deleted Product (expect error) | ![Get Deleted Product](Screenshots/postman/GET%20-%20Get%20Deleted%20Product%20%28expect%20error%29.png) |
| GET - Get All Orders | ![Get All Orders](Screenshots/postman/GET%20-%20Get%20All%20Orders.png) |
| GET - Get Order by ID | ![Get Order by ID](Screenshots/postman/GET%20-%20Get%20Order%20by%20ID.png) |
| GET - Get Order by ID - Not Found | ![Get Order Not Found](Screenshots/postman/GET%20-%20Get%20Order%20by%20ID%20-%20Not%20Found.png) |
| POST - Create Order - Valid | ![Create Order Valid](Screenshots/postman/POST%20-%20Create%20Order%20-%20Valid.png) |
| POST - Create Order - Product Not Found | ![Create Order Product Not Found](Screenshots/postman/POST%20-%20Create%20Order%20-%20Product%20Not%20Found.png) |
| POST - Create Order - Insufficient Stock | ![Create Order Insufficient Stock](Screenshots/postman/POST%20-%20Create%20Order%20-%20Insufficient%20Stock.png) |

---

# Links

Github Repo: https://github.com/Nathan-Dinh/PROG3360-Assignment1
