import java.util.Objects;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.Executor;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bba implements unr, col
{
    public final Map<Class<?>, ConcurrentHashMap<nca<Object>, Executor>> a;
    public Queue<raa<?>> b;
    public final Executor c;
    
    public bba(final Executor c) {
        this.a = new HashMap();
        this.b = new ArrayDeque();
        this.c = c;
    }
    
    public final <T> void a(final Class<T> p0, final nca<? super T> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0        
        //     2: getfield        bba.c:Ljava/util/concurrent/Executor;
        //     5: aload_1        
        //     6: invokevirtual   bba.b:(Ljava/util/concurrent/Executor;Lnca;)V
        //     9: return         
        //    Signature:
        //  <T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Lnca<-TT;>;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 2
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
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
    
    public final <T> void b(final Class<T> clazz, final Executor executor, final nca<? super T> nca) {
        synchronized (this) {
            Objects.requireNonNull(clazz);
            if (!this.a.containsKey(y78.class)) {
                this.a.put(y78.class, new ConcurrentHashMap());
            }
            this.a.get(y78.class).put((Object)executor, (Object)clazz);
        }
    }
}
