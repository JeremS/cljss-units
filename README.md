# cljss-units

Extension to cljss allowing to use a units system.

The library use algo.generics and has one conflict
with clojure.core. A
```clojure
(ns my.project
  (:refer-clojure :exclude (rem + - * / ))
  (:use cljss.units))
```
might be necessary.

## Usage

FIXME

## License

Copyright © 2013 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
