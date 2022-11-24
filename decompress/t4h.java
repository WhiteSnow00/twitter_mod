import java.nio.ByteBuffer;
import com.facebook.common.memory.PooledByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t4h implements PooledByteBuffer
{
    public final int F0;
    public cj4<n4h> G0;
    
    public t4h(final cj4<n4h> cj4, final int f0) {
        xd.D(f0 >= 0 && f0 <= cj4.h().getSize());
        this.G0 = cj4.a();
        this.F0 = f0;
    }
    
    public final int C(int c, final byte[] array, final int n, final int n2) {
        synchronized (this) {
            this.a();
            xd.D(c + n2 <= this.F0);
            c = this.G0.h().C(c, array, n, n2);
            return c;
        }
    }
    
    public final ByteBuffer D() {
        synchronized (this) {
            return this.G0.h().D();
        }
    }
    
    public final byte O(final int n) {
        synchronized (this) {
            this.a();
            final boolean b = true;
            xd.D(n >= 0);
            xd.D(n < this.F0 && b);
            return this.G0.h().O(n);
        }
    }
    
    public final long U() throws UnsupportedOperationException {
        synchronized (this) {
            this.a();
            return this.G0.h().U();
        }
    }
    
    public final void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: monitorenter   
        //     4: aload_0        
        //     5: getfield        t4h.G0:Lcj4;
        //     8: invokestatic    cj4.j:(Lcj4;)Z
        //    11: istore_1       
        //    12: aload_0        
        //    13: monitorexit    
        //    14: iload_1        
        //    15: iconst_1       
        //    16: ixor           
        //    17: ifne            23
        //    20: aload_0        
        //    21: monitorexit    
        //    22: return         
        //    23: new             Lcom/facebook/common/memory/PooledByteBuffer$ClosedException;
        //    26: astore_2       
        //    27: aload_2        
        //    28: invokespecial   com/facebook/common/memory/PooledByteBuffer$ClosedException.<init>:()V
        //    31: aload_2        
        //    32: athrow         
        //    33: astore_2       
        //    34: goto            42
        //    37: astore_2       
        //    38: aload_0        
        //    39: monitorexit    
        //    40: aload_2        
        //    41: athrow         
        //    42: aload_0        
        //    43: monitorexit    
        //    44: aload_2        
        //    45: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      4      33     37     Any
        //  4      12     37     42     Any
        //  12     14     33     37     Any
        //  23     33     33     37     Any
        //  38     42     33     37     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0023:
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
    
    public final void close() {
        synchronized (this) {
            cj4.e(this.G0);
            this.G0 = null;
        }
    }
    
    public final boolean isClosed() {
        synchronized (this) {
            return cj4.j(this.G0) ^ true;
        }
    }
    
    public final int size() {
        synchronized (this) {
            this.a();
            return this.F0;
        }
    }
}
