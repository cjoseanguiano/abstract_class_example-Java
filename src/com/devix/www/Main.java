package com.devix.www;

public class Main {

    public static void main(String[] args) {
//Java program that uses abstract class

        Page page1 = new Article();
        page1.open();

        Page page2 = new Post();
        page2.open();
    }

}

abstract class Page {
    public abstract void open();
}

class Article extends Page {

    @Override
    public void open() {
        System.out.println("Article.open");
    }
}

class Post extends Page {

    @Override
    public void open() {
        System.out.println("Post.open");
    }
}
