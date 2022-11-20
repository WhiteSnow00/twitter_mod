import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k9p
{
    public final is3 a;
    public final usl b;
    public final vlv c;
    
    public k9p(final is3 a, final usl b, final vlv c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final w9p a(final View view, final int n, final int n2) {
        final is3 a = this.a;
        String s;
        if (n == 5) {
            s = a.a.getString(2131957474);
            czd.e((Object)s, "{\n            resources.\u2026intTextResId())\n        }");
        }
        else {
            s = a.a.getString(n2);
            czd.e((Object)s, "{\n            resources.\u2026ingResourceSRP)\n        }");
        }
        final usl b = this.b;
        final vlv c = this.c;
        w9p w9p;
        if (view != null && view.findViewById(2131431284) != null) {
            w9p = new w9p(new rbx(view, 2131431284, 2131431284, (ypa)new u1x((Object)s, 5)), b, c);
        }
        else {
            w9p = null;
        }
        return w9p;
    }
}
