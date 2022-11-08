// 
// Decompiled by Procyon v0.6.0
// 

public final class cza implements ay9<bza>
{
    public final d0b C0;
    
    public cza(final d0b c0) {
        zzd.f((Object)c0, "processor");
        this.C0 = c0;
    }
    
    public final void s(final Object o) {
        final bza bza = (bza)o;
        zzd.f((Object)bza, "effect");
        if (bza instanceof bza$a) {
            this.C0.G1(((bza$a)bza).a);
        }
    }
}
