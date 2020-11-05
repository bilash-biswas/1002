package main

import "fmt"

func main() {
	var num1 float64
	fmt.Scanln(&num1)
	fmt.Printf("A=%.4f\n", (3.14159 * num1 * num1))
}
