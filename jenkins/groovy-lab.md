# 🧪 Groovy Lab: Jenkins Pipeline Basics

This file gives a quick overview of the 4 fundamental building blocks used in a Jenkins Declarative Pipeline.

---

## 1. `pipeline { }`
- The root block of any declarative pipeline.
- Everything is defined inside this.
- Think of it as the **container** for your entire CI/CD flow.

---

## 2. `agent any`
- Specifies **where** the pipeline should run.
- `any` means run on **any available Jenkins agent**.
- You can also target specific **labels** or run inside **Docker containers** if needed.

---

## 3. `stages { }`
- Groups multiple **pipeline stages**.
- Each stage is a logical phase like Build, Test, or Deploy.
- Stages are **executed in order**.

---

## 4. `steps { }`
- Contains the actual **commands** to execute.
- You can run shell commands, print logs, or invoke tools.

---

## ✅ Minimal Summary
- `pipeline` is the container for everything.
- `agent` decides where the pipeline runs.
- `stages` organize the workflow into phases.
- `steps` are the individual actions inside each stage.

---
