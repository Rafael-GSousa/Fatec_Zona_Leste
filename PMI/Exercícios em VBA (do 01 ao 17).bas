REM  *****  BASIC  *****

Sub Area_Quadrado
	Dim lado As Double
	Dim area As Double
	lado = InputBox("Digite um lado do quadrado")
	area = (lado ^ 2)
	MsgBox "A �rea do quadrado �: "&area & "m�" 
End Sub

Sub Salario
	Dim sal As Double
	Dim n_sal As Double
	sal = InputBox("Digite o valor do sal�rio")
	n_sal = (sal * 1.15)
	MsgBox "O novo sal�rio com reajuste �: R$" &n_sal
End Sub

Sub Area_Triangulo
	Dim bas As Double
	Dim alt As Double
	Dim area As Double
	bas = InputBox("Digite a base do tri�ngulo")
	alt = InputBox("Digite a altura do tri�ngulo")
	area = (bas*alt) / 2
	MsgBox "A �rea do tri�ngulo �: "&area & "m�"
End Sub

Sub Temperatura
	Dim cel As Double
	Dim fah As Double
	cel = InputBox("Digite a temperatura em graus Celsius")
	fah = (9 * cel + 160) / 5
	MsgBox "A temperatura convertida em fahrenheit �: "&fah
End Sub

Sub Delta
	Dim a As Double, b As Double, c As Double, x1 As Double, x2 As Double
	a = InputBox("Insira o valor de A")
	b = InputBox("Insira o valor de B")
	c = InputBox("Insira o valor de C")
	x1 = (- b + Sqr((b^2) - (4 * a * c))) / (2 * a)
	x2 = (- b - Sqr((b^2) - (4 * a * c))) / (2 * a)
	MsgBox "X1 �: "&x1 & " e X2 �: " &x2
End Sub	


Sub Troca_X_Y
	Dim x As Double, y As Double, aux As Double
	x = InputBox("Insira o valor de x")
	aux = x
	y = InputBox("Insira o valor de y")
	MsgBox "o valor de x �: "&x & " e o valor de y �: " &y
	x = y
	y = aux
	MsgBox "agora o valor de x �: "&x & " e o valor de y �: " &y
End Sub

Sub Volume_Paralelepipedo
	Dim comp As Double, larg As Double, alt As Double, vol As Double
	comp = InputBox("Insira o valor do comprimento")
	larg = InputBox("Insira o valor da largura")
	alt = InputBox("Insira o valor da altura")
	vol = (comp * larg * alt)
	MsgBox "O volume �: "&vol & "m�"
End Sub

Sub Valor_Poup
	Dim dep As Double, n_val As Double
	dep = InputBox("Insira o valor do dep�sito")
	n_val = (dep * 1.013)
	MsgBox "O novo valor � R$"&n_val
End Sub

Sub Soma_Quadrados
	Dim n1 As Integer, n2 As Integer, soma As Integer
	n1 = InputBox("Insira o 1� n�mero")
	n2 = InputBox("Insira o 2� n�mero")
	soma = (n1 ^ 2) + (n2 ^ 2)
	MsgBox "A soma dos quadrados � "&soma
End Sub

Sub Diferenca_Reais
	Dim n1 As Double, n2 As Double, dif As Double
	n1 = InputBox("Insira o 1� valor")
	n2 = InputBox("Insira o 2� valor")
	dif = (n1 - n2)
	MsgBox "A diferen�a entre " &n1 & " e " &n2 & " �: " &dif
End Sub

Sub Comprimento_Circunferencia
	Dim raio As Double, comp As Double
	raio = InputBox("Insira o valor do raio")
	comp = (2 * 3.14 * raio)
	MsgBox "O comprimento da circunfer�ncia � "&comp
End Sub


Sub Projecao_Idade
	Dim ano_n As Integer, ano_a As Integer, id_a As Integer, id_f As Integer
	ano_n = InputBox("Insira o ano de nascimento")
	ano_a = InputBox("Insira o ano atual")
	id_a = (ano_a - ano_n)
	id_f = (id_a + 17)
	MsgBox "Sua idade atual � "&id_a & " anos e sua idade daqui a 17 anos ser� "&id_f & " anos"
End Sub

Sub Alimento
	Dim a As Double
	Dim d As Integer
	a = InputBox("Insira a quantidade de alimento em Kg")
	d = ((a * 1000) / 50)
	MsgBox "O alimento ir� durar "&d & " dias"
End Sub

Sub Angulos_Triangulo
	Dim ang1 As Double, ang2 As Double, ang3 As Double
	ang1 = InputBox("Insira o 1� �ngulo")
	ang2 = InputBox("Insira o 2� �ngulo")
	ang3 = (180 - (ang1 + ang2))
	MsgBox "O valor do 3� �ngulo � "&ang3
End Sub

Sub Calculo_Hipotenusa
	Dim cat1 As Double, cat2 As Double, res_hip As Double
	cat1 = InputBox("Insira o 1� cateto")
	cat2 = InputBox("Insira o 2� cateto")
	res_hip = Sqr((cat1 ^ 2) + (cat2 ^ 2))
	MsgBox "O valor da hipotenusa � "&res_hip
End Sub

Sub Salario_Liquido
	Dim ht As Double, vh As Double, desc As Double, sb As Double, sr As Double
	Dim dep As Integer
	ht = InputBox("Insira a quantidade de horas trabalhadas")
	vh = InputBox("Insira o valor da hora")
	desc = InputBox("Insira o percentual de desconto")
	dep = InputBox("Insira o n�mero de dependentes")
	sb = (ht * vh)
	sr = (sb - (sb * (desc / 100)) + (dep * 100))
	MsgBox "O sal�rio a receber � R$ "&sr
End Sub

Sub Calculo_Litros
	Dim t As Double, vm As Double, lt As Double
	t = InputBox("Insira o tempo do percurso")
	vm = InputBox("Insira a velocidade m�dia")
	lt = ((t * vm) / 12)
	MsgBox "A quantidade de litros gastos na viagem foi de "&lt & " litro(s)"
End Sub
