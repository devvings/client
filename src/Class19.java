public class Class19 {

	public int anInt153;

	int anInt154;

	public boolean method576(int i_1, int i_2, int i_3, int i_4) {
		int i_5 = this.anInt154;
		if (this.anInt153 == i_1 && this.anInt154 == 0) {
			return false;
		} else {
			boolean bool_6;
			int i_7;
			if (this.anInt154 != 0) {
				int i_8;
				if (this.anInt154 > 0 && i_1 > this.anInt153) {
					i_7 = this.anInt154 * this.anInt154 / (i_2 * 2);
					i_8 = i_7 + this.anInt153;
					if (i_8 < i_1 && i_8 >= this.anInt153) {
						bool_6 = true;
					} else {
						bool_6 = false;
					}
				} else if (this.anInt154 < 0 && i_1 < this.anInt153) {
					i_7 = this.anInt154 * this.anInt154 / (i_2 * 2);
					i_8 = this.anInt153 - i_7;
					if (i_8 > i_1 && i_8 <= this.anInt153) {
						bool_6 = true;
					} else {
						bool_6 = false;
					}
				} else {
					bool_6 = false;
				}
			} else {
				if (i_1 > this.anInt153 && i_1 <= i_2 + this.anInt153 || i_1 < this.anInt153 && i_1 >= this.anInt153 - i_2) {
					this.anInt153 = i_1;
					return false;
				}
				bool_6 = true;
			}
			if (bool_6) {
				if (i_1 > this.anInt153) {
					this.anInt154 += i_2;
					if (i_3 != 0 && this.anInt154 > i_3) {
						this.anInt154 = i_3;
					}
				} else {
					this.anInt154 -= i_2;
					if (i_3 != 0 && this.anInt154 < -i_3) {
						this.anInt154 = -i_3;
					}
				}
				if (i_5 != this.anInt154) {
					i_7 = this.anInt154 * this.anInt154 / (i_2 * 2);
					if (i_1 > this.anInt153) {
						if (i_7 + this.anInt153 > i_1) {
							this.anInt154 = i_5;
						}
					} else if (i_1 < this.anInt153 && this.anInt153 - i_7 < i_1) {
						this.anInt154 = i_5;
					}
				}
			} else if (this.anInt154 > 0) {
				this.anInt154 -= i_2;
				if (this.anInt154 < 0) {
					this.anInt154 = 0;
				}
			} else {
				this.anInt154 += i_2;
				if (this.anInt154 > 0) {
					this.anInt154 = 0;
				}
			}
			this.anInt153 += i_5 + this.anInt154 >> 1;
			return bool_6;
		}
	}

	public void method577(int i_1, int i_2) {
		this.anInt153 = i_1;
		this.anInt154 = 0;
	}

	public int method578(byte b_1) {
		return this.anInt153 & 0x3fff;
	}

	public void method579(int i_1) {
		this.anInt153 &= 0x3fff;
	}
}
