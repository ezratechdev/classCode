list_conscat([], L ,L) .
list_conscat([X1 | L1],L2 , [X1 |L3]) :- list_conscat(L1,L2,L3).
