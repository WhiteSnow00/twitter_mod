import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wpe implements o02
{
    public int F0;
    public cj4<Bitmap> G0;
    
    public wpe() {
        this.F0 = -1;
    }
    
    public final void a() {
        synchronized (this) {
            cj4.e(this.G0);
            this.G0 = null;
            this.F0 = -1;
        }
    }
    
    public final cj4<Bitmap> b(final int n) {
        synchronized (this) {
            return cj4.c(this.G0);
        }
    }
    
    public final void c(final int f0, final cj4<Bitmap> cj4, int equals) {
        monitorenter(this);
        Label_0038: {
            if (cj4 == null) {
                break Label_0038;
            }
            try {
                if (this.G0 != null) {
                    equals = (((T)cj4.h()).equals(this.G0.h()) ? 1 : 0);
                    if (equals != 0) {
                        return;
                    }
                }
                cj4.e(this.G0);
                this.G0 = cj4.c(cj4);
                this.F0 = f0;
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    public final void clear() {
        synchronized (this) {
            this.a();
        }
    }
    
    public final void d(final int p0, final cj4<Bitmap> p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //    Signature:
        //  (ILcj4<Landroid/graphics/Bitmap;>;I)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 3
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2016)
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
    
    public final cj4<Bitmap> e(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        wpe.G0:Lcj4;
        //     6: invokestatic    cj4.c:(Lcj4;)Lcj4;
        //     9: astore_1       
        //    10: aload_0        
        //    11: invokevirtual   wpe.a:()V
        //    14: aload_0        
        //    15: monitorexit    
        //    16: aload_1        
        //    17: areturn        
        //    18: astore_1       
        //    19: goto            29
        //    22: astore_1       
        //    23: aload_0        
        //    24: invokevirtual   wpe.a:()V
        //    27: aload_1        
        //    28: athrow         
        //    29: aload_0        
        //    30: monitorexit    
        //    31: aload_1        
        //    32: athrow         
        //    Signature:
        //  (III)Lcj4<Landroid/graphics/Bitmap;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      10     22     29     Any
        //  10     14     18     22     Any
        //  23     29     18     22     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 2
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2016)
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
    
    public final boolean f(final int n) {
        synchronized (this) {
            return n == this.F0 && cj4.j(this.G0);
        }
    }
    
    public final cj4<Bitmap> g(final int n) {
        synchronized (this) {
            if (this.F0 == n) {
                return cj4.c(this.G0);
            }
            return null;
        }
    }
}
