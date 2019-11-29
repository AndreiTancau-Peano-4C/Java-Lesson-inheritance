# Ereditarietà e Polimorfismo 
Riusare il software
# Ereditarietà
• A volte si incontrano classi con funzionalità simili In quanto sottendono concetti semanticamente “vicini” <br>
• È possibile creare classi disgiunte replicando le porzione di stato/comportamento condivise L’approccio “Copia&Incolla”, però, non è una strategia vincente (Difficoltà di manutenzione correttiva e perfettiva) . Meglio “specializzare” codice funzionante Sostituendo il minimo necessario 

• Meccanismo per definire una nuova classe (classe derivata) come specializzazione di un’altra (classe base)<br> 
	– La classe base modella un concetto generico <br>
	– La classe derivata modella un concetto più specifico <br>
• La classe derivata: – Dispone di tutte le funzionalità (attributi e metodi) di quella base <br>
	– Può aggiungere funzionalità proprie<br>
– Può ridefinirne il funzionamento di metodi esistenti (polimorfismo)<br>
Ereditarietà in Java 
• Si definisce una classe derivata attraverso la parola chiave “extends” <br>
	– Seguita dal nome della classe base <br>
• Gli oggetti della classe derivata sono, a tutti gli effetti, estensioni della classe base <br>
	– Anche nella loro rappresentazione in memoria <br>

# Tipi ed ereditarietà <br>
• Ogni classe definisce un tipo: <br>
	– Un oggetto, istanza di una sotto-classe, è formalmente compatibile con il tipo della classe base<br>
	– Il contrario non è vero! <br>
• Esempio <br>
	– Un’automobile è un veicolo<br>
	– Un veicolo non è (necessariamente) un’automobile <br>
• La compatibilità diviene effettiva se – I metodi ridefiniti nella sotto-classe rispettano la semantica della superclasse <br>
• L’ereditarietà gode delle proprietà transitiva <br>
	– Un tandem è un veicolo (poiché è una bicicletta, che a sua volta è un veicolo)<br>

# Vantaggi dell’ereditarietà
•Evitare la duplicazione di codice <br>
• Permettere il riuso di funzionalità <br>
• Semplificare la costruzione di nuove classi <br>
• Facilitare la manutenzione<br>

# Polimorfismo
il polimorfismo è un altro concetto fondamentale della programmazione ad oggetti e risulta essere anche quello più ostico per la piena comprensione della sua utilità. Dal punto di vista implementativo il polimorfismo per i metodi si ottiene utilizzando
 l'overload e l'override dei metodi stessi. Quando abbiamo parlato dei metodi abbiamo detto che ogni metodo è identificato dal nome che gli assegniamo, adesso estendiamo questa definizione dicendo che un metodo è univocamente determinato se prendiamo in considerazione sia il suo nome che la lista di tutti i suoi parametri. Ciò permette, di fatto, di avere all'interno di una classe più metodi che hanno lo stesso nome, ma con parametri diversi. L'overload quindi si basa sulla scrittura di più metodi identificati dallo stesso nome che però hanno, in ingresso, parametri di tipo e numero diverso. Con il termine override si intende una vera e propria riscrittura di un certo metodo di una classe che abbiamo ereditato. Dunque, necessariamente, l'override implica ereditarietà.

# Il riferimento this 
In Java viene utilizzato per fare riferimento, all’interno di un metodo o di un costruttore, agli attributi o metodi locali. Questo tipo di riferimento non fa altro che puntare all’oggetto a cui appartiene risolvendo possibili problemi di ambiguità ovvero quando si scrive il costruttore.

# Come li ho usati nel codice
Nell’esercizio conto Bancario ho usato l’ereditarietà per estendere la classe ContoBancarioEsteso dalla super classe ContoBancario. Il polimorfismo l’ho usato per riutilizzare i metodi preleva e deposita modificandoli nella classe ContoBancarioEsteso.
