(defproject hglog_stat_web "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.1"]
                 [ring/ring-defaults "0.1.2"]
                 [hglog_stat "0.1.0-SNAPSHOT"]
                 [cheshire "5.5.0"]]
  :plugins [[lein-ring "0.8.13"]]
  :ring {:handler hglog-stat-web.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
