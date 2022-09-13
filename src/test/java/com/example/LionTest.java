package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void doesHaveManeMaleReturnCorrectBooleanTrue() throws Exception {
        String sex = "�����";
        Lion lion = new Lion(sex, feline);
        boolean expectedValue = true;
        boolean actualValue = lion.doesHaveMane();
        Assert.assertEquals("Boolean �� ������������� ����������.", expectedValue, actualValue);
    }

    @Test
    public void doesHaveManeFemaleReturnCorrectBooleanFalse() throws Exception {
        String sex = "�����";
        Lion lion = new Lion(sex, feline);
        boolean expectedValue = false;
        boolean actualValue = lion.doesHaveMane();
        Assert.assertEquals("Boolean �� ������������� ����������.", expectedValue, actualValue);
    }

    @Test
    public void getKittensReturnCorrectInt() throws Exception {
        String sex = "�����";
        Lion lion = new Lion(sex, feline);
        int expectedValue = 1;
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualValue = lion.getKittens();
        Assert.assertEquals("���������� ����� �� ������������� ����������.", expectedValue, actualValue);
    }

    @Test
    public void getFoodReturnCorrectInt() throws Exception {
        String sex = "�����";
        Lion lion = new Lion(sex, feline);
        List<String> expectedValue = List.of("��������", "�����", "����");
        Mockito.when(feline.getFood("������")).thenReturn(List.of("��������", "�����", "����"));
        List<String> actualValue = lion.getFood();
        Assert.assertEquals("������ ��� �� ������������� ����������.", expectedValue, actualValue);
    }
}