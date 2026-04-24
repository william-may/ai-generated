# ai-generated

A Spring Boot application built with Kotlin.

## Tech Stack

- **Spring Boot** 4.0.6
- **Kotlin** 2.2.21
- **Java** 17
- **Gradle** (Kotlin DSL)

## Getting Started

### Prerequisites

- JDK 17 or later

### Build

```bash
./gradlew build
```

### Run

```bash
./gradlew bootRun
```

The application starts on `http://localhost:8080`.

### Test

```bash
./gradlew test
```

## Endpoints

| Method | Path | Description |
|--------|------|-------------|
| GET | `/hello` | Returns a greeting (`?name=` param optional) |
| GET | `/actuator/health` | Application health check |