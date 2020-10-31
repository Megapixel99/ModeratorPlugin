# ModeratorPlugin

## Purpose of this Plugin

Configure moderator status for a MineCraft server using the server from:
https://github.com/Megapixel99/VerifyPluginServer.

List of commands:
/mod
/de-mod

List of permissions:
mod: Allows player to make other players moderators and revoke moderator access
from other players

## System (environment) properties

To ensure the plugin builds successfully you will need to change the following
in `moderatorManagement.java`:
* configure the server host to your host and port
* set the help verbiage to whatever you call your players
(i.e. if your player base is university students the help verbiage should be
  set to "you are a university student")

## How to build this plugin

This plugin was developed and built with NetBeans. A tutorial on how to do
this can be found here:

https://www.spigotmc.org/wiki/spigot-plugin-development/

If you wish to use an IDE other that NetBeans please see the
"Creating a blank plugin" section here:

https://www.spigotmc.org/wiki/spigot-plugin-development/

## License
```
Copyright 2020 Seth Wheeler

Licensed under the MIT License.
```
