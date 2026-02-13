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

![Docker Compose running](Screenshots/docker-compose-running.png)

## 3. API calls (Product & Order services)

Successful API calls to both services (e.g. from Postman or browser).

![API calls](Screenshots/api-calls-success.png)

---

# Links

Github Repo: https://github.com/Nathan-Dinh/PROG3360-Assignment1
