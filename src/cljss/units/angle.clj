(ns ^{:author "Jeremy Schoffen."}
  cljss.units.angle
  (:require units.angle
            [potemkin :as p])
  (:use cljss.units.macros)
  (:import [units.angle Degree Gradiant Radiant Turn]))


(extend-units Degree Gradiant Radiant Turn)

(p/import-vars
 [units.angle deg  grad  rad  turn
              deg? grad? rad? turn?])