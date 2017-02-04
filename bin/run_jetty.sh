#!/usr/bin/env bash


#in windows
java -Dmaven.home=F:\SystemShare\software\apache-maven-3.3.9 \
 -Dclassworlds.conf=F:\SystemShare\software\apache-maven-3.3.9\bin\m2.conf \
  -Didea.launcher.port=7534 \
   "-Didea.launcher.bin.path=C:\Program Files (x86)\JetBrains\IntelliJ IDEA 14.0.3\bin" -Dfile.encoding=UTF-8  \
   -classpath "F:\SystemShare\software\apache-maven-3.3.9\boot\plexus-classworlds-2.4.2.jar;C:\Program Files (x86)\JetBrains\IntelliJ IDEA 14.0.3\lib\idea_rt.jar" \
    com.intellij.rt.execution.application.AppMain org.codehaus.classworlds.Launcher -Didea.version=14.0.3 \
    -s C:\Users\dell\.m2\settings.xml -Dmaven.repo.local=C:\Users\dell\.m2\repository jetty:run
