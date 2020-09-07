# intellij-hashicorp-sentinel

![Build](https://github.com/tylersmith34/intellij-hashicorp-sentinel/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)

## Template ToDo list
- [x] Create a new [IntelliJ Platform Plugin Template][template] project.
- [X] Verify the [pluginGroup](/gradle.properties), [plugin ID](/src/main/resources/META-INF/plugin.xml) and [sources package](/src/main/kotlin).
- [X] Review the [Legal Agreements](https://plugins.jetbrains.com/docs/marketplace/legal-agreements.html).
- [ ] [Publish a plugin manually](https://www.jetbrains.org/intellij/sdk/docs/basics/getting_started/publishing_plugin.html) for the first time.
- [ ] Set the Plugin ID in the above README badges.
- [ ] Set the [Deployment Token](https://plugins.jetbrains.com/docs/marketplace/plugin-upload.html).

<!-- Plugin description -->
This plugin provides language support for [HashiCorp Sentinel](https://www.hashicorp.com/sentinel/).  Sentinel is a policy as code framework that enables policy based decisions on HashiCorp projects.  An example would be a set of policies to prevent common misconfigurations of an AWS S3 Bucket in a Terraform workspace plan/apply.
<!-- Plugin description end -->

## Known issues
### Syntax for boolean expressions
I've been unable to parse this statement:
```
if checkMyValue(x) and x < y {
    return x
}
```
However, there are two work arounds.
 
Reversing the order is parsing correctly
```
if x < y and checkMyValue(x) {
    return x
}
```
Or add parentheses around x < y
```
if checkMyValue(x) and (x < y) {
    return x
}
```

## Installation

- Using IDE built-in plugin system:
  
  <kbd>Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "intellij-hashicorp-sentinel"</kbd> >
  <kbd>Install Plugin</kbd>
  
- Manually:

  Download the [latest release](https://github.com/tylersmith34/intellij-hashicorp-sentinel/releases/latest) and install it manually using
  <kbd>Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
