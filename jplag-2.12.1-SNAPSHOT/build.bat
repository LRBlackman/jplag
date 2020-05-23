@echo off
cd jplag && mvn clean generate-sources install && mvn assembly:assembly