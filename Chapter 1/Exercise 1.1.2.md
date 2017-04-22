### Exercise 1.1.2
Analyze the time complexity of the naive complete search solution by
uncompetitive programmer A above to understand why it receives the TLE verdict!

### Answer
Running time of the naive complete search is

```mathematica
C(2N, 2) * C(2N - 2, 2) * ... * C(2, 2) = 2N! / 2^N
```

As 1 ≤ N ≤ 8, the worst case running time will be when N = 8.

``` mathematica
C(16, 2) * C(14, 2) * ... * C(2, 2) = 16! / 2^8 = 20,922,789,888,000 / 256 = 81,729,648,000
```

Which is ≈ 8 * 10<sup>10</sup>. Because a typical CPU can process 100M = 10<sup>8</sup> operations in a few seconds, this solution receives the TLE verdict.
