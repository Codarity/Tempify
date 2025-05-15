# Tempify

Tempify is a powerful, modular template generator designed to create fully customizable project scaffolds across languages and platforms. It supports logic-driven templates, conditional features, dynamic placeholder injection, and full integration with preprocessors.

## Features

- **Modular Templates** — Compose templates from reusable parts
- **Dynamic Variables** — User input, defaults, derived values, and logic-based prompts
- **Template Inheritance** — Extend and override base templates
- **Conditional File Handling** — Include or exclude files and folders based on rules
- **Preprocessor Integration** — Assign variable sets per file for preprocessing
- **CLI Interactive Mode** — Guided prompts with validation and smart defaults
- **Scriptable in Lua** — Full logic and customization powered by Lua scripting
- **Extensible** — Support for hooks, plugins, remote templates, and more (planned)

## Quick Start

```bash
# Clone the repository
git clone https://github.com/your-org/Tempify.git
cd Tempify

# Run the generator
./templgen my-new-project
```

## Template Structure

Templates are stored in the `templates/` directory, each with:

```
templates/
├── my-template/
│   ├── template.lua        # Logic and configuration
│   ├── files/              # Files and folders to generate
│   └── extras/             # Optional helpers or extensions
```

## Lua Template Definition

Each template uses a `template.lua` file to define:

- Input prompts and defaults
- Logic for conditional inclusion
- File overrides and preprocessor instructions

Example:

```lua
return {
    name = "java-maven",
    placeholders = {
        projectName = { prompt = "Project name", default = "MyApp" },
        useDatabase = { prompt = "Include database?", default = "no" }
    },
    overrides = {
        ["files/config/db.xml"] = {
            skip_if = function(vars) return vars.useDatabase == "no" end
        }
    }
}
```

## Preprocessor Integration

You can define per-file preprocessor variables:

```lua
overrides = {
    ["files/main.java"] = {
        prebyte = {
            package = "com.example.project"
        }
    }
}
```

## Roadmap

- [x] Core CLI scaffolding engine
- [x] Lua-based template logic
- [x] Conditional file processing
- [x] Preprocessor integration
- [ ] Plugin system
- [ ] Remote templates
- [ ] GUI interface

## License

MIT License. See [LICENSE](./LICENSE) for more information.
