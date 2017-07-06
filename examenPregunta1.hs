entero = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
romano = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]

conv :: Integer->String
conv numero | numero > 0&& numero < 4000 = r 0 numero
            | otherwise = "fuera de rango"

r _ 0 = ""
r p n | n >= entero !! p = romano !! p ++ r p (n-entero!!p)
          | otherwise = r (p + 1) n


decimal::Integer->String
decimal 1= "1"
decimal 2= "2"
decimal 3= "3"
decimal 4= "4"
decimal 5= "5"
decimal 6= "6"
decimal 7= "7"
decimal n = (decimal $ div n 8)++(show $ mod n 8)



convertirDeciRoma ::Integer->String
convertirDeciRoma n= (decimal n) ++" "++ (conv n)
