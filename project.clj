(defproject ninja-app "0.1.0-SNAPSHOT"
  :main ninja-app.core/run
  :description "This is just a simple Clojure Web Application"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
  				 [javax.servlet/servlet-api "2.5"]
  				 [ring "1.6.2"]
  				 [compojure "1.6.0"]
  				 [hiccup "1.0.5"]
  				 [com.h2database/h2 "1.4.193"]])


;[org.clojure/java.jdbc "0.6.0"]