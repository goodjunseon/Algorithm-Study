# 📚Scanner VS BuffereadReader

`BuffereadReader`가 `Scanner`보다 빠른 이유는 **버퍼링(buffering)** 방식의 차이 때문이다.\
`Scanner`는 입력을 토근단위로 읽는다. 내부적으로 정규 표현식을 사용하여 입력을 분석하기 때문에 속도가 상대적으로 느리다.\
`BufferedReader`는 한번에 큰 **덩어리(버퍼)로** 데이터를 읽고, `readLine()`을 호출하면 한 줄을 통째로 가져오므로 훨씬 빠르다.\
`BufferedReader`는 한꺼번에 데이터를 읽어서 처리, `Scanner`는 입력값을 하나씩 분석하므로,\
큰 입력을 받을 때는 `BufferedReader`가 훨씬 효율적인 것이다.

### 🔎 Integer.parseInt(br.readline()) VS Scanner.nextInt() ###

`Scanner.nextInt()` : 문자열을 입력받아서 정수형으로 변환하는 방식이다.\
즉 내부적으로 `Integer.parseInt(token)`을 호출하는 것과 유사한 방식으로 동작한다.'\
즉 입력을 문자열로 읽고(버퍼에서 하나의 토큰을 가져옴), 해당 문자열을 Interger.parseInt()를 이용해 정수로 변환하고 반환한다.\

🔎 정리 : Integer.parseInt(br.readline())은 문자열오 입력받고 정수형으로 바꿔서 Scanner.nextInt()가 더 빠를 줄 알았으나,
Scanner.nextInt() 또한 문자열을 정수형으로 바꾸는 과정이 있었다.

### 📌 추가 최적화 : `StringTokenizer`를 함께 사용하기 ###
`BufferedReader` br = new `BufferedReader`(new InputStreamReader(System.in));\
`StringTokenizer` st = new `StringTokenizer`(br.readLine());\
int num1 = Integer.parseInt(st.`nextToken`());\
int num2 = Integer.parseInt(st.`nextToken`());

<hr>

