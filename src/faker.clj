(ns faker)

(def ^:private data (read-string (slurp (.getFile (clojure.java.io/resource "data.clj")))))
(defn first-name [] (rand-nth ((data :names) :first)))
(defn last-name [] (rand-nth ((data :names) :last)))
(defn name [] (str (first-name) " " (last-name)))
