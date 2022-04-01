fn main(){
   let mut line1 = String::new();
   std::io::stdin().read_line(&mut line1).unwrap();
   let num1: f64 = line1.trim().parse().ok().expect("Try");
   println!("A={0:.4}", 3.14159 * num1 * num1 )
}
