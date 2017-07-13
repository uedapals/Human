package jp.techacademy.takuro.ueda.javalog;

/**
 * Created by ueda_palsbots on 2017/07/14.
 */

public class Human extends Animal {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("太郎", 10);

        human.say();
        Log.d("javatest", "私の名前は" + human.name + "です。" + "年は" + human.age + "歳です。");

        String hobby = "散歩";
        System.out.println("私は" + hobby + "について考える");


    }
}
