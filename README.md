# Meigen Generator

## Setup

```bash

// 10行目のADD_API_KEY_HEREをIBM CloudのAPIキーと置き換える
$ vim dockerfile

// 後はdocker build ~ runで実行できる。ポートは8080でバインドすること。
```

## コマンド

コンテナ実行時に環境変数を渡しても ok

```
docker build -t meigen .
docker run -e "APP_API_KEY=xxx" -e "APP_PROJECT_ID=yyy" -p 8080:8080 meigen
```
