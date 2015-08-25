(ns clojure-practice.db
  (:use korma.db
        korma.core)
  )
(require '[clojure.java.jdbc :as j])

(def mysql-db {:subprotocol "mysql"
               :subname "//10.1.77.20:3306/TPFun"
               :user "aspnet_dianping"
               :password "dp!@Z0vyBUtAK"})

;(j/query mysql-db
;         ["select * from FUN_Category where ID = ?" "rosy"]
;         (println rows))

;(j/with-db-connection mysql-db
;                   (j/with-query-resuls rs ["select * from FUN_Category"]
;                                        (dorun (map #(println %) rs))))

(println (j/query mysql-db ["SELECT * FROM FUN_Category"]))

(def recordMap (j/query mysql-db
                       ["SELECT ID,Name FROM FUN_Category Where ID= ?" 1]
                       ))

(println recordMap)






