# faker

Data faker for Clojure in the spirit of Perl's Data::Faker and Ruby's faker gem.

## Usage

```clojure
; Inside your test files...
(ns my-test
  (:use [faker :as f]))

(deftest testing-untouched
  (testing "returns the argument untouched"
    (let [a-name (f/name)]
      (is (= a-name (untouched a-name))))))
```

## License

Copyright © 2012 Ryan Neufeld

Distributed under the Eclipse Public License, the same as Clojure.
