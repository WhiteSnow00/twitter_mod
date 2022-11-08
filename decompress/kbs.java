import j$.util.concurrent.ConcurrentHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kbs implements jbs
{
    public final ConcurrentHashMap<String, String> a;
    
    public kbs() {
        this.a = (ConcurrentHashMap<String, String>)new ConcurrentHashMap();
    }
    
    public final String a(final String s, final String s2) {
        zzd.f((Object)s2, "endpoint");
        final boolean h1 = ckr.h1((CharSequence)s);
        String s3 = null;
        String s4;
        if (h1 ^ true) {
            s4 = s;
        }
        else {
            s4 = null;
        }
        if (s4 != null) {
            s3 = (String)this.a.put((Object)s, (Object)s2);
        }
        return s3;
    }
    
    public final String b(final String s) {
        String s2 = null;
        if (s != null) {
            String s3;
            if (ckr.h1((CharSequence)s) ^ true) {
                s3 = s;
            }
            else {
                s3 = null;
            }
            s2 = s2;
            if (s3 != null) {
                s2 = (String)this.a.get((Object)s);
            }
        }
        return s2;
    }
}
