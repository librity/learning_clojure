;; SOURCE: https://www.youtube.com/watch?v=C-kF25fWTO8
;; Load moby dick from Project Gutenberg

(def url "https://gutenberg.org/files/2701/2701-0.txt")

(def book (slurp url))

(def words (re-seq #"[\w|'\w]+" book))

(count words)

(take 20 words)

;; 20 most frequently used words
;; https://en.wikipedia.org/wiki/Dolch_word_list

(#{1 2 3} 3)
(#{1 2 3} 4)

(def common-words #{"a" "and" "away" "big" "blue" "can" "come" "down" "find" "for" "funny" "go" "help" "here" "s" "i" "t" "in" "is" "it" "jump" "little" "look" "make" "me" "my" "not" "one" "play" "red" "run" "said" "see" "the" "three" "to" "two" "up" "we" "where" "yellow" "you"
                    "all" "am" "are" "at" "ate" "be" "black" "brown" "but" "came" "did" "do" "eat" "four" "get" "good" "have" "he" "into" "like" "must" "new" "no" "now" "on" "our" "out" "please" "pretty" "ran" "ride" "saw" "say" "she" "so" "soon" "that" "there" "they" "this" "too" "under" "want" "was" "well" "went" "what" "white" "who" "will" "with" "yes"
                    "after" "again" "an" "any" "as" "ask" "by" "could" "every" "fly" "from" "give" "giving" "had" "has" "her" "him" "his" "how" "just" "know" "let" "live" "may" "of" "old" "once" "open" "over" "put" "round" "some" "stop" "take" "thank" "them" "then" "think" "walk" "were" "when"
                    "always" "around" "because" "been" "before" "best" "both" "buy" "call" "cold" "does" "don't" "fast" "first" "five" "found" "gave" "goes" "green" "its" "made" "many" "off" "or" "pull" "read" "right" "sing" "sit" "sleep" "tell" "their" "these" "those" "upon" "us" "use" "very" "wash" "which" "why" "wish" "work" "would" "write" "your"
                    "about" "better" "bring" "carry" "clean" "cut" "done" "draw" "drink" "eight" "fall" "far" "full" "got" "grow" "hold" "hot" "hurt" "if" "keep" "kind" "laugh" "light" "long" "much" "myself" "never" "only" "own" "pick" "seven" "shall" "show" "six" "small" "start" "ten" "today" "together" "try" "warm"})

(defn most-frequent-words [words]
  (->> words
       (map clojure.string/lower-case)
       (remove common-words)
       (frequencies)
       (sort-by val)
       (take-last 20)))

(most-frequent-words words)

;; 20 longest words

(count "GARMONBOZIA")

(defn longest-words [words]
  (->> words
       (map clojure.string/lower-case)
       (distinct)
       (sort-by count)
       (take-last 20)))

(longest-words words)

;; Longest palindrome

(defn palindrome? [coll]
  (= (seq coll) (reverse coll)))

(palindrome? [1 2 3 2 1])
(palindrome? "racecar")
(palindrome? "racecap")

(reverse "racecar")

(defn longest-palindrome [words]
  (->> words
       (map clojure.string/lower-case)
       (distinct)
       (filter palindrome?)
       (sort-by count)
       (last)))

(longest-palindrome words)