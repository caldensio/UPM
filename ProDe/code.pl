:-module(_,_,[assertions, regtypes]).

:- doc(title, "Memoria Bits, Nibbles & Bytes").
:- doc(author, "Luis Dominguez Romero, z170298").
:- doc(module, "Este documento representa la memoria de la primera práctica.").

:- pred author_data(Dominguez, Romero, Luis, Z170298)
   # "Estos son mis datos.".
author_data('Dominguez', 'Romero', 'Luis', 'Z170298').



% --------------------------Predicados dados por el enunciado----------------------------------------

                    %----------------bind(X)--------------
:-test bind(X) : (X = 0) + not_fails .
:-test bind(X) : (X = 1) + not_fails .
:-test bind(X) : (X = 2) + fails # "Los valores de un bit oscilan entre 0 y 1.".

:-pred bind(X)
  # "Este predicado es el encargado de definir un bit, el cual tomará el valor de la variable @var{X} [0,1]. @includedef{bind/1}".


bind(0).
bind(1).

                     
                    %----------------binary_byte(X)--------------
:- test binary_byte(X) : (X = [bind(1), bind(0), bind(1), bind(0), bind(1), bind(1), bind(1), bind(0)]) + not_fails .
:- test binary_byte(X) : (X = [1,0,1,0,1,1,1,0]) + fails #"Un byte en representación binaria se compone de ocho bits".
:- test binary_byte(X) : (X = [bind(1), bind(0)]) + fails #"Un byte en representación binaria se compone de ocho bits" .

:-pred binary_byte([bind(B7), bind(B6), bind(B5), bind(B4), bind(B3), bind(B2), bind(B1), bind(B0)])
  # "Este predicado define la estructura de un byte. Se trata de una lista de ocho bits donde @var{B7} será el valor del bit más significativo y @var{B0} será el valor del bit menos significativo. @includedef{binary_byte/1}".
binary_byte([bind(B7), bind(B6), bind(B5), bind(B4), bind(B3), bind(B2), bind(B1), bind(B0)]) :-
    bind(B7),
    bind(B6),
    bind(B5),
    bind(B4),
    bind(B3),
    bind(B2),
    bind(B1),
    bind(B0).


                    %----------------hexd(X)--------------
:- test hexd(X) : (X = 0) + not_fails .
:- test hexd(X) : (X = a) + not_fails .
:- test hexd(X) : (X = 10) + fails # "La representación hexadecimal oscila entre los valores [0-9,a-f].".

:-pred hexd(X)
  # "Este predicado es el encargado de definir un nibble. El valor de este nibble vendrá asociado al de la @var{X}. @includedef{hexd/1}".
hexd(0).
hexd(1).
hexd(2).
hexd(3).
hexd(4).
hexd(5).
hexd(6).
hexd(7).
hexd(8).
hexd(9).
hexd(a).
hexd(b).
hexd(c).
hexd(d).
hexd(e).
hexd(f).


                    %----------------byte(X)--------------

:- test byte(X) : (X = [bind(1), bind(0), bind(1), bind(0), bind(1), bind(1), bind(1), bind(0)] ) + not_fails .
:- test byte(X) : (X = [hexd(a),hexd(0)]) + not_fails .
:- test byte(X) : (X = [hexd(a)]) + fails # "Un byte se compone de una lista de ocho bits o una lista de dos hexadecimales.".

:-pred byte(Byte)
  # "Este predicado se encarga de la definición de un byte, que puede ser representado como una lista de dos nibble o una lista de ocho bits. @includedef{byte/1}".
byte(BB) :-
    binary_byte(BB).
byte(HB) :-
    hex_byte(HB).


                    %----------------hex_byte(X)--------------

:- test hex_byte(X) : (X = [hexd(0),hexd(0)]) + not_fails .
:- test hex_byte(X) : (X = [hexd(0)]) + fails # "Un byte se representa como una lista de dos números en representación hexadecimal..".

:-pred hex_byte([hexd(H1),hexd(H0)])
  # "Este predicado se encarga de la definición de un byte a partir de una lista de dos nibble. Los bits más significativos serán los de la variable @var{H1}, mientras que los menos significativos serán los de @var{H0}.@includedef{hex_byte/1}".
% Define a hex byte as a list of 2 hex nibbles .
hex_byte([hexd(H1), hexd(H0)]) :-
    hexd(H1),
    hexd(H0).



%------------------------------------PREDICADOS A IMPLEMENTAR-----------------------------------------

                    %----------------byte_list(X)--------------

:- test byte_list(X) : (X=[]) + not_fails #"Caso base".
:- test byte_list(X) : (X =[[bind(0),bind(0),bind(0),bind(0),bind(0),bind(0),bind(0),bind(1)], [bind(0),bind(0),bind(0),bind(0),bind(0),bind(0),bind(0),bind(1)]]) + not_fails .
:- test byte_list(X) : (X = [[hexd(0),hexd(1)],[hexd(a),hexd(0)]]) + not_fails .
:- test byte_list(X) : (X = [hexd(a)]) + fails # "Un byte se compone de una lista de ocho bits o dos hexadecimales.".

:-pred byte_list(ByteList)
  # "Este predicado define listas de bytes a partir del argumento @var{ByteList}, que puede ser una lista de bytes binarios o hexadecimales.@includedef{byte_list/1}".
byte_list([]).
byte_list([H|T]):-
    hex_byte(H),
    byte_list(T).
byte_list([H|T]):-
    binary_byte(H),
    byte_list(T).



                    %----------------byte_conversion(Hex,Bin)--------------

:- test byte_conversion(Hex,Bin) : (Hex = [hexd(f),hexd(0)]) => (Bin = [bind(1),bind(1),bind(1),bind(1),bind(0),bind(0),bind(0),bind(0)]) + not_fails .
:- test byte_conversion(Hex,Bin) : (Bin = [bind(0),bind(0),bind(0),bind(0),bind(0),bind(0),bind(0),bind(0)]) => (Hex = [hexd(0),hexd(0)]) + not_fails.
:- test byte_conversion(Hex,Bin) : (Hex = [hexd(10)]) + fails # "Un byte solo puede ser representado por una lista de dos números hexadecimales o una lista de ocho bits.".

:-pred byte_conversion(HexByte, BinByte)
  # "Este predicado es cierto si el @var{HexByte} es la representación hexadecimal de @var{BinByte}.@includedef{byte_conversion/2}".
byte_conversion([H1,H0],Byte):-
    binary_to_nibble(H0,B0),
    binary_to_nibble(H1,B1),
    my_concat(B1,B0,Byte).


                    %----------------byte_list_conversion(HexList,BinList)--------------

:- test byte_list_conversion(HexList,BinList) : (Hex = [[hexd(f),hexd(0)],[hexd(f),hexd(0)]]) => (Bin = [[bind(1),bind(1),bind(1),bind(1),bind(0),bind(0),bind(0),bind(0)],[bind(1),bind(1),bind(1),bind(1),bind(0),bind(0),bind(0),bind(0)]]) + not_fails .
:- test byte_list_conversion(HexList,BinList) : (BinList = [[bind(1),bind(1),bind(1),bind(1),bind(0),bind(0),bind(0),bind(0)],[bind(1),bind(1),bind(1),bind(1),bind(0),bind(0),bind(0),bind(0)]]) => (HexList =[[hexd(f),hexd(0)],[hexd(f),hexd(0)]]) + not_fails. 
:- test byte_list_conversion(HexList,BinList) : (HexList = hexd(10)) + fails # "Un byte solo puede ser representado por una lista de dos números hexadecimales o una lista de ocho bits.".

:-pred byte_list_conversion(HL,BL)
  # "Este predicado es cierto si la lista de bytes hexadecimales @var{HL} tiene como representacion binaria la lista bytes binarios @var{BL}.@includedef{byte_list_conversion/2}".
byte_list_conversion([],[]).
byte_list_conversion([H1|T1],[BL|TBL]):-
    byte_conversion(H1,BL),
    byte_list_conversion(T1,TBL).


                       %----------get_nth_bit_from_byte(Index,Byte,Bit)-----------

:- test get_nth_bit_from_byte(Index, Byte, Bit) : (Index = s(s(s(s(s(0))))), Byte = [bind(1),bind(0),bind(1),bind(0),bind(1),bind(1),bind(0),bind(0)]) => (Bit = bind(1)) + not_fails.
:- test get_nth_bit_from_byte(Index, Byte, Bit) : (Index = s(s(s(s(s(0))))), Bit = bind(1),Byte = [hexd(2),hexd(0)]) + not_fails.
:- test get_nth_bit_from_byte(Index, Byte, Bit) : (Index = 0, Byte = [bind(1),bind(0),bind(1),bind(0),bind(1),bind(1),bind(0),bind(0)], Bit = bind(1)) + fails.

:-pred get_nth_bit_from_byte(Index,Byte,Bit)
  # "Este predicado es cierto si, dada un byte @var{Byte} (en representacion binaria o hexadecimal), el bit @var{Bit} se encuentra en la posición @var{Index}.@includedef{get_nth_bit_from_byte/3} ".
get_nth_bit_from_byte(N, HexList, BN):-
    byte_conversion(HexList, Byte),
    get_nth_bit_from_byte(N,Byte,BN).
get_nth_bit_from_byte(N,Byte, Bit):-
    binary_byte(Byte),
    resta(s(s(s(s(s(s(s(0))))))),N,N1),
    indexOf(N1,Byte,Bit).


                       %----------byte_list_clsh(L,CL)-----------

:-test byte_list_clsh(L,CL) : (L = [[hexd(5), hexd(a)], [hexd(2), hexd(3)], [hexd(5), hexd(5)], [hexd(3), hexd(7)]]) => (CL = [[hexd(b), hexd(4)], [hexd(4), hexd(6)], [hexd(a),hexd(a)], [hexd(6), hexd(e)]]) + not_fails.
:-test byte_list_clsh(L,CL) : (L = [[hexd(10), hexd(10)], [hexd(10), hexd(10)], [hexd(10), hexd(10)], [hexd(10), hexd(10)]]) + fails.

:-pred byte_list_clsh(L,CL)
  # "Este predicado es cierto si la lista de bytes (en representación binaria o hexadecimal) @var{CL},es el resultado de aplicar un desplazamiento circular hacia la izquierda a la lista de bytes @var{L}. @includedef{byte_list_clsh/2}".
byte_list_clsh(L,CL):-
    byte_list_conversion(L,ByteList),
    concat_matrix(ByteList,Vector),
    rotate(Vector,VectorRes),
    list_to_matrix(VectorRes,ByteListRes),
    byte_list_conversion(CL,ByteListRes).
byte_list_clsh(L,CL):-
    is_binary_list(L),
    concat_matrix(L,Vector),
    rotate(Vector,VectorRes),
    list_to_matrix(VectorRes,CL).


                       %----------byte_list_crsh(L,CL)-----------

:-test byte_list_crsh(L,CL) :(L = [[hexd(b), hexd(4)], [hexd(4), hexd(6)], [hexd(a),hexd(a)], [hexd(6), hexd(e)]]) => (CL = [[hexd(5), hexd(a)], [hexd(2), hexd(3)], [hexd(5), hexd(5)], [hexd(3), hexd(7)]]) + not_fails.
:-test byte_list_crsh(L,CL) : (L = [[hexd(10), hexd(10)], [hexd(10), hexd(10)], [hexd(10), hexd(10)], [hexd(10), hexd(10)]]) + fails.
:-pred byte_list_crsh(L,CL)
  # "Este predicado es cierto si la lista de bytes (en representación binaria o hexadecimal) @var{CL},es el resultado de aplicar un desplazamiento circular hacia la derecha a la lista de bytes @var{L}. @includedef{byte_list_crsh/2}".
byte_list_crsh(L,CL):-
    byte_list_conversion(L,ByteList),
    concat_matrix(ByteList,Vector),
    reverse(Vector,VectorRever),
    rotate(VectorRever,VectorRes),
    reverse(VectorRes,VectorFinal),
    list_to_matrix(VectorFinal,ByteListRes),
    byte_list_conversion(CL,ByteListRes).
byte_list_crsh(L,CL):-
    is_binary_list(L),
    concat_matrix(L,Vector),
    reverse(Vector,VectorRever),
    rotate(VectorRever,VectorRes),
    reverse(VectorRes,VectorFinal),
    list_to_matrix(VectorFinal,CL).




                       %----------byte_xor(B1,B2,B3)-----------

:-test byte_xor(B1,B2,B3): (B1=[hexd(0),hexd(0)], B2=[hexd(0),hexd(0)]) => (B3=[hexd(0),hexd(0)]) + not_fails.
:-test byte_xor(B1,B2,B3): (B1=[hexd(0),hexd(0)], B2=[hexd(0),hexd(0)], B3=[hexd(0),hexd(1)]) + fails.
:-test byte_xor(B1,B2,B3): (B1=0, B2=0) + fails #"Los valores de entrada deben ser bytes".
:-pred byte_xor(B1,B2,B3)
  # "Este predicado es cierto si el byte @var{B3} es el resultado de efectuar la operación lógica xor e los bytes @var{B1} y @var{B2}. La representación de estos bytes puede ser binaria o hexadecimal. @includedef{byte_xor/3}".
byte_xor(B1,B2,B3):-
    byte_conversion(B1,Byte1),
    byte_conversion(B2,Byte2),
    logic_operation(Byte1,Byte2,Byte3),
    byte_conversion(B3,Byte3).
byte_xor(B1,B2,B3):-
    logic_operation(B1,B2,B3).





%------------------------------------PREDICADOS AUXILIARES--------------------------------------------

                       %----------binary_to_nibble(Hex,Nibble)-----------
:- test binary_to_nibble(Hex, Nibble) : (Hex = hexd(0)) => (Nibble=[bind(0),bind(0),bind(0),bind(0)]) + not_fails .
:- test binary_to_nibble(Hex, Nibble) : (Nibble=[bind(1),bind(1),bind(1),bind(1)]) => (Hex = hexd(f)) + not_fails .
:- test binary_to_nibble(Hex, Nibble) : (Hex = hexd(10)) + fails # "Los argumentos solo pueden ser números en representación hexadecimal o binaria.".


:-pred binary_to_nibble(Hex, Nibble)
  # "Este predicado se encarga de definir la equivalencia entre el valor de un @var{Nibble} y su valor en hexadecimal @var{Hex}. @includedef{binary_to_nibble/2}".
binary_to_nibble(hexd(0),[bind(0),bind(0),bind(0),bind(0)]).
binary_to_nibble(hexd(1),[bind(0),bind(0),bind(0),bind(1)]).
binary_to_nibble(hexd(2),[bind(0),bind(0),bind(1),bind(0)]).
binary_to_nibble(hexd(3),[bind(0),bind(0),bind(1),bind(1)]).
binary_to_nibble(hexd(4),[bind(0),bind(1),bind(0),bind(0)]).
binary_to_nibble(hexd(5),[bind(0),bind(1),bind(0),bind(1)]).
binary_to_nibble(hexd(6),[bind(0),bind(1),bind(1),bind(0)]).
binary_to_nibble(hexd(7),[bind(0),bind(1),bind(1),bind(1)]).

binary_to_nibble(hexd(8),[bind(1),bind(0),bind(0),bind(0)]).
binary_to_nibble(hexd(9),[bind(1),bind(0),bind(0),bind(1)]).
binary_to_nibble(hexd(a),[bind(1),bind(0),bind(1),bind(0)]).
binary_to_nibble(hexd(b),[bind(1),bind(0),bind(1),bind(1)]).
binary_to_nibble(hexd(c),[bind(1),bind(1),bind(0),bind(0)]).
binary_to_nibble(hexd(d),[bind(1),bind(1),bind(0),bind(1)]).
binary_to_nibble(hexd(e),[bind(1),bind(1),bind(1),bind(0)]).
binary_to_nibble(hexd(f),[bind(1),bind(1),bind(1),bind(1)]).



                       %----------my_concat(L1,L2,Res)-----------

:-test my_concat(List1,List2,Res) : (List1 = [], List2 = [c,d]) => (Res = [c,d] ) + not_fails #"Caso base".
:-test my_concat(List1,List2,Res) : (List1 = [a,b], List2 = [c,d]) => (Res = [a,b,c,d] ) + not_fails.
:-test my_concat(List1,List2,Res) : (List1 = a, List2 = b) + fails # "Los argumentos deben ser listas".
:-pred my_concat(List1,List2,Res)
  # "Este predicado es cierto si la lista @var{Res} es el resultado de concatenar @var{List1} con @var{List2}. @includedef{my_concat/3}".
my_concat([],ListaPost,ListaPost).
my_concat([H1|T1],ListaPost,[H1|T2]):-
    my_concat(T1,ListaPost,T2).


                       %----------indexOf(Index,List,Elem)-----------

:-test indexOf(Index,List,Elem) : (Index = 0, List=[a,b,c]) => (Elem = a) + not_fails.
:-test indexOf(Index,List,Elem) : (Elem = c, List=[a,b,c]) => (Index = s(s(0))) + not_fails.
:-test indexOf(Index,List,Elem) : (Index = 0, List=[a,b,c], Elem = b) + fails.
:-pred indexOf(Index,List,Elem)
  # "Este predicado es cierto si, dada una lista @var{List}, el elemento @var{Elem} se encuentra en la posición @var{Index}. @includedef{indexOf/3}".
indexOf(0,[H|T],H):-
    list(T).
indexOf(s(X),[_|T],H):-
    indexOf(X,T,H).


                       %----------resta(N1,N2,Res)-----------

:-test resta(N1,N2,Res) : (N1=0, N2=0) => (Res = 0) + not_fails #"Caso base".
:-test resta(N1,N2,Res) : (N1 = s(s(0)), N2 = s(0)) => (Res = s(0)) + not_fails.
:-test resta(N1,N2,Res) : (N1 = s(s(0)), N2 = s(0), Res = 0) + fails.
:-pred resta(N1,N2,Res)
  # "Este predicado es cierto si @var{Res} es el resultado de restar @var{N2} a @var{N1}. @includedef{resta/3}".
resta(X,X,0).
resta(s(X),Y,s(Z)):-
    resta(X,Y,Z).


                       %----------is_binary_list(ByteList)-----------

:-test is_binary_list(ByteList): (ByteList = []) + not_fails #"Caso base".
:-test is_binary_list(ByteList): (ByteList = [[bind(1), bind(0), bind(1), bind(0), bind(1), bind(1), bind(1), bind(0)],[bind(1), bind(0), bind(1), bind(0), bind(1), bind(1), bind(1), bind(0)]]) + not_fails.
:-test is_binary_list(ByteList): (ByteList = [bind(1), bind(0), bind(1)]) + fails #"Tienen que ser listas de ocho bits".
:-pred is_binary_list(ByteList)
  # "Este predicado es cierto si el argumento @var{ByteList} es una lista de bytes en representación binaria. @includedef{is_binary_list/1}".
is_binary_list([]).
is_binary_list([H|T]):-
    binary_byte(H),
    is_binary_list(T).


                       %----------concat_matrix(Matrix,List)-----------

:-test concat_matrix(Matrix,List) : (Matrix = []) => (List = []) + not_fails #"Caso base".
:-test concat_matrix(Matrix,List) : (Matrix = [[a,b],[c,d]]) => (List = [a,b,c,d]) + not_fails.
:-test concat_matrix(Matrix,List) : (Matrix = [a,b,c,d]) + fails #"El argumento de entrada tiene que ser una matriz".

:-pred concat_matrix(Matrix,List)
  # "Este predicado es cierto si @var{List} es el resultado de concatenar todas las listas que contenga @var{Matrix}. @includedef{concat_matrix/2}".
concat_matrix([],[]).
concat_matrix([H|T],ListaRes):-
    concat_matrix(T,ListaRes1),
    my_concat(H,ListaRes1,ListaRes).


                       %----------extract_first(Elem, RestoLista, Lista)-----------

:-test extract_first(Elem, RestoLista, Lista) : (Lista = [a,b,c]) => (Elem = a, RestoLista=[b,c]) + not_fails.
:-test extract_first(Elem, RestoLista, Lista) : (Lista = []) + fails #"@var{Lista} Nunca debe ser vacía".
:-pred extract_first(Elem, RestoLista, Lista)
  # "Este predicado es cierto si el resultado de extraer el primer elemento @var{Elem} a la lista @var{Lista} es @var{RestoLista}. @includedef{extract_first/3}".
extract_first(X,T,[X|T]).

:-test rotate(L,CL): (L = []) => (CL = []) + not_fails #"Caso base".
:-test rotate(L,CL): (L = [a,b,c]) => (CL = [b,c,a]) + not_fails.
:-test rotate(L,CL): (L = [a,b,c], CL=[c,b,a]) + fails.
:-pred rotate(L,CL)
  # "Este predicado es cierto si @var{CL} es el resultado de aplicar un desplazamiento hacia la izquierda a la lista @var{L}. @includedef{rotate/2}".
rotate([],[]).
rotate(ListaEnt,ListaRes):-
    extract_first(Elem,L1,ListaEnt),
    my_concat(L1,[Elem],ListaRes).


                       %----------list_to_matrix(List, Matrix)-----------

:-test list_to_matrix(List, Matrix): (List = []) => (Matrix = []) + not_fails #"Caso base".
:-test list_to_matrix(List, Matrix): (List = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]) => (Matrix = [[1,2,3,4,5,6,7,8],[9,10,11,12,13,14,15,16]]) + not_fails.
:-test list_to_matrix(List, Matrix): (List = [1,2,3,4,5,6,7,8,9,10,11,12,13,14]) => (Matrix = [[1,2,3,4,5,6,7,8],[9,10,11,12,13,14]]) + fails #"La lista de entrada debe tener una longitud múltiplo de 8.".
:-pred list_to_matrix(List, Matrix)
  # "Este predicado es cierto si la matriz @var{Matrix} es el resultado de agrupar varias listas de ocho elementos de la lista @var{List}. @includedef{list_to_matrix/2}".
list_to_matrix([],[]).
list_to_matrix([B7,B6,B5,B4,B3,B2,B1,B0|T1],[[B7,B6,B5,B4,B3,B2,B1,B0]|T2]):-
    list_to_matrix(T1,T2).



                       %----------reverse(L,LR)-----------

:-test reverse(L,LR): (L = []) => (LR = []) + not_fails #"Caso base".
:-test reverse(L,LR): (L = [a,b,c]) => (LR = [c,b,a]) + not_fails.
:-test reverse(L,LR): (L = [a,b,c], LR = [b,c,a]) + fails.
:-pred reverse(L,LR)
  # "Este predicado es cierto si la lista @var{LR} es el resultado de invertir la lista @var{L} . @includedef{reverse/2}".
reverse([],[]).
reverse([H|T],Res):-
    reverse(T,Res1),
    my_concat(Res1,[H],Res).


                       %----------logic_operation(B1,B2,B3)-----------

:-test logic_operation(B1,B2,B3): (B1=[], B2=[]) => (B3=[]) + not_fails #"Caso base".
:-test logic_operation(B1,B2,B3): (B1=[bind(0),bind(0),bind(0),bind(0),bind(0),bind(0),bind(0),bind(1)], B2=[bind(0),bind(0),bind(0),bind(0),bind(0),bind(0),bind(0),bind(0)]) => (B3=[bind(0),bind(0),bind(0),bind(0),bind(0),bind(0),bind(0),bind(1)]) + not_fails.
:-test logic_operation(B1,B2,B3): (B1=[bind(0),bind(0),bind(0),bind(0),bind(0),bind(0),bind(0),bind(1)], B2=[bind(0),bind(0),bind(0),bind(0),bind(0),bind(0),bind(0),bind(0)], B3=[bind(0),bind(0),bind(0),bind(0),bind(0),bind(0),bind(0),bind(0)]) + fails.

:-pred logic_operation(B1,B2,B3)
  # "Este predicado es cierto si el byte @var{B3} es el resultado de efectuar la operación lógica xor e los bytes @var{B1} y @var{B2}. La representación de estos bytes SOLO PUEDE SER BINARIA. @includedef{logic_operation/3}".
logic_operation([],[],[]).
logic_operation([Bit1|T1],[Bit2|T2],Res):-
    xor(Bit1,Bit2,BitRes),
    logic_operation(T1,T2,Res1),
    my_concat([BitRes],Res1,Res).


                       %----------xor(B1,B2,B3)-----------

:-test xor(B1,B2,B3): (B1=bind(1), B2=bind(0)) => (B3 = bind(1)) + not_fails.
:-test xor(B1,B2,B3): (B1=bind(1), B2=bind(0), B3 = bind(0)) + fails.
:-test xor(B1,B2,B3): (B1=1, B2=0, B3=0) + fails #"Los valores deben ser bits".

:-pred xor(B1,B2,B3)
  # "Este predicado es el encargado de definir los valores de la operación XOR con dos bits. @var{B3} será el resultado de esta operación entre los bits @var{B1} y @var{B2}. @includedef{xor/3}".
xor(bind(0),bind(0),bind(0)).
xor(bind(0),bind(1),bind(1)).
xor(bind(1),bind(0),bind(1)).
xor(bind(1),bind(1),bind(0)).