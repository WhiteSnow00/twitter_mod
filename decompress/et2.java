import java.io.IOException;
import java.util.List;
import java.util.Map;
import android.net.Uri;
import com.google.android.exoplayer2.source.k;

// 
// Decompiled by Procyon v0.6.0
// 

public final class et2 implements k
{
    public final pna a;
    public ina b;
    public pg8 c;
    
    public et2(final pna a) {
        this.a = a;
    }
    
    public final long a() {
        final pg8 c = this.c;
        long d;
        if (c != null) {
            d = c.d;
        }
        else {
            d = -1L;
        }
        return d;
    }
    
    public final void b(final h78 p0, final Uri p1, final Map<String, List<String>> p2, final long p3, final long p4, final nna p5) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_1        
        //     5: lload           4
        //     7: lload           6
        //     9: invokespecial   pg8.<init>:(Lh78;JJ)V
        //    12: astore_1       
        //    13: aload_0        
        //    14: aload_1        
        //    15: putfield        et2.c:Lpg8;
        //    18: aload_0        
        //    19: getfield        et2.b:Lina;
        //    22: ifnull          26
        //    25: return         
        //    26: aload_0        
        //    27: getfield        et2.a:Lpna;
        //    30: aload_2        
        //    31: aload_3        
        //    32: invokeinterface pna.e:(Landroid/net/Uri;Ljava/util/Map;)[Lina;
        //    37: astore_3       
        //    38: aload_3        
        //    39: arraylength    
        //    40: istore          9
        //    42: iconst_0       
        //    43: istore          10
        //    45: iconst_1       
        //    46: istore          13
        //    48: iload           9
        //    50: iconst_1       
        //    51: if_icmpne       64
        //    54: aload_0        
        //    55: aload_3        
        //    56: iconst_0       
        //    57: aaload         
        //    58: putfield        et2.b:Lina;
        //    61: goto            346
        //    64: aload_3        
        //    65: arraylength    
        //    66: istore          11
        //    68: iconst_0       
        //    69: istore          9
        //    71: iload           9
        //    73: iload           11
        //    75: if_icmpge       220
        //    78: aload_3        
        //    79: iload           9
        //    81: aaload         
        //    82: astore          14
        //    84: aload           14
        //    86: aload_1        
        //    87: invokeinterface ina.b:(Ljna;)Z
        //    92: ifeq            109
        //    95: aload_0        
        //    96: aload           14
        //    98: putfield        et2.b:Lina;
        //   101: aload_1        
        //   102: iconst_0       
        //   103: putfield        pg8.f:I
        //   106: goto            220
        //   109: aload_0        
        //   110: getfield        et2.b:Lina;
        //   113: ifnonnull       201
        //   116: aload_1        
        //   117: getfield        pg8.d:J
        //   120: lload           4
        //   122: lcmp           
        //   123: ifne            195
        //   126: goto            201
        //   129: astore_2       
        //   130: iload           13
        //   132: istore          12
        //   134: aload_0        
        //   135: getfield        et2.b:Lina;
        //   138: ifnonnull       161
        //   141: aload_1        
        //   142: getfield        pg8.d:J
        //   145: lload           4
        //   147: lcmp           
        //   148: ifne            158
        //   151: iload           13
        //   153: istore          12
        //   155: goto            161
        //   158: iconst_0       
        //   159: istore          12
        //   161: iload           12
        //   163: invokestatic    omy.k:(Z)V
        //   166: aload_1        
        //   167: iconst_0       
        //   168: putfield        pg8.f:I
        //   171: aload_2        
        //   172: athrow         
        //   173: astore          14
        //   175: aload_0        
        //   176: getfield        et2.b:Lina;
        //   179: ifnonnull       201
        //   182: aload_1        
        //   183: getfield        pg8.d:J
        //   186: lload           4
        //   188: lcmp           
        //   189: ifne            195
        //   192: goto            201
        //   195: iconst_0       
        //   196: istore          12
        //   198: goto            204
        //   201: iconst_1       
        //   202: istore          12
        //   204: iload           12
        //   206: invokestatic    omy.k:(Z)V
        //   209: aload_1        
        //   210: iconst_0       
        //   211: putfield        pg8.f:I
        //   214: iinc            9, 1
        //   217: goto            71
        //   220: aload_0        
        //   221: getfield        et2.b:Lina;
        //   224: ifnonnull       346
        //   227: getstatic       cnw.a:I
        //   230: istore          9
        //   232: new             Ljava/lang/StringBuilder;
        //   235: dup            
        //   236: invokespecial   java/lang/StringBuilder.<init>:()V
        //   239: astore_1       
        //   240: iload           10
        //   242: istore          9
        //   244: iload           9
        //   246: aload_3        
        //   247: arraylength    
        //   248: if_icmpge       288
        //   251: aload_1        
        //   252: aload_3        
        //   253: iload           9
        //   255: aaload         
        //   256: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   259: invokevirtual   java/lang/Class.getSimpleName:()Ljava/lang/String;
        //   262: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   265: pop            
        //   266: iload           9
        //   268: aload_3        
        //   269: arraylength    
        //   270: iconst_1       
        //   271: isub           
        //   272: if_icmpge       282
        //   275: aload_1        
        //   276: ldc             ", "
        //   278: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   281: pop            
        //   282: iinc            9, 1
        //   285: goto            244
        //   288: aload_1        
        //   289: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   292: astore_1       
        //   293: new             Ljava/lang/StringBuilder;
        //   296: dup            
        //   297: aload_1        
        //   298: bipush          58
        //   300: invokestatic    wnj.f:(Ljava/lang/String;I)I
        //   303: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   306: astore_3       
        //   307: aload_3        
        //   308: ldc             "None of the available extractors ("
        //   310: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   313: pop            
        //   314: aload_3        
        //   315: aload_1        
        //   316: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   319: pop            
        //   320: aload_3        
        //   321: ldc             ") could read the stream."
        //   323: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   326: pop            
        //   327: aload_3        
        //   328: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   331: astore_1       
        //   332: aload_2        
        //   333: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //   336: pop            
        //   337: new             Lcom/google/android/exoplayer2/source/UnrecognizedInputFormatException;
        //   340: dup            
        //   341: aload_1        
        //   342: invokespecial   com/google/android/exoplayer2/source/UnrecognizedInputFormatException.<init>:(Ljava/lang/String;)V
        //   345: athrow         
        //   346: aload_0        
        //   347: getfield        et2.b:Lina;
        //   350: aload           8
        //   352: invokeinterface ina.i:(Lnna;)V
        //   357: return         
        //    Exceptions:
        //  throws java.io.IOException
        //    Signature:
        //  (Lh78;Landroid/net/Uri;Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;JJLnna;)V
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                  
        //  -----  -----  -----  -----  ----------------------
        //  84     101    173    195    Ljava/io/EOFException;
        //  84     101    129    173    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
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
}
