# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build Commands

```bash
# Build the project
./gradlew build

# Run the application
./gradlew bootRun

# Run all tests
./gradlew test

# Run a single test class
./gradlew test --tests "com.example.demo.TestRest2ApplicationTests"

# Run a specific test method
./gradlew test --tests "com.example.demo.TestRest2ApplicationTests.contextLoads"

# Clean build
./gradlew clean build
```

## Architecture

This is a Spring Boot 4.0.2 REST API application using Java 17.

### Key Dependencies
- **Spring Boot Starter WebMVC**: REST controller support
- **Spring Boot Starter Validation**: Jakarta validation support (@Valid, @NotNull)
- **Lombok**: Reduces boilerplate with annotations (@Data, @Builder, @AllArgsConstructor, @NoArgsConstructor, @Slf4j)
- **Spring Boot DevTools**: Hot reload during development
- **Jackson Databind**: JSON serialization/deserialization

### Configuration
- RFC 9457 Problem Details enabled for standardized error responses (`spring.mvc.problemdetails.enabled=true`)

### Project Structure
- Main application entry point: `TestRest2Application.java`
- REST controllers in `com.example.demo` package
- Model classes use Lombok annotations for getters/setters/builders

### API Testing
Bruno API collection available in `doc/TestRest2/` for testing endpoints.
