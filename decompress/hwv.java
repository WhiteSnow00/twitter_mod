import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hwv
{
    public static final b Companion;
    public static final rlp<hwv> l;
    public final wxv a;
    public final String b;
    public final o19 c;
    public final String d;
    public final boolean e;
    public final ixv f;
    public final Map<String, Object> g;
    public final kha h;
    public final sxv i;
    public final long j;
    public final List<mwv> k;
    
    static {
        Companion = new b();
        hwv.l = new hwv.hwv$c();
    }
    
    public hwv(final wxv a, final String b, final o19 c, final String d, final boolean e, final ixv f, final Map<String, ?> g, final kha h, final sxv i) {
        czd.f((Object)g, "experimentSignals");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = (Map<String, Object>)g;
        this.h = h;
        this.i = i;
        int hashCode;
        if (b != null) {
            hashCode = b.hashCode();
        }
        else {
            hashCode = -1;
        }
        this.j = hashCode;
        this.k = f.a();
    }
    
    public final boolean a(final wxv... array) {
        return ct0.L0((Object[])array, (Object)this.a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hwv)) {
            return false;
        }
        final hwv hwv = (hwv)o;
        return this.a == hwv.a && czd.a((Object)this.b, (Object)hwv.b) && czd.a((Object)this.c, (Object)hwv.c) && czd.a((Object)this.d, (Object)hwv.d) && this.e == hwv.e && czd.a((Object)this.f, (Object)hwv.f) && czd.a((Object)this.g, (Object)hwv.g) && czd.a((Object)this.h, (Object)hwv.h) && czd.a((Object)this.i, (Object)hwv.i);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final int hashCode4 = this.c.hashCode();
        final String d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        final int hashCode6 = this.f.hashCode();
        final int hashCode7 = this.g.hashCode();
        final kha h = this.h;
        int hashCode8;
        if (h == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = h.hashCode();
        }
        final sxv i = this.i;
        if (i != null) {
            hashCode2 = i.hashCode();
        }
        return ((hashCode7 + (hashCode6 + (((hashCode4 + (hashCode * 31 + hashCode3) * 31) * 31 + hashCode5) * 31 + e) * 31) * 31) * 31 + hashCode8) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        return this.f.toString();
    }
    
    public static final class a extends n4j<hwv>
    {
        public wxv a;
        public String b;
        public o19 c;
        public String d;
        public boolean e;
        public ixv f;
        public Map<String, ?> g;
        public kha h;
        public sxv i;
        
        public a() {
            this.g = (Map<String, ?>)k2a.D0;
        }
        
        public final Object i() {
            wxv wxv;
            if ((wxv = this.a) == null) {
                wxv = wxv.F0;
            }
            final String b = this.b;
            o19 o19;
            if ((o19 = this.c) == null) {
                o19 = o19.f;
            }
            final String d = this.d;
            final boolean e = this.e;
            final ixv f = this.f;
            czd.c((Object)f);
            return new hwv(wxv, b, o19, d, e, f, this.g, this.h, this.i);
        }
        
        public final boolean l() {
            final ixv f = this.f;
            final boolean b = f instanceof qtw;
            final boolean b2 = false;
            if (b) {
                final List b3 = ((qtw)f).b;
                final boolean b4 = b3 == null || b3.isEmpty();
                final boolean b5 = b2;
                if (b4) {
                    return b5;
                }
            }
            else if (f instanceof x2s) {
                final x2s x2s = (x2s)f;
                final Iterator iterator = x2s.b.iterator();
                int n = 0;
            Label_0091:
                while (true) {
                    n = 1;
                    while (iterator.hasNext()) {
                        final List list = (List)iterator.next();
                        if (n != 0 && list != null && !list.isEmpty()) {
                            continue Label_0091;
                        }
                        n = 0;
                    }
                    break;
                }
                boolean b5 = b2;
                if (n == 0) {
                    return b5;
                }
                final List b6 = x2s.b;
                final boolean b7 = b6 == null || b6.isEmpty();
                b5 = b2;
                if (b7) {
                    return b5;
                }
            }
            else if (f instanceof ema) {
                final ema ema = (ema)f;
                boolean b5 = b2;
                if (!(ema.b.isEmpty() ^ true)) {
                    return b5;
                }
                final List b8 = ema.b;
                boolean b9 = false;
                Label_0316: {
                    if (!(b8 instanceof Collection) || !b8.isEmpty()) {
                        final Iterator iterator2 = b8.iterator();
                        while (iterator2.hasNext()) {
                            if (((List)iterator2.next()).size() < 3) {
                                b9 = false;
                                break Label_0316;
                            }
                        }
                    }
                    b9 = true;
                }
                b5 = b2;
                if (!b9) {
                    return b5;
                }
            }
            else {
                boolean b5 = b2;
                if (!(f instanceof eq4)) {
                    return b5;
                }
                b5 = b2;
                if (((eq4)f).b.isEmpty()) {
                    return b5;
                }
            }
            return true;
        }
        
        public final void m() {
            if (this.f instanceof eq4 && asa.b().b("unified_cards_collection_ads_convert_to_image_website_card", false)) {
                final ixv f = this.f;
                czd.d((Object)f, "null cannot be cast to non-null type com.twitter.model.core.entity.unifiedcard.CollectionUnifiedCardLayout");
                final List list = (List)mq4.g0(((eq4)f).b);
                if (list.size() > 1 && list.get(0) instanceof ws8 && list.get(1) instanceof esg) {
                    this.f = (ixv)new qtw(s9i.s((mwv)list.get(1), (mwv)list.get(0)));
                    this.a = wxv.I0;
                }
            }
        }
        
        public final boolean n() {
            boolean b;
            if (!this.l()) {
                m8a.d((Throwable)new IllegalStateException(hmg.h("unified card parsed component list is empty, card uri:", this.b)));
                b = false;
            }
            else {
                b = true;
            }
            return b;
        }
        
        public final a o(final List<? extends mwv> list) {
            czd.f((Object)list, "components");
            this.f = (ixv)new qtw((List)list);
            return this;
        }
        
        public final a p(final kha h) {
            Object g;
            if (h != null) {
                g = af8.p(tkg.n0(new lvj[] { new lvj((Object)"playable_presentation", (Object)h.a), new lvj((Object)"enable_collection_ads", (Object)h.b) }));
            }
            else {
                g = k2a.D0;
            }
            this.g = (Map<String, ?>)g;
            this.h = h;
            return this;
        }
        
        public final a q(final ixv f) {
            czd.f((Object)f, "layout");
            this.f = f;
            return this;
        }
    }
    
    public static final class b
    {
    }
}
