(ns ^{:author "Jeremy Schoffen."}
  cljss.units.colors-test
  (:use cljss.units.colors
        cljss.protocols
        midje.sweet))


(fact "We can compile colors"
  (compile-as-property-value (rgba 10 10 10)) => "rgba(10,10,10,1.0)"
  (compile-as-property-value (hsla 10 10 10)) => "hsla(10,10%,10%,1.0)")