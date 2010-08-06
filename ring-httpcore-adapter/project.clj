(defproject ring/ring-httpcore-adapter "0.2.5"
  :description "Ring HttpCore adapter adapted for Google AppEngine."
  :url "http://github.com/maravillas/ring"
  :dependencies [[ring/ring-core "0.2.5"]
                 [org.apache.httpcomponents/httpcore "4.0.1"]
                 [org.apache.httpcomponents/httpcore-nio "4.0.1"]]
  :dev-dependencies [[lein-clojars "0.5.0"]])
