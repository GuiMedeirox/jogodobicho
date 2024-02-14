package com.bicho.jogodobicho.enums;

public enum Grupo {
    G1(1, "AVESTRUZ"),
    G2(2, "AGUIA"),
    G3(3, "BURRO"),
    G4(4, "BORBOLETA"),
    G5(5, "CACHORRO"),
    G6(6,  "CABRA"),
    G7(7, "CARNEIRO"),
    G8(8 , "CAMELO"),
    G9(9, "COBRA"),
    G10(10, "COELHO"),
    G11(11, "CAVALO"),
    G12(12, "ELEFANTE"),
    G13(13, "GALO"),
    G14(14, "GATO"),
    G15(15, "JACARE"),
    G16(16, "LEAO"),
    G17(17, "MACACO"),
    G18(18, "PORCO"),
    G19(19, "PAVAO"),
    G20(20, "PERU"),
    G21(21, "TOURO"),
    G22(22, "TIGRE"),
    G23(23, "URSO"),
    G24(24, "VEADO"),
    G25(25, "VACA");
    private int grupoNumero;
    private String grupoAnimal;
    private Grupo(int grupo, String animal){
        this.grupoNumero = grupo;
        this.grupoAnimal = animal;
    }
}
