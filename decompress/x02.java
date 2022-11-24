import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class x02 implements m1l<cj4<aj4>>
{
    public final k4h<z73, aj4> a;
    public final d83 b;
    public final m1l<cj4<aj4>> c;
    
    public x02(final k4h<z73, aj4> a, final d83 b, final m1l<cj4<aj4>> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final pk6<cj4<aj4>> pk6, final n1l n1l) {
        try {
            rrb.b();
            final r1l i = n1l.i();
            i.k(n1l, this.c());
            final z73 r = ((eg8)this.b).R(n1l.l(), n1l.a());
            final cj4<aj4> value = this.a.get(r);
            final Map<String, String> map = null;
            if (value != null) {
                n1l.m(((ydc)value.h()).getExtras());
                final int c = ((ned)value.h().a()).c ? 1 : 0;
                if (c != 0) {
                    final String c2 = this.c();
                    Map of;
                    if (i.j(n1l, this.c())) {
                        of = med.of((Object)"cached_value_found", (Object)"true");
                    }
                    else {
                        of = null;
                    }
                    i.a(n1l, c2, of);
                    i.d(n1l, this.c(), true);
                    n1l.f("memory_bitmap", this.b());
                    pk6.b(1.0f);
                }
                pk6.c(value, c);
                value.close();
                if (c != 0) {
                    return;
                }
            }
            if (n1l.o().F0 >= 4) {
                final String c3 = this.c();
                Map of2;
                if (i.j(n1l, this.c())) {
                    of2 = med.of((Object)"cached_value_found", (Object)"false");
                }
                else {
                    of2 = null;
                }
                i.a(n1l, c3, of2);
                i.d(n1l, this.c(), false);
                n1l.f("memory_bitmap", this.b());
                pk6.c(null, 1);
                return;
            }
            final pk6<cj4<aj4>> d = this.d(pk6, r, n1l.l().m);
            final String c4 = this.c();
            Map<String, String> of3 = map;
            if (i.j(n1l, this.c())) {
                of3 = med.of((Object)"cached_value_found", (Object)"false");
            }
            i.a(n1l, c4, of3);
            rrb.b();
            this.c.a(d, n1l);
            rrb.b();
        }
        finally {
            rrb.b();
        }
    }
    
    public String b() {
        return "pipe_bg";
    }
    
    public String c() {
        return "BitmapMemoryCacheProducer";
    }
    
    public pk6<cj4<aj4>> d(final pk6<cj4<aj4>> pk6, final z73 z73, final boolean b) {
        return (pk6<cj4<aj4>>)new x02$a(this, (pk6)pk6, z73, b);
    }
}
