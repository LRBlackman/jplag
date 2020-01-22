@echo off
cd jplag && mvn clean generate-sources install && mvn assembly:assembly && cd target && java -jar jplag-2.12.1-SNAPSHOT-jar-with-dependencies.jar -l c#-hull -c something.cs somethingelse.cs