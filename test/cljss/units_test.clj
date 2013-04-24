(ns cljss.units-test
  (:refer-clojure :exclude [rem])
  (:use cljss.units
        cljss.protocols
        midje.sweet))

(fact "We can compile lengths and angles"
  (compile-as-property-value (px 10)) => "10px"
  (compile-as-property-value (em -50)) => "-50em"
  (compile-as-property-value (deg -50)) => "-50deg")