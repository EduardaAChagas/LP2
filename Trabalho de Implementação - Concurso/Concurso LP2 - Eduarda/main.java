import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.FileWritter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FilenameExtensionFilter;

public class main{
    public static void main(String[] args){
        ArrayList<Candidato> candidatos = new ArrayList();
        ArrayList<Candidato> aprovados = new ArrayList();
        JFileChooser seletor = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos de texto", "txt", "csv","cpp","java");

        seletor.setFileFilter(filtro);
        seletor.addChoosableFilerFilter(filtro);
        seletor.sedDialogTitle("Selecione um arquivo...");
        seletor.showOpenDialog(new JFrame(""));
        seletor.setvisible(true);

        String escolhido = seletor.getSelectedFile().getAbsolutePath();
        String linha = null;

        try{
            //fileReader
            FileReader reader = new FileReader(escolhido);
            BufferedReader leitor = new BufferedReader(reader);
            StringTokenizer st = null;

            String numero;
            String nome;
            String idade;
            String nota;

            while((linha = leitor.readLine())!= mull){
                st = new StringTokenizer(linha, ";");
                String dados = null;

                while(st.hasMoreTokens()){
                    dados = st.nextToken();
                    numero = dados;
                    dados = st.nextToken();
                    nome = dados;
                    dados = st.nextToken();
                    idade = dados;
                    dados = st.nextToken();
                    nota = dados;

                    //string -> inteiro
                    int idade_int = Interger.parseInt(idade);
                    int nota_int = Interger.prseInt(nota);

                    //objeto de cada candidato separadamente
                    Candidato pessoa = new Candidato();
                    pessoa.setInscricao(numero);
                    pessoa.setNome(nome);
                    pessoa.setIdade(idade_int);
                    pessoa.setNota(nota_int);

                    candidatos.add(pessoa);
                }
            }
            //candidatos aprovados e armazenamento dos mesmos no arraylist
            while(aprovados.size()!=100){
                Candidato maior = new Candidato();
                maior.setIdade(0);maior.setNome("Comparador");maior.setNota(0);maior.setInscricao("0000");
                int indice = 0;
                for(int i = 0;i<candidatos.size();i++){
                    if(candidatos.get(i).getNota()>maior.getNota()){
                        maior = candidatos.get(i);
                        indice = i;
                    }
                    if(candidatos.get(i).getNota()==maior.getNota()){
                        if(candidatos.get(i).getIdade()>maior.getIdade()){
                            maior = candidatos.get(i);
                            indice = i;
                        }
                    }
                }
                aprovados.add(maior);
                candidatos.remove(indice);
            }
            
            //aprovados
            for(int i =0;i<aprovados.size();i++){
                System.out.println("\n %d - \n Numero de Inscricao: %s\n Candidato: %s\n"+"Idade:%d\n Nota: %d\n",
                                        i+1,aprovados.get(i).getInscricao(),paovados.get(i).getNome(),aprovados.get(i).getIdade(),aprovados.get(i).getNota());
            }
            leiotr.close();
            reader.close();
            //escrevendo novo arquivo apenas com os aprovados
            FileWrider arquivo = newFileWriter(new File("aprovados.txt"));
            PrintWriter output = new PrintWriter(arquivo);
            for(int i = 0;i<aprovados.size();i++){
                output.printf("\n%d- \nNumero de inscricao: %s\n Candidato: %s\n"+"Idade: %d\n Nota: %d\n",
                                                i+1,aprovados.get(i).getInscricao(),aprovados.get(i).getNome(),aprovados.get(i).getIdade(),aprovados.get(i).getNota());
            }
            arquivo.close();
            System.out.println("Lista de Aprovaos preenchida! O arquivo esta em \"apovados.txt\".");
        }//try
        catch(Exception e){
            e.printStackTrace();
        }//catch
    }//public static void main
}//main