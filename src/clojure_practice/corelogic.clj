(ns clojure-practice.corelogic
  (:use clojure.core.logic)
  (:refer-clojure :exclude [==])
  (:require [clara.rules.accumulators :as acc]
            [clara.rules :refer :all]))

(run* [q]
  (== q true))
(run* [q]
  (!= q 1))

(run* [q]
   (membero q [1 2 3])
   (membero q [2 3 4]))


(run* [q]
   (fresh [a]
     (membero a [1 2 3])
     (membero q [3 4 5])
     (== a q)))

 (run* [q]
   (conde
     [succeed]))
