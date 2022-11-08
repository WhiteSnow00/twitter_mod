// 
// Decompiled by Procyon v0.6.0
// 

public final class zhq extends gue implements otb<oyv>
{
    public final /* synthetic */ yhq C0;
    
    public zhq(final yhq c0) {
        this.C0 = c0;
        super(0);
    }
    
    public final Object invoke() {
        final yhq c0 = this.C0;
        synchronized (c0.d) {
            final ouh d = c0.d;
            final int e0 = d.E0;
            if (e0 > 0) {
                final Object[] c2 = d.C0;
                zzd.d((Object)c2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                int n = 0;
                do {
                    final yhq$a yhq$a = (yhq$a)c2[n];
                    final r5d g = yhq$a.g;
                    final rtb a = yhq$a.a;
                    for (int c3 = g.C0, i = 0; i < c3; ++i) {
                        a.invoke(g.get(i));
                    }
                    yhq$a.g.clear();
                } while (++n < e0);
            }
            return oyv.a;
        }
    }
}
