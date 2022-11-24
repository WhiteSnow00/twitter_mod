import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public class bkc extends tj6 implements zjc
{
    public tj6[] u0;
    public int v0;
    
    public bkc() {
        this.u0 = new tj6[4];
        this.v0 = 0;
    }
    
    @Override
    public final void a(final tj6 tj6) {
        if (tj6 != this) {
            if (tj6 != null) {
                final int v0 = this.v0;
                final tj6[] u0 = this.u0;
                if (v0 + 1 > u0.length) {
                    this.u0 = Arrays.copyOf(u0, u0.length * 2);
                }
                final tj6[] u2 = this.u0;
                final int v2 = this.v0;
                u2[v2] = tj6;
                this.v0 = v2 + 1;
            }
        }
    }
    
    public final void a0(final ArrayList<ipx> list, final int n, final ipx ipx) {
        final int n2 = 0;
        int n3 = 0;
        int i;
        while (true) {
            i = n2;
            if (n3 >= this.v0) {
                break;
            }
            ipx.a(this.u0[n3]);
            ++n3;
        }
        while (i < this.v0) {
            v9c.a(this.u0[i], n, list, ipx);
            ++i;
        }
    }
    
    @Override
    public final void b() {
        this.v0 = 0;
        Arrays.fill(this.u0, null);
    }
    
    @Override
    public void c() {
    }
    
    @Override
    public void k(final tj6 tj6, final HashMap<tj6, tj6> hashMap) {
        super.k(tj6, hashMap);
        final bkc bkc = (bkc)tj6;
        int i = 0;
        this.v0 = 0;
        while (i < bkc.v0) {
            this.a(hashMap.get(bkc.u0[i]));
            ++i;
        }
    }
}
