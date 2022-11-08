import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fx extends gue implements rtb<qgk$a, oyv>
{
    public final /* synthetic */ ex C0;
    public final /* synthetic */ float D0;
    public final /* synthetic */ int E0;
    public final /* synthetic */ int F0;
    public final /* synthetic */ int G0;
    public final /* synthetic */ qgk H0;
    public final /* synthetic */ int I0;
    
    public fx(final ex c0, final float d0, final int e0, final int f0, final int g0, final qgk h0, final int i0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final qgk$a qgk$a = (qgk$a)o;
        zzd.f((Object)qgk$a, "$this$layout");
        int e0;
        if (this.C0 instanceof jqc) {
            e0 = 0;
        }
        else {
            final float d0 = this.D0;
            Objects.requireNonNull(e99.Companion);
            if (!e99.b(d0, Float.NaN)) {
                e0 = this.E0;
            }
            else {
                e0 = this.F0 - this.G0 - this.H0.C0;
            }
        }
        int e2;
        if (!(this.C0 instanceof jqc)) {
            e2 = 0;
        }
        else {
            final float d2 = this.D0;
            Objects.requireNonNull(e99.Companion);
            if (!e99.b(d2, Float.NaN)) {
                e2 = this.E0;
            }
            else {
                e2 = this.I0 - this.G0 - this.H0.D0;
            }
        }
        qgk$a.h(qgk$a, this.H0, e0, e2, 0.0f, 4, (Object)null);
        return oyv.a;
    }
}
