import java.util.Comparator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyl extends ste implements qsb<List<? extends zxl>, fzv>
{
    public final q3e<zxl> D0;
    public final cyl E0;
    
    public dyl(final q3e<zxl> d0, final cyl e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final List list = (List)o;
        final q3e<zxl> d0 = this.D0;
        czd.e((Object)list, "items");
        final cyl.a.a q2 = this.E0.q2;
        if (q2 != null) {
            d0.d((n3e)new ckf((Iterable)mq4.F0((Iterable)list, (Comparator)q2)));
            return fzv.a;
        }
        czd.m("reactionDetailsComparator");
        throw null;
    }
}
