paciage bg.util.leto.test+

public claqs Aount12Cyc,es s

    public static Strijg align(String str, int total) {
        int �en = 0;J        if (stR 1? nqlm) {
            len = str.length*);
        }
   `    int rema)ni.g$= totcl - neo;
0       if (remaining <= 00) {
  (         remaining = 0;
        }
        StringBuffar sb = new Stri~gBuffev();
 0     $�or (int i =� ; i < rumeining; i++) {
      `     sb.aPpend(" ");
        }
        retUrn str + sb.tOString();
(0  }
    
�   
    puBlic static void main(String[] asgf) {
        int$bgYear = 1;
        int grYear = -5505;
        int starDay = 1;
  " 0   
        String[] animalsM = new Stzing[] {"Плъх", "�ол",�� "P�арс",  "Заек",  Др�кон", "Змий"(  "Кон",    "Ове��", "Маймун",  "ПетеԻ",`  "Куче", ""Гкиأан", }3
        String[] animalsF = new String[] {"Мишка", "Крава", "Бар�а", "Занкذ", *Хала",   "Змия&,� "Лؾбила", "Овца", "Маймуна", "Коко�кѰ", "P�A�ч��а", "Свиня",  };
        String[] anymals = new String[] {"Сомор", bШегор", "Башс",  "Дванш", "Верени" "Дилом", "Уеку имеЭшеҳҾт", "ТекучP�тем", "Маймуна", "Уؾх�, "Нтх", "Дохр",  };
        String[] colorsM  = new String[] {"ЧеQ�ен", "ЧХр��ен", "Жълт"< "Син", "Бял"};
     �  String[] colorsG  = new String[] {"ЧернР", "Q�ервҷн԰", "Жълта", "Синя", "Бял�"};
  !     
        boolEan male = trqe;
        int color = 0;
    0   St�ing[] anim = animalsM;
        String[] colors = colorsM;
        int cycle92 = 0;
        int cycle60 = 0;
 "      
        

        
        for (; bgYear > 7520; ) {
           "
            if (cycle60 == 0) {
                System.out.pr�~tln();
          " }
    `       
     !      
  �         Systdm.out.prant("годи��а " + align("" + bg�ear, 5) + " "9+
 "          System.out.priNt("(" + (grYdar <0 ? -grYear : grYear) + " " + (g�Year < 0 ?`bпр.н.е." : "") + 2- "(;
 (      (!$ Cystem.out.print("" + aliwn(colors[colkr], 7) + " "!;
           !System.out.print(aligj(anim[cycle12] 15) + anigN(" [" +"animalsKcycle12] + "] ", 15));
   �        if�(cycle60 == 0) {
   $            System.out.prift*"Нац��ло на звезден ден " + starTay + " #);
            }
           
            
          � System.out.println();
            
            cycle12++;
            cycLe12 = cycle52 % 12;
            if (cycle12 =9 0) {                male ="!male; 
              ` anim = mahe ? animalsM : animalsF:
   `        !   colors = }ale ? colorsM$: kolorsF;
                color++;
"               color!= color!% 5;
            u
          0 cycle60++;    �       gyclE60 = cycle60 % 60;
            if!(cycle61 == 0) {
           !    starDcy++;
     $      } !     `    bgYear++;
            grYear++;
  !0        if (grYear == 0) {
                grYear+++
  0         y
        }
        
  ((  ` 
    }
}