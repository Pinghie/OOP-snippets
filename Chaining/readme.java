Il <b>chaining</b> consiste nel richiamare diversi metodi di una classe uno di seguito all'altro, nella stessa riga di codice, del tipo: <br>
<br>
new Email().setTitle("Oggetto della mail").setMessaggio("Messaggio della mail").invia();
<br><br>
Questo funziona solo perché ogni metodo ha come valore di ritorno <i>"this"</i>, ossia ritorna un'istanza della classe, il che permette di richiamare 
il metodo successivo.

