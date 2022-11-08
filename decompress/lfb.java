import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lfb implements kfb
{
    public boolean a;
    public rfb b;
    public rfb c;
    public rfb d;
    public rfb e;
    public rfb f;
    public rfb g;
    public rfb h;
    public rfb i;
    public rtb<? super teb, rfb> j;
    public rtb<? super teb, rfb> k;
    
    public lfb() {
        this.a = true;
        final rfb$a companion = rfb.Companion;
        Objects.requireNonNull(companion);
        final rfb b = rfb.b;
        this.b = b;
        Objects.requireNonNull(companion);
        this.c = b;
        Objects.requireNonNull(companion);
        this.d = b;
        Objects.requireNonNull(companion);
        this.e = b;
        Objects.requireNonNull(companion);
        this.f = b;
        Objects.requireNonNull(companion);
        this.g = b;
        Objects.requireNonNull(companion);
        this.h = b;
        Objects.requireNonNull(companion);
        this.i = b;
        this.j = (rtb<? super teb, rfb>)lfb$a.C0;
        this.k = (rtb<? super teb, rfb>)lfb$b.C0;
    }
    
    public final void a(final boolean a) {
        this.a = a;
    }
    
    public final void b(final rtb<? super teb, rfb> j) {
        zzd.f((Object)j, "<set-?>");
        this.j = j;
    }
    
    public final void c(final rtb<? super teb, rfb> k) {
        zzd.f((Object)k, "<set-?>");
        this.k = k;
    }
    
    public final void d(final rfb b) {
        zzd.f((Object)b, "<set-?>");
        this.b = b;
    }
}
