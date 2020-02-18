package com.jagex;

public class ImageIndexLoader implements Interface22 {

    Class223 aClass223_3754 = new Class223(256);

    Index textureIndex;

    Index spriteIndex;

    int textureDefSize;

    TextureDetails[] textures;

    public ImageIndexLoader(Index textureDefIndex, Index textureIndex, Index spriteIndex) {
        this.textureIndex = textureIndex;
        this.spriteIndex = spriteIndex;
        Packet stream = new Packet(textureDefIndex.getFile(0, 0));
        textureDefSize = stream.readUnsignedShort();
        textures = new TextureDetails[textureDefSize];
        int i_5;
        for (i_5 = 0; i_5 < textureDefSize; i_5++) {
            if (stream.readUnsignedByte() == 1) {
                textures[i_5] = new TextureDetails();
            }
        }
        for (i_5 = 0; i_5 < textureDefSize; i_5++) {
            if (textures[i_5] != null) {
                textures[i_5].isGroundMesh = stream.readUnsignedByte() == 0;
            }
        }
        for (i_5 = 0; i_5 < textureDefSize; i_5++) {
            if (textures[i_5] != null) {
                textures[i_5].isHalfSize = stream.readUnsignedByte() == 1;
            }
        }
        for (i_5 = 0; i_5 < textureDefSize; i_5++) {
            if (textures[i_5] != null) {
                textures[i_5].skipTriangles = stream.readUnsignedByte() == 1;
            }
        }
        for (i_5 = 0; i_5 < textureDefSize; i_5++) {
            if (textures[i_5] != null) {
                textures[i_5].brightness = stream.readByte();
            }
        }
        for (i_5 = 0; i_5 < textureDefSize; i_5++) {
            if (textures[i_5] != null) {
                textures[i_5].shadowFactor = stream.readByte();
            }
        }
        for (i_5 = 0; i_5 < textureDefSize; i_5++) {
            if (textures[i_5] != null) {
                textures[i_5].effectId = stream.readByte();
            }
        }
        for (i_5 = 0; i_5 < textureDefSize; i_5++) {
            if (textures[i_5] != null) {
                textures[i_5].effectParam1 = stream.readByte();
            }
        }
        for (i_5 = 0; i_5 < textureDefSize; i_5++) {
            if (textures[i_5] != null) {
                textures[i_5].color = (short) stream.readUnsignedShort();
            }
        }
        for (i_5 = 0; i_5 < textureDefSize; i_5++) {
            if (textures[i_5] != null) {
                textures[i_5].textureSpeedU = stream.readByte();
            }
        }
        for (i_5 = 0; i_5 < textureDefSize; i_5++) {
            if (textures[i_5] != null) {
                textures[i_5].textureSpeedV = stream.readByte();
            }
        }
        for (i_5 = 0; i_5 < textureDefSize; i_5++) {
            if (textures[i_5] != null) {
                textures[i_5].aBool2087 = stream.readUnsignedByte() == 1;
            }
        }
        for (i_5 = 0; i_5 < textureDefSize; i_5++) {
            if (textures[i_5] != null) {
                textures[i_5].isBrickTile = stream.readUnsignedByte() == 1;
            }
        }
        for (i_5 = 0; i_5 < textureDefSize; i_5++) {
            if (textures[i_5] != null) {
                textures[i_5].useMipmaps = stream.readByte();
            }
        }
        for (i_5 = 0; i_5 < textureDefSize; i_5++) {
            if (textures[i_5] != null) {
                textures[i_5].repeatS = stream.readUnsignedByte() == 1;
            }
        }
        for (i_5 = 0; i_5 < textureDefSize; i_5++) {
            if (textures[i_5] != null) {
                textures[i_5].repeatT = stream.readUnsignedByte() == 1;
            }
        }
        for (i_5 = 0; i_5 < textureDefSize; i_5++) {
            if (textures[i_5] != null) {
                textures[i_5].hdr = stream.readUnsignedByte() == 1;
            }
        }
        for (i_5 = 0; i_5 < textureDefSize; i_5++) {
            if (textures[i_5] != null) {
                textures[i_5].combineMode = stream.readUnsignedByte();
            }
        }
        for (i_5 = 0; i_5 < textureDefSize; i_5++) {
            if (textures[i_5] != null) {
                textures[i_5].effectParam2 = stream.readInt();
            }
        }
        for (i_5 = 0; i_5 < textureDefSize; i_5++) {
            if (textures[i_5] != null) {
                textures[i_5].blendType = stream.readUnsignedByte();
            }
        }
    }

    public static int method5773(int i_0, int i_1) {
        int i_3 = i_1 >>> 24;
        int i_4 = 255 - i_3;
        i_1 = (i_3 * (i_1 & 0xff00ff) & -16711936 | i_3 * (i_1 & 0xff00) & 0xff0000) >>> 8;
        return ((i_4 * (i_0 & 0xff00ff) & -16711936 | (i_0 & 0xff00) * i_4 & 0xff0000) >>> 8) + i_1;
    }

    static void method5777() {
        if (Engine.AVAILABLE_PROCESSORS > 1) {
            Class393.preferences.setValue(Class393.preferences.cpu, 4);
        } else {
            Class393.preferences.setValue(Class393.preferences.cpu, 2);
        }
    }

    TextureDefinition method5770(int i_1) {
        CacheableNode cacheablenode_3 = aClass223_3754.get(i_1);
        if (cacheablenode_3 != null) {
            return (TextureDefinition) cacheablenode_3;
        } else {
            byte[] bytes_4 = textureIndex.getFile(i_1);
            if (bytes_4 == null) {
                return null;
            } else {
                TextureDefinition texturedefinition_5 = new TextureDefinition(new Packet(bytes_4));
                aClass223_3754.put(texturedefinition_5, i_1);
                return texturedefinition_5;
            }
        }
    }

    @Override
    public int method84() {
        return textureDefSize;
    }

    @Override
    public TextureDetails method144(int i_1) {
        return textures[i_1];
    }

    @Override
    public void method161() {
    }

    @Override
    public int[] method141(int i_1, int i_3, int i_4) {
        int[] ints_7 = method5770(i_1).method14719(spriteIndex, this, (float) 0.7, i_3, i_4, textures[i_1].isBrickTile);
        return ints_7;
    }

    @Override
    public float[] method145(int i_1, int i_3, int i_4) {
        float[] floats_7 = method5770(i_1).method14723(spriteIndex, this, i_3, i_4, textures[i_1].isBrickTile);
        return floats_7;
    }

    @Override
    public boolean method139(int i_1) {
        TextureDefinition texturedefinition_3 = method5770(i_1);
        return texturedefinition_3 != null && texturedefinition_3.method14717(spriteIndex, this);
    }

    @Override
    public int[] method140(int i_1, float f_2, int i_3, int i_4, boolean bool_5) {
        int[] ints_7 = method5770(i_1).method14718(spriteIndex, this, f_2, i_3, i_4, bool_5, textures[i_1].isBrickTile);
        return ints_7;
    }

}
