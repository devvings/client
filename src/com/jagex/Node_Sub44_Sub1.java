package com.jagex;

public class Node_Sub44_Sub1 extends SubInterface {

    int anInt9460;

    public Node_Sub44_Sub1(int i_1, int i_2, int i_3) {
        super(i_1, i_2);
        anInt9460 = i_3;
    }

    @Override
    public boolean method13401() {
        ObjectNode class282_sub47_2 = (ObjectNode) client.NPC_MAP.get(anInt9460);
        if (class282_sub47_2 != null) {
            AccountCreationStage.method252(ClientTriggerType.aClass397_4799, interfaceId, (PathingEntity) class282_sub47_2.anObject8068, anInt9460);
            return true;
        } else {
            return false;
        }
    }

}
