Boilerplate project to have a starting point.

# Init your project

Remove current git stuff with and set up your own history with:

    rm -rf .git
    git init
    git add .
    git commit -m "init"

Use git submodule to fetch the content of the lib directory:

    git submodule init
    git submodule add https://github.com/sweetp/base-groovy.git lib/base

# Buildsystem

This project uses [gradle](http://gradle.org) as build system. Make sure
you installed version 1.0-milestone9. All other stuff needed comes with
gradle.

Read both build.gradle files in the root dir and in the service dir
to see was going on here. Most of this shoul fit your needs, but make sure
you adjust the archive basename in service/build.gradle.

After adding some source code and changed the basename you can run:

* "gradle test" to test your code with junit
* "gradle check" to check if your code meets the codenarc standards
* "gradle idea" to generate project files for Intellij IDEA IDE
* "gradle eclipse" to generate project files for Eclipse IDE
* "gradle jar" to zip your service

the last command generates a jar file in service/build/libs which
you can then move into your sweetp services dir:
'SWEETPROOTDIR/server/services'.
Don't forgett to add a new entry in your services.json and restart the server.

More Information on [sweet productivity](http://sweet-productivity.com).
