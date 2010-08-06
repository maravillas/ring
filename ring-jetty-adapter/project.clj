(defproject org.maravillas/ring-jetty-adapter-gae "0.2.5"
  :description "Ring Jetty adapter adapted for Google AppEngine."
  :url "http://github.com/maravillas/ring"
  :dependencies [[org.maravillas/ring-core-gae "0.2.5"]
                 [org.maravillas/ring-servlet-gae "0.2.5"]
                 [org.mortbay.jetty/jetty "6.1.14"]
                 [org.mortbay.jetty/jetty-util "6.1.14"]]
  :dev-dependencies [[lein-clojars "0.5.0"]])
