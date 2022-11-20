// 
// Decompiled by Procyon v0.6.0
// 

public final class bbi implements ypa<cbi, abi>
{
    public static final bbi.bbi$b Companion;
    public static final bbi$a e;
    public final ett a;
    public final jdj b;
    public final t2j c;
    public final xbm d;
    
    static {
        Companion = new bbi.bbi$b();
        e = new abi() {
            public final void bind() {
            }
        };
    }
    
    public bbi(final ett a, final jdj b, final t2j c, final xbm d) {
        czd.f((Object)a, "topicsRepository");
        czd.f((Object)b, "urtViewHelper");
        czd.f((Object)c, "numTopicsSelectedManager");
        czd.f((Object)d, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final /* bridge */ Object a(final Object o) {
        return this.f((cbi)o);
    }
    
    public final abi f(final cbi cbi) {
        czd.f((Object)cbi, "navigationLinkOptions");
        final vsr d = cbi.d;
        Object e;
        if (d != null && d.c == 9) {
            e = new vst(this.a, (q0c)this.b, cbi, this.c, this.d);
        }
        else {
            e = bbi.e;
        }
        return (abi)e;
    }
}
