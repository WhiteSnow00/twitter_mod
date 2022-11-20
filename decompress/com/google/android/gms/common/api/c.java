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
    public static final Set<c> D0;
    
    static {
        D0 = Collections.newSetFromMap(new WeakHashMap<c, Boolean>());
    }
    
    public static Set<c> g() {
        final Set<c> d0 = c.D0;
        synchronized (d0) {
            return d0;
        }
    }
    
    public abstract void a();
    
    public abstract void c();
    
    public <A extends com.google.android.gms.common.api.a.b, T extends com.google.android.gms.common.api.internal.a<? extends psm, A>> T f(final T t) {
        throw new UnsupportedOperationException();
    }
    
    public <C extends a$f> C h(final com.google.android.gms.common.api.a.c<C> p0) {
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
    
    public Looper i() {
        throw new UnsupportedOperationException();
    }
    
    public abstract boolean j();
    
    public abstract boolean k();
    
    public boolean l(final j6q j6q) {
        throw new UnsupportedOperationException();
    }
    
    public void m() {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    public static final class a
    {
        public final Set<Scope> a;
        public final Set<Scope> b;
        public String c;
        public String d;
        public final Map<com.google.android.gms.common.api.a<?>, w1y> e;
        public final Context f;
        public final Map<com.google.android.gms.common.api.a<?>, com.google.android.gms.common.api.a.d> g;
        public int h;
        public Looper i;
        public p4c j;
        public a$a<? extends z3y, l6q> k;
        public final ArrayList<c$b> l;
        public final ArrayList<c$c> m;
        
        public a(final Context f) {
            this.a = new HashSet();
            this.b = new HashSet();
            this.e = new ts0();
            this.g = new ts0();
            this.h = -1;
            final int c = p4c.c;
            this.j = p4c.e;
            this.k = s3y.a;
            this.l = new ArrayList<c$b>();
            this.m = new ArrayList<c$c>();
            this.f = f;
            this.i = f.getMainLooper();
            this.c = f.getPackageName();
            this.d = f.getClass().getName();
        }
        
        public final a a(final com.google.android.gms.common.api.a<Object> a) {
            eli.r(a, "Api must not be null");
            ((d8q<com.google.android.gms.common.api.a<Object>, Object>)this.g).put(a, null);
            final com.google.android.gms.common.api.a.a$a<?, Object> a2 = a.a;
            eli.r(a2, "Base client builder must not be null");
            final List a3 = ((com.google.android.gms.common.api.a.e)a2).a();
            this.b.addAll(a3);
            this.a.addAll(a3);
            return this;
        }
        
        public final c b() {
            eli.i(((d8q)this.g).isEmpty() ^ true, "must call addApi() to add at least one API");
            l6q d0 = l6q.D0;
            final ts0 g = this.g;
            final com.google.android.gms.common.api.a c = s3y.c;
            if (((d8q)g).containsKey(c)) {
                d0 = ((d8q<K, l6q>)this.g).getOrDefault(c, null);
            }
            final gg4 gg4 = new gg4((Account)null, (Set)this.a, (Map)this.e, this.c, this.d, d0);
            final Map d2 = gg4.d;
            final ts0 ts0 = new ts0();
            final ts0 ts2 = new ts0();
            final ArrayList list = new ArrayList();
            final Iterator iterator = ((ts0$c)this.g.keySet()).iterator();
            com.google.android.gms.common.api.a a = null;
            while (true) {
                final boolean hasNext = iterator.hasNext();
                boolean b = false;
                if (hasNext) {
                    final com.google.android.gms.common.api.a a2 = iterator.next();
                    final Object orDefault = ((d8q<K, Object>)this.g).getOrDefault(a2, null);
                    if (d2.get(a2) != null) {
                        b = true;
                    }
                    ((d8q<com.google.android.gms.common.api.a, Boolean>)ts0).put(a2, Boolean.valueOf(b));
                    final o5y o5y = new o5y(a2, b);
                    list.add(o5y);
                    final a$a<?, O> a3 = a2.a;
                    Objects.requireNonNull((a$a)a3, "null reference");
                    final a$f c2 = ((a$a)a3).c(this.f, this.i, gg4, orDefault, (c$b)o5y, (c$c)o5y);
                    ((d8q<com.google.android.gms.common.api.a.a$g<?>, a$f>)ts2).put(a2.b, c2);
                    if (!c2.d()) {
                        continue;
                    }
                    if (a != null) {
                        final String c3 = a2.c;
                        final String c4 = a.c;
                        throw new IllegalStateException(ta0.z(new StringBuilder(String.valueOf(c3).length() + 21 + String.valueOf(c4).length()), c3, " cannot be used with ", c4));
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
                    final d2y d2y = new d2y(this.f, (Lock)new ReentrantLock(), this.i, gg4, this.j, (a$a)this.k, (Map)ts0, (List)this.l, (List)this.m, (Map)ts2, this.h, d2y.p((Iterable)ts2.values(), true), list);
                    final Set<c> d3 = com.google.android.gms.common.api.c.D0;
                    synchronized (d3) {
                        d3.add((c)d2y);
                        monitorexit(d3);
                        if (this.h < 0) {
                            return (c)d2y;
                        }
                        LifecycleCallback.c(null);
                        throw null;
                    }
                }
            }
        }
    }
}
