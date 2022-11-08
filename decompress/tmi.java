// 
// Decompiled by Procyon v0.6.0
// 

public final class tmi
{
    public static final tmi$a a;
    
    static {
        a = new tmi$a();
    }
    
    public static final int a(final jkh.b b, final jkh.b b2) {
        zzd.f((Object)b, "prev");
        zzd.f((Object)b2, "next");
        int n;
        if (zzd.a((Object)b, (Object)b2)) {
            n = 2;
        }
        else if (jgw.q((Object)b, (Object)b2)) {
            n = 1;
        }
        else {
            n = 0;
        }
        return n;
    }
}
