package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void getFoodHerbivoreReturnCorrectListString() throws Exception {
        Feline feline = new Feline();
        List<String> expectedValue = List.of("�����", "��������� ��������");
        List<String> actualValue = feline.getFood("����������");
        Assert.assertEquals("������ ��� �� ������������� ����������.", expectedValue, actualValue);
    }

    @Test
    public void getFoodPredatorReturnCorrectListString() throws Exception {
        Feline feline = new Feline();
        List<String> expectedValue = List.of("��������", "�����", "����");
        List<String> actualValue = feline.getFood("������");
        Assert.assertEquals("������ ��� �� ������������� ����������.", expectedValue, actualValue);
    }

    @Test
    public void getFoodExceptionReturnCorrectMessage() throws Exception {
        Feline feline = new Feline();
        String expectedValue = "����������� ��� ���������, ����������� �������� ���������� ��� ������";
        Exception exception = null;
        exception = Assert.assertThrows("���������� �� ���� �������, ������� ����������� �����", Exception.class, () -> {
            feline.getFood("");
        });
        String actualValue = exception.getMessage();
        Assert.assertEquals("��������� ���������� �� ������������� ����������.", expectedValue, actualValue);
    }

    @Test
    public void eatMeatReturnCorrectListString() throws Exception {
        Feline feline = new Feline();
        List<String> expectedValue = List.of("��������", "�����", "����");
        List<String> actualValue = feline.eatMeat();
        Assert.assertEquals("������ ��� �� ������������� ����������.", expectedValue, actualValue);
    }

    @Test
    public void getFamilyReturnCorrectString() {
        Feline feline = new Feline();
        String expectedValue = "�������";
        String actualValue = feline.getFamily();
        Assert.assertEquals("��������� �� ������������� ����������.", expectedValue, actualValue);
    }

    @Test
    public void getKittensWithoutParametrReturnIntOne() {
        Feline feline = new Feline();
        int expectedValue = 1;
        int actualValue = feline.getKittens();
        Assert.assertEquals("���������� ����� �� ������������� ����������.", expectedValue, actualValue);
    }


}