package dasafio.api.crud.paciente;

public record DadosDetalhamentoPaciente(Long ind, String nome , String email, String cpf) {
    public DadosDetalhamentoPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
}
