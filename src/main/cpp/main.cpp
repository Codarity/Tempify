#include "sol/sol.hpp"
#include <iostream>
#include <filesystem>
#include <string>

int main() {
    sol::state lua;
    lua.open_libraries(sol::lib::base, sol::lib::package, sol::lib::os, sol::lib::io, sol::lib::table);
    return 0;
}
