Running time of the naive complete search is

```mathematica
C(2N, 2) * C(2N - 2, 2) * ... * C(2, 2)
```

As 1 ≤ N ≤ 8, the worst case running time will be when N = 8.

``` mathematica
C(16, 2) * C(14, 2) * ... * C(2, 2) = 81,729,648,000
```

Which is ≈ 8 * 10<sup>10</sup>. And because in 1 second machines can do ≈ 10<sup>8</sup> computations, this solution receives the TLE verdict.
