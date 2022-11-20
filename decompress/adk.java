// 
// Decompiled by Procyon v0.6.0
// 

public final class adk
{
    public final a a;
    
    public adk(final a a) {
        this.a = a;
    }
    
    public final vsd a(final tws tws, final w3c w3c, final wrm wrm, final uws uws, final wzs g) {
        final zck zck = (zck)tws;
        czd.f((Object)zck, "instruction");
        czd.f((Object)w3c, "globalObjects");
        czd.f((Object)wrm, "responseObjects");
        final zus$a a = zck.a.a(w3c, wrm);
        a.m = "urt_pin_entries";
        a.c = Long.MAX_VALUE;
        final zus zus = (zus)((n4j)a).j();
        final a a2 = this.a;
        final rzs$a o = rzs$a.o(s9i.r(zus));
        o.c = uws.b0();
        boolean b = false;
        o.d = false;
        o.g = g;
        if (a2.a(o) > 0) {
            b = true;
        }
        return (vsd)new zck$a(b);
    }
    
    public interface a
    {
        int a(final rzs$a p0);
    }
}
