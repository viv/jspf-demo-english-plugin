### Java Simple Plugin Framework (JSPF) Demo
This is a simple demo of the the Java Simple Plugin Framework (JSPF). Visit the project 
homepage at https://code.google.com/p/jspf/ for more information on JSPF.

### Demo Structure
There is a single [main application](../../../jspf-demo-host) which supports plugins. The main application uses 
plugins to output a simple greeting in different languages. This demo has two plugins 
which output a greeting in [French](../../../jspf-demo-french-plugin) and [English](../../../jspf-demo-english-plugin). Plugins are added to the main application 
as JAR files. Each plugin has its own project repository from which JARs are created.

This code requires that you have `jspf.core-1.0.2.jar` on your classpath.
