#!/bin/bash
DIR_with_dependencies="/tmp/equipe/e2e/dependencies"
EXT=jar
DEPENDENSIES_String=""
DEPENDENCY_SEPARATOR=":"
IP_OF_ENODEB="10.241.112.4"
TEST_CLASS_NAME="com.ericsson.nms.mediation.corbahandler.teste2e.E2eCorbaHandlerTest"

java -Dse.ericsson.security.debug=true -DipAddress=10.241.112.2 -Dcorba.client.host.v4=10.32.224.79 -Dcorba.client.host.v6=fe80::c822:50ff:fe5a:0 -Dse.ericsson.security.componentNameV4=test_e2e_corba_handler -Dse.ericsson.security.componentNameV6=test_e2e_corba_handler_v6 -Dse.ericsson.security.PropertyFileLocation=/tmp/equipe/e2e/dependencies/config.xml -DORBInitRef=NameService=iioploc://masterservice:12468/NameService -cp /tmp/equipe/e2e/dependencies/*: com.ericsson.nms.mediation.corbahandler.teste2e.E2eCorbaHandlerTest

