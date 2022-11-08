// 
// Decompiled by Procyon v0.6.0
// 

public final class ljo
{
    public final rsn a;
    public final erq b;
    public final gnf c;
    public final rnd d;
    
    public ljo(final ibm ibm, final zml<oit> zml, final rsn a, final erq b, final gnf c, final rnd d) {
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)zml, "toolTipPublishSubject");
        zzd.f((Object)a, "nuxTooltipController");
        zzd.f((Object)b, "spacesHomeConfiguration");
        zzd.f((Object)c, "listWrapper");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        if (b.b()) {
            final m29 m29 = new m29();
            ((iz5)ibm.D0).q((rj)new mjo(m29));
            m29.c(((b5j)zml).subscribe((fk6)new f$f3((rtb)new njo(this))));
        }
    }
}
