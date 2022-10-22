;Aluno: Anderson Alves dos Santos
;1. Utilizando a linguagem Clojure, crie uma função 
;chamada ultimo que receba uma lista e devolva o último elemento desta lista sem 
;usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.

(defn ultimo 
    [valor] 
    (last valor))
(println "Exerc1 - Entrada:(1 2 3 4 6 7 8) Saida:"(ultimo '(1 2 3 4 6 7 8)))

;2. Utilizando a linguagem Clojure, crie uma função chamada penultimo que receba uma 
;lista e devolva o penúltimo elemento desta lista usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.

(defn verifica-Tamanho-Lista 
    [valor, contador] 
    (if (empty? valor) contador 
        (verifica-Tamanho-Lista 
            (pop valor) (+ contador 1))))
(defn penultimo  
    [valor]  
    (if (= (verifica-Tamanho-Lista valor, 0) 2) 
        (first valor) (penultimo (pop valor))))

(println "Exerc2 - Entrada:(1 2 3 4 6 7 8) Saida:"(penultimo '(1 2 3 4 6 7 8)))

;3. Utilizando a linguagem Clojure, crie uma função chamada 
;elementoN que receba uma lista e um inteiro N e devolva o  elemento 
;que  está na  posição N desta lista usar as funções já prontas e disponíveis 
;para esta mesma finalidade na linguagem Clojure.

(defn elementoN  
    [valor, n]  
    (if (= (verifica-Tamanho-Lista valor, 0) n) 
        (first valor) 
            (elementoN (pop valor) n)) )
(println "Exerc3 - Entrada:((1 2 3 4 6 7 8) 7) Saida:"(elementoN '(1 2 3 4 6 7 8) 7))

;4. Utilizando  a  linguagem Clojure,  crie  uma 
;função  chamada  inverso  que  receba uma lista  e devolva 
;esta lista com as posições dos elementos invertidas. Por exemplo recebe 1,2,3] 
;e devolve [3,2,1]. Sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.  

(defn inversoL  
    [valor, valorL]  
    (if (empty? valor) valorL 
        (inversoL (pop valor) 
            (conj valorL 
                (first valor)))))
(defn inverso  
    [valor]  
    (if (empty? valor) inversoL 
        (inversoL valor '() )))
(println "Exerc4 - Entrada:(1 2 3 4 6 7 8) Saida:"(inverso '(1 2 3 4 6 7 8)))

;5. Utilizando a  linguagem Clojure, crie uma função chamada  mdc que receba  dois inteiros e 
;devolve o mínimo divisor comum entre eles.  
;Sem usar as funções já prontas e disponíveis para esta mesma finalidade na linguagem Clojure.

;(NÃO CONSEGUI FAZER)
