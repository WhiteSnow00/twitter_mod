import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import com.facebook.imagepipeline.request.a$c;
import com.facebook.imagepipeline.request.a;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public class yo1 implements n1l
{
    public static final Set<String> n;
    public final a a;
    public final String b;
    public final String c;
    public final r1l d;
    public final Object e;
    public final a$c f;
    public final Map<String, Object> g;
    public boolean h;
    public a0l i;
    public boolean j;
    public boolean k;
    public final List<o1l> l;
    public final r8d m;
    
    static {
        final int f0 = oed.F0;
        final HashSet set = new HashSet(2);
        Collections.addAll(set, "id", "uri_source");
        yo1.n = new oed(set);
    }
    
    public yo1(final a a, final String b, final String c, final r1l d, final Object e, final a$c f, final boolean h, final boolean j, final a0l i, final r8d m) {
        this.a = a;
        this.b = b;
        final HashMap g = new HashMap();
        (this.g = g).put("id", b);
        Object b2;
        if (a == null) {
            b2 = "null-request";
        }
        else {
            b2 = a.b;
        }
        g.put("uri_source", b2);
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = false;
        this.l = new ArrayList();
        this.m = m;
    }
    
    public static void q(final List<o1l> list) {
        if (list == null) {
            return;
        }
        final Iterator<o1l> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
    }
    
    public static void r(final List<o1l> list) {
        if (list == null) {
            return;
        }
        final Iterator<o1l> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().d();
        }
    }
    
    public static void s(final List<o1l> list) {
        if (list == null) {
            return;
        }
        final Iterator<o1l> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().c();
        }
    }
    
    @Override
    public final Object a() {
        return this.e;
    }
    
    @Override
    public final a0l b() {
        synchronized (this) {
            return this.i;
        }
    }
    
    @Override
    public final <T> T c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        yo1.g:Ljava/util/HashMap;
        //     4: ldc             "origin"
        //     6: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //     9: areturn        
        //    Signature:
        //  <T:Ljava/lang/Object;>(Ljava/lang/String;)TT;
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
    
    @Override
    public final void d(final String s, final Object o) {
        if (yo1.n.contains(s)) {
            return;
        }
        this.g.put(s, o);
    }
    
    @Override
    public final r8d e() {
        return this.m;
    }
    
    @Override
    public final void f(final String s, final String s2) {
        this.g.put("origin", s);
        this.g.put("origin_sub", s2);
    }
    
    @Override
    public final String g() {
        return this.c;
    }
    
    @Override
    public final Map<String, Object> getExtras() {
        return this.g;
    }
    
    @Override
    public final String getId() {
        return this.b;
    }
    
    @Override
    public final void h(final String s) {
        this.f(s, "default");
    }
    
    @Override
    public final r1l i() {
        return this.d;
    }
    
    @Override
    public final boolean j() {
        synchronized (this) {
            return this.j;
        }
    }
    
    @Override
    public final void k() {
    }
    
    @Override
    public final a l() {
        return this.a;
    }
    
    @Override
    public final void m(final Map<String, ?> map) {
        if (map == null) {
            return;
        }
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            this.d(entry.getKey(), entry.getValue());
        }
    }
    
    @Override
    public final boolean n() {
        synchronized (this) {
            return this.h;
        }
    }
    
    @Override
    public final a$c o() {
        return this.f;
    }
    
    @Override
    public final void p(final o1l o1l) {
        synchronized (this) {
            this.l.add(o1l);
            final boolean k = this.k;
            monitorexit(this);
            if (k) {
                o1l.b();
            }
        }
    }
    
    public final void t() {
        synchronized (this) {
            List list;
            if (this.k) {
                list = null;
                monitorexit(this);
            }
            else {
                this.k = true;
                list = new ArrayList(this.l);
                monitorexit(this);
            }
            if (list != null) {
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    ((o1l)iterator.next()).b();
                }
            }
        }
    }
    
    public final List<o1l> u(final a0l i) {
        synchronized (this) {
            if (i == this.i) {
                return null;
            }
            this.i = i;
            return new ArrayList<o1l>(this.l);
        }
    }
}
