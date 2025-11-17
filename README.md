# Forza-4-in-Java

## 1. Introduzione
The project consists in representation of a board game "Four In a Row", developed entirely using Java programming language. 

### 1.1 Scopo del documento
Il presente documento descrive il progetto del gioco **"Forza 4"** sviluppato in linguaggio **Java**.  
Include la struttura architetturale, le soluzioni implementative, la logica di gioco, le scelte progettuali e i ruoli assegnati ai membri del team.

### 1.2 Obiettivi del progetto
- Realizzare un gioco completo di Forza 4 con interfaccia testuale e/o grafica.  
- Implementare un’architettura modulare e facilmente estendibile.  
- Assicurare una corretta gestione dei turni e delle condizioni di vittoria.

### 1.3 Ruoli e Responsabilità
- **Project Manager:** Andrii Smal  
- **Responsabile Analisi e Requisiti:** Andrii Smal, Daniel Caucig  
- **Responsabile Architettura e Design:** Daniel Caucig  
- **Sviluppatore Backend (logica di gioco):** Andrii Smal, Daniel Caucig  
- **Sviluppatore Frontend (interfaccia grafica):** Andrii Smal, Daniel Caucig  
- **Responsabile Test e Validazione:** Andrii Smal, Daniel Caucig, Luca Vassena  
- **Revisore Documentazione:** Andrii Smal, Daniel Caucig  

## 2. Architettura del Sistema
Suddivisione del codice in classi separate per rendere più facile la gestione e la manutenzione del codice.

### 2.1 Struttura provvisoria

    │── Board.java
    │── Player.java
    │── Pedina.java
    └── Gioco.java

## 3. Descrizione dei Componenti Principali

### 3.1 Modello
Il modello contiene le classi fondamentali per la logica del gioco.

- **Board.java:** gestisce la griglia 6x7 e la logica delle mosse.  
- **Player.java:** rappresenta un giocatore (nome, simbolo, tipo).  
- **Pedina.java:** rappresenta una pedina giocata.  
- **Gioco.java:** gestisce i turni, la validazione delle mosse e le condizioni di vittoria.

### 3.3 Interfaccia
- **Terminale IDE** (interfaccia testuale per l’interazione con il gioco).

## 4. Logica di Gioco
Ogni mossa è validata e viene verificata la presenza di 4 pedine consecutive:
- Verticalmente  
- Orizzontalmente  
- Diagonalmente

## 5. Soluzioni Implementative e Scelte Progettuali
- Uso di **matrici** per rappresentare la griglia.  
- Controllo di **input non validi** o **colonne piene**.  
- Codice **commentato e documentato** per facilitarne la manutenzione.  

## 6. Conclusioni
Il progetto **"Forza 4"** rappresenta un esercizio completo di **progettazione**, **sviluppo** e **test** di un software ben realizzato.

## Autori
- **Andrii Smal**  
- **Daniel Caucig**
