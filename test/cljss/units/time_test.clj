(ns ^{:author "Jeremy Schoffen."}
  cljss.units.time-test
  (:require [clojure.algo.generic.arithmetic :as ag]
            [clojure.algo.generic.comparison :as cg])
  (:use cljss.units.time
        cljss.protocols
        midje.sweet))

(fact "We can compile time units"
  (compile-as-property-value (s 10)) => "10s"
  (compile-as-property-value (ms 5)) => "5ms"
  (compile-as-selector (s 10)) => "10s"
  (compile-as-selector (ms 5)) => "5ms")


(fact "We can use the generic stuff"
  (ag/+ (s 1) (ms 1)) => (ms 1001)

  (cg/zero? (s 0)) => truthy)