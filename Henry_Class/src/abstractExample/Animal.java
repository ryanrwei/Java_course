package abstractExample;

/*
abstract 跟 一般class 比較:
差異點:
1. 不可以實例化
2. 可以使用abstract: 可以用abstract fn: 也就是一定要是空的內容，裡面不能有東西。

共同點:
1. 可以有data member、fn、constructor: 也可以先定義
2. 都可以繼承(使用extend): 繼承 跟 abstract 是獨立的東西，所以abstract可以運用繼承，不衝突
 */

abstract class Animal {
    int age;

    Animal(int age) {
        this.age = age;
    }

    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}
