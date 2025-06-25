# Claude Development Documentation

This document contains important information for Claude AI assistant when working on this project.

## Project Overview

This is the source code repository for "Java 9 Recipes" showcasing Java 9+ features and patterns, recently modernized with current tooling and testing frameworks.

## Build System & Dependencies

### Core Technologies
- **Language**: Java 17 (using Gradle toolchain)
- **Build Tool**: Gradle 8.14.2 (latest stable)
- **Testing**: JUnit 5.13.2 (already modern)
- **CI**: GitHub Actions

### Key Dependencies
- `org.junit.jupiter:junit-jupiter` - Main testing framework
- `org.junit.platform:junit-platform-launcher` - Required for test execution
- `org.hamcrest:hamcrest` - Assertion library
- `com.google.code.gson:gson` - JSON processing

### Dependency Management
- Uses traditional Gradle dependency declarations in `build.gradle`
- JUnit BOM manages all JUnit component versions consistently
- No JUnit vintage engine (already using JUnit 5)

## Project Structure

```
src/
├── main/java/          # Main source code with Java 9+ examples
├── test/java/          # JUnit 5 test suite
client/                 # Client module
server/                 # Server module with tests
gradle/
└── wrapper/           # Gradle wrapper files
```

## Recent Modernization Work

### Major Updates Completed
1. **Gradle Upgrade**: 7.6 → 8.14.2
2. **Java Version**: 11 → 17 (with toolchain support)
3. **Build Modernization**: Added JUnit BOM management, updated repositories
4. **GitHub Actions**: Updated to Java 17

### Testing Framework Status
- **Already using JUnit 5** - No migration needed ✅
- **Modern patterns in use**:
  - `assertThrows()` for exception testing
  - `@Test` from `org.junit.jupiter.api.Test`
  - `org.junit.jupiter.api.Assertions.*` imports
- **Dependencies**: Added `junit-platform-launcher` for proper Gradle execution

## Common Development Tasks

### Running Tests
```bash
# All tests
./gradlew test

# Specific test class
./gradlew test --tests "com.kousenit.recipes.generics.SafeVaragsDemoTest"

# With detailed output
./gradlew test --info
```

### Building
```bash
# Clean build
./gradlew clean build

# Just compile
./gradlew compileJava compileTestJava
```

## Important Notes for Claude

### When Working with Tests
- All tests use JUnit 5 - project was already modern ✅
- Use `assertThrows()` for exception testing
- Use `@Test` from `org.junit.jupiter.api.Test`
- Use `org.junit.jupiter.api.Assertions.*` for assertions

### Code Patterns to Follow
- Java 17 features are available but code maintains Java 9+ examples
- Use modern testing patterns (JUnit 5, Hamcrest)
- Follow existing package structure and naming conventions

### Dependencies
- Traditional Gradle dependency management in `build.gradle`
- JUnit BOM ensures version consistency
- No junit-vintage-engine needed (already modern)

### GitHub Actions
- CI runs on Java 17
- Builds with `./gradlew build`
- All tests must pass for successful builds

## Known Issues/Considerations

### Test Execution
- All tests pass consistently
- Multi-module project with separate client/server modules
- Server module contains the test suite

### Compatibility
- Project maintains Java 9+ example compatibility while using Java 17 for builds
- Modern Gradle version provides better performance and features
- JUnit 5 provides modern test organization and features

## Files to Monitor

### Critical Configuration Files
- `build.gradle` - Main build configuration
- `server/build.gradle` - Server module configuration
- `client/build.gradle` - Client module configuration
- `gradle/wrapper/gradle-wrapper.properties` - Gradle version
- `.github/workflows/gradle.yml` - CI configuration

### Test Directory Structure
- Main tests in `src/test/java/` use JUnit 5
- Server tests in `server/src/test/java/` use JUnit 5
- Test organization follows main source package structure
- Both unit tests and integration examples present

This documentation helps ensure consistent development practices and maintains the project's modernized state.

## Java Project Modernization Migration Summary

This project underwent modernization on 2025-06-25:

### Completed Upgrades
1. **Gradle**: 7.6 → 8.14.2
2. **Java**: 11 → 17 (with toolchain support)
3. **Repository**: jcenter() → mavenCentral()
4. **Dependencies**: Added JUnit BOM and platform launcher
5. **GitHub Actions**: Updated to Java 17

### No Migration Needed
- **JUnit**: Already using JUnit 5.13.2 ✅
- **Test patterns**: Already using modern JUnit 5 syntax ✅
- **Assertions**: Already using `assertThrows()` and proper imports ✅

### Migration Time
- **Actual time**: ~5-10 minutes (much faster than estimated)
- **Reason**: Project was already using modern JUnit 5, only infrastructure updates needed

The project was in excellent shape with modern testing practices already in place, requiring only build system and runtime upgrades.