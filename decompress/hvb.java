import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hvb extends ste implements qsb<tmi, fzv>
{
    public final fvb D0;
    
    public hvb(final fvb d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final tmi tmi = (tmi)o;
        final uvb s1 = this.D0.s1;
        if (s1 != null) {
            final SparseArray l0 = s1.L0;
            for (int i = 0; i < l0.size(); ++i) {
                ((vvb)l0.valueAt(i)).e();
            }
        }
        return fzv.a;
    }
}
