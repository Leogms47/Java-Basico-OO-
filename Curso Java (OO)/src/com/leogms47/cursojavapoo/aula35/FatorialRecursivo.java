package com.leogms47.cursojavapoo.aula35;

public class FatorialRecursivo {
    public int fatorial(int num){
        if(num == 0){
            return 1;
        }
        return num * fatorial(num - 1);
    }
}
