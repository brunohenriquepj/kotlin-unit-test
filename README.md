# Kotlin Test Studies

[![CI](https://github.com/brunohenriquepj/kotlin-unit-test/actions/workflows/ci-action.yml/badge.svg)](https://github.com/brunohenriquepj/kotlin-unit-test/actions/workflows/ci-action.yml)
[![Build Status](https://cloud.drone.io/api/badges/brunohenriquepj/kotlin-unit-test/status.svg?ref=refs/heads/main)](https://cloud.drone.io/brunohenriquepj/kotlin-unit-test)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=brunohenriquepj_kotlin-unit-test&metric=coverage)](https://sonarcloud.io/dashboard?id=brunohenriquepj_kotlin-unit-test)
[![codecov](https://codecov.io/gh/brunohenriquepj/kotlin-unit-test/branch/main/graph/badge.svg?token=9ICNMASLQR)](https://codecov.io/gh/brunohenriquepj/kotlin-unit-test)

## Setup Java with [SDKMAN!](https://github.com/sdkman/sdkman-cli)

    sdk env install

## Build

    ./gradlew build --exclude-task test 

## Test

     ./gradlew test --stacktrace
