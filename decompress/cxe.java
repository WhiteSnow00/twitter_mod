// 
// Decompiled by Procyon v0.6.0
// 

public final class cxe extends wsd implements fwj
{
    public final float D0;
    public final boolean E0;
    
    public cxe(final float d0, final boolean e0, final rtb<? super vsd, oyv> rtb) {
        final ssd$a a = ssd.a;
        zzd.f((Object)a, "inspectorInfo");
        super((rtb)a);
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final Object X(final Object o, final gub gub) {
        zzd.f((Object)gub, "operation");
        return gub.invoke(o, (Object)this);
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        cxe cxe;
        if (o instanceof cxe) {
            cxe = (cxe)o;
        }
        else {
            cxe = null;
        }
        if (cxe == null) {
            return false;
        }
        if (this.D0 != cxe.D0 || this.E0 != cxe.E0) {
            b = false;
        }
        return b;
    }
    
    public final int hashCode() {
        final int floatToIntBits = Float.floatToIntBits(this.D0);
        int n;
        if (this.E0) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        return floatToIntBits * 31 + n;
    }
    
    public final Object i(final dp8 dp8, Object o) {
        zzd.f((Object)dp8, "<this>");
        elo elo;
        if (o instanceof elo) {
            elo = (elo)o;
        }
        else {
            elo = null;
        }
        o = elo;
        if (elo == null) {
            o = new elo(0.0f, false, (k77)null, 7, (hg8)null);
        }
        ((elo)o).a = this.D0;
        ((elo)o).b = this.E0;
        return o;
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("LayoutWeightImpl(weight=");
        g.append(this.D0);
        g.append(", fill=");
        return wa.z(g, this.E0, ')');
    }
}
