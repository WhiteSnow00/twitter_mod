import android.os.BaseBundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bst extends fn9
{
    public final pn9 f;
    public final fob g;
    
    public bst(final pn9 f, final s9 s9, final dn9 dn9, final vba vba, final fob g) {
        czd.f((Object)f, "deepLinkProvider");
        czd.f((Object)s9, "endpointConfig");
        czd.f((Object)dn9, "fragmentArgs");
        czd.f((Object)g, "fragmentRegistry");
        super(f, s9, dn9, vba, g);
        this.f = f;
        this.g = g;
    }
    
    public final jsj b(final btj btj, final boolean b, final boolean b2) {
        czd.f((Object)btj, "tab");
        final jsj b3 = super.b(btj, b, b2);
        final vl1 m = b3.m;
        czd.d((Object)m, "null cannot be cast to non-null type com.twitter.timeline.generic.GenericTimelineArgs");
        final zzb zzb = (zzb)m;
        final jsj$a jsj$a = new jsj$a(b3.a, this.g.c((Class)dst.class));
        jsj$a.k = b3.d;
        final dst$a dst$a = new dst$a(zzb);
        final String a = btj.a;
        czd.e((Object)a, "tab.id");
        ((BaseBundle)((vl1$a)dst$a).a).putString("page_title", a);
        jsj$a.c = (vl1)((n4j)dst$a).e();
        jsj$a.d = b3.c;
        jsj$a.l = b3.k;
        jsj$a.j = b3.l;
        return (jsj)((n4j)jsj$a).e();
    }
}
