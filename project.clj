(defproject clojure-practice "0.1.0-SNAPSHOT"
  :description "clojure-practice"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.6"]
                 [ring/ring-core "1.2.1"]
                 [hiccup "1.0.0"]
                 [org.clojure/core.logic "0.8.10"]
                 [org.toomuchcode/clara-rules "0.8.8"]
                 [org.clojure/java.jdbc "0.3.6"]
                 [mysql/mysql-connector-java "5.1.25"]
                 [org.clojure/java.jdbc "0.4.1"]
                 [korma "0.3.0"]]
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler clojure-practice.handler/app})
