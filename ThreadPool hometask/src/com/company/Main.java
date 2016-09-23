package com.company;

public class Main {

    public static void main(String[] args) {
	    ThreadPool pool=new ThreadPool(5);
        for (int i = 0; i <10 ; i++) {
            pool.execute(new FirstTask());
        }
    }
}
