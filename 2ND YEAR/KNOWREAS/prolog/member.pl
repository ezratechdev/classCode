list_member(X,[X|_]).
list_member(X,[_|TAIL]) :- list_member(X,TAIl).


list_length([],0).
list_length([_|TAIL],N) :- list_length(TAIL,N1) , N is N1 + 1 .