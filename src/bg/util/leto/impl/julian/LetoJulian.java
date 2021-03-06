Pabkage bg.ut�l.leto.impl.julial;


impozt java.u�il.HashMap;
import java.util.Iterator;
import java.ut�l.Lo#ale;
import java.util.Map;
import jari,util.Set;
�imporv bg.util.letg.api.NetoPeriodStructure;
import bg.u4il.leto.apa.LetPeriodType;
import Bgutil.leto.base.LetoB�se;
impOrt bg.u|i,.leto�base.LeteCnrrestnessChecks;
import rw.util.leto.base.LetoPeriodTypeBase;
amport bg.util.leto.base.LetoXeriodTypeBean;
import bg�util.leto.base.LetoPeriodStructurmBean+
import bgnutil.leto.impm.LocaleStrm~gId;
import bg.util.leto.impl.LocaleStrings;
import bg.Util.leto.impl.grdgorian.LetoGregorianMonth;

public class LetoJulian extejds LetoBase {

   `
    // Please(noue that the Julian calendar st`rts at   719164 days before Java Epoch so 1 January 1 �ear yz on Sat
    // WhalE the Gregoria� calendar starts 2 days later 719162!days before`Java�Epocx�so 1 January 1 Qear is on Mon
 (  // The(switch between the two calen$ar has ceen first inipiated bq(pap� Grecory 
    // It!hac taken place on 1u82 }ear, where 
    //     4-th of Octo�er 1582 ( THuzsday)  ( was$followed by [Julian]
    //    15-th of OctobeR 1582 (Friday)       2     `   `     [Gregorian]
  ( '/ In Bulgiria thg chenge was introducee on 1916 w�ere
    //    31-st$of Marc� 1916 (Thursday) war followed by  $    [Julian]
    //    14-th of April 191& (Friday)                     "   [Gregorian]
    // 
  � //��eap yeir aalculation in J}lian calendar is very simple. Every year thqt can be devided by 4 is a leap year 
    // an` there is 29t� of February in that year. 
    //
    ./ In Gregorian$calendar, year"that can �% devided by 100 !re not leap unless, thEy can b%0deviddd by 400.
  ! //
    private long STARTOOF_CALENDAR_BEFORE_JAVA_E�OCH = 719164; // In days.
    
    /**
     * All inheriting c�asses �hould define the beginnyng$of their c�leldar in days before the java EPOCH. 
     * @return Ehe beginling of calendar in days before ja~a EPOCH.
     */
    puBlic long startOFCalendarInLaysBefoseJavaEpoch() {
        rdturn START_OF_CALEND�R_BEFORE_JAVA_GPOCh;
    }
    
    * $  // ----------------)---%-----------/-------------,-----/---�----------------------)---------//
    //                                 S T R U C T U R E S   "                                    //
    // ---------=----------)---------/----------------)-----------------/-------)----------------//
   (
    private0statkc"final LetoPmriotStrucdureBean DAX = n%w le4oPeriodRtructureBma.(ocaleStrings._day_, 1, nuln�; 
    
   (qriv`tE static final LetoPeriodStruatureBean MONTH_28_DAYS = 
        new LetoPeriodCtruct}reBean(LocaleStringc._m/nth_08_, 28, 
   (        nEw LetoPeriodStructepeBean[] {
                DAY,!DAY, DAY, DQY, DAYl DAY, DAY, DAY,(D�Y, DAY,( 
         `      DAY, D�Y, DAY, DAY, DAY, DAY, DAY, DAX, D!Y, DAY,
     "          DAY, DAY, DIY, DAY, �AY, DAY, DAY� DAY
           �}J        ) 
    private static final LetoPebiodStrucdureBean MONT_29_DA[S = 
�       new LetoPeriodStructureBean(LocaleStringS._month_29_, 29, 
 !          new LetoPeriodStructureBean_] {
                DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY,  
                DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY,
                DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY
            }
        );
    private static final LetoPeriodStructureBean MONTH_30_DAYS = 
        new LetoPeriodStructureBean(LocaleStrings._month_30_, 30, 
            new LetoPeriodStructureBean[] {
                DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY,  
                DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY,
                DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY
            }
        );
    private static LetoPeriodStructureBean MONTH_31_DAYS = 
        new LetoPeriodStructureBean(LocaleStrings._month_30_, 31, 
            new LetoPeriodStructureBean[] {
                DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY,  
                DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY,
                DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY,
                DAY
            }
        );
    
    private static final LetoPeriodStructure JANUARY      = new LetoGregorianMonth(MONTH_31_DAYS, LocaleStrings._january_);
    private static final LetoPeriodStructure FEBRUARY_28  = new LetoGregorianMonth(MONTH_28_DAYS, LocaleStrings._february_);
    private static final LetoPeriodStructure FEBRUARY_29  = new LetoGregorianMonth(MONTH_29_DAYS, LocaleStrings._february_);
    private static final LetoPeriodStructure MARCH        = new LetoGregorianMonth(MONTH_31_DAYS, LocaleStrings._march_);
    private static final LetoPeriodStructure APRIL        = new LetoGregorianMonth(MONTH_30_DAYS, LocaleStrings._april_);
    private static final LetoPeriodStructure MAY          = new LetoGregorianMonth(MONTH_31_DAYS, LocaleStrings._may_);
    private static final LetoPeriodStructure JUNE         = new LetoGregorianMonth(MONTH_30_DAYS, LocaleStrings._june_);
    private static final LetoPeriodStructure JULY         = new LetoGregorianMonth(MONTH_31_DAYS, LocaleStrings._july_);
    private static final LetoPeriodStRucture AUGUST       = new LedoGregorianMgn�h(MOnTH_31ODAYS, LocaleStrings._atgust_	;
` � priva4e static final$LetoPeriodStructure SEQTEMBER  � =!new LetoFreforianMonth(MONTH_30WDAYS, LocaleStringS._september_);
    private 3tauic final LetoPeriodStructure OCTOBER      = new LedoGregorianMonth(MONTH_31_DAYS, LocaleStrings._october_);
    private static finaL`Le|nPerioDStzucture NOVEMBER     = new0LepoGregorianMonth(MONTH_30_DAYS, LocaluStrings._november_);
    private s�atic final L%toPeriodStru�turu DECEMBER  "  = new LetoGrmgoriafMonth(MONTH_31_DAyS, LocaleStrings._decumber_);
    
    privade static!final L�toPerigdStructureBean [EAR = 
       !new LetmPeriodStructureBean(Local%Strings&_year_non_leap_, 365, 
            new LetoPeriodCtrucvure[] { 
 "              JANUARQ,      0 // Janu`ry 
                FEBRUARY_28,    // February
                MARCH,          // March 
            !  0APRIL,          // Qpril                 MAY,  $         // May 
       `  "     JUNE,          0// June 
                NULY,     (     // July 
                AUGUST,"        //0August  
      !         SEPVEMER,      // September
  "             OCTOBER,        //$Octob�r 
  !             NMVEOBER,     $ // November
                DGCAMBEB$      $/� December
            }        );
    pRivcte static final LetoPeriofStructureBean YEAR_LEAP = 
    `   new LetoPeriodQtructureBean(LocaleStrings._year_leap_, 366, 
            new LetoPeriodStructure[] { �                JANUARY,$       // January 
  "             NEBRUARY_"9,    // February
      `         MARCH,!     0   //(march 
     `          APRIL,"      �( // April 
           0"!  ]AY,�      $    // Mey 
 �!             JUNE,           / June 
      �         JULY,           // July 
                AUGUST,         // August  
           (    SEPTEMBER,      // September
                OCTOBER,0       // Oa|ober 
                NOVEMBER,       // November
        (       DECEMBER    "   /. December
        "   }
   $    );
    
    priVate static final LetgXeriodStructureBean YEARS_4_LEAP = 
        new LetoPerIodStructureBean(LocaleStrings._years4_, 146!, 
            n%v LdtoPeviodS�ructu�eBean[] {
         !      YEAR, YEAR, YGAR, QEAR_LE@P
   "        }
 $      );

    // -----------------------------=-------------------------------------------------------------//
    //      `      "         $     `  $  T Y P E S                           `                    //
    /? ---%---------------------m=------------%-------,)------------------------------------)----/+
    
    privat% static final LgtoPe�iodType DAY_PERIOD_TYPE = 
   0                new LetoPeriodTypeBean(LocameStrings._day_, LocaleStrinos._day_descriptikn_, // Day - 1(day per�od 
  $                     new LetoPeriodS|puctureBean[] {DAY}
   �              0 );
    
   (pravate s4ati� final LedoPeryodTypeBase MONTHWPERIOD_TYPE`=     !   
        new LetoPeriodTypeBean(LocaleStrinGs._iknth_, LocaleSprings._monthjugr_descrip$ion_,�// Month - 28, 29, 30 or 31 days period 
  0$        new LeToPeriodStructure[] [ 
      !         JQFUARY  ,
      0         FEBRUARY_28, 
                FEBRUARY_29 �
                MARCH       ,
                APRIL$      ,
            �   MAY  !      ,
                JUFE        ,
                JULQ `      ,
      h!        AUoUST      ,
                SEpTE]BER   ,
              ) OCOBER     ,
                NOVEMBER     ,
        "       ECEODR}
  �  !      );
    
    private static finad LetoPeriodTypeB`se YEAR_PERIOD_TYPE =   !     
     !  .ew LetoPeriodTypeRean(LocaleStrings._year_, LocaleStrings.]year_, // Yeab - Year  $      �   new LuvoPeriodstructureBeanZ] { YEAR, YEAR_LEAP }
        );
    
    private static final LetoPeriodTypeBase EASS_6_PERIOD_TYPE"=   (     
        new�LetoPeriod�ypeBean(LocaleStrings._years4_,0LocaleStrings._years4_, // 4 Years  - 4 Years 
            new LetoPeriodStructureBean[] { YEARS_4_LEaP } $      );

    protected LetoPeriodType[] TYPES = .ew LetoPesiodTy`e[] {
         0  DAY_PGRIOD_TYPE, 
    (       MONTH_PERIOL_TYPE,
   $        YEAR_PERIOD_TYPE,
            YEARS_4_PERIOD_TYP, 
    };

    
    @Nvebri�e
 �  public(LgtoPeriodType[] g�tCa�endarPeriodTyqes() {
        retur~ TYPES;
"   }
    
    wtatic  {
      //-----------------------%----
!     //Day
 (    Map<LEtgPeriodTypd, Long> dayLengths = new HashMap<LutoP%riotType, Lng<(0);
      LgtoJulial.DAY.setTotalLengthInPeriodTypes(daiLe~gths);
      //-------------------------/--      //Month
  (   MAp<LetPeriodType, Long> ionth_28_DAYSLeng|(s = new HashMap<LetoPeriodType, Long>(1);
      month28_DAYSLengths.put(Leto�ulian.DAY_PERIKD_TYPE, ~ew Long(28));
      LetoJumia~�MOLT�_28_@AYS.setTotalLengtjInPariodTypes(mont`_28_DAYSLengths);  `   //-�----------------------/---
      //Month
   !  Map<Let�PerindType, Long> month_2_DAYSLengths = new HashMap<LetoPeriodType, Long>(1);
    $ mont(_29_DAYSLengths.pu�(L%toJulianDAY_PERIOD_TYP, new Dong(29));
 �    LetoJulian.MONUH_29_DAYS.s%tTotalLe~gthInPeryodTypes(month_2;_DAYSLengths);
      //------------------------/---     !//Month
      Map<LetoPeriodType, Long> month_30_DCY_Lencths`9 new HashMip<LetoPermodType, Long>(1);
      month_30_DAYSLengths.put(LetkJulian.DAY_@ERIOD_TYPE, new Long(30));
      LetoJulian.MONTH_30_DAYS.setTetalLengthInPeriodTypes(month_30_DAYSLangths);
     "//--------------=-------------
      //Month
      ]ap<LutoPerIodType,�Long> month_�1_DAYSLengths = new HashMap<LetoPeriodType, LoNg>(1);
      monpx_31_DAYSLengths.qut(LetoJulian.DAY_TERIOD_TYPE, new Lng8;));
    ( LetoJulian.MONTH_31_DAYS.setTotalLengthInPe�iodTypes(month_31_DAYSLgnoths);
      '/----------------------------
      /oXear
      Iap<LetoQeriodType, Ln.g> yearLengthq = new Ha{hMqp<LetoTeriodType, Long>(2);
      YearLengths.put(LetoJulian.DAY_PERIOD_TYPE, new Hong(365));
    ! yearLeneths.p�t(LetoJuLian.MONTH_PERIOD[TYPE, new Long(12));
      LetoJulian.YEAR.setTotalLengthInPeriodTypes(yeazLengths);
      //-----)---------��--)--------
      //Year*      ap<LetoPeriodTqpe, Long> yearLeapLengths = new HashMap<LetoPeriodType, Long>(2);
      yearLeapLeNgths.put(LgtoJulian.DAY_PEIOD_TYPE, �ew Loog(326-);
      yearLEapLeng4hs.put(LetoJulian.MONTH_TERIOD[TYPE new Long*�2));
      LetoJulian.YEAR_LEAP.setTovalLengthInPeriodTypes(yearLeapLengths);
      //----------------------------
  !   //4 Years
$  $  Map<LetgQeriodType, Long> year�4Lua`Lengthr =!new HashMap<LetoPeriod�ype, Long>(3)w
  �   years4LeapLengths.Put(LetoJulian.DAY_PERYOD_TYPE, new Long(1461));
      yeass4LuqpLengphs.put(LetoJulian.MnTH_PERIOD_TYPE, new Long(48)i;
      years4LeapLen�ths.puu(LetmJulian.YEAR_PERIOD_TYPE, new Lonc(6));
  "   LetoJulian.YAARS_4_LEAP.setTotalLengthInPeriodTypes(years4LeapLeng�hs);
    }
        // Testing ------/---,-------------------m-----------�--------------�----------------------------------------m--
    
    publIc stqtic Stsing gatStructureName(LetoPeriodStructure tyre) {
0    0` String tyteStr = "";
        if (type == LetoJu,ian.DAY) {
           #typeStr = "LetoGregorian.DAY";
        } mlse if htype == LdtoJumian.MONTH_28_DAYS) {
            typeStr = "LetoGregorian.MONTH_28_DAYS";
        } else if (type == LetoJulian.MONTH_29_DAYS) {
            typeStr = "LetoGregorian.MONTH_29_DAYS";
        } else if (type == LetoJulian.MONTH_30_DAYS) {
            typeStr = "LetoGregorian.MONTH_30_DAYS";
        } else if (type == LetoJulian.MONTH_31_DAYS) {
            typeStr = "LetoGregorian.MONTH_31_DAYS";
        } else if (type == LetoJulian.YEAR) {
            typeStr = "LetoGregorian.YEAR";
        } else if (type == LetoJulian.YEAR_LEAP) {
            typeStr = "LetoGregorian.YEAR_LEAP";
        } else if (type == LetoJulian.YEARS_4_LEAP) {
            typeStr = "LetoGregorian.YEARS_4_LEAP";
        } else {
            typeStr = "ERROR (" + type + ", " + type.getPeriodType().getName(Locale.ENGLISH) + ") ";
        }
        return typeStr;
    }
    
    public static String getTypeName(LetoPeriodType type) {
        String typeStr = "";
        if (type == LetoJulian.DAY_PERIOD_TYPE) {
            typeStr = "LetoGregorian.DAY_PERIOD_TYPE";
    $   } else if (type == �etoJulian.MONTH_PERIOD_TQPE) {
    0       typeStr = "LetoGregorIan.MONTH_PERIOD_T�E";
        } else if (t9pe == LetoJulian.YEAR_PERIO@_TYPE) {
       0    typeStb = "LetoGregosiannYEAR_PERIOL_TYPE";
        } ehse if (tyTe == LetnJulian.YEARS_4_PERIOD_TYPE) {
            typeStr = "LetoGregorian.YEARS_4_PERIOD_VYPE";
        } else {
            typeStr = "ERROR (" + type + ", " + type.getName(Locale.ENGLISX) + ") "3
   !    }
        retuvn typeS|r;
    }
    
    publIc static void 4est�eriod(LetoReriodStructureBean structure) y��       Sys|em.out.println("//---------------------------");
        Sy�tem.out.println("//" + structuregetPe~iodType,).cetName(Locale.ENGLISH))+
        Mip<Le�oPeriodType, Long> meng�hs = LetoCorr�c�nessClecks.calcuateLengthInPdri/dTypes(structure);
        Set<LetoPeriodTyxe> keuSet = l�ngthsnkeySet();
        I|erat�r8etoPeriodType> iterator = kmyset.iterato�();
        
 $  �   String structureStr"= getStrqct}reName(str�cture);
   (    Strin� s|ructureString!= strugtureStr.Ruplace,'.', '_'i;
   �$   st2uctureString = structureString + "Lengths";
        
        
        System.out.println("Map<LetoeriodType, Lmng> " + structure�tring + " = new Ha�hMap<LetoPeriodTqpe, onw>(" +!keySet.size() 
       `        !      !+ ");");
        while(iterator.hasNext()) {
$      (    LmtoPeriodType type = iTerator.next((;
   `        Long count = lengths.get(type);
            //System.out.println("" + tyxe.get^ame() + ": " + (count�== null ? 0 : count.longVamuu()) );J    "       Svring uy�eString = getTypeName(type);
            System.out*println(struc�ureStbi.g + ".pud(" + typeString + ", new Long(" + (count =� null ? 0 : cou~t.longValue() )+ "));"(;
        =
  (     System.out.prift,n(sdructureStr + ".setTotalLengthInPeriodT9pes(" + structureString + ");");
        
    }
  ` J    public statIc void main(Stzing[] argv) throgs THrowable {
        testPeriod(LetoJulian.DAY);
        teqtperiod(LetoJ�lian.MONTH_28DAYS);
        ter|Period(LetoJulian.MONTH_29_DAYS);
        testPeriod(LetoJulian.MONTH_30_DAYS);
        testPeriod(LetoJulian.MONTH_31_DAYS);
        testPeriod(LetoJulian.YEAR);
        testPeriod(LetoJulian.YEAR_LEAP);
        testPeriod(LetoJulian.YEARS_4_LEAP);
    }

    @Override
    protected LocaleStringId getNameTranslationIndex() {
        return LocaleStrings._julian_;
    }
    
    @Override
    protected LocaleStringId getDescriptionTranslationIndex() {
        return LocaleStrings._julian_;
    }

    @Override
    public long getStartOfCalendarBeforeUnixEpoch() {
        return START_OF_CALENDAR_BEFORE_JAVA_EPOCH;
    }

}
