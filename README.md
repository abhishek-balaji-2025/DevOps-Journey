# DevOps-Journey
A personal journey into the world of DevOps. This repository will contain code, configurations, and tools I've explored and implemented while learning about Continuous Integration/Continuous Deployment (CI/CD), Infrastructure as Code (IaC), monitoring, automation, containerization, and cloud services like AWS, Azure, and others.

# Docker Command Reference

### 1. `docker --version`  
Displays the version of Docker installed on the system.

### 2. `docker ps`  
Shows all actively running Docker containers.

### 3. `docker ps -a`  
Shows all containers: running, stopped, and exited.

### 4. `docker images`  
Lists all Docker images available on the local system.

### 5. `docker pull <image-name>`  
Downloads a Docker image from Docker Hub to your local machine.  
You can specify a tag to download a specific version.  
Example: `docker pull alpine:v2`

### 6. `docker run -it --name <custom-container-name> <image>:<tag>`  
Creates and runs a new container interactively with a terminal attached, based on the specified image and tag.

### 7. `docker start <container-name>`  
Starts (or restarts) a stopped container.

### 8. `docker stop <container-name>`  
Stops a running container.

### 9. `docker exec -it <container-name> /bin/bash`  
Opens an interactive terminal inside a running container.

### 10. `exit`  
Exits from the container’s terminal session.

### 11. `docker commit <running-container-name> <custom-image-name>:<tag>`  
Creates a new image from a running container, assigning it a custom name and tag.

### 12. `docker rm <exited-container-name>`  
Deletes a stopped (exited) container.

### 13. `docker rmi <image>:<tag>`  
Deletes a specific version of a Docker image from the local system.

### 14. `docker tag <image> <docker-repository-name>`  
Tags a local Docker image with a new name, usually to prepare it for pushing to a Docker repository.

### 15. `docker login -u <username>`  
Logs into your Docker Hub account using the specified username.  
You will be prompted to enter your password after running this command.

### 16. `docker push <docker-repository-tag>`  
Pushes a tagged Docker image to the specified Docker repository.

### 17. `docker push <user-name>/<docker-repository-name>:<tag>`  
Pushes the Docker image tagged with `<tag>` to the Docker Hub repository.  
The `<tag>` typically specifies the version of the image being pushed.

### 18. `docker run -it --name <container-name> -p <host-port>:<container-port> <image>`  
Runs a container interactively with a terminal, assigns a name, and maps container ports to host machine ports.

### 19. `docker build -t <custom-image-name> .`  
Builds a Docker image with a custom name using the Dockerfile in the current directory (`.`).
