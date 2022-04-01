import Text.Printf(printf)

main :: IO ()
main = do
    let number = 3.14159
    a <- readLn
    printf "A=%.4f\n" (number * a * a :: Double)
