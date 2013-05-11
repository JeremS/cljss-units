(ns ^{:author "Jeremy Schoffen."}
  cljss.units.time
  (:require units.time
            [potemkin :as p])
  (:use cljss.units.macros)
  (:import [units.time Second MilliSecond]))


(extend-units Second MilliSecond)


(p/import-vars
 [units.time s s? ms ms?])
