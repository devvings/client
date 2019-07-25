import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostNameIdentifier implements Runnable {

	volatile String host;

	InetAddress address;

	public String getHostName() {
		return this.host;
	}

	public void run() {
		this.host = this.address.getHostName();
	}

	HostNameIdentifier(int i_1) throws UnknownHostException {
		this.address = InetAddress.getByAddress(new byte[] { (byte) (i_1 >> 24 & 0xff), (byte) (i_1 >> 16 & 0xff), (byte) (i_1 >> 8 & 0xff), (byte) (i_1 & 0xff) });
	}

	public static void clearComponents(int i_0, int i_1) {
		if (i_0 != -1 && !MapAreaIndexLoader.INTERFACES_LOADED[i_0]) {
			Class388.INTERFACE_INDEX.clearFiles(i_0);
			CustomCursorsPreference.INTERFACES[i_0] = null;
		}
	}

	static void method482(byte b_0) {
		if (Class182.HARDWARE_RENDERER != null) {
			Class182.HARDWARE_RENDERER.method8396();
			Class182.HARDWARE_RENDERER = null;
			Class182.aFontRenderer_2259 = null;
		}
	}

	public static void method483(RSInterface interface_0, IComponentDefinitions icomponentdefinitions_1, boolean bool_2, int i_3) {
		Class480.method8044(interface_0.components, icomponentdefinitions_1, bool_2, (byte) 4);
	}

	public static void method486(int i_0, int i_1, int i_2) {
		i_0 <<= 3;
		i_1 <<= 3;
		i_2 <<= 3;
		client.aFloat7146 = (float) i_0;
		client.aFloat7365 = (float) i_1;
		if (NativeLibraryLoader.anInt3240 == 5) {
			Class293.anInt3512 = i_0;
			AnimationDefinitions.anInt5930 = i_1;
			Class121.anInt1525 = i_2;
		}
		IsaacCipher.processCamera();
		client.aBool7371 = true;
	}

	public static void method487(Class116 class116_0, int i_1) {
		Class148.aNode_Sub15_Sub2_1735.method15101((short) 21815);
		Node_Sub15_Sub2 class282_sub15_sub2_3 = class116_0.method1954();
		if (class282_sub15_sub2_3 != null) {
			Class502.aClass253_5830.method4334();
			Class148.aNode_Sub15_Sub2_1735 = class282_sub15_sub2_3;
			Class148.aNode_Sub15_Sub2_1735.method15098(class116_0.method1955(), false, 355198113);
			Class148.aNode_Sub15_Sub2_1735.method15144(i_1, -216399579);
			if (Class502.aClass253_5830 != null) {
				Class502.aClass253_5830.method4329(Class148.aNode_Sub15_Sub2_1735);
			}
			Class332.method5929(692998744);
		}
	}

	static final int method488(int i_0, int i_1, int i_2) {
		return i_1 < 0 ? i_0 : (int) ((double) i_0 * Math.sqrt(1.220703125E-4D * (double) (16384 - i_1)) + 0.5D);
	}
}
