package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class ScaleToSwitchCubeLeftSide extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (5.00,1.00,20.00)
	
	public ScaleToSwitchCubeLeftSide() {
		this(false);
	}
			
    public ScaleToSwitchCubeLeftSide(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.565,11.301,10.000},
				{2.825,22.602,10.000},
				{7.910,50.852,10.000},
				{16.950,90.399,10.000},
				{31.074,141.236,10.000},
				{51.409,203.351,10.000},
				{79.082,276.730,10.000},
				{115.217,361.351,10.000},
				{160.936,457.184,10.000},
				{217.355,564.194,10.000},
				{285.588,682.334,10.000},
				{366.743,811.549,10.000},
				{461.920,951.772,10.000},
				{572.213,1102.927,10.000},
				{698.143,1259.304,10.000},
				{839.665,1415.214,10.000},
				{996.725,1570.604,10.000},
				{1169.267,1725.419,10.000},
				{1357.228,1879.609,10.000},
				{1560.541,2033.125,10.000},
				{1779.132,2185.919,10.000},
				{2012.927,2337.944,10.000},
				{2261.843,2489.158,10.000},
				{2525.794,2639.519,10.000},
				{2804.693,2788.987,10.000},
				{3098.446,2937.527,10.000},
				{3406.956,3085.104,10.000},
				{3730.125,3231.687,10.000},
				{4067.850,3377.246,10.000},
				{4420.025,3521.756,10.000},
				{4786.545,3665.193,10.000},
				{5167.298,3807.538,10.000},
				{5562.176,3948.773,10.000},
				{5971.064,4088.884,10.000},
				{6393.850,4227.861,10.000},
				{6830.420,4365.695,10.000},
				{7280.658,4502.384,10.000},
				{7744.450,4637.924,10.000},
				{8221.683,4772.321,10.000},
				{8712.240,4905.579,10.000},
				{9216.011,5037.708,10.000},
				{9732.883,5168.722,10.000},
				{10262.747,5298.639,10.000},
				{10805.495,5427.480,10.000},
				{11361.022,5555.269,10.000},
				{11929.226,5682.037,10.000},
				{12510.008,5807.817,10.000},
				{13103.272,5932.646,10.000},
				{13708.929,6056.567,10.000},
				{14326.892,6179.627,10.000},
				{14957.079,6301.877,10.000},
				{15599.417,6423.373,10.000},
				{16253.834,6544.176,10.000},
				{16920.269,6664.352,10.000},
				{17598.666,6783.972,10.000},
				{18288.978,6903.112,10.000},
				{18991.163,7021.853,10.000},
				{19705.191,7140.283,10.000},
				{20431.040,7258.492,10.000},
				{21168.698,7376.579,10.000},
				{21918.163,7494.645,10.000},
				{22679.443,7612.799,10.000},
				{23452.558,7731.154,10.000},
				{24237.541,7849.827,10.000},
				{25034.435,7968.942,10.000},
				{25843.298,8088.627,10.000},
				{26664.199,8209.014,10.000},
				{27497.223,8330.237,10.000},
				{28342.467,8452.438,10.000},
				{29200.043,8575.760,10.000},
				{30070.077,8700.346,10.000},
				{30952.712,8826.346,10.000},
				{31848.102,8953.907,10.000},
				{32756.420,9083.179,10.000},
				{33677.368,9209.473,10.000},
				{34610.178,9328.100,10.000},
				{35554.097,9439.197,10.000},
				{36508.385,9542.873,10.000},
				{37472.306,9639.208,10.000},
				{38445.131,9728.255,10.000},
				{39426.135,9810.038,10.000},
				{40414.590,9884.551,10.000},
				{41409.766,9951.758,10.000},
				{42410.925,10011.596,10.000},
				{43417.323,10063.974,10.000},
				{44428.200,10108.773,10.000},
				{45442.785,10145.853,10.000},
				{46459.840,10170.541,10.000},
				{47478.100,10182.607,10.000},
				{48496.733,10186.324,10.000},
				{49514.879,10181.466,10.000},
				{50531.659,10167.796,10.000},
				{51546.166,10145.069,10.000},
				{52557.469,10113.033,10.000},
				{53564.612,10071.433,10.000},
				{54566.614,10020.013,10.000},
				{55562.465,9958.516,10.000},
				{56551.134,9886.692,10.000},
				{57531.564,9804.294,10.000},
				{58502.672,9711.085,10.000},
				{59463.356,9606.835,10.000},
				{60412.960,9496.037,10.000},
				{61351.330,9383.705,10.000},
				{62278.351,9270.207,10.000},
				{63193.900,9155.493,10.000},
				{64097.853,9039.525,10.000},
				{64990.080,8922.270,10.000},
				{65870.450,8803.704,10.000},
				{66738.831,8683.811,10.000},
				{67595.089,8562.579,10.000},
				{68439.089,8440.003,10.000},
				{69270.698,8316.083,10.000},
				{70089.780,8190.824,10.000},
				{70896.204,8064.234,10.000},
				{71689.836,7936.327,10.000},
				{72470.548,7807.117,10.000},
				{73238.210,7676.625,10.000},
				{73992.698,7544.872,10.000},
				{74733.886,7411.882,10.000},
				{75461.654,7277.680,10.000},
				{76175.883,7142.296,10.000},
				{76876.459,7005.757,10.000},
				{77563.269,6868.095,10.000},
				{78236.203,6729.342,10.000},
				{78895.156,6589.529,10.000},
				{79540.025,6448.691,10.000},
				{80170.711,6306.861,10.000},
				{80787.118,6164.073,10.000},
				{81389.155,6020.362,10.000},
				{81976.731,5875.762,10.000},
				{82549.761,5730.307,10.000},
				{83108.165,5584.033,10.000},
				{83651.862,5436.972,10.000},
				{84180.778,5289.160,10.000},
				{84694.841,5140.629,10.000},
				{85193.982,4991.412,10.000},
				{85678.136,4841.542,10.000},
				{86147.241,4691.050,10.000},
				{86601.238,4539.968,10.000},
				{87040.070,4388.325,10.000},
				{87463.686,4236.153,10.000},
				{87872.033,4083.478,10.000},
				{88265.066,3930.330,10.000},
				{88642.740,3776.736,10.000},
				{89005.012,3622.723,10.000},
				{89351.844,3468.315,10.000},
				{89683.198,3313.537,10.000},
				{89999.039,3158.414,10.000},
				{90299.336,3002.967,10.000},
				{90584.058,2847.221,10.000},
				{90853.177,2691.195,10.000},
				{91106.668,2534.910,10.000},
				{91344.507,2378.386,10.000},
				{91566.671,2221.642,10.000},
				{91773.141,2064.696,10.000},
				{91963.897,1907.566,10.000},
				{92138.924,1750.268,10.000},
				{92298.206,1592.819,10.000},
				{92441.729,1435.234,10.000},
				{92569.482,1277.528,10.000},
				{92681.454,1119.716,10.000},
				{92778.153,966.987,10.000},
				{92860.653,825.007,10.000},
				{92930.080,694.263,10.000},
				{92987.557,574.772,10.000},
				{93034.211,466.544,10.000},
				{93071.170,369.590,10.000},
				{93099.562,283.919,10.000},
				{93120.516,209.536,10.000},
				{93135.160,146.446,10.000},
				{93144.625,94.652,10.000},
				{93150.041,54.156,10.000},
				{93152.537,24.961,10.000},
				{93153.244,7.066,10.000},
				{93153.291,0.472,10.000},
				{93153.291,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.565,11.301,10.000},
				{2.825,22.602,10.000},
				{7.911,50.857,10.000},
				{16.953,90.417,10.000},
				{31.082,141.290,10.000},
				{51.430,203.486,10.000},
				{79.132,277.020,10.000},
				{115.324,361.915,10.000},
				{161.144,458.199,10.000},
				{217.735,565.909,10.000},
				{286.244,685.090,10.000},
				{367.824,815.799,10.000},
				{463.634,958.101,10.000},
				{574.841,1112.074,10.000},
				{702.054,1272.126,10.000},
				{845.318,1432.644,10.000},
				{1004.686,1593.684,10.000},
				{1180.216,1755.297,10.000},
				{1371.970,1917.535,10.000},
				{1580.014,2080.448,10.000},
				{1804.423,2244.084,10.000},
				{2045.272,2408.487,10.000},
				{2302.642,2573.702,10.000},
				{2576.619,2739.770,10.000},
				{2867.292,2906.730,10.000},
				{3174.753,3074.618,10.000},
				{3499.101,3243.470,10.000},
				{3840.432,3413.316,10.000},
				{4198.851,3584.186,10.000},
				{4574.461,3756.105,10.000},
				{4967.371,3929.096,10.000},
				{5377.689,4103.180,10.000},
				{5805.526,4278.374,10.000},
				{6250.995,4454.691,10.000},
				{6714.210,4632.143,10.000},
				{7195.283,4810.737,10.000},
				{7694.331,4990.478,10.000},
				{8211.468,5171.366,10.000},
				{8746.807,5353.398,10.000},
				{9300.464,5536.569,10.000},
				{9872.551,5720.868,10.000},
				{10463.179,5906.282,10.000},
				{11072.459,6092.794,10.000},
				{11700.497,6280.382,10.000},
				{12347.399,6469.021,10.000},
				{13013.267,6658.681,10.000},
				{13698.200,6849.330,10.000},
				{14402.293,7040.929,10.000},
				{15125.636,7233.436,10.000},
				{15868.317,7426.805,10.000},
				{16630.415,7620.983,10.000},
				{17412.007,7815.915,10.000},
				{18213.161,8011.540,10.000},
				{19033.940,8207.792,10.000},
				{19874.400,8404.600,10.000},
				{20734.589,8601.888,10.000},
				{21614.546,8799.575,10.000},
				{22514.304,8997.573,10.000},
				{23433.883,9195.791,10.000},
				{24373.296,9394.132,10.000},
				{25332.545,9592.494,10.000},
				{26311.622,9790.767,10.000},
				{27310.506,9988.840,10.000},
				{28329.166,10186.594,10.000},
				{29367.556,10383.906,10.000},
				{30425.621,10580.648,10.000},
				{31503.290,10776.689,10.000},
				{32600.479,10971.893,10.000},
				{33717.091,11166.119,10.000},
				{34853.014,11359.225,10.000},
				{36008.120,11551.065,10.000},
				{37182.269,11741.493,10.000},
				{38375.305,11930.358,10.000},
				{39587.057,12117.513,10.000},
				{40816.691,12296.346,10.000},
				{42062.715,12460.242,10.000},
				{43323.622,12609.068,10.000},
				{44597.893,12742.713,10.000},
				{45884.003,12861.096,10.000},
				{47180.420,12964.166,10.000},
				{48485.609,13051.897,10.000},
				{49798.039,13124.298,10.000},
				{51116.179,13181.402,10.000},
				{52438.507,13223.274,10.000},
				{53763.507,13250.004,10.000},
				{55089.678,13261.710,10.000},
				{56415.531,13258.535,10.000},
				{57739.011,13234.790,10.000},
				{59058.081,13190.710,10.000},
				{60371.319,13132.377,10.000},
				{61677.321,13060.016,10.000},
				{62974.707,12973.865,10.000},
				{64262.124,12874.169,10.000},
				{65538.242,12761.180,10.000},
				{66801.758,12635.154,10.000},
				{68051.392,12496.346,10.000},
				{69285.893,12345.012,10.000},
				{70504.034,12181.403,10.000},
				{71704.610,12005.765,10.000},
				{72886.444,11818.337,10.000},
				{74048.379,11619.348,10.000},
				{75189.845,11414.662,10.000},
				{76310.902,11210.567,10.000},
				{77411.665,11007.638,10.000},
				{78492.258,10805.924,10.000},
				{79552.804,10605.464,10.000},
				{80593.433,10406.292,10.000},
				{81614.276,10208.429,10.000},
				{82615.466,10011.895,10.000},
				{83597.136,9816.699,10.000},
				{84559.420,9622.847,10.000},
				{85502.454,9430.338,10.000},
				{86426.371,9239.169,10.000},
				{87331.304,9049.331,10.000},
				{88217.385,8860.810,10.000},
				{89084.744,8673.591,10.000},
				{89933.510,8487.654,10.000},
				{90763.807,8302.979,10.000},
				{91575.761,8119.541,10.000},
				{92369.493,7937.314,10.000},
				{93145.120,7756.270,10.000},
				{93902.758,7576.380,10.000},
				{94642.519,7397.613,10.000},
				{95364.513,7219.938,10.000},
				{96068.845,7043.322,10.000},
				{96755.618,6867.731,10.000},
				{97424.931,6693.133,10.000},
				{98076.881,6519.492,10.000},
				{98711.558,6346.775,10.000},
				{99329.053,6174.946,10.000},
				{99929.450,6003.972,10.000},
				{100512.832,5833.818,10.000},
				{101079.277,5664.449,10.000},
				{101628.860,5495.833,10.000},
				{102161.654,5327.936,10.000},
				{102677.726,5160.724,10.000},
				{103177.142,4994.165,10.000},
				{103659.965,4828.228,10.000},
				{104126.253,4662.882,10.000},
				{104576.063,4498.095,10.000},
				{105009.447,4333.839,10.000},
				{105426.455,4170.085,10.000},
				{105827.136,4006.804,10.000},
				{106211.533,3843.969,10.000},
				{106579.688,3681.554,10.000},
				{106931.642,3519.534,10.000},
				{107267.430,3357.883,10.000},
				{107587.088,3196.577,10.000},
				{107890.647,3035.595,10.000},
				{108178.138,2874.913,10.000},
				{108449.589,2714.510,10.000},
				{108705.026,2554.366,10.000},
				{108944.472,2394.461,10.000},
				{109167.950,2234.776,10.000},
				{109375.479,2075.293,10.000},
				{109567.078,1915.995,10.000},
				{109742.765,1756.864,10.000},
				{109902.553,1597.885,10.000},
				{110046.457,1439.041,10.000},
				{110174.489,1280.318,10.000},
				{110286.659,1121.702,10.000},
				{110383.495,968.359,10.000},
				{110466.088,825.927,10.000},
				{110535.574,694.860,10.000},
				{110593.088,575.143,10.000},
				{110639.765,466.765,10.000},
				{110676.736,369.714,10.000},
				{110705.134,283.983,10.000},
				{110726.091,209.566,10.000},
				{110740.737,146.458,10.000},
				{110750.202,94.656,10.000},
				{110755.618,54.157,10.000},
				{110758.114,24.961,10.000},
				{110758.821,7.066,10.000},
				{110758.868,0.472,10.000},
				{110758.868,0.000,10.000}
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