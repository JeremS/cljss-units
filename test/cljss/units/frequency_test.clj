(ns ^{:author "Jeremy Schoffen."}
  cljss.units.frequency-test
  (:require [clojure.algo.generic.arithmetic :as ag]
            [clojure.algo.generic.comparison :as cg])
  (:use cljss.units.frequency
        cljss.protocols
        midje.sweet))

(fact "We can compile frequencies"
  (compile-as-property-value (hz 10)) => "10Hz"
  (compile-as-property-value (khz 5)) => "5kHz"
  (compile-as-selector (hz 10)) => "10Hz"
  (compile-as-selector (khz 5)) => "5kHz")


(fact "We can use the generic stuff"
  (ag/+ (khz 1) (hz 1)) => (hz 1001)

  (cg/zero? (hz 0)) => truthy)