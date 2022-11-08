// 
// Decompiled by Procyon v0.6.0
// 

public abstract class v6a
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public v6a() {
    }
    
    public v6a(final hg8 hg8) {
    }
    
    public abstract fzt a();
    
    public final v6a b(final v6a v6a) {
        final fzt a = ((w6a)this).a;
        era era;
        if ((era = a.a) == null) {
            era = ((w6a)v6a).a.a;
        }
        keq keq;
        if ((keq = a.b) == null) {
            keq = ((w6a)v6a).a.b;
        }
        mp3 mp3;
        if ((mp3 = a.c) == null) {
            mp3 = ((w6a)v6a).a.c;
        }
        tto tto;
        if ((tto = a.d) == null) {
            tto = ((w6a)v6a).a.d;
        }
        return new w6a(new fzt(era, keq, mp3, tto));
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof v6a && zzd.a((Object)((v6a)o).a(), (Object)this.a());
    }
    
    @Override
    public final int hashCode() {
        return this.a().hashCode();
    }
    
    public static final class a
    {
    }
}
