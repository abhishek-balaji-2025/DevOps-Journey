# Docker Push Workflow

This document outlines the basic steps to create a custom Docker image from a base container, customize it, and push it to your Docker Hub repository. Following these steps will help you version and share your Docker images easily.

## Steps

1. Run a container from a base image

`docker run -it --name <container-name> <docker-image>:<tag>`

2. Customize the container by installing packages or files, then commit the container as a custom image

`docker exec -it <container-name> /bin/bash`

`apt update`
`apt install apache2 -y`
`service apache2 status`
`service apache2 start`
`mkdir user-app`

`docker commit <container-name> <custom-image-name>:<tag>`

3. Tag the custom image to your Docker Hub repository

`docker tag <custom-image-name>:<tag> <user-name>/<docker-repository>:<tag>`

4. Log in to Docker Hub using `docker login -u <username>`

`docker login -u <username>`
enter the docker hub account password when prompted

5. Push the tagged image to Docker Hub

`docker push <username>/<docker-repository>:<tag>`
