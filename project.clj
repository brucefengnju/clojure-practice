(defproject clojure-practice "0.1.0-SNAPSHOT"
  :description "clojure-practice"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.6"]
                 [ring/ring-core "1.2.1"]
                 [hiccup "1.0.0"]]
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler clojure-practice.handler/app})
