import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q8p
{
    public final at3 a;
    public final fsl b;
    public final ykv c;
    
    public q8p(final at3 a, final fsl b, final ykv c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final d9p a(final View view, final int n, final int n2) {
        final at3 a = this.a;
        String s;
        if (n == 5) {
            s = a.a.getString(2131957474);
            zzd.e((Object)s, "{\n            resources.\u2026intTextResId())\n        }");
        }
        else {
            s = a.a.getString(n2);
            zzd.e((Object)s, "{\n            resources.\u2026ingResourceSRP)\n        }");
        }
        final fsl b = this.b;
        final ykv c = this.c;
        d9p d9p;
        if (view != null && view.findViewById(2131431282) != null) {
            d9p = new d9p((wax<r8p>)new wax(view, 2131431282, 2131431282, (bra)new y4f((Object)s, 3)), b, c);
        }
        else {
            d9p = null;
        }
        return d9p;
    }
}
