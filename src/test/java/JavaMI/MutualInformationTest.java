package JavaMI;


import it.ci.SimilarityMeasures.MI.MutualInformationSimilarity;
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by eracle on 20/09/16.
 */
public class MutualInformationTest {

    @Test
    public void mutualinformation_null_pointer(){
        double[] first  = new double[]{0.0, 403.0, -2.818182, 0.0, -0.846154, 0.0, -1.375, 291.0, 10.985714, -1.0, 0.0, -9.0, 1.4375, 4.190476, 0.333333, 0.0, 1.405405, 0.181818, 183.0, 496.0, -2.8, 2.5, 2.166667, 11.7, 0.285714, 0.4, 312.333333, 118.0, 152.428571, 127.842105, 584.5, 107.0, 635.0, 0.0, 110.5, 577.0, 329.0, 157.857143, 104.0, 645.0, 153.5, 439.0, -5.0, 405.0, 1.0, 9.583333, 118.25, 1.25, 119.0, -4.166667, 0.0, 9.3, -6.5, -3.45, 10.590909, 113.0, 0.272727, -1.0, 125.0, -1.0, -1.0, 0.0, 117.615385, 121.5, -0.25, 0.176471, -0.571429, -4.25, -2.444444, 3.1, 118.0, -9.318182, -3.907692, -3.086207, 8.15625, 108.333333, 2.871429, 1.222222, 2.0, 1.666667, -0.428571, -3.0, -5.333333, 0.0, 149.505618, 111.333333, -4.76, -12.4, 1.0, -0.333333, 539.0, 493.0, -4.0, 539.857143, 0.555556, 0.15, 0.0, -1.6, 622.0, -6.0, 108.0, 109.0, -2.0, 142.0, -0.529412, 232.0, 5.0, 112.428571, 10.4, 433.0, 159.5, 381.0, -1.78125, -2.583333, 396.0, 96.0, -1.214286, 0.807692, -1.666667, 99.0, -4.153846, 0.285714, -0.3125, 0.0, -2.076433, 1.583333, 1.277778, 1.775, 1.0, 0.0, 206.0, 0.538462, 103.0, -0.857143, 135.0, 0.643312, -4.0, 350.0, 204.0, 129.888889, 320.0, 502.416667, 438.5, 7.652174, 534.25, -4.0, 8.3, 406.333333, 312.5, 1.666667, 205.0, 101.5, 503.111111, 516.25, 10.923077, 7.0, 4.794118, 2.333333, 0.5625, 4.05, 506.857143, 0.0, 2.666667, 5.75, 112.0, -1.75, 3.0, -2.533333, 1.0, 0.4, -7.454545, 522.0, 177.2, 517.0, 1.272727, 440.666667, -1.023256, 0.142857, 0.5, -2.833333, 106.84, 0.875, 103.0, 11.0, 243.666667, 0.6, 1.722222, 1.454545, -0.475, 10.333333, -1.914894, -1.857143, 108.285714, 98.0, -0.111111, 2.0, 472.0, 110.75, 0.47619, -2.5, 510.0, 99.0, 455.0, 0.0, 114.0, 1.185185, -2.0, 494.5, 298.0, 168.0, 119.333333, 267.0, 0.0, -0.826087, -0.444444, 545.5, 646.0, 570.25, 1.666667, -6.666667, 68.825, -3.035714, 640.0, 0.272727, -0.666667, 485.875, 1.167665, 106.333333, -3.210526, 2.0, 75.0, -3.794118, 1.0, 112.5, 101.333333, 477.0, 6.4, 1.45, 534.153846, 0.818182, 342.0, 1.666667, -3.952381, 570.0, 136.0, 364.0, 159.666667, 1.5, 558.0, 0.666667, 0.0, 177.166667, 0.0, -9.0, 0.0, -4.157895, -8.0, 2.358696, 104.0, 545.0, 6.096154, 1.25, 573.0, 100.0, 2.115385, 110.666667, 497.5, -2.125, 2.4, 128.666667, 594.0, 0.0, 3.0, 581.0, 507.714286, 109.0, 500.5, 4.0, -3.0, 0.375, 114.0, 548.0, 1.097561, 10.8, 1.0, -18.75, 94.0, 1.0, -7.2, -0.4, 119.142857, -1.0, 2.181818, 1.0, -8.0, -4.736842, 0.0, -0.377778, 604.0, 583.0, 2.0, 14.033333, 555.4, 104.0, 3.485714, 0.0, 335.333333, -2.0, 8.5, 477.0, 103.0, 0.0, 424.5, 0.415584, 604.0, 103.5, -2.0, 108.0, -11.0, -0.75, 2.190476, 583.0, 9.316667, -2.692308, 12.461538, -0.166667, -1.782609, 0.666667, 12.3, 9.055556, -0.308824, -4.0, -3.0, 242.0, -11.0, 105.0, 1.6, 175.0, 483.0, -4.0, 392.0, -0.266667, 1.0, 371.333333, 248.333333, 1.75, 113.0, 189.125, 406.0, 8.285714, -1.5, -1.0, -7.0, 111.25, 254.5, -8.0, 3.666667, 138.0, 417.5, 653.5, -0.875, 136.973684, 97.0, -1.086957, 110.5, 152.0, 511.0, 254.0, 2.5, 2.636364, 96.0, 0.0, -1.333333, 279.0, -1.166667, 111.666667, -29.0, -2.323699, -8.0, 12.0, -1.313131, 1.142857, 115.0, 103.0, 567.0, 0.571429, 292.0, -1.4, -2.888889, -0.2, 2.666667, 150.692308, 4.0, 1.2, 509.125, -4.285714, 6.666667, 588.0, 429.5, -2.4, -1.5, 520.0, 102.666667, 97.833333, 506.0, 358.5, 0.0, 532.625, -1.928571, -2.0, -7.62963, 0.0, -0.871245, 502.0, 445.0, 103.0, -4.0, 175.0, 208.5, 3.5, 119.0, 374.666667, 647.0, -2.491803, 3.0, 427.0, 110.0, 605.0, 2.724138, 529.666667, -1.0, 496.0, 125.341463, 103.0, 0.0, -1.0, -7.4, 1.733333, 635.0, -7.75, 478.0, 0.0, 1.1, 0.416667, 475.0, 438.5, 1.0, -1.666667, -0.5, 0.0, -4.4, 0.4, 7.0, -8.666667, 0.3, 0.343137, -0.024096, 624.0, 0.0, 0.5, -2.5, 0.0, -0.6625, 2.690476, 9.666667, 0.428571, -2.083333, 0.0, -5.863636, 0.0, 4.833333, 418.5, 498.0, 417.0, 0.0, 0.0, 0.0, 0.0, 3.666667, 484.0, 166.0, 584.0, 372.0, -0.572727, 0.0, 633.75, -12.0, 378.0, 401.0, 566.1, 479.0, 0.0, 0.0, -1.0, -1.37037, 0.0, 0.0, -2.0, 3.891892, 0.0, 542.4, 0.0, 515.5, 0.0, 0.0, 345.666667, 0.0, 390.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 278.0, 526.166667, 0.0, 0.0, 0.0, 0.0, 570.857143, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 228.0, 0.0, 0.0, 0.0, 0.0, 0.0, 576.0, 0.0, 0.0, 311.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 406.0, 408.666667, 0.0, 444.0, 0.0, 500.6, 300.5, 466.888889, 0.0, 552.111111, 0.0, 546.0, 557.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 292.0, 382.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 433.0, 0.0, 0.0, 0.0, 0.0, 0.0, 489.75, 0.0, 0.0, 0.0, 239.25, 0.0, 382.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 508.4, 0.0, 0.0, 543.0, 0.0, 0.0, 0.0, 0.0, 426.0, 0.0, 0.0, 0.0, 0.0, 199.0, 574.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 269.5, 577.0, 0.0, 0.0, 485.0, 545.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 255.0, 0.0, 441.5, 0.0, 0.0, 445.0, 334.0, 490.4, 0.0, 0.0, 0.0, 0.0, 0.0, 480.9, 558.8, 627.0, 0.0, 355.0, 0.0, 0.0, 328.5, 0.0, 538.0, 503.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 394.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 376.0, 0.0, 0.0, 0.0, 0.0, 0.0, 523.0, 0.0, 0.0, 514.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 479.25, 565.5, 0.0, 510.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 494.333333, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 241.0, 527.0, 459.0, 294.0, 607.0, 0.0, 0.0, 0.0, 406.0, 0.0, 591.5, 0.0, 0.0, 0.0, 0.0, 584.0, 396.0, 0.0, 0.0, 0.0, 409.0, 0.0, 359.0, 0.0, 0.0, 0.0, 0.0, 533.333333, 593.0, 0.0, 0.0, 0.0, 0.0, 526.0, 541.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 517.0, 0.0, 0.0, 570.0, 0.0, 0.0, 0.0, 0.0, 0.0, 529.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 589.666667, 596.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 600.333333, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 332.0, 506.0, 335.0, 502.5, 629.0, 0.0, 411.5, 0.0, 0.0, 0.0, 0.0, 285.0, 487.4, 0.0, 379.5, 0.0, 0.0, 0.0, 0.0, 320.0, 511.666667, 0.0, 0.0, 0.0, 0.0, 211.5, 0.0, 0.0, 0.0, 575.0, 527.666667, 428.0, 0.0, 246.0, 0.0, 485.0, 526.0, 599.666667, 595.0, 0.0, 0.0, 251.0, 0.0, 498.0, 503.666667, 0.0, 0.0, 0.0, 0.0, 529.5, 0.0, 0.0, 515.0, 0.0, 0.0, 0.0, 0.0, 0.0, 301.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 557.666667, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 364.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 455.5, 593.294118, 0.0, 0.0, 0.0, 552.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 615.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 234.0, 0.0, 0.0, 589.428571, 381.0, 0.0, 282.8, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 259.0, 0.0, 0.0, 0.0, 0.0, 369.0, 234.0, 424.5, 584.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 623.5, 0.0, 0.0, 0.0, 0.0, 296.0, 400.5, 0.0, 0.0, 372.333333, 339.0, 523.166667, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 236.0, 0.0, 0.0, 290.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 228.0, 0.0, 0.0, 0.0, 0.0, 593.0, 573.333333, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 558.173913, 0.0, 0.0, 0.0, 0.0, 568.0, 438.0, 0.0, 438.0, 0.0, 0.0, 0.0, 304.0, 493.333333, 600.0, 0.0, 444.0, 0.0, 0.0, 0.0, 0.0, 487.0, 305.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 510.888889, 528.0, 391.5, 0.0, 427.0, 0.0, 0.0, 637.0, 0.0, 634.0, 0.0, 533.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 566.0, 386.0, 599.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 176.0, 610.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 229.0, 325.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 571.0, 0.0, 0.0, 283.5, 0.0, 0.0, 0.0, 0.0, 0.0, 395.0, 0.0, 0.0, 302.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 421.5, 0.0, 0.0, 0.0, 0.0, 0.0, 500.333333, 0.0, 157.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 486.0, 0.0, 545.0, 0.0, 607.0, 0.0, 522.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 341.0, 0.0, 452.0, 251.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 564.333333, 471.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 379.0, 0.0, 508.0, 0.0, 0.0, 0.0, 375.0, 0.0, 618.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 264.0, 0.0, 0.0, 0.0, 0.0, 0.0, 474.0, 0.0, 249.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 454.0, 533.5, 0.0, 0.0, 318.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 315.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 639.333333, 543.857143, 0.0, 0.0, 0.0, 520.666667, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 405.333333, 0.0, 354.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 556.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 488.0, 0.0, 0.0, 0.0, 0.0, 352.5, 547.571429, 390.0, 0.0, 0.0, 0.0, 0.0, 0.0, 293.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 407.0, 0.0, 0.0, 0.0, 561.0, 0.0, 0.0, 0.0, 0.0, 454.0, 0.0, 317.666667, 330.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 492.0, 0.0, 0.0, 0.0, 546.0, 0.0, 362.5, 0.0, 0.0, 0.0, 0.0, 271.0, 0.0, 0.0, 0.0, 0.0, 389.0, 0.0, 0.0, 0.0, 0.0, 0.0, 410.0, 509.666667, 0.0, 0.0, 0.0, 0.0, 548.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 475.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 542.173913, 193.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 546.666667, 0.0, 0.0, 0.0, 482.0, 0.0, 414.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 308.0, 0.0, 277.5, 380.0, 0.0, 0.0, 0.0, 0.0, 0.0, 615.0, 0.0, 250.0, 0.0, 0.0, 428.75, 505.0, 344.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 340.5, 0.0, 0.0, 0.0, 424.0, 320.0, 560.0, 0.0, 281.666667, 0.0, 0.0, 386.0, 585.0, 0.0, 615.0, 495.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 552.0, 0.0, 0.0, 0.0, 0.0, 606.5, 0.0, 0.0, 0.0, 0.0, 0.0, 408.0, 574.5, 224.0, 0.0, 0.0, 581.666667, 0.0, 0.0, 443.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 324.0, 419.75, 619.0, 0.0, 0.0, 0.0, 0.0, 0.0, 299.0, 405.0, 0.0, 585.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 579.0, 0.0, 0.0, 0.0, 230.0, 0.0, 502.75, 0.0, 0.0, 0.0, 0.0, 0.0, 544.6, 0.0, 0.0, 321.0, 0.0, 463.666667, 355.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 447.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 517.0, 0.0, 0.0, 0.0, 296.5, 0.0, 531.833333, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 257.0, 0.0, 0.0, 607.0, 0.0, 0.0, 542.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 616.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 602.5, 0.0, 251.0, 482.0, 0.0, 0.0, 0.0, 0.0, 481.0, 0.0, 0.0, 0.0, 572.0, 0.0, 412.0, 0.0, 0.0, 0.0, 0.0, 0.0, 587.0, 0.0, 322.0, 317.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 636.0, 0.0, 0.0, 0.0, 0.0, 0.0, 323.0, 423.333333, 0.0, 0.0, 517.0, 607.0, 0.0, 0.0, 285.0, 0.0, 196.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 348.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 438.0, 0.0, 0.0, 0.0, 0.0, 571.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 342.0, 614.25, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 467.0, 431.0, 0.0, 658.0, 0.0, 487.0, 524.0, 0.0, 258.0, 599.5, 601.0, 0.0, 401.0, 0.0, 0.0, 541.5, 0.0, 0.0, 0.0, 434.0, 522.0, 540.0, 371.0, 0.0, 223.0, 0.0, 0.0, 0.0, 0.0, 597.0, 0.0, 0.0, 0.0, 0.0, 358.0, 0.0, 0.0, 394.5, 0.0, 0.0, 197.0, 0.0, 0.0, 431.0, 0.0, 339.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 310.0, 0.0, 0.0, 0.0, 0.0, 508.0, 0.0, 261.666667, 0.0, 0.0, 347.0, 0.0, 609.5, 0.0, 495.0, 0.0, 0.0, 0.0, 0.0, 0.0, 600.0, 0.0, 0.0, 377.0, 0.0, 489.0, 223.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 513.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 522.0, 605.727273, 350.0, 0.0, 0.0, 383.0, 452.5, 382.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 592.0, 0.0, 0.0, 0.0, 0.0, 551.75, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 598.0, 0.0, 0.0, 353.0, 0.0, 0.0, 483.0, 624.0, 376.0, 0.0, 0.0, 0.0, 0.0, 0.0, 613.0, 0.0, 0.0, 274.0, 0.0, 0.0, 552.0, 0.0, 0.0, 0.0, 0.0, 365.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 306.5, 401.333333, 0.0, 0.0, 0.0, 0.0, 0.0, 259.0, 485.0, 0.0, 0.0, 304.0, 0.0, 0.0, 0.0, 515.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 507.0, 0.0, 0.0, 0.0, 0.0, 468.0, 0.0, 421.5, 0.0, 0.0, 0.0, 444.0, 76.0, 181.0, 0.0, 0.0, 0.0, 0.0, 0.0, 401.0, 465.5, 485.5, 369.0, 0.0, 441.8, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 469.0, 0.0, 0.0, 0.0, 580.0, 0.0, 0.0, 429.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 189.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 339.0, 0.0, 629.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 658.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 416.5, 0.0, 0.0, 0.0, 525.0, 0.0, 0.0, 0.0, 399.0, 0.0, 571.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 404.0, 233.0, 529.5, 553.666667, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 263.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 489.75, 0.0, 0.0, 403.0, 0.0, 570.5, 0.0, 0.0, 0.0, 0.0, 0.0, 370.0, 0.0, 0.0, 0.0, 522.0, 485.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 552.0, 0.0, 0.0, 328.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 410.666667, 0.0, 493.2, 482.0, 0.0, 518.0, 231.0, 0.0, 247.0, 0.0, 0.0, 0.0, 569.8, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 602.6, 0.0, 0.0, 0.0, 0.0, 621.0, 0.0, 0.0, 0.0, 0.0, 0.0, 441.333333, 0.0, 602.0, 0.0, 0.0, 0.0, 365.0, 328.666667, 0.0, 523.45, 318.0, 0.0, 0.0, 0.0, 0.0, 157.0, 471.0, 622.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 259.0, 515.0, 0.0, 0.0, 0.0, 0.0, 0.0, 623.0, 342.666667, 0.0, 0.0, 0.0, 630.0, 0.0, 462.2, 0.0, 532.5, 0.0, 299.0, 345.0, 0.0, 0.0, 0.0, 400.0, 0.0, 374.0, 0.0, 0.0, 0.0, 0.0, 0.0, 580.666667, 0.0, 0.0, 515.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 236.0, 0.0, 0.0, 0.0, 0.0, 0.0, 319.5, 576.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 305.333333, 0.0, 591.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 494.666667, 518.0, 0.0, 0.0, 308.0, 0.0, 568.666667, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 550.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 407.5, 284.0, 0.0, 397.0, 461.071429, 0.0, 412.0, 0.0, 0.0, 0.0, 0.0, 355.0, 0.0, 0.0, 354.0, 0.0, 0.0, 0.0, 0.0, 528.421053, 425.0, 509.5, 0.0, 474.875, 0.0, 0.0, 535.25, 0.0, 0.0, 395.0, 0.0, 0.0, 0.0, 329.0, 0.0, 0.0, 0.0, 0.0, 0.0, 379.0, 563.0, 247.5, 0.0, 425.0, 0.0, 0.0, 0.0, 0.0, 520.4, 496.0, 273.5, 422.5, 585.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 431.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 302.0, 0.0, 0.0, 468.0, 281.0, 0.0, 0.0, 0.0, 596.25, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 372.0, 0.0, 0.0, 0.0, 0.0, 0.0, 480.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 584.0, 0.0, 0.0, 497.444444, 0.0, 0.0, 0.0, 240.5, 376.0, 0.0, 0.0, 0.0, 0.0, 390.0, 0.0, 0.0, 0.0, 503.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 501.5, 0.0, 0.0, 413.5, 0.0, 0.0, 0.0, 586.5, 545.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 594.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 568.0, 595.0, 291.0, 0.0, 470.0, 0.0, 0.0, 0.0, 0.0, 0.0, 425.0, 0.0, 0.0, 0.0, 295.0, 0.0, 0.0, 0.0, 0.0, 518.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 482.0, 0.0, 0.0, 555.0, 0.0, 0.0, 564.8, 600.0, 0.0, 534.6, 388.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 576.666667, 0.0, 616.0, 0.0, 0.0, 0.0, 0.0, 552.0, 430.5, 398.333333, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 584.0, 0.0, 323.0, 0.0, 0.0, 0.0, 435.0, 0.0, 0.0, 0.0, 0.0, 0.0, 186.0, 0.0, 404.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 473.5, 0.0, 190.0, 0.0, 0.0, 585.0, 0.0, 0.0, 259.0, 0.0, 0.0, 0.0, 0.0, 0.0, 457.333333, 522.875, 0.0, 0.0, 0.0, 0.0, 563.0, 0.0, 0.0, 0.0, 0.0, 0.0, 599.0, 0.0, 0.0, 0.0, 396.0, 298.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 387.0, 0.0, 0.0, 430.0, 295.0, 523.0, 0.0, 0.0, 0.0, 558.6, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 519.666667, 545.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 572.0, 0.0, 524.6, 335.0, 532.0, 0.0, 441.333333, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 422.5, 0.0, 463.0, 0.0, 0.0, 0.0, 0.0, 366.0, 0.0, 0.0, 236.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 397.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 505.5, 0.0, 613.0, 0.0, 589.6, 0.0, 474.0, 0.0, 530.142857, 0.0, 0.0, 0.0, 494.0, 0.0, 0.0, 0.0, 0.0, 0.0, 481.0, 0.0, 542.0, 0.0, 0.0, 0.0, 0.0, 0.0, 618.0, 0.0, 0.0, 0.0, 0.0, 0.0, 319.0, 0.0, 557.2, 544.0, 333.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 351.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 453.0, 0.0, 514.0, 0.0, 355.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 391.0, 0.0, 0.0, 392.0, 0.0, 0.0, 0.0, 529.6, 0.0, 562.615385, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 268.0, 508.0, 0.0, 0.0, 376.0, 0.0, 624.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 508.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 584.0, 496.0, 0.0, 251.0, 0.0, 0.0, 292.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 551.0, 0.0, 494.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 579.0, 0.0, 0.0, 0.0, 0.0, 0.0, 623.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 568.0, 0.0, 0.0, 0.0, 0.0, 0.0, 315.0, 352.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 594.0, 0.0, 407.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 472.0, 559.0, 0.0, 431.0, 0.0, 0.0, 0.0, 0.0, 0.0, 285.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 510.8, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 544.0, 0.0, 0.0, 0.0, 0.0, 443.666667, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 178.0, 0.0, 555.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 252.0, 0.0, 0.0, 0.0, 531.0, 0.0, 383.666667, 452.0, 0.0, 0.0, 0.0, 0.0, 0.0, 493.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 590.5, 598.5, 0.0, 0.0, 297.0, 307.0, 575.0, 0.0, 0.0, 0.0, 0.0, 0.0, 477.8, 416.0, 418.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 561.0, 461.0, 0.0, 0.0, 0.0, 0.0, 386.6, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};

        double[] second = new double[]{0.0, 0.0, 0.0, 6.0, 0.0, 0.0, 0.0, 19.0, 0.0, 0.0, 2.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 36.0, 0.0, 0.0, 17.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 7.0, 0.0, 6.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 105.0, 0.0, 0.0, 0.0, 0.0, 1000.0, 0.0, 0.0, 0.0, 5625.0, 0.0, 90.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1040.0, 0.0, 0.0, 0.0, 0.0, 27750.0, 0.0, 0.0, 0.0, 65000.0, 50.0, 0.0, 0.0, 0.0, 0.0, 0.0, 14.0, 1.0, 0.0, 0.0, 0.0, 0.0, 6.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 700.0, 0.0, 0.0, 0.0, 24889.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 5600.0, 56.5, 0.0, 0.0, 7.0, 0.0, 0.0, 60.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 69.0, 0.0, 500.0, 0.0, 0.0, 0.0, 0.0, 180.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 995000.0, 0.0, 0.0, 0.0, 0.0, 2.0, 5275.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 8.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 82.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 6.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 82.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 53.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 8.0, 0.0, 76.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 83.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 8.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 7.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 24.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 6.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 60.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 14556.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 160.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1950.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 180.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 419808.3333, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 26000.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4375.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 23.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 13262.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 810.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 5120000.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 600.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 7.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 65.0, 0.0, 0.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 77.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 71.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 85.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 96.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 94.0, 0.0, 0.0, 0.0, 0.0, 100.0, 0.0, 0.0, 0.0, 0.0, 93.0, 0.0, 0.0, 0.0, 80.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 160500.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 581.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 11900.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2340000.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 195000.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 326000.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 540.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 245.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2125.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2010.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 12263.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 8.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 33778.0, 0.0, 0.0, 0.0, 0.0, 63.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 9000.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 72667.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2960000.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};

        double mi = MutualInformation.calculateMutualInformation(first, second);

        System.out.println(mi);
    }

    @Test
    public void mutualinformation_discrete(){
        double[] first  = new double[]{0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
        double[] second = new double[]{0.0, -1.0, -2.0, -3.0, -4.0, -5.0, -6.0, -7.0, -8.0, -9.0};

        double[] near_zero = new double[]{0.0, 10.0, 0.0, 0.0, 0.0, -10.0, 0.0, 0.0, 0.0, 0.0};

        double mi_fi_se = MutualInformation.calculateMutualInformation(first, second);

        double mi_fi_zero = MutualInformation.calculateMutualInformation(first, near_zero);
        double mi_se_zero = MutualInformation.calculateMutualInformation(second, near_zero);

        Assert.assertTrue(mi_fi_se > mi_fi_zero);
        Assert.assertTrue(mi_fi_se > mi_se_zero);

    }

    @Test
    public void mutualinformation_continuous(){
        double[] first  = new double[]{0.39587902118342627, 1.0931203467039958, 2.471846741964484, 3.4207558271699208, 4.05433405278067, 5.148685500259004, 6.196389055484369, 7.055006166273973, 8.374312873858242, 9.325935110316397};
        double[] second = new double[]{-0.37298616995660683, -1.4504923471297706, -2.222847252262149, -3.4696660210759247, -4.143500684111057, -5.3384971136833155, -6.271268984649983, -7.447520325283894, -8.24599405006989, -9.32596902474521};

        double[] near_zero = new double[]{0.4085640630929488, 0.4239498314548185, 10.33872395037981395, 0.3939269354084809, 0.13551788164002465, -10.09160696703771332, 0.3094754562150297, 0.004319549683838908, 0.10087168693968324, 0.045606770495468796};

        MutualInformationSimilarity sim = new MutualInformationSimilarity();

        double mi_fi_se = sim.measure(first, second);

        double mi_fi_zero = sim.measure(first, near_zero);
        double mi_se_zero = sim.measure(second, near_zero);

        System.out.println(mi_fi_se);
        System.out.println(mi_fi_zero);
        System.out.println(mi_se_zero);

        Assert.assertTrue(mi_fi_se > mi_fi_zero);
        Assert.assertTrue(mi_fi_se > mi_se_zero);

    }

    //tests on weka discretizer

    /*
    @Test
    public void mutualInformation_null_pointer_instances() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();

        File file = new File(classLoader.getResource("null_pointer_bug.arff").getFile());


        Instances data = MutualInformationMain.readArff(new File(file.getAbsolutePath()));


        Discretize filter = new Discretize();
        filter.setInputFormat(data);

        Instances discretized = Filter.useFilter(data, filter);

        System.out.println(discretized.toSummaryString());

        System.out.println(discretized.toString());

        double[] first  = discretized.attributeToDoubleArray(0);
        double[] second = discretized.attributeToDoubleArray(1);

        double mi = MutualInformation.calculateMutualInformation(first, second);

        System.out.println(mi);
    }
     */

}