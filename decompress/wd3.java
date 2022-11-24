import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wd3 implements b7k
{
    public final int a;
    public final qof b;
    public boolean c;
    
    public wd3(final int a, final qof b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final k7k.a a(final Activity activity) {
        final int a = this.a;
        int n3;
        int n4;
        if (a != 0) {
            if (a != 1) {
                final StringBuilder f = ehk.f("Unknown camera permission ");
                f.append(this.a);
                throw new IllegalStateException(f.toString());
            }
            int n;
            if (this.b instanceof qof$d) {
                n = 2131955330;
            }
            else {
                n = 2131955331;
            }
            final int n2 = 2131955332;
            n3 = n;
            n4 = n2;
        }
        else {
            n3 = 2131952366;
            n4 = 2131955730;
        }
        final k7k.a a2 = k7k.a(((Context)activity).getString(n3), (Context)activity, this.b());
        a2.t(((Context)activity).getString(n4));
        a2.a.putExtra("forceHidePreliminaryDialog", this.c);
        a2.q(true);
        return a2;
    }
    
    public final String[] b() {
        return pe3.a(this.a);
    }
}
