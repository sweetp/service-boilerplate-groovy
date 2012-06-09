Boilerplate project to have a starting point.

Make sure you have fetched the submodules in the lib directory:

    git submodule init
    git submoudle update

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
