import java.io.IOException;
import java.util.List;
import java.io.File;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f0z
{
    public static final Pattern a;
    
    static {
        a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");
    }
    
    public static List<File> a(final File p0, final File p1) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/ArrayList.<init>:()V
        //     7: astore          5
        //     9: aload_1        
        //    10: getstatic       a0z.a:La0z;
        //    13: invokevirtual   java/io/File.listFiles:(Ljava/io/FilenameFilter;)[Ljava/io/File;
        //    16: astore          7
        //    18: aload           7
        //    20: ifnonnull       31
        //    23: iconst_0       
        //    24: anewarray       Ljava/io/File;
        //    27: astore_1       
        //    28: goto            107
        //    31: aload           7
        //    33: arraylength    
        //    34: istore_3       
        //    35: iload_3        
        //    36: anewarray       Ljava/io/File;
        //    39: astore_1       
        //    40: iconst_0       
        //    41: istore_2       
        //    42: iload_2        
        //    43: iload_3        
        //    44: if_icmpge       107
        //    47: aload           7
        //    49: iload_2        
        //    50: aaload         
        //    51: astore          6
        //    53: aload           6
        //    55: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    58: ldc             "-"
        //    60: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //    63: iconst_0       
        //    64: aaload         
        //    65: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    68: istore          4
        //    70: iload           4
        //    72: aload           7
        //    74: arraylength    
        //    75: if_icmpgt       97
        //    78: aload_1        
        //    79: iload           4
        //    81: aaload         
        //    82: ifnonnull       97
        //    85: aload_1        
        //    86: iload           4
        //    88: aload           6
        //    90: aastore        
        //    91: iinc            2, 1
        //    94: goto            42
        //    97: new             Lxpy;
        //   100: dup            
        //   101: ldc             "Metadata folder ordering corrupt."
        //   103: invokespecial   xpy.<init>:(Ljava/lang/String;)V
        //   106: athrow         
        //   107: aload_1        
        //   108: arraylength    
        //   109: istore_3       
        //   110: iconst_0       
        //   111: istore_2       
        //   112: iload_2        
        //   113: iload_3        
        //   114: if_icmpge       280
        //   117: aload_1        
        //   118: iload_2        
        //   119: aaload         
        //   120: astore          6
        //   122: aload           5
        //   124: aload           6
        //   126: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   129: pop            
        //   130: aload           6
        //   132: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   135: ldc             "LFH"
        //   137: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   140: ifeq            274
        //   143: new             Ljava/io/FileInputStream;
        //   146: dup            
        //   147: aload           6
        //   149: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   152: astore          6
        //   154: new             Lnmy;
        //   157: astore          7
        //   159: aload           7
        //   161: aload           6
        //   163: invokespecial   nmy.<init>:(Ljava/io/InputStream;)V
        //   166: aload           7
        //   168: invokevirtual   nmy.a:()Lx0z;
        //   171: astore          8
        //   173: aload           8
        //   175: checkcast       Ltly;
        //   178: getfield        tly.a:Ljava/lang/String;
        //   181: ifnull          254
        //   184: new             Ljava/io/File;
        //   187: astore          7
        //   189: aload           7
        //   191: aload_0        
        //   192: aload           8
        //   194: checkcast       Ltly;
        //   197: getfield        tly.a:Ljava/lang/String;
        //   200: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   203: aload           7
        //   205: invokevirtual   java/io/File.exists:()Z
        //   208: ifeq            227
        //   211: aload           5
        //   213: aload           7
        //   215: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   218: pop            
        //   219: aload           6
        //   221: invokevirtual   java/io/InputStream.close:()V
        //   224: goto            274
        //   227: new             Lxpy;
        //   230: astore_0       
        //   231: aload_0        
        //   232: ldc             "Missing asset file %s during slice reconstruction."
        //   234: iconst_1       
        //   235: anewarray       Ljava/lang/Object;
        //   238: dup            
        //   239: iconst_0       
        //   240: aload           7
        //   242: invokevirtual   java/io/File.getCanonicalPath:()Ljava/lang/String;
        //   245: aastore        
        //   246: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   249: invokespecial   xpy.<init>:(Ljava/lang/String;)V
        //   252: aload_0        
        //   253: athrow         
        //   254: new             Lxpy;
        //   257: astore_0       
        //   258: aload_0        
        //   259: ldc             "Metadata files corrupt. Could not read local file header."
        //   261: invokespecial   xpy.<init>:(Ljava/lang/String;)V
        //   264: aload_0        
        //   265: athrow         
        //   266: astore_0       
        //   267: aload           6
        //   269: invokevirtual   java/io/InputStream.close:()V
        //   272: aload_0        
        //   273: athrow         
        //   274: iinc            2, 1
        //   277: goto            112
        //   280: aload           5
        //   282: areturn        
        //   283: astore_1       
        //   284: goto            272
        //    Exceptions:
        //  throws java.io.IOException
        //    Signature:
        //  (Ljava/io/File;Ljava/io/File;)Ljava/util/List<Ljava/io/File;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  154    219    266    274    Any
        //  227    254    266    274    Any
        //  254    266    266    274    Any
        //  267    272    283    287    Any
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
