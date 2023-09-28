public class Normal extends Ingresso{
        private double valorNormal;

        public Normal(double valor,double valorNormal){
            super(valor);
            this.valorNormal = valorNormal;
        }

        public void setValorNormal(double valorNormal){
            this.valorNormal = valorNormal;
        }

        public double getValorNormal(){
            return valorNormal;
        }

        public void escreveValorNormal(){
            if(valorNormal != super.getValor()) valorNormal= super.getValor();
            System.out.println("Valor do Ingresso Normal: " + valorNormal);
        }

}

