package br.com.xp.xp_desafio.model;


import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    @Column(name = "NM_ENDERECO")
    private String nomeEndereco;

    @Column(name = "NM_COMPLEMENTO")
    private String complemento;

    @Column(name = "CD_CEP")
    private Integer cep;
}
