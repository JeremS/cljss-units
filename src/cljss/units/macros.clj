(ns ^{:author "Jeremy Schoffen."}
  cljss.units.macros
  (:use cljss.protocols))


(defn- extend-compilation [t]
  `(extend-type ~t
     CssPropertyValue
     (compile-as-property-value [this#] (str this#))))

(defmacro extend-units [& units]
  `(do ~@(for [u units]
           (extend-compilation u))))
