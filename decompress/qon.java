import tv.periscope.android.api.ApiManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qon
{
    public static final a Companion;
    public final Context a;
    public final wj2 b;
    public final ApiManager c;
    public final wc6 d;
    
    static {
        Companion = new a();
    }
    
    public qon(final Context a, final wj2 b, final ApiManager c, final xbm xbm) {
        czd.f((Object)a, "context");
        czd.f((Object)b, "broadcastLogger");
        czd.f((Object)c, "apiManager");
        czd.f((Object)xbm, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new wc6();
        xbm.i((oj)new pvt((Object)this, 25));
    }
    
    public static final void a(final qon qon, final String s) {
        final wj2 b = qon.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("qon");
        sb.append(": ");
        sb.append(s);
        b.i(sb.toString(), false);
    }
    
    public static final class a
    {
    }
}
