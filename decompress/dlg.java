// 
// Decompiled by Procyon v0.6.0
// 

public final class dlg implements jws<clg, fws, gzs>
{
    public final a C0;
    
    public dlg(final a c0) {
        this.C0 = c0;
    }
    
    public final std v(final ews ews, final Object o, final Object o2) {
        final clg clg = (clg)ews;
        final fws fws = (fws)o;
        final gzs gzs = (gzs)o2;
        zzd.f((Object)clg, "instruction");
        zzd.f((Object)fws, "requestContext");
        final zvs b0 = fws.b0();
        final int b2 = this.C0.b(b0, clg.a);
        if (b2 > 0) {
            this.C0.a(b0);
        }
        return (std)new clg$a(b2);
    }
    
    public interface a
    {
        void a(final zvs p0);
        
        int b(final zvs p0, final Iterable<String> p1);
    }
}
