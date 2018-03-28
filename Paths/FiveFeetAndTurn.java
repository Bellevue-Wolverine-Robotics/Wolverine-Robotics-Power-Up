package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class FiveFeetAndTurn extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (5.00,5.00,89.99)
	
	public FiveFeetAndTurn() {
		this(false);
	}
			
    public FiveFeetAndTurn(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.567,11.339,10.000},
				{2.835,22.678,10.000},
				{7.937,51.026,10.000},
				{17.008,90.710,10.000},
				{31.181,141.728,10.000},
				{51.589,204.075,10.000},
				{79.363,277.743,10.000},
				{115.635,362.722,10.000},
				{161.535,458.997,10.000},
				{218.190,566.552,10.000},
				{286.726,685.363,10.000},
				{368.267,815.403,10.000},
				{463.931,956.641,10.000},
				{574.835,1109.037,10.000},
				{701.524,1266.892,10.000},
				{843.976,1424.518,10.000},
				{1002.164,1581.884,10.000},
				{1176.060,1738.964,10.000},
				{1365.633,1895.729,10.000},
				{1570.848,2052.151,10.000},
				{1791.669,2208.203,10.000},
				{2028.054,2363.857,10.000},
				{2279.963,2519.087,10.000},
				{2547.349,2673.864,10.000},
				{2830.165,2828.161,10.000},
				{3128.361,2981.953,10.000},
				{3441.882,3135.211,10.000},
				{3770.673,3287.909,10.000},
				{4114.675,3440.020,10.000},
				{4473.826,3591.517,10.000},
				{4848.064,3742.372,10.000},
				{5237.319,3892.559,10.000},
				{5641.524,4042.050,10.000},
				{6060.606,4190.817,10.000},
				{6494.489,4338.832,10.000},
				{6943.096,4486.065,10.000},
				{7406.345,4632.489,10.000},
				{7884.152,4778.071,10.000},
				{8376.430,4922.782,10.000},
				{8883.089,5066.590,10.000},
				{9404.035,5209.462,10.000},
				{9939.172,5351.363,10.000},
				{10488.398,5492.259,10.000},
				{11051.609,5632.112,10.000},
				{11628.697,5770.883,10.000},
				{12219.550,5908.533,10.000},
				{12824.052,6045.017,10.000},
				{13442.081,6180.292,10.000},
				{14073.512,6314.310,10.000},
				{14718.215,6447.021,10.000},
				{15376.052,6578.371,10.000},
				{16046.882,6708.304,10.000},
				{16730.558,6836.760,10.000},
				{17426.925,6963.674,10.000},
				{18135.823,7088.979,10.000},
				{18857.083,7212.601,10.000},
				{19590.530,7334.462,10.000},
				{20335.977,7454.479,10.000},
				{21093.234,7572.563,10.000},
				{21862.096,7688.618,10.000},
				{22642.350,7802.542,10.000},
				{23433.772,7914.224,10.000},
				{24236.127,8023.546,10.000},
				{25049.165,8130.382,10.000},
				{25872.625,8234.597,10.000},
				{26706.229,8336.043,10.000},
				{27549.685,8434.565,10.000},
				{28402.685,8529.994,10.000},
				{29264.900,8622.150,10.000},
				{30135.984,8710.840,10.000},
				{31015.569,8795.855,10.000},
				{31903.267,8876.974,10.000},
				{32798.663,8953.957,10.000},
				{33701.318,9026.551,10.000},
				{34610.766,9094.483,10.000},
				{35526.040,9152.742,10.000},
				{36445.689,9196.493,10.000},
				{37368.264,9225.746,10.000},
				{38292.317,9240.527,10.000},
				{39216.405,9240.883,10.000},
				{40139.094,9226.887,10.000},
				{41058.958,9198.639,10.000},
				{41974.585,9156.274,10.000},
				{42884.581,9099.963,10.000},
				{43787.573,9029.922,10.000},
				{44682.215,8946.412,10.000},
				{45567.190,8849.753,10.000},
				{46441.222,8740.318,10.000},
				{47303.077,8618.550,10.000},
				{48151.974,8488.970,10.000},
				{48987.559,8355.850,10.000},
				{49809.490,8219.316,10.000},
				{50617.445,8079.545,10.000},
				{51411.122,7936.773,10.000},
				{52190.252,7791.303,10.000},
				{52954.603,7643.510,10.000},
				{53703.988,7493.850,10.000},
				{54438.275,7342.865,10.000},
				{55157.394,7191.190,10.000},
				{55861.349,7039.555,10.000},
				{56550.228,6888.788,10.000},
				{57224.209,6739.815,10.000},
				{57883.575,6593.655,10.000},
				{58528.716,6451.415,10.000},
				{59160.144,6314.276,10.000},
				{59778.492,6183.480,10.000},
				{60384.523,6060.306,10.000},
				{60979.127,5946.049,10.000},
				{61563.326,5841.990,10.000},
				{62138.263,5749.365,10.000},
				{62705.196,5669.328,10.000},
				{63265.488,5602.924,10.000},
				{63820.593,5551.047,10.000},
				{64372.035,5514.418,10.000},
				{64921.390,5493.556,10.000},
				{65470.266,5488.761,10.000},
				{66020.276,5500.102,10.000},
				{66573.018,5527.415,10.000},
				{67130.049,5570.311,10.000},
				{67692.867,5628.184,10.000},
				{68262.892,5700.242,10.000},
				{68841.444,5785.523,10.000},
				{69429.737,5882.936,10.000},
				{70028.866,5991.288,10.000},
				{70639.798,6109.322,10.000},
				{71263.373,6235.747,10.000},
				{71900.300,6369.271,10.000},
				{72551.163,6508.628,10.000},
				{73216.423,6652.597,10.000},
				{73896.425,6800.027,10.000},
				{74591.410,6949.846,10.000},
				{75301.517,7101.071,10.000},
				{76026.799,7252.815,10.000},
				{76767.228,7404.291,10.000},
				{77522.708,7554.808,10.000},
				{78293.085,7703.768,10.000},
				{79078.152,7850.666,10.000},
				{79877.660,7995.080,10.000},
				{80691.326,8136.663,10.000},
				{81518.840,8275.142,10.000},
				{82359.871,8410.305,10.000},
				{83214.071,8541.997,10.000},
				{84080.921,8668.500,10.000},
				{84959.465,8785.442,10.000},
				{85848.452,8889.872,10.000},
				{86746.589,8981.373,10.000},
				{87652.549,9059.594,10.000},
				{88564.973,9124.241,10.000},
				{89482.480,9175.070,10.000},
				{90403.668,9211.883,10.000},
				{91327.121,9234.526,10.000},
				{92251.408,9242.876,10.000},
				{93175.093,9236.846,10.000},
				{94096.730,9216.373,10.000},
				{95014.872,9181.418,10.000},
				{95928.068,9131.962,10.000},
				{96835.055,9069.866,10.000},
				{97735.058,9000.035,10.000},
				{98627.623,8925.653,10.000},
				{99512.322,8846.984,10.000},
				{100388.750,8764.278,10.000},
				{101256.526,8677.765,10.000},
				{102115.292,8587.662,10.000},
				{102964.710,8494.172,10.000},
				{103804.458,8397.482,10.000},
				{104634.235,8297.767,10.000},
				{105453.754,8195.192,10.000},
				{106262.745,8089.909,10.000},
				{107060.951,7982.059,10.000},
				{107848.128,7871.775,10.000},
				{108624.046,7759.179,10.000},
				{109388.485,7644.386,10.000},
				{110141.235,7527.504,10.000},
				{110882.098,7408.632,10.000},
				{111610.885,7287.864,10.000},
				{112327.413,7165.285,10.000},
				{113031.511,7040.977,10.000},
				{113723.013,6915.017,10.000},
				{114401.760,6787.475,10.000},
				{115067.602,6658.418,10.000},
				{115720.393,6527.909,10.000},
				{116359.993,6396.005,10.000},
				{116986.270,6262.763,10.000},
				{117599.093,6128.234,10.000},
				{118198.340,5992.467,10.000},
				{118783.891,5855.509,10.000},
				{119355.631,5717.404,10.000},
				{119913.450,5578.194,10.000},
				{120457.242,5437.918,10.000},
				{120986.904,5296.615,10.000},
				{121502.336,5154.320,10.000},
				{122003.443,5011.070,10.000},
				{122490.132,4866.896,10.000},
				{122962.316,4721.833,10.000},
				{123419.907,4575.910,10.000},
				{123862.823,4429.160,10.000},
				{124290.984,4281.611,10.000},
				{124704.313,4133.293,10.000},
				{125102.736,3984.234,10.000},
				{125486.183,3834.463,10.000},
				{125854.583,3684.007,10.000},
				{126207.873,3532.893,10.000},
				{126545.988,3381.150,10.000},
				{126868.868,3228.803,10.000},
				{127176.456,3075.880,10.000},
				{127468.697,2922.408,10.000},
				{127745.538,2768.413,10.000},
				{128006.930,2613.924,10.000},
				{128252.827,2458.965,10.000},
				{128483.184,2303.566,10.000},
				{128697.959,2147.752,10.000},
				{128897.114,1991.552,10.000},
				{129080.613,1834.992,10.000},
				{129248.423,1678.101,10.000},
				{129400.514,1520.907,10.000},
				{129536.858,1363.436,10.000},
				{129657.430,1205.719,10.000},
				{129762.427,1049.976,10.000},
				{129852.617,901.902,10.000},
				{129929.118,765.002,10.000},
				{129993.049,639.312,10.000},
				{130045.535,524.863,10.000},
				{130087.703,421.680,10.000},
				{130120.681,329.782,10.000},
				{130145.600,249.187,10.000},
				{130163.591,179.907,10.000},
				{130175.786,121.951,10.000},
				{130183.318,75.327,10.000},
				{130187.322,40.037,10.000},
				{130188.931,16.085,10.000},
				{130189.278,3.472,10.000},
				{130189.278,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.567,11.339,10.000},
				{2.835,22.679,10.000},
				{7.938,51.028,10.000},
				{17.010,90.719,10.000},
				{31.185,141.755,10.000},
				{51.599,204.140,10.000},
				{79.387,277.883,10.000},
				{115.687,362.994,10.000},
				{161.635,459.487,10.000},
				{218.373,567.379,10.000},
				{287.043,686.694,10.000},
				{368.788,817.458,10.000},
				{464.759,959.703,10.000},
				{576.106,1113.468,10.000},
				{703.417,1273.113,10.000},
				{846.716,1432.989,10.000},
				{1006.028,1593.123,10.000},
				{1181.383,1753.544,10.000},
				{1372.811,1914.280,10.000},
				{1580.346,2075.358,10.000},
				{1804.027,2236.807,10.000},
				{2043.892,2398.653,10.000},
				{2299.985,2560.925,10.000},
				{2572.350,2723.649,10.000},
				{2861.035,2886.852,10.000},
				{3166.091,3050.561,10.000},
				{3487.571,3214.803,10.000},
				{3825.532,3379.606,10.000},
				{4180.032,3544.996,10.000},
				{4551.132,3711.000,10.000},
				{4938.896,3877.645,10.000},
				{5343.392,4044.959,10.000},
				{5764.689,4212.968,10.000},
				{6202.859,4381.702,10.000},
				{6657.978,4551.188,10.000},
				{7130.123,4721.455,10.000},
				{7619.377,4892.533,10.000},
				{8125.822,5064.451,10.000},
				{8649.546,5237.240,10.000},
				{9190.639,5410.933,10.000},
				{9749.195,5585.562,10.000},
				{10325.311,5761.161,10.000},
				{10919.088,5937.766,10.000},
				{11530.629,6115.414,10.000},
				{12160.044,6294.143,10.000},
				{12807.443,6473.995,10.000},
				{13472.944,6655.011,10.000},
				{14156.668,6837.236,10.000},
				{14858.740,7020.719,10.000},
				{15579.291,7205.508,10.000},
				{16318.456,7391.659,10.000},
				{17076.379,7579.226,10.000},
				{17853.206,7768.271,10.000},
				{18649.092,7958.857,10.000},
				{19464.197,8151.053,10.000},
				{20298.690,8344.931,10.000},
				{21152.747,8540.570,10.000},
				{22026.553,8738.053,10.000},
				{22920.300,8937.469,10.000},
				{23834.191,9138.914,10.000},
				{24768.440,9342.490,10.000},
				{25723.271,9548.308,10.000},
				{26698.919,9756.485,10.000},
				{27695.634,9967.149,10.000},
				{28713.678,10180.433,10.000},
				{29753.326,10396.486,10.000},
				{30814.873,10615.463,10.000},
				{31898.626,10837.533,10.000},
				{33004.913,11062.875,10.000},
				{34134.082,11291.683,10.000},
				{35286.498,11524.166,10.000},
				{36462.553,11760.545,10.000},
				{37662.659,12001.058,10.000},
				{38887.255,12245.961,10.000},
				{40136.807,12495.525,10.000},
				{41411.149,12743.422,10.000},
				{42709.464,12983.148,10.000},
				{44030.933,13214.693,10.000},
				{45374.736,13438.031,10.000},
				{46740.048,13653.114,10.000},
				{48126.035,13859.870,10.000},
				{49531.855,14058.199,10.000},
				{50956.651,14247.965,10.000},
				{52399.551,14428.998,10.000},
				{53859.659,14601.083,10.000},
				{55336.055,14763.956,10.000},
				{56827.785,14917.301,10.000},
				{58333.859,15060.740,10.000},
				{59853.242,15193.835,10.000},
				{61385.583,15323.402,10.000},
				{62931.233,15456.507,10.000},
				{64490.536,15593.026,10.000},
				{66063.814,15732.781,10.000},
				{67651.368,15875.535,10.000},
				{69253.466,16020.987,10.000},
				{70870.342,16168.760,10.000},
				{72502.182,16318.400,10.000},
				{74149.119,16469.364,10.000},
				{75811.220,16621.017,10.000},
				{77488.483,16772.630,10.000},
				{79180.821,16923.373,10.000},
				{80888.053,17072.323,10.000},
				{82609.899,17218.459,10.000},
				{84345.966,17360.675,10.000},
				{86095.745,17497.790,10.000},
				{87858.602,17628.563,10.000},
				{89633.773,17751.715,10.000},
				{91420.368,17865.951,10.000},
				{93217.367,17969.990,10.000},
				{95023.627,18062.598,10.000},
				{96837.889,18142.619,10.000},
				{98658.790,18209.010,10.000},
				{100484.878,18260.877,10.000},
				{102314.627,18297.499,10.000},
				{104146.463,18318.357,10.000},
				{105978.778,18323.151,10.000},
				{107809.959,18311.812,10.000},
				{109638.410,18284.504,10.000},
				{111462.571,18241.617,10.000},
				{113280.947,18183.754,10.000},
				{115092.118,18111.711,10.000},
				{116894.763,18026.446,10.000},
				{118687.668,17929.052,10.000},
				{120469.740,17820.720,10.000},
				{122240.011,17702.708,10.000},
				{123997.641,17576.305,10.000},
				{125741.922,17442.804,10.000},
				{127472.269,17303.472,10.000},
				{129188.221,17159.526,10.000},
				{130889.433,17012.120,10.000},
				{132575.666,16862.325,10.000},
				{134246.778,16711.123,10.000},
				{135902.718,16559.401,10.000},
				{137543.513,16407.946,10.000},
				{139169.258,16257.451,10.000},
				{140780.109,16108.510,10.000},
				{142376.272,15961.631,10.000},
				{143957.995,15817.236,10.000},
				{145525.562,15675.669,10.000},
				{147079.283,15537.206,10.000},
				{148619.489,15402.058,10.000},
				{150146.527,15270.380,10.000},
				{151660.476,15139.495,10.000},
				{153160.720,15002.434,10.000},
				{154646.240,14855.208,10.000},
				{156116.063,14698.230,10.000},
				{157569.249,14531.853,10.000},
				{159004.886,14356.371,10.000},
				{160422.089,14172.028,10.000},
				{161819.991,13979.021,10.000},
				{163197.741,13777.507,10.000},
				{164554.502,13567.604,10.000},
				{165889.442,13349.403,10.000},
				{167201.739,13122.966,10.000},
				{168490.572,12888.332,10.000},
				{169755.124,12645.519,10.000},
				{170994.830,12397.063,10.000},
				{172209.770,12149.398,10.000},
				{173400.398,11906.283,10.000},
				{174567.144,11667.454,10.000},
				{175710.410,11432.663,10.000},
				{176830.578,11201.678,10.000},
				{177928.006,10974.283,10.000},
				{179003.034,10750.275,10.000},
				{180055.980,10529.466,10.000},
				{181087.149,10311.681,10.000},
				{182096.824,10096.757,10.000},
				{183085.278,9884.541,10.000},
				{184052.768,9674.892,10.000},
				{184999.535,9467.677,10.000},
				{185925.812,9262.773,10.000},
				{186831.819,9060.065,10.000},
				{187717.764,8859.447,10.000},
				{188583.846,8660.819,10.000},
				{189430.254,8464.088,10.000},
				{190257.171,8269.166,10.000},
				{191064.768,8075.973,10.000},
				{191853.212,7884.433,10.000},
				{192622.659,7694.475,10.000},
				{193373.262,7506.031,10.000},
				{194105.166,7319.041,10.000},
				{194818.511,7133.444,10.000},
				{195513.429,6949.185,10.000},
				{196190.051,6766.214,10.000},
				{196848.499,6584.480,10.000},
				{197488.892,6403.937,10.000},
				{198111.346,6224.541,10.000},
				{198715.971,6046.251,10.000},
				{199302.874,5869.026,10.000},
				{199872.157,5692.829,10.000},
				{200423.919,5517.623,10.000},
				{200958.257,5343.373,10.000},
				{201475.261,5170.046,10.000},
				{201975.022,4997.608,10.000},
				{202457.625,4826.030,10.000},
				{202923.153,4655.280,10.000},
				{203371.686,4485.328,10.000},
				{203803.300,4316.145,10.000},
				{204218.071,4147.703,10.000},
				{204616.068,3979.974,10.000},
				{204997.361,3812.929,10.000},
				{205362.015,3646.542,10.000},
				{205710.094,3480.785,10.000},
				{206041.657,3315.631,10.000},
				{206356.762,3151.053,10.000},
				{206655.465,2987.025,10.000},
				{206937.816,2823.518,10.000},
				{207203.867,2660.508,10.000},
				{207453.664,2497.965,10.000},
				{207687.250,2335.864,10.000},
				{207904.668,2174.177,10.000},
				{208105.955,2012.876,10.000},
				{208291.149,1851.935,10.000},
				{208460.281,1691.325,10.000},
				{208613.383,1531.019,10.000},
				{208750.482,1370.989,10.000},
				{208871.603,1211.206,10.000},
				{208976.987,1053.844,10.000},
				{209067.442,904.548,10.000},
				{209144.118,766.756,10.000},
				{209208.161,640.433,10.000},
				{209260.716,525.549,10.000},
				{209302.924,422.077,10.000},
				{209335.923,329.998,10.000},
				{209360.853,249.294,10.000},
				{209378.848,179.955,10.000},
				{209391.045,121.970,10.000},
				{209398.579,75.332,10.000},
				{209402.582,40.038,10.000},
				{209404.191,16.085,10.000},
				{209404.538,3.472,10.000},
				{209404.538,0.000,10.000}
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