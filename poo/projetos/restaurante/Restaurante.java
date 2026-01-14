import java.util.ArrayList;


public class Restaurante {
    
    private String nome;
    private String endereco;
    private String cnpj;
    private int telefone;

    private ArrayList<Mesa> conjuntoMesa;
    
    public Restaurante(String nome, String endereco, String cnpj, int telefone) {
        setNome(nome);
        setEndereco(endereco);
        setCnpj(cnpj);
        setTelefone(telefone);
    
        conjuntoMesa = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            conjuntoMesa.add(new Mesa(i+1));
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
  
    public void acomodarPessoas(int numeroMesa, int qtdPessoas) {
        switch (numeroMesa) {
            case 1:
                conjuntoMesa.get(numeroMesa).acomodarPessoas(qtdPessoas);
                break;
            case 2:
                conjuntoMesa.get(numeroMesa).acomodarPessoas(qtdPessoas);
                break;
            case 3:
                conjuntoMesa.get(numeroMesa).acomodarPessoas(qtdPessoas);
                break;
            case 4:
                conjuntoMesa.get(numeroMesa).acomodarPessoas(qtdPessoas);
                break;
            case 5:
                conjuntoMesa.get(numeroMesa).acomodarPessoas(qtdPessoas);
                break;
            case 6:
                conjuntoMesa.get(numeroMesa).acomodarPessoas(qtdPessoas);
                break;
            case 7:
                conjuntoMesa.get(numeroMesa).acomodarPessoas(qtdPessoas);
                break;
            case 8:
                conjuntoMesa.get(numeroMesa).acomodarPessoas(qtdPessoas);
                break;
            case 9:
                conjuntoMesa.get(numeroMesa).acomodarPessoas(qtdPessoas);
                break;
            case 10:
                conjuntoMesa.get(numeroMesa).acomodarPessoas(qtdPessoas);
                break;
            default:
                System.out.println("Mesa inválida!");
        }
    }
    
    public void adicionarPedido(int numeroMesa, double valor) {
        
        switch (numeroMesa) {
            
            case 1:
                conjuntoMesa.get(numeroMesa).adicionarPedido(valor);
                break;
                
            case 2:
                conjuntoMesa.get(numeroMesa).adicionarPedido(valor);
                break;
                
            case 3:
                conjuntoMesa.get(numeroMesa).adicionarPedido(valor);
                break;
                
            case 4: 
                conjuntoMesa.get(numeroMesa).adicionarPedido(valor); 
                break;
            
            case 5: 
                conjuntoMesa.get(numeroMesa).adicionarPedido(valor); 
                break;
            
            case 6: 
                conjuntoMesa.get(numeroMesa).adicionarPedido(valor); 
                break;
            
            case 7: 
                conjuntoMesa.get(numeroMesa).adicionarPedido(valor); 
                break;
            
            case 8: 
                conjuntoMesa.get(numeroMesa).adicionarPedido(valor); 
                break;
            
            case 9: 
                conjuntoMesa.get(numeroMesa).adicionarPedido(valor); 
                break;
            
            case 10: 
                conjuntoMesa.get(numeroMesa).adicionarPedido(valor); 
                break;
            
            default: System.out.println("Mesa inválida!");    
                
        }
    }
        
        public void fecharConta(int numeroMesa) {
        switch (numeroMesa) {
            case 1:
                conjuntoMesa.get(numeroMesa).fecharConta(getNome(), getEndereco(), getCnpj(), getTelefone());
                break;
            case 2:
                conjuntoMesa.get(numeroMesa).fecharConta(getNome(), getEndereco(), getCnpj(), getTelefone());
                break;
            case 3:
                conjuntoMesa.get(numeroMesa).fecharConta(getNome(), getEndereco(), getCnpj(), getTelefone());
                break;
            case 4:
                conjuntoMesa.get(numeroMesa).fecharConta(getNome(), getEndereco(), getCnpj(), getTelefone());
                break;
            case 5:
                conjuntoMesa.get(numeroMesa).fecharConta(getNome(), getEndereco(), getCnpj(), getTelefone());
                break;
            case 6:
                conjuntoMesa.get(numeroMesa).fecharConta(getNome(), getEndereco(), getCnpj(), getTelefone());
                break;
            case 7:
                conjuntoMesa.get(numeroMesa).fecharConta(getNome(), getEndereco(), getCnpj(), getTelefone());
                break;
            case 8:
                conjuntoMesa.get(numeroMesa).fecharConta(getNome(), getEndereco(), getCnpj(), getTelefone());
                break;
            case 9:
                conjuntoMesa.get(numeroMesa).fecharConta(getNome(), getEndereco(), getCnpj(), getTelefone());
                break;
            case 10:
                conjuntoMesa.get(numeroMesa).fecharConta(getNome(), getEndereco(), getCnpj(), getTelefone());
                break;
            default:
                System.out.println("Mesa inválida!");
        }
    }  
}
