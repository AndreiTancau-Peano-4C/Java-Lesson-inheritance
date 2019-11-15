# Java-Lesson-inheritance
Ereditarieta' in Java

Il codice [MyCar.java](https://github.com/Prof-Matteo-Palitto-Peano/Java-Lesson-inheritance/blob/master/MyCar.java) vuole illustrare i concetti legati all'ereitarieta' in Java.

## Architettura del Codice
* La SUPER-CLASSE **Veicolo**
* La SOTTO-CLASSE **Auto** che eredita dalla classe **Veicolo** tutte le sue variabili e tutte i suoi metodi
* Nel **main** viene instanziato l'oggetto **myFastCar** di tipo **Auto**

## Concetti evidenziati
* Tutte le variabili e tutti i metodi della SUPER-CLASSE vengono ereditati dall SOTTO-CLASSE
* Le varibili PRIVATE della super classe NON sono accessibili direttamente dall SOTTO-CLASSE
* Le variabili non PRIVATE della SUPER-CLASSE sono accessibili alla SOTTO-CLASSE **solo** se appartengono allo stesso PACKAGE
* Le variabili PROTECTED sono accessibili direttamente dalle sotto-classi **anche** se SUPER classe appartiene ad un package differente.


# ESERCIZIO "CONTO BANCARIO"
SuperClasse **ContoBancario**
* Si vuole realizzare un classe **ContoBancario** che permetta di modellare un generico conto bancario.
* La suddetta classe deve:
  - Contenere un valore (**String**), per rappresentare il numero (alfanumerico) del conto.
  - Contenere un valore (**int**), per rappresentare il bilancio del conto corrente.
  - contenere un costruttore con un parametro che rappresenta il  numero del conto corrente. Il bilancio deve essere inizializzato con il valore 0.
  - contenere un costruttore con 2 parametri, che rappresentano rispettivamente il numero del conto corrente e il bilancio del conto.
  - permettere di conoscere il **numero** e il **bilancio** del conto corrente.
  - permettere di depositare e prelevare somme di denaro dal conto corrente --> Il prelievo puo' avvenire solo se il conto corrente presenta un bilancio sufficiente.
  
## SOTTO-CLASSE ContoEsteso

* Si vuole realizzare una classe **ContoEsteso** che permetta di modellare un conto bancario con un fido.
* La suddetta classe deve:
  - Estendere la classe **ContoBancario**
  - Contenere un valore (**init**) per rappresentare il valore del **fido**.
  - contenere un costruttore con un parametro che rappresenta il numero del conto corrente. Il **fido** viene inizializzato con il valore 1000.
  - Contienere un 2ndo contruttore con 2 parametri che rapprasentano rispettivamente il numero del conto corrente e il cilancio del conto. Il **fido** viene inizializzato con il valore 1000.
  - contenere un 3zo costruttore con 3 parametri che rappresentano rispettivamente il numero del conto corrente, il bilancio e il fido del conto.
  - permettere di conoscere il valore del **fido** 
  - permettere di creare un nuovo **fido**
  - ridefinire il metodo **preleva** della **super-classe** --> è possibile prelevare una determinata somma di denaro da un conto con **fido** solo se questo presenta un bilancio (incluso il **fido**) sufficiente .

Teoria:

EREDITARIETA':

L'Ereditarietà è un meccanismo utilizzato nella programmazione ad oggetti che permette la creazione di nuove classi (classi derivate) a partire da classi preesistenti (superclassi), ereditandone le caratteristiche (metodi e/o attributi). In questo modo si va a creare una gerarchia di classi dove quelle derivate avranno delle caratteristiche simili alle superclassi implementando e ridefinendone i metodi.
Nell'esercizio svolto abbiamo utilizzato la superClasse ContoBancario che estende la classe derivata ContoEsteso.

POLIMORFISMO:

IL Polimorfismo è un concetto strattamente collegato all'eretitarietà tra classi; permette di ottenere comportamenti e risultati diversi invocando gli stessi metodi in oggetti diversi. Il polimorfismo si basa sulla possibilità di ridefinire nelle classi derivate le funzioni dei metodi delle superclassi modificandone il codice. Per fare ciò e neccessario scriver @override prima del metodo nella sottoClasse, questo servere per sovrascrivere il metodo.
nell'esercizio svolto il metodo prelievo è stato utilizzato sia nella superclasse ContoBancario e ContoEsteso ma con differenze specifiche per ogni metodo.

THIS:

This è un comando che serve a identificare l'attributo se si ha una variabile con lo stesso nome all'interno dei metodi. E' usato principalmente nei costruttori per riferirsi alla variabile di classe.

