public class Class117 {

	int[] anIntArray1260;
	byte[] aByteArray1261;
	int[] anIntArray1262;

	int method1971(byte[] bytes_1, int i_2, int i_3, byte[] bytes_4, int i_5, int i_6) {
		int i_7 = 0;
		int i_8 = i_5 << 3;

		for (i_3 += i_2; i_2 < i_3; i_2++) {
			int i_9 = bytes_1[i_2] & 0xff;
			int i_10 = this.anIntArray1260[i_9];
			byte b_11 = this.aByteArray1261[i_9];
			if (b_11 == 0) {
				throw new RuntimeException("" + i_9);
			}

			int i_12 = i_8 >> 3;
			int i_13 = i_8 & 0x7;
			i_7 &= -i_13 >> 31;
			int i_14 = (i_13 + b_11 - 1 >> 3) + i_12;
			i_13 += 24;
			bytes_4[i_12] = (byte) (i_7 |= i_10 >>> i_13);
			if (i_12 < i_14) {
				++i_12;
				i_13 -= 8;
				bytes_4[i_12] = (byte) (i_7 = i_10 >>> i_13);
				if (i_12 < i_14) {
					++i_12;
					i_13 -= 8;
					bytes_4[i_12] = (byte) (i_7 = i_10 >>> i_13);
					if (i_12 < i_14) {
						++i_12;
						i_13 -= 8;
						bytes_4[i_12] = (byte) (i_7 = i_10 >>> i_13);
						if (i_12 < i_14) {
							++i_12;
							i_13 -= 8;
							bytes_4[i_12] = (byte) (i_7 = i_10 << -i_13);
						}
					}
				}
			}

			i_8 += b_11;
		}

		return (i_8 + 7 >> 3) - i_5;
	}

	int method1973(byte[] bytes_1, int i_2, byte[] bytes_3, int i_4, int i_5, byte b_6) {
		if (i_5 == 0) {
			return 0;
		} else {
			int i_7 = 0;
			i_5 += i_4;
			int i_8 = i_2;

			while (true) {
				byte b_9 = bytes_1[i_8];
				if (b_9 < 0) {
					i_7 = this.anIntArray1262[i_7];
				} else {
					++i_7;
				}

				int i_10;
				if ((i_10 = this.anIntArray1262[i_7]) < 0) {
					bytes_3[i_4++] = (byte) (~i_10);
					if (i_4 >= i_5) {
						break;
					}

					i_7 = 0;
				}

				if ((b_9 & 0x40) != 0) {
					i_7 = this.anIntArray1262[i_7];
				} else {
					++i_7;
				}

				if ((i_10 = this.anIntArray1262[i_7]) < 0) {
					bytes_3[i_4++] = (byte) (~i_10);
					if (i_4 >= i_5) {
						break;
					}

					i_7 = 0;
				}

				if ((b_9 & 0x20) != 0) {
					i_7 = this.anIntArray1262[i_7];
				} else {
					++i_7;
				}

				if ((i_10 = this.anIntArray1262[i_7]) < 0) {
					bytes_3[i_4++] = (byte) (~i_10);
					if (i_4 >= i_5) {
						break;
					}

					i_7 = 0;
				}

				if ((b_9 & 0x10) != 0) {
					i_7 = this.anIntArray1262[i_7];
				} else {
					++i_7;
				}

				if ((i_10 = this.anIntArray1262[i_7]) < 0) {
					bytes_3[i_4++] = (byte) (~i_10);
					if (i_4 >= i_5) {
						break;
					}

					i_7 = 0;
				}

				if ((b_9 & 0x8) != 0) {
					i_7 = this.anIntArray1262[i_7];
				} else {
					++i_7;
				}

				if ((i_10 = this.anIntArray1262[i_7]) < 0) {
					bytes_3[i_4++] = (byte) (~i_10);
					if (i_4 >= i_5) {
						break;
					}

					i_7 = 0;
				}

				if ((b_9 & 0x4) != 0) {
					i_7 = this.anIntArray1262[i_7];
				} else {
					++i_7;
				}

				if ((i_10 = this.anIntArray1262[i_7]) < 0) {
					bytes_3[i_4++] = (byte) (~i_10);
					if (i_4 >= i_5) {
						break;
					}

					i_7 = 0;
				}

				if ((b_9 & 0x2) != 0) {
					i_7 = this.anIntArray1262[i_7];
				} else {
					++i_7;
				}

				if ((i_10 = this.anIntArray1262[i_7]) < 0) {
					bytes_3[i_4++] = (byte) (~i_10);
					if (i_4 >= i_5) {
						break;
					}

					i_7 = 0;
				}

				if ((b_9 & 0x1) != 0) {
					i_7 = this.anIntArray1262[i_7];
				} else {
					++i_7;
				}

				if ((i_10 = this.anIntArray1262[i_7]) < 0) {
					bytes_3[i_4++] = (byte) (~i_10);
					if (i_4 >= i_5) {
						break;
					}

					i_7 = 0;
				}

				++i_8;
			}

			return i_8 + 1 - i_2;
		}
	}

	public Class117(byte[] bytes_1) {
		int i_2 = bytes_1.length;
		this.anIntArray1260 = new int[i_2];
		this.aByteArray1261 = bytes_1;
		int[] ints_3 = new int[33];
		this.anIntArray1262 = new int[8];
		int i_4 = 0;

		for (int i_5 = 0; i_5 < i_2; i_5++) {
			byte b_6 = bytes_1[i_5];
			if (b_6 != 0) {
				int i_7 = 1 << 32 - b_6;
				int i_8 = ints_3[b_6];
				this.anIntArray1260[i_5] = i_8;
				int i_9;
				int i_10;
				int i_11;
				int i_12;
				if ((i_8 & i_7) != 0) {
					i_9 = ints_3[b_6 - 1];
				} else {
					i_9 = i_8 | i_7;

					for (i_10 = b_6 - 1; i_10 >= 1; --i_10) {
						i_11 = ints_3[i_10];
						if (i_11 != i_8) {
							break;
						}

						i_12 = 1 << 32 - i_10;
						if ((i_11 & i_12) != 0) {
							ints_3[i_10] = ints_3[i_10 - 1];
							break;
						}

						ints_3[i_10] = i_11 | i_12;
					}
				}

				ints_3[b_6] = i_9;

				for (i_10 = b_6 + 1; i_10 <= 32; i_10++) {
					if (i_8 == ints_3[i_10]) {
						ints_3[i_10] = i_9;
					}
				}

				i_10 = 0;

				for (i_11 = 0; i_11 < b_6; i_11++) {
					i_12 = Integer.MIN_VALUE >>> i_11;
					if ((i_8 & i_12) != 0) {
						if (this.anIntArray1262[i_10] == 0) {
							this.anIntArray1262[i_10] = i_4;
						}

						i_10 = this.anIntArray1262[i_10];
					} else {
						++i_10;
					}

					if (i_10 >= this.anIntArray1262.length) {
						int[] ints_13 = new int[this.anIntArray1262.length * 2];

						for (int i_14 = 0; i_14 < this.anIntArray1262.length; i_14++) {
							ints_13[i_14] = this.anIntArray1262[i_14];
						}

						this.anIntArray1262 = ints_13;
					}

					i_12 >>>= 1;
				}

				this.anIntArray1262[i_10] = ~i_5;
				if (i_10 >= i_4) {
					i_4 = i_10 + 1;
				}
			}
		}

	}

	public static void method1978(int i_0, int i_1, int i_2, byte b_3) {
		i_2 = i_2 * Class393.preferences.aClass468_Sub13_8228.method12714(-964271083) >> 8;
		if (i_2 != 0 && i_0 != -1) {
			if (!Class260.aBool3220 && Class260.anInt3223 != -1 && Class116.method1966(1048199259) && !Class345.method6140(644777212)) {
				Class260.aClass282_Sub15_Sub2_3231 = Message.method7272((byte) 9);
				Class230.method3912((byte) 3);
				Class282_Sub15_Sub2 class282_sub15_sub2_4 = Class282_Sub20_Sub10.method15262(Class260.aClass282_Sub15_Sub2_3231, 1475290596);
				Class42_Sub1.method14563(true, class282_sub15_sub2_4, (short) 569);
			}

			Class11.method13400(IndexLoaders.INDEX_11, i_0, 0, i_2, false, (byte) -50);
			Class150.method2580(-1, 255, (byte) -39);
			Class260.aBool3220 = true;
		}

	}

	static final void method1979(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = cs2executor_0.aClass282_Sub4_7011.aClass57Array7499[i_2].aString524;
	}

	public static int method1980(int i_0, int i_1, boolean bool_2, int i_3) {
		Class282_Sub30 class282_sub30_4 = CS2Runner.method11127(i_0, bool_2, -2136766081);
		if (class282_sub30_4 == null) {
			return 0;
		} else if (i_1 == -1) {
			return 0;
		} else {
			int i_5 = 0;

			for (int i_6 = 0; i_6 < class282_sub30_4.anIntArray7709.length; i_6++) {
				if (class282_sub30_4.anIntArray7710[i_6] == i_1) {
					i_5 += class282_sub30_4.anIntArray7709[i_6];
				}
			}

			return i_5;
		}
	}

	public static IComponentDefinitions method1981(int i_0, byte b_1) {
		int i_2 = i_0 >> 16;
		if (Class468_Sub8.aClass98Array7889[i_2] == null || Class468_Sub8.aClass98Array7889[i_2].method1618(i_0, (byte) 12) == null) {
			boolean bool_3 = Class456_Sub3.method12682(i_2, (int[]) null, -1161112150);
			if (!bool_3) {
				return null;
			}
		}

		return Class468_Sub8.aClass98Array7889[i_2].method1618(i_0, (byte) 12);
	}

	static void method1982(int i_0, int i_1) {
		Class13.anInt128 = i_0;
		SoftCache softcache_2 = Class13.aClass229_127;
		synchronized (Class13.aClass229_127) {
			Class13.aClass229_127.method3859(1707843883);
		}
	}

}
