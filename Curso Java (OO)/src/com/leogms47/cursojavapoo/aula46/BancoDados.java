package com.leogms47.cursojavapoo.aula46;

public interface BancoDados extends SqlDCL, SqlDML, SqlDLL {
    void abrirConexao();
    void fecharConexao();
}
