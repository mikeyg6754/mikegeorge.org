(ns mikegeorge-org.routes.home
  (:use compojure.core)
  (:require [mikegeorge-org.views.layout :as layout]
            [mikegeorge-org.util :as util]))

(defn home-page []
  (layout/render
    "home.html" {:content (util/md->html "/md/docs.md")}))

(defroutes home-routes
  (GET "/" [] (home-page)))
