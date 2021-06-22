FROM tomcat:8.5

RUN mv /usr/local/tomcat/webapps.dist/* /usr/local/tomcat/webapps/
COPY tomcat/tomcat-users.xml /usr/local/tomcat/conf/
COPY tomcat/manager/context.xml /usr/local/tomcat/webapps/manager/META-INF/
COPY tomcat/host-manager/context.xml /usr/local/tomcat/webapps/host-manager/META-INF/

CMD ["catalina.sh","run"]