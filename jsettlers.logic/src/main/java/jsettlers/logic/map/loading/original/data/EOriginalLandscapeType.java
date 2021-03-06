/*******************************************************************************
 * Copyright (c) 2015 - 2017
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *******************************************************************************/
package jsettlers.logic.map.loading.original.data;

import jsettlers.common.landscape.ELandscapeType;

/**
 * The landscape types for the map
 * @author Thomas Zeugner
 * @author codingberlin
 */
public enum EOriginalLandscapeType {
	WATER1(ELandscapeType.WATER1), // - value = 0x00
	WATER2(ELandscapeType.WATER2), // - value = 0x01
	WATER3(ELandscapeType.WATER3),
	WATER4(ELandscapeType.WATER4),
	WATER5(ELandscapeType.WATER5),
	WATER6(ELandscapeType.WATER6),
	WATER7(ELandscapeType.WATER7),
	WATER8(ELandscapeType.WATER8),
	UNKNOWN_08(null),
	UNKNOWN_09(null),
	UNKNOWN_0A(null),
	UNKNOWN_0B(null),
	UNKNOWN_0C(null),
	UNKNOWN_0D(null),
	UNKNOWN_0E(null),
	UNKNOWN_0F(null),
	GRASS(ELandscapeType.GRASS),
	MOUNTAINBORDEROUTER(ELandscapeType.MOUNTAINBORDEROUTER),
	UNKNOWN_12(null),
	UNKNOWN_13(null),
	DESERTBORDEROUTER(ELandscapeType.DESERTBORDEROUTER),
	MOORBORDER(ELandscapeType.MOORBORDER),
	UNKNOWN_16(null),
	MUDBORDER(ELandscapeType.MUDBORDER),
	UNKNOWN_18(null),
	UNKNOWN_19(null),
	UNKNOWN_1A(null),
	UNKNOWN_1B(null),
	UNKNOWN_1C(null),
	UNKNOWN_1D(null),
	UNKNOWN_1E(null),
	UNKNOWN_1F(null),
	MOUNTAIN(ELandscapeType.MOUNTAIN),
	MOUNTAINBORDER(ELandscapeType.MOUNTAINBORDER),
	UNKNOWN_22(null),
	SNOWBORDER(ELandscapeType.SNOWBORDER),
	UNKNOWN_24(null),
	UNKNOWN_25(null),
	UNKNOWN_26(null),
	UNKNOWN_27(null),
	UNKNOWN_28(null),
	UNKNOWN_29(null),
	UNKNOWN_2A(null),
	UNKNOWN_2B(null),
	UNKNOWN_2C(null),
	UNKNOWN_2D(null),
	UNKNOWN_2E(null),
	UNKNOWN_2F(null),
	SAND(ELandscapeType.SAND),
	UNKNOWN_31(null),
	UNKNOWN_32(null),
	UNKNOWN_33(null),
	UNKNOWN_34(null),
	UNKNOWN_35(null),
	UNKNOWN_36(null),
	UNKNOWN_37(null),
	UNKNOWN_38(null),
	UNKNOWN_39(null),
	UNKNOWN_3A(null),
	UNKNOWN_3B(null),
	UNKNOWN_3C(null),
	UNKNOWN_3D(null),
	UNKNOWN_3E(null),
	UNKNOWN_3F(null),
	DESERT(ELandscapeType.DESERT),
	DESERTBORDER(ELandscapeType.DESERTBORDER),
	UNKNOWN_42(null),
	UNKNOWN_43(null),
	UNKNOWN_44(null),
	UNKNOWN_45(null),
	UNKNOWN_46(null),
	UNKNOWN_47(null),
	UNKNOWN_48(null),
	UNKNOWN_49(null),
	UNKNOWN_4A(null),
	UNKNOWN_4B(null),
	UNKNOWN_4C(null),
	UNKNOWN_4D(null),
	UNKNOWN_4E(null),
	UNKNOWN_4F(null),
	MOORINNER(ELandscapeType.MOORINNER),
	MOOR(ELandscapeType.MOOR),
	UNKNOWN_52(null),
	UNKNOWN_53(null),
	UNKNOWN_54(null),
	UNKNOWN_55(null),
	UNKNOWN_56(null),
	UNKNOWN_57(null),
	UNKNOWN_58(null),
	UNKNOWN_59(null),
	UNKNOWN_5A(null),
	UNKNOWN_5B(null),
	UNKNOWN_5C(null),
	UNKNOWN_5D(null),
	UNKNOWN_5E(null),
	UNKNOWN_5F(null),
	RIVER1(ELandscapeType.RIVER1),
	RIVER2(ELandscapeType.RIVER2),
	RIVER3(ELandscapeType.RIVER3),
	RIVER4(ELandscapeType.RIVER4),
	UNKNOWN_64(null),
	UNKNOWN_65(null),
	UNKNOWN_66(null),
	UNKNOWN_67(null),
	UNKNOWN_68(null),
	UNKNOWN_69(null),
	UNKNOWN_6A(null),
	UNKNOWN_6B(null),
	UNKNOWN_6C(null),
	UNKNOWN_6D(null),
	UNKNOWN_6E(null),
	UNKNOWN_6F(null),
	UNKNOWN_70(null),
	UNKNOWN_71(null),
	UNKNOWN_72(null),
	UNKNOWN_73(null),
	UNKNOWN_74(null),
	UNKNOWN_75(null),
	UNKNOWN_76(null),
	UNKNOWN_77(null),
	UNKNOWN_78(null),
	UNKNOWN_79(null),
	UNKNOWN_7A(null),
	UNKNOWN_7B(null),
	UNKNOWN_7C(null),
	UNKNOWN_7D(null),
	UNKNOWN_7E(null),
	UNKNOWN_7F(null),
	SNOWINNER(ELandscapeType.SNOWINNER),
	SNOW(ELandscapeType.SNOW),
	UNKNOWN_82(null),
	UNKNOWN_83(null),
	UNKNOWN_84(null),
	UNKNOWN_85(null),
	UNKNOWN_86(null),
	UNKNOWN_87(null),
	UNKNOWN_88(null),
	UNKNOWN_89(null),
	UNKNOWN_8A(null),
	UNKNOWN_8B(null),
	UNKNOWN_8C(null),
	UNKNOWN_8D(null),
	UNKNOWN_8E(null),
	UNKNOWN_8F(null),
	MUDINNER(ELandscapeType.MUDINNER),
	MUD(ELandscapeType.MUD),
	UNKNOWN_92(null),
	UNKNOWN_93(null),
	UNKNOWN_94(null),
	UNKNOWN_95(null),
	UNKNOWN_96(null),
	UNKNOWN_97(null),
	UNKNOWN_98(null),
	UNKNOWN_99(null),
	UNKNOWN_9A(null),
	UNKNOWN_9B(null),
	UNKNOWN_9C(null),
	UNKNOWN_9D(null),
	UNKNOWN_9E(null),
	UNKNOWN_9F(null),
	UNKNOWN_A0(null),
	UNKNOWN_A1(null),
	UNKNOWN_A2(null),
	UNKNOWN_A3(null),
	UNKNOWN_A4(null),
	UNKNOWN_A5(null),
	UNKNOWN_A6(null),
	UNKNOWN_A7(null),
	UNKNOWN_A8(null),
	UNKNOWN_A9(null),
	UNKNOWN_AA(null),
	UNKNOWN_AB(null),
	UNKNOWN_AC(null),
	UNKNOWN_AD(null),
	UNKNOWN_AE(null),
	UNKNOWN_AF(null),
	UNKNOWN_B0(null),
	UNKNOWN_B1(null),
	UNKNOWN_B2(null),
	UNKNOWN_B3(null),
	UNKNOWN_B4(null),
	UNKNOWN_B5(null),
	UNKNOWN_B6(null),
	UNKNOWN_B7(null),
	UNKNOWN_B8(null),
	UNKNOWN_B9(null),
	UNKNOWN_BA(null),
	UNKNOWN_BB(null),
	UNKNOWN_BC(null),
	UNKNOWN_BD(null),
	UNKNOWN_BE(null),
	UNKNOWN_BF(null),
	UNKNOWN_C0(null),
	UNKNOWN_C1(null),
	UNKNOWN_C2(null),
	UNKNOWN_C3(null),
	UNKNOWN_C4(null),
	UNKNOWN_C5(null),
	UNKNOWN_C6(null),
	UNKNOWN_C7(null),
	UNKNOWN_C8(null),
	UNKNOWN_C9(null),
	UNKNOWN_CA(null),
	UNKNOWN_CB(null),
	UNKNOWN_CC(null),
	UNKNOWN_CD(null),
	UNKNOWN_CE(null),
	UNKNOWN_CF(null),
	UNKNOWN_D0(null),
	UNKNOWN_D1(null),
	UNKNOWN_D2(null),
	UNKNOWN_D3(null),
	UNKNOWN_D4(null),
	UNKNOWN_D5(null),
	UNKNOWN_D6(null),
	UNKNOWN_D7(null),
	UNKNOWN_D8(null),
	UNKNOWN_D9(null),
	UNKNOWN_DA(null),
	UNKNOWN_DB(null),
	UNKNOWN_DC(null),
	UNKNOWN_DD(null),
	UNKNOWN_DE(null),
	UNKNOWN_DF(null),
	UNKNOWN_E0(null),
	UNKNOWN_E1(null),
	UNKNOWN_E2(null),
	UNKNOWN_E3(null),
	UNKNOWN_E4(null),
	UNKNOWN_E5(null),
	UNKNOWN_E6(null),
	UNKNOWN_E7(null),
	UNKNOWN_E8(null),
	UNKNOWN_E9(null),
	UNKNOWN_EA(null),
	UNKNOWN_EB(null),
	UNKNOWN_EC(null),
	UNKNOWN_ED(null),
	UNKNOWN_EE(null),
	UNKNOWN_EF(null),
	UNKNOWN_F0(null),
	UNKNOWN_F1(null),
	UNKNOWN_F2(null),
	UNKNOWN_F3(null),
	UNKNOWN_F4(null),
	UNKNOWN_F5(null),
	UNKNOWN_F6(null),
	UNKNOWN_F7(null),
	UNKNOWN_F8(null),
	UNKNOWN_F9(null),
	UNKNOWN_FA(null),
	UNKNOWN_FB(null),
	UNKNOWN_FC(null),
	UNKNOWN_FD(null),
	UNKNOWN_FE(null),

	NOT_A_TYPE(null); // - has to be the last item

	// - length of THIS enum (without END_OF_LIST)
	private static final EOriginalLandscapeType[] VALUES = EOriginalLandscapeType.values();
	public final ELandscapeType value;

	EOriginalLandscapeType(ELandscapeType value) {
		this.value = value;
	}

	public static EOriginalLandscapeType getTypeByInt(int type) {
		if (type < 0 || type > VALUES.length) {
			return NOT_A_TYPE;
		} else {
			return VALUES[type];
		}
	}
}