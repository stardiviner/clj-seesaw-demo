(ns hello-seesaw.core
  (:use seesaw.core)
  (:require [sanersubstance.core :as substance])
  (:import [org.pushingpixels.substance.api SubstanceLookAndFeel]
           [org.pushingpixels.substance.api.skin GraphiteSkin]
           [org.pushingpixels.substance.internal.utils SubstanceColorUtilities]))

(defn set-theme!  []
  (native!)
  (SubstanceLookAndFeel/setSkin (GraphiteSkin.))
  (substance/enforce-event-dispatch))

(defn -main [& args]
  (set-theme!)
  (invoke-later
   (-> (frame :title "Hello",
              :content "Hello, Seesaw",
              :on-close :dispose)
       pack!
       show!)))
