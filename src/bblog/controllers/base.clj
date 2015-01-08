(ns bblog.controllers.base
  (:require
    [clostache.parser :as clostache]))

(defn read-template [model-name template-name]
  (slurp (clojure.java.io/resource
    (str "views/" model-name "/" template-name ".mustache"))))

(defn render-template [model-name template-file params]
  (clostache/render (read-template model-name template-file) params))