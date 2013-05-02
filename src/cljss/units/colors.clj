(ns ^{:author "Jeremy Schoffen."}
  cljss.units.colors
  (:refer-clojure :exclude [rem])
  (:require units.colors
            [potemkin :as p])
  (:use cljss.units.macros)
  (:import [units.colors RGBa HSLa]))


(extend-units RGBa HSLa)

(p/import-vars
 [units.colors

  rgba hsla

  red green blue
  hue saturation lightness
  alpha

  adjust-hue
  lighten  darken
  saturate desaturate

  redify   deredify
  greenify degreenify
  blueify  deblueify

  opacify transparentize

  grayscale c-complement inverse mix])