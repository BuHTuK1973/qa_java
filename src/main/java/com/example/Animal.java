package com.example;

import java.util.List;

public class Animal {

    public List<String> getFood(String animalKind) throws Exception {
        if ("����������".equals(animalKind)) {
            return List.of("�����", "��������� ��������");
        } else if ("������".equals(animalKind)) {
            return List.of("��������", "�����", "����");
        } else {
            throw new Exception("����������� ��� ���������, ����������� �������� ���������� ��� ������");
        }
    }

    public String getFamily() {
        return "���������� ��������� ��������: ������, �������, �������, �������, ������, ��������, �����";
    }
}