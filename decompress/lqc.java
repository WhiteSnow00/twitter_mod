// 
// Decompiled by Procyon v0.6.0
// 

public final class lqc extends ctd implements zwj
{
    public final ex$b G0;
    
    public lqc(final ex$b g0, final stb<? super btd, vzv> stb) {
        final ysd$a a = ysd.a;
        e0e.f((Object)a, "inspectorInfo");
        super((stb)a);
        this.G0 = g0;
    }
    
    public final dlh E(final dlh dlh) {
        return z9a.i((dlh)this, dlh);
    }
    
    public final boolean H(final stb stb) {
        return k5b.a((b)this, stb);
    }
    
    public final Object X(final Object o, final hub hub) {
        e0e.f((Object)hub, "operation");
        return hub.invoke(o, (Object)this);
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        lqc lqc;
        if (o instanceof lqc) {
            lqc = (lqc)o;
        }
        else {
            lqc = null;
        }
        return lqc != null && e0e.a((Object)this.G0, (Object)lqc.G0);
    }
    
    public final int hashCode() {
        return this.G0.hashCode();
    }
    
    public final Object i(final rp8 rp8, Object o) {
        e0e.f((Object)rp8, "<this>");
        mmo mmo;
        if (o instanceof mmo) {
            mmo = (mmo)o;
        }
        else {
            mmo = null;
        }
        o = mmo;
        if (mmo == null) {
            o = new mmo(0.0f, false, (t77)null, 7, (wg8)null);
        }
        ((mmo)o).c = t77.Companion.a(this.G0);
        return o;
    }
    
    public final String toString() {
        final StringBuilder f = ehk.f("HorizontalAlignModifier(horizontal=");
        f.append(this.G0);
        f.append(')');
        return f.toString();
    }
}
