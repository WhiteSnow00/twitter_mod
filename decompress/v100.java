import java.util.Iterator;
import java.util.regex.PatternSyntaxException;
import java.util.regex.Pattern;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.math.BigDecimal;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class v100
{
    public final String a;
    public final int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;
    
    public v100(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public static Boolean d(final BigDecimal p0, final i1z p1, final double p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "null reference"
        //     3: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //     6: pop            
        //     7: aload_1        
        //     8: invokevirtual   i1z.y:()Z
        //    11: istore          5
        //    13: aconst_null    
        //    14: astore          13
        //    16: iload           5
        //    18: ifeq            489
        //    21: aload_1        
        //    22: invokevirtual   i1z.D:()I
        //    25: istore          4
        //    27: iconst_1       
        //    28: istore          5
        //    30: iconst_1       
        //    31: istore          8
        //    33: iconst_1       
        //    34: istore          7
        //    36: iconst_1       
        //    37: istore          9
        //    39: iconst_1       
        //    40: istore          6
        //    42: iload           4
        //    44: iconst_1       
        //    45: if_icmpne       51
        //    48: goto            489
        //    51: aload_1        
        //    52: invokevirtual   i1z.D:()I
        //    55: iconst_5       
        //    56: if_icmpne       78
        //    59: aload_1        
        //    60: invokevirtual   i1z.C:()Z
        //    63: ifeq            76
        //    66: aload_1        
        //    67: invokevirtual   i1z.B:()Z
        //    70: ifeq            76
        //    73: goto            87
        //    76: aconst_null    
        //    77: areturn        
        //    78: aload_1        
        //    79: invokevirtual   i1z.z:()Z
        //    82: ifne            87
        //    85: aconst_null    
        //    86: areturn        
        //    87: aload_1        
        //    88: invokevirtual   i1z.D:()I
        //    91: istore          4
        //    93: aload_1        
        //    94: invokevirtual   i1z.D:()I
        //    97: iconst_5       
        //    98: if_icmpne       159
        //   101: aload_1        
        //   102: invokevirtual   i1z.w:()Ljava/lang/String;
        //   105: invokestatic    upz.L:(Ljava/lang/String;)Z
        //   108: ifeq            157
        //   111: aload_1        
        //   112: invokevirtual   i1z.v:()Ljava/lang/String;
        //   115: invokestatic    upz.L:(Ljava/lang/String;)Z
        //   118: ifne            124
        //   121: goto            157
        //   124: new             Ljava/math/BigDecimal;
        //   127: astore          12
        //   129: aload           12
        //   131: aload_1        
        //   132: invokevirtual   i1z.w:()Ljava/lang/String;
        //   135: invokespecial   java/math/BigDecimal.<init>:(Ljava/lang/String;)V
        //   138: new             Ljava/math/BigDecimal;
        //   141: dup            
        //   142: aload_1        
        //   143: invokevirtual   i1z.v:()Ljava/lang/String;
        //   146: invokespecial   java/math/BigDecimal.<init>:(Ljava/lang/String;)V
        //   149: astore          11
        //   151: aconst_null    
        //   152: astore          10
        //   154: goto            190
        //   157: aconst_null    
        //   158: areturn        
        //   159: aload_1        
        //   160: invokevirtual   i1z.u:()Ljava/lang/String;
        //   163: invokestatic    upz.L:(Ljava/lang/String;)Z
        //   166: ifne            171
        //   169: aconst_null    
        //   170: areturn        
        //   171: new             Ljava/math/BigDecimal;
        //   174: dup            
        //   175: aload_1        
        //   176: invokevirtual   i1z.u:()Ljava/lang/String;
        //   179: invokespecial   java/math/BigDecimal.<init>:(Ljava/lang/String;)V
        //   182: astore          10
        //   184: aconst_null    
        //   185: astore          12
        //   187: aconst_null    
        //   188: astore          11
        //   190: iload           4
        //   192: iconst_5       
        //   193: if_icmpne       207
        //   196: aload           13
        //   198: astore_1       
        //   199: aload           12
        //   201: ifnull          462
        //   204: goto            218
        //   207: aload           10
        //   209: ifnonnull       218
        //   212: aload           13
        //   214: astore_1       
        //   215: goto            462
        //   218: iinc            4, -1
        //   221: iload           4
        //   223: iconst_1       
        //   224: if_icmpeq       454
        //   227: iload           4
        //   229: iconst_2       
        //   230: if_icmpeq       418
        //   233: iload           4
        //   235: iconst_3       
        //   236: if_icmpeq       296
        //   239: iload           4
        //   241: iconst_4       
        //   242: if_icmpeq       251
        //   245: aload           13
        //   247: astore_1       
        //   248: goto            462
        //   251: aload           13
        //   253: astore_1       
        //   254: aload           12
        //   256: ifnull          462
        //   259: aload_0        
        //   260: aload           12
        //   262: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   265: iflt            284
        //   268: aload_0        
        //   269: aload           11
        //   271: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   274: ifgt            284
        //   277: iload           6
        //   279: istore          5
        //   281: goto            287
        //   284: iconst_0       
        //   285: istore          5
        //   287: iload           5
        //   289: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   292: astore_1       
        //   293: goto            462
        //   296: aload           10
        //   298: ifnonnull       307
        //   301: aload           13
        //   303: astore_1       
        //   304: goto            462
        //   307: dload_2        
        //   308: dconst_0       
        //   309: dcmpl          
        //   310: ifeq            390
        //   313: aload_0        
        //   314: aload           10
        //   316: new             Ljava/math/BigDecimal;
        //   319: dup            
        //   320: dload_2        
        //   321: invokespecial   java/math/BigDecimal.<init>:(D)V
        //   324: new             Ljava/math/BigDecimal;
        //   327: dup            
        //   328: iconst_2       
        //   329: invokespecial   java/math/BigDecimal.<init>:(I)V
        //   332: invokevirtual   java/math/BigDecimal.multiply:(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
        //   335: invokevirtual   java/math/BigDecimal.subtract:(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
        //   338: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   341: ifle            378
        //   344: aload_0        
        //   345: aload           10
        //   347: new             Ljava/math/BigDecimal;
        //   350: dup            
        //   351: dload_2        
        //   352: invokespecial   java/math/BigDecimal.<init>:(D)V
        //   355: new             Ljava/math/BigDecimal;
        //   358: dup            
        //   359: iconst_2       
        //   360: invokespecial   java/math/BigDecimal.<init>:(I)V
        //   363: invokevirtual   java/math/BigDecimal.multiply:(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
        //   366: invokevirtual   java/math/BigDecimal.add:(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
        //   369: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   372: ifge            378
        //   375: goto            381
        //   378: iconst_0       
        //   379: istore          5
        //   381: iload           5
        //   383: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   386: astore_1       
        //   387: goto            462
        //   390: aload_0        
        //   391: aload           10
        //   393: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   396: ifne            406
        //   399: iload           8
        //   401: istore          5
        //   403: goto            409
        //   406: iconst_0       
        //   407: istore          5
        //   409: iload           5
        //   411: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   414: astore_1       
        //   415: goto            462
        //   418: aload           10
        //   420: ifnonnull       429
        //   423: aload           13
        //   425: astore_1       
        //   426: goto            462
        //   429: aload_0        
        //   430: aload           10
        //   432: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   435: ifle            445
        //   438: iload           7
        //   440: istore          5
        //   442: goto            448
        //   445: iconst_0       
        //   446: istore          5
        //   448: iload           5
        //   450: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   453: areturn        
        //   454: aload           10
        //   456: ifnonnull       464
        //   459: aload           13
        //   461: astore_1       
        //   462: aload_1        
        //   463: areturn        
        //   464: aload_0        
        //   465: aload           10
        //   467: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   470: ifge            480
        //   473: iload           9
        //   475: istore          5
        //   477: goto            483
        //   480: iconst_0       
        //   481: istore          5
        //   483: iload           5
        //   485: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   488: areturn        
        //   489: aconst_null    
        //   490: areturn        
        //   491: astore_0       
        //   492: goto            157
        //   495: astore_0       
        //   496: goto            489
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  124    151    491    495    Ljava/lang/NumberFormatException;
        //  171    184    495    499    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0171:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static Boolean e(final String s, final j2z j2z, final o3z o3z) {
        Objects.requireNonNull(j2z, "null reference");
        final Boolean b = null;
        if (s == null) {
            return null;
        }
        Boolean b2 = b;
        if (j2z.A()) {
            if (j2z.B() == 1) {
                b2 = b;
            }
            else {
                if (j2z.B() == 7) {
                    if (j2z.s() == 0) {
                        return null;
                    }
                }
                else if (!j2z.z()) {
                    return null;
                }
                final int b3 = j2z.B();
                final boolean x = j2z.x();
                String s2;
                if (!x && b3 != 2 && b3 != 7) {
                    s2 = j2z.v().toUpperCase(Locale.ENGLISH);
                }
                else {
                    s2 = j2z.v();
                }
                List<Object> list;
                if (j2z.s() == 0) {
                    list = null;
                }
                else {
                    final List list2 = list = j2z.w();
                    if (!x) {
                        final ArrayList list3 = new ArrayList<String>(list2.size());
                        final Iterator iterator = list2.iterator();
                        while (iterator.hasNext()) {
                            list3.add(((String)iterator.next()).toUpperCase(Locale.ENGLISH));
                        }
                        list = Collections.unmodifiableList((List<?>)list3);
                    }
                }
                String s3;
                if (b3 == 2) {
                    s3 = s2;
                }
                else {
                    s3 = null;
                }
                if (b3 == 7) {
                    b2 = b;
                    if (list == null) {
                        return b2;
                    }
                    b2 = b;
                    if (list.isEmpty()) {
                        return b2;
                    }
                }
                else if (s2 == null) {
                    b2 = b;
                    return b2;
                }
                String upperCase = s;
                if (!x) {
                    upperCase = s;
                    if (b3 != 2) {
                        upperCase = s.toUpperCase(Locale.ENGLISH);
                    }
                }
                switch (b3 - 1) {
                    default: {
                        b2 = b;
                        break;
                    }
                    case 6: {
                        if (list == null) {
                            b2 = b;
                            break;
                        }
                        b2 = list.contains(upperCase);
                        break;
                    }
                    case 5: {
                        b2 = upperCase.equals(s2);
                        break;
                    }
                    case 4: {
                        b2 = upperCase.contains(s2);
                        break;
                    }
                    case 3: {
                        b2 = upperCase.endsWith(s2);
                        break;
                    }
                    case 2: {
                        b2 = upperCase.startsWith(s2);
                        break;
                    }
                    case 1: {
                        if (s3 == null) {
                            b2 = b;
                            break;
                        }
                        int n;
                        if (!x) {
                            n = 66;
                        }
                        else {
                            n = 0;
                        }
                        try {
                            b2 = Pattern.compile(s3, n).matcher(upperCase).matches();
                        }
                        catch (final PatternSyntaxException ex) {
                            b2 = b;
                            if (o3z != null) {
                                o3z.N0.b("Invalid regular expression in REGEXP audience filter. expression", (Object)s3);
                                b2 = b;
                            }
                        }
                        break;
                    }
                }
            }
        }
        return b2;
    }
    
    public static Boolean f(final long n, final i1z i1z) {
        try {
            return d(new BigDecimal(n), i1z, 0.0);
        }
        catch (final NumberFormatException ex) {
            return null;
        }
    }
    
    public static Boolean g(final String s, final i1z i1z) {
        if (!upz.L(s)) {
            return null;
        }
        try {
            return d(new BigDecimal(s), i1z, 0.0);
        }
        catch (final NumberFormatException ex) {
            return null;
        }
    }
    
    public static Boolean h(final Boolean b, final boolean b2) {
        if (b == null) {
            return null;
        }
        return b != b2;
    }
    
    public abstract int a();
    
    public abstract boolean b();
    
    public abstract boolean c();
}
