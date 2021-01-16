# ModeratorPlugin

## Purpose of this Plugin

Configure moderator status for a MineCraft server using the server from:
https://github.com/Megapixel99/VerifyPluginServer.

List of commands:
/mod
/staff
/de-mod

List of permissions:
mod: Sets the player as a mod in the database
staff: Sets the player as a staff member in the database
de-mod: revoke the moderator status of someone in the database

## System (environment) properties

To ensure the plugin builds successfully you will need to change the following
in `moderatorManagement.java`:
* configure the server host to your host (and port, if applicable)
* set the Bearer Token which will be used (if you choose to use one)

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
