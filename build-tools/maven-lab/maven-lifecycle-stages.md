# Maven Lifecycle Summary (In My Words)

This is my personal understanding of how Maven works — not from the textbook, but from how things actually happen behind the scenes in a real-world DevOps environment.

## 1. `mvn validate`
Used to run a **pre-requisite check** on the project. It ensures everything (like `pom.xml`, folder structure, dependencies) is available before moving on to the next stage, which is compilation.

## 2. `mvn compile`
Used to **convert the project source code into bytecode**. This turns `.java` files into `.class` files that can be executed by the JVM.

## 3. `mvn test`
Used to perform **unit testing**. It refers to the `src/test` folder and runs the test cases written by the developers. As a DevOps engineer, I don't usually write these tests — developers do.

## 4. `mvn package`
This command is used to **package the compiled bytecode** into an artifact (like a `.jar` or `.war`) which goes into the `target/` directory.

## 5. `mvn verify`
This stage checks whether the **quality of the artifact** has been compromised during the packaging step. It basically ensures there are no integrity issues.

## 6. `mvn install`
Used to **install the artifact from the `target/` directory into the local Maven repository** (`~/.m2/repository`). This makes the artifact available locally for other projects.

## 7. `mvn deploy`
This is used to **push the artifact from the `target/` directory to a remote artifact repository**, such as Artifactory, Nexus, or even an S3 bucket configured as a Maven repo.  
Note: It does *not* push from `.m2/repository`, but directly from the `target/` directory.

---


