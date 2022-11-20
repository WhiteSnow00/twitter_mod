// 
// Decompiled by Procyon v0.6.0
// 

public final class zjo
{
    public final ftn a;
    public final yrq b;
    public final rmf c;
    public final umd d;
    
    public zjo(final xbm xbm, final nnl<ejt> nnl, final ftn a, final yrq b, final rmf c, final umd d) {
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)nnl, "toolTipPublishSubject");
        czd.f((Object)a, "nuxTooltipController");
        czd.f((Object)b, "spacesHomeConfiguration");
        czd.f((Object)c, "listWrapper");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        if (b.b()) {
            final w19 w19 = new w19();
            ((sy5)xbm.E0).q((oj)new ako(w19));
            w19.c(((h5j)nnl).subscribe((lj6)new f$f3((qsb)new bko(this))));
        }
    }
    
    public final class a
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[ejt.values().length];
            a2[8] = 1;
            a = a2;
        }
    }
}
