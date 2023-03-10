package com.example.slovarsluha;

import com.example.slovarsluha.model.Category;
import com.example.slovarsluha.model.CategoryItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {
    public static List<CategoryItems> natureList = new ArrayList<CategoryItems>(
            Arrays.asList(new CategoryItems(1, "ГРОМ/МОЛНИЯ/ГРОЗА", "Погода испортилась. Появились тучи. Пошёл сильный дождь. Гремел гром. Сверкала молния. \n" +
                    "Марина очень испугалась.\n", "Не пугайся грома, молнии, грозы. Они громкие, но бояться их не надо. Будь осторожен, не подходи близко. Бери зонт.", "0"))
    );

    public static List<CategoryItems> animalsList = new ArrayList<CategoryItems>(
            Arrays.asList(new CategoryItems(1, "СОБАКА", "Саша идёт по улице, видит собаку. Собака начинает лаять. Саша не знает, что делать. Он боится.", "Если увидел собаку со взрослым или одну, не подходи, не трогай руками. \n" +
                    "Лучше держишь дальше, обходи с другой стороны дороги.\n", "2"))
    );

    public static List<CategoryItems> transportList = new ArrayList<CategoryItems>(
            Arrays.asList(
                    new CategoryItems(1, "МАШИНА/ТРАМВАЙ/ТРОЛЛЕЙБУС/АВТОБУС", "Люда идёт по улице. Люда не видит машины, которая едет (трамвая, троллейбуса, автобуса), которая(ый) подаёт сигнал тормоза\n" +
                            "Люда очень испугалась.\n", "Всегда смотри на левую и правую сторону дороги. Если стоит светофор, дождись зелёного света.", "1"),


                    new CategoryItems(2, "САМОЛЁТ", "Дима гулял на улице вместе с папой. Дима посмотрел на небо. Увидел объект в небе. Он был большим и железным. Дима испугался. Папа объяснил, что это был самолёт.", "Не нужно пугаться самолетов. Они большие, но они очень нужно людям. Самолёты помогают взрослым и детям посещать разные страны и города.", "3"),


                    new CategoryItems(3, "МЕТРО/ВАГОН/ПОЕЗД", "Аня с сестрой спустились в метро. Собиралось много людей. Аню пугает темнота из окон. Она начинает сильно волноваться.", "Метро-это вид транспорта, который довозит людей до нужных мест. Темнота из-за туннеля, по которому едет вагон. Боятся не нужно, метро приносит пользу людям.", "4")
            )
    );

    public static List<CategoryItems> piroList = new ArrayList<CategoryItems>(
            Arrays.asList(new CategoryItems(1, "ПИРОТЕХНИКА", "Наташа с мамой вышли на улицу. Было темно. На небе появились искры. Искры были разных цветов. Наташа очень испугалась.", "Это салют. Салюта бояться не надо, он для радости. Люди запускают салюты в небо для красоты.", "5"))
    );



}
