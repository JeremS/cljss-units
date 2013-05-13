(ns ^{:author "Jeremy Schoffen."}
  cljss.units.angle-test
  (:require [clojure.algo.generic.arithmetic :as ag]
            [clojure.algo.generic.comparison :as cg])
  (:use cljss.units.angle
        cljss.protocols
        midje.sweet))

(fact "We can compile angles"
  (compile-as-property-value (deg 10)) => "10deg"
  (compile-as-property-value (turn 5)) => "0turn"
  (compile-as-selector (deg 10)) => "10deg"
  (compile-as-selector (turn 5)) => "0turn"
  (compile-as-selector (turn 5) {}) => "0turn")


(fact "We can use the generic stuff"
  (ag/+ (grad 100) (deg 90)) => (deg 180.0)

  (cg/zero? (turn 1)) => truthy)