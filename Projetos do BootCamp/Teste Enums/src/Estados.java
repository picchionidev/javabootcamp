enum EstadoBrasil {
    AC("AC", "Acre"), AL("AL", "Alagoas"), AP("AP", "Amapá"), AM("AM", "Amazonas"), BA("BA", "Bahia"),
    CE("CE", "Ceará"), DF("DF", "Distrito Federal"), ES("ES", "Espírito Santo"), GO("GO", "Goiás"), MA("MA", "Maranhão"),
    MT("MT", "Mato Grosso"), MS("MS", "Mato Grosso do Sul"), MG("MG", "Minas Gerais"), PA("PA", "Pará"), PB("PB", "Paraíba"),
    PR("PR", "Paraná"), PE("PE", "Pernambuco"), PI("PI", "Piauí"), RJ("RJ", "Rio de Janeiro"), RN("RN", "Rio Grande do Norte"),
    RS("RS", "Rio Grande do Sul"), RO("RO", "Rondônia"), RR("RR", "Roraima"), SC("SC", "Santa Catarina"), SP("SP", "São Paulo"),
    SE("SE", "Sergipe"), TO("TO", "Tocantins");

    private String sigla;
    private String nomeCompleto;

    EstadoBrasil(String sigla, String nomeCompleto) {
        this.sigla = sigla;
        this.nomeCompleto = nomeCompleto;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
}