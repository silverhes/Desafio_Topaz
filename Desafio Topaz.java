//desafio Topaz

Class Servidores(umaxUsuários){
	int numAlocados = 0;
	int umaxUsuarios = umaxUsuarios;
	int tTask = 0;
}

//para facilitar a leitura do código na hora de escrever no arquivo .txt
void gravarNoArquivo(String string){
	FileWrriter output = new FileWriter("c:\\Lista de usuários nos Servidores.txt")
	PrintWriter gravarArq = new PrintWriter(arq);
	gravarArq.printf(string);
}

//leitura do arquivo com as informações sobre o uso dos Servidores
Scanner lerArquivoTxt(String caminho){
	FileReader = arq = new FileReader(caminho);
	return Scanner ler = new Scanner(System.in);
}

int somaTicks(Servidor servidor){
	int soma = 0;
	for(int i = ;i < servidor.size; i++)
		soma += servidor.ttasks;
	return soma;
}


Servidor realocarUsuarios(Servidor servidor, int tick){
	
	for(int i = 0; i< servidores.size; i++)
		if(servidores[i].ttasks = tick){
			servidores[i] = null;
		}
	}
	
	Servidor alocado = new Servidor();
	int j = 0;
	for(int i = 0; i < servidor.size; i++){
		if(servidor[i] != null){
			realocado[j] = servidor[i];
			j++;
		}
	}
	return realocado;
}


void main(){

	//criação das estruturas que vão receber a lista de Servidores e de Usuários
	List <Servidores> servidores = new ArrayList <Servidores>;
	
	Scanner ler = lerArquivoTxt("c:arquivo_entrada.txt");

	int tTask = Interger.parseInt(ler.readline()); 
	int umax = Interger.parseInt(ler.readline()); 
	int tick = 0;
	int valorGasto = 0;
	int numUsuarios = 0;
	
	int server = 1; 
	gravarNoArquivo("criado o Servidor " + server);
	
	qtdServer = 1; //porque sempre vai ter pelo menos 1 servidor ativo
	qtdHistórico = 0;

	while(ler){
		
		numUsuarios = Interger.parseInt(ler.readline());  
		
		if(tick == ttasks){
			servidores = realocarUsuarios(servidores);
			numUsuarios = servidores.size;
		}
		servidoresAtivos = numUsuarios / umax; 

		if(servidoresAtivos < 1) {
			//para começar a adicionar servidores apenas quando ultrapassar da quantidade máxima.
			qtdHistórico = qtdServer;
			qtdServer = Math.ceil(servidoresAtivos) 
			//arredonda pra cima depois de fazer a divisão da quantidade de usuários pela quantidade máxima de usuários por servidor.
			if (qtdServer > qtdHistórico)
				gravarNoArquivo(qtdServer - qtdHistórico + " foram criados")
			else
				gravarNoArquivo(qtdHistórico - qtdServer + " foram removidos")
		}
		
		gravarNoArquivo("Tick #" + tick);
			for(int i = 1; i< qtdServer;i++){
				gravarNoArquivo("Servidor "+i+ " "+umax+" Usuários");
			}
			gravarNoArquivo("Servidor "+i+ " "+numUsuarios%umax+" Usuários");
		valorGasto += qtdServer* numUsuarios;
		tick++;
	}
	gravarNoArquivo("Valor Total Gasto" + valorGasto);
		
}
