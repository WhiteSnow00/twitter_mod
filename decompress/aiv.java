import java.util.Objects;
import java.util.List;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiv extends gue implements rtb<Collection<ldp>, naj<? extends gvj<Object, ? extends List<ldp>>>>
{
    public final /* synthetic */ div<Object, ldp> C0;
    public final /* synthetic */ Object D0;
    public final /* synthetic */ String E0;
    
    public aiv(final div<Object, ldp> c0, final Object d0, final String e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Collection collection = (Collection)o;
        zzd.f((Object)collection, "localSuggestions");
        if (this.C0.c || collection.size() < this.C0.b) {
            final div<Object, ldp> c0 = this.C0;
            final Object d0 = this.D0;
            Objects.requireNonNull((d38)c0);
            final q38 q38 = (q38)d0;
            zzd.f((Object)q38, "token");
            if (pjr.g((CharSequence)q38.a)) {
                final div<Object, ldp> c2 = this.C0;
                final Object d2 = this.D0;
                final String e0 = this.E0;
                final thv d3 = c2.d;
                final q38 q39 = (q38)d2;
                zzd.f((Object)q39, "token");
                final String a = q39.a;
                final int a2 = c2.a;
                Objects.requireNonNull(d3);
                zzd.f((Object)a, "query");
                d3.c.onNext((Object)new phv(d3.a, a, a2, d3.b, e0, false));
                final m29 i = c2.i;
                final d38 d4 = (d38)c2;
                final b5j map = d4.m.a(q39.a, (String)null).I(((div)d4).e).P().map((qtb)new dgl((rtb)new j38(d4), 7));
                zzd.e((Object)map, "private fun getRemoteDMC\u2026          }\n            }");
                final b5j map2 = ((div)d4).d.e.map((qtb)new nla((rtb)new zhv((div<Object, ldp>)d4), 7));
                zzd.e((Object)map2, "protected open fun getRe\u2026r(typeAheadGroup) }\n    }");
                final b5j zip = b5j.zip((naj)map, (naj)map2, (ew1)new ypf((gub)new k38(d4), 5));
                zzd.e((Object)zip, "override fun getRemoteSu\u2026gestions)\n        }\n    }");
                i.c(zip.map((qtb)new mma((rtb)new xhv((div)c2, collection, d2), 14)).subscribeOn(c2.e).subscribe((fk6)new zak((rtb)new yhv(c2), 16)));
                return b5j.just((Object)new gvj(this.D0, (Object)or4.h2((Iterable)collection, this.C0.b)));
            }
        }
        this.C0.i.a();
        return b5j.just((Object)new gvj(this.D0, (Object)or4.h2((Iterable)collection, this.C0.b)));
    }
}
