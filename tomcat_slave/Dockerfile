FROM tomcat:9.0

RUN mkdir -p tomcat/manager
RUN mkdir -p tomcat/host-manager
RUN cd tomcat
RUN curl -O https://raw.githubusercontent.com/yashashmi/InfraAsCode/master/TomcatJava8/tomcat/tomcat-users.xml
RUN cd manager
RUN curl -O https://raw.githubusercontent.com/yashashmi/InfraAsCode/master/TomcatJava8/tomcat/manager/context.xml
RUN cd ..
RUN cd host-manager
RUN curl -O https://raw.githubusercontent.com/yashashmi/InfraAsCode/master/TomcatJava8/tomcat/host-manager/context.xml
RUN cd ..
RUN mv /usr/local/tomcat/webapps.dist/* /usr/local/tomcat/webapps/
COPY tomcat-users.xml /usr/local/tomcat/conf/
COPY manager/context.xml /user/local/tomcat/webapps/manager/META-INF/
COPY host-manager/context.xml /user/local/tomcat/webapps/host-manager/META-INF/

CMD ["catalina.sh","run"]