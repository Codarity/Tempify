cmake_minimum_required(VERSION 3.14)
project(my_cmake_app VERSION 1.0 LANGUAGES CXX)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

# Output path
set(CMAKE_RUNTIME_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}/bin)

# Includes
include_directories(include)

# Sources
file(GLOB_RECURSE SOURCES "src/*.cpp")

# Executable
add_executable(my_cmake_app ${SOURCES})
