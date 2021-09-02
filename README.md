# Desafio_Topaz
 Desafio feito na seleção para a Topaz

Preferi fazer na linguagem Java, pois tenho pouca vivência com Python.

Primeiramente, eu fiz a leitura do arquivo de entrada para fazer as declarações iniciais importantes que são as ttask e o umax.

Depois é feita a leitura dos usuários que vão ser adicionados naquele tick. Cada leitura é um tick.

A partir do número de usuários que foi adicionado nesse tick, vai ser feito o cálculo de quantos servidores vão ser necessários para alocar todos eles. Para isso, precisa dividir o número de Usuários pela quantidade máxima de usuários que o servidor permite (umax) e arredondar para cima apenas se a divisão não for exata.

Quando o tick alcança o número de ttask, é feita uma varredura no servidor para fazer reaalocação dos usuários nos servidores.

Com a criação ou com a remoção dos servidores, vai ser gravado no arquivo o número tick que está sendo processado, a quantidade de servidores que foram criados ou removidos e a quantidade de usuários em cada um deles..

Após a leitura do arquivo completo, o sistema grava no arquivo o valor gasto pelo uso dos servidores em todos os ticks.

Para facilitar a implementação e a leitura do código, utilizei a estrutura ArrayList do Java que já tem funções muito utilizadas para adição e remoção de elementos, tamanho dentre outras funcionalidades.

Ainda criei métodos com nomes intuitivos para facilitar a leitura e serem reutilizados nessa e em outras aplicações.

Espero que tenham gostado. Grande Abraço!

=========================================================== CASO SEJA NECESSÁRIO, SEGUE UMA TRADUÇÃO EM ESPANHOL BÁSICO =======================================================

# Challenge_Topaz
 Desafío realizado en la selección de Topaz

Preferí hacerlo en el lenguaje Java, ya que tengo poca experiencia con Python.

Primero, leo el archivo de entrada para hacer las declaraciones iniciales importantes que son ttask y umax.

Posteriormente, se leen los usuarios que se agregarán en ese tick. Cada lectura es un tick.

A partir de la cantidad de usuarios agregados en esta marca, se calculará cuántos servidores se necesitarán para asignarlos a todos. Para hacer esto, debe dividir el número de usuarios por el número máximo de usuarios que permite el servidor (umax) y redondear para arriba solo si la división no es exacta.

Cuando la marca alcanza el número ttask, el servidor se escanea para organizar usuarios a los servidores.

Con la creación o eliminación de servidores, se registrará en el archivo el número de tick que se procesa, el número de servidores que se crearon o eliminaron y el número de usuarios en cada uno de ellos.

Después de leer el archivo completo, el sistema registra en el archivo el monto gastado por el uso de servidores en cada tick.

Para facilitar la implementación y lectura del código, utilicé la estructura ArrayList de Java, que ya tiene funciones muy utilizadas para agregar y eliminar elementos, tamaño, entre otras características.

También creé métodos con nombres intuitivos para que sea más fácil de leer y reutilizar en esta y otras aplicaciones.

espero que les haya gustado. Gran Abrazo!!
