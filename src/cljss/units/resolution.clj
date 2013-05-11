(ns ^{:author "Jeremy Schoffen."}
  cljss.units.resolution
  (:require units.resolution
            [potemkin :as p])
  (:use cljss.units.macros)
  (:import [units.resolution DotsPerInch DotsPerPixel DotsPerCentimeter]))


(extend-units DotsPerInch DotsPerPixel DotsPerCentimeter)


(p/import-vars
 [units.resolution dpi dpi? dpcm dpcm? dppx dppx?])