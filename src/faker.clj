(ns faker
  (:require [faker.data :as d]))

(defn first-name [] (rand-nth d/first-names))
(defn last-name [] (rand-nth d/last-names))
(defn name [] (str (first-name) " " (last-name)))
