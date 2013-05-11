(ns ^{:author "Jeremy Schoffen."}
  cljss.units.resolution-test
  (:require [clojure.algo.generic.arithmetic :as ag]
            [clojure.algo.generic.comparison :as cg])
  (:use cljss.units.resolution
        cljss.protocols
        midje.sweet))

(fact "We can compile lengths and angles"
  (compile-as-property-value (dpi 10)) => "10dpi"
  (compile-as-property-value (dppx 5)) => "5dppx")


(fact "We can use the generic stuff"
  (ag/+ (dpcm 2.54) (dpi 1)) => (dpi 2.0)

  (cg/zero? (dppx 0)) => truthy)