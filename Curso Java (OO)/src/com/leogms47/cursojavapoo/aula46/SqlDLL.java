package com.leogms47.cursojavapoo.aula46;

public interface SqlDLL {
    void create(String query);
    void drop(String query);
    void alter(String query);
}
