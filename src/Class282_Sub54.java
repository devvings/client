public class Class282_Sub54 extends Node {

	Game aClass486_8191;
	Class463 aClass463_8196;
	public Class468_Sub18 currentToolkit;
	public Class468_Sub4 aClass468_Sub4_8187;
	public Class468_Sub4 aClass468_Sub4_8223;
	public Class468_Sub12 aClass468_Sub12_8195;
	public Class468_Sub21 aClass468_Sub21_8222;
	public Class468_Sub1 aClass468_Sub1_8197;
	public Class468_Sub16 aClass468_Sub16_8198;
	public Class468_Sub26 aClass468_Sub26_8224;
	public Class468_Sub30 aClass468_Sub30_8194;
	public Class468_Sub17 aClass468_Sub17_8200;
	public Class468_Sub23 aClass468_Sub23_8202;
	public Class468_Sub15 idleAnimations;
	public Class468_Sub19 aClass468_Sub19_8204;
	public Class468_Sub2 aClass468_Sub2_8205;
	public Class468_Sub29 aClass468_Sub29_8201;
	public Class468_Sub20 aClass468_Sub20_8207;
	public Class468_Sub27 aClass468_Sub27_8208;
	public Class468_Sub27 aClass468_Sub27_8209;
	public Class468_Sub7 aClass468_Sub7_8210;
	public Class468_Sub14 aClass468_Sub14_8211;
	public Class468_Sub28 aClass468_Sub28_8212;
	public Class468_Sub22 aClass468_Sub22_8213;
	public Class468_Sub18 aClass468_Sub18_8214;
	public Class468_Sub24 aClass468_Sub24_8216;
	public Class468_Sub9 aClass468_Sub9_8226;
	public Class468_Sub9 aClass468_Sub9_8218;
	public Class468_Sub8 aClass468_Sub8_8219;
	public Class468_Sub6 aClass468_Sub6_8192;
	public Class468_Sub5 cpu;
	public Class468_Sub11 aClass468_Sub11_8217;
	public Class468_Sub25 safeMode;
	public Class468_Sub3 aClass468_Sub3_8199;
	public Class468_Sub13 aClass468_Sub13_8225;
	public Class468_Sub13 aClass468_Sub13_8193;
	public Class468_Sub13 aClass468_Sub13_8227;
	public Class468_Sub13 aClass468_Sub13_8228;
	public Class468_Sub13 aClass468_Sub13_8229;
	public Class468_Sub10 aClass468_Sub10_8215;

	public Class282_Sub54(RsByteBuffer rsbytebuffer_1, Game game_2, int i_3) {
		this.aClass486_8191 = game_2;
		this.aClass463_8196 = new Class463(Engine.MAX_MEMORY, Engine.AVAILABLE_PROCESSORS, Class402.aString4828.indexOf("arm") != -1);
		this.currentToolkit = new Class468_Sub18(i_3, this);
		this.method13496(rsbytebuffer_1, (short) -14853);
	}

	void method13496(RsByteBuffer rsbytebuffer_1, short s_2) {
		if (rsbytebuffer_1 != null && rsbytebuffer_1.buffer != null) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 < 23) {
				try {
					this.method13498(rsbytebuffer_1, i_3, 1555660216);
				} catch (Exception exception_5) {
					this.method13497(true, 612084272);
				}

				this.method13497(false, -226219565);
			} else if (i_3 > 27) {
				this.method13497(true, 2054281814);
			} else {
				this.aClass468_Sub4_8187 = new Class468_Sub4(rsbytebuffer_1.readUnsignedByte(), this);
				this.aClass468_Sub4_8223 = new Class468_Sub4(this.aClass468_Sub4_8187.method12641(-1510157435), this);
				this.aClass468_Sub12_8195 = new Class468_Sub12(rsbytebuffer_1.readUnsignedByte(), this);
				this.aClass468_Sub21_8222 = new Class468_Sub21(rsbytebuffer_1.readUnsignedByte(), this);
				this.aClass468_Sub1_8197 = new Class468_Sub1(rsbytebuffer_1.readUnsignedByte(), this);
				if (i_3 >= 27) {
					this.aClass468_Sub16_8198 = new Class468_Sub16(rsbytebuffer_1.readUnsignedByte(), this);
				}

				this.aClass468_Sub26_8224 = new Class468_Sub26(rsbytebuffer_1.readUnsignedByte(), this);
				this.aClass468_Sub30_8194 = new Class468_Sub30(rsbytebuffer_1.readUnsignedByte(), this);
				this.aClass468_Sub17_8200 = new Class468_Sub17(rsbytebuffer_1.readUnsignedByte(), this);
				this.aClass468_Sub23_8202 = new Class468_Sub23(rsbytebuffer_1.readUnsignedByte(), this);
				this.idleAnimations = new Class468_Sub15(rsbytebuffer_1.readUnsignedByte(), this);
				this.aClass468_Sub19_8204 = new Class468_Sub19(rsbytebuffer_1.readUnsignedByte(), this);
				this.aClass468_Sub2_8205 = new Class468_Sub2(rsbytebuffer_1.readUnsignedByte(), this);
				if (i_3 >= 24) {
					this.aClass468_Sub29_8201 = new Class468_Sub29(rsbytebuffer_1.readUnsignedByte(), this);
				}

				this.aClass468_Sub20_8207 = new Class468_Sub20(rsbytebuffer_1.readUnsignedByte(), this);
				this.aClass468_Sub27_8208 = new Class468_Sub27(rsbytebuffer_1.readUnsignedByte(), this);
				this.aClass468_Sub27_8209 = new Class468_Sub27(this.aClass468_Sub27_8208.method12952((byte) 37), this);
				this.aClass468_Sub7_8210 = new Class468_Sub7(rsbytebuffer_1.readUnsignedByte(), this);
				if (i_3 >= 25) {
					this.aClass468_Sub14_8211 = new Class468_Sub14(rsbytebuffer_1.readUnsignedByte(), this);
				}

				this.aClass468_Sub28_8212 = new Class468_Sub28(rsbytebuffer_1.readUnsignedByte(), this);
				if (i_3 <= 25) {
					++rsbytebuffer_1.index;
				}

				this.aClass468_Sub22_8213 = new Class468_Sub22(rsbytebuffer_1.readUnsignedByte(), this);
				this.aClass468_Sub18_8214 = new Class468_Sub18(rsbytebuffer_1.readUnsignedByte(), this);
				this.currentToolkit = new Class468_Sub18(this.aClass468_Sub18_8214.getValue(-958077547), this);
				rsbytebuffer_1.readUnsignedByte();
				this.aClass468_Sub24_8216 = new Class468_Sub24(rsbytebuffer_1.readUnsignedByte(), this);
				this.aClass468_Sub9_8226 = new Class468_Sub9(rsbytebuffer_1.readUnsignedByte(), this);
				this.aClass468_Sub9_8218 = new Class468_Sub9(this.aClass468_Sub9_8226.method12687(-1215691938), this);
				this.aClass468_Sub8_8219 = new Class468_Sub8(rsbytebuffer_1.readUnsignedByte(), this);
				this.aClass468_Sub6_8192 = new Class468_Sub6(rsbytebuffer_1.readUnsignedByte(), this);
				this.cpu = new Class468_Sub5(rsbytebuffer_1.readUnsignedByte(), this);
				this.aClass468_Sub11_8217 = new Class468_Sub11(rsbytebuffer_1.readUnsignedByte(), this);
				this.safeMode = new Class468_Sub25(rsbytebuffer_1.readUnsignedByte(), this);
				if (i_3 >= 26) {
					this.aClass468_Sub3_8199 = new Class468_Sub3(rsbytebuffer_1.readUnsignedByte(), this);
				}

				this.aClass468_Sub13_8225 = new Class468_Sub13(rsbytebuffer_1.readUnsignedByte(), this);
				this.aClass468_Sub13_8193 = new Class468_Sub13(rsbytebuffer_1.readUnsignedByte(), this);
				this.aClass468_Sub13_8227 = new Class468_Sub13(rsbytebuffer_1.readUnsignedByte(), this);
				this.aClass468_Sub13_8228 = new Class468_Sub13(rsbytebuffer_1.readUnsignedByte(), this);
				this.aClass468_Sub13_8229 = new Class468_Sub13(rsbytebuffer_1.readUnsignedByte(), this);
				this.aClass468_Sub10_8215 = new Class468_Sub10(rsbytebuffer_1.readUnsignedByte(), this);
				this.method13497(false, -23246823);
			}
		} else {
			this.method13497(true, -1548642338);
		}

		this.method13502(-1736305082);
	}

	void method13497(boolean bool_1, int i_2) {
		if (bool_1 || this.aClass468_Sub4_8187 == null) {
			this.aClass468_Sub4_8187 = new Class468_Sub4(this);
		}

		if (bool_1 || this.aClass468_Sub4_8223 == null) {
			this.aClass468_Sub4_8223 = new Class468_Sub4(this.aClass468_Sub4_8187.method12641(2142983368), this);
		}

		if (bool_1 || this.aClass468_Sub12_8195 == null) {
			this.aClass468_Sub12_8195 = new Class468_Sub12(this);
		}

		if (bool_1 || this.aClass468_Sub21_8222 == null) {
			this.aClass468_Sub21_8222 = new Class468_Sub21(this);
		}

		if (bool_1 || this.aClass468_Sub1_8197 == null) {
			this.aClass468_Sub1_8197 = new Class468_Sub1(this);
		}

		if (bool_1 || this.aClass468_Sub16_8198 == null) {
			this.aClass468_Sub16_8198 = new Class468_Sub16(this);
		}

		if (bool_1 || this.aClass468_Sub26_8224 == null) {
			this.aClass468_Sub26_8224 = new Class468_Sub26(this);
		}

		if (bool_1 || this.aClass468_Sub30_8194 == null) {
			this.aClass468_Sub30_8194 = new Class468_Sub30(this);
		}

		if (bool_1 || this.aClass468_Sub17_8200 == null) {
			this.aClass468_Sub17_8200 = new Class468_Sub17(this);
		}

		if (bool_1 || this.aClass468_Sub23_8202 == null) {
			this.aClass468_Sub23_8202 = new Class468_Sub23(this);
		}

		if (bool_1 || this.idleAnimations == null) {
			this.idleAnimations = new Class468_Sub15(this);
		}

		if (bool_1 || this.aClass468_Sub19_8204 == null) {
			this.aClass468_Sub19_8204 = new Class468_Sub19(this);
		}

		if (bool_1 || this.aClass468_Sub2_8205 == null) {
			this.aClass468_Sub2_8205 = new Class468_Sub2(this);
		}

		if (bool_1 || this.aClass468_Sub29_8201 == null) {
			this.aClass468_Sub29_8201 = new Class468_Sub29(this);
		}

		if (bool_1 || this.aClass468_Sub20_8207 == null) {
			this.aClass468_Sub20_8207 = new Class468_Sub20(this);
		}

		if (bool_1 || this.aClass468_Sub27_8208 == null) {
			this.aClass468_Sub27_8208 = new Class468_Sub27(this);
		}

		if (bool_1 || this.aClass468_Sub27_8209 == null) {
			this.aClass468_Sub27_8209 = new Class468_Sub27(this.aClass468_Sub27_8208.method12952((byte) 96), this);
		}

		if (bool_1 || this.aClass468_Sub7_8210 == null) {
			this.aClass468_Sub7_8210 = new Class468_Sub7(this);
		}

		if (bool_1 || this.aClass468_Sub14_8211 == null) {
			this.aClass468_Sub14_8211 = new Class468_Sub14(this);
		}

		if (bool_1 || this.aClass468_Sub28_8212 == null) {
			this.aClass468_Sub28_8212 = new Class468_Sub28(this);
		}

		if (bool_1 || this.aClass468_Sub22_8213 == null) {
			this.aClass468_Sub22_8213 = new Class468_Sub22(this);
		}

		if (bool_1 || this.aClass468_Sub18_8214 == null) {
			this.aClass468_Sub18_8214 = new Class468_Sub18(this);
		}

		if (bool_1 || this.currentToolkit == null) {
			this.currentToolkit = new Class468_Sub18(this.aClass468_Sub18_8214.getValue(-1125192103), this);
		}

		if (bool_1 || this.aClass468_Sub24_8216 == null) {
			this.aClass468_Sub24_8216 = new Class468_Sub24(this);
		}

		if (bool_1 || this.aClass468_Sub9_8226 == null) {
			this.aClass468_Sub9_8226 = new Class468_Sub9(this);
		}

		if (bool_1 || this.aClass468_Sub9_8218 == null) {
			this.aClass468_Sub9_8218 = new Class468_Sub9(this.aClass468_Sub9_8226.method12687(-1865727854), this);
		}

		if (bool_1 || this.aClass468_Sub8_8219 == null) {
			this.aClass468_Sub8_8219 = new Class468_Sub8(this);
		}

		if (bool_1 || this.aClass468_Sub6_8192 == null) {
			this.aClass468_Sub6_8192 = new Class468_Sub6(this);
		}

		if (bool_1 || this.cpu == null) {
			this.cpu = new Class468_Sub5(this);
		}

		if (bool_1 || this.aClass468_Sub11_8217 == null) {
			this.aClass468_Sub11_8217 = new Class468_Sub11(this);
		}

		if (bool_1 || this.safeMode == null) {
			this.safeMode = new Class468_Sub25(this);
		}

		if (bool_1 || this.aClass468_Sub3_8199 == null) {
			this.aClass468_Sub3_8199 = new Class468_Sub3(this);
		}

		if (bool_1 || this.aClass468_Sub13_8225 == null) {
			this.aClass468_Sub13_8225 = new Class468_Sub13(this);
		}

		if (bool_1 || this.aClass468_Sub13_8193 == null) {
			this.aClass468_Sub13_8193 = new Class468_Sub13(this);
		}

		if (bool_1 || this.aClass468_Sub13_8227 == null) {
			this.aClass468_Sub13_8227 = new Class468_Sub13(this);
		}

		if (bool_1 || this.aClass468_Sub13_8228 == null) {
			this.aClass468_Sub13_8228 = new Class468_Sub13(this);
		}

		if (bool_1 || this.aClass468_Sub13_8229 == null) {
			this.aClass468_Sub13_8229 = new Class468_Sub13(this);
		}

		if (bool_1 || this.aClass468_Sub10_8215 == null) {
			this.aClass468_Sub10_8215 = new Class468_Sub10(this);
		}

	}

	void method13498(RsByteBuffer rsbytebuffer_1, int i_2, int i_3) {
		this.aClass468_Sub21_8222 = new Class468_Sub21(rsbytebuffer_1.readUnsignedByte(), this);
		++rsbytebuffer_1.index;
		this.aClass468_Sub27_8208 = new Class468_Sub27(rsbytebuffer_1.readUnsignedByte() + 1, this);
		this.aClass468_Sub23_8202 = new Class468_Sub23(rsbytebuffer_1.readUnsignedByte(), this);
		++rsbytebuffer_1.index;
		this.idleAnimations = new Class468_Sub15(rsbytebuffer_1.readUnsignedByte(), this);
		this.aClass468_Sub26_8224 = new Class468_Sub26(rsbytebuffer_1.readUnsignedByte(), this);
		rsbytebuffer_1.readUnsignedByte();
		this.aClass468_Sub28_8212 = new Class468_Sub28(rsbytebuffer_1.readUnsignedByte(), this);
		int i_4 = rsbytebuffer_1.readUnsignedByte();
		int i_5 = 0;
		if (i_2 >= 17) {
			i_5 = rsbytebuffer_1.readUnsignedByte();
		}

		this.aClass468_Sub2_8205 = new Class468_Sub2(i_4 > i_5 ? i_4 : i_5, this);
		boolean bool_6 = true;
		boolean bool_7 = true;
		if (i_2 >= 2) {
			bool_6 = rsbytebuffer_1.readUnsignedByte() == 1;
			if (i_2 >= 17) {
				bool_7 = rsbytebuffer_1.readUnsignedByte() == 1;
			}
		} else {
			bool_6 = rsbytebuffer_1.readUnsignedByte() == 1;
			rsbytebuffer_1.readUnsignedByte();
		}

		this.aClass468_Sub19_8204 = new Class468_Sub19(bool_6 | bool_7 ? 1 : 0, this);
		this.aClass468_Sub24_8216 = new Class468_Sub24(rsbytebuffer_1.readUnsignedByte(), this);
		this.aClass468_Sub30_8194 = new Class468_Sub30(rsbytebuffer_1.readUnsignedByte(), this);
		this.aClass468_Sub4_8187 = new Class468_Sub4(rsbytebuffer_1.readUnsignedByte(), this);
		this.aClass468_Sub10_8215 = new Class468_Sub10(rsbytebuffer_1.readUnsignedByte(), this);
		this.aClass468_Sub13_8225 = new Class468_Sub13(rsbytebuffer_1.readUnsignedByte(), this);
		if (i_2 >= 20) {
			this.aClass468_Sub13_8227 = new Class468_Sub13(rsbytebuffer_1.readUnsignedByte(), this);
		} else {
			this.aClass468_Sub13_8227 = new Class468_Sub13(this.aClass468_Sub13_8225.method12714(1536477085), this);
		}

		this.aClass468_Sub13_8228 = new Class468_Sub13(rsbytebuffer_1.readUnsignedByte(), this);
		this.aClass468_Sub13_8193 = new Class468_Sub13(rsbytebuffer_1.readUnsignedByte(), this);
		if (i_2 >= 21) {
			this.aClass468_Sub13_8229 = new Class468_Sub13(rsbytebuffer_1.readUnsignedByte(), this);
		} else {
			this.aClass468_Sub13_8229 = new Class468_Sub13(this.aClass468_Sub13_8228.method12714(1602734923), this);
		}

		if (i_2 >= 1) {
			rsbytebuffer_1.readUnsignedShort();
			rsbytebuffer_1.readUnsignedShort();
		}

		if (i_2 >= 3 && i_2 < 6) {
			rsbytebuffer_1.readUnsignedByte();
		}

		if (i_2 >= 4) {
			this.aClass468_Sub20_8207 = new Class468_Sub20(rsbytebuffer_1.readUnsignedByte(), this);
		}

		rsbytebuffer_1.readInt();
		if (i_2 >= 6) {
			this.aClass468_Sub9_8226 = new Class468_Sub9(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 7) {
			this.safeMode = new Class468_Sub25(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 8) {
			rsbytebuffer_1.readUnsignedByte();
		}

		if (i_2 >= 9) {
			this.aClass468_Sub1_8197 = new Class468_Sub1(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 10) {
			this.aClass468_Sub12_8195 = new Class468_Sub12(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 11) {
			this.aClass468_Sub8_8219 = new Class468_Sub8(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 12) {
			this.idleAnimations = new Class468_Sub15(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 13) {
			this.aClass468_Sub17_8200 = new Class468_Sub17(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 14) {
			this.aClass468_Sub18_8214 = new Class468_Sub18(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 15) {
			this.cpu = new Class468_Sub5(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 16) {
			this.aClass468_Sub22_8213 = new Class468_Sub22(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 18) {
			this.aClass468_Sub6_8192 = new Class468_Sub6(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 19) {
			this.aClass468_Sub7_8210 = new Class468_Sub7(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 22) {
			this.aClass468_Sub11_8217 = new Class468_Sub11(rsbytebuffer_1.readUnsignedByte(), this);
		}

	}

	public RsByteBuffer method13499(int i_1) {
		RsByteBuffer rsbytebuffer_2 = new RsByteBuffer(40);
		rsbytebuffer_2.writeByte(27);
		rsbytebuffer_2.writeByte(this.aClass468_Sub4_8187.method12641(1497480561));
		rsbytebuffer_2.writeByte(this.aClass468_Sub12_8195.method12706((byte) 95));
		rsbytebuffer_2.writeByte(this.aClass468_Sub21_8222.method12865(475375870));
		rsbytebuffer_2.writeByte(this.aClass468_Sub1_8197.method12615(-462784918));
		rsbytebuffer_2.writeByte(this.aClass468_Sub16_8198.method12750((byte) 32));
		rsbytebuffer_2.writeByte(this.aClass468_Sub26_8224.method12943(975799184));
		rsbytebuffer_2.writeByte(this.aClass468_Sub30_8194.method13417(-1899817216));
		rsbytebuffer_2.writeByte(this.aClass468_Sub17_8200.method12762(-140573));
		rsbytebuffer_2.writeByte(this.aClass468_Sub23_8202.method12897((byte) 75));
		rsbytebuffer_2.writeByte(this.idleAnimations.getValue(-118386335));
		rsbytebuffer_2.writeByte(this.aClass468_Sub19_8204.method12786(-399420695));
		rsbytebuffer_2.writeByte(this.aClass468_Sub2_8205.method12624((byte) -37));
		rsbytebuffer_2.writeByte(this.aClass468_Sub29_8201.method13050(519629067));
		rsbytebuffer_2.writeByte(this.aClass468_Sub20_8207.method12794(1270958764));
		rsbytebuffer_2.writeByte(this.aClass468_Sub27_8208.method12952((byte) 121));
		rsbytebuffer_2.writeByte(this.aClass468_Sub7_8210.method12666(141061966));
		rsbytebuffer_2.writeByte(this.aClass468_Sub14_8211.method12728(-1912429644));
		rsbytebuffer_2.writeByte(this.aClass468_Sub28_8212.method12966((byte) -41));
		rsbytebuffer_2.writeByte(this.aClass468_Sub22_8213.method12873(2145197376));
		rsbytebuffer_2.writeByte(this.aClass468_Sub18_8214.getValue(-120460114));
		rsbytebuffer_2.writeByte(0);
		rsbytebuffer_2.writeByte(this.aClass468_Sub24_8216.method12920(1244153925));
		rsbytebuffer_2.writeByte(this.aClass468_Sub9_8226.method12687(416506379));
		rsbytebuffer_2.writeByte(this.aClass468_Sub8_8219.method12675(-1589433086));
		rsbytebuffer_2.writeByte(this.aClass468_Sub6_8192.method12654(-239553097));
		rsbytebuffer_2.writeByte(this.cpu.getValue());
		rsbytebuffer_2.writeByte(this.aClass468_Sub11_8217.method12699((byte) -71));
		rsbytebuffer_2.writeByte(this.safeMode.getValue((byte) -54));
		rsbytebuffer_2.writeByte(this.aClass468_Sub3_8199.method12632(793302253));
		rsbytebuffer_2.writeByte(this.aClass468_Sub13_8225.method12714(1537092634));
		rsbytebuffer_2.writeByte(this.aClass468_Sub13_8193.method12714(-2033162521));
		rsbytebuffer_2.writeByte(this.aClass468_Sub13_8227.method12714(-1613359935));
		rsbytebuffer_2.writeByte(this.aClass468_Sub13_8228.method12714(-416727286));
		rsbytebuffer_2.writeByte(this.aClass468_Sub13_8229.method12714(1813865542));
		rsbytebuffer_2.writeByte(this.aClass468_Sub10_8215.method12691(-1240240085));
		return rsbytebuffer_2;
	}

	void method13502(int i_1) {
		this.aClass468_Sub4_8187.method12639((byte) -35);
		this.aClass468_Sub4_8223.method12639((byte) -23);
		this.aClass468_Sub12_8195.method12703(-2130049176);
		this.aClass468_Sub21_8222.method12861(-833257877);
		this.aClass468_Sub1_8197.method12616((byte) 16);
		this.aClass468_Sub16_8198.method12749(-1385034853);
		this.aClass468_Sub26_8224.method12941((byte) -58);
		this.aClass468_Sub30_8194.method13415((byte) -26);
		this.aClass468_Sub17_8200.method12767((byte) 6);
		this.aClass468_Sub23_8202.method12898((byte) 34);
		this.idleAnimations.method12741(130294314);
		this.aClass468_Sub19_8204.method12785(1216614107);
		this.aClass468_Sub2_8205.method12627((byte) -59);
		this.aClass468_Sub29_8201.method13048(-2117218391);
		this.aClass468_Sub20_8207.method12793(1354281667);
		this.aClass468_Sub27_8208.method12950(1301389562);
		this.aClass468_Sub27_8209.method12950(221369371);
		this.aClass468_Sub7_8210.method12663(-911909604);
		this.aClass468_Sub14_8211.method12725(-1401423341);
		this.aClass468_Sub28_8212.method12959(-922946523);
		this.aClass468_Sub22_8213.method12871((byte) -2);
		this.aClass468_Sub18_8214.method12773(-132030593);
		this.currentToolkit.method12773(-1630198990);
		this.aClass468_Sub24_8216.method12918((short) 22655);
		this.aClass468_Sub9_8226.method12684((byte) -10);
		this.aClass468_Sub9_8218.method12684((byte) 105);
		this.aClass468_Sub8_8219.method12674(-956855309);
		this.aClass468_Sub6_8192.method12653(-1781190291);
		this.cpu.method12648(2102747953);
		this.aClass468_Sub11_8217.method12698((byte) -36);
		this.safeMode.method12928((byte) 32);
		this.aClass468_Sub3_8199.method12631(-1642104120);
		this.aClass468_Sub13_8225.method12712((byte) 114);
		this.aClass468_Sub13_8193.method12712((byte) 41);
		this.aClass468_Sub13_8227.method12712((byte) 85);
		this.aClass468_Sub13_8228.method12712((byte) 78);
		this.aClass468_Sub13_8229.method12712((byte) 16);
		this.aClass468_Sub10_8215.method12692(2077923945);
	}

	public Class463 method13504(byte b_1) {
		return this.aClass463_8196;
	}

	public void method13505(Class468_Sub18 class468_sub18_1, boolean bool_2, int i_3) {
		class468_sub18_1.method12783(bool_2, (byte) 0);
		this.method13502(-1736305082);
	}

	public Class282_Sub54(Game game_1, int i_2) {
		this.aClass486_8191 = game_1;
		this.aClass463_8196 = new Class463(Engine.MAX_MEMORY, Engine.AVAILABLE_PROCESSORS, Class402.aString4828.toLowerCase().indexOf("arm") != -1);
		this.currentToolkit = new Class468_Sub18(i_2, this);
		this.method13497(true, 311350524);
	}

	public void setValue(Class468 class468_1, int i_2, int i_3) {
		class468_1.method7782(i_2, (byte) 120);
		this.method13502(-1736305082);
	}

	public Game method13514(byte b_1) {
		return this.aClass486_8191;
	}

}
