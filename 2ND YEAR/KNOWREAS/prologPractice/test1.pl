love(ezra,sally) . 


happy(sally) .
happy(ezra) .

ezra_and_sally_happy(ezra,sally) :- happy(ezra) , happy(sally) .
predicate_ezra_and_sally_happy :- ezra_and_sally_happy(ezra,sally) .

ezra_happy :- happy(sally) , write('Ezra is happy when sally is happy') , nl .


male(ezra) .
male(enock) .
male(emmanuel) .

female(eda) .
female(marry).


parents(ezra,enock) .
parents(marry , ezra) .
parents(ezra , alice) .
parents(ezra, sally) .

get_sibling :- parents(marry , X) , parents(X,Y) , format('Found ~w' ,[Y]) , nl .