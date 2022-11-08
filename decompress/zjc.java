import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public class zjc extends hj6 implements xjc
{
    public hj6[] u0;
    public int v0;
    
    public zjc() {
        this.u0 = new hj6[4];
        this.v0 = 0;
    }
    
    public final void a(final hj6 hj6) {
        if (hj6 != this) {
            if (hj6 != null) {
                final int v0 = this.v0;
                final hj6[] u0 = this.u0;
                if (v0 + 1 > u0.length) {
                    this.u0 = Arrays.copyOf(u0, u0.length * 2);
                }
                final hj6[] u2 = this.u0;
                final int v2 = this.v0;
                u2[v2] = hj6;
                this.v0 = v2 + 1;
            }
        }
    }
    
    public final void a0(final ArrayList<znx> list, final int n, final znx znx) {
        final int n2 = 0;
        int n3 = 0;
        int i;
        while (true) {
            i = n2;
            if (n3 >= this.v0) {
                break;
            }
            znx.a(this.u0[n3]);
            ++n3;
        }
        while (i < this.v0) {
            t9c.a(this.u0[i], n, list, znx);
            ++i;
        }
    }
    
    public final void b() {
        this.v0 = 0;
        Arrays.fill(this.u0, null);
    }
    
    public void c() {
    }
    
    public void k(final hj6 hj6, final HashMap<hj6, hj6> hashMap) {
        super.k(hj6, (HashMap)hashMap);
        final zjc zjc = (zjc)hj6;
        int i = 0;
        this.v0 = 0;
        while (i < zjc.v0) {
            this.a(hashMap.get(zjc.u0[i]));
            ++i;
        }
    }
}
