import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public class ynx extends hj6
{
    public ArrayList<hj6> u0;
    
    public ynx() {
        this.u0 = new ArrayList<hj6>();
    }
    
    public void J() {
        this.u0.clear();
        super.J();
    }
    
    public final void M(final wb7 wb7) {
        super.M(wb7);
        for (int size = this.u0.size(), i = 0; i < size; ++i) {
            this.u0.get(i).M(wb7);
        }
    }
    
    public final void a(final hj6 hj6) {
        this.u0.add(hj6);
        final hj6 v = hj6.V;
        if (v != null) {
            ((ynx)v).u0.remove(hj6);
            hj6.J();
        }
        hj6.V = this;
    }
    
    public void a0() {
        final ArrayList<hj6> u0 = this.u0;
        if (u0 == null) {
            return;
        }
        for (int size = u0.size(), i = 0; i < size; ++i) {
            final hj6 hj6 = this.u0.get(i);
            if (hj6 instanceof ynx) {
                ((ynx)hj6).a0();
            }
        }
    }
    
    public final void b0() {
        this.u0.clear();
    }
}
