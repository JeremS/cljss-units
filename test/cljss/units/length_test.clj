(ns  ^{:author "Jeremy Schoffen."}
  cljss.units.length-test
  (:refer-clojure :exclude [rem])
  (:require [clojure.algo.generic.arithmetic :as ag]
            [clojure.algo.generic.comparison :as cg])
  (:use cljss.units.length
        cljss.protocols
        midje.sweet))

(fact "We can compile lengths"
  (compile-as-property-value (px 10)) => "10px"
  (compile-as-property-value (em -50)) => "-50em"
  (compile-as-selector (px 10)) => "10px"
  (compile-as-selector (em -50)) => "-50em")


(fact "We can use the generic stuff"
  (ag/+ (in 1) (cm 2.54)) => (cm 5.08)

  (cg/zero? (em 1)) => falsey)