package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterToLeftSwitch extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (8.38,6.00,0.00)
	
	public CenterToLeftSwitch() {
		this(false);
	}
			
    public CenterToLeftSwitch(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.567,11.339,10.000},
				{2.835,22.678,10.000},
				{7.937,51.024,10.000},
				{17.007,90.702,10.000},
				{31.178,141.703,10.000},
				{51.579,204.012,10.000},
				{79.340,277.607,10.000},
				{115.585,362.458,10.000},
				{161.438,458.522,10.000},
				{218.012,565.749,10.000},
				{286.420,684.072,10.000},
				{367.761,813.412,10.000},
				{463.128,953.675,10.000},
				{573.603,1104.749,10.000},
				{699.691,1260.880,10.000},
				{841.325,1416.342,10.000},
				{998.431,1571.053,10.000},
				{1170.924,1724.935,10.000},
				{1358.715,1877.911,10.000},
				{1561.705,2029.903,10.000},
				{1779.789,2180.836,10.000},
				{2012.852,2330.636,10.000},
				{2260.775,2479.229,10.000},
				{2523.430,2626.545,10.000},
				{2800.681,2772.512,10.000},
				{3092.387,2917.061,10.000},
				{3398.399,3060.121,10.000},
				{3718.562,3201.626,10.000},
				{4052.713,3341.505,10.000},
				{4400.682,3479.692,10.000},
				{4762.294,3616.119,10.000},
				{5137.365,3750.717,10.000},
				{5525.707,3883.417,10.000},
				{5927.122,4014.151,10.000},
				{6341.407,4142.847,10.000},
				{6768.350,4269.432,10.000},
				{7207.733,4393.834,10.000},
				{7659.331,4515.975,10.000},
				{8122.908,4635.777,10.000},
				{8598.224,4753.157,10.000},
				{9085.027,4868.030,10.000},
				{9583.058,4980.308,10.000},
				{10092.048,5089.897,10.000},
				{10611.717,5196.699,10.000},
				{11141.779,5300.612,10.000},
				{11681.932,5401.529,10.000},
				{12231.865,5499.336,10.000},
				{12791.256,5593.913,10.000},
				{13359.770,5685.136,10.000},
				{13937.057,5772.874,10.000},
				{14522.756,5856.988,10.000},
				{15116.490,5937.335,10.000},
				{15717.866,6013.766,10.000},
				{16326.479,6086.124,10.000},
				{16941.904,6154.248,10.000},
				{17563.701,6217.975,10.000},
				{18191.414,6277.134,10.000},
				{18824.570,6331.555,10.000},
				{19462.677,6381.068,10.000},
				{20105.227,6425.503,10.000},
				{20751.697,6464.698,10.000},
				{21401.547,6498.497,10.000},
				{22054.222,6526.757,10.000},
				{22709.158,6549.356,10.000},
				{23365.777,6566.192,10.000},
				{24023.497,6577.198,10.000},
				{24681.732,6582.346,10.000},
				{25339.897,6581.657,10.000},
				{25997.419,6575.215,10.000},
				{26653.736,6563.175,10.000},
				{27308.315,6545.783,10.000},
				{27960.653,6523.385,10.000},
				{28610.298,6496.447,10.000},
				{29256.855,6465.569,10.000},
				{29900.005,6431.503,10.000},
				{30539.194,6391.891,10.000},
				{31173.682,6344.881,10.000},
				{31802.907,6292.252,10.000},
				{32426.498,6235.909,10.000},
				{33044.283,6177.851,10.000},
				{33656.297,6120.133,10.000},
				{34262.778,6064.810,10.000},
				{34864.166,6013.880,10.000},
				{35461.088,5969.220,10.000},
				{36054.340,5932.522,10.000},
				{36644.862,5905.222,10.000},
				{37233.707,5888.446,10.000},
				{37822.003,5882.961,10.000},
				{38410.917,5889.139,10.000},
				{39001.893,5909.763,10.000},
				{39596.625,5947.318,10.000},
				{40196.749,6001.246,10.000},
				{40803.827,6070.776,10.000},
				{41419.322,6154.951,10.000},
				{42044.588,6252.654,10.000},
				{42680.853,6362.653,10.000},
				{43329.216,6483.632,10.000},
				{43990.639,6614.228,10.000},
				{44665.946,6753.069,10.000},
				{45355.826,6898.799,10.000},
				{46060.837,7050.112,10.000},
				{46781.413,7205.766,10.000},
				{47517.874,7364.603,10.000},
				{48270.430,7525.564,10.000},
				{49039.199,7687.688,10.000},
				{49824.211,7850.124,10.000},
				{50625.424,8012.124,10.000},
				{51442.728,8173.045,10.000},
				{52275.962,8332.342,10.000},
				{53124.919,8489.563,10.000},
				{53989.353,8644.342,10.000},
				{54868.992,8796.390,10.000},
				{55763.541,8945.486,10.000},
				{56672.688,9091.475,10.000},
				{57596.113,9234.253,10.000},
				{58533.490,9373.765,10.000},
				{59484.490,9509.998,10.000},
				{60448.787,9642.972,10.000},
				{61426.061,9772.739,10.000},
				{62415.998,9899.374,10.000},
				{63418.295,10022.973,10.000},
				{64432.660,10143.650,10.000},
				{65458.814,10261.531,10.000},
				{66496.489,10376.755,10.000},
				{67545.436,10489.467,10.000},
				{68605.418,10599.823,10.000},
				{69676.216,10707.979,10.000},
				{70757.626,10814.098,10.000},
				{71849.460,10918.347,10.000},
				{72951.549,11020.890,10.000},
				{74063.739,11121.897,10.000},
				{75185.893,11221.536,10.000},
				{76317.890,11319.976,10.000},
				{77459.629,11417.387,10.000},
				{78611.023,11513.936,10.000},
				{79772.002,11609.793,10.000},
				{80942.514,11705.125,10.000},
				{82122.525,11800.102,10.000},
				{83312.014,11894.891,10.000},
				{84510.980,11989.659,10.000},
				{85719.437,12084.575,10.000},
				{86937.418,12179.806,10.000},
				{88164.970,12275.521,10.000},
				{89402.159,12371.887,10.000},
				{90649.066,12469.074,10.000},
				{91905.791,12567.249,10.000},
				{93172.449,12666.582,10.000},
				{94449.173,12767.243,10.000},
				{95736.113,12869.398,10.000},
				{97033.435,12973.218,10.000},
				{98341.322,13078.869,10.000},
				{99659.974,13186.517,10.000},
				{100989.606,13296.325,10.000},
				{102330.451,13408.451,10.000},
				{103682.756,13523.052,10.000},
				{105046.784,13640.276,10.000},
				{106422.810,13760.262,10.000},
				{107811.124,13883.140,10.000},
				{109212.027,14009.028,10.000},
				{110625.830,14138.026,10.000},
				{112052.851,14270.214,10.000},
				{113493.416,14405.651,10.000},
				{114947.852,14544.363,10.000},
				{116416.487,14686.348,10.000},
				{117899.643,14831.559,10.000},
				{119397.634,14979.907,10.000},
				{120910.759,15131.248,10.000},
				{122439.296,15285.378,10.000},
				{123983.499,15442.026,10.000},
				{125543.583,15600.844,10.000},
				{127119.724,15761.402,10.000},
				{128712.041,15923.178,10.000},
				{130320.597,16085.552,10.000},
				{131945.377,16247.803,10.000},
				{133586.287,16409.105,10.000},
				{135243.140,16568.523,10.000},
				{136915.642,16725.021,10.000},
				{138603.388,16877.464,10.000},
				{140305.851,17024.631,10.000},
				{142022.374,17165.227,10.000},
				{143752.165,17297.907,10.000},
				{145494.295,17421.302,10.000},
				{147247.699,17534.042,10.000},
				{149011.179,17634.799,10.000},
				{150783.411,17722.316,10.000},
				{152562.955,17795.447,10.000},
				{154348.275,17853.192,10.000},
				{156137.748,17894.733,10.000},
				{157929.694,17919.461,10.000},
				{159721.745,17920.511,10.000},
				{161510.670,17889.250,10.000},
				{163293.060,17823.902,10.000},
				{165065.575,17725.142,10.000},
				{166824.976,17594.012,10.000},
				{168568.164,17431.878,10.000},
				{170292.201,17240.375,10.000},
				{171994.335,17021.340,10.000},
				{173672.010,16776.748,10.000},
				{175322.874,16508.644,10.000},
				{176944.783,16219.086,10.000},
				{178535.792,15910.091,10.000},
				{180094.151,15583.588,10.000},
				{181618.290,15241.389,10.000},
				{183107.404,14891.141,10.000},
				{184561.599,14541.948,10.000},
				{185981.251,14196.525,10.000},
				{187366.802,13855.508,10.000},
				{188718.741,13519.393,10.000},
				{190037.597,13188.556,10.000},
				{191323.923,12863.263,10.000},
				{192578.292,12543.692,10.000},
				{193801.286,12229.941,10.000},
				{194993.491,11922.048,10.000},
				{196155.490,11619.994,10.000},
				{197287.862,11323.720,10.000},
				{198391.176,11033.134,10.000},
				{199465.987,10748.117,10.000},
				{200512.841,10468.530,10.000},
				{201532.263,10194.222,10.000},
				{202524.766,9925.030,10.000},
				{203490.844,9660.787,10.000},
				{204430.977,9401.323,10.000},
				{205345.623,9146.466,10.000},
				{206235.228,8896.048,10.000},
				{207100.219,8649.902,10.000},
				{207941.005,8407.867,10.000},
				{208757.984,8169.785,10.000},
				{209551.534,7935.505,10.000},
				{210322.023,7704.883,10.000},
				{211069.800,7477.778,10.000},
				{211795.206,7254.059,10.000},
				{212498.566,7033.598,10.000},
				{213180.194,6816.275,10.000},
				{213840.391,6601.976,10.000},
				{214479.450,6390.591,10.000},
				{215097.652,6182.017,10.000},
				{215695.268,5976.155,10.000},
				{216272.559,5772.910,10.000},
				{216829.778,5572.193,10.000},
				{217367.170,5373.917,10.000},
				{217884.970,5178.001,10.000},
				{218383.406,4984.363,10.000},
				{218862.699,4792.928,10.000},
				{219323.061,4603.621,10.000},
				{219764.698,4416.368,10.000},
				{220187.808,4231.100,10.000},
				{220592.582,4047.745,10.000},
				{220979.206,3866.236,10.000},
				{221347.856,3686.503,10.000},
				{221698.704,3508.479,10.000},
				{222031.914,3332.096,10.000},
				{222347.642,3157.286,10.000},
				{222646.040,2983.980,10.000},
				{222927.251,2812.110,10.000},
				{223191.412,2641.605,10.000},
				{223438.651,2472.395,10.000},
				{223669.092,2304.409,10.000},
				{223882.849,2137.573,10.000},
				{224080.031,1971.814,10.000},
				{224260.736,1807.057,10.000},
				{224425.059,1643.225,10.000},
				{224573.083,1480.241,10.000},
				{224704.886,1318.027,10.000},
				{224820.536,1156.501,10.000},
				{224920.527,999.910,10.000},
				{225005.911,853.844,10.000},
				{225077.867,719.561,10.000},
				{225137.563,596.960,10.000},
				{225186.159,485.960,10.000},
				{225224.809,386.492,10.000},
				{225254.658,298.500,10.000},
				{225276.852,221.940,10.000},
				{225292.531,156.780,10.000},
				{225302.830,102.996,10.000},
				{225308.887,60.570,10.000},
				{225311.836,29.493,10.000},
				{225312.812,9.758,10.000},
				{225312.948,1.363,10.000},
				{225312.948,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.567,11.339,10.000},
				{2.835,22.679,10.000},
				{7.938,51.030,10.000},
				{17.011,90.727,10.000},
				{31.189,141.780,10.000},
				{51.609,204.203,10.000},
				{79.411,278.019,10.000},
				{115.737,363.258,10.000},
				{161.733,459.962,10.000},
				{218.551,568.182,10.000},
				{287.350,687.985,10.000},
				{369.294,819.449,10.000},
				{465.561,962.669,10.000},
				{577.337,1117.756,10.000},
				{705.250,1279.126,10.000},
				{849.366,1441.165,10.000},
				{1009.762,1603.954,10.000},
				{1186.519,1767.573,10.000},
				{1379.729,1932.098,10.000},
				{1589.489,2097.607,10.000},
				{1815.907,2264.174,10.000},
				{2059.094,2431.875,10.000},
				{2319.172,2600.782,10.000},
				{2596.269,2770.967,10.000},
				{2890.519,2942.500,10.000},
				{3202.064,3115.453,10.000},
				{3531.054,3289.893,10.000},
				{3877.643,3465.889,10.000},
				{4241.994,3643.511,10.000},
				{4624.276,3822.824,10.000},
				{5024.666,4003.898,10.000},
				{5443.346,4186.801,10.000},
				{5880.506,4371.601,10.000},
				{6336.343,4558.368,10.000},
				{6811.060,4747.173,10.000},
				{7304.869,4938.088,10.000},
				{7817.988,5131.187,10.000},
				{8350.642,5326.546,10.000},
				{8903.067,5524.245,10.000},
				{9475.503,5724.365,10.000},
				{10068.203,5926.992,10.000},
				{10681.424,6132.215,10.000},
				{11315.437,6340.126,10.000},
				{11970.519,6550.824,10.000},
				{12646.960,6764.411,10.000},
				{13345.060,6980.994,10.000},
				{14065.128,7200.687,10.000},
				{14807.489,7423.609,10.000},
				{15572.478,7649.886,10.000},
				{16360.443,7879.647,10.000},
				{17171.746,8113.032,10.000},
				{18006.764,8350.183,10.000},
				{18865.889,8591.251,10.000},
				{19749.528,8836.391,10.000},
				{20658.105,9085.764,10.000},
				{21592.058,9339.536,10.000},
				{22551.846,9597.873,10.000},
				{23537.941,9860.948,10.000},
				{24550.834,10128.932,10.000},
				{25591.033,10401.991,10.000},
				{26659.062,10680.291,10.000},
				{27755.460,10963.986,10.000},
				{28880.782,11253.218,10.000},
				{30035.593,11548.111,10.000},
				{31220.470,11848.765,10.000},
				{32435.995,12155.248,10.000},
				{33682.754,12467.589,10.000},
				{34961.330,12785.764,10.000},
				{36272.299,13109.692,10.000},
				{37616.221,13439.215,10.000},
				{38993.630,13774.089,10.000},
				{40405.026,14113.967,10.000},
				{41850.865,14458.383,10.000},
				{43331.538,14806.737,10.000},
				{44847.366,15158.276,10.000},
				{46397.768,15504.021,10.000},
				{47981.216,15834.485,10.000},
				{49596.005,16147.888,10.000},
				{51240.238,16442.327,10.000},
				{52911.818,16715.802,10.000},
				{54608.444,16966.260,10.000},
				{56327.609,17191.646,10.000},
				{58066.605,17389.963,10.000},
				{59822.538,17559.333,10.000},
				{61592.345,17698.067,10.000},
				{63372.818,17804.728,10.000},
				{65160.637,17878.191,10.000},
				{66952.406,17917.689,10.000},
				{68744.691,17922.850,10.000},
				{70534.914,17902.229,10.000},
				{72321.382,17864.682,10.000},
				{74102.458,17810.764,10.000},
				{75876.583,17741.246,10.000},
				{77642.291,17657.087,10.000},
				{79398.232,17559.401,10.000},
				{81143.174,17449.421,10.000},
				{82876.020,17328.463,10.000},
				{84595.809,17197.889,10.000},
				{86301.716,17059.071,10.000},
				{87993.052,16913.363,10.000},
				{89669.260,16762.074,10.000},
				{91329.904,16606.443,10.000},
				{92974.667,16447.628,10.000},
				{94603.336,16286.690,10.000},
				{96215.795,16124.588,10.000},
				{97812.012,15962.173,10.000},
				{99392.031,15800.194,10.000},
				{100955.961,15639.292,10.000},
				{102503.962,15480.013,10.000},
				{104036.243,15322.808,10.000},
				{105553.047,15168.045,10.000},
				{107054.648,15016.013,10.000},
				{108541.342,14866.931,10.000},
				{110013.437,14720.956,10.000},
				{111471.256,14578.190,10.000},
				{112915.125,14438.689,10.000},
				{114345.372,14302.466,10.000},
				{115762.322,14169.502,10.000},
				{117166.296,14039.744,10.000},
				{118557.608,13913.117,10.000},
				{119936.560,13789.525,10.000},
				{121303.446,13668.855,10.000},
				{122658.544,13550.980,10.000},
				{124002.120,13435.763,10.000},
				{125334.426,13323.055,10.000},
				{126655.696,13212.705,10.000},
				{127966.151,13104.553,10.000},
				{129265.995,12998.437,10.000},
				{130555.414,12894.192,10.000},
				{131834.579,12791.651,10.000},
				{133103.644,12690.647,10.000},
				{134362.745,12591.010,10.000},
				{135612.002,12492.572,10.000},
				{136851.519,12395.164,10.000},
				{138081.380,12298.616,10.000},
				{139301.656,12202.760,10.000},
				{140512.399,12107.428,10.000},
				{141713.644,12012.451,10.000},
				{142905.410,11917.663,10.000},
				{144087.700,11822.894,10.000},
				{145260.498,11727.978,10.000},
				{146423.772,11632.746,10.000},
				{147577.475,11537.031,10.000},
				{148721.542,11440.663,10.000},
				{149855.889,11343.475,10.000},
				{150980.419,11245.298,10.000},
				{152095.015,11145.962,10.000},
				{153199.545,11045.300,10.000},
				{154293.859,10943.141,10.000},
				{155377.791,10839.318,10.000},
				{156451.157,10733.663,10.000},
				{157513.758,10626.011,10.000},
				{158565.378,10516.199,10.000},
				{159605.785,10404.067,10.000},
				{160634.731,10289.461,10.000},
				{161651.954,10172.231,10.000},
				{162657.178,10052.239,10.000},
				{163650.113,9929.353,10.000},
				{164630.459,9803.457,10.000},
				{165597.904,9674.450,10.000},
				{166552.129,9542.252,10.000},
				{167492.810,9406.806,10.000},
				{168419.618,9268.082,10.000},
				{169332.227,9126.085,10.000},
				{170230.313,8980.861,10.000},
				{171113.563,8832.499,10.000},
				{171981.677,8681.144,10.000},
				{172834.377,8526.998,10.000},
				{173671.410,8370.333,10.000},
				{174492.560,8211.496,10.000},
				{175297.652,8050.919,10.000},
				{176086.564,7889.124,10.000},
				{176859.237,7726.729,10.000},
				{177615.683,7564.456,10.000},
				{178355.996,7403.132,10.000},
				{179080.365,7243.691,10.000},
				{179789.082,7087.170,10.000},
				{180482.552,6934.704,10.000},
				{181161.304,6787.514,10.000},
				{181825.993,6646.896,10.000},
				{182477.413,6514.193,10.000},
				{183116.490,6390.778,10.000},
				{183744.292,6278.017,10.000},
				{184362.016,6177.242,10.000},
				{184970.987,6089.710,10.000},
				{185572.644,6016.566,10.000},
				{186168.525,5958.810,10.000},
				{186760.251,5917.261,10.000},
				{187349.504,5892.529,10.000},
				{187937.790,5882.864,10.000},
				{188526.346,5885.561,10.000},
				{189116.314,5899.671,10.000},
				{189708.766,5924.520,10.000},
				{190304.672,5959.064,10.000},
				{190904.866,6001.937,10.000},
				{191510.016,6051.503,10.000},
				{192120.609,6105.925,10.000},
				{192736.931,6163.228,10.000},
				{193359.068,6221.365,10.000},
				{193986.896,6278.277,10.000},
				{194620.090,6331.949,10.000},
				{195258.135,6380.449,10.000},
				{195900.332,6421.966,10.000},
				{196546.078,6457.465,10.000},
				{197194.997,6489.183,10.000},
				{197846.710,6517.129,10.000},
				{198500.776,6540.667,10.000},
				{199156.706,6559.300,10.000},
				{199813.972,6572.654,10.000},
				{200472.018,6580.462,10.000},
				{201130.272,6582.547,10.000},
				{201788.153,6578.810,10.000},
				{202445.075,6569.214,10.000},
				{203100.453,6553.778,10.000},
				{203753.709,6532.560,10.000},
				{204404.274,6505.654,10.000},
				{205051.592,6473.178,10.000},
				{205695.119,6435.270,10.000},
				{206334.327,6392.083,10.000},
				{206968.705,6343.779,10.000},
				{207597.758,6290.526,10.000},
				{208221.007,6232.493,10.000},
				{208837.992,6169.853,10.000},
				{209448.270,6102.773,10.000},
				{210051.412,6031.421,10.000},
				{210647.008,5955.958,10.000},
				{211234.662,5876.542,10.000},
				{211813.994,5793.322,10.000},
				{212384.639,5706.446,10.000},
				{212946.244,5616.051,10.000},
				{213498.471,5522.271,10.000},
				{214040.994,5425.232,10.000},
				{214573.499,5325.055,10.000},
				{215095.685,5221.854,10.000},
				{215607.259,5115.739,10.000},
				{216107.940,5006.813,10.000},
				{216597.457,4895.175,10.000},
				{217075.549,4780.919,10.000},
				{217541.963,4664.136,10.000},
				{217996.454,4544.911,10.000},
				{218438.787,4423.327,10.000},
				{218868.733,4299.464,10.000},
				{219286.073,4173.399,10.000},
				{219690.594,4045.205,10.000},
				{220082.089,3914.957,10.000},
				{220460.362,3782.725,10.000},
				{220825.220,3648.579,10.000},
				{221176.478,3512.588,10.000},
				{221513.960,3374.820,10.000},
				{221837.495,3235.343,10.000},
				{222146.917,3094.225,10.000},
				{222442.071,2951.535,10.000},
				{222722.805,2807.340,10.000},
				{222988.976,2661.710,10.000},
				{223240.447,2514.714,10.000},
				{223477.089,2366.423,10.000},
				{223698.780,2216.909,10.000},
				{223905.405,2066.243,10.000},
				{224096.855,1914.502,10.000},
				{224273.030,1761.758,10.000},
				{224433.839,1608.089,10.000},
				{224579.197,1453.572,10.000},
				{224709.025,1298.286,10.000},
				{224823.256,1142.311,10.000},
				{224922.258,990.015,10.000},
				{225006.973,847.148,10.000},
				{225078.490,715.177,10.000},
				{225137.911,594.201,10.000},
				{225186.341,484.304,10.000},
				{225224.896,385.554,10.000},
				{225254.697,298.006,10.000},
				{225276.867,221.703,10.000},
				{225292.535,156.680,10.000},
				{225302.831,102.960,10.000},
				{225308.887,60.560,10.000},
				{225311.836,29.491,10.000},
				{225312.812,9.757,10.000},
				{225312.948,1.363,10.000},
				{225312.948,0.000,10.000}
		};
		
		if (flipped) {
			rightProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			leftProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		} else {
			leftProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			rightProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		}
	}

}