import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ofg extends gue implements otb<qfj>
{
    public final /* synthetic */ dp8 C0;
    public final /* synthetic */ q7r<rtb<dp8, qfj>> D0;
    public final /* synthetic */ luh<qfj> E0;
    
    public ofg(final dp8 c0, final q7r<? extends rtb<? super dp8, qfj>> d0, final luh<qfj> e0) {
        this.C0 = c0;
        this.D0 = (q7r<rtb<dp8, qfj>>)d0;
        this.E0 = e0;
        super(0);
    }
    
    public final Object invoke() {
        final long a = ((qfj)((rtb)this.D0.getValue()).invoke((Object)this.C0)).a;
        long n;
        if (ukg.y0(pfg.a(this.E0)) && ukg.y0(a)) {
            n = qfj.h(pfg.a(this.E0), a);
        }
        else {
            Objects.requireNonNull(qfj.Companion);
            n = qfj.d;
        }
        return new qfj(n);
    }
}
