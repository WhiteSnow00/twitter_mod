import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q1b<T> implements zzr<v88<T>>
{
    public final List<zzr<v88<T>>> a;
    
    public q1b(final List<zzr<v88<T>>> a) {
        xd.F(a.isEmpty() ^ true, "List of suppliers is empty!");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof q1b && q5j.a((Object)this.a, (Object)((q1b)o).a));
    }
    
    @Override
    public final Object get() {
        return new a();
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final q5j$a b = q5j.b((Object)this);
        b.c("list", (Object)this.a);
        return b.toString();
    }
    
    public final class a extends nb<T>
    {
        public int h;
        public v88<T> i;
        public v88<T> j;
        public final q1b k;
        
        public a(final q1b k) {
            this.k = k;
            this.h = 0;
            this.i = null;
            this.j = null;
            if (!this.p()) {
                this.i(new RuntimeException("No data source supplier or supplier returned null."), null);
            }
        }
        
        public static void m(final q1b.a a, final v88 v88) {
            synchronized (a) {
                boolean b;
                if (!a.isClosed() && v88 == a.i) {
                    a.i = null;
                    b = true;
                    monitorexit(a);
                }
                else {
                    b = false;
                    monitorexit(a);
                }
                if (b) {
                    if (v88 != a.o()) {
                        a.n(v88);
                    }
                    if (!a.p()) {
                        final nb nb = (nb)v88;
                        a.i(nb.f(), nb.a);
                    }
                }
            }
        }
        
        @Override
        public final boolean a() {
            synchronized (this) {
                final v88<T> o = this.o();
                return o != null && o.a();
            }
        }
        
        @Override
        public final boolean close() {
            synchronized (this) {
                if (!super.close()) {
                    return false;
                }
                final v88<T> i = this.i;
                this.i = null;
                final v88<T> j = this.j;
                this.j = null;
                monitorexit(this);
                this.n(j);
                this.n(i);
                return true;
            }
        }
        
        @Override
        public final T d() {
            synchronized (this) {
                final v88<T> o = this.o();
                T d;
                if (o != null) {
                    d = o.d();
                }
                else {
                    d = null;
                }
                return d;
            }
        }
        
        public final void n(final v88<T> v88) {
            if (v88 != null) {
                v88.close();
            }
        }
        
        public final v88<T> o() {
            synchronized (this) {
                return this.j;
            }
        }
        
        public final boolean p() {
            synchronized (this) {
                final boolean closed = this.isClosed();
                v88<T> i = null;
                zzr zzr;
                if (!closed && this.h < this.k.a.size()) {
                    zzr = this.k.a.get(this.h++);
                    monitorexit(this);
                }
                else {
                    monitorexit(this);
                    zzr = null;
                }
                if (zzr != null) {
                    i = (v88<T>)zzr.get();
                }
                synchronized (this) {
                    boolean b;
                    if (this.isClosed()) {
                        monitorexit(this);
                        b = false;
                    }
                    else {
                        this.i = i;
                        monitorexit(this);
                        b = true;
                    }
                    if (b && i != null) {
                        i.c((b98<T>)new q1b.a.a(), (Executor)gb3.F0);
                        return true;
                    }
                    this.n(i);
                    return false;
                }
            }
        }
        
        public final class a implements b98<T>
        {
            public final q1b.a a;
            
            public a(final q1b.a a) {
                this.a = a;
            }
            
            public final void a(final v88<T> p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //    Signature:
                //  (Lv88<TT;>;)V
                // 
                // The error that occurred was:
                // 
                // java.lang.ArrayIndexOutOfBoundsException: 1
                //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
                //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
            
            public final void b(final v88<T> v88) {
                this.a.j(Math.max(this.a.b(), ((nb)v88).b()));
            }
            
            public final void c(final v88<T> j) {
                if (j.a()) {
                    final q1b.a a = this.a;
                    Objects.requireNonNull(a);
                    final nb nb = (nb)j;
                    final boolean g = nb.g();
                    synchronized (a) {
                        Label_0096: {
                            if (j == a.i) {
                                v88<T> i = a.j;
                                if (j != i) {
                                    if (i != null && !g) {
                                        i = null;
                                    }
                                    else {
                                        a.j = j;
                                    }
                                    monitorexit(a);
                                    a.n(i);
                                    break Label_0096;
                                }
                            }
                            monitorexit(a);
                        }
                        if (j == a.o()) {
                            a.k(null, nb.g(), nb.a);
                        }
                        return;
                    }
                }
                if (((nb)j).g()) {
                    q1b.a.m(this.a, j);
                }
            }
            
            public final void d(final v88<T> v88) {
                q1b.a.m(this.a, v88);
            }
        }
    }
}
