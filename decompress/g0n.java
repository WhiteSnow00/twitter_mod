// 
// Decompiled by Procyon v0.6.0
// 

public final class g0n
{
    public final zml<tip> a;
    
    public g0n() {
        this.a = (zml<tip>)new zml();
    }
    
    public final void a(final String s, final w1a w1a) {
        zzd.f((Object)s, "emoji");
        zzd.f((Object)w1a, "emojiType");
        this.a.onNext((Object)new tip(s, w1a));
    }
}
