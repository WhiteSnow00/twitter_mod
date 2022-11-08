// 
// Decompiled by Procyon v0.6.0
// 

public final class wxe implements d0f
{
    public final rtb<Integer, Object> a;
    public final gub<lye, Integer, t8c> b;
    public final rtb<Integer, Object> c;
    public final lub<jye, Integer, m76, Integer, oyv> d;
    
    public wxe(final rtb<? super Integer, ?> p0, final gub<? super lye, ? super Integer, t8c> p1, final rtb<? super Integer, ?> p2, final lub<? super jye, ? super Integer, ? super m76, ? super Integer, oyv> p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "span"
        //     3: invokestatic    zzd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0        
        //     7: invokespecial   java/lang/Object.<init>:()V
        //    10: aload_0        
        //    11: aconst_null    
        //    12: putfield        wxe.a:Lrtb;
        //    15: aload_0        
        //    16: aload_1        
        //    17: putfield        wxe.b:Lgub;
        //    20: aload_0        
        //    21: aload_2        
        //    22: putfield        wxe.c:Lrtb;
        //    25: aload_0        
        //    26: aload_3        
        //    27: putfield        wxe.d:Llub;
        //    30: return         
        //    Signature:
        //  (Lrtb<-Ljava/lang/Integer;*>;Lgub<-Llye;-Ljava/lang/Integer;Lt8c;>;Lrtb<-Ljava/lang/Integer;*>;Llub<-Ljye;-Ljava/lang/Integer;-Lm76;-Ljava/lang/Integer;Loyv;>;)V [from metadata: (Lrtb<-Ljava/lang/Integer;+Ljava/lang/Object;>;Lgub<-Llye;-Ljava/lang/Integer;Lt8c;>;Lrtb<-Ljava/lang/Integer;+Ljava/lang/Object;>;Llub<-Ljye;-Ljava/lang/Integer;-Lm76;-Ljava/lang/Integer;Loyv;>;)V]
        //  
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 4
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    public final rtb<Integer, Object> getKey() {
        return this.a;
    }
    
    public final rtb<Integer, Object> getType() {
        return this.c;
    }
}
