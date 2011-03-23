-module (fac).
-export ([fac/1]).

fac (0) ->
	1;
fac (A) ->
	A*fac(A-1).