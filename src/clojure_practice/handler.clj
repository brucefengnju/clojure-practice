(ns clojure-practice.handler
   (:gen-class)
  (:use compojure.core
        ring.adapter.jetty
        [hiccup.middleware :only (wrap-base-url)]
        ring.adapter.jetty)
  (:require [compojure.route :as route]
            [compojure.handler :as handler]
            [compojure.response :as response]))

(defroutes main-routes
  (GET "/" [] (str "hello world"))
  (GET "/user/:id" [id]
       (str "<h1>hello" id "</h1>"))
  (GET "/test" request (str request))
  (route/resources "/")
  (route/not-found "Page not found"))

(def app
  (-> (handler/site main-routes)
      (wrap-base-url)))

(defn start-server
  []
  (run-jetty (app) {:port 5050}))

(run-jetty main-routes {:port 5050})

