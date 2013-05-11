(ns ^{:author "Jeremy Schoffen."}
  cljss.units.frequency
  (:require units.frequency
            [potemkin :as p])
  (:use cljss.units.macros)
  (:import [units.frequency Hertz KiloHertz]))


(extend-units Hertz KiloHertz)


(p/import-vars
 [units.frequency hz hz? khz khz?])