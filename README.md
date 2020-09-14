# Junit-Lab

Filerna som jag lagt till i repositoryn:
JunitTest
-JunitTest är den första testuppgiften "Calculator"
StandardTestClass
-Det som dokumentationen kallar för en "standard test class" (steg 3 i Laborationen)
MyJunitTest
-MyJunitTest är steg 4 i Laborationen
PalindromeTest
-PalindromeTest är steg 4-1 i Laborationen


Steg 3 i Laborationen: Mina anteckningar till frågorna:

Annotation
Annotaions är olika tester som körs vid olika tillfällen i junit, de man skriver med @.
det finns vissa annotaions som körs, innan alla test, innan varje individuellt test, efter etc
Nästan alla dessa ligger under "org.junit.jupiter.api
@Test
-Visar att en metod är en testmetod


Standard test class
En test klass är en "static member class" eller "@nested class"
Som innehåller minst en test metod. Test klasser ska inte vara "abstract" och måste ha en constructor
Test Method
-any instance method that is directly annotated or meta-annotated with @test, @repeatedTest, @TestFactory etc
Lifecycle Method
-any method that is directly annotated or meta-annotated with @BeforeAll, @AfterAll, @BeforeEach, @AfterEach
Standard test class är en testklass som innehåller både test metoder och lifecycle metoder.
-Börjar med BeforeAll och BeforeEach så den testar innan alla, och innan varje.
-Därefter kör den fyra test metoder, en succeding, en failing, en skipped, och en aborted
-Sist kör den afterEach, och afterAll, samma princip som before

Assertion
Alla assertions är statiska metoder som ligger i "org.junit.jupiter.api.Assertions"
Assertion = påstående, assertion är olika scenarion man testar efter i en test metod, 
assertEquals kollar om (a, är samma som b)
assertTrue kollar om påståendet stämmer
assertNotNull(string) kollar så att det faktiskt finns text
assertAll, grupp av test, som testar alla assertions och alla fails rapporteras tillsammans
