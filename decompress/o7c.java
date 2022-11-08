import java.util.HashMap;
import j$.util.function.BiConsumer;
import j$.util.Map$_EL;
import java.io.IOException;
import java.util.Iterator;
import java.util.Collections;
import java.util.Objects;
import com.twitter.graphql.GraphQlOperationRegistry;
import java.util.Set;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o7c extends h4j<qrc>
{
    public String a;
    public String b;
    public List<lta> c;
    public Map<String, Set<String>> d;
    public xrc$b e;
    public GraphQlOperationRegistry f;
    public sjg<String, Object> g;
    public sjg<String, Object> h;
    public sjg<String, Object> i;
    public final Set<gow> j;
    public final kta k;
    
    public o7c() {
        final GraphQlOperationRegistry j7 = ((cx6)((v4j)ir0.a()).B((Class)cx6.class)).J7();
        final Set a7 = ((cx6)((v4j)ir0.a()).B((Class)cx6.class)).A7();
        final int a8 = aua.a;
        Objects.requireNonNull(bua.Companion);
        final kta d5 = ((bua)((v4j)jr0.Companion.a()).B((Class)bua.class)).d5();
        this.c = Collections.emptyList();
        this.d = Collections.emptyMap();
        this.e = xrc$b.E0;
        this.f = j7;
        this.j = a7;
        this.k = d5;
        this.g = (sjg$a)sjg.t();
        this.h = (sjg$a)sjg.t();
        this.i = (sjg$a)sjg.t();
        final Iterator iterator = a7.iterator();
        while (iterator.hasNext()) {
            this.q(((gow)iterator.next()).c());
        }
    }
    
    public final Object i() {
        final StringBuilder t = dia.t("/graphql", "/");
        t.append(this.a);
        t.append("/");
        t.append(this.b);
        final qrc.a a = new qrc.a();
        a.m(t.toString());
        final sjg$a i = this.i;
        final Map f0 = ((sjg)i).F0;
        boolean b = false;
        int n;
        if (f0 != null) {
            n = f0.size();
        }
        else {
            final Map c0 = ((sjg)i).C0;
            if (c0 != null) {
                n = c0.size();
            }
            else if (((sjg)i).D0 != null) {
                n = 1;
            }
            else {
                n = 0;
            }
        }
        if (n == 0) {
            b = true;
        }
        if (!b) {
            for (final Map.Entry<String, V> entry : ((Map)((h4j)this.i).e()).entrySet()) {
                a.l(entry.getKey(), entry.getValue().toString());
            }
        }
        final xrc$b e = this.e;
        final xrc$b f2 = xrc$b.F0;
        if (e == f2) {
            a.e = f2;
            final int a2 = w4j.a;
            Object d;
            try {
                final String b2 = mih.b((Map)((h4j)this.g).e());
                final String b3 = mih.b((Map)((h4j)this.h).e());
                final sjg t2 = sjg.t();
                t2.w((Object)"variables", (Object)b2);
                if (!this.c.isEmpty()) {
                    t2.w((Object)"features", (Object)b3);
                }
                d = new ajr(mih.b((Map)((h4j)t2).e()), wj6.a);
                ((ac)d).e("application/json");
            }
            catch (final IOException b4) {
                final z8a z8a = new z8a();
                z8a.b = b4;
                final StringBuilder sb = new StringBuilder();
                sb.append(this.a);
                sb.append("/");
                sb.append(this.b);
                ((HashMap<String, StringBuilder>)z8a.a).put("operation_id/operation-name", sb);
                e9a.c(z8a);
                d = null;
            }
            a.d = (src)d;
            final int a3 = w4j.a;
        }
        else {
            a.e = xrc$b.E0;
            final int a4 = w4j.a;
            try {
                final String b5 = mih.b((Map)((h4j)this.g).e());
                final String b6 = mih.b((Map)((h4j)this.h).e());
                a.d("variables", b5);
                if (!this.c.isEmpty()) {
                    a.d("features", b6);
                }
            }
            catch (final IOException b7) {
                final z8a z8a2 = new z8a();
                z8a2.b = b7;
                ((HashMap<String, StringBuilder>)z8a2.a).put("OPERATION_PATH", t);
                e9a.c(z8a2);
            }
        }
        return a.k();
    }
    
    public final boolean l() {
        return pjr.g((CharSequence)this.a);
    }
    
    public final o7c o(final String s, final Object o) {
        if (o != null) {
            this.s(s, o);
            ((sjg)this.g).w((Object)s, o);
        }
        return this;
    }
    
    public final o7c p(final String s, final Object o) {
        this.s(s, o);
        ((sjg)this.g).w((Object)s, o);
        return this;
    }
    
    public final o7c q(final Map<String, Object> map) {
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            this.s(entry.getKey(), entry.getValue());
        }
        ((sjg)this.g).x((Map)map);
        return this;
    }
    
    public final o7c r(final String s) {
        final a8c a8c = this.f.a.get(s);
        pf8.r(a8c);
        this.a = a8c.a;
        this.b = a8c.b;
        final List d = a8c.d;
        this.c = d;
        this.d = a8c.e;
        if (a8c.c == 2) {
            this.e = xrc$b.F0;
        }
        else {
            this.e = xrc$b.E0;
        }
        for (final lta lta : d) {
            ((sjg)this.h).w((Object)lta.b, (Object)this.k.a(lta));
        }
        return this;
    }
    
    public final void s(final String s, final Object o) {
        Map$_EL.forEach((Map)this.d, (BiConsumer)new n7c(this, s, o));
    }
}
