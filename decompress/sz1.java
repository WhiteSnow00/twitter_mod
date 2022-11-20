import java.util.Calendar;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sz1
{
    public final rz1 a;
    public final uz1 b;
    
    public sz1(final rz1 a, final uz1 b) {
        this.a = a;
        this.b = b;
    }
    
    public final oma$c a(int n, final int n2, final int n3, oma$c h0) {
        final Calendar instance = Calendar.getInstance();
        instance.set(n, n2, n3);
        final Calendar instance2 = Calendar.getInstance();
        n = 1;
        instance2.add(1, -18);
        vz1 selectionAdapter;
        if (instance.after(instance2)) {
            selectionAdapter = this.b.c;
        }
        else {
            selectionAdapter = this.b.b;
        }
        if (this.a.D0.d.getSelectionAdapter() == selectionAdapter) {
            n = 0;
        }
        if (n != 0) {
            this.a.D0.d.setSelectionAdapter((lep)selectionAdapter);
            h0 = oma$c.H0;
            this.a.c(h0);
        }
        return h0;
    }
}
