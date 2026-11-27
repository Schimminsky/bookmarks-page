# Übersicht

- die Idee ist eine Website zu erstellen, auf der ich wichtige Bookmarks oder ähnliches Ablege
- das kann verwendet werden, um meine Seitenleite bisschen aufzuräumen
- Themen wären:
    - Tattoo Ideen
    - Streaming Seiten
    - Audio Streaming Seiten
    - Manga
    - Wunschliste
- eigentliches Ziel ist es, mehr ins Programmieren zu kommen

# Werkzeuge

- primär möchte ich Clojure nutzen, mal sehen wie gut das klappt
- auf Claude nur zurückgreifen, wenn ich nicht mehr weiterkomme
    - für die Initiallisierung kann Claude aber schon genutzt werden

# Lernpfad

Aufbau: Ring + Hiccup, Daten in einer EDN-Datei (nur lokal, Pflege direkt in der Datei)

- [ ] Hello World im Browser: erster Ring-Handler liefert Text aus
- [ ] Hiccup einbinden: Handler liefert echtes HTML (Abhängigkeit in `project.clj`, aktuelle Version auf clojars.org)
- [ ] Daten auslagern: `bookmarks.edn` anlegen und einlesen (`slurp`, `clojure.edn/read-string`)
- [ ] Pro Kategorie einen Abschnitt rendern (`for`, `group-by`)
- [ ] Unterschiedliche Darstellung pro Kategorie, z. B. `:kapitel` bei Manga, `:preis` bei der Wunschliste (`case` oder `defmulti`)
- [ ] Bilder einbinden: Dateien in `resources/public/`, ausliefern mit `wrap-resource`
- [ ] Etwas CSS: `style.css` auf demselben Weg ausliefern
- [ ] Optional: Formulare im Browser zum Anlegen und Löschen (Routing mit Reitit, POST-Requests, `atom`)
