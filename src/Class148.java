public class Class148 {

	static Index aClass317_1731;
	static Index aClass317_1732;
	static Class282_Sub15_Sub2 aClass282_Sub15_Sub2_1735;
	static Index aClass317_1737;
	static int anInt1738;
	static long aLong1740;
	static int anInt1730 = 0;

	Class148() throws Throwable {
		throw new Error();
	}

	static final void method2549(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class383.method6513(Class393.preferences.currentToolkit.getValue(742990495), 200, 804853307);
	}

	public static String method2550(int i_0, int i_1) {
		Class282_Sub37 class282_sub37_2 = (Class282_Sub37) Class492.aClass465_5774.get((long) i_0);
		if (class282_sub37_2 != null) {
			Class282_Sub41_Sub2 class282_sub41_sub2_3 = class282_sub37_2.aClass278_Sub1_8001.method4935(-1962983901);
			if (class282_sub41_sub2_3 != null) {
				double d_4 = class282_sub37_2.aClass278_Sub1_8001.method4923(1997080101);
				if ((double) class282_sub41_sub2_3.method14702(588000346) <= d_4 && (double) class282_sub41_sub2_3.method14705((byte) 5) >= d_4) {
					return class282_sub41_sub2_3.method14704(-1724339640);
				}
			}
		}

		return null;
	}

	public static RouteStrategy method2551(int i_0, int i_1, int i_2, int i_3, SceneObjectType sceneobjecttype_4, int i_5, int i_6) {
		Class224.aClass225_Sub5_2775.approxDestinationX = i_0;
		Class224.aClass225_Sub5_2775.approxDestinationY = i_1;
		Class224.aClass225_Sub5_2775.approxDestinationSizeX = i_2;
		Class224.aClass225_Sub5_2775.approxDestinationSizeY = i_3;
		Class224.aClass225_Sub5_2775.aClass458_7972 = sceneobjecttype_4;
		Class224.aClass225_Sub5_2775.anInt7971 = i_5;
		return Class224.aClass225_Sub5_2775;
	}

	static final void method2552(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.anInt7190;
	}

	static Class method2553(String string_0, short s_1) throws ClassNotFoundException {
		return string_0.equals("B") ? Byte.TYPE : (string_0.equals("I") ? Integer.TYPE : (string_0.equals("S") ? Short.TYPE : (string_0.equals("J") ? Long.TYPE : (string_0.equals("Z") ? Boolean.TYPE : (string_0.equals("F") ? Float.TYPE : (string_0.equals("D") ? Double.TYPE : (string_0.equals("C") ? Character.TYPE : (string_0.equals("void") ? Void.TYPE : Class.forName(string_0)))))))));
	}

	static final void method2554(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		int i_3 = Class393.preferences.aClass468_Sub13_8228.method12714(1677203613);
		if (i_2 != i_3) {
			if (Class169.method2875(client.gameState, -2096796884)) {
				if (i_3 == 0 && Class260.anInt3223 != -1) {
					Class11.method13400(IndexLoaders.MUSIC_INDEX, Class260.anInt3223, 0, i_2, false, (byte) -40);
					Class468_Sub6.method12658(1298761444);
					Class260.aBool3220 = false;
				} else if (i_2 == 0) {
					Class226.method3805(-1719520107);
					Class260.aBool3220 = false;
				} else {
					Class87.method1491(i_2, (byte) -25);
				}
			}

			Class393.preferences.setValue(Class393.preferences.aClass468_Sub13_8228, i_2, 1268885388);
			Class190.savePreferences((byte) 29);
			client.aBool7175 = false;
		}

	}

}
