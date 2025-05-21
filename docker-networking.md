
**Beginner-Friendly**: This guide is designed for developers starting out with Docker. It covers all essential network types and practical examples to help you get hands-on quickly.

# Docker Networking

Docker networking allows containers to communicate with each other, the host, and external networks. Understanding the different network types helps design efficient and secure container architectures.

---

## 🚀 Network Types in Docker

### 1. **Bridge** (Default for standalone containers)
- **Usage**: Containers on the same host communicate.
- **IP Range**: Assigned from the internal subnet.
- **DNS**: Containers can resolve each other by name.

\`\`\`bash
# Example
docker run -dit --name app1 nginx
docker run -dit --name app2 --link app1 busybox
\`\`\`

---

### 2. **Host**
- **Usage**: Container shares the host’s network stack.
- **No isolation**: Fast, but limited use cases.

\`\`\`bash
# Example
docker run --rm --network host nginx
\`\`\`

---

### 3. **None**
- **Usage**: Completely disables networking.
- **Isolated**: Ideal for security or non-networked jobs.

\`\`\`bash
docker run --rm --network none alpine ping google.com
# (This will fail)
\`\`\`

---

### 4. **Overlay** (Swarm only)
- **Usage**: Multi-host networking via Docker Swarm.
- **Encrypted**: Containers on different hosts can communicate.

\`\`\`bash
# Create overlay network
docker network create -d overlay my_overlay_net
\`\`\`

---

### 5. **Macvlan**
- **Usage**: Assigns MAC address to containers. Containers act like physical devices on LAN.
- **Note**: Advanced; useful for legacy systems or direct LAN access.

\`\`\`bash
docker network create -d macvlan \\
  --subnet=192.168.1.0/24 \\
  --gateway=192.168.1.1 \\
  -o parent=eth0 macvlan_net
\`\`\`

---

## 🔧 Common Network Commands

\`\`\`bash
docker network ls                        # List networks
docker network inspect <name>           # Inspect a network
docker network create <options>         # Create a custom network
docker network connect <net> <container>      # Attach container to a network
docker network disconnect <net> <container>   # Detach container
\`\`\`

---

## ✅ Tips

- Use **bridge** for most local development.
- Use **overlay** for Docker Swarm services across multiple hosts.
- Use **host** only when low latency or direct port access is critical.
- Use **macvlan** when containers need IPs from your physical network.

---

## 📌 Summary Table

| Network Type | Use Case                     | Host Access | Container-to-Container | Multi-Host |
|--------------|------------------------------|-------------|-------------------------|------------|
| Bridge       | Local container comms        | Yes         | Yes                     | No         |
| Host         | High-performance networking  | Full        | Host’s scope            | No         |
| None         | Isolation, secure workloads  | No          | No                      | No         |
| Overlay      | Swarm services, multi-host   | Optional    | Yes                     | Yes        |
| Macvlan      | Direct LAN access            | No (default) | Yes                    | Yes        |

---

> 🧠 **Tip**: Keep your networks minimal and purpose-specific for better security and maintainability.
