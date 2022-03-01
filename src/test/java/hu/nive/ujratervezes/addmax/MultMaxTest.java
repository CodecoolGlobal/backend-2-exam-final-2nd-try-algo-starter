package hu.nive.ujratervezes.addmax;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
| `numbers`             | `n`  | Eredmény                            |
| :-------------------- | :--: | :---------------------------------- |
| `[-2, -1, 0, 1, 2]`   | `2`  | `[-2, -2, 0, 2, 2]`                  |
| `[3, 1, 5, 3, 4]`     | `1`  | `[15, 5, 25, 15, 20]`                   |
| `[2, 12]`             | `2`  | `[24, 144]`                           |
| `[]`                  | `1`  | `[]`                                |
| `null`                | `1`  | `IllegalArgumentException`          |
| `[2, 12]`             | `0`  | `IllegalArgumentException`          |
| `[2, 12]`             | `-1` | `IllegalArgumentException`          |
*/

class MultMaxTest {

    private MultMax multMax = new MultMax();

    @Test
    void testAddMaximum_validInput() {
        Assertions.assertArrayEquals(new int[]{-2, -2, 0, 2, 2}, multMax.multMax(new int[]{-2, -1, 0, 1, 2}, 2));
    }

    @Test
    void testAddMaximum_validInput1() {
        Assertions.assertArrayEquals(new int[]{15, 5, 25, 15, 20}, multMax.multMax(new int[]{3, 1, 5, 3, 4}, 1));
    }

    @Test
    void testAddMaximum_validInput2() {
        Assertions.assertArrayEquals(new int[]{2, 144}, multMax.multMax(new int[]{2, 12}, 2));
    }

    @Test
    void testAddMaximum_emptyArray() {
        Assertions.assertArrayEquals(new int[]{}, multMax.multMax(new int[]{}, 1));
    }

    @Test
    void testAddMaximum_throwsIllegalArgumentExceptionForNullParameter() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> multMax.multMax(null, 1));
    }

    @Test
    void testAddMaximum_throwsIllegalArgumentExceptionForZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> multMax.multMax(new int[]{2, 12}, 0));
    }

    @Test
    void testAddMaximum_throwsIllegalArgumentExceptionForNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> multMax.multMax(new int[]{2, 12}, -1));
    }

}