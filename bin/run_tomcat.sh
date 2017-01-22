#!/usr/bin/env bash


/Library/Java/JavaVirtualMachines/jdk1.8.0_111.jdk/Contents/Home/bin/java \
 "-Dmaven.home=/Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven3" "-Dclassworlds.conf=/Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven3/bin/m2.conf" -Didea.launcher.port=7533 "-Didea.launcher.bin.path=/Applications/IntelliJ IDEA CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath "/Applications/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven3/boot/plexus-classworlds-2.4.jar:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar" \
  com.intellij.rt.execution.application.AppMain  \
 org.codehaus.classworlds.Launcher -Didea.version=2016.2.5 \
 org.apache.tomcat.maven:tomcat7-maven-plugin:2.2:run

