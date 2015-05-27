## CP-bot docker file

FROM centos:6.6

# Install java
RUN yum install -y java-1.7.0-openjdk-1.7.0.75

RUN curl https://bintray.com/sbt/rpm/rpm | tee /etc/yum.repos.d/bintray-sbt-rpm.repo && \
    yum install -y sbt

ADD . /opt/app/

WORKDIR /opt/app

CMD ["sbt", "run"]
