package com.jagex;

public class Node_Sub44_Sub2 extends SubInterface {

    int anInt9482;

    public Node_Sub44_Sub2(int i_1, int i_2, int i_3) {
        super(i_1, i_2);
        anInt9482 = i_3;
    }

    @Override
    public boolean method13401() {
        PlayerEntity player_2 = client.players[anInt9482];
        if (player_2 != null) {
            AccountCreationStage.method252(ClientTriggerType.aClass397_4807, interfaceId, player_2, anInt9482);
            return true;
        } else {
            return false;
        }
    }

}
