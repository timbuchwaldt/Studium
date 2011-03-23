-module (a62).
-export ([kgv/1,ggt/2,kgv/2]).
ggt(A,0)->
	A;
ggt(A,B) ->
	ggt(B,round(A) rem round(B)).
kgv (A,B) ->
	A*B/ggt(A,B).
kgv([T])->
	T;
kgv([H|T]) ->
	kgv(H,kgv(T)).