// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api;

import java.util.Iterator;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Objects;
import android.accounts.Account;
import java.util.List;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import android.content.Context;
import android.os.Looper;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;

@Deprecated
public abstract class c
{
    public static final Set<c> F0;
    
    static {
        F0 = Collections.newSetFromMap(new WeakHashMap<c, Boolean>());
    }
    
    public static Set<c> d() {
        final Set<c> f0 = c.F0;
        synchronized (f0) {
            return f0;
        }
    }
    
    public abstract void a();
    
    public abstract void b();
    
    public <A extends com.google.android.gms.common.api.a.b, T extends com.google.android.gms.common.api.internal.a<? extends etm, A>> T c(final T t) {
        throw new UnsupportedOperationException();
    }
    
    public <C extends a$f> C e(final com.google.android.gms.common.api.a.c<C> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/lang/UnsupportedOperationException.<init>:()V
        //     7: athrow         
        //    Signature:
        //  <C:Lcom/google/android/gms/common/api/a$f;>(Lcom/google/android/gms/common/api/a$c<TC;>;)TC; [from metadata: <C::Lcom/google/android/gms/common/api/a$f;>(Lcom/google/android/gms/common/api/a$c<TC;>;)TC;]
        //  
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
    
    public Looper f() {
        throw new UnsupportedOperationException();
    }
    
    public abstract boolean g();
    
    public abstract boolean h();
    
    public boolean i(final f7q f7q) {
        throw new UnsupportedOperationException();
    }
    
    public void j() {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    public static final class a
    {
        public final Set<Scope> a;
        public final Set<Scope> b;
        public String c;
        public String d;
        public final Map<com.google.android.gms.common.api.a<?>, q2y> e;
        public final Context f;
        public final Map<com.google.android.gms.common.api.a<?>, com.google.android.gms.common.api.a.d> g;
        public int h;
        public Looper i;
        public r5c j;
        public a$a<? extends t4y, h7q> k;
        public final ArrayList<c$b> l;
        public final ArrayList<c$c> m;
        
        public a(final Context f) {
            this.a = new HashSet();
            this.b = new HashSet();
            this.e = new ws0();
            this.g = new ws0();
            this.h = -1;
            final int c = r5c.c;
            this.j = r5c.e;
            this.k = m4y.a;
            this.l = new ArrayList<c$b>();
            this.m = new ArrayList<c$c>();
            this.f = f;
            this.i = f.getMainLooper();
            this.c = f.getPackageName();
            this.d = f.getClass().getName();
        }
        
        public final a a(final com.google.android.gms.common.api.a<Object> a) {
            iuk.D((Object)a, (Object)"Api must not be null");
            this.g.put((Object)a, (Object)null);
            final com.google.android.gms.common.api.a.a$a<?, Object> a2 = a.a;
            iuk.D((Object)a2, (Object)"Base client builder must not be null");
            final List a3 = ((com.google.android.gms.common.api.a.e)a2).a();
            this.b.addAll(a3);
            this.a.addAll(a3);
            return this;
        }
        
        public final c b() {
            iuk.q(this.g.isEmpty() ^ true, (Object)"must call addApi() to add at least one API");
            h7q f0 = h7q.F0;
            final ws0 g = this.g;
            final com.google.android.gms.common.api.a<h7q> c = m4y.c;
            if (g.containsKey((Object)c)) {
                f0 = (h7q)this.g.getOrDefault((Object)c, (Object)null);
            }
            final lh4 lh4 = new lh4((Account)null, (Set)this.a, (Map)this.e, this.c, this.d, f0);
            final Map d = lh4.d;
            final ws0<com.google.android.gms.common.api.a<?>, Boolean> ws0 = new ws0<com.google.android.gms.common.api.a<?>, Boolean>();
            final ws0<Object, Object> ws2 = new ws0<Object, Object>();
            final ArrayList<i6y> list = new ArrayList<i6y>();
            final Iterator iterator = ((ws0$c)this.g.keySet()).iterator();
            com.google.android.gms.common.api.a a = null;
            while (true) {
                final boolean hasNext = iterator.hasNext();
                boolean b = false;
                if (hasNext) {
                    final com.google.android.gms.common.api.a a2 = iterator.next();
                    final Object orDefault = this.g.getOrDefault((Object)a2, (Object)null);
                    if (d.get(a2) != null) {
                        b = true;
                    }
                    ws0.put((Object)a2, (Object)b);
                    final i6y i6y = new i6y((com.google.android.gms.common.api.a)a2, b);
                    list.add(i6y);
                    final a$a<?, O> a3 = a2.a;
                    Objects.requireNonNull((a$a)a3, "null reference");
                    final a$f c2 = ((a$a)a3).c(this.f, this.i, lh4, orDefault, (c$b)i6y, (c$c)i6y);
                    ws2.put((Object)a2.b, (Object)c2);
                    if (!c2.d()) {
                        continue;
                    }
                    if (a != null) {
                        final String c3 = a2.c;
                        final String c4 = a.c;
                        throw new IllegalStateException(wa0.y(new StringBuilder(String.valueOf(c3).length() + 21 + String.valueOf(c4).length()), c3, " cannot be used with ", c4));
                    }
                    a = a2;
                }
                else {
                    if (a != null) {
                        final boolean equals = this.a.equals(this.b);
                        final String c5 = a.c;
                        if (!equals) {
                            throw new IllegalStateException(String.format("Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", c5));
                        }
                    }
                    final x2y x2y = new x2y(this.f, new ReentrantLock(), this.i, lh4, this.j, (a$a<? extends t4y, h7q>)this.k, ws0, this.l, this.m, (Map<com.google.android.gms.common.api.a.c<?>, a$f>)ws2, this.h, x2y.m((Iterable<a$f>)ws2.values(), true), list);
                    final Set<c> f2 = com.google.android.gms.common.api.c.F0;
                    synchronized (f2) {
                        f2.add(x2y);
                        monitorexit(f2);
                        if (this.h < 0) {
                            return x2y;
                        }
                        LifecycleCallback.c(null);
                        throw null;
                    }
                }
            }
        }
    }
}
