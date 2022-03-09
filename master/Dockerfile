FROM jenkins/jenkins:lts-jdk11

COPY plugins_extra.txt /usr/share/jenkins/ref/plugins_extra.txt
RUN xargs /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins_extra.txt

ENV JENKINS_HOME /var/jenkins_home

ARG JAVA_OPTS
ENV JAVA_OPTS "-Djenkins.install.runSetupWizard=false -Djava.awt.headless=true -Dhudson.model.DirectoryBrowserSupport.CSP=\"default-src 'self'; style-src 'self' 'unsafe-inline';\" -Dorg.apache.commons.jelly.tags.fmt.timeZone=Asia/Calcutta ${JAVA_OPTS:-}"


