likes(john,susie). /* john likes susuie*/
likes(X,susie). /* Variable X likes Susie */
likes(john,Y). /* john likes  person stored under variable Y*/
likes(john,Y,likes(Y,john)). /* there are three atoms here john , Y and likes */
likes(john,susie);likes(john,marry). /* john likes susuie or john likes mary*/
pizzaLover :- likes(john,pizza) .
data :- not(pizzaLover). /* john does not like pizza */
not(likes(john,pizza)). /* john does not like pizza */
likes(john,susie):-likes(john,marry). /* john likes susuie if john likes mary*/


whoLikesAll :- likes(X , Y) , likes(Y , X) , format('~w likes ~w',[X , Y]) .
whoLovesAll :- likes(X , john) , likes(X , susie) , likes(X ,marry) , format('~w',[X]) . 