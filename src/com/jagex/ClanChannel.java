package com.jagex;

import java.util.BitSet;

public class ClanChannel extends Node {

    static {
        new BitSet(65536);
    }

    public int numPlayers;
    public String clanName;
    public ClanChannelPlayer[] players;
    public byte minRankToKick;
    public byte guestsTalk;
    boolean namesAsString = true;
    int[] sortedNameIndices;
    boolean namesAsLong;
    long nextUpdateNumber;

    public ClanChannel(Packet buffer) {
        decode(buffer);
    }

    public static void method12114(int i_0) {
        if (i_0 == 37) {
            Class291_Sub1.aFloat3462 = 3.0F;
        } else if (i_0 == 50) {
            Class291_Sub1.aFloat3462 = 4.0F;
        } else if (i_0 == 75) {
            Class291_Sub1.aFloat3462 = 6.0F;
        } else if (i_0 == 100) {
            Class291_Sub1.aFloat3462 = 8.0F;
        } else if (i_0 == 200) {
            Class291_Sub1.aFloat3462 = 16.0F;
        }
        Class291_Sub1.anInt8016 = -1;
        Class291_Sub1.anInt8016 = -1;
    }

    static void method12117(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        if (i_0 == i_2 && i_3 == i_1 && i_4 == i_6 && i_5 == i_7) {
            AnimationIndexLoader.method11220(i_0, i_1, i_6, i_7, i_8);
        } else {
            int i_10 = i_0;
            int i_11 = i_1;
            int i_12 = i_0 * 3;
            int i_13 = i_1 * 3;
            int i_14 = i_2 * 3;
            int i_15 = i_3 * 3;
            int i_16 = i_4 * 3;
            int i_17 = i_5 * 3;
            int i_18 = i_6 - i_16 + i_14 - i_0;
            int i_19 = i_15 + (i_7 - i_17) - i_1;
            int i_20 = i_12 + (i_16 - i_14 - i_14);
            int i_21 = i_13 + (i_17 - i_15 - i_15);
            int i_22 = i_14 - i_12;
            int i_23 = i_15 - i_13;
            for (int i_24 = 128; i_24 <= 4096; i_24 += 128) {
                int i_25 = i_24 * i_24 >> 12;
                int i_26 = i_25 * i_24 >> 12;
                int i_27 = i_18 * i_26;
                int i_28 = i_26 * i_19;
                int i_29 = i_20 * i_25;
                int i_30 = i_25 * i_21;
                int i_31 = i_24 * i_22;
                int i_32 = i_24 * i_23;
                int i_33 = i_0 + (i_29 + i_27 + i_31 >> 12);
                int i_34 = (i_28 + i_30 + i_32 >> 12) + i_1;
                AnimationIndexLoader.method11220(i_10, i_11, i_33, i_34, i_8);
                i_10 = i_33;
                i_11 = i_34;
            }
        }
    }

    public int[] getSortedPlayersByName() {
        if (sortedNameIndices == null) {
            String[] playerNames = new String[numPlayers];
            sortedNameIndices = new int[numPlayers];
            for (int i_3 = 0; i_3 < numPlayers; sortedNameIndices[i_3] = i_3++) {
                playerNames[i_3] = players[i_3].name;
            }
            Class111.toSortedIndicesArr(playerNames, sortedNameIndices);
        }
        return sortedNameIndices;
    }

    void method12096(int i_1) {
        --numPlayers;
        if (numPlayers == 0) {
            players = null;
        } else {
            Class503.method8359(players, i_1 + 1, players, i_1, numPlayers - i_1);
        }
        sortedNameIndices = null;
    }

    public int getUserSlot(String string_1) {
        for (int i_3 = 0; i_3 < numPlayers; i_3++) {
            if (players[i_3].name.equalsIgnoreCase(string_1)) {
                return i_3;
            }
        }
        return -1;
    }

    void decode(Packet buffer) {
        int nameTypeFlag = buffer.readUnsignedByte();
        if ((nameTypeFlag & 0x1) != 0) {
            namesAsLong = true;
        }
        if ((nameTypeFlag & 0x2) != 0) {
            namesAsString = true;
        }
        pointer = buffer.readLong();
        nextUpdateNumber = buffer.readLong();
        clanName = buffer.readString();
        buffer.readUnsignedByte();
        minRankToKick = buffer.readByte();
        guestsTalk = buffer.readByte();
        numPlayers = buffer.readUnsignedShort();
        if (numPlayers > 0) {
            players = new ClanChannelPlayer[numPlayers];
            for (int i_4 = 0; i_4 < numPlayers; i_4++) {
                ClanChannelPlayer player = new ClanChannelPlayer();
                if (namesAsLong) {
                    buffer.readLong();
                }
                if (namesAsString) {
                    player.name = buffer.readString();
                }
                player.rank = buffer.readByte();
                player.world = buffer.readUnsignedShort();
                players[i_4] = player;
            }
        }
    }

    void method12105(ClanChannelPlayer class57_1) {
        if (players == null || numPlayers >= players.length) {
            method12112(numPlayers + 5);
        }
        players[++numPlayers - 1] = class57_1;
        sortedNameIndices = null;
    }

    void method12112(int i_1) {
        if (players != null) {
            Class503.method8359(players, 0, players = new ClanChannelPlayer[i_1], 0, numPlayers);
        } else {
            players = new ClanChannelPlayer[i_1];
        }
    }
}
