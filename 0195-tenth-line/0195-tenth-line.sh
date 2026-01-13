# Read from the file file.txt and output the tenth line to stdout.
awk 'NR == 10 {print; exit}' file.txt
#NR is built in keyword stand for number of record (in this case line number)
#print that line and stops reading the rest of the file for effciency