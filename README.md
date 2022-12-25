## Grafana & Prometheus & WAS(JVM 기반) 사용하여 모니터링 구축

<img src="/img/img-1.png" width="750px">

### Grapana 설정

**Grapana Login (default)**
ID : admin
PW : admin

**Prometheus 설정**

<img src="/img/img-2.png" width="750px">

### Telegraf

```jsx
Mac 다운 정보
To restart telegraf after an upgrade:
  brew services restart telegraf
Or, if you don't want/need a background service you can just run:
  /usr/local/opt/telegraf/bin/telegraf -config /usr/local/etc/telegraf.conf -config-directory /usr/local/etc/telegraf.d
```

### 다음..

- Telegraf
- Redis 모니터링

참고 : [https://betterprogramming.pub/how-to-monitor-a-spring-boot-app-with-prometheus-and-grafana-22e2338f97fc](https://betterprogramming.pub/how-to-monitor-a-spring-boot-app-with-prometheus-and-grafana-22e2338f97fc)

참고 : https://blog.opstree.com/2021/11/09/nginx-monitoring-using-telegraf-prometheus-grafana/