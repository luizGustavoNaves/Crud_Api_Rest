package dasafio.api.crud.medico;

import dasafio.api.crud.endereco.DadosEndereco;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        @Email
        String email,
        String telefone,
        DadosEndereco endereco) {

}
