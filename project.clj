(defproject cljss-units "0.1.0"
  :description "Units handling extensions for cljss."
  
  :url ""
  
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [potemkin "0.2.2"]
                 [cljss "0.1.0"]
                 [units "0.1.0"]]
  
  :profiles {:dev
             {:dependencies [[midje "1.5.1"]]}})
