(defproject jeremys/cljss-units "0.2.0"
  :description "Extensions adding units for cljss."
  :url "https://github.com/JeremS/cljss-units"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [cljss "0.2.0"]
                 [units "0.2.0"]]

  :profiles {:dev
             {:dependencies [[midje "1.5.1"]]}})
