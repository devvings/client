public class Class4 {

	boolean aBool29;
	int anInt30;
	int anInt31;
	int anInt32;
	boolean aBool33;
	public static int anInt34;
	public static int anInt35;

	static float method288(float f_0, float f_1, float f_2, float f_3, float f_4, float f_5, int i_6, int i_7) {
		float f_8 = 0.0F;
		float f_9 = f_3 - f_0;
		float f_10 = f_4 - f_1;
		float f_11 = f_5 - f_2;
		float f_12 = 0.0F;
		float f_13 = 0.0F;
		float f_14 = 0.0F;

		for (SceneObjectManager sceneobjectmanager_15 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-956350211); f_8 < 1.1F; f_8 += 0.1F) {
			float f_16 = f_8 * f_9 + f_0;
			float f_17 = f_10 * f_8 + f_1;
			float f_18 = f_2 + f_8 * f_11;
			int i_19 = (int) f_16 >> 9;
			int i_20 = (int) f_18 >> 9;
			if (i_19 > 0 && i_20 > 0 && i_19 < IndexLoaders.MAP_REGION_DECODER.getSizeX(-964294290) && i_20 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-1282893956)) {
				int i_21 = Class84.myPlayer.plane;
				if (i_21 < 3 && (IndexLoaders.MAP_REGION_DECODER.method4433(33386298).tileMasks[1][i_19][i_20] & 0x2) != 0) {
					++i_21;
				}

				int i_22 = sceneobjectmanager_15.aClass390Array2607[i_21].method6709((int) f_16, (int) f_18, 1453959191);
				if ((float) i_22 < f_17) {
					if (i_6 >= 2) {
						return f_8 - 0.1F + method288(f_12, f_13, f_14, f_16, f_17, f_18, i_6 - 1, -1906772657) * 0.1F;
					}

					return f_8;
				}
			}

			f_12 = f_16;
			f_13 = f_17;
			f_14 = f_18;
		}

		return -1.0F;
	}

	static final void method289(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 125);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.anInt1343;
	}

	static final void method290(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		WorldMapAreaDefs worldmapareadefs_3 = IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(i_2, 174714290);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = worldmapareadefs_3.anInt2718;
	}

	static final void method291(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = IndexLoaders.QUICK_CHAT_INDEX_LOADER.method5918(i_2, -1111901377).aCharArray9745[i_3];
	}

	static final void method292(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.preferences.aClass468_Sub27_8208.method12952((byte) 83) == 2 ? 1 : 0;
	}

}
