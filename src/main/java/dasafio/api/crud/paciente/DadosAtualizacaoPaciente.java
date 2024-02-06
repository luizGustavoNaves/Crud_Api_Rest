package dasafio.api.crud.paciente;

import dasafio.api.crud.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        @Email String email,
        @Valid DadosEndereco endereco
) {

}
