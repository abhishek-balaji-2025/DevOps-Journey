## How to Use Docker Compose

Create a `docker-compose.yml` file with your services defined.

```bash
# Start all containers
docker-compose up

# Run containers in detached mode
docker-compose up -d

# Stop and remove containers, networks, and volumes created by Compose
docker-compose down

🛠️ Common Commands

docker-compose ps            # List running containers
docker-compose logs          # Show logs from all containers
docker-compose restart       # Restart containers
docker-compose build         # Build images defined in docker-compose.yml

💡 Tips for Beginners
Use depends_on to control startup order of services

Map ports carefully to avoid conflicts

Use volumes to persist data between container restarts

Use .env files to manage environment variables securely
