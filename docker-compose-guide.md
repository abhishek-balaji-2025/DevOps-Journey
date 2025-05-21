# Docker Compose

Docker Compose is a tool to define and run multi-container Docker applications. Instead of managing each container separately, you use a single YAML file (`docker-compose.yml`) to configure all your services, networks, and volumes.

---

## 🚀 Why Use Docker Compose?

- Manage multi-container apps easily  
- Define services, networks, and volumes in one place  
- Start all containers with a single command  
- Simplifies development and testing environments  

---

## How to Use Docker Compose

Create a `docker-compose.yml` file with your services defined.

```bash
# Start all containers
docker-compose up

```bash
# Run containers in detached mode
docker-compose up -d

# Stop and remove containers, networks, and volumes created by Compose
docker-compose down

## 🛠️ Common Commands

```bash
docker-compose ps            # List running containers
docker-compose logs          # Show logs from all containers
docker-compose restart       # Restart containers
docker-compose build         # Build images defined in docker-compose.yml

## 💡 Tips for Beginners

- Use `depends_on` to control startup order of services.
- Map ports carefully to avoid conflicts.
- Use volumes to persist data between container restarts.
- Use `.env` files to manage environment variables securely.
