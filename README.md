The example project for StringBoot service

<div align="center">
    <img src="./assets/images/spring_boot_icon.png"/>
</div>

## Getting Started

## Project structure
```
.
├── unit-test-controller
│   ├── Dockerfile
│   ...
├── docker-compose.yaml
|
└── README.md
```

## Prerequisites
- Make sure that you have Docker and Docker Compose installed
  - Windows or macOS:
    [Install Docker Desktop](https://www.docker.com/get-started)
  - Linux: [Install Docker](https://www.docker.com/get-started) and then
    [Docker Compose](https://github.com/docker/compose)

## Start infrastructure

```shell script
$ docker-compose -f ./docker-compose-infrastructure.yml -p spring-boot-infrastructure up -d
```

## Start services
### Start services in local

- Build project
```shell script
$ ./mvnw clean package
$ cd unit-test-controller
$ ../mvnw spring-boot:run
...
```

### Start services in docker 

```shell script
$ docker-compose -f ./docker-compose-service.yml -p spring-boot-service up -d
```

## Run testing

```shell script
curl http://localhost:8081/greet?name=World
```

## Stop project

- Kill project if start in local mode
- Stop infrastructure & services in docker

```shell script
$ docker-compose -f ./docker-compose-infrastructure.yml -p spring-boot-infrastructure down
$ docker-compose -f ./docker-compose-service.yml -p spring-boot-service down
```

## Contribute

## Reference

- https://loda.me/test-huong-dan-toan-tap-mockito-loda1576641016810/
- https://github.com/loda-kun/spring-boot-learning/tree/master/spring-boot-18-testing-in-spring-boot
- https://www.baeldung.com/junit-5