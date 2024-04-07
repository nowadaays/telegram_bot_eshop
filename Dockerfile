FROM openjdk:11

ENV BOT_TOKEN="6701995256:AAGwXl3nUpRLs5dQK9QzwIlgbI_tL-nNbPw"
ENV PROVIDER_TOKEN="381764678:TEST:82145"

WORKDIR /usr/src/app

COPY ../../.. .

RUN javac -cp ".:./libs/*" *.java

CMD ["java" , "-cp" , ".:./libs/*" , "Main"]