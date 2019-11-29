# aao :: Análise de Algoritmos de Ordenação
[for English click here](https://github.com/ddangelorb/aao/blob/master/README.en.md)

Quando escrevemos um algoritmo para resolver um determinado problema, uma
questão fundamental é saber avaliarmos a qualidade desse algoritmo, ou seja,
além de resolver o problema em questão, o algoritmo consome o tempo
esperado para a tarefa? Quanto tempo demora a execução desse algoritmo e
qual a sua complexidade? Como podemos melhorar a eficiência de um algoritmo
proposto? A área de análise de algoritmos propõe-se a responder essas
questões através das teorias e abordagens práticas.

Um dos assuntos mais abordados e estudados em análise de algoritmos são
algoritmos de ordenação. Ao longo da história diversas técnicas foram
propostas, melhoradas ou mesmo substituídas por outras mais eficientes. Esse
projeto foi motivado na solicitação de experimentos e documentação, no quesito
tempo de execução, dos algoritmos de ordenação nos métodos:
BinaryInsertionSort, BubbleSort, BucketSort, CountingSort, HeapSort,
InsertionSort, MergeSort, QuickSort, RadixSort e SelectionSort.

Dependências
------------
* [Java 8](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html)

Rodar o experimento
------------
Assumindo que o Java 8 já está instalado, execute os comandos abaixo.

    $ java -version
    $ git clone https://github.com/ddangelorb/aao.git
    $ mkdir bin
    $ javac -d bin -classpath aao/lib/\* aao/src/aao/algoritmos/*.java aao/src/aao/testes/*.java
    $ java -ea -Xms15g -Xmx15g -Xss5g -jar aao/lib/junit-platform-console-standalone-1.5.2.jar --class-path bin -c aao.testes.ExperimentosTests

Veja mais
------------
O código-fonte dos algoritmos de ordenação e os testes estão disponíveis [aqui](https://github.com/ddangelorb/aao/blob/master/src).

A documentação técnica está disponível em javadoc [aqui](https://github.com/ddangelorb/aao/blob/master/doc/index.html). 

A documentação completa e consolidada com a explicação individual de cada método, javadoc e código-fonte está disponível [aqui](https://github.com/ddangelorb/aao/blob/master/doc_exp.pdf)

Licença
------------
MIT [license](https://github.com/ddangelorb/aao/blob/master/LICENSE)

Autor
------

[Daniel D'Angelo R. Barros](https://github.com/ddangelorb)