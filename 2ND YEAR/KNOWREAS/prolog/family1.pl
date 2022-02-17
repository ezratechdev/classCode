father_of(john,paul). /* john is the father of paul*/
father_of(joe,mary). /* joe is marry's father*/
mother_of(jane,mary). /* jane is mary's mother*/
mother_of(jane,paul). /* jane is paul's mother*/
male(paul). /* paul is male*/
male(joe). /* joe is male*/ 
male(john). /* john is male*/
female(mary). /* mary is female*/
female(jane). /* jane is female*/ 
female(susie). /* susie is female*/


allData :-  male(Y) , write( Y, nl) .

whoAreSiblings :- mother_of(jane,X) , format('The siblings :  are ~w',[X]).
allMales :- male(Y) , write("All males are ") , nl , format('~w',[Y]) .
allFemales :- female(Y) , write("All males are ") , nl , format('~w',[Y]) .