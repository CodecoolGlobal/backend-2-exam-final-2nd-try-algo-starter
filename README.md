# Maximummal szorzás
## Bevezetés
Ebben a feladatban egy metódust kell létrehoznod, ami egy tömböt dolgoz fel.

A `main` metódusban próbálhatod ki a kódodat, illetve használd
az előre megírt teszteseteket az algoritmusod kipróbálására!
A kiadott teszt eseteken ne módosíts!

## Feladatleírás

Írj egy metódust a `hu.nive.ujratervezes.addmax.MultMax` osztályban a következő specifikácó alapján:

- a metódus neve: `multMax`
- a metódus bemeneti paraméterei:
    - `numbers`, egy egész számokat tartalmazó tömb `int[]`
    - `n`, egy egész szám `int`
- visszatérési értéke:
  - egy új, egész számokat tartalmazó tömb `int[]`

Az `multMax` metódus:
Megkeresi a maximum értéket a `numbers` tömben. Visszaad egy tömböt, amire a következő igaz:
- minden `n`-edik elem a `numbers` tömb azonos indexén található elem és a maximum **szorzata**.
- a többi elem a `numbers` tömb azonos indexén található elemel egyezik.

A beépített `sort()`,`min()`, `max()`, `average()`, stb... metódusok használata a feladat megoldása során nem megengedet.

Kivételkezelés:

- ha a metódust úgy hívjuk meg, hogy a `numbers` paraméter egy üres tömb, akkor
  adjon vissza egy új, üres tömböt
- ha a metódust úgy hívjuk meg, hogy a `numbers` paraméter értéke `null`, akkor
  dobjon `IllegalArgumentException`-t
- ha a metódust úgy hívjuk meg, hogy az `n` paraméter értéke kisebb, mint `1`,
  akkor dobjon `IllegalArgumentException`-t
  
## Példák

| `numbers`           | `n`  | Eredmény                   |
|:--------------------|------|----------------------------|
| `[-2, -1, 0, 1, 2]` | `2`  | `[-2, -2, 0, 2, 2]`        |
| `[3, 1, 5, 3, 4]`   | `1`  | `[15, 5, 25, 15, 20]`      |
| `[2, 12]`           | `2`  | `[2, 144]`                 |
| `[]`                | `1`  | `[]`                       |
| `null`              | `1`  | `IllegalArgumentException` |
| `[2, 12]`           | `0`  | `IllegalArgumentException` |
| `[2, 12]`           | `-1` | `IllegalArgumentException` |


