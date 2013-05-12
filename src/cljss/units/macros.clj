(ns ^{:author "Jeremy Schoffen."}
  cljss.units.macros
  (:use cljss.protocols))


(defn- extend-compilation [t]
  `(extend-type ~t
     CssSelector
     (compile-as-selector
      ([this#] (str this#))
      ([this# _#]
       (compile-as-selector this#)))

     CssPropertyValue
     (compile-as-property-value [this#] (str this#))))

(defmacro extend-units [& units]
  `(do ~@(for [u units]
           (extend-compilation u))))
