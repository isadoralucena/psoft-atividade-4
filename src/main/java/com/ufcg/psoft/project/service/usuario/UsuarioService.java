package com.ufcg.psoft.project.service.usuario;

import com.ufcg.psoft.project.dto.UsuarioPostPutRequestDTO;
import com.ufcg.psoft.project.dto.UsuarioResponseDTO;

import java.util.List;

public interface UsuarioService {

    UsuarioResponseDTO alterar(Long id, String codigoAcesso, UsuarioPostPutRequestDTO usuarioPostPutRequestDTO);

    List<UsuarioResponseDTO> listar();

    UsuarioResponseDTO recuperar(Long id);

    List<UsuarioResponseDTO> recuperarUsuariosPeloNome(String nome);

    List<UsuarioResponseDTO> recuperarUsuariosPeloEndereco(String endereco);

    UsuarioResponseDTO criar(UsuarioPostPutRequestDTO usuarioPostPutRequestDTO);

    void remover(Long id, String codigoAcesso);

}
