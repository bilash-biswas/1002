input <- file('stdin', 'r')

a <- as.numeric(readLines(input, n=1))

write(sprintf("A=%.4f",3.14159 * a * a),'')
