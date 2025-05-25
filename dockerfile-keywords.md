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
