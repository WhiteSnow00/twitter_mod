import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zw7 extends gue implements rtb<e18, e18>
{
    public final /* synthetic */ String C0;
    
    public zw7(final String c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final e18 e18 = (e18)o;
        zzd.f((Object)e18, "$this$setState");
        final String c0 = this.C0;
        zzd.f((Object)c0, "newQuery");
        final boolean b = e18 instanceof e18.a;
        int n2;
        final int n = n2 = 0;
        Label_0098: {
            if (b) {
                n2 = n;
                if (((e18.a)e18).g.isEmpty() ^ true) {
                    if (e18.m() != 4) {
                        n2 = n;
                        if (e18.m() != 2) {
                            break Label_0098;
                        }
                    }
                    n2 = n;
                    if (gkr.o1((CharSequence)c0, (CharSequence)e18.n(), false)) {
                        n2 = 1;
                    }
                }
            }
        }
        int n3;
        if (n2 != 0) {
            n3 = 2;
        }
        else {
            n3 = 1;
        }
        return e18.l(e18, n3, this.C0, null, 4, null);
    }
}
