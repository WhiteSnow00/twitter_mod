import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class spy implements wqy
{
    public final Object C0 = c0;
    public final Object D0 = d0;
    public final Object E0 = e0;
    public final Object F0 = f0;
    public final Object G0 = g0;
    public final Object H0 = h0;
    public final Object I0 = i0;
    public final Object J0 = j0;
    public final Object K0 = k0;
    
    public final spy b(final wb8 wb8, final List list, final h6i h6i, final dkv dkv, trw trw, final gy1 gy1) {
        zzd.f((Object)wb8, "descriptor");
        zzd.f((Object)h6i, "nameResolver");
        zzd.f((Object)dkv, "typeTable");
        zzd.f((Object)trw, "versionRequirementTable");
        zzd.f((Object)gy1, "metadataVersion");
        final xq8 xq8 = (xq8)this.C0;
        final int b = gy1.b;
        boolean b2 = true;
        if (b != 1 || gy1.c < 4) {
            b2 = false;
        }
        if (!b2) {
            trw = (trw)this.G0;
        }
        return new spy(xq8, h6i, wb8, dkv, trw, gy1, (hr8)this.I0, (viv)this.J0, list);
    }
    
    public final xhr d() {
        return ((xq8)this.C0).a;
    }
}
