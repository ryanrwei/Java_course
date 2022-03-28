package InterfaceExample;

/*
Interface 跟 一般class 比較:
差異點:
1. Interface 不可以實例化
2. Interface 不可以使用 constructor
3. Interface 可以多重繼承（但關鍵字必須用 implements,使用逗點隔開多個介面）
5. Interface 只能使用 abstract function，且預設是 public 且 abstract
5. 總而言之， Interface 是必須完全 abstract 的，也就是所有東西都不能先被定義(除了 data member)

共同點:
1. 可以有data member， 但Interface 的 data member 一定要先定義
2. 都可以繼承(Interface 使用 implements): 繼承 跟 Interface 是獨立的東西，所以 Interface 可以運用繼承，不衝突
 */


public interface Animal {
    int age = 0;

    public abstract void animalSound();
    void animalStep();
//    public void sleep() {
//        System.out.println("Zzz");
//    }
}
