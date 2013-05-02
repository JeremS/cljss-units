(ns ^{:author "Jeremy Schoffen."}
  cljss.units.length
  (:refer-clojure :exclude [rem])
  (:require units.length
            [potemkin :as p])
  (:use cljss.units.macros)
  (:import [units.length Em Rem Ex Ch Vw Vh VMin VMax
                         Percentage Pixel Millimeter
                         Centimeter Inch Point Pica]))

(extend-units
 Em Rem Ex Ch Vw Vh VMin VMax
 Percentage Pixel Millimeter
 Centimeter Inch Point Pica)


(p/import-vars
 [units.length
   em  rem  ex  ch  vw  vh  vmin  vmax  %  px  mm  cm  in  pt  pc
   em? rem? ex? ch? vw? vh? vmin? vmax? %? px? mm? cm? in? pt? pc?])