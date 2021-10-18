../mvnw clean package
../mvnw sonar:sonar \
  -Dsonar.projectKey=io.codebyexample:unit-test-sonar-qube \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.login=b229f28876ad85e6cdb5a30ef7e1331f66a8a2c9
