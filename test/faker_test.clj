(ns faker-test
  (:use clojure.test
        [faker :as f]))

(deftest testing-name
  (testing "(name) can generate a fake name"
    (is (re-find #"\w+ \w+" (f/name)))))