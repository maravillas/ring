(defproject ring-gae "0.2.0"
  :description "A Clojure web applications library adapted for Google AppEngine. See  http://github.com/mmcgrana/ring for original and http://github.com/jeandenis/ring for GAE compatible version."
  :dependencies
    [[ring-gae/ring-core-gae "0.2.0"]
     [ring-gae/ring-devel-gae "0.2.0"]
     [ring-gae/ring-httpcore-adapter-gae "0.2.0"]
     [ring-gae/ring-jetty-adapter-gae "0.2.0"]
     [ring-gae/ring-servlet-gae "0.2.0"]]
  :dev-dependencies
    [[autodoc "0.7.0"]
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
