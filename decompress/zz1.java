import java.util.Calendar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zz1
{
    public final yz1 a;
    public final b02 b;
    
    public zz1(final yz1 a, final b02 b) {
        this.a = a;
        this.b = b;
    }
    
    public final ona$c a(int n, final int n2, final int n3, ona$c g0) {
        final Calendar instance = Calendar.getInstance();
        instance.set(n, n2, n3);
        final Calendar instance2 = Calendar.getInstance();
        n = 1;
        instance2.add(1, -18);
        c02 selectionAdapter;
        if (instance.after(instance2)) {
            selectionAdapter = this.b.c;
        }
        else {
            selectionAdapter = this.b.b;
        }
        if (this.a.C0.d.getSelectionAdapter() == selectionAdapter) {
            n = 0;
        }
        if (n != 0) {
            this.a.C0.d.setSelectionAdapter((udp)selectionAdapter);
            g0 = ona$c.G0;
            this.a.c(g0);
        }
        return g0;
    }
}
