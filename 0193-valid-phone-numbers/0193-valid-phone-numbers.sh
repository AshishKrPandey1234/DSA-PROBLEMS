# Read from the file file.txt and output all valid phone numbers to stdout.
#grep is a Unix command-line utility used to search for patterns in text using regular expressions.
#-E enables extended regex
#^ : anchor matches the start of the line
# {} in this number of character can be accepted is written
#[] in this range of digit is written
#|: or operation
# $ : anchor for the end of the line
grep -E '^((\([0-9]{3}\) [0-9]{3}-[0-9]{4})|([0-9]{3}-[0-9]{3}-[0-9]{4}))$' file.txt