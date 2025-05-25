# Docker Volume Commands

1. **docker volume create <docker-volume-name>**

   This command is used to create a new persistent data volume for your container.

2. **docker volume ls**

   This command lists all the docker volumes currently existing within the Docker environment.

3. **docker volume inspect <docker-volume-name>**

   This command provides detailed information about the specified docker volume.

4. **docker volume rm <docker-volume-name>**

   This command deletes the specified docker volume.

5. **docker run -it --name <container-name> -v <docker-volume-name>:/path/in/container/ <docker-image>:<tag>**

   This command starts a Docker container with the specified docker volume attached and mounted at `/path/in/container/`.
