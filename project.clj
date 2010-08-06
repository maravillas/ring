(defproject org.clojars.maravillas/ring-gae "0.2.5"
  :description "A Clojure web applications library adapted for Google AppEngine."
  :url "http://github.com/maravillas/ring"
  :dependencies
    [[org.clojars.maravillas/ring-core-gae "0.2.5"]
     [org.clojars.maravillas/ring-devel-gae "0.2.5"]
     [org.clojars.maravillas/ring-httpcore-adapter-gae "0.2.5"]
     [org.clojars.maravillas/ring-jetty-adapter-gae "0.2.5"]
     [org.clojars.maravillas/ring-servlet-gae "0.2.5"]]
  :dev-dependencies
    [[autodoc "0.7.1"]
     [lein-clojars "0.5.0"]]
  :autodoc
    {:name "Ring (adapted for GAE)"
     :description "A Clojure web applications library (adapted for GAE)"
     :copyright "Copyright 2009-2010 Mark McGranaghan"
     :root "."
     :source-path ""
     :web-src-dir "http://github.com/mmcgrana/ring/blob/"
     :web-home "http://mmcgrana.github.com/ring/"
     :output-path "autodoc"
     :namespaces-to-document ["ring"]
     :trim-prefix "ring."
     :load-except-list [#"/example/" #"/test/" #"project\.clj"]})
