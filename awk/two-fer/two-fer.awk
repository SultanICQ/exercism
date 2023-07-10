BEGIN {
    OFS = ""
    who = "you"
}

(length($0) > 0) { who = $0 }

END {
    print "One for ", who, ", one for me."
}
