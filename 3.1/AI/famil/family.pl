father(drake,marlon).
father(marlon,lucy).
father(victor,amy).
father(jack, susan).
father(jack, ray).
father(lucy, liza).
father(lucy, john).
father(john, peter).
father(john, mary).
mother(abby,amy).
mother(jasmine,marlon).
mother(esther, lucy).
mother(karen, susan).
mother(karen, ray).
mother(amy, liza).
mother(amy, john).
mother(susan, peter).
mother(susan, mary).


parent(X, Y) :- father(X,Y) ; mother(X,Y).
grandparent(X, Y) :- parent(X,Z) , parent(Z,Y).
grandFather(X,Y) :- father(X,Z) , father(Z , Y) ; father(X,Z) , mother(Z,Y).
grandMother(X,Y) :- mother(X,Z) , mother(Z , Y) ; mother(X,Z) , father(Z,Y).
greatGrandFather(X,Y) :-  father(X,Z) , grandFather(Z,Y) ; father(X,Z) , grandMother(Z,Y).
greatGrandMother(X,Y) :-  mother(X,Z) , grandFather(Z,Y) ; mother(X,Z) , grandMother(Z,Y).
greatGreatGrandFather(X,Y) :- father(X,Z) , greatGrandFather(Z,Y) ;  father(X,Z) , greatGrandMother(Z,Y).
greatGreatGrandMother(X,Y) :- mother(X,Z) , greatGrandFather(Z,Y) ;  mother(X,Z) , greatGrandMother(Z,Y).