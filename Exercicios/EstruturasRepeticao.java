public class EstruturasRepeticao {
    public static void main(String[] args) {
        int cc = 0;
        while (cc<10){
            cc++;
            if (cc==2||cc==3||cc==4){
                continue; // modificador de fluxo de laço/joga pra dentro do laço
            }
            if(cc==7){
                break; // modificador de fluxo de laço/ joga pra fora do laço
            }
            System.out.println(cc);
        }
    }
}
