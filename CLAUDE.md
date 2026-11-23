# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project status

Early stage: no source code, build file, or tests exist yet. Only `README.md`, `.gitignore`, and an untracked `plan.md` (written in German) are present. Update this file with real build/test/run commands once a project structure (e.g. `project.clj` or `deps.edn`) is in place. Don't assume one yet.

## Purpose

A personal website for storing bookmarks, meant to clean up the browser sidebar. Planned categories (from `plan.md`): tattoo ideas, video streaming sites, audio streaming sites, manga, and a wishlist.

## How to work in this repo

- **The main goal is for the owner to learn programming.** The owner wants to write the code themselves and use Claude only when they're stuck. Claude may help with the initial project setup. After that, prefer explanations, hints, and small targeted fixes over writing whole features, unless the owner explicitly asks for more.
- **Language: Clojure, built with the Clojure CLI (`deps.edn`), not Leiningen.** The `.gitignore` still contains Leiningen entries from the template, but you can ignore them.
- **Editor: Neovim** with Conjure (REPL evaluation, localleader `,`) and nvim-paredit. Conjure connects through `.nrepl-port`, so the project should provide an nREPL alias in `deps.edn` (nrepl + cider-nrepl middleware). For "how do I do this in Neovim" questions, the user-level `nvim-howto` skill applies.
