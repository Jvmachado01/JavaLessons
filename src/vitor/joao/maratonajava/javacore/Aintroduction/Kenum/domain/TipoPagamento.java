package vitor.joao.maratonajava.javacore.Aintroduction.Kenum.domain;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1; // Desconto 10%
        }
    },
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05; // Desconto 5%
        }
    };

    // Quero um método de desconto baseado no tipo débito e crédito
    // O método abstrato não existe, o que existe é a implementação do método dentro do enum
    // E isso ajuda muito para não ter que ficar usando if.
    // O método abastrato não pode ter corpo.
    public abstract double calcularDesconto(double valor);
    }