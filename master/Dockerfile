FROM jenkins/jenkins:2.319.3-jdk11
USER root
RUN apt-get update && apt-get install -y lsb-release
RUN curl -fsSLo /usr/share/keyrings/docker-archive-keyring.asc \
  https://download.docker.com/linux/debian/gpg
RUN echo "deb [arch=$(dpkg --print-architecture) \
  signed-by=/usr/share/keyrings/docker-archive-keyring.asc] \
  https://download.docker.com/linux/debian \
  $(lsb_release -cs) stable" > /etc/apt/sources.list.d/docker.list
RUN apt-get update && apt-get install -y docker-ce-cli
USER jenkins
RUN jenkins-plugin-cli --plugins "credentials-binding:latest "\
"configuration-as-code:latest "\
"email-ext:latest "\
"git:latest "\
"git-client:latest "\
"git-server:latest "\
"github:latest "\
"github-api:latest "\
"github-branch-source:latest "\
"github-oauth:latest "\
"jdk-tool:latest "\
"junit:latest "\
"mailer:latest "\
"maven-plugin:latest "\
"plain-credentials:latest "\
"scm-api:latest "\
"ssh-credentials:latest "\
"ssh-slaves:latest "\
"timestamper:latest "\
"jobs-dsl:latest "\
"pipeline-stage-view:latest "\
"workflow-aggregator:latest "\
"google-compute-engine:latest "\
"test-results-analyzer:latest "\
"cucumber-reports:latest "\
"performance:latest "\
"htmlpublisher:latest"

ARG JAVA_OPTS
ENV JAVA_OPTS "-Djenkins.install.runSetupWizard=false -Djava.awt.headless=true -Dhudson.model.DirectoryBrowserSupport.CSP=\"default-src 'self'; style-src 'self' 'unsafe-inline';\" -Dorg.apache.commons.jelly.tags.fmt.timeZone=Asia/Calcutta ${JAVA_OPTS:-}"


