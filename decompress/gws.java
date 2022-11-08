// 
// Decompiled by Procyon v0.6.0
// 

public final class gws implements jws
{
    public final /* synthetic */ jws<ews, Object, Object> C0;
    public final /* synthetic */ rtb D0;
    
    public gws(final jws c0, final rtb d0) {
        this.C0 = (jws<ews, Object, Object>)c0;
        this.D0 = d0;
    }
    
    public final std v(final ews ews, final Object o, final Object o2) {
        zzd.f((Object)ews, "instruction");
        return this.C0.v(ews, this.D0.invoke(o), o2);
    }
}
