// 
// Decompiled by Procyon v0.6.0
// 

public final class lho extends gue implements rtb<Boolean, oyv>
{
    public final /* synthetic */ iho C0;
    
    public lho(final iho c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Boolean b = (Boolean)o;
        zzd.e((Object)b, "captionsEnabled");
        if (b) {
            gjo.G(this.C0.a, "", "", "transcription", "impression", null, 48);
        }
        return oyv.a;
    }
}
