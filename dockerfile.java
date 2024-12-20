FROM openjdk:11.0.16-jdk-slim-bullseye

# 更新
RUN apt update && \
    apt upgrade -y

# 套件管理更新資料，安裝必須工具，清理缓存
RUN apt-get update && \
    apt-get install -y time && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# 設定工作目錄
WORKDIR /app