# Spring boot docker "hello World" example

## Setup
- Using Docker build with ``docker build -t wirjun/spring-boot-docker:<version> -t wirjun/spring-boot-docker:latest .`` (not needed when pulled from docker hub)
- Run with ``docker run -d -p 8080:8080 <Image-ID>`` or ``docker run -d -p 8080:8080 spring-boot-docker``
- Navigatge to http://localhost:8080/ and be happy :)
- Stop Container with ``docker stop <Container-ID>``
- Push Image with version to Docker Hub (skip if only latest image should be available) ``docker push wirjun/spring-boot-docker:<version>``
- Push Image to Docker Hub (latest)``docker push wirjun/spring-boot-docker``