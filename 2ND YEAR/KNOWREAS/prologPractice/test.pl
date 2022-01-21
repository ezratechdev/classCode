loves(juliet , romio) .

loves(juliet , romio) :- loves(romio , juliet) .



male(ezra) .
male(emmanuel) .
male(enock) .

female(eda) .
female(marry) .




happy(ezra) .
happy(enock) .
happy(marry) .

withJoseph(marry) .
consensual(marry) .
consensual(joseph) .

run(ezra) :- happy(ezra) .
marydancingwithjoseph(marry) :- happy(marry) , withJoseph(marry) .

does_marry_dance :- happy(marry) , withJoseph(marry) , write('Marry dances when happy and with joseph') , nl .

