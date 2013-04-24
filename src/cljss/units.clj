(ns cljss.units
  (:refer-clojure :exclude [rem])
  (:require [units.core :as u]
            [potemkin :as p])
  (:use cljss.protocols)
  (:import [units.length Em Rem Ex Ch Vw Vh VMin VMax
                         Percentage Pixel Millimeter 
                         Centimeter Inch Point Pica]
           [units.angle Degree Gradiant Radiant Turn]))




(defmacro extend-compilation [t]
  `(extend-type ~t
     CssPropertyValue
     (compile-as-property-value [this#] (str this#))))

(defmacro extend-units [& units]
  `(do ~@(for [u units]
           `(extend-compilation ~u))))

(extend-units
 Em Rem Ex Ch Vw Vh VMin VMax
 Percentage Pixel Millimeter 
 Centimeter Inch Point Pica
 
 Degree Gradiant Radiant Turn)


(p/import-vars
 [units.core 
   em rem ex ch vw vh vmin vmax
   % px mm cm in pt pc
   deg grad rad turn])