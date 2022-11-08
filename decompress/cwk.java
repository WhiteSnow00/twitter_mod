import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cwk
{
    public static final a Companion;
    public final Resources a;
    public final xau b;
    public final zau c;
    
    static {
        Companion = new a();
    }
    
    public cwk(final Resources a, final xau b, final zau c) {
        zzd.f((Object)a, "resources");
        zzd.f((Object)b, "preferences");
        zzd.f((Object)c, "systemClock");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static final class a
    {
    }
}
