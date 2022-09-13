package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundReturnCorrectString() {
        Cat cat = new Cat(feline);
        String expectedValue = "���";
        String actualValue = cat.getSound();
        Assert.assertEquals("���� �� ������������� ����������.", expectedValue, actualValue);
    }

    @Test
    public void getFoodReturnCorrectListString() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedValue = List.of("��������", "�����", "����");
        Mockito.when(feline.eatMeat()).thenReturn(expectedValue);
        List<String> actualValue = cat.getFood();
        Assert.assertEquals("������ ��� �� ������������� ����������.", expectedValue, actualValue);
    }
}