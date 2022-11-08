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

public abstract class k000
{
    public final String a;
    public final int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;
    
    public k000(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public static Boolean d(final BigDecimal p0, final uzy p1, final double p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "null reference"
        //     3: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //     6: pop            
        //     7: aload_1        
        //     8: invokevirtual   uzy.y:()Z
        //    11: istore          4
        //    13: aconst_null    
        //    14: astore          5
        //    16: iload           4
        //    18: ifeq            490
        //    21: aload_1        
        //    22: invokevirtual   uzy.D:()I
        //    25: istore          6
        //    27: iconst_1       
        //    28: istore          7
        //    30: iconst_1       
        //    31: istore          8
        //    33: iconst_1       
        //    34: istore          9
        //    36: iconst_1       
        //    37: istore          10
        //    39: iconst_1       
        //    40: istore          4
        //    42: iload           6
        //    44: iconst_1       
        //    45: if_icmpne       51
        //    48: goto            490
        //    51: aload_1        
        //    52: invokevirtual   uzy.D:()I
        //    55: iconst_5       
        //    56: if_icmpne       78
        //    59: aload_1        
        //    60: invokevirtual   uzy.C:()Z
        //    63: ifeq            76
        //    66: aload_1        
        //    67: invokevirtual   uzy.B:()Z
        //    70: ifeq            76
        //    73: goto            87
        //    76: aconst_null    
        //    77: areturn        
        //    78: aload_1        
        //    79: invokevirtual   uzy.z:()Z
        //    82: ifne            87
        //    85: aconst_null    
        //    86: areturn        
        //    87: aload_1        
        //    88: invokevirtual   uzy.D:()I
        //    91: istore          6
        //    93: aload_1        
        //    94: invokevirtual   uzy.D:()I
        //    97: iconst_5       
        //    98: if_icmpne       159
        //   101: aload_1        
        //   102: invokevirtual   uzy.w:()Ljava/lang/String;
        //   105: invokestatic    hoz.L:(Ljava/lang/String;)Z
        //   108: ifeq            157
        //   111: aload_1        
        //   112: invokevirtual   uzy.v:()Ljava/lang/String;
        //   115: invokestatic    hoz.L:(Ljava/lang/String;)Z
        //   118: ifne            124
        //   121: goto            157
        //   124: new             Ljava/math/BigDecimal;
        //   127: astore          11
        //   129: aload           11
        //   131: aload_1        
        //   132: invokevirtual   uzy.w:()Ljava/lang/String;
        //   135: invokespecial   java/math/BigDecimal.<init>:(Ljava/lang/String;)V
        //   138: new             Ljava/math/BigDecimal;
        //   141: dup            
        //   142: aload_1        
        //   143: invokevirtual   uzy.v:()Ljava/lang/String;
        //   146: invokespecial   java/math/BigDecimal.<init>:(Ljava/lang/String;)V
        //   149: astore          12
        //   151: aconst_null    
        //   152: astore          13
        //   154: goto            191
        //   157: aconst_null    
        //   158: areturn        
        //   159: aload_1        
        //   160: invokevirtual   uzy.u:()Ljava/lang/String;
        //   163: invokestatic    hoz.L:(Ljava/lang/String;)Z
        //   166: ifne            171
        //   169: aconst_null    
        //   170: areturn        
        //   171: new             Ljava/math/BigDecimal;
        //   174: dup            
        //   175: aload_1        
        //   176: invokevirtual   uzy.u:()Ljava/lang/String;
        //   179: invokespecial   java/math/BigDecimal.<init>:(Ljava/lang/String;)V
        //   182: astore          13
        //   184: aconst_null    
        //   185: astore          11
        //   187: aload           11
        //   189: astore          12
        //   191: iload           6
        //   193: iconst_5       
        //   194: if_icmpne       208
        //   197: aload           5
        //   199: astore_1       
        //   200: aload           11
        //   202: ifnull          463
        //   205: goto            219
        //   208: aload           13
        //   210: ifnonnull       219
        //   213: aload           5
        //   215: astore_1       
        //   216: goto            463
        //   219: iinc            6, -1
        //   222: iload           6
        //   224: iconst_1       
        //   225: if_icmpeq       455
        //   228: iload           6
        //   230: iconst_2       
        //   231: if_icmpeq       419
        //   234: iload           6
        //   236: iconst_3       
        //   237: if_icmpeq       293
        //   240: iload           6
        //   242: iconst_4       
        //   243: if_icmpeq       252
        //   246: aload           5
        //   248: astore_1       
        //   249: goto            463
        //   252: aload           5
        //   254: astore_1       
        //   255: aload           11
        //   257: ifnull          463
        //   260: aload_0        
        //   261: aload           11
        //   263: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   266: iflt            281
        //   269: aload_0        
        //   270: aload           12
        //   272: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   275: ifgt            281
        //   278: goto            284
        //   281: iconst_0       
        //   282: istore          4
        //   284: iload           4
        //   286: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   289: astore_1       
        //   290: goto            463
        //   293: aload           13
        //   295: ifnonnull       304
        //   298: aload           5
        //   300: astore_1       
        //   301: goto            463
        //   304: dload_2        
        //   305: dconst_0       
        //   306: dcmpl          
        //   307: ifeq            391
        //   310: aload_0        
        //   311: aload           13
        //   313: new             Ljava/math/BigDecimal;
        //   316: dup            
        //   317: dload_2        
        //   318: invokespecial   java/math/BigDecimal.<init>:(D)V
        //   321: new             Ljava/math/BigDecimal;
        //   324: dup            
        //   325: iconst_2       
        //   326: invokespecial   java/math/BigDecimal.<init>:(I)V
        //   329: invokevirtual   java/math/BigDecimal.multiply:(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
        //   332: invokevirtual   java/math/BigDecimal.subtract:(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
        //   335: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   338: ifle            379
        //   341: aload_0        
        //   342: aload           13
        //   344: new             Ljava/math/BigDecimal;
        //   347: dup            
        //   348: dload_2        
        //   349: invokespecial   java/math/BigDecimal.<init>:(D)V
        //   352: new             Ljava/math/BigDecimal;
        //   355: dup            
        //   356: iconst_2       
        //   357: invokespecial   java/math/BigDecimal.<init>:(I)V
        //   360: invokevirtual   java/math/BigDecimal.multiply:(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
        //   363: invokevirtual   java/math/BigDecimal.add:(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
        //   366: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   369: ifge            379
        //   372: iload           7
        //   374: istore          4
        //   376: goto            382
        //   379: iconst_0       
        //   380: istore          4
        //   382: iload           4
        //   384: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   387: astore_1       
        //   388: goto            463
        //   391: aload_0        
        //   392: aload           13
        //   394: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   397: ifne            407
        //   400: iload           8
        //   402: istore          4
        //   404: goto            410
        //   407: iconst_0       
        //   408: istore          4
        //   410: iload           4
        //   412: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   415: astore_1       
        //   416: goto            463
        //   419: aload           13
        //   421: ifnonnull       430
        //   424: aload           5
        //   426: astore_1       
        //   427: goto            463
        //   430: aload_0        
        //   431: aload           13
        //   433: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   436: ifle            446
        //   439: iload           9
        //   441: istore          4
        //   443: goto            449
        //   446: iconst_0       
        //   447: istore          4
        //   449: iload           4
        //   451: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   454: areturn        
        //   455: aload           13
        //   457: ifnonnull       465
        //   460: aload           5
        //   462: astore_1       
        //   463: aload_1        
        //   464: areturn        
        //   465: aload_0        
        //   466: aload           13
        //   468: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   471: ifge            481
        //   474: iload           10
        //   476: istore          4
        //   478: goto            484
        //   481: iconst_0       
        //   482: istore          4
        //   484: iload           4
        //   486: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   489: areturn        
        //   490: aconst_null    
        //   491: areturn        
        //   492: astore_0       
        //   493: goto            157
        //   496: astore_0       
        //   497: goto            490
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  124    151    492    496    Ljava/lang/NumberFormatException;
        //  171    184    496    500    Ljava/lang/NumberFormatException;
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
    
    public static Boolean e(final String s, final v0z v0z, final b2z b2z) {
        Objects.requireNonNull(v0z, "null reference");
        final Boolean b = null;
        if (s == null) {
            return null;
        }
        Boolean b2 = b;
        if (v0z.A()) {
            if (v0z.B() == 1) {
                b2 = b;
            }
            else {
                if (v0z.B() == 7) {
                    if (v0z.s() == 0) {
                        return null;
                    }
                }
                else if (!v0z.z()) {
                    return null;
                }
                final int b3 = v0z.B();
                final boolean x = v0z.x();
                String s2;
                if (!x && b3 != 2 && b3 != 7) {
                    s2 = v0z.v().toUpperCase(Locale.ENGLISH);
                }
                else {
                    s2 = v0z.v();
                }
                List<Object> list;
                if (v0z.s() == 0) {
                    list = null;
                }
                else {
                    final List list2 = list = v0z.w();
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
                            if (b2z != null) {
                                b2z.K0.b("Invalid regular expression in REGEXP audience filter. expression", (Object)s3);
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
    
    public static Boolean f(final long n, final uzy uzy) {
        try {
            return d(new BigDecimal(n), uzy, 0.0);
        }
        catch (final NumberFormatException ex) {
            return null;
        }
    }
    
    public static Boolean g(final String s, final uzy uzy) {
        if (!hoz.L(s)) {
            return null;
        }
        try {
            return d(new BigDecimal(s), uzy, 0.0);
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
