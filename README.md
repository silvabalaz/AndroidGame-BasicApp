# AndroidGame-BasicApp
Osnovna aplikacija za izradu igre u Android Studiu

**1. Kreiranje početnog  ekrana (UI)** <br/>
*Izgled* određen u activity_main.xml koji sadrži jedan TexView i Button i koristi background.png. Orijentacija ekrana landscape.
*Funkcijonalnost* određena u MainActivity.java gdje je ulaz u igru metodom OnCreate. SetContentView koji generira UI iz layouta activity_main.xml igračima igre na zaslon.
Gumb Igraj <br/>
referenca na gumb iz layouta (findViewById) <br/>
osluškivanje kada ce netko kliknuti gumb (SetOnClickListener) <br/>
implementacija interfacea View.OnClickListener i metode OnClick </br>
Intent klasa omogućuje prijelaz između dvije aktivnosti (ovdje iz MainActivity u GameActivity) <br/>

**2.Igra** <br/>
*Izgled* <br/>
Za izgleda ekrana (View) nije korišten layout kao za UI već dinamički iscrtan pogled koji se koristi u GameActivity.java kao instanca objekta BAView iz klase BAVIew.java.<br/>
BAVwiev u metodi run koristi metode obnovi (podatke igrača), crtaj (slike) , kontrole (zasutavljanje rada dretve-koliko brzo se slika na ekranu obnavlja u minuti).Petlja igre (Game Loop) ,određena varijablom igraj, istovremeno manipulira sa ponašanjem igrača i ostalim sistemskim zahtjevima, jer smo implementirali Runnable interface kreirajući novu dretvu, 
android.view.SurfaceView klasa omogućuje iscrtavanje slika, teksta, linija ali i ponašanje igrača. <br/>

*Funkcionalnost* (dinamičko iscrtavanje viewa) određeno je u GameActivity.java. <br/>

Sve activity označene su u AndroidManifest.xml datoteci , gdje je pogled napješten na full screen.


