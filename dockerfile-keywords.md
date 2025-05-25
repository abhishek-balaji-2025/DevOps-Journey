# How to Create a Dockerfile

1. `FROM`  
   Defines the base image from which the Docker image is built.

2. `ADD`  
   Adds files from your local machine into the container during build.  
   - The source can be a relative path (full path not required).  
   - The destination inside the container should be a full path.

3. `RUN`  
   Executes commands during the image build process and adds layers to the image.

4. `CMD`
   Specifies the default command to run when the container starts.  
   - This command does not run during the build process.  
   - It runs only when the container is started.

5. `ENTRYPOINT`  
   Defines the main command that always runs when the container starts,  
   regardless of any arguments passed during runtime.

6. `ENV`
   Sets environment variables inside the container that are available at build and runtime.

# Using the `-f` Flag in Docker Build

- The `-f` flag lets you specify a custom Dockerfile for `docker build`.

- By default, Docker uses the file named `Dockerfile`.

- Use `-f <filename>` to build from files like `Dockerfile.prod` or `Dockerfile.dev`.

- Only one Dockerfile can be used per build command, and the path can be relative or absolute.

- Syntax: `docker build -f <Dockerfile-name> <build-context>` (e.g., `docker build -f Dockerfile.prod .`)

- The dot `.` specifies the current directory as the build context.
